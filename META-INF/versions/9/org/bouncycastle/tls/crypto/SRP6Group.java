package META-INF.versions.9.org.bouncycastle.tls.crypto;

import java.math.BigInteger;

public class SRP6Group {
  private BigInteger N;
  
  private BigInteger g;
  
  public SRP6Group(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    this.N = paramBigInteger1;
    this.g = paramBigInteger2;
  }
  
  public BigInteger getG() {
    return this.g;
  }
  
  public BigInteger getN() {
    return this.N;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\SRP6Group.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */