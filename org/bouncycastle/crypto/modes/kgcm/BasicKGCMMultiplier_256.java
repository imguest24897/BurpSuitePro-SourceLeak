package org.bouncycastle.crypto.modes.kgcm;

public class BasicKGCMMultiplier_256 implements KGCMMultiplier {
  private final long[] H = new long[4];
  
  public void init(long[] paramArrayOflong) {
    KGCMUtil_256.copy(paramArrayOflong, this.H);
  }
  
  public void multiplyH(long[] paramArrayOflong) {
    KGCMUtil_256.multiply(paramArrayOflong, this.H, paramArrayOflong);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\modes\kgcm\BasicKGCMMultiplier_256.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */