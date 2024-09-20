package burp;

public class Zs_g {
  private final Zrp0 Zn;
  
  private Zszw ZP = null;
  
  private boolean ZX = false;
  
  private static String Zu;
  
  private Zs_g(Zrp0 paramZrp0) {
    this.Zn = paramZrp0;
  }
  
  public static Zs_g Zw(Zrp0 paramZrp0) {
    return new Zs_g(paramZrp0);
  }
  
  public Zs_g Z_(Zszw paramZszw) {
    this.ZP = paramZszw;
    return this;
  }
  
  public Zs_g ZF() {
    this.ZX = true;
    return this;
  }
  
  public Zrp0 ZZ() {
    return this.Zn;
  }
  
  Zszw Zt() {
    return this.ZP;
  }
  
  boolean Zn() {
    return this.ZX;
  }
  
  public static void Zc(String paramString) {
    Zu = paramString;
  }
  
  public static String Zq() {
    return Zu;
  }
  
  static {
    if (Zq() != null)
      Zc("HRHNGb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */