package burp;

public class Zsmw {
  private final boolean ZH;
  
  private static String[] ZW;
  
  static Zsmw ZR() {
    return new Zsmw(false);
  }
  
  static Zsmw ZY() {
    return new Zsmw(true);
  }
  
  Zsmw(boolean paramBoolean) {
    this.ZH = paramBoolean;
  }
  
  public boolean ZV() {
    return this.ZH;
  }
  
  public static void ZO(String[] paramArrayOfString) {
    ZW = paramArrayOfString;
  }
  
  public static String[] ZB() {
    return ZW;
  }
  
  static {
    if (ZB() == null)
      ZO(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsmw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */