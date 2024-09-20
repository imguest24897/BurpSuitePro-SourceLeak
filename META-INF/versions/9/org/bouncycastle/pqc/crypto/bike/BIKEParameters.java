package META-INF.versions.9.org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.pqc.crypto.KEMParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEEngine;

public class BIKEParameters implements KEMParameters {
  public static final org.bouncycastle.pqc.crypto.bike.BIKEParameters bike128 = new org.bouncycastle.pqc.crypto.bike.BIKEParameters("bike128", 12323, 142, 134, 256, 5, 3, 128);
  
  public static final org.bouncycastle.pqc.crypto.bike.BIKEParameters bike192 = new org.bouncycastle.pqc.crypto.bike.BIKEParameters("bike192", 24659, 206, 199, 256, 5, 3, 192);
  
  public static final org.bouncycastle.pqc.crypto.bike.BIKEParameters bike256 = new org.bouncycastle.pqc.crypto.bike.BIKEParameters("bike256", 40973, 274, 264, 256, 5, 3, 256);
  
  private String name;
  
  private int r;
  
  private int w;
  
  private int t;
  
  private int l;
  
  private int nbIter;
  
  private int tau;
  
  private final int defaultKeySize;
  
  private BIKEEngine bikeEngine;
  
  private BIKEParameters(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    this.name = paramString;
    this.r = paramInt1;
    this.w = paramInt2;
    this.t = paramInt3;
    this.l = paramInt4;
    this.nbIter = paramInt5;
    this.tau = paramInt6;
    this.defaultKeySize = paramInt7;
    this.bikeEngine = new BIKEEngine(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  public int getR() {
    return this.r;
  }
  
  public int getRByte() {
    return (this.r + 7) / 8;
  }
  
  public int getLByte() {
    return this.l / 8;
  }
  
  public int getW() {
    return this.w;
  }
  
  public int getT() {
    return this.t;
  }
  
  public int getL() {
    return this.l;
  }
  
  public int getNbIter() {
    return this.nbIter;
  }
  
  public int getTau() {
    return this.tau;
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getSessionKeySize() {
    return this.defaultKeySize;
  }
  
  BIKEEngine getEngine() {
    return this.bikeEngine;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\bike\BIKEParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */