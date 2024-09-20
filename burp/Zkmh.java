package burp;

public class Zkmh {
  private static String[] ZW;
  
  public static void ZU(String[] paramArrayOfString) {
    ZW = paramArrayOfString;
  }
  
  public static String[] Zt() {
    return ZW;
  }
  
  static {
    if (Zt() != null)
      ZU(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkmh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */