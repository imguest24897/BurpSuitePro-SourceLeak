package burp;

public class Zr8i implements Zkrr {
  private final Zgic ZR;
  
  private final Zt25 Zw;
  
  private static boolean Zt;
  
  public Zr8i(Zgic paramZgic, Zt25 paramZt25) {
    this.ZR = paramZgic;
    this.Zw = paramZt25;
  }
  
  public Zbsl Zp() {
    return Zbsl.APP_BCheckGenerated;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    this.Zw.ZX(this.ZR, paramZrj, paramZtpx, paramZz4_);
  }
  
  public static void ZP(boolean paramBoolean) {
    Zt = paramBoolean;
  }
  
  public static boolean ZR() {
    return Zt;
  }
  
  public static boolean Zf() {
    boolean bool = ZR();
    return !bool;
  }
  
  static {
    if (!Zf())
      ZP(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr8i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */