package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.util.List;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.KeyStoreBuilderParameters;
import javax.net.ssl.ManagerFactoryParameters;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jsse.BCX509ExtendedKeyManager;
import org.bouncycastle.jsse.provider.KeyStoreConfig;
import org.bouncycastle.jsse.provider.PropertyUtils;
import org.bouncycastle.jsse.provider.ProvX509KeyManager;
import org.bouncycastle.jsse.provider.ProvX509KeyManagerSimple;
import org.bouncycastle.tls.TlsUtils;

class ProvKeyManagerFactorySpi extends KeyManagerFactorySpi {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.ProvKeyManagerFactorySpi.class.getName());
  
  protected final boolean isInFipsMode;
  
  protected final JcaJceHelper helper;
  
  protected BCX509ExtendedKeyManager x509KeyManager;
  
  static KeyStoreConfig getDefaultKeyStore() throws Exception {
    String str1 = KeyStore.getDefaultType();
    String str2 = null;
    char[] arrayOfChar = null;
    String str3 = PropertyUtils.getStringSystemProperty("javax.net.ssl.keyStore");
    if (!"NONE".equals(str3) && null != str3 && (new File(str3)).exists())
      str2 = str3; 
    KeyStore keyStore = createKeyStore(str1);
    String str4 = PropertyUtils.getSensitiveStringSystemProperty("javax.net.ssl.keyStorePassword");
    if (null != str4)
      arrayOfChar = str4.toCharArray(); 
    BufferedInputStream bufferedInputStream = null;
    try {
      if (null == str2) {
        LOG.config("Initializing default key store as empty");
      } else {
        LOG.config("Initializing default key store from path: " + str2);
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
    return new KeyStoreConfig(keyStore, arrayOfChar);
  }
  
  ProvKeyManagerFactorySpi(boolean paramBoolean, JcaJceHelper paramJcaJceHelper) {
    this.isInFipsMode = paramBoolean;
    this.helper = paramJcaJceHelper;
  }
  
  protected KeyManager[] engineGetKeyManagers() {
    if (null == this.x509KeyManager)
      throw new IllegalStateException("KeyManagerFactory not initialized"); 
    return new KeyManager[] { (KeyManager)this.x509KeyManager };
  }
  
  protected void engineInit(KeyStore paramKeyStore, char[] paramArrayOfchar) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
    this.x509KeyManager = (BCX509ExtendedKeyManager)new ProvX509KeyManagerSimple(this.isInFipsMode, this.helper, paramKeyStore, paramArrayOfchar);
  }
  
  protected void engineInit(ManagerFactoryParameters paramManagerFactoryParameters) throws InvalidAlgorithmParameterException {
    if (paramManagerFactoryParameters instanceof KeyStoreBuilderParameters) {
      List<KeyStore.Builder> list = ((KeyStoreBuilderParameters)paramManagerFactoryParameters).getParameters();
      this.x509KeyManager = (BCX509ExtendedKeyManager)new ProvX509KeyManager(this.isInFipsMode, this.helper, list);
    } else {
      throw new InvalidAlgorithmParameterException("Parameters must be instance of KeyStoreBuilderParameters");
    } 
  }
  
  private static KeyStore createKeyStore(String paramString) throws NoSuchProviderException, KeyStoreException {
    String str1 = getKeyStoreType(paramString);
    String str2 = PropertyUtils.getStringSystemProperty("javax.net.ssl.keyStoreProvider");
    return TlsUtils.isNullOrEmpty(str2) ? KeyStore.getInstance(str1) : KeyStore.getInstance(str1, str2);
  }
  
  private static String getKeyStoreType(String paramString) {
    String str = PropertyUtils.getStringSystemProperty("javax.net.ssl.keyStoreType");
    return (null == str) ? paramString : str;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvKeyManagerFactorySpi.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */