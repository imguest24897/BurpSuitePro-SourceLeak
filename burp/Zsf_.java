package burp;

public class Zsf_ implements Zm9n, Zt96 {
  private final Zgic ZY;
  
  private final Zt25 ZO;
  
  private static boolean Zv;
  
  public Zsf_(Zgic paramZgic, Zt25 paramZt25) {
    this.ZY = paramZgic;
    this.ZO = paramZt25;
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_BCheckGenerated;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    if (this.ZO.Zl(this.ZY.ZC()))
      this.ZO.ZX(this.ZY, paramZrj, paramZtpx, paramZz4_); 
  }
  
  public String ZU() {
    return this.ZO.Zp().Zb();
  }
  
  public static void Zz(boolean paramBoolean) {
    Zv = paramBoolean;
  }
  
  public static boolean Zs() {
    return Zv;
  }
  
  public static boolean Zb() {
    boolean bool = Zs();
    return !bool;
  }
  
  static {
    if (Zs())
      Zz(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsf_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */