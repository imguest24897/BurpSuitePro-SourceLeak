package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.security.Principal;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.jsse.BCSNIHostName;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.jsse.BCX509Key;
import org.bouncycastle.jsse.provider.ContextData;
import org.bouncycastle.jsse.provider.JsseSecurityParameters;
import org.bouncycastle.jsse.provider.JsseSessionParameters;
import org.bouncycastle.jsse.provider.JsseUtils;
import org.bouncycastle.jsse.provider.NamedGroupInfo;
import org.bouncycastle.jsse.provider.PropertyUtils;
import org.bouncycastle.jsse.provider.ProvDHGroupVerifier;
import org.bouncycastle.jsse.provider.ProvSSLConnection;
import org.bouncycastle.jsse.provider.ProvSSLParameters;
import org.bouncycastle.jsse.provider.ProvSSLSession;
import org.bouncycastle.jsse.provider.ProvSSLSessionContext;
import org.bouncycastle.jsse.provider.ProvTlsManager;
import org.bouncycastle.jsse.provider.ProvTlsPeer;
import org.bouncycastle.jsse.provider.SignatureSchemeInfo;
import org.bouncycastle.tls.CertificateStatusRequest;
import org.bouncycastle.tls.CertificateStatusRequestItemV2;
import org.bouncycastle.tls.DefaultTlsClient;
import org.bouncycastle.tls.OCSPStatusRequest;
import org.bouncycastle.tls.ProtocolName;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.ServerName;
import org.bouncycastle.tls.SessionParameters;
import org.bouncycastle.tls.SignatureAlgorithm;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsAuthentication;
import org.bouncycastle.tls.TlsClientContext;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsDHGroupVerifier;
import org.bouncycastle.tls.TlsExtensionsUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsSession;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.TrustedAuthority;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.IPAddress;

class ProvTlsClient extends DefaultTlsClient implements ProvTlsPeer {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.ProvTlsClient.class.getName());
  
  private static final boolean provClientEnableCA = PropertyUtils.getBooleanSystemProperty("jdk.tls.client.enableCAExtension", false);
  
  private static final boolean provClientEnableSessionResumption = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.client.enableSessionResumption", true);
  
  private static final boolean provClientEnableStatusRequest = PropertyUtils.getBooleanSystemProperty("jdk.tls.client.enableStatusRequestExtension", true);
  
  private static final boolean provClientEnableTrustedCAKeys = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.client.enableTrustedCAKeysExtension", false);
  
  private static final boolean provClientOmitSigAlgsCert = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.client.omitSigAlgsCertExtension", true);
  
  private static final boolean provEnableSNIExtension = PropertyUtils.getBooleanSystemProperty("jsse.enableSNIExtension", true);
  
  protected final String clientID;
  
  protected final ProvTlsManager manager;
  
  protected final ProvSSLParameters sslParameters;
  
  protected final JsseSecurityParameters jsseSecurityParameters = new JsseSecurityParameters();
  
  protected ProvSSLSession sslSession = null;
  
  protected boolean handshakeComplete = false;
  
  ProvTlsClient(ProvTlsManager paramProvTlsManager, ProvSSLParameters paramProvSSLParameters) {
    super((TlsCrypto)paramProvTlsManager.getContextData().getCrypto());
    this.clientID = JsseUtils.getPeerID("client", paramProvTlsManager);
    this.manager = paramProvTlsManager;
    this.sslParameters = paramProvSSLParameters.copyForConnection();
  }
  
  public String getID() {
    return this.clientID;
  }
  
  public ProvSSLSession getSession() {
    return this.sslSession;
  }
  
  public TlsContext getTlsContext() {
    return (TlsContext)this.context;
  }
  
  protected Vector<X500Name> getCertificateAuthorities() {
    return provClientEnableCA ? JsseUtils.getCertificateAuthorities(this.manager.getContextData().getX509TrustManager()) : null;
  }
  
  protected CertificateStatusRequest getCertificateStatusRequest() {
    if (!provClientEnableStatusRequest)
      return null; 
    OCSPStatusRequest oCSPStatusRequest = new OCSPStatusRequest(null, null);
    return new CertificateStatusRequest((short)1, oCSPStatusRequest);
  }
  
  protected Vector<CertificateStatusRequestItemV2> getMultiCertStatusRequest() {
    if (!provClientEnableStatusRequest)
      return null; 
    OCSPStatusRequest oCSPStatusRequest = new OCSPStatusRequest(null, null);
    Vector<CertificateStatusRequestItemV2> vector = new Vector(2);
    vector.add(new CertificateStatusRequestItemV2((short)2, oCSPStatusRequest));
    vector.add(new CertificateStatusRequestItemV2((short)1, oCSPStatusRequest));
    return vector;
  }
  
  protected Vector<ProtocolName> getProtocolNames() {
    return JsseUtils.getProtocolNames(this.sslParameters.getApplicationProtocols());
  }
  
  protected Vector<Integer> getSupportedGroups(Vector paramVector) {
    return NamedGroupInfo.getSupportedGroupsLocalClient(this.jsseSecurityParameters.namedGroups);
  }
  
  protected Vector<ServerName> getSNIServerNames() {
    if (provEnableSNIExtension) {
      List<BCSNIHostName> list = this.sslParameters.getServerNames();
      if (null == list) {
        String str = this.manager.getPeerHostSNI();
        if (null != str && str.indexOf('.') > 0 && !IPAddress.isValid(str))
          try {
            list = Collections.singletonList(new BCSNIHostName(str));
          } catch (RuntimeException runtimeException) {
            LOG.fine(this.clientID + ": Failed to add peer host as default SNI host_name: " + this.clientID);
          }  
      } 
      if (null != list && !list.isEmpty()) {
        Vector<ServerName> vector = new Vector(list.size());
        for (BCSNIServerName bCSNIServerName : list)
          vector.add(new ServerName((short)bCSNIServerName.getType(), bCSNIServerName.getEncoded())); 
        return vector;
      } 
    } 
    return null;
  }
  
  protected int[] getSupportedCipherSuites() {
    return this.manager.getContextData().getContext().getActiveCipherSuites(getCrypto(), this.sslParameters, getProtocolVersions());
  }
  
  protected Vector<SignatureAndHashAlgorithm> getSupportedSignatureAlgorithms() {
    return this.jsseSecurityParameters.signatureSchemes.getLocalSignatureAndHashAlgorithms();
  }
  
  protected Vector<SignatureAndHashAlgorithm> getSupportedSignatureAlgorithmsCert() {
    Vector<SignatureAndHashAlgorithm> vector = this.jsseSecurityParameters.signatureSchemes.getLocalSignatureAndHashAlgorithmsCert();
    if (vector == null && !provClientOmitSigAlgsCert)
      vector = this.jsseSecurityParameters.signatureSchemes.getLocalSignatureAndHashAlgorithms(); 
    return vector;
  }
  
  protected ProtocolVersion[] getSupportedVersions() {
    return this.manager.getContextData().getContext().getActiveProtocolVersions(this.sslParameters);
  }
  
  protected Vector<TrustedAuthority> getTrustedCAIndication() {
    if (provClientEnableTrustedCAKeys) {
      Vector vector = JsseUtils.getCertificateAuthorities(this.manager.getContextData().getX509TrustManager());
      if (null != vector) {
        Vector<TrustedAuthority> vector1 = new Vector(vector.size());
        for (X500Name x500Name : vector)
          vector1.add(new TrustedAuthority((short)2, x500Name)); 
        return vector1;
      } 
    } 
    return null;
  }
  
  public boolean allowLegacyResumption() {
    return JsseUtils.allowLegacyResumption();
  }
  
  public synchronized boolean isHandshakeComplete() {
    return this.handshakeComplete;
  }
  
  public TlsDHGroupVerifier getDHGroupVerifier() {
    return (TlsDHGroupVerifier)new ProvDHGroupVerifier();
  }
  
  public TlsAuthentication getAuthentication() throws IOException {
    return (TlsAuthentication)new Object(this);
  }
  
  public JcaTlsCrypto getCrypto() {
    return this.manager.getContextData().getCrypto();
  }
  
  public int getMaxCertificateChainLength() {
    return JsseUtils.getMaxCertificateChainLength();
  }
  
  public int getMaxHandshakeMessageSize() {
    return JsseUtils.getMaxHandshakeMessageSize();
  }
  
  public TlsSession getSessionToResume() {
    if (provClientEnableSessionResumption) {
      ProvSSLSession provSSLSession = this.sslParameters.getSessionToResume();
      if (null == provSSLSession) {
        ProvSSLSessionContext provSSLSessionContext = this.manager.getContextData().getClientSessionContext();
        provSSLSession = provSSLSessionContext.getSessionImpl(this.manager.getPeerHost(), this.manager.getPeerPort());
      } 
      if (null != provSSLSession) {
        TlsSession tlsSession = provSSLSession.getTlsSession();
        SessionParameters sessionParameters = getResumableSessionParameters(provSSLSession, tlsSession);
        if (null != sessionParameters) {
          this.sslSession = provSSLSession;
          if (!this.manager.getEnableSessionCreation())
            this.cipherSuites = new int[] { sessionParameters.getCipherSuite() }; 
          return tlsSession;
        } 
      } 
    } 
    JsseUtils.checkSessionCreationEnabled(this.manager);
    return null;
  }
  
  public void notifyAlertRaised(short paramShort1, short paramShort2, String paramString, Throwable paramThrowable) {
    super.notifyAlertRaised(paramShort1, paramShort2, paramString, paramThrowable);
    Level level = (paramShort1 == 1) ? Level.FINE : ((paramShort2 == 80) ? Level.WARNING : Level.INFO);
    if (LOG.isLoggable(level)) {
      String str = JsseUtils.getAlertRaisedLogMessage(this.clientID, paramShort1, paramShort2);
      if (paramString != null)
        str = str + ": " + str; 
      LOG.log(level, str, paramThrowable);
    } 
  }
  
  public void notifyAlertReceived(short paramShort1, short paramShort2) {
    super.notifyAlertReceived(paramShort1, paramShort2);
    Level level = (paramShort1 == 1) ? Level.FINE : Level.INFO;
    if (LOG.isLoggable(level)) {
      String str = JsseUtils.getAlertReceivedLogMessage(this.clientID, paramShort1, paramShort2);
      LOG.log(level, str);
    } 
  }
  
  public void notifyConnectionClosed() {
    super.notifyConnectionClosed();
    if (LOG.isLoggable(Level.INFO))
      LOG.info(this.clientID + " disconnected from " + this.clientID); 
  }
  
  public void notifyHandshakeBeginning() throws IOException {
    super.notifyHandshakeBeginning();
    if (LOG.isLoggable(Level.INFO))
      LOG.info(this.clientID + " opening connection to " + this.clientID); 
    ContextData contextData = this.manager.getContextData();
    ProtocolVersion[] arrayOfProtocolVersion = getProtocolVersions();
    this.jsseSecurityParameters.namedGroups = contextData.getNamedGroupsClient(this.sslParameters, arrayOfProtocolVersion);
    this.jsseSecurityParameters.signatureSchemes = contextData.getSignatureSchemesClient(this.sslParameters, arrayOfProtocolVersion, this.jsseSecurityParameters.namedGroups);
  }
  
  public synchronized void notifyHandshakeComplete() throws IOException {
    super.notifyHandshakeComplete();
    this.handshakeComplete = true;
    if (LOG.isLoggable(Level.INFO))
      LOG.info(this.clientID + " established connection with " + this.clientID); 
    TlsSession tlsSession = this.context.getSession();
    if (null == this.sslSession || this.sslSession.getTlsSession() != tlsSession) {
      ProvSSLSessionContext provSSLSessionContext = this.manager.getContextData().getClientSessionContext();
      String str = this.manager.getPeerHost();
      int i = this.manager.getPeerPort();
      JsseSessionParameters jsseSessionParameters = new JsseSessionParameters(this.sslParameters.getEndpointIdentificationAlgorithm(), null);
      boolean bool = (provClientEnableSessionResumption && !TlsUtils.isTLSv13((TlsContext)this.context)) ? true : false;
      this.sslSession = provSSLSessionContext.reportSession(str, i, tlsSession, jsseSessionParameters, bool);
    } 
    this.manager.notifyHandshakeComplete(new ProvSSLConnection(this));
  }
  
  public void notifySecureRenegotiation(boolean paramBoolean) throws IOException {
    if (!paramBoolean) {
      boolean bool = PropertyUtils.getBooleanSystemProperty("sun.security.ssl.allowLegacyHelloMessages", true);
      if (!bool)
        throw new TlsFatalAlert((short)40); 
    } 
  }
  
  public void notifySelectedCipherSuite(int paramInt) {
    String str = this.manager.getContextData().getContext().validateNegotiatedCipherSuite(this.sslParameters, paramInt);
    if (LOG.isLoggable(Level.FINE))
      LOG.fine(this.clientID + " notified of selected cipher suite: " + this.clientID); 
    super.notifySelectedCipherSuite(paramInt);
  }
  
  public void notifyServerVersion(ProtocolVersion paramProtocolVersion) throws IOException {
    String str = this.manager.getContextData().getContext().validateNegotiatedProtocol(this.sslParameters, paramProtocolVersion);
    if (LOG.isLoggable(Level.FINE))
      LOG.fine(this.clientID + " notified of selected protocol version: " + this.clientID); 
    super.notifyServerVersion(paramProtocolVersion);
  }
  
  public void notifySessionToResume(TlsSession paramTlsSession) {
    if (null == paramTlsSession)
      JsseUtils.checkSessionCreationEnabled(this.manager); 
    super.notifySessionToResume(paramTlsSession);
  }
  
  public void notifySessionID(byte[] paramArrayOfbyte) {
    boolean bool = (!TlsUtils.isNullOrEmpty(paramArrayOfbyte) && null != this.sslSession && Arrays.areEqual(paramArrayOfbyte, this.sslSession.getId())) ? true : false;
    if (bool) {
      if (LOG.isLoggable(Level.FINE))
        LOG.fine(this.clientID + ": Server resumed session: " + this.clientID); 
    } else {
      this.sslSession = null;
      if (LOG.isLoggable(Level.FINE))
        if (TlsUtils.isNullOrEmpty(paramArrayOfbyte)) {
          LOG.fine(this.clientID + ": Server did not specify a session ID");
        } else {
          LOG.fine(this.clientID + ": Server specified new session: " + this.clientID);
        }  
      JsseUtils.checkSessionCreationEnabled(this.manager);
    } 
    this.manager.notifyHandshakeSession(this.manager.getContextData().getClientSessionContext(), this.context.getSecurityParametersHandshake(), this.jsseSecurityParameters, this.sslSession);
  }
  
  public void processServerExtensions(Hashtable paramHashtable) throws IOException {
    super.processServerExtensions(paramHashtable);
    SecurityParameters securityParameters = this.context.getSecurityParametersHandshake();
    if (null != securityParameters.getClientServerNames()) {
      boolean bool = TlsExtensionsUtils.hasServerNameExtensionServer(paramHashtable);
      if (LOG.isLoggable(Level.FINER))
        LOG.finer(this.clientID + ": Server accepted SNI?: " + this.clientID); 
    } 
  }
  
  public boolean requiresCloseNotify() {
    return JsseUtils.requireCloseNotify();
  }
  
  public boolean requiresExtendedMasterSecret() {
    return !JsseUtils.allowLegacyMasterSecret();
  }
  
  public boolean shouldUseCompatibilityMode() {
    return JsseUtils.useCompatibilityMode();
  }
  
  public boolean shouldUseExtendedMasterSecret() {
    return JsseUtils.useExtendedMasterSecret();
  }
  
  protected String[] getKeyTypesLegacy(short[] paramArrayOfshort) throws IOException {
    String[] arrayOfString = new String[paramArrayOfshort.length];
    for (byte b = 0; b < paramArrayOfshort.length; b++)
      arrayOfString[b] = JsseUtils.getKeyTypeLegacyClient(paramArrayOfshort[b]); 
    return arrayOfString;
  }
  
  protected SessionParameters getResumableSessionParameters(ProvSSLSession paramProvSSLSession, TlsSession paramTlsSession) {
    if (null == paramTlsSession || !paramTlsSession.isResumable())
      return null; 
    SessionParameters sessionParameters = paramTlsSession.exportSessionParameters();
    if (null == sessionParameters || !Arrays.contains(getCipherSuites(), sessionParameters.getCipherSuite()))
      return null; 
    ProtocolVersion protocolVersion = sessionParameters.getNegotiatedVersion();
    if (!ProtocolVersion.contains(getProtocolVersions(), protocolVersion))
      return null; 
    if (TlsUtils.isTLSv13(protocolVersion))
      return null; 
    String str = this.sslParameters.getEndpointIdentificationAlgorithm();
    if (null != str) {
      JsseSessionParameters jsseSessionParameters = paramProvSSLSession.getJsseSessionParameters();
      String str1 = jsseSessionParameters.getEndpointIDAlgorithm();
      if (!str.equalsIgnoreCase(str1)) {
        if (LOG.isLoggable(Level.FINER))
          LOG.finer(this.clientID + ": Session not resumable - endpoint ID algorithm mismatch; connection: " + this.clientID + ", session: " + str); 
        return null;
      } 
    } 
    return sessionParameters;
  }
  
  protected TlsCredentials selectClientCredentials12(Principal[] paramArrayOfPrincipal, short[] paramArrayOfshort) throws IOException {
    SignatureSchemeInfo.PerConnection perConnection = this.jsseSecurityParameters.signatureSchemes;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    for (SignatureSchemeInfo signatureSchemeInfo1 : perConnection.getPeerSigSchemes()) {
      String str1 = signatureSchemeInfo1.getKeyType();
      if (linkedHashMap.containsKey(str1))
        continue; 
      short s1 = signatureSchemeInfo1.getSignatureAlgorithm();
      short s2 = SignatureAlgorithm.getClientCertificateType(s1);
      if (s2 < 0 || !Arrays.contains(paramArrayOfshort, s2) || !signatureSchemeInfo1.isSupportedPre13() || !perConnection.hasLocalSignatureScheme(signatureSchemeInfo1))
        continue; 
      linkedHashMap.put(str1, signatureSchemeInfo1);
    } 
    if (linkedHashMap.isEmpty()) {
      if (LOG.isLoggable(Level.FINE))
        LOG.fine(this.clientID + " (1.2) found no usable signature schemes"); 
      return null;
    } 
    String[] arrayOfString = (String[])linkedHashMap.keySet().toArray((Object[])TlsUtils.EMPTY_STRINGS);
    BCX509Key bCX509Key = this.manager.chooseClientKey(arrayOfString, paramArrayOfPrincipal);
    if (null == bCX509Key) {
      handleKeyManagerMisses((LinkedHashMap)linkedHashMap, null);
      if (LOG.isLoggable(Level.FINE))
        LOG.fine(this.clientID + " (1.2) did not select any credentials"); 
      return null;
    } 
    String str = bCX509Key.getKeyType();
    handleKeyManagerMisses((LinkedHashMap)linkedHashMap, str);
    SignatureSchemeInfo signatureSchemeInfo = (SignatureSchemeInfo)linkedHashMap.get(str);
    if (null == signatureSchemeInfo)
      throw new TlsFatalAlert((short)80, "Key manager returned invalid key type"); 
    if (LOG.isLoggable(Level.FINE))
      LOG.fine(this.clientID + " (1.2) selected credentials for signature scheme '" + this.clientID + "' (keyType '" + signatureSchemeInfo + "'), with private key algorithm '" + str + "'"); 
    return (TlsCredentials)JsseUtils.createCredentialedSigner((TlsContext)this.context, getCrypto(), bCX509Key, signatureSchemeInfo.getSignatureAndHashAlgorithm());
  }
  
  protected TlsCredentials selectClientCredentials13(Principal[] paramArrayOfPrincipal, byte[] paramArrayOfbyte) throws IOException {
    SignatureSchemeInfo.PerConnection perConnection = this.jsseSecurityParameters.signatureSchemes;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    for (SignatureSchemeInfo signatureSchemeInfo1 : perConnection.getPeerSigSchemes()) {
      String str1 = signatureSchemeInfo1.getKeyType13();
      if (linkedHashMap.containsKey(str1) || !signatureSchemeInfo1.isSupportedPost13() || !perConnection.hasLocalSignatureScheme(signatureSchemeInfo1))
        continue; 
      linkedHashMap.put(str1, signatureSchemeInfo1);
    } 
    if (linkedHashMap.isEmpty()) {
      if (LOG.isLoggable(Level.FINE))
        LOG.fine(this.clientID + " (1.3) found no usable signature schemes"); 
      return null;
    } 
    String[] arrayOfString = (String[])linkedHashMap.keySet().toArray((Object[])TlsUtils.EMPTY_STRINGS);
    BCX509Key bCX509Key = this.manager.chooseClientKey(arrayOfString, paramArrayOfPrincipal);
    if (null == bCX509Key) {
      handleKeyManagerMisses((LinkedHashMap)linkedHashMap, null);
      if (LOG.isLoggable(Level.FINE))
        LOG.fine(this.clientID + " (1.3) did not select any credentials"); 
      return null;
    } 
    String str = bCX509Key.getKeyType();
    handleKeyManagerMisses((LinkedHashMap)linkedHashMap, str);
    SignatureSchemeInfo signatureSchemeInfo = (SignatureSchemeInfo)linkedHashMap.get(str);
    if (null == signatureSchemeInfo)
      throw new TlsFatalAlert((short)80, "Key manager returned invalid key type"); 
    if (LOG.isLoggable(Level.FINE))
      LOG.fine(this.clientID + " (1.3) selected credentials for signature scheme '" + this.clientID + "' (keyType '" + signatureSchemeInfo + "'), with private key algorithm '" + str + "'"); 
    return (TlsCredentials)JsseUtils.createCredentialedSigner13((TlsContext)this.context, getCrypto(), bCX509Key, signatureSchemeInfo.getSignatureAndHashAlgorithm(), paramArrayOfbyte);
  }
  
  protected TlsCredentials selectClientCredentialsLegacy(Principal[] paramArrayOfPrincipal, short[] paramArrayOfshort) throws IOException {
    String[] arrayOfString = getKeyTypesLegacy(paramArrayOfshort);
    if (arrayOfString.length < 1)
      return null; 
    BCX509Key bCX509Key = this.manager.chooseClientKey(arrayOfString, paramArrayOfPrincipal);
    return (TlsCredentials)((null == bCX509Key) ? null : JsseUtils.createCredentialedSigner((TlsContext)this.context, getCrypto(), bCX509Key, null));
  }
  
  private void handleKeyManagerMisses(LinkedHashMap<String, SignatureSchemeInfo> paramLinkedHashMap, String paramString) {
    for (Map.Entry<String, SignatureSchemeInfo> entry : paramLinkedHashMap.entrySet()) {
      String str = (String)entry.getKey();
      if (str.equals(paramString))
        break; 
      if (LOG.isLoggable(Level.FINER)) {
        SignatureSchemeInfo signatureSchemeInfo = (SignatureSchemeInfo)entry.getValue();
        LOG.finer(this.clientID + " found no credentials for signature scheme '" + this.clientID + "' (keyType '" + signatureSchemeInfo + "')");
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvTlsClient.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */