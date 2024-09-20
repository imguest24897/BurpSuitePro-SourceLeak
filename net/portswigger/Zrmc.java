package net.portswigger;

import burp.Zbqc;

public class Zrmc {
  private final Ztj Zw;
  
  private final Zt_ Zp;
  
  private int Z_ = 5000;
  
  private int Zc = 2;
  
  private int ZZ = 5;
  
  private Integer Zi;
  
  private Runnable Zz;
  
  private Runnable Zf;
  
  public Zrmc(Ztj paramZtj, Zt_ paramZt_) {
    String[] arrayOfString = Zi_.Zu();
    this.Zi = null;
    this.Zz = Zrmc::lambda$new$0;
    this.Zf = Zrmc::lambda$new$1;
    this.Zw = paramZtj;
    this.Zp = paramZt_;
    if (Zbqc.Zwu() == null)
      Zi_.ZV(new String[2]); 
  }
  
  public Zrmc Zk(int paramInt) {
    this.Z_ = paramInt;
    return this;
  }
  
  public Zrmc ZH(int paramInt) {
    this.Zc = paramInt;
    return this;
  }
  
  public Zrmc Zs(int paramInt) {
    this.Zi = Integer.valueOf(paramInt);
    return this;
  }
  
  public Zrmc ZX(int paramInt) {
    this.ZZ = paramInt;
    return this;
  }
  
  public Zoo Zp() {
    return new Zoo(this.Zw, this.Zp, this.Z_, this.Zc, this.ZZ, this.Zi, this.Zz, this.Zf);
  }
  
  private static void lambda$new$1() {}
  
  private static void lambda$new$0() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrmc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */