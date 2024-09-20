package burp;

public class Zzdw {
  private static String[] ZH;
  
  public static void ZN(String[] paramArrayOfString) {
    ZH = paramArrayOfString;
  }
  
  public static String[] ZC() {
    return ZH;
  }
  
  static {
    if (ZC() == null)
      ZN(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzdw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */