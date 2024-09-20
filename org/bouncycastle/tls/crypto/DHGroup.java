package org.bouncycastle.tls.crypto;

import java.math.BigInteger;

public class DHGroup {
  private final BigInteger g;
  
  private final BigInteger p;
  
  private final BigInteger q;
  
  private final int l;
  
  public DHGroup(BigInteger paramBigInteger1, BigInteger paramBigInteger2, BigInteger paramBigInteger3, int paramInt) {
    this.p = paramBigInteger1;
    this.g = paramBigInteger3;
    this.q = paramBigInteger2;
    this.l = paramInt;
  }
  
  public BigInteger getG() {
    return this.g;
  }
  
  public int getL() {
    return this.l;
  }
  
  public BigInteger getP() {
    return this.p;
  }
  
  public BigInteger getQ() {
    return this.q;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\DHGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */