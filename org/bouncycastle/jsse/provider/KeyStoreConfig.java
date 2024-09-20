package org.bouncycastle.jsse.provider;

import java.security.KeyStore;

class KeyStoreConfig {
  final KeyStore keyStore;
  
  final char[] password;
  
  KeyStoreConfig(KeyStore paramKeyStore, char[] paramArrayOfchar) {
    this.keyStore = paramKeyStore;
    this.password = paramArrayOfchar;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\KeyStoreConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */