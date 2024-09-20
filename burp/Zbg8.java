package burp;

import java.util.ArrayList;

public abstract class Zbg8 extends Zbqc {
  private final ArrayList<Zrgb> ZX = new ArrayList<>();
  
  private static boolean ZJ;
  
  public void ZS(Zrgb paramZrgb) {
    this.ZX.add(paramZrgb);
  }
  
  protected void ZU() {
    boolean bool = Zp();
    for (Zrgb zrgb : this.ZX) {
      zrgb.Zo();
      if (!bool)
        break; 
    } 
  }
  
  public static void Zu(boolean paramBoolean) {
    ZJ = paramBoolean;
  }
  
  public static boolean ZN() {
    return ZJ;
  }
  
  public static boolean Zp() {
    boolean bool = ZN();
    return !bool;
  }
  
  static {
    if (ZN())
      Zu(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbg8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */