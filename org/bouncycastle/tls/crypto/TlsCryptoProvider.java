package org.bouncycastle.tls.crypto;

import java.security.SecureRandom;

public interface TlsCryptoProvider {
  TlsCrypto create(SecureRandom paramSecureRandom);
  
  TlsCrypto create(SecureRandom paramSecureRandom1, SecureRandom paramSecureRandom2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsCryptoProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */