package org.bouncycastle.crypto.modes.gcm;

public class BasicGCMMultiplier implements GCMMultiplier {
  private long[] H;
  
  public void init(byte[] paramArrayOfbyte) {
    this.H = GCMUtil.asLongs(paramArrayOfbyte);
  }
  
  public void multiplyH(byte[] paramArrayOfbyte) {
    GCMUtil.multiply(paramArrayOfbyte, this.H);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\modes\gcm\BasicGCMMultiplier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */