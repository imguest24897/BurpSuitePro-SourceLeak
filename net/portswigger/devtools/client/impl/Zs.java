package net.portswigger.devtools.client.impl;

public abstract class Zs {
  private final String ZY;
  
  private static int[] Zb;
  
  protected Zs(String paramString) {
    this.ZY = paramString;
  }
  
  public abstract Zxv Zu();
  
  protected boolean ZY() {
    return true;
  }
  
  String ZJ() {
    return this.ZY;
  }
  
  public static void ZL(int[] paramArrayOfint) {
    Zb = paramArrayOfint;
  }
  
  public static int[] ZN() {
    return Zb;
  }
  
  static {
    if (ZN() == null)
      ZL(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */