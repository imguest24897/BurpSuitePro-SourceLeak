package org.bouncycastle.tls.crypto;

import java.math.BigInteger;

public class TlsSRPConfig {
  protected BigInteger[] explicitNG;
  
  public BigInteger[] getExplicitNG() {
    return (BigInteger[])this.explicitNG.clone();
  }
  
  public void setExplicitNG(BigInteger[] paramArrayOfBigInteger) {
    this.explicitNG = (BigInteger[])paramArrayOfBigInteger.clone();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsSRPConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */