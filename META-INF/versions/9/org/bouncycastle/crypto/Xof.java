package META-INF.versions.9.org.bouncycastle.crypto;

import org.bouncycastle.crypto.ExtendedDigest;

public interface Xof extends ExtendedDigest {
  int doFinal(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  int doOutput(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\Xof.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */