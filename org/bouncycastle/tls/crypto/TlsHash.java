package org.bouncycastle.tls.crypto;

public interface TlsHash {
  void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  byte[] calculateHash();
  
  TlsHash cloneHash();
  
  void reset();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsHash.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */