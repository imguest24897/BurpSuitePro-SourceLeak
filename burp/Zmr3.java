package burp;

public class Zmr3 {
  private final Zz1v ZS;
  
  private static String[] ZJ;
  
  public Zmr3(Zz1v paramZz1v) {
    this.ZS = paramZz1v;
  }
  
  public Zkrp Zj() {
    return new Zkrp(this.ZS);
  }
  
  public static void ZR(String[] paramArrayOfString) {
    ZJ = paramArrayOfString;
  }
  
  public static String[] ZI() {
    return ZJ;
  }
  
  static {
    if (ZI() == null)
      ZR(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmr3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */