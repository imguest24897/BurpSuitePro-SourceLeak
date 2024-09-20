package burp;

public class Ze27 extends Exception {
  private static String[] Zp;
  
  public Ze27(String paramString) {
    super(paramString);
  }
  
  public static void Zw(String[] paramArrayOfString) {
    Zp = paramArrayOfString;
  }
  
  public static String[] ZP() {
    return Zp;
  }
  
  static {
    if (ZP() == null)
      Zw(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze27.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */