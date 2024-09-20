package META-INF.versions.9.org.bouncycastle.tls.crypto;

public interface TlsHash {
  void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  byte[] calculateHash();
  
  org.bouncycastle.tls.crypto.TlsHash cloneHash();
  
  void reset();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\TlsHash.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */