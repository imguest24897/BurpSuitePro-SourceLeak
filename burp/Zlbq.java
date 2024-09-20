package burp;

public class Zlbq implements Zehc, Zt96 {
  private final Ztqo ZV;
  
  private final Zmsh ZZ;
  
  private static int ZH;
  
  public Zlbq(Ztqo paramZtqo, Zmsh paramZmsh) {
    this.ZV = paramZtqo;
    this.ZZ = paramZmsh;
  }
  
  public Ztk8 Zb() {
    return this.ZV.ZY(this.ZZ);
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_BCheckGenerated;
  }
  
  public String ZU() {
    return this.ZV.Zp().Zb();
  }
  
  public static void ZW(int paramInt) {
    ZH = paramInt;
  }
  
  public static int Z_() {
    return ZH;
  }
  
  public static int ZR() {
    int i = Z_();
    return (i == 0) ? 94 : 0;
  }
  
  static {
    if (Z_() == 0)
      ZW(56); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlbq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */