package burp;

public class Zs7w extends Exception {
  private static boolean ZA;
  
  public Zs7w(String paramString) {
    super(paramString);
  }
  
  public static void Zs(boolean paramBoolean) {
    ZA = paramBoolean;
  }
  
  public static boolean Zw() {
    return ZA;
  }
  
  public static boolean ZX() {
    boolean bool = Zw();
    return !bool;
  }
  
  static {
    if (!ZX())
      Zs(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs7w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */