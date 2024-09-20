package burp;

public class Zs4e implements Zkrr, Zt96 {
  private final Zgic Zv;
  
  private final Zt25 Zn;
  
  private static String Zq;
  
  public Zs4e(Zgic paramZgic, Zt25 paramZt25) {
    this.Zv = paramZgic;
    this.Zn = paramZt25;
  }
  
  public Zbsl Zp() {
    return Zbsl.APR_BCheckGenerated;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    this.Zn.ZX(this.Zv, paramZrj, paramZtpx, paramZz4_);
  }
  
  public String ZU() {
    return this.Zn.Zp().Zb();
  }
  
  public static void Za(String paramString) {
    Zq = paramString;
  }
  
  public static String ZJ() {
    return Zq;
  }
  
  static {
    if (ZJ() != null)
      Za("ZrlE8"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs4e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */