package META-INF.versions.9.org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.AbstractTlsContext;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.CertificateRequest;
import org.bouncycastle.tls.CertificateStatus;
import org.bouncycastle.tls.CertificateVerify;
import org.bouncycastle.tls.ClientHello;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.HandshakeMessageInput;
import org.bouncycastle.tls.HandshakeMessageOutput;
import org.bouncycastle.tls.KeyExchangeAlgorithm;
import org.bouncycastle.tls.KeyShareEntry;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.NewSessionTicket;
import org.bouncycastle.tls.OfferedPsks;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.ServerHello;
import org.bouncycastle.tls.TlsCloseable;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsCredentialedSigner;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsExtensionsUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsKeyExchange;
import org.bouncycastle.tls.TlsPeer;
import org.bouncycastle.tls.TlsProtocol;
import org.bouncycastle.tls.TlsServer;
import org.bouncycastle.tls.TlsServerContext;
import org.bouncycastle.tls.TlsServerContextImpl;
import org.bouncycastle.tls.TlsSession;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.tls.crypto.TlsKemConfig;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;

public class TlsServerProtocol extends TlsProtocol {
  protected TlsServer tlsServer = null;
  
  TlsServerContextImpl tlsServerContext = null;
  
  protected int[] offeredCipherSuites = null;
  
  protected TlsKeyExchange keyExchange = null;
  
  protected CertificateRequest certificateRequest = null;
  
  public TlsServerProtocol() {}
  
  public TlsServerProtocol(InputStream paramInputStream, OutputStream paramOutputStream) {
    super(paramInputStream, paramOutputStream);
  }
  
  public void accept(TlsServer paramTlsServer) throws IOException {
    if (paramTlsServer == null)
      throw new IllegalArgumentException("'tlsServer' cannot be null"); 
    if (this.tlsServer != null)
      throw new IllegalStateException("'accept' can only be called once"); 
    this.tlsServer = paramTlsServer;
    this.tlsServerContext = new TlsServerContextImpl(paramTlsServer.getCrypto());
    paramTlsServer.init((TlsServerContext)this.tlsServerContext);
    paramTlsServer.notifyCloseHandle((TlsCloseable)this);
    beginHandshake(false);
    if (this.blocking)
      blockForHandshake(); 
  }
  
  protected void cleanupHandshake() {
    super.cleanupHandshake();
    this.offeredCipherSuites = null;
    this.keyExchange = null;
    this.certificateRequest = null;
  }
  
  protected boolean expectCertificateVerifyMessage() {
    if (null == this.certificateRequest)
      return false; 
    Certificate certificate = this.tlsServerContext.getSecurityParametersHandshake().getPeerCertificate();
    return (null != certificate && !certificate.isEmpty() && (null == this.keyExchange || this.keyExchange.requiresCertificateVerify()));
  }
  
  protected ServerHello generate13HelloRetryRequest(ClientHello paramClientHello) throws IOException {
    if (this.retryGroup < 0)
      throw new TlsFatalAlert((short)80); 
    SecurityParameters securityParameters = this.tlsServerContext.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
    Hashtable<Object, Object> hashtable = new Hashtable<>();
    TlsExtensionsUtils.addSupportedVersionsExtensionServer(hashtable, protocolVersion);
    if (this.retryGroup >= 0)
      TlsExtensionsUtils.addKeyShareHelloRetryRequest(hashtable, this.retryGroup); 
    if (null != this.retryCookie)
      TlsExtensionsUtils.addCookieExtension(hashtable, this.retryCookie); 
    TlsUtils.checkExtensionData13(hashtable, 6, (short)80);
    return new ServerHello(paramClientHello.getSessionID(), securityParameters.getCipherSuite(), hashtable);
  }
  
  protected ServerHello generate13ServerHello(ClientHello paramClientHello, HandshakeMessageInput paramHandshakeMessageInput, boolean paramBoolean) throws IOException {
    TlsAgreement tlsAgreement;
    SecurityParameters securityParameters = this.tlsServerContext.getSecurityParametersHandshake();
    if (securityParameters.isRenegotiating())
      throw new TlsFatalAlert((short)80); 
    byte[] arrayOfByte1 = paramClientHello.getSessionID();
    Hashtable hashtable1 = paramClientHello.getExtensions();
    if (null == hashtable1)
      throw new TlsFatalAlert((short)109); 
    ProtocolVersion protocolVersion1 = securityParameters.getNegotiatedVersion();
    TlsCrypto tlsCrypto = this.tlsServerContext.getCrypto();
    OfferedPsks.SelectedConfig selectedConfig = TlsUtils.selectPreSharedKey((TlsServerContext)this.tlsServerContext, this.tlsServer, hashtable1, paramHandshakeMessageInput, this.handshakeHash, paramBoolean);
    Vector vector = TlsExtensionsUtils.getKeyShareClientHello(hashtable1);
    KeyShareEntry keyShareEntry1 = null;
    if (paramBoolean) {
      if (this.retryGroup < 0)
        throw new TlsFatalAlert((short)80); 
      if (null == selectedConfig) {
        if (null == securityParameters.getClientSigAlgs())
          throw new TlsFatalAlert((short)109); 
      } else if (selectedConfig.psk.getPRFAlgorithm() != securityParameters.getPRFAlgorithm()) {
        throw new TlsFatalAlert((short)47);
      } 
      byte[] arrayOfByte = TlsExtensionsUtils.getCookieExtension(hashtable1);
      if (!Arrays.areEqual(this.retryCookie, arrayOfByte))
        throw new TlsFatalAlert((short)47); 
      this.retryCookie = null;
      keyShareEntry1 = TlsUtils.selectKeyShare(vector, this.retryGroup);
      if (null == keyShareEntry1)
        throw new TlsFatalAlert((short)47); 
    } else {
      securityParameters.serverRandom = createRandomBlock(false, (TlsContext)this.tlsServerContext);
      if (!protocolVersion1.equals(ProtocolVersion.getLatestTLS(this.tlsServer.getProtocolVersions())))
        TlsUtils.writeDowngradeMarker(protocolVersion1, securityParameters.getServerRandom()); 
      this.clientExtensions = hashtable1;
      securityParameters.secureRenegotiation = false;
      TlsExtensionsUtils.getPaddingExtension(hashtable1);
      securityParameters.clientServerNames = TlsExtensionsUtils.getServerNameExtensionClient(hashtable1);
      TlsUtils.establishClientSigAlgs(securityParameters, hashtable1);
      if (null == selectedConfig && null == securityParameters.getClientSigAlgs())
        throw new TlsFatalAlert((short)109); 
      this.tlsServer.processClientExtensions(hashtable1);
      securityParameters.resumedSession = false;
      this.tlsSession = TlsUtils.importSession(TlsUtils.EMPTY_BYTES, null);
      this.sessionParameters = null;
      this.sessionMasterSecret = null;
      securityParameters.sessionID = this.tlsSession.getSessionID();
      this.tlsServer.notifySession(this.tlsSession);
      TlsUtils.negotiatedVersionTLSServer((TlsServerContext)this.tlsServerContext);
      int j = this.tlsServer.getSelectedCipherSuite();
      if (!TlsUtils.isValidCipherSuiteSelection(this.offeredCipherSuites, j) || !TlsUtils.isValidVersionForCipherSuite(j, protocolVersion1))
        throw new TlsFatalAlert((short)80); 
      TlsUtils.negotiatedCipherSuite(securityParameters, j);
      int[] arrayOfInt1 = securityParameters.getClientSupportedGroups();
      int[] arrayOfInt2 = securityParameters.getServerSupportedGroups();
      keyShareEntry1 = TlsUtils.selectKeyShare(tlsCrypto, protocolVersion1, vector, arrayOfInt1, arrayOfInt2);
      if (null == keyShareEntry1) {
        this.retryGroup = TlsUtils.selectKeyShareGroup(tlsCrypto, protocolVersion1, arrayOfInt1, arrayOfInt2);
        if (this.retryGroup < 0)
          throw new TlsFatalAlert((short)40); 
        this.retryCookie = this.tlsServerContext.getNonceGenerator().generateNonce(16);
        return generate13HelloRetryRequest(paramClientHello);
      } 
      if (keyShareEntry1.getNamedGroup() != arrayOfInt2[0]);
    } 
    Hashtable<Object, Object> hashtable = new Hashtable<>();
    Hashtable hashtable2 = TlsExtensionsUtils.ensureExtensionsInitialised(this.tlsServer.getServerExtensions());
    this.tlsServer.getServerExtensionsForConnection(hashtable2);
    ProtocolVersion protocolVersion2 = ProtocolVersion.TLSv12;
    TlsExtensionsUtils.addSupportedVersionsExtensionServer(hashtable, protocolVersion1);
    securityParameters.extendedMasterSecret = true;
    securityParameters.applicationProtocol = TlsExtensionsUtils.getALPNExtensionServer(hashtable2);
    securityParameters.applicationProtocolSet = true;
    if (!hashtable2.isEmpty()) {
      securityParameters.maxFragmentLength = TlsUtils.processMaxFragmentLengthExtension(securityParameters.isResumedSession() ? null : hashtable1, hashtable2, (short)80);
      if (!securityParameters.isResumedSession()) {
        securityParameters.clientCertificateType = TlsUtils.processClientCertificateTypeExtension13(hashtable1, hashtable2, (short)80);
        securityParameters.serverCertificateType = TlsUtils.processServerCertificateTypeExtension13(hashtable1, hashtable2, (short)80);
      } 
    } 
    securityParameters.encryptThenMAC = false;
    securityParameters.truncatedHMac = false;
    securityParameters.statusRequestVersion = hashtable1.containsKey(TlsExtensionsUtils.EXT_status_request) ? 1 : 0;
    this.expectSessionTicket = false;
    TlsSecret tlsSecret1 = null;
    if (null != selectedConfig) {
      tlsSecret1 = selectedConfig.earlySecret;
      this.selectedPSK13 = true;
      TlsExtensionsUtils.addPreSharedKeyServerHello(hashtable, selectedConfig.index);
    } 
    int i = keyShareEntry1.getNamedGroup();
    if (NamedGroup.refersToAnECDHCurve(i)) {
      tlsAgreement = tlsCrypto.createECDomain(new TlsECConfig(i)).createECDH();
    } else if (NamedGroup.refersToASpecificFiniteField(i)) {
      tlsAgreement = tlsCrypto.createDHDomain(new TlsDHConfig(i, true)).createDH();
    } else if (NamedGroup.refersToASpecificKem(i)) {
      tlsAgreement = tlsCrypto.createKemDomain(new TlsKemConfig(i, true)).createKem();
    } else {
      throw new TlsFatalAlert((short)80);
    } 
    tlsAgreement.receivePeerValue(keyShareEntry1.getKeyExchange());
    byte[] arrayOfByte2 = tlsAgreement.generateEphemeral();
    KeyShareEntry keyShareEntry2 = new KeyShareEntry(i, arrayOfByte2);
    TlsExtensionsUtils.addKeyShareServerHello(hashtable, keyShareEntry2);
    TlsSecret tlsSecret2 = tlsAgreement.calculateSecret();
    TlsUtils.establish13PhaseSecrets((TlsContext)this.tlsServerContext, tlsSecret1, tlsSecret2);
    this.serverExtensions = hashtable2;
    applyMaxFragmentLengthExtension(securityParameters.getMaxFragmentLength());
    TlsUtils.checkExtensionData13(hashtable, 2, (short)80);
    return new ServerHello(protocolVersion2, securityParameters.getServerRandom(), arrayOfByte1, securityParameters.getCipherSuite(), hashtable);
  }
  
  protected ServerHello generateServerHello(ClientHello paramClientHello, HandshakeMessageInput paramHandshakeMessageInput) throws IOException {
    ProtocolVersion protocolVersion3;
    ProtocolVersion protocolVersion1 = paramClientHello.getVersion();
    if (!protocolVersion1.isTLS())
      throw new TlsFatalAlert((short)47); 
    this.offeredCipherSuites = paramClientHello.getCipherSuites();
    SecurityParameters securityParameters = this.tlsServerContext.getSecurityParametersHandshake();
    this.tlsServerContext.setClientSupportedVersions(TlsExtensionsUtils.getSupportedVersionsExtensionClient(paramClientHello.getExtensions()));
    ProtocolVersion protocolVersion2 = protocolVersion1;
    if (null == this.tlsServerContext.getClientSupportedVersions()) {
      if (protocolVersion2.isLaterVersionOf(ProtocolVersion.TLSv12))
        protocolVersion2 = ProtocolVersion.TLSv12; 
      this.tlsServerContext.setClientSupportedVersions(protocolVersion2.downTo(ProtocolVersion.SSLv3));
    } else {
      protocolVersion2 = ProtocolVersion.getLatestTLS(this.tlsServerContext.getClientSupportedVersions());
    } 
    this.recordStream.setWriteVersion(protocolVersion2);
    if (!ProtocolVersion.SERVER_EARLIEST_SUPPORTED_TLS.isEqualOrEarlierVersionOf(protocolVersion2))
      throw new TlsFatalAlert((short)70); 
    if (securityParameters.isRenegotiating()) {
      if (!protocolVersion2.equals(this.tlsServerContext.getClientVersion()) && !protocolVersion2.equals(this.tlsServerContext.getServerVersion()))
        throw new TlsFatalAlert((short)47); 
    } else {
      this.tlsServerContext.setClientVersion(protocolVersion2);
    } 
    this.tlsServer.notifyClientVersion(this.tlsServerContext.getClientVersion());
    securityParameters.clientRandom = paramClientHello.getRandom();
    this.tlsServer.notifyFallback(Arrays.contains(this.offeredCipherSuites, 22016));
    this.tlsServer.notifyOfferedCipherSuites(this.offeredCipherSuites);
    if (securityParameters.isRenegotiating()) {
      protocolVersion3 = this.tlsServerContext.getServerVersion();
    } else {
      protocolVersion3 = this.tlsServer.getServerVersion();
      if (!ProtocolVersion.contains(this.tlsServerContext.getClientSupportedVersions(), protocolVersion3))
        throw new TlsFatalAlert((short)80); 
      securityParameters.negotiatedVersion = protocolVersion3;
    } 
    securityParameters.clientSupportedGroups = TlsExtensionsUtils.getSupportedGroupsExtension(paramClientHello.getExtensions());
    securityParameters.serverSupportedGroups = this.tlsServer.getSupportedGroups();
    if (ProtocolVersion.TLSv13.isEqualOrEarlierVersionOf(protocolVersion3)) {
      this.recordStream.setIgnoreChangeCipherSpec(true);
      this.recordStream.setWriteVersion(ProtocolVersion.TLSv12);
      return generate13ServerHello(paramClientHello, paramHandshakeMessageInput, false);
    } 
    this.recordStream.setWriteVersion(protocolVersion3);
    boolean bool1 = this.tlsServer.shouldUseGMTUnixTime();
    securityParameters.serverRandom = createRandomBlock(bool1, (TlsContext)this.tlsServerContext);
    if (!protocolVersion3.equals(ProtocolVersion.getLatestTLS(this.tlsServer.getProtocolVersions())))
      TlsUtils.writeDowngradeMarker(protocolVersion3, securityParameters.getServerRandom()); 
    this.clientExtensions = paramClientHello.getExtensions();
    byte[] arrayOfByte = TlsUtils.getExtensionData(this.clientExtensions, EXT_RenegotiationInfo);
    if (securityParameters.isRenegotiating()) {
      if (!securityParameters.isSecureRenegotiation())
        throw new TlsFatalAlert((short)80); 
      if (Arrays.contains(this.offeredCipherSuites, 255))
        throw new TlsFatalAlert((short)40); 
      if (null == arrayOfByte)
        throw new TlsFatalAlert((short)40); 
      SecurityParameters securityParameters1 = this.tlsServerContext.getSecurityParametersConnection();
      byte[] arrayOfByte1 = securityParameters1.getPeerVerifyData();
      if (!Arrays.constantTimeAreEqual(arrayOfByte, createRenegotiationInfo(arrayOfByte1)))
        throw new TlsFatalAlert((short)40); 
    } else {
      if (Arrays.contains(this.offeredCipherSuites, 255))
        securityParameters.secureRenegotiation = true; 
      if (arrayOfByte != null) {
        securityParameters.secureRenegotiation = true;
        if (!Arrays.constantTimeAreEqual(arrayOfByte, createRenegotiationInfo(TlsUtils.EMPTY_BYTES)))
          throw new TlsFatalAlert((short)40); 
      } 
    } 
    this.tlsServer.notifySecureRenegotiation(securityParameters.isSecureRenegotiation());
    if (this.clientExtensions != null) {
      TlsExtensionsUtils.getPaddingExtension(this.clientExtensions);
      securityParameters.clientServerNames = TlsExtensionsUtils.getServerNameExtensionClient(this.clientExtensions);
      if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(protocolVersion2))
        TlsUtils.establishClientSigAlgs(securityParameters, this.clientExtensions); 
      securityParameters.clientSupportedGroups = TlsExtensionsUtils.getSupportedGroupsExtension(this.clientExtensions);
      this.tlsServer.processClientExtensions(this.clientExtensions);
    } 
    TlsSession tlsSession = this.tlsServer.getSessionToResume(paramClientHello.getSessionID());
    boolean bool2 = establishSession(tlsSession);
    if (bool2 && !protocolVersion3.equals(this.sessionParameters.getNegotiatedVersion()))
      bool2 = false; 
    boolean bool3 = false;
    if (TlsUtils.isExtendedMasterSecretOptional(protocolVersion3) && this.tlsServer.shouldUseExtendedMasterSecret())
      if (TlsExtensionsUtils.hasExtendedMasterSecretExtension(this.clientExtensions)) {
        bool3 = true;
      } else {
        if (this.tlsServer.requiresExtendedMasterSecret())
          throw new TlsFatalAlert((short)40, "Extended Master Secret extension is required"); 
        if (bool2) {
          if (this.sessionParameters.isExtendedMasterSecret())
            throw new TlsFatalAlert((short)40, "Extended Master Secret extension is required for EMS session resumption"); 
          if (!this.tlsServer.allowLegacyResumption())
            throw new TlsFatalAlert((short)40, "Extended Master Secret extension is required for legacy session resumption"); 
        } 
      }  
    if (bool2 && bool3 != this.sessionParameters.isExtendedMasterSecret())
      bool2 = false; 
    securityParameters.extendedMasterSecret = bool3;
    if (!bool2) {
      cancelSession();
      byte[] arrayOfByte1 = this.tlsServer.getNewSessionID();
      if (null == arrayOfByte1)
        arrayOfByte1 = TlsUtils.EMPTY_BYTES; 
      this.tlsSession = TlsUtils.importSession(arrayOfByte1, null);
    } 
    securityParameters.resumedSession = bool2;
    securityParameters.sessionID = this.tlsSession.getSessionID();
    this.tlsServer.notifySession(this.tlsSession);
    TlsUtils.negotiatedVersionTLSServer((TlsServerContext)this.tlsServerContext);
    int i = bool2 ? this.sessionParameters.getCipherSuite() : this.tlsServer.getSelectedCipherSuite();
    if (!TlsUtils.isValidCipherSuiteSelection(this.offeredCipherSuites, i) || !TlsUtils.isValidVersionForCipherSuite(i, protocolVersion3))
      throw new TlsFatalAlert((short)80); 
    TlsUtils.negotiatedCipherSuite(securityParameters, i);
    this.tlsServerContext.setRSAPreMasterSecretVersion(protocolVersion1);
    Hashtable hashtable = bool2 ? this.sessionParameters.readServerExtensions() : this.tlsServer.getServerExtensions();
    this.serverExtensions = TlsExtensionsUtils.ensureExtensionsInitialised(hashtable);
    this.tlsServer.getServerExtensionsForConnection(this.serverExtensions);
    if (securityParameters.isRenegotiating()) {
      if (!securityParameters.isSecureRenegotiation())
        throw new TlsFatalAlert((short)80); 
      SecurityParameters securityParameters1 = this.tlsServerContext.getSecurityParametersConnection();
      byte[] arrayOfByte1 = TlsUtils.concat(securityParameters1.getPeerVerifyData(), securityParameters1.getLocalVerifyData());
      this.serverExtensions.put(EXT_RenegotiationInfo, createRenegotiationInfo(arrayOfByte1));
    } else if (securityParameters.isSecureRenegotiation()) {
      byte[] arrayOfByte1 = TlsUtils.getExtensionData(this.serverExtensions, EXT_RenegotiationInfo);
      boolean bool = (null == arrayOfByte1) ? true : false;
      if (bool)
        this.serverExtensions.put(EXT_RenegotiationInfo, createRenegotiationInfo(TlsUtils.EMPTY_BYTES)); 
    } 
    if (securityParameters.isExtendedMasterSecret()) {
      TlsExtensionsUtils.addExtendedMasterSecretExtension(this.serverExtensions);
    } else {
      this.serverExtensions.remove(TlsExtensionsUtils.EXT_extended_master_secret);
    } 
    securityParameters.applicationProtocol = TlsExtensionsUtils.getALPNExtensionServer(this.serverExtensions);
    securityParameters.applicationProtocolSet = true;
    if (!this.serverExtensions.isEmpty()) {
      securityParameters.encryptThenMAC = TlsExtensionsUtils.hasEncryptThenMACExtension(this.serverExtensions);
      securityParameters.maxFragmentLength = TlsUtils.processMaxFragmentLengthExtension(bool2 ? null : this.clientExtensions, this.serverExtensions, (short)80);
      securityParameters.truncatedHMac = TlsExtensionsUtils.hasTruncatedHMacExtension(this.serverExtensions);
      if (!bool2) {
        if (TlsUtils.hasExpectedEmptyExtensionData(this.serverExtensions, TlsExtensionsUtils.EXT_status_request_v2, (short)80)) {
          securityParameters.statusRequestVersion = 2;
        } else if (TlsUtils.hasExpectedEmptyExtensionData(this.serverExtensions, TlsExtensionsUtils.EXT_status_request, (short)80)) {
          securityParameters.statusRequestVersion = 1;
        } 
        securityParameters.clientCertificateType = TlsUtils.processClientCertificateTypeExtension(this.clientExtensions, this.serverExtensions, (short)80);
        securityParameters.serverCertificateType = TlsUtils.processServerCertificateTypeExtension(this.clientExtensions, this.serverExtensions, (short)80);
        this.expectSessionTicket = TlsUtils.hasExpectedEmptyExtensionData(this.serverExtensions, TlsProtocol.EXT_SessionTicket, (short)80);
      } 
    } 
    applyMaxFragmentLengthExtension(securityParameters.getMaxFragmentLength());
    return new ServerHello(protocolVersion3, securityParameters.getServerRandom(), securityParameters.getSessionID(), securityParameters.getCipherSuite(), this.serverExtensions);
  }
  
  protected TlsContext getContext() {
    return (TlsContext)this.tlsServerContext;
  }
  
  AbstractTlsContext getContextAdmin() {
    return (AbstractTlsContext)this.tlsServerContext;
  }
  
  protected TlsPeer getPeer() {
    return (TlsPeer)this.tlsServer;
  }
  
  protected void handle13HandshakeMessage(short paramShort, HandshakeMessageInput paramHandshakeMessageInput) throws IOException {
    ClientHello clientHello;
    ServerHello serverHello;
    if (!isTLSv13ConnectionState())
      throw new TlsFatalAlert((short)80); 
    switch (paramShort) {
      case 11:
        switch (this.connection_state) {
          case 20:
            receive13ClientCertificate((ByteArrayInputStream)paramHandshakeMessageInput);
            this.connection_state = 15;
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 15:
        switch (this.connection_state) {
          case 15:
            receive13ClientCertificateVerify((ByteArrayInputStream)paramHandshakeMessageInput);
            paramHandshakeMessageInput.updateHash((TlsHash)this.handshakeHash);
            this.connection_state = 17;
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 1:
        switch (this.connection_state) {
          case 0:
            throw new TlsFatalAlert((short)80);
          case 2:
            clientHello = receiveClientHelloMessage((ByteArrayInputStream)paramHandshakeMessageInput);
            this.connection_state = 3;
            serverHello = generate13ServerHello(clientHello, paramHandshakeMessageInput, true);
            sendServerHelloMessage(serverHello);
            this.connection_state = 4;
            send13ServerHelloCoda(serverHello, true);
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 20:
        switch (this.connection_state) {
          case 20:
            skip13ClientCertificate();
          case 15:
            skip13ClientCertificateVerify();
          case 17:
            receive13ClientFinished((ByteArrayInputStream)paramHandshakeMessageInput);
            this.connection_state = 18;
            this.recordStream.setIgnoreChangeCipherSpec(false);
            this.recordStream.enablePendingCipherRead(false);
            completeHandshake();
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 24:
        receive13KeyUpdate((ByteArrayInputStream)paramHandshakeMessageInput);
        return;
    } 
    throw new TlsFatalAlert((short)10);
  }
  
  protected void handleHandshakeMessage(short paramShort, HandshakeMessageInput paramHandshakeMessageInput) throws IOException {
    ClientHello clientHello;
    ServerHello serverHello;
    SecurityParameters securityParameters = this.tlsServerContext.getSecurityParameters();
    if (this.connection_state > 1 && TlsUtils.isTLSv13(securityParameters.getNegotiatedVersion())) {
      if (securityParameters.isResumedSession())
        throw new TlsFatalAlert((short)80); 
      handle13HandshakeMessage(paramShort, paramHandshakeMessageInput);
      return;
    } 
    if (!isLegacyConnectionState())
      throw new TlsFatalAlert((short)80); 
    if (securityParameters.isResumedSession() && paramShort != 1) {
      if (paramShort != 20 || this.connection_state != 20)
        throw new TlsFatalAlert((short)10); 
      processFinishedMessage((ByteArrayInputStream)paramHandshakeMessageInput);
      this.connection_state = 18;
      completeHandshake();
      return;
    } 
    switch (paramShort) {
      case 1:
        if (isApplicationDataReady()) {
          if (!handleRenegotiation())
            return; 
          this.connection_state = 0;
        } 
        switch (this.connection_state) {
          case 21:
            throw new TlsFatalAlert((short)80);
          case 0:
            clientHello = receiveClientHelloMessage((ByteArrayInputStream)paramHandshakeMessageInput);
            this.connection_state = 1;
            serverHello = generateServerHello(clientHello, paramHandshakeMessageInput);
            this.handshakeHash.notifyPRFDetermined();
            if (TlsUtils.isTLSv13(securityParameters.getNegotiatedVersion())) {
              this.handshakeHash.sealHashAlgorithms();
              if (serverHello.isHelloRetryRequest()) {
                TlsUtils.adjustTranscriptForRetry(this.handshakeHash);
                sendServerHelloMessage(serverHello);
                this.connection_state = 2;
                sendChangeCipherSpecMessage();
              } else {
                sendServerHelloMessage(serverHello);
                this.connection_state = 4;
                sendChangeCipherSpecMessage();
                send13ServerHelloCoda(serverHello, false);
              } 
            } else {
              paramHandshakeMessageInput.updateHash((TlsHash)this.handshakeHash);
              sendServerHelloMessage(serverHello);
              this.connection_state = 4;
              if (securityParameters.isResumedSession()) {
                securityParameters.masterSecret = this.sessionMasterSecret;
                this.recordStream.setPendingCipher(TlsUtils.initCipher((TlsContext)this.tlsServerContext));
                sendChangeCipherSpec();
                sendFinishedMessage();
                this.connection_state = 20;
              } else {
                Vector vector = this.tlsServer.getServerSupplementalData();
                if (vector != null) {
                  sendSupplementalDataMessage(vector);
                  this.connection_state = 6;
                } 
                this.keyExchange = TlsUtils.initKeyExchangeServer((TlsServerContext)this.tlsServerContext, this.tlsServer);
                TlsCredentials tlsCredentials = null;
                if (!KeyExchangeAlgorithm.isAnonymous(securityParameters.getKeyExchangeAlgorithm()))
                  tlsCredentials = TlsUtils.establishServerCredentials(this.tlsServer); 
                Certificate certificate = null;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (null == tlsCredentials) {
                  this.keyExchange.skipServerCredentials();
                } else {
                  this.keyExchange.processServerCredentials(tlsCredentials);
                  certificate = tlsCredentials.getCertificate();
                  sendCertificateMessage(certificate, byteArrayOutputStream);
                  this.connection_state = 7;
                } 
                securityParameters.tlsServerEndPoint = byteArrayOutputStream.toByteArray();
                if (null == certificate || certificate.isEmpty())
                  securityParameters.statusRequestVersion = 0; 
                if (securityParameters.getStatusRequestVersion() > 0) {
                  CertificateStatus certificateStatus = this.tlsServer.getCertificateStatus();
                  if (certificateStatus != null) {
                    sendCertificateStatusMessage(certificateStatus);
                    this.connection_state = 8;
                  } 
                } 
                byte[] arrayOfByte = this.keyExchange.generateServerKeyExchange();
                if (arrayOfByte != null) {
                  sendServerKeyExchangeMessage(arrayOfByte);
                  this.connection_state = 10;
                } 
                if (null != tlsCredentials) {
                  this.certificateRequest = this.tlsServer.getCertificateRequest();
                  if (null == this.certificateRequest) {
                    if (!this.keyExchange.requiresCertificateVerify())
                      throw new TlsFatalAlert((short)80); 
                  } else {
                    if (TlsUtils.isTLSv12((TlsContext)this.tlsServerContext) != ((this.certificateRequest.getSupportedSignatureAlgorithms() != null)))
                      throw new TlsFatalAlert((short)80); 
                    this.certificateRequest = TlsUtils.validateCertificateRequest(this.certificateRequest, this.keyExchange);
                    TlsUtils.establishServerSigAlgs(securityParameters, this.certificateRequest);
                    if (ProtocolVersion.TLSv12.equals(securityParameters.getNegotiatedVersion())) {
                      TlsUtils.trackHashAlgorithms(this.handshakeHash, securityParameters.getServerSigAlgs());
                      if (this.tlsServerContext.getCrypto().hasAnyStreamVerifiers(securityParameters.getServerSigAlgs()))
                        this.handshakeHash.forceBuffering(); 
                    } else if (this.tlsServerContext.getCrypto().hasAnyStreamVerifiersLegacy(this.certificateRequest.getCertificateTypes())) {
                      this.handshakeHash.forceBuffering();
                    } 
                  } 
                } 
                this.handshakeHash.sealHashAlgorithms();
                if (null != this.certificateRequest) {
                  sendCertificateRequestMessage(this.certificateRequest);
                  this.connection_state = 11;
                } 
                sendServerHelloDoneMessage();
                this.connection_state = 12;
              } 
            } 
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 23:
        switch (this.connection_state) {
          case 12:
            this.tlsServer.processClientSupplementalData(readSupplementalDataMessage((ByteArrayInputStream)paramHandshakeMessageInput));
            this.connection_state = 14;
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 11:
        switch (this.connection_state) {
          case 12:
            this.tlsServer.processClientSupplementalData(null);
          case 14:
            receiveCertificateMessage((ByteArrayInputStream)paramHandshakeMessageInput);
            this.connection_state = 15;
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 16:
        switch (this.connection_state) {
          case 12:
            this.tlsServer.processClientSupplementalData(null);
          case 14:
            if (null == this.certificateRequest) {
              this.keyExchange.skipClientCredentials();
            } else {
              if (TlsUtils.isTLSv12((TlsContext)this.tlsServerContext))
                throw new TlsFatalAlert((short)10); 
              if (TlsUtils.isSSL((TlsContext)this.tlsServerContext))
                throw new TlsFatalAlert((short)10); 
              notifyClientCertificate(Certificate.EMPTY_CHAIN);
            } 
          case 15:
            receiveClientKeyExchangeMessage((ByteArrayInputStream)paramHandshakeMessageInput);
            this.connection_state = 16;
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 15:
        switch (this.connection_state) {
          case 16:
            if (!expectCertificateVerifyMessage())
              throw new TlsFatalAlert((short)10); 
            receiveCertificateVerifyMessage((ByteArrayInputStream)paramHandshakeMessageInput);
            paramHandshakeMessageInput.updateHash((TlsHash)this.handshakeHash);
            this.connection_state = 17;
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 20:
        switch (this.connection_state) {
          case 16:
            if (expectCertificateVerifyMessage())
              throw new TlsFatalAlert((short)10); 
          case 17:
            processFinishedMessage((ByteArrayInputStream)paramHandshakeMessageInput);
            paramHandshakeMessageInput.updateHash((TlsHash)this.handshakeHash);
            this.connection_state = 18;
            if (this.expectSessionTicket) {
              sendNewSessionTicketMessage(this.tlsServer.getNewSessionTicket());
              this.connection_state = 19;
            } 
            sendChangeCipherSpec();
            sendFinishedMessage();
            this.connection_state = 20;
            completeHandshake();
            return;
        } 
        throw new TlsFatalAlert((short)10);
    } 
    throw new TlsFatalAlert((short)10);
  }
  
  protected void handleAlertWarningMessage(short paramShort) throws IOException {
    if (41 == paramShort && null != this.certificateRequest && TlsUtils.isSSL((TlsContext)this.tlsServerContext))
      switch (this.connection_state) {
        case 12:
          this.tlsServer.processClientSupplementalData(null);
        case 14:
          notifyClientCertificate(Certificate.EMPTY_CHAIN);
          this.connection_state = 15;
          return;
      }  
    super.handleAlertWarningMessage(paramShort);
  }
  
  protected void notifyClientCertificate(Certificate paramCertificate) throws IOException {
    if (null == this.certificateRequest)
      throw new TlsFatalAlert((short)80); 
    TlsUtils.processClientCertificate((TlsServerContext)this.tlsServerContext, paramCertificate, this.keyExchange, this.tlsServer);
  }
  
  protected void receive13ClientCertificate(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    if (null == this.certificateRequest)
      throw new TlsFatalAlert((short)10); 
    Certificate.ParseOptions parseOptions = (new Certificate.ParseOptions()).setCertificateType(this.tlsServerContext.getSecurityParametersHandshake().getClientCertificateType()).setMaxChainLength(this.tlsServer.getMaxCertificateChainLength());
    Certificate certificate = Certificate.parse(parseOptions, (TlsContext)this.tlsServerContext, paramByteArrayInputStream, null);
    assertEmpty(paramByteArrayInputStream);
    notifyClientCertificate(certificate);
  }
  
  protected void receive13ClientCertificateVerify(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    Certificate certificate = this.tlsServerContext.getSecurityParametersHandshake().getPeerCertificate();
    if (null == certificate || certificate.isEmpty())
      throw new TlsFatalAlert((short)80); 
    CertificateVerify certificateVerify = CertificateVerify.parse((TlsContext)this.tlsServerContext, paramByteArrayInputStream);
    assertEmpty(paramByteArrayInputStream);
    TlsUtils.verify13CertificateVerifyClient((TlsServerContext)this.tlsServerContext, this.handshakeHash, certificateVerify);
  }
  
  protected void receive13ClientFinished(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    process13FinishedMessage(paramByteArrayInputStream);
  }
  
  protected void receiveCertificateMessage(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    if (null == this.certificateRequest)
      throw new TlsFatalAlert((short)10); 
    Certificate.ParseOptions parseOptions = (new Certificate.ParseOptions()).setCertificateType(this.tlsServerContext.getSecurityParametersHandshake().getClientCertificateType()).setMaxChainLength(this.tlsServer.getMaxCertificateChainLength());
    Certificate certificate = Certificate.parse(parseOptions, (TlsContext)this.tlsServerContext, paramByteArrayInputStream, null);
    assertEmpty(paramByteArrayInputStream);
    notifyClientCertificate(certificate);
  }
  
  protected void receiveCertificateVerifyMessage(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    DigitallySigned digitallySigned = DigitallySigned.parse((TlsContext)this.tlsServerContext, paramByteArrayInputStream);
    assertEmpty(paramByteArrayInputStream);
    TlsUtils.verifyCertificateVerifyClient((TlsServerContext)this.tlsServerContext, this.certificateRequest, digitallySigned, this.handshakeHash);
    this.handshakeHash.stopTracking();
  }
  
  protected ClientHello receiveClientHelloMessage(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    return ClientHello.parse(paramByteArrayInputStream, null);
  }
  
  protected void receiveClientKeyExchangeMessage(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    this.keyExchange.processClientKeyExchange(paramByteArrayInputStream);
    assertEmpty(paramByteArrayInputStream);
    boolean bool = TlsUtils.isSSL((TlsContext)this.tlsServerContext);
    if (bool)
      establishMasterSecret((TlsContext)this.tlsServerContext, this.keyExchange); 
    (this.tlsServerContext.getSecurityParametersHandshake()).sessionHash = TlsUtils.getCurrentPRFHash(this.handshakeHash);
    if (!bool)
      establishMasterSecret((TlsContext)this.tlsServerContext, this.keyExchange); 
    this.recordStream.setPendingCipher(TlsUtils.initCipher((TlsContext)this.tlsServerContext));
    if (!expectCertificateVerifyMessage())
      this.handshakeHash.stopTracking(); 
  }
  
  protected void send13EncryptedExtensionsMessage(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = writeExtensionsData(paramHashtable);
    HandshakeMessageOutput handshakeMessageOutput = new HandshakeMessageOutput((short)8);
    TlsUtils.writeOpaque16(arrayOfByte, (OutputStream)handshakeMessageOutput);
    handshakeMessageOutput.send(this);
  }
  
  protected void send13ServerHelloCoda(ServerHello paramServerHello, boolean paramBoolean) throws IOException {
    SecurityParameters securityParameters = this.tlsServerContext.getSecurityParametersHandshake();
    byte[] arrayOfByte1 = TlsUtils.getCurrentPRFHash(this.handshakeHash);
    TlsUtils.establish13PhaseHandshake((TlsContext)this.tlsServerContext, arrayOfByte1, this.recordStream);
    this.recordStream.enablePendingCipherWrite();
    this.recordStream.enablePendingCipherRead(true);
    send13EncryptedExtensionsMessage(this.serverExtensions);
    this.connection_state = 5;
    if (!this.selectedPSK13) {
      this.certificateRequest = this.tlsServer.getCertificateRequest();
      if (null != this.certificateRequest) {
        if (!this.certificateRequest.hasCertificateRequestContext(TlsUtils.EMPTY_BYTES))
          throw new TlsFatalAlert((short)80); 
        TlsUtils.establishServerSigAlgs(securityParameters, this.certificateRequest);
        sendCertificateRequestMessage(this.certificateRequest);
        this.connection_state = 11;
      } 
      TlsCredentialedSigner tlsCredentialedSigner = TlsUtils.establish13ServerCredentials(this.tlsServer);
      if (null == tlsCredentialedSigner)
        throw new TlsFatalAlert((short)80); 
      Certificate certificate = tlsCredentialedSigner.getCertificate();
      send13CertificateMessage(certificate);
      securityParameters.tlsServerEndPoint = null;
      this.connection_state = 7;
      DigitallySigned digitallySigned = TlsUtils.generate13CertificateVerify((TlsContext)this.tlsServerContext, tlsCredentialedSigner, this.handshakeHash);
      send13CertificateVerifyMessage(digitallySigned);
      this.connection_state = 17;
    } 
    send13FinishedMessage();
    this.connection_state = 20;
    byte[] arrayOfByte2 = TlsUtils.getCurrentPRFHash(this.handshakeHash);
    TlsUtils.establish13PhaseApplication((TlsContext)this.tlsServerContext, arrayOfByte2, this.recordStream);
    this.recordStream.enablePendingCipherWrite();
  }
  
  protected void sendCertificateRequestMessage(CertificateRequest paramCertificateRequest) throws IOException {
    HandshakeMessageOutput handshakeMessageOutput = new HandshakeMessageOutput((short)13);
    paramCertificateRequest.encode((TlsContext)this.tlsServerContext, (OutputStream)handshakeMessageOutput);
    handshakeMessageOutput.send(this);
  }
  
  protected void sendCertificateStatusMessage(CertificateStatus paramCertificateStatus) throws IOException {
    HandshakeMessageOutput handshakeMessageOutput = new HandshakeMessageOutput((short)22);
    paramCertificateStatus.encode((OutputStream)handshakeMessageOutput);
    handshakeMessageOutput.send(this);
  }
  
  protected void sendHelloRequestMessage() throws IOException {
    HandshakeMessageOutput.send(this, (short)0, TlsUtils.EMPTY_BYTES);
  }
  
  protected void sendNewSessionTicketMessage(NewSessionTicket paramNewSessionTicket) throws IOException {
    if (paramNewSessionTicket == null)
      throw new TlsFatalAlert((short)80); 
    HandshakeMessageOutput handshakeMessageOutput = new HandshakeMessageOutput((short)4);
    paramNewSessionTicket.encode((OutputStream)handshakeMessageOutput);
    handshakeMessageOutput.send(this);
  }
  
  protected void sendServerHelloDoneMessage() throws IOException {
    HandshakeMessageOutput.send(this, (short)14, TlsUtils.EMPTY_BYTES);
  }
  
  protected void sendServerHelloMessage(ServerHello paramServerHello) throws IOException {
    HandshakeMessageOutput handshakeMessageOutput = new HandshakeMessageOutput((short)2);
    paramServerHello.encode((TlsContext)this.tlsServerContext, (OutputStream)handshakeMessageOutput);
    handshakeMessageOutput.send(this);
  }
  
  protected void sendServerKeyExchangeMessage(byte[] paramArrayOfbyte) throws IOException {
    HandshakeMessageOutput.send(this, (short)12, paramArrayOfbyte);
  }
  
  protected void skip13ClientCertificate() throws IOException {
    if (null != this.certificateRequest)
      throw new TlsFatalAlert((short)10); 
  }
  
  protected void skip13ClientCertificateVerify() throws IOException {
    if (expectCertificateVerifyMessage())
      throw new TlsFatalAlert((short)10); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsServerProtocol.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */