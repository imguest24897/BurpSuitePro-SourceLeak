package burp;

public class Zxos {
  private static boolean Zd;
  
  public static String Zb(Zeu1 paramZeu1) {
    return paramZeu1.ZN();
  }
  
  public static void Zu(boolean paramBoolean) {
    Zd = paramBoolean;
  }
  
  public static boolean ZT() {
    return Zd;
  }
  
  public static boolean Zx() {
    boolean bool = ZT();
    return !bool;
  }
  
  static {
    if (!ZT())
      Zu(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxos.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */