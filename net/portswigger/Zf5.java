package net.portswigger;

public abstract class Zf5 {
  @Zvd(Zp = "wasDetected")
  public final boolean Zz;
  
  @Zvd(Zp = "label")
  public final String Zb;
  
  private static boolean Za;
  
  protected Zf5(boolean paramBoolean, String paramString) {
    this.Zz = paramBoolean;
    this.Zb = paramString;
  }
  
  public static void Zu(boolean paramBoolean) {
    Za = paramBoolean;
  }
  
  public static boolean Zp() {
    return Za;
  }
  
  public static boolean Zv() {
    boolean bool = Zp();
    return !bool;
  }
  
  static {
    if (Zp())
      Zu(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zf5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */