package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

abstract class KeyStoreUtil {
  static Key getKey(KeyStore paramKeyStore, String paramString, KeyStore.ProtectionParameter paramProtectionParameter) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
    if (null == paramProtectionParameter)
      throw new UnrecoverableKeyException("requested key requires a password"); 
    if (paramProtectionParameter instanceof KeyStore.PasswordProtection) {
      KeyStore.PasswordProtection passwordProtection = (KeyStore.PasswordProtection)paramProtectionParameter;
      if (null != passwordProtection.getProtectionAlgorithm())
        throw new KeyStoreException("unsupported password protection algorithm"); 
      return paramKeyStore.getKey(paramString, passwordProtection.getPassword());
    } 
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\KeyStoreUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */