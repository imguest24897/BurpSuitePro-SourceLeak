package META-INF.versions.9.org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.picnic.LowmcConstants;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

public class PicnicParameters implements CipherParameters {
  public static final org.bouncycastle.pqc.crypto.picnic.PicnicParameters picnicl1fs = new org.bouncycastle.pqc.crypto.picnic.PicnicParameters("picnicl1fs", 1);
  
  public static final org.bouncycastle.pqc.crypto.picnic.PicnicParameters picnicl1ur = new org.bouncycastle.pqc.crypto.picnic.PicnicParameters("picnicl1ur", 2);
  
  public static final org.bouncycastle.pqc.crypto.picnic.PicnicParameters picnicl3fs = new org.bouncycastle.pqc.crypto.picnic.PicnicParameters("picnicl3fs", 3);
  
  public static final org.bouncycastle.pqc.crypto.picnic.PicnicParameters picnicl3ur = new org.bouncycastle.pqc.crypto.picnic.PicnicParameters("picnicl3ur", 4);
  
  public static final org.bouncycastle.pqc.crypto.picnic.PicnicParameters picnicl5fs = new org.bouncycastle.pqc.crypto.picnic.PicnicParameters("picnicl5fs", 5);
  
  public static final org.bouncycastle.pqc.crypto.picnic.PicnicParameters picnicl5ur = new org.bouncycastle.pqc.crypto.picnic.PicnicParameters("picnicl5ur", 6);
  
  public static final org.bouncycastle.pqc.crypto.picnic.PicnicParameters picnic3l1 = new org.bouncycastle.pqc.crypto.picnic.PicnicParameters("picnic3l1", 7);
  
  public static final org.bouncycastle.pqc.crypto.picnic.PicnicParameters picnic3l3 = new org.bouncycastle.pqc.crypto.picnic.PicnicParameters("picnic3l3", 8);
  
  public static final org.bouncycastle.pqc.crypto.picnic.PicnicParameters picnic3l5 = new org.bouncycastle.pqc.crypto.picnic.PicnicParameters("picnic3l5", 9);
  
  public static final org.bouncycastle.pqc.crypto.picnic.PicnicParameters picnicl1full = new org.bouncycastle.pqc.crypto.picnic.PicnicParameters("picnicl1full", 10);
  
  public static final org.bouncycastle.pqc.crypto.picnic.PicnicParameters picnicl3full = new org.bouncycastle.pqc.crypto.picnic.PicnicParameters("picnicl3full", 11);
  
  public static final org.bouncycastle.pqc.crypto.picnic.PicnicParameters picnicl5full = new org.bouncycastle.pqc.crypto.picnic.PicnicParameters("picnicl5full", 12);
  
  private final String name;
  
  private final int param;
  
  private PicnicParameters(String paramString, int paramInt) {
    this.name = paramString;
    this.param = paramInt;
  }
  
  public String getName() {
    return this.name;
  }
  
  PicnicEngine getEngine() {
    switch (this.param) {
      case 1:
      case 2:
      case 7:
      case 10:
        return new PicnicEngine(this.param, (LowmcConstants)L1Constants.INSTANCE);
      case 3:
      case 4:
      case 8:
      case 11:
        return new PicnicEngine(this.param, (LowmcConstants)L3Constants.INSTANCE);
      case 5:
      case 6:
      case 9:
      case 12:
        return new PicnicEngine(this.param, (LowmcConstants)L5Constants.INSTANCE);
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\picnic\PicnicParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */