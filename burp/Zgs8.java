package burp;

import java.util.concurrent.atomic.AtomicReference;

public class Zgs8<O> implements Zb40<O> {
  private final AtomicReference<O> ZI = new AtomicReference<>();
  
  private static String[] Zy;
  
  public void ZO(O paramO) {
    this.ZI.set(paramO);
  }
  
  public O ZB() {
    return this.ZI.get();
  }
  
  public static void Zc(String[] paramArrayOfString) {
    Zy = paramArrayOfString;
  }
  
  public static String[] Zw() {
    return Zy;
  }
  
  static {
    if (Zw() == null)
      Zc(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgs8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */