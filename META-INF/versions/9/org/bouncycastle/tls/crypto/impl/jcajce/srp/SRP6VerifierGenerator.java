package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce.srp;

import java.math.BigInteger;
import org.bouncycastle.tls.crypto.SRP6Group;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.tls.crypto.impl.jcajce.srp.SRP6Util;

public class SRP6VerifierGenerator {
  protected BigInteger N;
  
  protected BigInteger g;
  
  protected TlsHash digest;
  
  public void init(BigInteger paramBigInteger1, BigInteger paramBigInteger2, TlsHash paramTlsHash) {
    this.N = paramBigInteger1;
    this.g = paramBigInteger2;
    this.digest = paramTlsHash;
  }
  
  public void init(SRP6Group paramSRP6Group, TlsHash paramTlsHash) {
    this.N = paramSRP6Group.getN();
    this.g = paramSRP6Group.getG();
    this.digest = paramTlsHash;
  }
  
  public BigInteger generateVerifier(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    BigInteger bigInteger = SRP6Util.calculateX(this.digest, this.N, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3);
    return this.g.modPow(bigInteger, this.N);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\srp\SRP6VerifierGenerator.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */