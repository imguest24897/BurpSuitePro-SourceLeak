package org.bouncycastle.jsse.provider;

import java.lang.reflect.Method;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

abstract class KeyStoreUtil {
  private static final Method getProtectionAlgorithm = ReflectionUtil.getMethod("java.security.KeyStore$PasswordProtection", "getProtectionAlgorithm", new Class[0]);
  
  static Key getKey(KeyStore paramKeyStore, String paramString, KeyStore.ProtectionParameter paramProtectionParameter) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
    if (null == paramProtectionParameter)
      throw new UnrecoverableKeyException("requested key requires a password"); 
    if (paramProtectionParameter instanceof KeyStore.PasswordProtection) {
      KeyStore.PasswordProtection passwordProtection = (KeyStore.PasswordProtection)paramProtectionParameter;
      if (null != getProtectionAlgorithm && null != ReflectionUtil.invokeGetter(passwordProtection, getProtectionAlgorithm))
        throw new KeyStoreException("unsupported password protection algorithm"); 
      return paramKeyStore.getKey(paramString, passwordProtection.getPassword());
    } 
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\KeyStoreUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */