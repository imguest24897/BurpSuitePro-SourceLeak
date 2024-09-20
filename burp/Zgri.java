package burp;

public class Zgri extends Exception {
  private static String ZU;
  
  public Zgri(String paramString) {
    super(paramString);
  }
  
  public static void ZM(String paramString) {
    ZU = paramString;
  }
  
  public static String ZN() {
    return ZU;
  }
  
  static {
    if (ZN() == null)
      ZM("rCGyh"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgri.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */