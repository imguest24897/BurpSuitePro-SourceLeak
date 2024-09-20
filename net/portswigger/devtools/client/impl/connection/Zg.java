package net.portswigger.devtools.client.impl.connection;

public class Zg {
  private static boolean Zo;
  
  public static void Z_(boolean paramBoolean) {
    Zo = paramBoolean;
  }
  
  public static boolean Zl() {
    return Zo;
  }
  
  public static boolean Zp() {
    boolean bool = Zl();
    return !bool;
  }
  
  static {
    if (Zp())
      Z_(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\Zg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */