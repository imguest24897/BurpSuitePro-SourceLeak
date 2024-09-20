package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchProviderException;
import java.security.cert.CertPathParameters;
import java.security.cert.Certificate;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.CertPathTrustManagerParameters;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactorySpi;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jsse.provider.PropertyUtils;
import org.bouncycastle.jsse.provider.ProvX509TrustManager;
import org.bouncycastle.tls.TlsUtils;

class ProvTrustManagerFactorySpi extends TrustManagerFactorySpi {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.ProvTrustManagerFactorySpi.class.getName());
  
  private static final boolean provKeyStoreTypeCompat = PropertyUtils.getBooleanSecurityProperty("keystore.type.compat", false);
  
  protected final boolean isInFipsMode;
  
  protected final JcaJceHelper helper;
  
  protected ProvX509TrustManager x509TrustManager;
  
  static KeyStore getDefaultTrustStore() throws Exception {
    String str1 = KeyStore.getDefaultType();
    boolean bool = (provKeyStoreTypeCompat && "pkcs12".equalsIgnoreCase(str1)) ? true : false;
    String str2 = null;
    char[] arrayOfChar = null;
    String str3 = PropertyUtils.getStringSystemProperty("javax.net.ssl.trustStore");
    if (!"NONE".equals(str3))
      if (null != str3) {
        if ((new File(str3)).exists())
          str2 = str3; 
      } else {
        String str = PropertyUtils.getStringSystemProperty("java.home");
        if (null != str) {
          String str5 = str + str;
          if ((new File(str5)).exists()) {
            if (bool)
              str1 = "jks"; 
            str2 = str5;
          } else {
            String str6 = str + str;
            if ((new File(str6)).exists()) {
              if (bool)
                str1 = "jks"; 
              str2 = str6;
            } 
          } 
        } 
      }  
    KeyStore keyStore = createTrustStore(str1);
    String str4 = PropertyUtils.getSensitiveStringSystemProperty("javax.net.ssl.trustStorePassword");
    if (null != str4)
      arrayOfChar = str4.toCharArray(); 
    BufferedInputStream bufferedInputStream = null;
    try {
      if (null == str2) {
        LOG.config("Initializing default trust store as empty");
      } else {
        LOG.config("Initializing default trust store from path: " + str2);
        bufferedInputStream = new BufferedInputStream(new FileInputStream(str2));
      } 
      try {
        keyStore.load(bufferedInputStream, arrayOfChar);
      } catch (NullPointerException nullPointerException) {
        keyStore = KeyStore.getInstance("BCFKS");
        keyStore.load(null, null);
      } 
    } finally {
      if (null != bufferedInputStream)
        bufferedInputStream.close(); 
    } 
    return keyStore;
  }
  
  ProvTrustManagerFactorySpi(boolean paramBoolean, JcaJceHelper paramJcaJceHelper) {
    this.isInFipsMode = paramBoolean;
    this.helper = paramJcaJceHelper;
  }
  
  protected TrustManager[] engineGetTrustManagers() {
    if (null == this.x509TrustManager)
      throw new IllegalStateException("TrustManagerFactory not initialized"); 
    return new TrustManager[] { this.x509TrustManager.getExportX509TrustManager() };
  }
  
  protected void engineInit(KeyStore paramKeyStore) throws KeyStoreException {
    if (null == paramKeyStore)
      try {
        paramKeyStore = getDefaultTrustStore();
      } catch (SecurityException securityException) {
        LOG.log(Level.WARNING, "Skipped default trust store", securityException);
      } catch (Error error) {
        LOG.log(Level.WARNING, "Skipped default trust store", error);
        throw error;
      } catch (RuntimeException runtimeException) {
        LOG.log(Level.WARNING, "Skipped default trust store", runtimeException);
        throw runtimeException;
      } catch (Exception exception) {
        LOG.log(Level.WARNING, "Skipped default trust store", exception);
        throw new KeyStoreException("Failed to load default trust store", exception);
      }  
    Set<TrustAnchor> set = getTrustAnchors(paramKeyStore);
    try {
      this.x509TrustManager = new ProvX509TrustManager(this.isInFipsMode, this.helper, set);
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
      throw new KeyStoreException("Failed to create trust manager", invalidAlgorithmParameterException);
    } 
  }
  
  protected void engineInit(ManagerFactoryParameters paramManagerFactoryParameters) throws InvalidAlgorithmParameterException {
    if (paramManagerFactoryParameters instanceof CertPathTrustManagerParameters) {
      CertPathParameters certPathParameters = ((CertPathTrustManagerParameters)paramManagerFactoryParameters).getParameters();
      if (!(certPathParameters instanceof PKIXParameters))
        throw new InvalidAlgorithmParameterException("parameters must inherit from PKIXParameters"); 
      this.x509TrustManager = new ProvX509TrustManager(this.isInFipsMode, this.helper, (PKIXParameters)certPathParameters);
    } else {
      if (null == paramManagerFactoryParameters)
        throw new InvalidAlgorithmParameterException("spec cannot be null"); 
      throw new InvalidAlgorithmParameterException("unknown spec: " + paramManagerFactoryParameters.getClass().getName());
    } 
  }
  
  private static void collectTrustAnchor(Set<TrustAnchor> paramSet, Certificate paramCertificate) {
    if (paramCertificate instanceof X509Certificate)
      paramSet.add(new TrustAnchor((X509Certificate)paramCertificate, null)); 
  }
  
  private static KeyStore createTrustStore(String paramString) throws NoSuchProviderException, KeyStoreException {
    String str1 = getTrustStoreType(paramString);
    String str2 = PropertyUtils.getStringSystemProperty("javax.net.ssl.trustStoreProvider");
    return TlsUtils.isNullOrEmpty(str2) ? KeyStore.getInstance(str1) : KeyStore.getInstance(str1, str2);
  }
  
  private static Set<TrustAnchor> getTrustAnchors(KeyStore paramKeyStore) throws KeyStoreException {
    if (null == paramKeyStore)
      return Collections.emptySet(); 
    HashSet<TrustAnchor> hashSet = new HashSet();
    Enumeration<String> enumeration = paramKeyStore.aliases();
    while (enumeration.hasMoreElements()) {
      String str = enumeration.nextElement();
      if (paramKeyStore.isCertificateEntry(str)) {
        collectTrustAnchor(hashSet, paramKeyStore.getCertificate(str));
        continue;
      } 
      if (paramKeyStore.isKeyEntry(str)) {
        Certificate[] arrayOfCertificate = paramKeyStore.getCertificateChain(str);
        if (null != arrayOfCertificate && arrayOfCertificate.length > 0)
          collectTrustAnchor(hashSet, arrayOfCertificate[0]); 
      } 
    } 
    return hashSet;
  }
  
  private static String getTrustStoreType(String paramString) {
    String str = PropertyUtils.getStringSystemProperty("javax.net.ssl.trustStoreType");
    return (null == str) ? paramString : str;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvTrustManagerFactorySpi.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */