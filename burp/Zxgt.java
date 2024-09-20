package burp;

public class Zxgt extends Exception {
  private static boolean Zp;
  
  Zxgt() {}
  
  Zxgt(String paramString) {
    super(paramString);
  }
  
  public static void Zc(boolean paramBoolean) {
    Zp = paramBoolean;
  }
  
  public static boolean ZV() {
    return Zp;
  }
  
  public static boolean ZE() {
    boolean bool = ZV();
    return !bool;
  }
  
  static {
    if (!ZV())
      Zc(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxgt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */