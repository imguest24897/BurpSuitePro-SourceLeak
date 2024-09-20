package net.portswigger.browser;

public class Zcb extends Exception {
  private static boolean ZQ;
  
  public Zcb(String paramString) {
    super(paramString);
  }
  
  public static void ZE(boolean paramBoolean) {
    ZQ = paramBoolean;
  }
  
  public static boolean ZZ() {
    return ZQ;
  }
  
  public static boolean ZK() {
    boolean bool = ZZ();
    return !bool;
  }
  
  static {
    if (ZK())
      ZE(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zcb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */