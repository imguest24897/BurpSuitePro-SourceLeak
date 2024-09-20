package org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.jsse.BCSNIMatcher;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.jsse.BCX509Key;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.CertificateRequest;
import org.bouncycastle.tls.CertificateStatus;
import org.bouncycastle.tls.DefaultTlsServer;
import org.bouncycastle.tls.KeyExchangeAlgorithm;
import org.bouncycastle.tls.ProtocolName;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.ServerName;
import org.bouncycastle.tls.SessionParameters;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsDHUtils;
import org.bouncycastle.tls.TlsExtensionsUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsSession;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.TrustedAuthority;
import org.bouncycastle.tls.crypto.DHGroup;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

class ProvTlsServer extends DefaultTlsServer implements ProvTlsPeer {
  private static final Logger LOG = Logger.getLogger(ProvTlsServer.class.getName());
  
  private static final String PROPERTY_DEFAULT_DHE_PARAMETERS = "jdk.tls.server.defaultDHEParameters";
  
  private static final int provEphemeralDHKeySize = PropertyUtils.getIntegerSystemProperty("jdk.tls.ephemeralDHKeySize", 2048, 1024, 8192);
  
  private static final DHGroup[] provServerDefaultDHEParameters = getDefaultDHEParameters();
  
  private static final boolean provServerEnableCA = PropertyUtils.getBooleanSystemProperty("jdk.tls.server.enableCAExtension", true);
  
  private static final boolean provServerEnableSessionResumption = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.server.enableSessionResumption", true);
  
  private static final boolean provServerEnableStatusRequest = false;
  
  private static final boolean provServerEnableTrustedCAKeys = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.server.enableTrustedCAKeysExtension", false);
  
  private static final boolean provServerOmitSigAlgsCert = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.server.omitSigAlgsCertExtension", true);
  
  protected final String serverID;
  
  protected final ProvTlsManager manager;
  
  protected final ProvSSLParameters sslParameters;
  
  protected final JsseSecurityParameters jsseSecurityParameters = new JsseSecurityParameters();
  
  protected ProvSSLSession sslSession = null;
  
  protected BCSNIServerName matchedSNIServerName = null;
  
  protected Set<String> keyManagerMissCache = null;
  
  protected TlsCredentials credentials = null;
  
  protected boolean handshakeComplete = false;
  
  private static DHGroup[] getDefaultDHEParameters() {
    String str1 = PropertyUtils.getStringSecurityProperty("jdk.tls.server.defaultDHEParameters");
    if (null == str1)
      return null; 
    String str2 = JsseUtils.stripDoubleQuotes(JsseUtils.removeAllWhitespace(str1));
    int i = str2.length();
    if (i < 1)
      return null; 
    ArrayList<DHGroup> arrayList = new ArrayList();
    int j = -1;
    do {
      int k = j + 1;
      if (k >= i || '{' != str2.charAt(k))
        break; 
      int m = k + 1;
      int n = str2.indexOf(',', m);
      if (n <= m)
        break; 
      int i1 = n + 1;
      int i2 = str2.indexOf('}', i1);
      if (i2 <= i1)
        break; 
      try {
        BigInteger bigInteger1 = parseDHParameter(str2, m, n);
        BigInteger bigInteger2 = parseDHParameter(str2, i1, i2);
        DHGroup dHGroup = TlsDHUtils.getStandardGroupForDHParameters(bigInteger1, bigInteger2);
        if (null != dHGroup) {
          arrayList.add(dHGroup);
        } else if (!bigInteger1.isProbablePrime(120)) {
          LOG.log(Level.WARNING, "Non-prime modulus ignored in security property [jdk.tls.server.defaultDHEParameters]: " + bigInteger1.toString(16));
        } else {
          arrayList.add(new DHGroup(bigInteger1, null, bigInteger2, 0));
        } 
      } catch (Exception exception) {
        break;
      } 
      j = i2 + 1;
      if (j >= i)
        return arrayList.<DHGroup>toArray(new DHGroup[arrayList.size()]); 
    } while (',' == str2.charAt(j));
    LOG.log(Level.WARNING, "Invalid syntax for security property [jdk.tls.server.defaultDHEParameters]");
    return null;
  }
  
  private static BigInteger parseDHParameter(String paramString, int paramInt1, int paramInt2) {
    return new BigInteger(paramString.substring(paramInt1, paramInt2), 16);
  }
  
  ProvTlsServer(ProvTlsManager paramProvTlsManager, ProvSSLParameters paramProvSSLParameters) {
    super((TlsCrypto)paramProvTlsManager.getContextData().getCrypto());
    this.serverID = JsseUtils.getPeerID("server", paramProvTlsManager);
    this.manager = paramProvTlsManager;
    this.sslParameters = paramProvSSLParameters.copyForConnection();
  }
  
  public String getID() {
    return this.serverID;
  }
  
  public ProvSSLSession getSession() {
    return this.sslSession;
  }
  
  public TlsContext getTlsContext() {
    return (TlsContext)this.context;
  }
  
  protected boolean allowCertificateStatus() {
    return false;
  }
  
  protected boolean allowMultiCertStatus() {
    return false;
  }
  
  protected boolean allowTrustedCAIndication() {
    return (null != this.jsseSecurityParameters.trustedIssuers);
  }
  
  protected String getDetailMessageNoCipherSuite() {
    StringBuilder stringBuilder = new StringBuilder(this.serverID);
    int[] arrayOfInt = this.offeredCipherSuites;
    if (TlsUtils.isNullOrEmpty(arrayOfInt)) {
      stringBuilder.append(" found no selectable cipher suite because none were offered.");
    } else {
      stringBuilder.append(" found no selectable cipher suite among the ");
      stringBuilder.append(arrayOfInt.length);
      stringBuilder.append(" offered: ");
      ProvSSLContextSpi provSSLContextSpi = this.manager.getContextData().getContext();
      stringBuilder.append('[');
      JsseUtils.appendCipherSuiteDetail(stringBuilder, provSSLContextSpi, arrayOfInt[0]);
      for (byte b = 1; b < arrayOfInt.length; b++) {
        stringBuilder.append(", ");
        JsseUtils.appendCipherSuiteDetail(stringBuilder, provSSLContextSpi, arrayOfInt[b]);
      } 
      stringBuilder.append(']');
    } 
    return stringBuilder.toString();
  }
  
  protected int getMaximumNegotiableCurveBits() {
    return NamedGroupInfo.getMaximumBitsServerECDH(this.jsseSecurityParameters.namedGroups);
  }
  
  protected int getMaximumNegotiableFiniteFieldBits() {
    int i = NamedGroupInfo.getMaximumBitsServerFFDHE(this.jsseSecurityParameters.namedGroups);
    return (i >= provEphemeralDHKeySize) ? i : 0;
  }
  
  protected Vector<ProtocolName> getProtocolNames() {
    return JsseUtils.getProtocolNames(this.sslParameters.getApplicationProtocols());
  }
  
  protected int[] getSupportedCipherSuites() {
    return this.manager.getContextData().getContext().getActiveCipherSuites(getCrypto(), this.sslParameters, getProtocolVersions());
  }
  
  protected ProtocolVersion[] getSupportedVersions() {
    return this.manager.getContextData().getContext().getActiveProtocolVersions(this.sslParameters);
  }
  
  protected boolean preferLocalCipherSuites() {
    return this.sslParameters.getUseCipherSuitesOrder();
  }
  
  protected boolean selectCipherSuite(int paramInt) throws IOException {
    TlsCredentials tlsCredentials = null;
    int i = TlsUtils.getKeyExchangeAlgorithm(paramInt);
    if (!KeyExchangeAlgorithm.isAnonymous(i)) {
      tlsCredentials = selectCredentials(this.jsseSecurityParameters.trustedIssuers, i);
      if (null == tlsCredentials) {
        String str = ProvSSLContextSpi.getCipherSuiteName(paramInt);
        if (LOG.isLoggable(Level.FINER))
          LOG.finer(this.serverID + " found no credentials for cipher suite: " + str); 
        return false;
      } 
    } 
    boolean bool = super.selectCipherSuite(paramInt);
    if (bool)
      this.credentials = tlsCredentials; 
    return bool;
  }
  
  protected int selectDH(int paramInt) {
    paramInt = Math.max(paramInt, provEphemeralDHKeySize);
    return NamedGroupInfo.selectServerFFDHE(this.jsseSecurityParameters.namedGroups, paramInt);
  }
  
  protected int selectDHDefault(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  protected int selectECDH(int paramInt) {
    return NamedGroupInfo.selectServerECDH(this.jsseSecurityParameters.namedGroups, paramInt);
  }
  
  protected int selectECDHDefault(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  protected ProtocolName selectProtocolName() throws IOException {
    if (null == this.sslParameters.getEngineAPSelector() && null == this.sslParameters.getSocketAPSelector())
      return super.selectProtocolName(); 
    Vector<ProtocolName> vector = this.clientProtocolNames;
    List<String> list = JsseUtils.getProtocolNames(vector);
    String str = this.manager.selectApplicationProtocol(Collections.unmodifiableList(list));
    if (null == str)
      throw new TlsFatalAlert((short)120); 
    if (str.length() < 1)
      return null; 
    if (!list.contains(str))
      throw new TlsFatalAlert((short)120); 
    return ProtocolName.asUtf8Encoding(str);
  }
  
  protected boolean shouldSelectProtocolNameEarly() {
    return (null == this.sslParameters.getEngineAPSelector() && null == this.sslParameters.getSocketAPSelector());
  }
  
  public boolean allowLegacyResumption() {
    return JsseUtils.allowLegacyResumption();
  }
  
  public int getMaxCertificateChainLength() {
    return JsseUtils.getMaxCertificateChainLength();
  }
  
  public int getMaxHandshakeMessageSize() {
    return JsseUtils.getMaxHandshakeMessageSize();
  }
  
  public synchronized boolean isHandshakeComplete() {
    return this.handshakeComplete;
  }
  
  public TlsCredentials getCredentials() throws IOException {
    if (this.credentials == null)
      throw new TlsFatalAlert((short)80); 
    return this.credentials;
  }
  
  public CertificateRequest getCertificateRequest() throws IOException {
    if (!isClientAuthEnabled())
      return null; 
    ContextData contextData = this.manager.getContextData();
    ProtocolVersion protocolVersion = this.context.getServerVersion();
    Vector<SignatureAndHashAlgorithm> vector = this.jsseSecurityParameters.signatureSchemes.getLocalSignatureAndHashAlgorithms();
    Vector<X500Name> vector1 = null;
    if (provServerEnableCA)
      vector1 = JsseUtils.getCertificateAuthorities(contextData.getX509TrustManager()); 
    if (TlsUtils.isTLSv13(protocolVersion)) {
      byte[] arrayOfByte = TlsUtils.EMPTY_BYTES;
      Vector<SignatureAndHashAlgorithm> vector2 = this.jsseSecurityParameters.signatureSchemes.getLocalSignatureAndHashAlgorithmsCert();
      if (vector2 == null && !provServerOmitSigAlgsCert)
        vector2 = this.jsseSecurityParameters.signatureSchemes.getLocalSignatureAndHashAlgorithms(); 
      return new CertificateRequest(arrayOfByte, vector, vector2, vector1);
    } 
    short[] arrayOfShort = { 64, 1, 2 };
    return new CertificateRequest(arrayOfShort, vector, vector1);
  }
  
  public CertificateStatus getCertificateStatus() throws IOException {
    return null;
  }
  
  public JcaTlsCrypto getCrypto() {
    return this.manager.getContextData().getCrypto();
  }
  
  public int[] getSupportedGroups() throws IOException {
    ContextData contextData = this.manager.getContextData();
    ProtocolVersion protocolVersion = this.context.getServerVersion();
    this.jsseSecurityParameters.namedGroups = contextData.getNamedGroupsServer(this.sslParameters, protocolVersion);
    return NamedGroupInfo.getSupportedGroupsLocalServer(this.jsseSecurityParameters.namedGroups);
  }
  
  public int getSelectedCipherSuite() throws IOException {
    ContextData contextData = this.manager.getContextData();
    SecurityParameters securityParameters = this.context.getSecurityParametersHandshake();
    int[] arrayOfInt = securityParameters.getClientSupportedGroups();
    this.jsseSecurityParameters.namedGroups.notifyPeerData(arrayOfInt);
    ProtocolVersion protocolVersion = this.context.getServerVersion();
    this.jsseSecurityParameters.signatureSchemes = contextData.getSignatureSchemesServer(this.sslParameters, protocolVersion, this.jsseSecurityParameters.namedGroups);
    Vector<SignatureAndHashAlgorithm> vector1 = securityParameters.getClientSigAlgs();
    Vector<SignatureAndHashAlgorithm> vector2 = securityParameters.getClientSigAlgsCert();
    List<SignatureSchemeInfo> list1 = contextData.getSignatureSchemes(vector1);
    List<SignatureSchemeInfo> list2 = null;
    if (vector2 != vector1)
      list2 = contextData.getSignatureSchemes(vector2); 
    this.jsseSecurityParameters.signatureSchemes.notifyPeerData(list1, list2);
    if (LOG.isLoggable(Level.FINEST)) {
      String str1 = this.serverID + " peer signature_algorithms";
      LOG.finest(JsseUtils.getSignatureAlgorithmsReport(str1, list1));
      if (list2 != null) {
        str1 = this.serverID + " peer signature_algorithms_cert";
        LOG.finest(JsseUtils.getSignatureAlgorithmsReport(str1, list2));
      } 
    } 
    if (DummyX509KeyManager.INSTANCE == contextData.getX509KeyManager())
      throw new TlsFatalAlert((short)40); 
    this.keyManagerMissCache = new HashSet<>();
    int i = super.getSelectedCipherSuite();
    this.keyManagerMissCache = null;
    String str = contextData.getContext().validateNegotiatedCipherSuite(this.sslParameters, i);
    if (LOG.isLoggable(Level.FINE))
      LOG.fine(this.serverID + " selected cipher suite: " + str); 
    return i;
  }
  
  public Hashtable<Integer, byte[]> getServerExtensions() throws IOException {
    super.getServerExtensions();
    if (null != this.matchedSNIServerName)
      TlsExtensionsUtils.addServerNameExtensionServer(this.serverExtensions); 
    return this.serverExtensions;
  }
  
  public TlsSession getSessionToResume(byte[] paramArrayOfbyte) {
    ProvSSLSessionContext provSSLSessionContext = this.manager.getContextData().getServerSessionContext();
    if (provServerEnableSessionResumption) {
      ProvSSLSession provSSLSession = provSSLSessionContext.getSessionImpl(paramArrayOfbyte);
      if (null != provSSLSession) {
        TlsSession tlsSession = provSSLSession.getTlsSession();
        if (isResumable(provSSLSession, tlsSession)) {
          this.sslSession = provSSLSession;
          return tlsSession;
        } 
      } 
    } 
    JsseUtils.checkSessionCreationEnabled(this.manager);
    return null;
  }
  
  public byte[] getNewSessionID() {
    return (!provServerEnableSessionResumption || TlsUtils.isTLSv13((TlsContext)this.context)) ? null : this.context.getNonceGenerator().generateNonce(32);
  }
  
  public void notifySession(TlsSession paramTlsSession) {
    byte[] arrayOfByte = paramTlsSession.getSessionID();
    boolean bool = (null != this.sslSession && this.sslSession.getTlsSession() == paramTlsSession) ? true : false;
    if (bool) {
      if (LOG.isLoggable(Level.FINE))
        LOG.fine(this.serverID + " resumed session: " + Hex.toHexString(arrayOfByte)); 
    } else {
      this.sslSession = null;
      if (LOG.isLoggable(Level.FINE))
        if (TlsUtils.isNullOrEmpty(arrayOfByte)) {
          LOG.fine(this.serverID + " did not specify a session ID");
        } else {
          LOG.fine(this.serverID + " specified new session: " + Hex.toHexString(arrayOfByte));
        }  
      JsseUtils.checkSessionCreationEnabled(this.manager);
    } 
    this.manager.notifyHandshakeSession(this.manager.getContextData().getServerSessionContext(), this.context.getSecurityParametersHandshake(), this.jsseSecurityParameters, this.sslSession);
  }
  
  public void notifyAlertRaised(short paramShort1, short paramShort2, String paramString, Throwable paramThrowable) {
    Level level = (paramShort1 == 1) ? Level.FINE : ((paramShort2 == 80) ? Level.WARNING : Level.INFO);
    if (LOG.isLoggable(level)) {
      String str = JsseUtils.getAlertRaisedLogMessage(this.serverID, paramShort1, paramShort2);
      if (paramString != null)
        str = str + ": " + paramString; 
      LOG.log(level, str, paramThrowable);
    } 
  }
  
  public void notifyAlertReceived(short paramShort1, short paramShort2) {
    super.notifyAlertReceived(paramShort1, paramShort2);
    Level level = (paramShort1 == 1) ? Level.FINE : Level.INFO;
    if (LOG.isLoggable(level)) {
      String str = JsseUtils.getAlertReceivedLogMessage(this.serverID, paramShort1, paramShort2);
      LOG.log(level, str);
    } 
  }
  
  public ProtocolVersion getServerVersion() throws IOException {
    ProtocolVersion protocolVersion = super.getServerVersion();
    String str = this.manager.getContextData().getContext().validateNegotiatedProtocol(this.sslParameters, protocolVersion);
    if (LOG.isLoggable(Level.FINE))
      LOG.fine(this.serverID + " selected protocol version: " + str); 
    return protocolVersion;
  }
  
  public void notifyClientCertificate(Certificate paramCertificate) throws IOException {
    if (!isClientAuthEnabled())
      throw new TlsFatalAlert((short)80); 
    if (null == paramCertificate || paramCertificate.isEmpty()) {
      if (this.sslParameters.getNeedClientAuth()) {
        byte b = TlsUtils.isTLSv13((TlsContext)this.context) ? 116 : 40;
        throw new TlsFatalAlert(b);
      } 
    } else {
      X509Certificate[] arrayOfX509Certificate = JsseUtils.getX509CertificateChain(getCrypto(), paramCertificate);
      this.manager.checkClientTrusted(arrayOfX509Certificate, "TLS-client-auth");
    } 
  }
  
  public void notifyConnectionClosed() {
    super.notifyConnectionClosed();
    if (LOG.isLoggable(Level.INFO))
      LOG.info(this.serverID + " disconnected from " + JsseUtils.getPeerReport(this.manager)); 
  }
  
  public void notifyHandshakeBeginning() throws IOException {
    super.notifyHandshakeBeginning();
    if (LOG.isLoggable(Level.INFO))
      LOG.info(this.serverID + " accepting connection from " + JsseUtils.getPeerReport(this.manager)); 
  }
  
  public synchronized void notifyHandshakeComplete() throws IOException {
    super.notifyHandshakeComplete();
    this.handshakeComplete = true;
    if (LOG.isLoggable(Level.INFO))
      LOG.info(this.serverID + " established connection with " + JsseUtils.getPeerReport(this.manager)); 
    TlsSession tlsSession = this.context.getSession();
    if (null == this.sslSession || this.sslSession.getTlsSession() != tlsSession) {
      ProvSSLSessionContext provSSLSessionContext = this.manager.getContextData().getServerSessionContext();
      String str = this.manager.getPeerHost();
      int i = this.manager.getPeerPort();
      JsseSessionParameters jsseSessionParameters = new JsseSessionParameters(this.sslParameters.getEndpointIdentificationAlgorithm(), this.matchedSNIServerName);
      boolean bool = (provServerEnableSessionResumption && !TlsUtils.isTLSv13((TlsContext)this.context)) ? true : false;
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
  
  public void processClientExtensions(Hashtable paramHashtable) throws IOException {
    super.processClientExtensions(paramHashtable);
    Vector<ServerName> vector = this.context.getSecurityParametersHandshake().getClientServerNames();
    if (null != vector) {
      Collection<BCSNIMatcher> collection = this.sslParameters.getSNIMatchers();
      if (null == collection || collection.isEmpty()) {
        if (LOG.isLoggable(Level.FINE))
          LOG.fine(this.serverID + " ignored SNI (no matchers specified)"); 
      } else {
        this.matchedSNIServerName = JsseUtils.findMatchingSNIServerName(vector, collection);
        if (null == this.matchedSNIServerName)
          throw new TlsFatalAlert((short)112); 
        if (LOG.isLoggable(Level.FINE))
          LOG.fine(this.serverID + " accepted SNI: " + this.matchedSNIServerName); 
      } 
    } 
    if (TlsUtils.isTLSv13((TlsContext)this.context)) {
      Vector<X500Name> vector1 = TlsExtensionsUtils.getCertificateAuthoritiesExtension(paramHashtable);
      this.jsseSecurityParameters.trustedIssuers = (Principal[])JsseUtils.toX500Principals(vector1);
    } else if (provServerEnableTrustedCAKeys) {
      Vector<TrustedAuthority> vector1 = this.trustedCAKeys;
      this.jsseSecurityParameters.trustedIssuers = (Principal[])JsseUtils.getTrustedIssuers(vector1);
    } 
  }
  
  public boolean requiresCloseNotify() {
    return JsseUtils.requireCloseNotify();
  }
  
  public boolean requiresExtendedMasterSecret() {
    return !JsseUtils.allowLegacyMasterSecret();
  }
  
  public boolean shouldUseExtendedMasterSecret() {
    return JsseUtils.useExtendedMasterSecret();
  }
  
  protected boolean isClientAuthEnabled() {
    return (this.sslParameters.getNeedClientAuth() || this.sslParameters.getWantClientAuth());
  }
  
  protected boolean isResumable(ProvSSLSession paramProvSSLSession, TlsSession paramTlsSession) {
    if (null == paramTlsSession || !paramTlsSession.isResumable())
      return false; 
    SecurityParameters securityParameters = this.context.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
    if (TlsUtils.isTLSv13(protocolVersion))
      return false; 
    SessionParameters sessionParameters = paramTlsSession.exportSessionParameters();
    if (null == sessionParameters || !protocolVersion.equals(sessionParameters.getNegotiatedVersion()) || !Arrays.contains(getCipherSuites(), sessionParameters.getCipherSuite()) || !Arrays.contains(this.offeredCipherSuites, sessionParameters.getCipherSuite()))
      return false; 
    if (this.sslParameters.getNeedClientAuth() && sessionParameters.getPeerCertificate() == null)
      return false; 
    String str = this.sslParameters.getEndpointIdentificationAlgorithm();
    if (null != str) {
      JsseSessionParameters jsseSessionParameters1 = paramProvSSLSession.getJsseSessionParameters();
      String str1 = jsseSessionParameters1.getEndpointIDAlgorithm();
      if (!str.equalsIgnoreCase(str1)) {
        if (LOG.isLoggable(Level.FINER))
          LOG.finer(this.serverID + ": Session not resumable - endpoint ID algorithm mismatch; connection: " + str + ", session: " + str1); 
        return false;
      } 
    } 
    JsseSessionParameters jsseSessionParameters = paramProvSSLSession.getJsseSessionParameters();
    BCSNIServerName bCSNIServerName1 = this.matchedSNIServerName;
    BCSNIServerName bCSNIServerName2 = jsseSessionParameters.getMatchedSNIServerName();
    if (!JsseUtils.equals(bCSNIServerName1, bCSNIServerName2)) {
      if (LOG.isLoggable(Level.FINEST))
        LOG.finest(this.serverID + ": Session not resumable - SNI mismatch; connection: " + bCSNIServerName1 + ", session: " + bCSNIServerName2); 
      return false;
    } 
    return true;
  }
  
  protected TlsCredentials selectCredentials(Principal[] paramArrayOfPrincipal, int paramInt) throws IOException {
    byte[] arrayOfByte;
    switch (paramInt) {
      case 1:
      case 3:
      case 5:
      case 17:
      case 19:
        return (1 == paramInt || !TlsUtils.isSignatureAlgorithmsExtensionAllowed(this.context.getServerVersion())) ? selectServerCredentialsLegacy(paramArrayOfPrincipal, paramInt) : selectServerCredentials12(paramArrayOfPrincipal, paramInt);
      case 0:
        arrayOfByte = TlsUtils.EMPTY_BYTES;
        return selectServerCredentials13(paramArrayOfPrincipal, arrayOfByte);
    } 
    return null;
  }
  
  protected TlsCredentials selectServerCredentials12(Principal[] paramArrayOfPrincipal, int paramInt) throws IOException {
    short s = TlsUtils.getLegacySignatureAlgorithmServer(paramInt);
    SignatureSchemeInfo.PerConnection perConnection = this.jsseSecurityParameters.signatureSchemes;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    for (SignatureSchemeInfo signatureSchemeInfo1 : perConnection.getPeerSigSchemes()) {
      if (!TlsUtils.isValidSignatureSchemeForServerKeyExchange(signatureSchemeInfo1.getSignatureScheme(), paramInt))
        continue; 
      short s1 = signatureSchemeInfo1.getSignatureAlgorithm();
      String str1 = (s == s1) ? JsseUtils.getKeyTypeLegacyServer(paramInt) : signatureSchemeInfo1.getKeyType();
      if (this.keyManagerMissCache.contains(str1) || linkedHashMap.containsKey(str1) || !signatureSchemeInfo1.isSupportedPre13() || !perConnection.hasLocalSignatureScheme(signatureSchemeInfo1))
        continue; 
      linkedHashMap.put(str1, signatureSchemeInfo1);
    } 
    if (linkedHashMap.isEmpty()) {
      if (LOG.isLoggable(Level.FINE))
        LOG.fine(this.serverID + " (1.2) has no key types to try for KeyExchangeAlgorithm " + paramInt); 
      return null;
    } 
    String[] arrayOfString = (String[])linkedHashMap.keySet().toArray((Object[])TlsUtils.EMPTY_STRINGS);
    BCX509Key bCX509Key = this.manager.chooseServerKey(arrayOfString, paramArrayOfPrincipal);
    if (null == bCX509Key) {
      handleKeyManagerMisses((LinkedHashMap)linkedHashMap, (String)null);
      if (LOG.isLoggable(Level.FINE))
        LOG.fine(this.serverID + " (1.2) did not select any credentials for KeyExchangeAlgorithm " + paramInt); 
      return null;
    } 
    String str = bCX509Key.getKeyType();
    handleKeyManagerMisses((LinkedHashMap)linkedHashMap, str);
    SignatureSchemeInfo signatureSchemeInfo = (SignatureSchemeInfo)linkedHashMap.get(str);
    if (null == signatureSchemeInfo)
      throw new TlsFatalAlert((short)80, "Key manager returned invalid key type"); 
    if (LOG.isLoggable(Level.FINE))
      LOG.fine(this.serverID + " (1.2) selected credentials for signature scheme '" + signatureSchemeInfo + "' (keyType '" + str + "'), with private key algorithm '" + JsseUtils.getPrivateKeyAlgorithm(bCX509Key.getPrivateKey()) + "'"); 
    return (TlsCredentials)JsseUtils.createCredentialedSigner((TlsContext)this.context, getCrypto(), bCX509Key, signatureSchemeInfo.getSignatureAndHashAlgorithm());
  }
  
  protected TlsCredentials selectServerCredentials13(Principal[] paramArrayOfPrincipal, byte[] paramArrayOfbyte) throws IOException {
    SignatureSchemeInfo.PerConnection perConnection = this.jsseSecurityParameters.signatureSchemes;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    for (SignatureSchemeInfo signatureSchemeInfo1 : perConnection.getPeerSigSchemes()) {
      String str1 = signatureSchemeInfo1.getKeyType13();
      if (this.keyManagerMissCache.contains(str1) || linkedHashMap.containsKey(str1) || !signatureSchemeInfo1.isSupportedPost13() || !perConnection.hasLocalSignatureScheme(signatureSchemeInfo1))
        continue; 
      linkedHashMap.put(str1, signatureSchemeInfo1);
    } 
    if (linkedHashMap.isEmpty()) {
      if (LOG.isLoggable(Level.FINE))
        LOG.fine(this.serverID + " (1.3) found no usable signature schemes"); 
      return null;
    } 
    String[] arrayOfString = (String[])linkedHashMap.keySet().toArray((Object[])TlsUtils.EMPTY_STRINGS);
    BCX509Key bCX509Key = this.manager.chooseServerKey(arrayOfString, paramArrayOfPrincipal);
    if (null == bCX509Key) {
      handleKeyManagerMisses((LinkedHashMap)linkedHashMap, (String)null);
      if (LOG.isLoggable(Level.FINE))
        LOG.fine(this.serverID + " (1.3) did not select any credentials"); 
      return null;
    } 
    String str = bCX509Key.getKeyType();
    handleKeyManagerMisses((LinkedHashMap)linkedHashMap, str);
    SignatureSchemeInfo signatureSchemeInfo = (SignatureSchemeInfo)linkedHashMap.get(str);
    if (null == signatureSchemeInfo)
      throw new TlsFatalAlert((short)80, "Key manager returned invalid key type"); 
    if (LOG.isLoggable(Level.FINE))
      LOG.fine(this.serverID + " (1.3) selected credentials for signature scheme '" + signatureSchemeInfo + "' (keyType '" + str + "'), with private key algorithm '" + JsseUtils.getPrivateKeyAlgorithm(bCX509Key.getPrivateKey()) + "'"); 
    return (TlsCredentials)JsseUtils.createCredentialedSigner13((TlsContext)this.context, getCrypto(), bCX509Key, signatureSchemeInfo.getSignatureAndHashAlgorithm(), paramArrayOfbyte);
  }
  
  protected TlsCredentials selectServerCredentialsLegacy(Principal[] paramArrayOfPrincipal, int paramInt) throws IOException {
    String str = JsseUtils.getKeyTypeLegacyServer(paramInt);
    if (this.keyManagerMissCache.contains(str))
      return null; 
    BCX509Key bCX509Key = this.manager.chooseServerKey(new String[] { str }, paramArrayOfPrincipal);
    if (null == bCX509Key) {
      this.keyManagerMissCache.add(str);
      return null;
    } 
    return (TlsCredentials)((1 == paramInt) ? JsseUtils.createCredentialedDecryptor(getCrypto(), bCX509Key) : JsseUtils.createCredentialedSigner((TlsContext)this.context, getCrypto(), bCX509Key, null));
  }
  
  private void handleKeyManagerMisses(LinkedHashMap<String, SignatureSchemeInfo> paramLinkedHashMap, String paramString) {
    for (Map.Entry<String, SignatureSchemeInfo> entry : paramLinkedHashMap.entrySet()) {
      String str = (String)entry.getKey();
      if (str.equals(paramString))
        break; 
      this.keyManagerMissCache.add(str);
      if (LOG.isLoggable(Level.FINER)) {
        SignatureSchemeInfo signatureSchemeInfo = (SignatureSchemeInfo)entry.getValue();
        LOG.finer(this.serverID + " found no credentials for signature scheme '" + signatureSchemeInfo + "' (keyType '" + str + "')");
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvTlsServer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */