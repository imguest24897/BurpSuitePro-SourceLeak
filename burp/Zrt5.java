package burp;

public class Zrt5 extends Exception {
  public final Zm7u Ze;
  
  private static boolean ZY;
  
  Zrt5(Zm7u paramZm7u) {
    this.Ze = paramZm7u;
  }
  
  public static void ZY(boolean paramBoolean) {
    ZY = paramBoolean;
  }
  
  public static boolean Zl() {
    return ZY;
  }
  
  public static boolean ZL() {
    boolean bool = Zl();
    return !bool;
  }
  
  static {
    if (!ZL())
      ZY(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrt5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */