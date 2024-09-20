package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.TlsStreamSigner;
import org.bouncycastle.util.Arrays;

public class DTLSClientProtocol extends DTLSProtocol {
  public DTLSTransport connect(TlsClient paramTlsClient, DatagramTransport paramDatagramTransport) throws IOException {
    if (paramTlsClient == null)
      throw new IllegalArgumentException("'client' cannot be null"); 
    if (paramDatagramTransport == null)
      throw new IllegalArgumentException("'transport' cannot be null"); 
    TlsClientContextImpl tlsClientContextImpl = new TlsClientContextImpl(paramTlsClient.getCrypto());
    ClientHandshakeState clientHandshakeState = new ClientHandshakeState();
    clientHandshakeState.client = paramTlsClient;
    clientHandshakeState.clientContext = tlsClientContextImpl;
    paramTlsClient.init(tlsClientContextImpl);
    tlsClientContextImpl.handshakeBeginning(paramTlsClient);
    SecurityParameters securityParameters = tlsClientContextImpl.getSecurityParametersHandshake();
    securityParameters.extendedPadding = paramTlsClient.shouldUseExtendedPadding();
    DTLSRecordLayer dTLSRecordLayer = new DTLSRecordLayer(tlsClientContextImpl, paramTlsClient, paramDatagramTransport);
    paramTlsClient.notifyCloseHandle(dTLSRecordLayer);
    try {
      return clientHandshake(clientHandshakeState, dTLSRecordLayer);
    } catch (TlsFatalAlert tlsFatalAlert) {
      abortClientHandshake(clientHandshakeState, dTLSRecordLayer, tlsFatalAlert.getAlertDescription());
      throw tlsFatalAlert;
    } catch (IOException iOException) {
      abortClientHandshake(clientHandshakeState, dTLSRecordLayer, (short)80);
      throw iOException;
    } catch (RuntimeException runtimeException) {
      abortClientHandshake(clientHandshakeState, dTLSRecordLayer, (short)80);
      throw new TlsFatalAlert((short)80, runtimeException);
    } finally {
      securityParameters.clear();
    } 
  }
  
  protected void abortClientHandshake(ClientHandshakeState paramClientHandshakeState, DTLSRecordLayer paramDTLSRecordLayer, short paramShort) {
    paramDTLSRecordLayer.fail(paramShort);
    invalidateSession(paramClientHandshakeState);
  }
  
  protected DTLSTransport clientHandshake(ClientHandshakeState paramClientHandshakeState, DTLSRecordLayer paramDTLSRecordLayer) throws IOException {
    TlsClient tlsClient = paramClientHandshakeState.client;
    TlsClientContextImpl tlsClientContextImpl = paramClientHandshakeState.clientContext;
    SecurityParameters securityParameters = tlsClientContextImpl.getSecurityParametersHandshake();
    DTLSReliableHandshake dTLSReliableHandshake = new DTLSReliableHandshake(tlsClientContextImpl, paramDTLSRecordLayer, tlsClient.getHandshakeTimeoutMillis(), tlsClient.getHandshakeResendTimeMillis(), null);
    byte[] arrayOfByte1 = generateClientHello(paramClientHandshakeState);
    paramDTLSRecordLayer.setWriteVersion(ProtocolVersion.DTLSv10);
    dTLSReliableHandshake.sendMessage((short)1, arrayOfByte1);
    DTLSReliableHandshake.Message message;
    for (message = dTLSReliableHandshake.receiveMessage(); message.getType() == 3; message = dTLSReliableHandshake.receiveMessage()) {
      byte[] arrayOfByte3 = processHelloVerifyRequest(paramClientHandshakeState, message.getBody());
      byte[] arrayOfByte4 = patchClientHelloWithCookie(arrayOfByte1, arrayOfByte3);
      dTLSReliableHandshake.resetAfterHelloVerifyRequestClient();
      dTLSReliableHandshake.sendMessage((short)1, arrayOfByte4);
    } 
    if (message.getType() == 2) {
      ProtocolVersion protocolVersion = paramDTLSRecordLayer.getReadVersion();
      reportServerVersion(paramClientHandshakeState, protocolVersion);
      paramDTLSRecordLayer.setWriteVersion(protocolVersion);
      processServerHello(paramClientHandshakeState, message.getBody());
      applyMaxFragmentLengthExtension(paramDTLSRecordLayer, securityParameters.getMaxFragmentLength());
    } else {
      throw new TlsFatalAlert((short)10);
    } 
    dTLSReliableHandshake.getHandshakeHash().notifyPRFDetermined();
    if (securityParameters.isResumedSession()) {
      securityParameters.masterSecret = paramClientHandshakeState.sessionMasterSecret;
      paramDTLSRecordLayer.initPendingEpoch(TlsUtils.initCipher(tlsClientContextImpl));
      securityParameters.peerVerifyData = TlsUtils.calculateVerifyData(tlsClientContextImpl, dTLSReliableHandshake.getHandshakeHash(), true);
      processFinished(dTLSReliableHandshake.receiveMessageBody((short)20), securityParameters.getPeerVerifyData());
      securityParameters.localVerifyData = TlsUtils.calculateVerifyData(tlsClientContextImpl, dTLSReliableHandshake.getHandshakeHash(), false);
      dTLSReliableHandshake.sendMessage((short)20, securityParameters.getLocalVerifyData());
      dTLSReliableHandshake.finish();
      if (securityParameters.isExtendedMasterSecret())
        securityParameters.tlsUnique = securityParameters.getPeerVerifyData(); 
      securityParameters.localCertificate = paramClientHandshakeState.sessionParameters.getLocalCertificate();
      securityParameters.peerCertificate = paramClientHandshakeState.sessionParameters.getPeerCertificate();
      securityParameters.pskIdentity = paramClientHandshakeState.sessionParameters.getPSKIdentity();
      securityParameters.srpIdentity = paramClientHandshakeState.sessionParameters.getSRPIdentity();
      tlsClientContextImpl.handshakeComplete(tlsClient, paramClientHandshakeState.tlsSession);
      paramDTLSRecordLayer.initHeartbeat(paramClientHandshakeState.heartbeat, (1 == paramClientHandshakeState.heartbeatPolicy));
      return new DTLSTransport(paramDTLSRecordLayer);
    } 
    invalidateSession(paramClientHandshakeState);
    paramClientHandshakeState.tlsSession = TlsUtils.importSession(securityParameters.getSessionID(), null);
    message = dTLSReliableHandshake.receiveMessage();
    if (message.getType() == 23) {
      processServerSupplementalData(paramClientHandshakeState, message.getBody());
      message = dTLSReliableHandshake.receiveMessage();
    } else {
      tlsClient.processServerSupplementalData((Vector)null);
    } 
    paramClientHandshakeState.keyExchange = TlsUtils.initKeyExchangeClient(tlsClientContextImpl, tlsClient);
    if (message.getType() == 11) {
      processServerCertificate(paramClientHandshakeState, message.getBody());
      message = dTLSReliableHandshake.receiveMessage();
    } else {
      paramClientHandshakeState.authentication = null;
    } 
    if (message.getType() == 22) {
      if (securityParameters.getStatusRequestVersion() < 1)
        throw new TlsFatalAlert((short)10); 
      processCertificateStatus(paramClientHandshakeState, message.getBody());
      message = dTLSReliableHandshake.receiveMessage();
    } 
    TlsUtils.processServerCertificate(tlsClientContextImpl, paramClientHandshakeState.certificateStatus, paramClientHandshakeState.keyExchange, paramClientHandshakeState.authentication, paramClientHandshakeState.clientExtensions, paramClientHandshakeState.serverExtensions);
    if (message.getType() == 12) {
      processServerKeyExchange(paramClientHandshakeState, message.getBody());
      message = dTLSReliableHandshake.receiveMessage();
    } else {
      paramClientHandshakeState.keyExchange.skipServerKeyExchange();
    } 
    if (message.getType() == 13) {
      processCertificateRequest(paramClientHandshakeState, message.getBody());
      TlsUtils.establishServerSigAlgs(securityParameters, paramClientHandshakeState.certificateRequest);
      message = dTLSReliableHandshake.receiveMessage();
    } 
    if (message.getType() == 14) {
      if ((message.getBody()).length != 0)
        throw new TlsFatalAlert((short)50); 
    } else {
      throw new TlsFatalAlert((short)10);
    } 
    TlsCredentials tlsCredentials = null;
    TlsCredentialedSigner tlsCredentialedSigner = null;
    Certificate certificate = null;
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = null;
    TlsStreamSigner tlsStreamSigner = null;
    if (paramClientHandshakeState.certificateRequest != null) {
      tlsCredentials = TlsUtils.establishClientCredentials(paramClientHandshakeState.authentication, paramClientHandshakeState.certificateRequest);
      if (tlsCredentials != null) {
        certificate = tlsCredentials.getCertificate();
        if (tlsCredentials instanceof TlsCredentialedSigner) {
          tlsCredentialedSigner = (TlsCredentialedSigner)tlsCredentials;
          signatureAndHashAlgorithm = TlsUtils.getSignatureAndHashAlgorithm(securityParameters.getNegotiatedVersion(), tlsCredentialedSigner);
          tlsStreamSigner = tlsCredentialedSigner.getStreamSigner();
          if (ProtocolVersion.DTLSv12.equals(securityParameters.getNegotiatedVersion())) {
            TlsUtils.verifySupportedSignatureAlgorithm(securityParameters.getServerSigAlgs(), signatureAndHashAlgorithm, (short)80);
            if (tlsStreamSigner == null)
              TlsUtils.trackHashAlgorithmClient(dTLSReliableHandshake.getHandshakeHash(), signatureAndHashAlgorithm); 
          } 
          if (tlsStreamSigner != null)
            dTLSReliableHandshake.getHandshakeHash().forceBuffering(); 
        } 
      } 
    } 
    dTLSReliableHandshake.getHandshakeHash().sealHashAlgorithms();
    if (tlsCredentials == null) {
      paramClientHandshakeState.keyExchange.skipClientCredentials();
    } else {
      paramClientHandshakeState.keyExchange.processClientCredentials(tlsCredentials);
    } 
    Vector vector = tlsClient.getClientSupplementalData();
    if (vector != null) {
      byte[] arrayOfByte = generateSupplementalData(vector);
      dTLSReliableHandshake.sendMessage((short)23, arrayOfByte);
    } 
    if (null != paramClientHandshakeState.certificateRequest)
      sendCertificateMessage(tlsClientContextImpl, dTLSReliableHandshake, certificate, null); 
    byte[] arrayOfByte2 = generateClientKeyExchange(paramClientHandshakeState);
    dTLSReliableHandshake.sendMessage((short)16, arrayOfByte2);
    securityParameters.sessionHash = TlsUtils.getCurrentPRFHash(dTLSReliableHandshake.getHandshakeHash());
    TlsProtocol.establishMasterSecret(tlsClientContextImpl, paramClientHandshakeState.keyExchange);
    paramDTLSRecordLayer.initPendingEpoch(TlsUtils.initCipher(tlsClientContextImpl));
    if (tlsCredentialedSigner != null) {
      DigitallySigned digitallySigned = TlsUtils.generateCertificateVerifyClient(tlsClientContextImpl, tlsCredentialedSigner, signatureAndHashAlgorithm, tlsStreamSigner, dTLSReliableHandshake.getHandshakeHash());
      byte[] arrayOfByte = generateCertificateVerify(paramClientHandshakeState, digitallySigned);
      dTLSReliableHandshake.sendMessage((short)15, arrayOfByte);
    } 
    dTLSReliableHandshake.prepareToFinish();
    securityParameters.localVerifyData = TlsUtils.calculateVerifyData(tlsClientContextImpl, dTLSReliableHandshake.getHandshakeHash(), false);
    dTLSReliableHandshake.sendMessage((short)20, securityParameters.getLocalVerifyData());
    if (paramClientHandshakeState.expectSessionTicket) {
      message = dTLSReliableHandshake.receiveMessage();
      if (message.getType() == 4) {
        securityParameters.sessionID = TlsUtils.EMPTY_BYTES;
        invalidateSession(paramClientHandshakeState);
        paramClientHandshakeState.tlsSession = TlsUtils.importSession(securityParameters.getSessionID(), null);
        processNewSessionTicket(paramClientHandshakeState, message.getBody());
      } else {
        throw new TlsFatalAlert((short)10);
      } 
    } 
    securityParameters.peerVerifyData = TlsUtils.calculateVerifyData(tlsClientContextImpl, dTLSReliableHandshake.getHandshakeHash(), true);
    processFinished(dTLSReliableHandshake.receiveMessageBody((short)20), securityParameters.getPeerVerifyData());
    dTLSReliableHandshake.finish();
    paramClientHandshakeState.sessionMasterSecret = securityParameters.getMasterSecret();
    paramClientHandshakeState.sessionParameters = (new SessionParameters.Builder()).setCipherSuite(securityParameters.getCipherSuite()).setExtendedMasterSecret(securityParameters.isExtendedMasterSecret()).setLocalCertificate(securityParameters.getLocalCertificate()).setMasterSecret(tlsClientContextImpl.getCrypto().adoptSecret(paramClientHandshakeState.sessionMasterSecret)).setNegotiatedVersion(securityParameters.getNegotiatedVersion()).setPeerCertificate(securityParameters.getPeerCertificate()).setPSKIdentity(securityParameters.getPSKIdentity()).setSRPIdentity(securityParameters.getSRPIdentity()).setServerExtensions(paramClientHandshakeState.serverExtensions).build();
    paramClientHandshakeState.tlsSession = TlsUtils.importSession(securityParameters.getSessionID(), paramClientHandshakeState.sessionParameters);
    securityParameters.tlsUnique = securityParameters.getLocalVerifyData();
    tlsClientContextImpl.handshakeComplete(tlsClient, paramClientHandshakeState.tlsSession);
    paramDTLSRecordLayer.initHeartbeat(paramClientHandshakeState.heartbeat, (1 == paramClientHandshakeState.heartbeatPolicy));
    return new DTLSTransport(paramDTLSRecordLayer);
  }
  
  protected byte[] generateCertificateVerify(ClientHandshakeState paramClientHandshakeState, DigitallySigned paramDigitallySigned) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramDigitallySigned.encode(byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  protected byte[] generateClientHello(ClientHandshakeState paramClientHandshakeState) throws IOException {
    TlsClient tlsClient = paramClientHandshakeState.client;
    TlsClientContextImpl tlsClientContextImpl = paramClientHandshakeState.clientContext;
    SecurityParameters securityParameters = tlsClientContextImpl.getSecurityParametersHandshake();
    ProtocolVersion[] arrayOfProtocolVersion = tlsClient.getProtocolVersions();
    ProtocolVersion protocolVersion1 = ProtocolVersion.getEarliestDTLS(arrayOfProtocolVersion);
    ProtocolVersion protocolVersion2 = ProtocolVersion.getLatestDTLS(arrayOfProtocolVersion);
    if (!ProtocolVersion.isSupportedDTLSVersionClient(protocolVersion2))
      throw new TlsFatalAlert((short)80); 
    tlsClientContextImpl.setClientVersion(protocolVersion2);
    tlsClientContextImpl.setClientSupportedVersions(arrayOfProtocolVersion);
    boolean bool1 = ProtocolVersion.DTLSv12.isEqualOrLaterVersionOf(protocolVersion1);
    boolean bool2 = ProtocolVersion.DTLSv13.isEqualOrEarlierVersionOf(protocolVersion2);
    boolean bool3 = (!bool2 && tlsClient.shouldUseGMTUnixTime()) ? true : false;
    securityParameters.clientRandom = TlsProtocol.createRandomBlock(bool3, tlsClientContextImpl);
    TlsSession tlsSession = bool1 ? tlsClient.getSessionToResume() : null;
    boolean bool4 = tlsClient.isFallback();
    paramClientHandshakeState.offeredCipherSuites = tlsClient.getCipherSuites();
    paramClientHandshakeState.clientExtensions = TlsExtensionsUtils.ensureExtensionsInitialised(tlsClient.getClientExtensions());
    boolean bool5 = tlsClient.shouldUseExtendedMasterSecret();
    establishSession(paramClientHandshakeState, tlsSession);
    byte[] arrayOfByte = TlsUtils.getSessionID(paramClientHandshakeState.tlsSession);
    if (arrayOfByte.length > 0 && !Arrays.contains(paramClientHandshakeState.offeredCipherSuites, paramClientHandshakeState.sessionParameters.getCipherSuite()))
      arrayOfByte = TlsUtils.EMPTY_BYTES; 
    ProtocolVersion protocolVersion3 = null;
    if (arrayOfByte.length > 0) {
      protocolVersion3 = paramClientHandshakeState.sessionParameters.getNegotiatedVersion();
      if (!ProtocolVersion.contains(arrayOfProtocolVersion, protocolVersion3))
        arrayOfByte = TlsUtils.EMPTY_BYTES; 
    } 
    if (arrayOfByte.length > 0 && TlsUtils.isExtendedMasterSecretOptional(protocolVersion3))
      if (bool5) {
        if (!paramClientHandshakeState.sessionParameters.isExtendedMasterSecret() && !tlsClient.allowLegacyResumption())
          arrayOfByte = TlsUtils.EMPTY_BYTES; 
      } else if (paramClientHandshakeState.sessionParameters.isExtendedMasterSecret()) {
        arrayOfByte = TlsUtils.EMPTY_BYTES;
      }  
    if (arrayOfByte.length < 1)
      cancelSession(paramClientHandshakeState); 
    tlsClient.notifySessionToResume(paramClientHandshakeState.tlsSession);
    ProtocolVersion protocolVersion4 = protocolVersion2;
    if (bool2) {
      protocolVersion4 = ProtocolVersion.DTLSv12;
      TlsExtensionsUtils.addSupportedVersionsExtensionClient(paramClientHandshakeState.clientExtensions, arrayOfProtocolVersion);
    } 
    tlsClientContextImpl.setRSAPreMasterSecretVersion(protocolVersion4);
    securityParameters.clientServerNames = TlsExtensionsUtils.getServerNameExtensionClient(paramClientHandshakeState.clientExtensions);
    if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(protocolVersion2))
      TlsUtils.establishClientSigAlgs(securityParameters, paramClientHandshakeState.clientExtensions); 
    securityParameters.clientSupportedGroups = TlsExtensionsUtils.getSupportedGroupsExtension(paramClientHandshakeState.clientExtensions);
    paramClientHandshakeState.clientBinders = null;
    paramClientHandshakeState.clientAgreements = TlsUtils.addKeyShareToClientHello(tlsClientContextImpl, tlsClient, paramClientHandshakeState.clientExtensions);
    if (bool5 && TlsUtils.isExtendedMasterSecretOptional(arrayOfProtocolVersion)) {
      TlsExtensionsUtils.addExtendedMasterSecretExtension(paramClientHandshakeState.clientExtensions);
    } else {
      paramClientHandshakeState.clientExtensions.remove(TlsExtensionsUtils.EXT_extended_master_secret);
    } 
    boolean bool6 = (null == TlsUtils.getExtensionData(paramClientHandshakeState.clientExtensions, TlsProtocol.EXT_RenegotiationInfo)) ? true : false;
    boolean bool7 = !Arrays.contains(paramClientHandshakeState.offeredCipherSuites, 255) ? true : false;
    if (bool6 && bool7)
      paramClientHandshakeState.offeredCipherSuites = Arrays.append(paramClientHandshakeState.offeredCipherSuites, 255); 
    if (bool4 && !Arrays.contains(paramClientHandshakeState.offeredCipherSuites, 22016))
      paramClientHandshakeState.offeredCipherSuites = Arrays.append(paramClientHandshakeState.offeredCipherSuites, 22016); 
    paramClientHandshakeState.heartbeat = tlsClient.getHeartbeat();
    paramClientHandshakeState.heartbeatPolicy = tlsClient.getHeartbeatPolicy();
    if (null != paramClientHandshakeState.heartbeat || 1 == paramClientHandshakeState.heartbeatPolicy)
      TlsExtensionsUtils.addHeartbeatExtension(paramClientHandshakeState.clientExtensions, new HeartbeatExtension(paramClientHandshakeState.heartbeatPolicy)); 
    bool6 = (null == paramClientHandshakeState.clientBinders) ? false : paramClientHandshakeState.clientBinders.bindersSize;
    ClientHello clientHello = new ClientHello(protocolVersion4, securityParameters.getClientRandom(), arrayOfByte, TlsUtils.EMPTY_BYTES, paramClientHandshakeState.offeredCipherSuites, paramClientHandshakeState.clientExtensions, bool6);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    clientHello.encode(tlsClientContextImpl, byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  protected byte[] generateClientKeyExchange(ClientHandshakeState paramClientHandshakeState) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramClientHandshakeState.keyExchange.generateClientKeyExchange(byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  protected void cancelSession(ClientHandshakeState paramClientHandshakeState) {
    if (paramClientHandshakeState.sessionMasterSecret != null) {
      paramClientHandshakeState.sessionMasterSecret.destroy();
      paramClientHandshakeState.sessionMasterSecret = null;
    } 
    if (paramClientHandshakeState.sessionParameters != null) {
      paramClientHandshakeState.sessionParameters.clear();
      paramClientHandshakeState.sessionParameters = null;
    } 
    paramClientHandshakeState.tlsSession = null;
  }
  
  protected boolean establishSession(ClientHandshakeState paramClientHandshakeState, TlsSession paramTlsSession) {
    paramClientHandshakeState.tlsSession = null;
    paramClientHandshakeState.sessionParameters = null;
    paramClientHandshakeState.sessionMasterSecret = null;
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
    TlsCrypto tlsCrypto = paramClientHandshakeState.clientContext.getCrypto();
    TlsSecret tlsSecret = TlsUtils.getSessionMasterSecret(tlsCrypto, sessionParameters.getMasterSecret());
    if (null == tlsSecret)
      return false; 
    paramClientHandshakeState.tlsSession = paramTlsSession;
    paramClientHandshakeState.sessionParameters = sessionParameters;
    paramClientHandshakeState.sessionMasterSecret = tlsSecret;
    return true;
  }
  
  protected void invalidateSession(ClientHandshakeState paramClientHandshakeState) {
    if (paramClientHandshakeState.tlsSession != null)
      paramClientHandshakeState.tlsSession.invalidate(); 
    cancelSession(paramClientHandshakeState);
  }
  
  protected void processCertificateRequest(ClientHandshakeState paramClientHandshakeState, byte[] paramArrayOfbyte) throws IOException {
    if (null == paramClientHandshakeState.authentication)
      throw new TlsFatalAlert((short)40); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    CertificateRequest certificateRequest = CertificateRequest.parse(paramClientHandshakeState.clientContext, byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
    paramClientHandshakeState.certificateRequest = TlsUtils.validateCertificateRequest(certificateRequest, paramClientHandshakeState.keyExchange);
  }
  
  protected void processCertificateStatus(ClientHandshakeState paramClientHandshakeState, byte[] paramArrayOfbyte) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    paramClientHandshakeState.certificateStatus = CertificateStatus.parse(paramClientHandshakeState.clientContext, byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
  }
  
  protected byte[] processHelloVerifyRequest(ClientHandshakeState paramClientHandshakeState, byte[] paramArrayOfbyte) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    ProtocolVersion protocolVersion = TlsUtils.readVersion(byteArrayInputStream);
    boolean bool = ProtocolVersion.DTLSv12.isEqualOrEarlierVersionOf(protocolVersion) ? true : true;
    byte[] arrayOfByte = TlsUtils.readOpaque8(byteArrayInputStream, 0, bool);
    TlsProtocol.assertEmpty(byteArrayInputStream);
    if (!protocolVersion.isEqualOrEarlierVersionOf(paramClientHandshakeState.clientContext.getClientVersion()))
      throw new TlsFatalAlert((short)47); 
    return arrayOfByte;
  }
  
  protected void processNewSessionTicket(ClientHandshakeState paramClientHandshakeState, byte[] paramArrayOfbyte) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    NewSessionTicket newSessionTicket = NewSessionTicket.parse(byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
    paramClientHandshakeState.client.notifyNewSessionTicket(newSessionTicket);
  }
  
  protected void processServerCertificate(ClientHandshakeState paramClientHandshakeState, byte[] paramArrayOfbyte) throws IOException {
    paramClientHandshakeState.authentication = TlsUtils.receiveServerCertificate(paramClientHandshakeState.clientContext, paramClientHandshakeState.client, new ByteArrayInputStream(paramArrayOfbyte), paramClientHandshakeState.serverExtensions);
  }
  
  protected void processServerHello(ClientHandshakeState paramClientHandshakeState, byte[] paramArrayOfbyte) throws IOException {
    ProtocolVersion protocolVersion3;
    TlsClient tlsClient = paramClientHandshakeState.client;
    TlsClientContextImpl tlsClientContextImpl = paramClientHandshakeState.clientContext;
    SecurityParameters securityParameters = tlsClientContextImpl.getSecurityParametersHandshake();
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    ServerHello serverHello = ServerHello.parse(byteArrayInputStream);
    Hashtable hashtable1 = serverHello.getExtensions();
    ProtocolVersion protocolVersion1 = serverHello.getVersion();
    ProtocolVersion protocolVersion2 = TlsExtensionsUtils.getSupportedVersionsExtensionServer(hashtable1);
    if (null == protocolVersion2) {
      protocolVersion3 = protocolVersion1;
    } else {
      if (!ProtocolVersion.DTLSv12.equals(protocolVersion1) || !ProtocolVersion.DTLSv13.isEqualOrEarlierVersionOf(protocolVersion2))
        throw new TlsFatalAlert((short)47); 
      protocolVersion3 = protocolVersion2;
    } 
    reportServerVersion(paramClientHandshakeState, protocolVersion3);
    int[] arrayOfInt = paramClientHandshakeState.offeredCipherSuites;
    securityParameters.serverRandom = serverHello.getRandom();
    if (!tlsClientContextImpl.getClientVersion().equals(protocolVersion3))
      TlsUtils.checkDowngradeMarker(protocolVersion3, securityParameters.getServerRandom()); 
    byte[] arrayOfByte2 = serverHello.getSessionID();
    securityParameters.sessionID = arrayOfByte2;
    tlsClient.notifySessionID(arrayOfByte2);
    securityParameters.resumedSession = (arrayOfByte2.length > 0 && paramClientHandshakeState.tlsSession != null && Arrays.areEqual(arrayOfByte2, paramClientHandshakeState.tlsSession.getSessionID()));
    if (securityParameters.isResumedSession() && (serverHello.getCipherSuite() != paramClientHandshakeState.sessionParameters.getCipherSuite() || !securityParameters.getNegotiatedVersion().equals(paramClientHandshakeState.sessionParameters.getNegotiatedVersion())))
      throw new TlsFatalAlert((short)47, "ServerHello parameters do not match resumed session"); 
    int i = validateSelectedCipherSuite(serverHello.getCipherSuite(), (short)47);
    if (!TlsUtils.isValidCipherSuiteSelection(arrayOfInt, i) || !TlsUtils.isValidVersionForCipherSuite(i, securityParameters.getNegotiatedVersion()))
      throw new TlsFatalAlert((short)47, "ServerHello selected invalid cipher suite"); 
    TlsUtils.negotiatedCipherSuite(securityParameters, i);
    tlsClient.notifySelectedCipherSuite(i);
    paramClientHandshakeState.serverExtensions = hashtable1;
    if (hashtable1 != null) {
      Enumeration<Integer> enumeration = hashtable1.keys();
      while (enumeration.hasMoreElements()) {
        Integer integer = enumeration.nextElement();
        if (integer.equals(TlsProtocol.EXT_RenegotiationInfo))
          continue; 
        if (null == TlsUtils.getExtensionData(paramClientHandshakeState.clientExtensions, integer))
          throw new TlsFatalAlert((short)110); 
        if (securityParameters.isResumedSession());
      } 
    } 
    byte[] arrayOfByte1 = TlsUtils.getExtensionData(hashtable1, TlsProtocol.EXT_RenegotiationInfo);
    if (arrayOfByte1 == null) {
      securityParameters.secureRenegotiation = false;
    } else {
      securityParameters.secureRenegotiation = true;
      if (!Arrays.constantTimeAreEqual(arrayOfByte1, TlsProtocol.createRenegotiationInfo(TlsUtils.EMPTY_BYTES)))
        throw new TlsFatalAlert((short)40); 
    } 
    tlsClient.notifySecureRenegotiation(securityParameters.isSecureRenegotiation());
    boolean bool = false;
    if (TlsExtensionsUtils.hasExtendedMasterSecretExtension(paramClientHandshakeState.clientExtensions)) {
      bool = TlsExtensionsUtils.hasExtendedMasterSecretExtension(hashtable1);
      if (TlsUtils.isExtendedMasterSecretOptional(protocolVersion3)) {
        if (!bool && tlsClient.requiresExtendedMasterSecret())
          throw new TlsFatalAlert((short)40, "Extended Master Secret extension is required"); 
      } else if (bool) {
        throw new TlsFatalAlert((short)47, "Server sent an unexpected extended_master_secret extension negotiating " + protocolVersion3);
      } 
    } 
    securityParameters.extendedMasterSecret = bool;
    if (securityParameters.isResumedSession() && securityParameters.isExtendedMasterSecret() != paramClientHandshakeState.sessionParameters.isExtendedMasterSecret())
      throw new TlsFatalAlert((short)40, "Server resumed session with mismatched extended_master_secret negotiation"); 
    securityParameters.applicationProtocol = TlsExtensionsUtils.getALPNExtensionServer(hashtable1);
    securityParameters.applicationProtocolSet = true;
    if (ProtocolVersion.DTLSv12.equals(securityParameters.getNegotiatedVersion())) {
      byte[] arrayOfByte = TlsExtensionsUtils.getConnectionIDExtension(hashtable1);
      if (arrayOfByte != null) {
        byte[] arrayOfByte3 = TlsExtensionsUtils.getConnectionIDExtension(paramClientHandshakeState.clientExtensions);
        if (arrayOfByte3 == null)
          throw new TlsFatalAlert((short)80); 
        securityParameters.connectionIDLocal = arrayOfByte;
        securityParameters.connectionIDPeer = arrayOfByte3;
      } 
    } 
    HeartbeatExtension heartbeatExtension = TlsExtensionsUtils.getHeartbeatExtension(hashtable1);
    if (null == heartbeatExtension) {
      paramClientHandshakeState.heartbeat = null;
      paramClientHandshakeState.heartbeatPolicy = 2;
    } else if (1 != heartbeatExtension.getMode()) {
      paramClientHandshakeState.heartbeat = null;
    } 
    Hashtable hashtable2 = paramClientHandshakeState.clientExtensions;
    Hashtable hashtable3 = hashtable1;
    if (securityParameters.isResumedSession()) {
      hashtable2 = null;
      hashtable3 = paramClientHandshakeState.sessionParameters.readServerExtensions();
    } 
    if (hashtable3 != null && !hashtable3.isEmpty()) {
      boolean bool1 = TlsExtensionsUtils.hasEncryptThenMACExtension(hashtable3);
      if (bool1 && !TlsUtils.isBlockCipherSuite(securityParameters.getCipherSuite()))
        throw new TlsFatalAlert((short)47); 
      securityParameters.encryptThenMAC = bool1;
      securityParameters.maxFragmentLength = TlsUtils.processMaxFragmentLengthExtension(hashtable2, hashtable3, (short)47);
      securityParameters.truncatedHMac = TlsExtensionsUtils.hasTruncatedHMacExtension(hashtable3);
      if (!securityParameters.isResumedSession()) {
        if (TlsUtils.hasExpectedEmptyExtensionData(hashtable3, TlsExtensionsUtils.EXT_status_request_v2, (short)47)) {
          securityParameters.statusRequestVersion = 2;
        } else if (TlsUtils.hasExpectedEmptyExtensionData(hashtable3, TlsExtensionsUtils.EXT_status_request, (short)47)) {
          securityParameters.statusRequestVersion = 1;
        } 
        securityParameters.clientCertificateType = TlsUtils.processClientCertificateTypeExtension(hashtable2, hashtable3, (short)47);
        securityParameters.serverCertificateType = TlsUtils.processServerCertificateTypeExtension(hashtable2, hashtable3, (short)47);
        paramClientHandshakeState.expectSessionTicket = TlsUtils.hasExpectedEmptyExtensionData(hashtable3, TlsProtocol.EXT_SessionTicket, (short)47);
      } 
    } 
    if (hashtable2 != null)
      tlsClient.processServerExtensions(hashtable3); 
  }
  
  protected void processServerKeyExchange(ClientHandshakeState paramClientHandshakeState, byte[] paramArrayOfbyte) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    paramClientHandshakeState.keyExchange.processServerKeyExchange(byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
  }
  
  protected void processServerSupplementalData(ClientHandshakeState paramClientHandshakeState, byte[] paramArrayOfbyte) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    Vector vector = TlsProtocol.readSupplementalDataMessage(byteArrayInputStream);
    paramClientHandshakeState.client.processServerSupplementalData(vector);
  }
  
  protected void reportServerVersion(ClientHandshakeState paramClientHandshakeState, ProtocolVersion paramProtocolVersion) throws IOException {
    TlsClientContextImpl tlsClientContextImpl = paramClientHandshakeState.clientContext;
    SecurityParameters securityParameters = tlsClientContextImpl.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
    if (null != protocolVersion) {
      if (!protocolVersion.equals(paramProtocolVersion))
        throw new TlsFatalAlert((short)47); 
      return;
    } 
    if (!ProtocolVersion.contains(tlsClientContextImpl.getClientSupportedVersions(), paramProtocolVersion))
      throw new TlsFatalAlert((short)70); 
    securityParameters.negotiatedVersion = paramProtocolVersion;
    TlsUtils.negotiatedVersionDTLSClient(tlsClientContextImpl, paramClientHandshakeState.client);
  }
  
  protected static byte[] patchClientHelloWithCookie(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws IOException {
    byte b = 34;
    short s = TlsUtils.readUint8(paramArrayOfbyte1, b);
    int i = b + 1 + s;
    int j = i + 1;
    byte[] arrayOfByte = new byte[paramArrayOfbyte1.length + paramArrayOfbyte2.length];
    System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, i);
    TlsUtils.checkUint8(paramArrayOfbyte2.length);
    TlsUtils.writeUint8(paramArrayOfbyte2.length, arrayOfByte, i);
    System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, j, paramArrayOfbyte2.length);
    System.arraycopy(paramArrayOfbyte1, j, arrayOfByte, j + paramArrayOfbyte2.length, paramArrayOfbyte1.length - j);
    return arrayOfByte;
  }
  
  protected static class ClientHandshakeState {
    TlsClient client = null;
    
    TlsClientContextImpl clientContext = null;
    
    TlsSession tlsSession = null;
    
    SessionParameters sessionParameters = null;
    
    TlsSecret sessionMasterSecret = null;
    
    SessionParameters.Builder sessionParametersBuilder = null;
    
    int[] offeredCipherSuites = null;
    
    Hashtable clientExtensions = null;
    
    Hashtable serverExtensions = null;
    
    boolean expectSessionTicket = false;
    
    Hashtable clientAgreements = null;
    
    OfferedPsks.BindersConfig clientBinders = null;
    
    TlsKeyExchange keyExchange = null;
    
    TlsAuthentication authentication = null;
    
    CertificateStatus certificateStatus = null;
    
    CertificateRequest certificateRequest = null;
    
    TlsHeartbeat heartbeat = null;
    
    short heartbeatPolicy = 2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DTLSClientProtocol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */