package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;

public class DTLSServerProtocol extends DTLSProtocol {
  protected boolean verifyRequests = true;
  
  public boolean getVerifyRequests() {
    return this.verifyRequests;
  }
  
  public void setVerifyRequests(boolean paramBoolean) {
    this.verifyRequests = paramBoolean;
  }
  
  public DTLSTransport accept(TlsServer paramTlsServer, DatagramTransport paramDatagramTransport) throws IOException {
    return accept(paramTlsServer, paramDatagramTransport, (DTLSRequest)null);
  }
  
  public DTLSTransport accept(TlsServer paramTlsServer, DatagramTransport paramDatagramTransport, DTLSRequest paramDTLSRequest) throws IOException {
    if (paramTlsServer == null)
      throw new IllegalArgumentException("'server' cannot be null"); 
    if (paramDatagramTransport == null)
      throw new IllegalArgumentException("'transport' cannot be null"); 
    TlsServerContextImpl tlsServerContextImpl = new TlsServerContextImpl(paramTlsServer.getCrypto());
    ServerHandshakeState serverHandshakeState = new ServerHandshakeState();
    serverHandshakeState.server = paramTlsServer;
    serverHandshakeState.serverContext = tlsServerContextImpl;
    paramTlsServer.init(tlsServerContextImpl);
    tlsServerContextImpl.handshakeBeginning(paramTlsServer);
    SecurityParameters securityParameters = tlsServerContextImpl.getSecurityParametersHandshake();
    securityParameters.extendedPadding = paramTlsServer.shouldUseExtendedPadding();
    DTLSRecordLayer dTLSRecordLayer = new DTLSRecordLayer(tlsServerContextImpl, paramTlsServer, paramDatagramTransport);
    paramTlsServer.notifyCloseHandle(dTLSRecordLayer);
    try {
      return serverHandshake(serverHandshakeState, dTLSRecordLayer, paramDTLSRequest);
    } catch (TlsFatalAlert tlsFatalAlert) {
      abortServerHandshake(serverHandshakeState, dTLSRecordLayer, tlsFatalAlert.getAlertDescription());
      throw tlsFatalAlert;
    } catch (IOException iOException) {
      abortServerHandshake(serverHandshakeState, dTLSRecordLayer, (short)80);
      throw iOException;
    } catch (RuntimeException runtimeException) {
      abortServerHandshake(serverHandshakeState, dTLSRecordLayer, (short)80);
      throw new TlsFatalAlert((short)80, runtimeException);
    } finally {
      securityParameters.clear();
    } 
  }
  
  protected void abortServerHandshake(ServerHandshakeState paramServerHandshakeState, DTLSRecordLayer paramDTLSRecordLayer, short paramShort) {
    paramDTLSRecordLayer.fail(paramShort);
    invalidateSession(paramServerHandshakeState);
  }
  
  protected DTLSTransport serverHandshake(ServerHandshakeState paramServerHandshakeState, DTLSRecordLayer paramDTLSRecordLayer, DTLSRequest paramDTLSRequest) throws IOException {
    Certificate certificate;
    TlsServer tlsServer = paramServerHandshakeState.server;
    TlsServerContextImpl tlsServerContextImpl = paramServerHandshakeState.serverContext;
    SecurityParameters securityParameters = tlsServerContextImpl.getSecurityParametersHandshake();
    DTLSReliableHandshake dTLSReliableHandshake = new DTLSReliableHandshake(tlsServerContextImpl, paramDTLSRecordLayer, tlsServer.getHandshakeTimeoutMillis(), tlsServer.getHandshakeResendTimeMillis(), paramDTLSRequest);
    DTLSReliableHandshake.Message message = null;
    if (null == paramDTLSRequest) {
      message = dTLSReliableHandshake.receiveMessage();
      if (message.getType() == 1) {
        processClientHello(paramServerHandshakeState, message.getBody());
      } else {
        throw new TlsFatalAlert((short)10);
      } 
      message = null;
    } else {
      processClientHello(paramServerHandshakeState, paramDTLSRequest.getClientHello());
      paramDTLSRequest = null;
    } 
    byte[] arrayOfByte1 = generateServerHello(paramServerHandshakeState, paramDTLSRecordLayer);
    ProtocolVersion protocolVersion = tlsServerContextImpl.getServerVersion();
    paramDTLSRecordLayer.setReadVersion(protocolVersion);
    paramDTLSRecordLayer.setWriteVersion(protocolVersion);
    dTLSReliableHandshake.sendMessage((short)2, arrayOfByte1);
    dTLSReliableHandshake.getHandshakeHash().notifyPRFDetermined();
    if (securityParameters.isResumedSession()) {
      securityParameters.masterSecret = paramServerHandshakeState.sessionMasterSecret;
      paramDTLSRecordLayer.initPendingEpoch(TlsUtils.initCipher(tlsServerContextImpl));
      securityParameters.localVerifyData = TlsUtils.calculateVerifyData(tlsServerContextImpl, dTLSReliableHandshake.getHandshakeHash(), true);
      dTLSReliableHandshake.sendMessage((short)20, securityParameters.getLocalVerifyData());
      securityParameters.peerVerifyData = TlsUtils.calculateVerifyData(tlsServerContextImpl, dTLSReliableHandshake.getHandshakeHash(), false);
      processFinished(dTLSReliableHandshake.receiveMessageBody((short)20), securityParameters.getPeerVerifyData());
      dTLSReliableHandshake.finish();
      if (securityParameters.isExtendedMasterSecret())
        securityParameters.tlsUnique = securityParameters.getLocalVerifyData(); 
      securityParameters.localCertificate = paramServerHandshakeState.sessionParameters.getLocalCertificate();
      securityParameters.peerCertificate = paramServerHandshakeState.sessionParameters.getPeerCertificate();
      securityParameters.pskIdentity = paramServerHandshakeState.sessionParameters.getPSKIdentity();
      securityParameters.srpIdentity = paramServerHandshakeState.sessionParameters.getSRPIdentity();
      tlsServerContextImpl.handshakeComplete(tlsServer, paramServerHandshakeState.tlsSession);
      paramDTLSRecordLayer.initHeartbeat(paramServerHandshakeState.heartbeat, (1 == paramServerHandshakeState.heartbeatPolicy));
      return new DTLSTransport(paramDTLSRecordLayer);
    } 
    Vector vector = tlsServer.getServerSupplementalData();
    if (vector != null) {
      byte[] arrayOfByte = generateSupplementalData(vector);
      dTLSReliableHandshake.sendMessage((short)23, arrayOfByte);
    } 
    paramServerHandshakeState.keyExchange = TlsUtils.initKeyExchangeServer(tlsServerContextImpl, tlsServer);
    paramServerHandshakeState.serverCredentials = null;
    if (!KeyExchangeAlgorithm.isAnonymous(securityParameters.getKeyExchangeAlgorithm()))
      paramServerHandshakeState.serverCredentials = TlsUtils.establishServerCredentials(tlsServer); 
    protocolVersion = null;
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    if (paramServerHandshakeState.serverCredentials == null) {
      paramServerHandshakeState.keyExchange.skipServerCredentials();
    } else {
      paramServerHandshakeState.keyExchange.processServerCredentials(paramServerHandshakeState.serverCredentials);
      certificate = paramServerHandshakeState.serverCredentials.getCertificate();
      sendCertificateMessage(tlsServerContextImpl, dTLSReliableHandshake, certificate, byteArrayOutputStream);
    } 
    securityParameters.tlsServerEndPoint = byteArrayOutputStream.toByteArray();
    if (certificate == null || certificate.isEmpty())
      securityParameters.statusRequestVersion = 0; 
    if (securityParameters.getStatusRequestVersion() > 0) {
      CertificateStatus certificateStatus = tlsServer.getCertificateStatus();
      if (certificateStatus != null) {
        byte[] arrayOfByte = generateCertificateStatus(paramServerHandshakeState, certificateStatus);
        dTLSReliableHandshake.sendMessage((short)22, arrayOfByte);
      } 
    } 
    byte[] arrayOfByte2 = paramServerHandshakeState.keyExchange.generateServerKeyExchange();
    if (arrayOfByte2 != null)
      dTLSReliableHandshake.sendMessage((short)12, arrayOfByte2); 
    if (paramServerHandshakeState.serverCredentials != null) {
      paramServerHandshakeState.certificateRequest = tlsServer.getCertificateRequest();
      if (null == paramServerHandshakeState.certificateRequest) {
        if (!paramServerHandshakeState.keyExchange.requiresCertificateVerify())
          throw new TlsFatalAlert((short)80); 
      } else {
        if (TlsUtils.isTLSv12(tlsServerContextImpl) != ((paramServerHandshakeState.certificateRequest.getSupportedSignatureAlgorithms() != null)))
          throw new TlsFatalAlert((short)80); 
        paramServerHandshakeState.certificateRequest = TlsUtils.validateCertificateRequest(paramServerHandshakeState.certificateRequest, paramServerHandshakeState.keyExchange);
        TlsUtils.establishServerSigAlgs(securityParameters, paramServerHandshakeState.certificateRequest);
        if (ProtocolVersion.DTLSv12.equals(securityParameters.getNegotiatedVersion())) {
          TlsUtils.trackHashAlgorithms(dTLSReliableHandshake.getHandshakeHash(), securityParameters.getServerSigAlgs());
          if (tlsServerContextImpl.getCrypto().hasAnyStreamVerifiers(securityParameters.getServerSigAlgs()))
            dTLSReliableHandshake.getHandshakeHash().forceBuffering(); 
        } else if (tlsServerContextImpl.getCrypto().hasAnyStreamVerifiersLegacy(paramServerHandshakeState.certificateRequest.getCertificateTypes())) {
          dTLSReliableHandshake.getHandshakeHash().forceBuffering();
        } 
      } 
    } 
    dTLSReliableHandshake.getHandshakeHash().sealHashAlgorithms();
    if (null != paramServerHandshakeState.certificateRequest) {
      byte[] arrayOfByte = generateCertificateRequest(paramServerHandshakeState, paramServerHandshakeState.certificateRequest);
      dTLSReliableHandshake.sendMessage((short)13, arrayOfByte);
    } 
    dTLSReliableHandshake.sendMessage((short)14, TlsUtils.EMPTY_BYTES);
    message = dTLSReliableHandshake.receiveMessage();
    if (message.getType() == 23) {
      processClientSupplementalData(paramServerHandshakeState, message.getBody());
      message = dTLSReliableHandshake.receiveMessage();
    } else {
      tlsServer.processClientSupplementalData((Vector)null);
    } 
    if (paramServerHandshakeState.certificateRequest == null) {
      paramServerHandshakeState.keyExchange.skipClientCredentials();
    } else if (message.getType() == 11) {
      processClientCertificate(paramServerHandshakeState, message.getBody());
      message = dTLSReliableHandshake.receiveMessage();
    } else {
      if (TlsUtils.isTLSv12(tlsServerContextImpl))
        throw new TlsFatalAlert((short)10); 
      notifyClientCertificate(paramServerHandshakeState, Certificate.EMPTY_CHAIN);
    } 
    if (message.getType() == 16) {
      processClientKeyExchange(paramServerHandshakeState, message.getBody());
    } else {
      throw new TlsFatalAlert((short)10);
    } 
    securityParameters.sessionHash = TlsUtils.getCurrentPRFHash(dTLSReliableHandshake.getHandshakeHash());
    TlsProtocol.establishMasterSecret(tlsServerContextImpl, paramServerHandshakeState.keyExchange);
    paramDTLSRecordLayer.initPendingEpoch(TlsUtils.initCipher(tlsServerContextImpl));
    if (expectCertificateVerifyMessage(paramServerHandshakeState)) {
      message = dTLSReliableHandshake.receiveMessageDelayedDigest((short)15);
      byte[] arrayOfByte = message.getBody();
      processCertificateVerify(paramServerHandshakeState, arrayOfByte, dTLSReliableHandshake.getHandshakeHash());
      dTLSReliableHandshake.prepareToFinish();
      dTLSReliableHandshake.updateHandshakeMessagesDigest(message);
    } else {
      dTLSReliableHandshake.prepareToFinish();
    } 
    message = null;
    securityParameters.peerVerifyData = TlsUtils.calculateVerifyData(tlsServerContextImpl, dTLSReliableHandshake.getHandshakeHash(), false);
    processFinished(dTLSReliableHandshake.receiveMessageBody((short)20), securityParameters.getPeerVerifyData());
    if (paramServerHandshakeState.expectSessionTicket) {
      NewSessionTicket newSessionTicket = tlsServer.getNewSessionTicket();
      byte[] arrayOfByte = generateNewSessionTicket(paramServerHandshakeState, newSessionTicket);
      dTLSReliableHandshake.sendMessage((short)4, arrayOfByte);
    } 
    securityParameters.localVerifyData = TlsUtils.calculateVerifyData(tlsServerContextImpl, dTLSReliableHandshake.getHandshakeHash(), true);
    dTLSReliableHandshake.sendMessage((short)20, securityParameters.getLocalVerifyData());
    dTLSReliableHandshake.finish();
    paramServerHandshakeState.sessionMasterSecret = securityParameters.getMasterSecret();
    paramServerHandshakeState.sessionParameters = (new SessionParameters.Builder()).setCipherSuite(securityParameters.getCipherSuite()).setExtendedMasterSecret(securityParameters.isExtendedMasterSecret()).setLocalCertificate(securityParameters.getLocalCertificate()).setMasterSecret(tlsServerContextImpl.getCrypto().adoptSecret(paramServerHandshakeState.sessionMasterSecret)).setNegotiatedVersion(securityParameters.getNegotiatedVersion()).setPeerCertificate(securityParameters.getPeerCertificate()).setPSKIdentity(securityParameters.getPSKIdentity()).setSRPIdentity(securityParameters.getSRPIdentity()).setServerExtensions(paramServerHandshakeState.serverExtensions).build();
    paramServerHandshakeState.tlsSession = TlsUtils.importSession(securityParameters.getSessionID(), paramServerHandshakeState.sessionParameters);
    securityParameters.tlsUnique = securityParameters.getPeerVerifyData();
    tlsServerContextImpl.handshakeComplete(tlsServer, paramServerHandshakeState.tlsSession);
    paramDTLSRecordLayer.initHeartbeat(paramServerHandshakeState.heartbeat, (1 == paramServerHandshakeState.heartbeatPolicy));
    return new DTLSTransport(paramDTLSRecordLayer);
  }
  
  protected byte[] generateCertificateRequest(ServerHandshakeState paramServerHandshakeState, CertificateRequest paramCertificateRequest) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramCertificateRequest.encode(paramServerHandshakeState.serverContext, byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  protected byte[] generateCertificateStatus(ServerHandshakeState paramServerHandshakeState, CertificateStatus paramCertificateStatus) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramCertificateStatus.encode(byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  protected byte[] generateNewSessionTicket(ServerHandshakeState paramServerHandshakeState, NewSessionTicket paramNewSessionTicket) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramNewSessionTicket.encode(byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  protected byte[] generateServerHello(ServerHandshakeState paramServerHandshakeState, DTLSRecordLayer paramDTLSRecordLayer) throws IOException {
    TlsServer tlsServer = paramServerHandshakeState.server;
    TlsServerContextImpl tlsServerContextImpl = paramServerHandshakeState.serverContext;
    SecurityParameters securityParameters = tlsServerContextImpl.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = tlsServer.getServerVersion();
    if (!ProtocolVersion.contains(tlsServerContextImpl.getClientSupportedVersions(), protocolVersion))
      throw new TlsFatalAlert((short)80); 
    securityParameters.negotiatedVersion = protocolVersion;
    boolean bool1 = tlsServer.shouldUseGMTUnixTime();
    securityParameters.serverRandom = TlsProtocol.createRandomBlock(bool1, tlsServerContextImpl);
    if (!protocolVersion.equals(ProtocolVersion.getLatestDTLS(tlsServer.getProtocolVersions())))
      TlsUtils.writeDowngradeMarker(protocolVersion, securityParameters.getServerRandom()); 
    Hashtable hashtable1 = paramServerHandshakeState.clientHello.getExtensions();
    TlsSession tlsSession = tlsServer.getSessionToResume(paramServerHandshakeState.clientHello.getSessionID());
    boolean bool2 = establishSession(paramServerHandshakeState, tlsSession);
    if (bool2 && !protocolVersion.equals(paramServerHandshakeState.sessionParameters.getNegotiatedVersion()))
      bool2 = false; 
    boolean bool3 = false;
    if (TlsUtils.isExtendedMasterSecretOptional(protocolVersion) && tlsServer.shouldUseExtendedMasterSecret())
      if (TlsExtensionsUtils.hasExtendedMasterSecretExtension(hashtable1)) {
        bool3 = true;
      } else {
        if (tlsServer.requiresExtendedMasterSecret())
          throw new TlsFatalAlert((short)40, "Extended Master Secret extension is required"); 
        if (bool2) {
          if (paramServerHandshakeState.sessionParameters.isExtendedMasterSecret())
            throw new TlsFatalAlert((short)40, "Extended Master Secret extension is required for EMS session resumption"); 
          if (!tlsServer.allowLegacyResumption())
            throw new TlsFatalAlert((short)40, "Extended Master Secret extension is required for legacy session resumption"); 
        } 
      }  
    if (bool2 && bool3 != paramServerHandshakeState.sessionParameters.isExtendedMasterSecret())
      bool2 = false; 
    securityParameters.extendedMasterSecret = bool3;
    if (!bool2) {
      cancelSession(paramServerHandshakeState);
      byte[] arrayOfByte = tlsServer.getNewSessionID();
      if (null == arrayOfByte)
        arrayOfByte = TlsUtils.EMPTY_BYTES; 
      paramServerHandshakeState.tlsSession = TlsUtils.importSession(arrayOfByte, null);
    } 
    securityParameters.resumedSession = bool2;
    securityParameters.sessionID = paramServerHandshakeState.tlsSession.getSessionID();
    tlsServer.notifySession(paramServerHandshakeState.tlsSession);
    TlsUtils.negotiatedVersionDTLSServer(tlsServerContextImpl);
    int i = validateSelectedCipherSuite(tlsServer.getSelectedCipherSuite(), (short)80);
    if (!TlsUtils.isValidCipherSuiteSelection(paramServerHandshakeState.clientHello.getCipherSuites(), i) || !TlsUtils.isValidVersionForCipherSuite(i, securityParameters.getNegotiatedVersion()))
      throw new TlsFatalAlert((short)80); 
    TlsUtils.negotiatedCipherSuite(securityParameters, i);
    Hashtable hashtable2 = bool2 ? paramServerHandshakeState.sessionParameters.readServerExtensions() : tlsServer.getServerExtensions();
    paramServerHandshakeState.serverExtensions = TlsExtensionsUtils.ensureExtensionsInitialised(hashtable2);
    tlsServer.getServerExtensionsForConnection(paramServerHandshakeState.serverExtensions);
    if (securityParameters.isSecureRenegotiation()) {
      byte[] arrayOfByte = TlsUtils.getExtensionData(paramServerHandshakeState.serverExtensions, TlsProtocol.EXT_RenegotiationInfo);
      boolean bool = (null == arrayOfByte) ? true : false;
      if (bool)
        paramServerHandshakeState.serverExtensions.put(TlsProtocol.EXT_RenegotiationInfo, TlsProtocol.createRenegotiationInfo(TlsUtils.EMPTY_BYTES)); 
    } 
    if (securityParameters.isExtendedMasterSecret()) {
      TlsExtensionsUtils.addExtendedMasterSecretExtension(paramServerHandshakeState.serverExtensions);
    } else {
      paramServerHandshakeState.serverExtensions.remove(TlsExtensionsUtils.EXT_extended_master_secret);
    } 
    if (null != paramServerHandshakeState.heartbeat || 1 == paramServerHandshakeState.heartbeatPolicy)
      TlsExtensionsUtils.addHeartbeatExtension(paramServerHandshakeState.serverExtensions, new HeartbeatExtension(paramServerHandshakeState.heartbeatPolicy)); 
    securityParameters.applicationProtocol = TlsExtensionsUtils.getALPNExtensionServer(paramServerHandshakeState.serverExtensions);
    securityParameters.applicationProtocolSet = true;
    if (ProtocolVersion.DTLSv12.equals(securityParameters.getNegotiatedVersion())) {
      byte[] arrayOfByte = TlsExtensionsUtils.getConnectionIDExtension(paramServerHandshakeState.serverExtensions);
      if (arrayOfByte != null) {
        byte[] arrayOfByte1 = TlsExtensionsUtils.getConnectionIDExtension(hashtable1);
        if (arrayOfByte1 == null)
          throw new TlsFatalAlert((short)80); 
        securityParameters.connectionIDLocal = arrayOfByte1;
        securityParameters.connectionIDPeer = arrayOfByte;
      } 
    } 
    if (!paramServerHandshakeState.serverExtensions.isEmpty()) {
      securityParameters.encryptThenMAC = TlsExtensionsUtils.hasEncryptThenMACExtension(paramServerHandshakeState.serverExtensions);
      securityParameters.maxFragmentLength = TlsUtils.processMaxFragmentLengthExtension(bool2 ? null : hashtable1, paramServerHandshakeState.serverExtensions, (short)80);
      securityParameters.truncatedHMac = TlsExtensionsUtils.hasTruncatedHMacExtension(paramServerHandshakeState.serverExtensions);
      if (!bool2) {
        if (TlsUtils.hasExpectedEmptyExtensionData(paramServerHandshakeState.serverExtensions, TlsExtensionsUtils.EXT_status_request_v2, (short)80)) {
          securityParameters.statusRequestVersion = 2;
        } else if (TlsUtils.hasExpectedEmptyExtensionData(paramServerHandshakeState.serverExtensions, TlsExtensionsUtils.EXT_status_request, (short)80)) {
          securityParameters.statusRequestVersion = 1;
        } 
        securityParameters.clientCertificateType = TlsUtils.processClientCertificateTypeExtension(hashtable1, paramServerHandshakeState.serverExtensions, (short)80);
        securityParameters.serverCertificateType = TlsUtils.processServerCertificateTypeExtension(hashtable1, paramServerHandshakeState.serverExtensions, (short)80);
        paramServerHandshakeState.expectSessionTicket = TlsUtils.hasExpectedEmptyExtensionData(paramServerHandshakeState.serverExtensions, TlsProtocol.EXT_SessionTicket, (short)80);
      } 
    } 
    ServerHello serverHello = new ServerHello(protocolVersion, securityParameters.getServerRandom(), securityParameters.getSessionID(), securityParameters.getCipherSuite(), paramServerHandshakeState.serverExtensions);
    paramServerHandshakeState.clientHello = null;
    applyMaxFragmentLengthExtension(paramDTLSRecordLayer, securityParameters.getMaxFragmentLength());
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    serverHello.encode(tlsServerContextImpl, byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  protected void cancelSession(ServerHandshakeState paramServerHandshakeState) {
    if (paramServerHandshakeState.sessionMasterSecret != null) {
      paramServerHandshakeState.sessionMasterSecret.destroy();
      paramServerHandshakeState.sessionMasterSecret = null;
    } 
    if (paramServerHandshakeState.sessionParameters != null) {
      paramServerHandshakeState.sessionParameters.clear();
      paramServerHandshakeState.sessionParameters = null;
    } 
    paramServerHandshakeState.tlsSession = null;
  }
  
  protected boolean establishSession(ServerHandshakeState paramServerHandshakeState, TlsSession paramTlsSession) {
    paramServerHandshakeState.tlsSession = null;
    paramServerHandshakeState.sessionParameters = null;
    paramServerHandshakeState.sessionMasterSecret = null;
    if (null == paramTlsSession || !paramTlsSession.isResumable())
      return false; 
    SessionParameters sessionParameters = paramTlsSession.exportSessionParameters();
    if (null == sessionParameters)
      return false; 
    ProtocolVersion protocolVersion = sessionParameters.getNegotiatedVersion();
    if (null == protocolVersion || !protocolVersion.isDTLS())
      return false; 
    boolean bool = sessionParameters.isExtendedMasterSecret();
    if (!TlsUtils.isExtendedMasterSecretOptional(protocolVersion) && !bool)
      return false; 
    TlsCrypto tlsCrypto = paramServerHandshakeState.serverContext.getCrypto();
    TlsSecret tlsSecret = TlsUtils.getSessionMasterSecret(tlsCrypto, sessionParameters.getMasterSecret());
    if (null == tlsSecret)
      return false; 
    paramServerHandshakeState.tlsSession = paramTlsSession;
    paramServerHandshakeState.sessionParameters = sessionParameters;
    paramServerHandshakeState.sessionMasterSecret = tlsSecret;
    return true;
  }
  
  protected void invalidateSession(ServerHandshakeState paramServerHandshakeState) {
    if (paramServerHandshakeState.tlsSession != null)
      paramServerHandshakeState.tlsSession.invalidate(); 
    cancelSession(paramServerHandshakeState);
  }
  
  protected void notifyClientCertificate(ServerHandshakeState paramServerHandshakeState, Certificate paramCertificate) throws IOException {
    if (null == paramServerHandshakeState.certificateRequest)
      throw new TlsFatalAlert((short)80); 
    TlsUtils.processClientCertificate(paramServerHandshakeState.serverContext, paramCertificate, paramServerHandshakeState.keyExchange, paramServerHandshakeState.server);
  }
  
  protected void processClientCertificate(ServerHandshakeState paramServerHandshakeState, byte[] paramArrayOfbyte) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    Certificate.ParseOptions parseOptions = (new Certificate.ParseOptions()).setCertificateType(paramServerHandshakeState.serverContext.getSecurityParametersHandshake().getClientCertificateType()).setMaxChainLength(paramServerHandshakeState.server.getMaxCertificateChainLength());
    Certificate certificate = Certificate.parse(parseOptions, paramServerHandshakeState.serverContext, byteArrayInputStream, null);
    TlsProtocol.assertEmpty(byteArrayInputStream);
    notifyClientCertificate(paramServerHandshakeState, certificate);
  }
  
  protected void processCertificateVerify(ServerHandshakeState paramServerHandshakeState, byte[] paramArrayOfbyte, TlsHandshakeHash paramTlsHandshakeHash) throws IOException {
    if (paramServerHandshakeState.certificateRequest == null)
      throw new IllegalStateException(); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    TlsServerContextImpl tlsServerContextImpl = paramServerHandshakeState.serverContext;
    DigitallySigned digitallySigned = DigitallySigned.parse(tlsServerContextImpl, byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
    TlsUtils.verifyCertificateVerifyClient(tlsServerContextImpl, paramServerHandshakeState.certificateRequest, digitallySigned, paramTlsHandshakeHash);
  }
  
  protected void processClientHello(ServerHandshakeState paramServerHandshakeState, byte[] paramArrayOfbyte) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    ClientHello clientHello = ClientHello.parse(byteArrayInputStream, NullOutputStream.INSTANCE);
    processClientHello(paramServerHandshakeState, clientHello);
  }
  
  protected void processClientHello(ServerHandshakeState paramServerHandshakeState, ClientHello paramClientHello) throws IOException {
    paramServerHandshakeState.clientHello = paramClientHello;
    ProtocolVersion protocolVersion1 = paramClientHello.getVersion();
    int[] arrayOfInt = paramClientHello.getCipherSuites();
    Hashtable hashtable = paramClientHello.getExtensions();
    TlsServer tlsServer = paramServerHandshakeState.server;
    TlsServerContextImpl tlsServerContextImpl = paramServerHandshakeState.serverContext;
    SecurityParameters securityParameters = tlsServerContextImpl.getSecurityParametersHandshake();
    if (!protocolVersion1.isDTLS())
      throw new TlsFatalAlert((short)47); 
    tlsServerContextImpl.setRSAPreMasterSecretVersion(protocolVersion1);
    tlsServerContextImpl.setClientSupportedVersions(TlsExtensionsUtils.getSupportedVersionsExtensionClient(hashtable));
    ProtocolVersion protocolVersion2 = protocolVersion1;
    if (null == tlsServerContextImpl.getClientSupportedVersions()) {
      if (protocolVersion2.isLaterVersionOf(ProtocolVersion.DTLSv12))
        protocolVersion2 = ProtocolVersion.DTLSv12; 
      tlsServerContextImpl.setClientSupportedVersions(protocolVersion2.downTo(ProtocolVersion.DTLSv10));
    } else {
      protocolVersion2 = ProtocolVersion.getLatestDTLS(tlsServerContextImpl.getClientSupportedVersions());
    } 
    if (!ProtocolVersion.SERVER_EARLIEST_SUPPORTED_DTLS.isEqualOrEarlierVersionOf(protocolVersion2))
      throw new TlsFatalAlert((short)70); 
    tlsServerContextImpl.setClientVersion(protocolVersion2);
    tlsServer.notifyClientVersion(tlsServerContextImpl.getClientVersion());
    securityParameters.clientRandom = paramClientHello.getRandom();
    tlsServer.notifyFallback(Arrays.contains(arrayOfInt, 22016));
    tlsServer.notifyOfferedCipherSuites(arrayOfInt);
    byte[] arrayOfByte = TlsUtils.getExtensionData(hashtable, TlsProtocol.EXT_RenegotiationInfo);
    if (Arrays.contains(arrayOfInt, 255))
      securityParameters.secureRenegotiation = true; 
    if (arrayOfByte != null) {
      securityParameters.secureRenegotiation = true;
      if (!Arrays.constantTimeAreEqual(arrayOfByte, TlsProtocol.createRenegotiationInfo(TlsUtils.EMPTY_BYTES)))
        throw new TlsFatalAlert((short)40); 
    } 
    tlsServer.notifySecureRenegotiation(securityParameters.isSecureRenegotiation());
    if (hashtable != null) {
      TlsExtensionsUtils.getPaddingExtension(hashtable);
      securityParameters.clientServerNames = TlsExtensionsUtils.getServerNameExtensionClient(hashtable);
      if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(protocolVersion2))
        TlsUtils.establishClientSigAlgs(securityParameters, hashtable); 
      securityParameters.clientSupportedGroups = TlsExtensionsUtils.getSupportedGroupsExtension(hashtable);
      HeartbeatExtension heartbeatExtension = TlsExtensionsUtils.getHeartbeatExtension(hashtable);
      if (null != heartbeatExtension) {
        if (1 == heartbeatExtension.getMode())
          paramServerHandshakeState.heartbeat = tlsServer.getHeartbeat(); 
        paramServerHandshakeState.heartbeatPolicy = tlsServer.getHeartbeatPolicy();
      } 
      tlsServer.processClientExtensions(hashtable);
    } 
  }
  
  protected void processClientKeyExchange(ServerHandshakeState paramServerHandshakeState, byte[] paramArrayOfbyte) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    paramServerHandshakeState.keyExchange.processClientKeyExchange(byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
  }
  
  protected void processClientSupplementalData(ServerHandshakeState paramServerHandshakeState, byte[] paramArrayOfbyte) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    Vector vector = TlsProtocol.readSupplementalDataMessage(byteArrayInputStream);
    paramServerHandshakeState.server.processClientSupplementalData(vector);
  }
  
  protected boolean expectCertificateVerifyMessage(ServerHandshakeState paramServerHandshakeState) {
    if (null == paramServerHandshakeState.certificateRequest)
      return false; 
    Certificate certificate = paramServerHandshakeState.serverContext.getSecurityParametersHandshake().getPeerCertificate();
    return (null != certificate && !certificate.isEmpty() && (null == paramServerHandshakeState.keyExchange || paramServerHandshakeState.keyExchange.requiresCertificateVerify()));
  }
  
  protected static class ServerHandshakeState {
    TlsServer server = null;
    
    TlsServerContextImpl serverContext = null;
    
    TlsSession tlsSession = null;
    
    SessionParameters sessionParameters = null;
    
    TlsSecret sessionMasterSecret = null;
    
    SessionParameters.Builder sessionParametersBuilder = null;
    
    ClientHello clientHello = null;
    
    Hashtable serverExtensions = null;
    
    boolean expectSessionTicket = false;
    
    TlsKeyExchange keyExchange = null;
    
    TlsCredentials serverCredentials = null;
    
    CertificateRequest certificateRequest = null;
    
    TlsHeartbeat heartbeat = null;
    
    short heartbeatPolicy = 2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DTLSServerProtocol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */