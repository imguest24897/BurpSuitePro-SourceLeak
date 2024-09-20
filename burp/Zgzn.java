package burp;

public class Zgzn {
  private final Zm_c Zf;
  
  private final Zlo1 Zy;
  
  private static String ZM;
  
  public Zgzn(Zm_c paramZm_c, Zlo1 paramZlo1) {
    this.Zf = paramZm_c;
    this.Zy = paramZlo1;
  }
  
  public void ZZ(Zes3 paramZes3) {
    this.Zf.Zp(paramZes3);
    this.Zy.ZJ(paramZes3);
  }
  
  public static void Zu(String paramString) {
    ZM = paramString;
  }
  
  public static String Zq() {
    return ZM;
  }
  
  static {
    if (Zq() == null)
      Zu("OImyBc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgzn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */