package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.TlsStreamSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

public class TlsClientProtocol extends TlsProtocol {
  protected TlsClient tlsClient = null;
  
  TlsClientContextImpl tlsClientContext = null;
  
  protected Hashtable clientAgreements = null;
  
  OfferedPsks.BindersConfig clientBinders = null;
  
  protected ClientHello clientHello = null;
  
  protected TlsKeyExchange keyExchange = null;
  
  protected TlsAuthentication authentication = null;
  
  protected CertificateStatus certificateStatus = null;
  
  protected CertificateRequest certificateRequest = null;
  
  public TlsClientProtocol() {}
  
  public TlsClientProtocol(InputStream paramInputStream, OutputStream paramOutputStream) {
    super(paramInputStream, paramOutputStream);
  }
  
  public void connect(TlsClient paramTlsClient) throws IOException {
    if (paramTlsClient == null)
      throw new IllegalArgumentException("'tlsClient' cannot be null"); 
    if (this.tlsClient != null)
      throw new IllegalStateException("'connect' can only be called once"); 
    this.tlsClient = paramTlsClient;
    this.tlsClientContext = new TlsClientContextImpl(paramTlsClient.getCrypto());
    paramTlsClient.init(this.tlsClientContext);
    paramTlsClient.notifyCloseHandle(this);
    beginHandshake(false);
    if (this.blocking)
      blockForHandshake(); 
  }
  
  protected void beginHandshake(boolean paramBoolean) throws IOException {
    super.beginHandshake(paramBoolean);
    sendClientHello();
    this.connection_state = 1;
  }
  
  protected void cleanupHandshake() {
    super.cleanupHandshake();
    this.clientAgreements = null;
    this.clientBinders = null;
    this.clientHello = null;
    this.keyExchange = null;
    this.authentication = null;
    this.certificateStatus = null;
    this.certificateRequest = null;
  }
  
  protected TlsContext getContext() {
    return this.tlsClientContext;
  }
  
  AbstractTlsContext getContextAdmin() {
    return this.tlsClientContext;
  }
  
  protected TlsPeer getPeer() {
    return this.tlsClient;
  }
  
  protected void handle13HandshakeMessage(short paramShort, HandshakeMessageInput paramHandshakeMessageInput) throws IOException {
    byte[] arrayOfByte;
    ServerHello serverHello;
    if (!isTLSv13ConnectionState())
      throw new TlsFatalAlert((short)80); 
    switch (paramShort) {
      case 11:
        switch (this.connection_state) {
          case 5:
            skip13CertificateRequest();
          case 11:
            receive13ServerCertificate(paramHandshakeMessageInput);
            this.connection_state = 7;
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 13:
        switch (this.connection_state) {
          case 21:
            throw new TlsFatalAlert((short)10);
          case 5:
            receive13CertificateRequest(paramHandshakeMessageInput, false);
            this.connection_state = 11;
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 15:
        switch (this.connection_state) {
          case 7:
            receive13ServerCertificateVerify(paramHandshakeMessageInput);
            paramHandshakeMessageInput.updateHash(this.handshakeHash);
            this.connection_state = 9;
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 8:
        switch (this.connection_state) {
          case 4:
            receive13EncryptedExtensions(paramHandshakeMessageInput);
            this.connection_state = 5;
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 20:
        switch (this.connection_state) {
          case 5:
            skip13CertificateRequest();
          case 11:
            skip13ServerCertificate();
          case 9:
            receive13ServerFinished(paramHandshakeMessageInput);
            paramHandshakeMessageInput.updateHash(this.handshakeHash);
            this.connection_state = 20;
            arrayOfByte = TlsUtils.getCurrentPRFHash(this.handshakeHash);
            this.recordStream.setIgnoreChangeCipherSpec(false);
            if (null != this.certificateRequest) {
              TlsCredentialedSigner tlsCredentialedSigner = TlsUtils.establish13ClientCredentials(this.authentication, this.certificateRequest);
              Certificate certificate = null;
              if (null != tlsCredentialedSigner)
                certificate = tlsCredentialedSigner.getCertificate(); 
              if (null == certificate)
                certificate = Certificate.EMPTY_CHAIN_TLS13; 
              send13CertificateMessage(certificate);
              this.connection_state = 15;
              if (null != tlsCredentialedSigner) {
                DigitallySigned digitallySigned = TlsUtils.generate13CertificateVerify(this.tlsClientContext, tlsCredentialedSigner, this.handshakeHash);
                send13CertificateVerifyMessage(digitallySigned);
                this.connection_state = 17;
              } 
            } 
            send13FinishedMessage();
            this.connection_state = 18;
            TlsUtils.establish13PhaseApplication(this.tlsClientContext, arrayOfByte, this.recordStream);
            this.recordStream.enablePendingCipherWrite();
            this.recordStream.enablePendingCipherRead(false);
            completeHandshake();
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 24:
        receive13KeyUpdate(paramHandshakeMessageInput);
        return;
      case 4:
        receive13NewSessionTicket(paramHandshakeMessageInput);
        return;
      case 2:
        switch (this.connection_state) {
          case 1:
            throw new TlsFatalAlert((short)80);
          case 3:
            serverHello = receiveServerHelloMessage(paramHandshakeMessageInput);
            if (serverHello.isHelloRetryRequest())
              throw new TlsFatalAlert((short)10); 
            process13ServerHello(serverHello, true);
            paramHandshakeMessageInput.updateHash(this.handshakeHash);
            this.connection_state = 4;
            process13ServerHelloCoda(serverHello, true);
            return;
        } 
        throw new TlsFatalAlert((short)10);
    } 
    throw new TlsFatalAlert((short)10);
  }
  
  protected void handleHandshakeMessage(short paramShort, HandshakeMessageInput paramHandshakeMessageInput) throws IOException {
    ServerHello serverHello;
    TlsCredentials tlsCredentials;
    TlsCredentialedSigner tlsCredentialedSigner;
    Certificate certificate;
    SignatureAndHashAlgorithm signatureAndHashAlgorithm;
    TlsStreamSigner tlsStreamSigner;
    Vector vector;
    boolean bool;
    SecurityParameters securityParameters = this.tlsClientContext.getSecurityParameters();
    if (this.connection_state > 1 && TlsUtils.isTLSv13(securityParameters.getNegotiatedVersion())) {
      if (securityParameters.isResumedSession())
        throw new TlsFatalAlert((short)80); 
      handle13HandshakeMessage(paramShort, paramHandshakeMessageInput);
      return;
    } 
    if (!isLegacyConnectionState())
      throw new TlsFatalAlert((short)80); 
    if (securityParameters.isResumedSession() && paramShort != 0) {
      if (paramShort != 20 || this.connection_state != 4)
        throw new TlsFatalAlert((short)10); 
      processFinishedMessage(paramHandshakeMessageInput);
      paramHandshakeMessageInput.updateHash(this.handshakeHash);
      this.connection_state = 20;
      sendChangeCipherSpec();
      sendFinishedMessage();
      this.connection_state = 18;
      completeHandshake();
      return;
    } 
    switch (paramShort) {
      case 11:
        switch (this.connection_state) {
          case 4:
            handleSupplementalData((Vector)null);
          case 6:
            this.authentication = TlsUtils.receiveServerCertificate(this.tlsClientContext, this.tlsClient, paramHandshakeMessageInput, this.serverExtensions);
            break;
          default:
            throw new TlsFatalAlert((short)10);
        } 
        this.connection_state = 7;
        return;
      case 22:
        switch (this.connection_state) {
          case 7:
            if (securityParameters.getStatusRequestVersion() < 1)
              throw new TlsFatalAlert((short)10); 
            this.certificateStatus = CertificateStatus.parse(this.tlsClientContext, paramHandshakeMessageInput);
            assertEmpty(paramHandshakeMessageInput);
            this.connection_state = 8;
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 20:
        switch (this.connection_state) {
          case 18:
            if (this.expectSessionTicket)
              throw new TlsFatalAlert((short)10); 
          case 19:
            processFinishedMessage(paramHandshakeMessageInput);
            this.connection_state = 20;
            completeHandshake();
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 2:
        switch (this.connection_state) {
          case 1:
            serverHello = receiveServerHelloMessage(paramHandshakeMessageInput);
            if (serverHello.isHelloRetryRequest()) {
              process13HelloRetryRequest(serverHello);
              this.handshakeHash.notifyPRFDetermined();
              this.handshakeHash.sealHashAlgorithms();
              TlsUtils.adjustTranscriptForRetry(this.handshakeHash);
              paramHandshakeMessageInput.updateHash(this.handshakeHash);
              this.connection_state = 2;
              send13ClientHelloRetry();
              this.connection_state = 3;
            } else {
              processServerHello(serverHello);
              this.handshakeHash.notifyPRFDetermined();
              if (TlsUtils.isTLSv13(securityParameters.getNegotiatedVersion()))
                this.handshakeHash.sealHashAlgorithms(); 
              paramHandshakeMessageInput.updateHash(this.handshakeHash);
              this.connection_state = 4;
              if (TlsUtils.isTLSv13(securityParameters.getNegotiatedVersion()))
                process13ServerHelloCoda(serverHello, false); 
            } 
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 23:
        switch (this.connection_state) {
          case 4:
            handleSupplementalData(readSupplementalDataMessage(paramHandshakeMessageInput));
            return;
        } 
        throw new TlsFatalAlert((short)10);
      case 14:
        switch (this.connection_state) {
          case 4:
            handleSupplementalData((Vector)null);
          case 6:
            this.authentication = null;
          case 7:
          case 8:
            handleServerCertificate();
            this.keyExchange.skipServerKeyExchange();
          case 10:
          case 11:
            assertEmpty(paramHandshakeMessageInput);
            this.connection_state = 12;
            serverHello = null;
            tlsCredentialedSigner = null;
            certificate = null;
            signatureAndHashAlgorithm = null;
            tlsStreamSigner = null;
            if (this.certificateRequest != null) {
              tlsCredentials = TlsUtils.establishClientCredentials(this.authentication, this.certificateRequest);
              if (tlsCredentials != null) {
                certificate = tlsCredentials.getCertificate();
                if (tlsCredentials instanceof TlsCredentialedSigner) {
                  tlsCredentialedSigner = (TlsCredentialedSigner)tlsCredentials;
                  signatureAndHashAlgorithm = TlsUtils.getSignatureAndHashAlgorithm(securityParameters.getNegotiatedVersion(), tlsCredentialedSigner);
                  tlsStreamSigner = tlsCredentialedSigner.getStreamSigner();
                  if (ProtocolVersion.TLSv12.equals(securityParameters.getNegotiatedVersion())) {
                    TlsUtils.verifySupportedSignatureAlgorithm(securityParameters.getServerSigAlgs(), signatureAndHashAlgorithm, (short)80);
                    if (tlsStreamSigner == null)
                      TlsUtils.trackHashAlgorithmClient(this.handshakeHash, signatureAndHashAlgorithm); 
                  } 
                  if (tlsStreamSigner != null)
                    this.handshakeHash.forceBuffering(); 
                } 
              } 
            } 
            this.handshakeHash.sealHashAlgorithms();
            if (tlsCredentials == null) {
              this.keyExchange.skipClientCredentials();
            } else {
              this.keyExchange.processClientCredentials(tlsCredentials);
            } 
            vector = this.tlsClient.getClientSupplementalData();
            if (vector != null) {
              sendSupplementalDataMessage(vector);
              this.connection_state = 14;
            } 
            if (this.certificateRequest != null) {
              sendCertificateMessage(certificate, null);
              this.connection_state = 15;
            } 
            sendClientKeyExchange();
            this.connection_state = 16;
            bool = TlsUtils.isSSL(this.tlsClientContext);
            if (bool)
              establishMasterSecret(this.tlsClientContext, this.keyExchange); 
            securityParameters.sessionHash = TlsUtils.getCurrentPRFHash(this.handshakeHash);
            if (!bool)
              establishMasterSecret(this.tlsClientContext, this.keyExchange); 
            this.recordStream.setPendingCipher(TlsUtils.initCipher(this.tlsClientContext));
            if (tlsCredentialedSigner != null) {
              DigitallySigned digitallySigned = TlsUtils.generateCertificateVerifyClient(this.tlsClientContext, tlsCredentialedSigner, signatureAndHashAlgorithm, tlsStreamSigner, this.handshakeHash);
              sendCertificateVerifyMessage(digitallySigned);
              this.connection_state = 17;
            } 
            this.handshakeHash.stopTracking();
            sendChangeCipherSpec();
            sendFinishedMessage();
            break;
          default:
            throw new TlsFatalAlert((short)10);
        } 
        this.connection_state = 18;
        return;
      case 12:
        switch (this.connection_state) {
          case 4:
            handleSupplementalData((Vector)null);
          case 6:
            this.authentication = null;
          case 7:
          case 8:
            handleServerCertificate();
            this.keyExchange.processServerKeyExchange(paramHandshakeMessageInput);
            assertEmpty(paramHandshakeMessageInput);
            break;
          default:
            throw new TlsFatalAlert((short)10);
        } 
        this.connection_state = 10;
        return;
      case 13:
        switch (this.connection_state) {
          case 7:
          case 8:
            handleServerCertificate();
            this.keyExchange.skipServerKeyExchange();
          case 10:
            receiveCertificateRequest(paramHandshakeMessageInput);
            TlsUtils.establishServerSigAlgs(securityParameters, this.certificateRequest);
            break;
          default:
            throw new TlsFatalAlert((short)10);
        } 
        this.connection_state = 11;
        return;
      case 4:
        switch (this.connection_state) {
          case 18:
            if (!this.expectSessionTicket)
              throw new TlsFatalAlert((short)10); 
            securityParameters.sessionID = TlsUtils.EMPTY_BYTES;
            invalidateSession();
            this.tlsSession = TlsUtils.importSession(securityParameters.getSessionID(), null);
            receiveNewSessionTicket(paramHandshakeMessageInput);
            break;
          default:
            throw new TlsFatalAlert((short)10);
        } 
        this.connection_state = 19;
        return;
      case 0:
        assertEmpty(paramHandshakeMessageInput);
        if (isApplicationDataReady())
          handleRenegotiation(); 
        return;
    } 
    throw new TlsFatalAlert((short)10);
  }
  
  protected void handleServerCertificate() throws IOException {
    TlsUtils.processServerCertificate(this.tlsClientContext, this.certificateStatus, this.keyExchange, this.authentication, this.clientExtensions, this.serverExtensions);
  }
  
  protected void handleSupplementalData(Vector paramVector) throws IOException {
    this.tlsClient.processServerSupplementalData(paramVector);
    this.connection_state = 6;
    this.keyExchange = TlsUtils.initKeyExchangeClient(this.tlsClientContext, this.tlsClient);
  }
  
  protected void process13HelloRetryRequest(ServerHello paramServerHello) throws IOException {
    ProtocolVersion protocolVersion1 = ProtocolVersion.TLSv12;
    this.recordStream.setWriteVersion(protocolVersion1);
    SecurityParameters securityParameters = this.tlsClientContext.getSecurityParametersHandshake();
    if (securityParameters.isRenegotiating())
      throw new TlsFatalAlert((short)80); 
    ProtocolVersion protocolVersion2 = paramServerHello.getVersion();
    byte[] arrayOfByte1 = paramServerHello.getSessionID();
    int i = paramServerHello.getCipherSuite();
    if (!ProtocolVersion.TLSv12.equals(protocolVersion2) || !Arrays.areEqual(this.clientHello.getSessionID(), arrayOfByte1) || !TlsUtils.isValidCipherSuiteSelection(this.clientHello.getCipherSuites(), i))
      throw new TlsFatalAlert((short)47); 
    Hashtable hashtable = paramServerHello.getExtensions();
    if (null == hashtable)
      throw new TlsFatalAlert((short)47); 
    TlsUtils.checkExtensionData13(hashtable, 6, (short)47);
    Enumeration<Integer> enumeration = hashtable.keys();
    while (enumeration.hasMoreElements()) {
      Integer integer = enumeration.nextElement();
      if (44 != integer.intValue() && null == TlsUtils.getExtensionData(this.clientExtensions, integer))
        throw new TlsFatalAlert((short)110); 
    } 
    ProtocolVersion protocolVersion3 = TlsExtensionsUtils.getSupportedVersionsExtensionServer(hashtable);
    if (null == protocolVersion3)
      throw new TlsFatalAlert((short)109); 
    if (!ProtocolVersion.TLSv13.isEqualOrEarlierVersionOf(protocolVersion3) || !ProtocolVersion.contains(this.tlsClientContext.getClientSupportedVersions(), protocolVersion3) || !TlsUtils.isValidVersionForCipherSuite(i, protocolVersion3))
      throw new TlsFatalAlert((short)47); 
    if (null != this.clientBinders && !Arrays.contains(this.clientBinders.pskKeyExchangeModes, (short)1)) {
      this.clientBinders = null;
      this.tlsClient.notifySelectedPSK((TlsPSK)null);
    } 
    int j = TlsExtensionsUtils.getKeyShareHelloRetryRequest(hashtable);
    if (!TlsUtils.isValidKeyShareSelection(protocolVersion3, securityParameters.getClientSupportedGroups(), this.clientAgreements, j))
      throw new TlsFatalAlert((short)47); 
    byte[] arrayOfByte2 = TlsExtensionsUtils.getCookieExtension(hashtable);
    securityParameters.negotiatedVersion = protocolVersion3;
    TlsUtils.negotiatedVersionTLSClient(this.tlsClientContext, this.tlsClient);
    securityParameters.resumedSession = false;
    securityParameters.sessionID = TlsUtils.EMPTY_BYTES;
    this.tlsClient.notifySessionID(TlsUtils.EMPTY_BYTES);
    TlsUtils.negotiatedCipherSuite(securityParameters, i);
    this.tlsClient.notifySelectedCipherSuite(i);
    this.clientAgreements = null;
    this.retryCookie = arrayOfByte2;
    this.retryGroup = j;
  }
  
  protected void process13ServerHello(ServerHello paramServerHello, boolean paramBoolean) throws IOException {
    SecurityParameters securityParameters = this.tlsClientContext.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = paramServerHello.getVersion();
    byte[] arrayOfByte = paramServerHello.getSessionID();
    int i = paramServerHello.getCipherSuite();
    if (!ProtocolVersion.TLSv12.equals(protocolVersion) || !Arrays.areEqual(this.clientHello.getSessionID(), arrayOfByte))
      throw new TlsFatalAlert((short)47); 
    Hashtable hashtable = paramServerHello.getExtensions();
    if (null == hashtable)
      throw new TlsFatalAlert((short)47); 
    TlsUtils.checkExtensionData13(hashtable, 2, (short)47);
    if (paramBoolean) {
      ProtocolVersion protocolVersion1 = TlsExtensionsUtils.getSupportedVersionsExtensionServer(hashtable);
      if (null == protocolVersion1)
        throw new TlsFatalAlert((short)109); 
      if (!securityParameters.getNegotiatedVersion().equals(protocolVersion1) || securityParameters.getCipherSuite() != i)
        throw new TlsFatalAlert((short)47); 
    } else {
      if (!TlsUtils.isValidCipherSuiteSelection(this.clientHello.getCipherSuites(), i) || !TlsUtils.isValidVersionForCipherSuite(i, securityParameters.getNegotiatedVersion()))
        throw new TlsFatalAlert((short)47); 
      securityParameters.resumedSession = false;
      securityParameters.sessionID = TlsUtils.EMPTY_BYTES;
      this.tlsClient.notifySessionID(TlsUtils.EMPTY_BYTES);
      TlsUtils.negotiatedCipherSuite(securityParameters, i);
      this.tlsClient.notifySelectedCipherSuite(i);
    } 
    this.clientHello = null;
    securityParameters.serverRandom = paramServerHello.getRandom();
    securityParameters.secureRenegotiation = false;
    securityParameters.extendedMasterSecret = true;
    securityParameters.statusRequestVersion = this.clientExtensions.containsKey(TlsExtensionsUtils.EXT_status_request) ? 1 : 0;
    TlsSecret tlsSecret1 = null;
    int j = TlsExtensionsUtils.getPreSharedKeyServerHello(hashtable);
    TlsPSK tlsPSK = null;
    if (j >= 0) {
      if (null == this.clientBinders || j >= this.clientBinders.psks.length)
        throw new TlsFatalAlert((short)47); 
      tlsPSK = this.clientBinders.psks[j];
      if (tlsPSK.getPRFAlgorithm() != securityParameters.getPRFAlgorithm())
        throw new TlsFatalAlert((short)47); 
      tlsSecret1 = this.clientBinders.earlySecrets[j];
      this.selectedPSK13 = true;
    } 
    this.tlsClient.notifySelectedPSK(tlsPSK);
    TlsSecret tlsSecret2 = null;
    KeyShareEntry keyShareEntry = TlsExtensionsUtils.getKeyShareServerHello(hashtable);
    if (null == keyShareEntry) {
      if (paramBoolean || null == tlsSecret1 || !Arrays.contains(this.clientBinders.pskKeyExchangeModes, (short)0))
        throw new TlsFatalAlert((short)47); 
    } else {
      if (null != tlsSecret1 && !Arrays.contains(this.clientBinders.pskKeyExchangeModes, (short)1))
        throw new TlsFatalAlert((short)47); 
      int k = keyShareEntry.getNamedGroup();
      TlsAgreement tlsAgreement = (TlsAgreement)this.clientAgreements.get(Integers.valueOf(k));
      if (null == tlsAgreement)
        throw new TlsFatalAlert((short)47); 
      tlsAgreement.receivePeerValue(keyShareEntry.getKeyExchange());
      tlsSecret2 = tlsAgreement.calculateSecret();
    } 
    this.clientAgreements = null;
    this.clientBinders = null;
    TlsUtils.establish13PhaseSecrets(this.tlsClientContext, tlsSecret1, tlsSecret2);
    invalidateSession();
    this.tlsSession = TlsUtils.importSession(securityParameters.getSessionID(), null);
  }
  
  protected void process13ServerHelloCoda(ServerHello paramServerHello, boolean paramBoolean) throws IOException {
    byte[] arrayOfByte = TlsUtils.getCurrentPRFHash(this.handshakeHash);
    TlsUtils.establish13PhaseHandshake(this.tlsClientContext, arrayOfByte, this.recordStream);
    if (!paramBoolean) {
      this.recordStream.setIgnoreChangeCipherSpec(true);
      sendChangeCipherSpecMessage();
    } 
    this.recordStream.enablePendingCipherWrite();
    this.recordStream.enablePendingCipherRead(false);
  }
  
  protected void processServerHello(ServerHello paramServerHello) throws IOException {
    ProtocolVersion protocolVersion3;
    Hashtable hashtable1 = paramServerHello.getExtensions();
    ProtocolVersion protocolVersion1 = paramServerHello.getVersion();
    ProtocolVersion protocolVersion2 = TlsExtensionsUtils.getSupportedVersionsExtensionServer(hashtable1);
    if (null == protocolVersion2) {
      protocolVersion3 = protocolVersion1;
    } else {
      if (!ProtocolVersion.TLSv12.equals(protocolVersion1) || !ProtocolVersion.TLSv13.isEqualOrEarlierVersionOf(protocolVersion2))
        throw new TlsFatalAlert((short)47); 
      protocolVersion3 = protocolVersion2;
    } 
    SecurityParameters securityParameters = this.tlsClientContext.getSecurityParametersHandshake();
    if (securityParameters.isRenegotiating()) {
      if (!protocolVersion3.equals(securityParameters.getNegotiatedVersion()))
        throw new TlsFatalAlert((short)47); 
    } else {
      if (!ProtocolVersion.contains(this.tlsClientContext.getClientSupportedVersions(), protocolVersion3))
        throw new TlsFatalAlert((short)70); 
      ProtocolVersion protocolVersion = protocolVersion3.isLaterVersionOf(ProtocolVersion.TLSv12) ? ProtocolVersion.TLSv12 : protocolVersion3;
      this.recordStream.setWriteVersion(protocolVersion);
      securityParameters.negotiatedVersion = protocolVersion3;
    } 
    TlsUtils.negotiatedVersionTLSClient(this.tlsClientContext, this.tlsClient);
    if (ProtocolVersion.TLSv13.isEqualOrEarlierVersionOf(protocolVersion3)) {
      process13ServerHello(paramServerHello, false);
      return;
    } 
    int[] arrayOfInt = this.clientHello.getCipherSuites();
    this.clientHello = null;
    this.retryCookie = null;
    this.retryGroup = -1;
    securityParameters.serverRandom = paramServerHello.getRandom();
    if (!this.tlsClientContext.getClientVersion().equals(protocolVersion3))
      TlsUtils.checkDowngradeMarker(protocolVersion3, securityParameters.getServerRandom()); 
    byte[] arrayOfByte2 = paramServerHello.getSessionID();
    securityParameters.sessionID = arrayOfByte2;
    this.tlsClient.notifySessionID(arrayOfByte2);
    securityParameters.resumedSession = (arrayOfByte2.length > 0 && this.tlsSession != null && Arrays.areEqual(arrayOfByte2, this.tlsSession.getSessionID()));
    if (securityParameters.isResumedSession() && (paramServerHello.getCipherSuite() != this.sessionParameters.getCipherSuite() || !securityParameters.getNegotiatedVersion().equals(this.sessionParameters.getNegotiatedVersion())))
      throw new TlsFatalAlert((short)47, "ServerHello parameters do not match resumed session"); 
    int i = paramServerHello.getCipherSuite();
    if (!TlsUtils.isValidCipherSuiteSelection(arrayOfInt, i) || !TlsUtils.isValidVersionForCipherSuite(i, securityParameters.getNegotiatedVersion()))
      throw new TlsFatalAlert((short)47, "ServerHello selected invalid cipher suite"); 
    TlsUtils.negotiatedCipherSuite(securityParameters, i);
    this.tlsClient.notifySelectedCipherSuite(i);
    this.serverExtensions = hashtable1;
    if (hashtable1 != null) {
      Enumeration<Integer> enumeration = hashtable1.keys();
      while (enumeration.hasMoreElements()) {
        Integer integer = enumeration.nextElement();
        if (integer.equals(EXT_RenegotiationInfo))
          continue; 
        if (null == TlsUtils.getExtensionData(this.clientExtensions, integer))
          throw new TlsFatalAlert((short)110); 
        if (securityParameters.isResumedSession());
      } 
    } 
    byte[] arrayOfByte1 = TlsUtils.getExtensionData(hashtable1, EXT_RenegotiationInfo);
    if (securityParameters.isRenegotiating()) {
      if (!securityParameters.isSecureRenegotiation())
        throw new TlsFatalAlert((short)80); 
      if (arrayOfByte1 == null)
        throw new TlsFatalAlert((short)40); 
      SecurityParameters securityParameters1 = this.tlsClientContext.getSecurityParametersConnection();
      byte[] arrayOfByte = TlsUtils.concat(securityParameters1.getLocalVerifyData(), securityParameters1.getPeerVerifyData());
      if (!Arrays.constantTimeAreEqual(arrayOfByte1, createRenegotiationInfo(arrayOfByte)))
        throw new TlsFatalAlert((short)40); 
    } else if (arrayOfByte1 == null) {
      securityParameters.secureRenegotiation = false;
    } else {
      securityParameters.secureRenegotiation = true;
      if (!Arrays.constantTimeAreEqual(arrayOfByte1, createRenegotiationInfo(TlsUtils.EMPTY_BYTES)))
        throw new TlsFatalAlert((short)40); 
    } 
    this.tlsClient.notifySecureRenegotiation(securityParameters.isSecureRenegotiation());
    boolean bool = false;
    if (TlsExtensionsUtils.hasExtendedMasterSecretExtension(this.clientExtensions)) {
      bool = TlsExtensionsUtils.hasExtendedMasterSecretExtension(hashtable1);
      if (TlsUtils.isExtendedMasterSecretOptional(protocolVersion3)) {
        if (!bool && this.tlsClient.requiresExtendedMasterSecret())
          throw new TlsFatalAlert((short)40, "Extended Master Secret extension is required"); 
      } else if (bool) {
        throw new TlsFatalAlert((short)47, "Server sent an unexpected extended_master_secret extension negotiating " + protocolVersion3);
      } 
    } 
    securityParameters.extendedMasterSecret = bool;
    if (securityParameters.isResumedSession() && securityParameters.isExtendedMasterSecret() != this.sessionParameters.isExtendedMasterSecret())
      throw new TlsFatalAlert((short)40, "Server resumed session with mismatched extended_master_secret negotiation"); 
    securityParameters.applicationProtocol = TlsExtensionsUtils.getALPNExtensionServer(hashtable1);
    securityParameters.applicationProtocolSet = true;
    Hashtable hashtable2 = this.clientExtensions;
    Hashtable hashtable3 = hashtable1;
    if (securityParameters.isResumedSession()) {
      hashtable2 = null;
      hashtable3 = this.sessionParameters.readServerExtensions();
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
        this.expectSessionTicket = TlsUtils.hasExpectedEmptyExtensionData(hashtable3, TlsProtocol.EXT_SessionTicket, (short)47);
      } 
    } 
    if (hashtable2 != null)
      this.tlsClient.processServerExtensions(hashtable3); 
    applyMaxFragmentLengthExtension(securityParameters.getMaxFragmentLength());
    if (securityParameters.isResumedSession()) {
      securityParameters.masterSecret = this.sessionMasterSecret;
      this.recordStream.setPendingCipher(TlsUtils.initCipher(this.tlsClientContext));
    } else {
      invalidateSession();
      this.tlsSession = TlsUtils.importSession(securityParameters.getSessionID(), null);
    } 
  }
  
  protected void receive13CertificateRequest(ByteArrayInputStream paramByteArrayInputStream, boolean paramBoolean) throws IOException {
    if (paramBoolean)
      throw new TlsFatalAlert((short)80); 
    if (this.selectedPSK13)
      throw new TlsFatalAlert((short)10); 
    CertificateRequest certificateRequest = CertificateRequest.parse(this.tlsClientContext, paramByteArrayInputStream);
    assertEmpty(paramByteArrayInputStream);
    if (!certificateRequest.hasCertificateRequestContext(TlsUtils.EMPTY_BYTES))
      throw new TlsFatalAlert((short)47); 
    this.certificateRequest = certificateRequest;
    TlsUtils.establishServerSigAlgs(this.tlsClientContext.getSecurityParametersHandshake(), certificateRequest);
  }
  
  protected void receive13EncryptedExtensions(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramByteArrayInputStream);
    assertEmpty(paramByteArrayInputStream);
    this.serverExtensions = readExtensionsData13(8, arrayOfByte);
    Enumeration<Integer> enumeration = this.serverExtensions.keys();
    while (enumeration.hasMoreElements()) {
      Integer integer = enumeration.nextElement();
      if (null == TlsUtils.getExtensionData(this.clientExtensions, integer))
        throw new TlsFatalAlert((short)110); 
    } 
    SecurityParameters securityParameters = this.tlsClientContext.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
    securityParameters.applicationProtocol = TlsExtensionsUtils.getALPNExtensionServer(this.serverExtensions);
    securityParameters.applicationProtocolSet = true;
    Hashtable hashtable1 = this.clientExtensions;
    Hashtable hashtable2 = this.serverExtensions;
    if (securityParameters.isResumedSession()) {
      hashtable1 = null;
      hashtable2 = this.sessionParameters.readServerExtensions();
    } 
    securityParameters.maxFragmentLength = TlsUtils.processMaxFragmentLengthExtension(hashtable1, hashtable2, (short)47);
    securityParameters.encryptThenMAC = false;
    securityParameters.truncatedHMac = false;
    if (!securityParameters.isResumedSession()) {
      securityParameters.statusRequestVersion = this.clientExtensions.containsKey(TlsExtensionsUtils.EXT_status_request) ? 1 : 0;
      securityParameters.clientCertificateType = TlsUtils.processClientCertificateTypeExtension13(hashtable1, hashtable2, (short)47);
      securityParameters.serverCertificateType = TlsUtils.processServerCertificateTypeExtension13(hashtable1, hashtable2, (short)47);
    } 
    this.expectSessionTicket = false;
    if (null != hashtable1)
      this.tlsClient.processServerExtensions(this.serverExtensions); 
    applyMaxFragmentLengthExtension(securityParameters.getMaxFragmentLength());
  }
  
  protected void receive13NewSessionTicket(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    if (!isApplicationDataReady())
      throw new TlsFatalAlert((short)10); 
    TlsUtils.readUint32(paramByteArrayInputStream);
    TlsUtils.readUint32(paramByteArrayInputStream);
    TlsUtils.readOpaque8(paramByteArrayInputStream);
    TlsUtils.readOpaque16(paramByteArrayInputStream);
    TlsUtils.readOpaque16(paramByteArrayInputStream);
    assertEmpty(paramByteArrayInputStream);
  }
  
  protected void receive13ServerCertificate(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    if (this.selectedPSK13)
      throw new TlsFatalAlert((short)10); 
    this.authentication = TlsUtils.receive13ServerCertificate(this.tlsClientContext, this.tlsClient, paramByteArrayInputStream, this.serverExtensions);
    handleServerCertificate();
  }
  
  protected void receive13ServerCertificateVerify(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    Certificate certificate = this.tlsClientContext.getSecurityParametersHandshake().getPeerCertificate();
    if (null == certificate || certificate.isEmpty())
      throw new TlsFatalAlert((short)80); 
    CertificateVerify certificateVerify = CertificateVerify.parse(this.tlsClientContext, paramByteArrayInputStream);
    assertEmpty(paramByteArrayInputStream);
    TlsUtils.verify13CertificateVerifyServer(this.tlsClientContext, this.handshakeHash, certificateVerify);
  }
  
  protected void receive13ServerFinished(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    process13FinishedMessage(paramByteArrayInputStream);
  }
  
  protected void receiveCertificateRequest(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    if (null == this.authentication)
      throw new TlsFatalAlert((short)40); 
    CertificateRequest certificateRequest = CertificateRequest.parse(this.tlsClientContext, paramByteArrayInputStream);
    assertEmpty(paramByteArrayInputStream);
    this.certificateRequest = TlsUtils.validateCertificateRequest(certificateRequest, this.keyExchange);
  }
  
  protected void receiveNewSessionTicket(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    NewSessionTicket newSessionTicket = NewSessionTicket.parse(paramByteArrayInputStream);
    assertEmpty(paramByteArrayInputStream);
    this.tlsClient.notifyNewSessionTicket(newSessionTicket);
  }
  
  protected ServerHello receiveServerHelloMessage(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    return ServerHello.parse(paramByteArrayInputStream);
  }
  
  protected void send13ClientHelloRetry() throws IOException {
    Hashtable hashtable = this.clientHello.getExtensions();
    hashtable.remove(TlsExtensionsUtils.EXT_cookie);
    hashtable.remove(TlsExtensionsUtils.EXT_early_data);
    hashtable.remove(TlsExtensionsUtils.EXT_key_share);
    hashtable.remove(TlsExtensionsUtils.EXT_pre_shared_key);
    if (null != this.retryCookie) {
      TlsExtensionsUtils.addCookieExtension(hashtable, this.retryCookie);
      this.retryCookie = null;
    } 
    if (null != this.clientBinders) {
      this.clientBinders = TlsUtils.addPreSharedKeyToClientHelloRetry(this.tlsClientContext, this.clientBinders, hashtable);
      if (null == this.clientBinders)
        this.tlsClient.notifySelectedPSK((TlsPSK)null); 
    } 
    if (this.retryGroup < 0)
      throw new TlsFatalAlert((short)80); 
    this.clientAgreements = TlsUtils.addKeyShareToClientHelloRetry(this.tlsClientContext, hashtable, this.retryGroup);
    this.recordStream.setIgnoreChangeCipherSpec(true);
    sendChangeCipherSpecMessage();
    sendClientHelloMessage();
  }
  
  protected void sendCertificateVerifyMessage(DigitallySigned paramDigitallySigned) throws IOException {
    HandshakeMessageOutput handshakeMessageOutput = new HandshakeMessageOutput((short)15);
    paramDigitallySigned.encode(handshakeMessageOutput);
    handshakeMessageOutput.send(this);
  }
  
  protected void sendClientHello() throws IOException {
    ProtocolVersion[] arrayOfProtocolVersion;
    ProtocolVersion protocolVersion1;
    ProtocolVersion protocolVersion2;
    SecurityParameters securityParameters = this.tlsClientContext.getSecurityParametersHandshake();
    if (securityParameters.isRenegotiating()) {
      ProtocolVersion protocolVersion = this.tlsClientContext.getClientVersion();
      arrayOfProtocolVersion = protocolVersion.only();
      protocolVersion1 = protocolVersion;
      protocolVersion2 = protocolVersion;
    } else {
      arrayOfProtocolVersion = this.tlsClient.getProtocolVersions();
      if (ProtocolVersion.contains(arrayOfProtocolVersion, ProtocolVersion.SSLv3)) {
        this.recordStream.setWriteVersion(ProtocolVersion.SSLv3);
      } else {
        this.recordStream.setWriteVersion(ProtocolVersion.TLSv10);
      } 
      protocolVersion1 = ProtocolVersion.getEarliestTLS(arrayOfProtocolVersion);
      protocolVersion2 = ProtocolVersion.getLatestTLS(arrayOfProtocolVersion);
      if (!ProtocolVersion.isSupportedTLSVersionClient(protocolVersion2))
        throw new TlsFatalAlert((short)80); 
      this.tlsClientContext.setClientVersion(protocolVersion2);
    } 
    this.tlsClientContext.setClientSupportedVersions(arrayOfProtocolVersion);
    boolean bool1 = ProtocolVersion.TLSv12.isEqualOrLaterVersionOf(protocolVersion1);
    boolean bool2 = ProtocolVersion.TLSv13.isEqualOrEarlierVersionOf(protocolVersion2);
    boolean bool3 = (!bool2 && this.tlsClient.shouldUseGMTUnixTime()) ? true : false;
    securityParameters.clientRandom = createRandomBlock(bool3, this.tlsClientContext);
    TlsSession tlsSession = bool1 ? this.tlsClient.getSessionToResume() : null;
    boolean bool4 = this.tlsClient.isFallback();
    int[] arrayOfInt = this.tlsClient.getCipherSuites();
    this.clientExtensions = TlsExtensionsUtils.ensureExtensionsInitialised(this.tlsClient.getClientExtensions());
    boolean bool5 = this.tlsClient.shouldUseExtendedMasterSecret();
    establishSession(tlsSession);
    byte[] arrayOfByte = TlsUtils.getSessionID(this.tlsSession);
    if (arrayOfByte.length > 0 && !Arrays.contains(arrayOfInt, this.sessionParameters.getCipherSuite()))
      arrayOfByte = TlsUtils.EMPTY_BYTES; 
    ProtocolVersion protocolVersion3 = null;
    if (arrayOfByte.length > 0) {
      protocolVersion3 = this.sessionParameters.getNegotiatedVersion();
      if (!ProtocolVersion.contains(arrayOfProtocolVersion, protocolVersion3))
        arrayOfByte = TlsUtils.EMPTY_BYTES; 
    } 
    if (arrayOfByte.length > 0 && TlsUtils.isExtendedMasterSecretOptional(protocolVersion3))
      if (bool5) {
        if (!this.sessionParameters.isExtendedMasterSecret() && !this.tlsClient.allowLegacyResumption())
          arrayOfByte = TlsUtils.EMPTY_BYTES; 
      } else if (this.sessionParameters.isExtendedMasterSecret()) {
        arrayOfByte = TlsUtils.EMPTY_BYTES;
      }  
    if (arrayOfByte.length < 1)
      cancelSession(); 
    this.tlsClient.notifySessionToResume(this.tlsSession);
    ProtocolVersion protocolVersion4 = protocolVersion2;
    if (bool2) {
      protocolVersion4 = ProtocolVersion.TLSv12;
      TlsExtensionsUtils.addSupportedVersionsExtensionClient(this.clientExtensions, arrayOfProtocolVersion);
      if (arrayOfByte.length < 1 && this.tlsClient.shouldUseCompatibilityMode())
        arrayOfByte = this.tlsClientContext.getNonceGenerator().generateNonce(32); 
    } 
    this.tlsClientContext.setRSAPreMasterSecretVersion(protocolVersion4);
    securityParameters.clientServerNames = TlsExtensionsUtils.getServerNameExtensionClient(this.clientExtensions);
    if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(protocolVersion2))
      TlsUtils.establishClientSigAlgs(securityParameters, this.clientExtensions); 
    securityParameters.clientSupportedGroups = TlsExtensionsUtils.getSupportedGroupsExtension(this.clientExtensions);
    this.clientBinders = TlsUtils.addPreSharedKeyToClientHello(this.tlsClientContext, this.tlsClient, this.clientExtensions, arrayOfInt);
    this.clientAgreements = TlsUtils.addKeyShareToClientHello(this.tlsClientContext, this.tlsClient, this.clientExtensions);
    if (bool5 && TlsUtils.isExtendedMasterSecretOptional(arrayOfProtocolVersion)) {
      TlsExtensionsUtils.addExtendedMasterSecretExtension(this.clientExtensions);
    } else {
      this.clientExtensions.remove(TlsExtensionsUtils.EXT_extended_master_secret);
    } 
    if (securityParameters.isRenegotiating()) {
      if (!securityParameters.isSecureRenegotiation())
        throw new TlsFatalAlert((short)80); 
      SecurityParameters securityParameters1 = this.tlsClientContext.getSecurityParametersConnection();
      this.clientExtensions.put(EXT_RenegotiationInfo, createRenegotiationInfo(securityParameters1.getLocalVerifyData()));
    } else {
      boolean bool7 = (null == TlsUtils.getExtensionData(this.clientExtensions, EXT_RenegotiationInfo)) ? true : false;
      boolean bool8 = !Arrays.contains(arrayOfInt, 255) ? true : false;
      if (bool7 && bool8)
        arrayOfInt = Arrays.append(arrayOfInt, 255); 
    } 
    if (bool4 && !Arrays.contains(arrayOfInt, 22016))
      arrayOfInt = Arrays.append(arrayOfInt, 22016); 
    boolean bool6 = (null == this.clientBinders) ? false : this.clientBinders.bindersSize;
    this.clientHello = new ClientHello(protocolVersion4, securityParameters.getClientRandom(), arrayOfByte, null, arrayOfInt, this.clientExtensions, bool6);
    sendClientHelloMessage();
  }
  
  protected void sendClientHelloMessage() throws IOException {
    HandshakeMessageOutput handshakeMessageOutput = new HandshakeMessageOutput((short)1);
    this.clientHello.encode(this.tlsClientContext, handshakeMessageOutput);
    handshakeMessageOutput.prepareClientHello(this.handshakeHash, this.clientHello.getBindersSize());
    if (null != this.clientBinders)
      OfferedPsks.encodeBinders(handshakeMessageOutput, this.tlsClientContext.getCrypto(), this.handshakeHash, this.clientBinders); 
    handshakeMessageOutput.sendClientHello(this, this.handshakeHash, this.clientHello.getBindersSize());
  }
  
  protected void sendClientKeyExchange() throws IOException {
    HandshakeMessageOutput handshakeMessageOutput = new HandshakeMessageOutput((short)16);
    this.keyExchange.generateClientKeyExchange(handshakeMessageOutput);
    handshakeMessageOutput.send(this);
  }
  
  protected void skip13CertificateRequest() throws IOException {
    this.certificateRequest = null;
  }
  
  protected void skip13ServerCertificate() throws IOException {
    if (!this.selectedPSK13)
      throw new TlsFatalAlert((short)10); 
    this.authentication = TlsUtils.skip13ServerCertificate(this.tlsClientContext);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsClientProtocol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */