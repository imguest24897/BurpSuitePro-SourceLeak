package burp;

import java.util.ArrayList;

public class Zg50 extends ArrayList<Zska> {
  private static boolean Z_;
  
  public Zg50(int paramInt) {
    super(paramInt);
  }
  
  public void removeRange(int paramInt1, int paramInt2) {
    super.removeRange(paramInt1, paramInt2);
  }
  
  public static void Zy(boolean paramBoolean) {
    Z_ = paramBoolean;
  }
  
  public static boolean Zk() {
    return Z_;
  }
  
  public static boolean ZU() {
    boolean bool = Zk();
    return !bool;
  }
  
  static {
    if (!ZU())
      Zy(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg50.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */