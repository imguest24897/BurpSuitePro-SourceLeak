package burp;

import java.io.IOException;

public class Zmjb implements Zr1u {
  private final Zr1u Zt;
  
  private static boolean ZQ;
  
  public Zmjb(Zxdt paramZxdt, Zgzx paramZgzx) {
    this.Zt = paramZgzx.ZL() ? new Zkf4(paramZxdt, paramZgzx) : new Zkfp(paramZxdt, paramZgzx);
  }
  
  public Zlvr Zm(Zmzk paramZmzk) throws IOException {
    return this.Zt.Zm(paramZmzk);
  }
  
  public static void Zb(boolean paramBoolean) {
    ZQ = paramBoolean;
  }
  
  public static boolean Zn() {
    return ZQ;
  }
  
  public static boolean ZG() {
    boolean bool = Zn();
    return !bool;
  }
  
  static {
    if (Zn())
      Zb(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmjb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */