package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreParameters;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.asn1.x509.KeyPurposeId;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSNIHostName;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.provider.HostnameUtil;
import org.bouncycastle.jsse.provider.JsseUtils;
import org.bouncycastle.jsse.provider.PKIXUtil;
import org.bouncycastle.jsse.provider.PropertyUtils;
import org.bouncycastle.jsse.provider.ProvAlgorithmChecker;
import org.bouncycastle.jsse.provider.TransportData;
import org.bouncycastle.jsse.provider.X509TrustManagerUtil;
import org.bouncycastle.tls.TlsUtils;

class ProvX509TrustManager extends BCX509ExtendedTrustManager {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.ProvX509TrustManager.class.getName());
  
  private static final boolean provCheckRevocation = PropertyUtils.getBooleanSystemProperty("com.sun.net.ssl.checkRevocation", false);
  
  private static final boolean provTrustManagerCheckEKU = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.trustManager.checkEKU", true);
  
  private static final Map<String, Integer> keyUsagesServer = createKeyUsagesServer();
  
  private final boolean isInFipsMode;
  
  private final JcaJceHelper helper;
  
  private final Set<X509Certificate> trustedCerts;
  
  private final PKIXBuilderParameters pkixParametersTemplate;
  
  private final X509TrustManager exportX509TrustManager;
  
  private static void addKeyUsageServer(Map<String, Integer> paramMap, int paramInt, int... paramVarArgs) {
    for (int i : paramVarArgs) {
      String str = JsseUtils.getAuthTypeServer(i);
      if (null != paramMap.put(str, Integer.valueOf(paramInt)))
        throw new IllegalStateException("Duplicate keys in server key usages"); 
    } 
  }
  
  private static Map<String, Integer> createKeyUsagesServer() {
    HashMap<Object, Object> hashMap = new HashMap<>();
    addKeyUsageServer((Map)hashMap, 0, new int[] { 3, 5, 17, 19, 0 });
    addKeyUsageServer((Map)hashMap, 2, new int[] { 1 });
    addKeyUsageServer((Map)hashMap, 4, new int[] { 7, 9, 16, 18 });
    return (Map)Collections.unmodifiableMap(hashMap);
  }
  
  ProvX509TrustManager(boolean paramBoolean, JcaJceHelper paramJcaJceHelper, Set<TrustAnchor> paramSet) throws InvalidAlgorithmParameterException {
    this.isInFipsMode = paramBoolean;
    this.helper = paramJcaJceHelper;
    this.trustedCerts = getTrustedCerts(paramSet);
    if (this.trustedCerts.isEmpty()) {
      this.pkixParametersTemplate = null;
    } else {
      this.pkixParametersTemplate = new PKIXBuilderParameters(paramSet, null);
      this.pkixParametersTemplate.setRevocationEnabled(provCheckRevocation);
    } 
    this.exportX509TrustManager = X509TrustManagerUtil.exportX509TrustManager(this);
  }
  
  ProvX509TrustManager(boolean paramBoolean, JcaJceHelper paramJcaJceHelper, PKIXParameters paramPKIXParameters) throws InvalidAlgorithmParameterException {
    this.isInFipsMode = paramBoolean;
    this.helper = paramJcaJceHelper;
    this.trustedCerts = getTrustedCerts(paramPKIXParameters.getTrustAnchors());
    if (this.trustedCerts.isEmpty()) {
      this.pkixParametersTemplate = null;
    } else if (paramPKIXParameters instanceof PKIXBuilderParameters) {
      this.pkixParametersTemplate = (PKIXBuilderParameters)paramPKIXParameters;
    } else {
      this.pkixParametersTemplate = new PKIXBuilderParameters(paramPKIXParameters.getTrustAnchors(), paramPKIXParameters.getTargetCertConstraints());
      this.pkixParametersTemplate.setAnyPolicyInhibited(paramPKIXParameters.isAnyPolicyInhibited());
      this.pkixParametersTemplate.setCertPathCheckers(paramPKIXParameters.getCertPathCheckers());
      this.pkixParametersTemplate.setCertStores(paramPKIXParameters.getCertStores());
      this.pkixParametersTemplate.setDate(paramPKIXParameters.getDate());
      this.pkixParametersTemplate.setExplicitPolicyRequired(paramPKIXParameters.isExplicitPolicyRequired());
      this.pkixParametersTemplate.setInitialPolicies(paramPKIXParameters.getInitialPolicies());
      this.pkixParametersTemplate.setPolicyMappingInhibited(paramPKIXParameters.isPolicyMappingInhibited());
      this.pkixParametersTemplate.setPolicyQualifiersRejected(paramPKIXParameters.getPolicyQualifiersRejected());
      this.pkixParametersTemplate.setRevocationEnabled(paramPKIXParameters.isRevocationEnabled());
      this.pkixParametersTemplate.setSigProvider(paramPKIXParameters.getSigProvider());
    } 
    this.exportX509TrustManager = X509TrustManagerUtil.exportX509TrustManager(this);
  }
  
  X509TrustManager getExportX509TrustManager() {
    return this.exportX509TrustManager;
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws CertificateException {
    checkTrusted(paramArrayOfX509Certificate, paramString, null, false);
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, Socket paramSocket) throws CertificateException {
    checkTrusted(paramArrayOfX509Certificate, paramString, TransportData.from(paramSocket), false);
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, SSLEngine paramSSLEngine) throws CertificateException {
    checkTrusted(paramArrayOfX509Certificate, paramString, TransportData.from(paramSSLEngine), false);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws CertificateException {
    checkTrusted(paramArrayOfX509Certificate, paramString, null, true);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, Socket paramSocket) throws CertificateException {
    checkTrusted(paramArrayOfX509Certificate, paramString, TransportData.from(paramSocket), true);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, SSLEngine paramSSLEngine) throws CertificateException {
    checkTrusted(paramArrayOfX509Certificate, paramString, TransportData.from(paramSSLEngine), true);
  }
  
  public X509Certificate[] getAcceptedIssuers() {
    return this.trustedCerts.<X509Certificate>toArray(new X509Certificate[this.trustedCerts.size()]);
  }
  
  private X509Certificate[] buildCertPath(X509Certificate[] paramArrayOfX509Certificate, BCAlgorithmConstraints paramBCAlgorithmConstraints, List<byte[]> paramList) throws GeneralSecurityException {
    CertStore certStore;
    CertPathBuilder certPathBuilder;
    X509Certificate x509Certificate = paramArrayOfX509Certificate[0];
    if (this.trustedCerts.contains(x509Certificate))
      return new X509Certificate[] { x509Certificate }; 
    CertificateFactory certificateFactory = this.helper.createCertificateFactory("X.509");
    Provider provider = certificateFactory.getProvider();
    CertStoreParameters certStoreParameters = getCertStoreParameters(x509Certificate, paramArrayOfX509Certificate);
    try {
      certStore = CertStore.getInstance("Collection", certStoreParameters, provider);
    } catch (GeneralSecurityException generalSecurityException) {
      certStore = CertStore.getInstance("Collection", certStoreParameters);
    } 
    try {
      certPathBuilder = CertPathBuilder.getInstance("PKIX", provider);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      certPathBuilder = CertPathBuilder.getInstance("PKIX");
    } 
    PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters)this.pkixParametersTemplate.clone();
    pKIXBuilderParameters.addCertPathChecker((PKIXCertPathChecker)new ProvAlgorithmChecker(this.isInFipsMode, this.helper, paramBCAlgorithmConstraints));
    pKIXBuilderParameters.addCertStore(certStore);
    pKIXBuilderParameters.setTargetCertConstraints(createTargetCertConstraints(x509Certificate, pKIXBuilderParameters.getTargetCertConstraints()));
    if (!paramList.isEmpty())
      addStatusResponses(certPathBuilder, pKIXBuilderParameters, paramArrayOfX509Certificate, paramList); 
    PKIXCertPathBuilderResult pKIXCertPathBuilderResult = (PKIXCertPathBuilderResult)certPathBuilder.build(pKIXBuilderParameters);
    return getTrustedChain(pKIXCertPathBuilderResult.getCertPath(), pKIXCertPathBuilderResult.getTrustAnchor());
  }
  
  private void checkTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString, TransportData paramTransportData, boolean paramBoolean) throws CertificateException {
    if (TlsUtils.isNullOrEmpty((Object[])paramArrayOfX509Certificate))
      throw new IllegalArgumentException("'chain' must be a chain of at least one certificate"); 
    if (TlsUtils.isNullOrEmpty(paramString))
      throw new IllegalArgumentException("'authType' must be a non-null, non-empty string"); 
    if (null == this.pkixParametersTemplate)
      throw new CertificateException("Unable to build a CertPath: no PKIXBuilderParameters available"); 
    X509Certificate[] arrayOfX509Certificate = validateChain(paramArrayOfX509Certificate, paramString, paramTransportData, paramBoolean);
    checkExtendedTrust(arrayOfX509Certificate, paramTransportData, paramBoolean);
  }
  
  private CertStoreParameters getCertStoreParameters(X509Certificate paramX509Certificate, X509Certificate[] paramArrayOfX509Certificate) {
    ArrayList<X509Certificate> arrayList = new ArrayList(paramArrayOfX509Certificate.length);
    arrayList.add(paramX509Certificate);
    for (byte b = 1; b < paramArrayOfX509Certificate.length; b++) {
      if (!this.trustedCerts.contains(paramArrayOfX509Certificate[b]))
        arrayList.add(paramArrayOfX509Certificate[b]); 
    } 
    return new CollectionCertStoreParameters(Collections.unmodifiableCollection(arrayList));
  }
  
  private X509Certificate[] validateChain(X509Certificate[] paramArrayOfX509Certificate, String paramString, TransportData paramTransportData, boolean paramBoolean) throws CertificateException {
    try {
      BCAlgorithmConstraints bCAlgorithmConstraints = TransportData.getAlgorithmConstraints(paramTransportData, false);
      List<byte[]> list = TransportData.getStatusResponses(paramTransportData);
      X509Certificate[] arrayOfX509Certificate = buildCertPath(paramArrayOfX509Certificate, bCAlgorithmConstraints, list);
      KeyPurposeId keyPurposeId = getRequiredExtendedKeyUsage(paramBoolean);
      int i = getRequiredKeyUsage(paramBoolean, paramString);
      ProvAlgorithmChecker.checkCertPathExtras(this.helper, bCAlgorithmConstraints, arrayOfX509Certificate, keyPurposeId, i);
      return arrayOfX509Certificate;
    } catch (CertificateException certificateException) {
      throw certificateException;
    } catch (GeneralSecurityException generalSecurityException) {
      throw new CertificateException("Unable to construct a valid chain", generalSecurityException);
    } 
  }
  
  static void checkEndpointID(String paramString1, X509Certificate paramX509Certificate, String paramString2) throws CertificateException {
    paramString1 = JsseUtils.stripSquareBrackets(paramString1);
    if (paramString2.equalsIgnoreCase("HTTPS")) {
      HostnameUtil.checkHostname(paramString1, paramX509Certificate, true);
    } else if (paramString2.equalsIgnoreCase("LDAP") || paramString2.equalsIgnoreCase("LDAPS")) {
      HostnameUtil.checkHostname(paramString1, paramX509Certificate, false);
    } else {
      throw new CertificateException("Unknown endpoint ID algorithm: " + paramString2);
    } 
  }
  
  static void checkExtendedTrust(X509Certificate[] paramArrayOfX509Certificate, TransportData paramTransportData, boolean paramBoolean) throws CertificateException {
    if (null != paramTransportData) {
      BCSSLParameters bCSSLParameters = paramTransportData.getParameters();
      String str = bCSSLParameters.getEndpointIdentificationAlgorithm();
      if (JsseUtils.isNameSpecified(str)) {
        BCExtendedSSLSession bCExtendedSSLSession = paramTransportData.getHandshakeSession();
        if (null == bCExtendedSSLSession)
          throw new CertificateException("No handshake session"); 
        checkEndpointID(paramArrayOfX509Certificate[0], str, paramBoolean, bCExtendedSSLSession);
      } 
    } 
  }
  
  static KeyPurposeId getRequiredExtendedKeyUsage(boolean paramBoolean) {
    return !provTrustManagerCheckEKU ? null : (paramBoolean ? KeyPurposeId.id_kp_serverAuth : KeyPurposeId.id_kp_clientAuth);
  }
  
  static int getRequiredKeyUsage(boolean paramBoolean, String paramString) throws CertificateException {
    if (!paramBoolean)
      return 0; 
    Integer integer = keyUsagesServer.get(paramString);
    if (null == integer)
      throw new CertificateException("Unsupported server authType: " + paramString); 
    return integer.intValue();
  }
  
  private static void addStatusResponses(CertPathBuilder paramCertPathBuilder, PKIXBuilderParameters paramPKIXBuilderParameters, X509Certificate[] paramArrayOfX509Certificate, List<byte[]> paramList) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    int i = Math.min(paramArrayOfX509Certificate.length, paramList.size());
    for (byte b = 0; b < i; b++) {
      byte[] arrayOfByte = paramList.get(b);
      if (null != arrayOfByte && arrayOfByte.length > 0) {
        X509Certificate x509Certificate = paramArrayOfX509Certificate[b];
        if (!hashMap.containsKey(x509Certificate))
          hashMap.put(x509Certificate, arrayOfByte); 
      } 
    } 
    if (!hashMap.isEmpty())
      try {
        PKIXUtil.addStatusResponses(paramCertPathBuilder, paramPKIXBuilderParameters, hashMap);
      } catch (RuntimeException runtimeException) {
        LOG.log(Level.FINE, "Failed to add status responses for revocation checking", runtimeException);
      }  
  }
  
  private static void checkEndpointID(X509Certificate paramX509Certificate, String paramString, boolean paramBoolean, BCExtendedSSLSession paramBCExtendedSSLSession) throws CertificateException {
    String str = paramBCExtendedSSLSession.getPeerHost();
    if (paramBoolean) {
      BCSNIHostName bCSNIHostName = JsseUtils.getSNIHostName(paramBCExtendedSSLSession.getRequestedServerNames());
      if (null != bCSNIHostName) {
        String str1 = bCSNIHostName.getAsciiName();
        if (!str1.equalsIgnoreCase(str))
          try {
            checkEndpointID(str1, paramX509Certificate, paramString);
            return;
          } catch (CertificateException certificateException) {
            LOG.log(Level.FINE, "Server's endpoint ID did not match the SNI host_name: " + str1, certificateException);
          }  
      } 
    } 
    checkEndpointID(str, paramX509Certificate, paramString);
  }
  
  private static X509CertSelector createTargetCertConstraints(X509Certificate paramX509Certificate, CertSelector paramCertSelector) {
    return (X509CertSelector)new Object(paramX509Certificate, paramCertSelector);
  }
  
  private static X509Certificate getTrustedCert(TrustAnchor paramTrustAnchor) throws CertificateException {
    X509Certificate x509Certificate = paramTrustAnchor.getTrustedCert();
    if (null == x509Certificate)
      throw new CertificateException("No certificate for TrustAnchor"); 
    return x509Certificate;
  }
  
  private static Set<X509Certificate> getTrustedCerts(Set<TrustAnchor> paramSet) {
    HashSet<X509Certificate> hashSet = new HashSet(paramSet.size());
    for (TrustAnchor trustAnchor : paramSet) {
      if (null != trustAnchor) {
        X509Certificate x509Certificate = trustAnchor.getTrustedCert();
        if (null != x509Certificate)
          hashSet.add(x509Certificate); 
      } 
    } 
    return hashSet;
  }
  
  private static X509Certificate[] getTrustedChain(CertPath paramCertPath, TrustAnchor paramTrustAnchor) throws CertificateException {
    List<? extends Certificate> list = paramCertPath.getCertificates();
    X509Certificate[] arrayOfX509Certificate = new X509Certificate[list.size() + 1];
    list.toArray(arrayOfX509Certificate);
    arrayOfX509Certificate[arrayOfX509Certificate.length - 1] = getTrustedCert(paramTrustAnchor);
    return arrayOfX509Certificate;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvX509TrustManager.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */