package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.MessageDigest;
import org.bouncycastle.tls.crypto.TlsHash;

public class JcaTlsHash implements TlsHash {
  private final MessageDigest digest;
  
  public JcaTlsHash(MessageDigest paramMessageDigest) {
    this.digest = paramMessageDigest;
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.digest.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public byte[] calculateHash() {
    return this.digest.digest();
  }
  
  public TlsHash cloneHash() {
    try {
      return new org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsHash((MessageDigest)this.digest.clone());
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new UnsupportedOperationException("unable to clone digest");
    } 
  }
  
  public void reset() {
    this.digest.reset();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsHash.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */