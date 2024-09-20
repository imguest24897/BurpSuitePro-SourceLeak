package burp;

public abstract class Zrwm implements Zsmo {
  Zsmo Zu;
  
  private static boolean Zs;
  
  public Zsmo Zf(Zsmo paramZsmo) {
    this.Zu = paramZsmo;
    return this;
  }
  
  public static void ZW(boolean paramBoolean) {
    Zs = paramBoolean;
  }
  
  public static boolean Zb() {
    return Zs;
  }
  
  public static boolean Zl() {
    boolean bool = Zb();
    return !bool;
  }
  
  static {
    if (Zl())
      ZW(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrwm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */