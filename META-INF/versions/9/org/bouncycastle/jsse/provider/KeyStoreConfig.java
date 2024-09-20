package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.KeyStore;

class KeyStoreConfig {
  final KeyStore keyStore;
  
  final char[] password;
  
  KeyStoreConfig(KeyStore paramKeyStore, char[] paramArrayOfchar) {
    this.keyStore = paramKeyStore;
    this.password = paramArrayOfchar;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\KeyStoreConfig.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */