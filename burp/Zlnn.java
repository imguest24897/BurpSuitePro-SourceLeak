package burp;

import java.awt.Font;

public class Zlnn {
  public static float Zx(Zgb6 paramZgb6) {
    return Zj(Zj(paramZgb6));
  }
  
  public static Zzkh Zj(Zgb6 paramZgb6) {
    Font font = new Font(paramZgb6.Zf8(), 0, paramZgb6.ZfF());
    Zm99 zm99 = new Zm99();
    return Zzkh.Zb(zm99.getFontMetrics(font));
  }
  
  public static float Zj(Zzkh paramZzkh) {
    return paramZzkh.Zm('X');
  }
  
  public static float Zy(Zmgw paramZmgw) {
    return paramZmgw.ZE() ? Zs5o.ZI('\r', paramZmgw.Zl(paramZmgw.getFont())).Zq() : 0.0F;
  }
  
  public static float ZK(Zzkh paramZzkh) {
    return paramZzkh.Zh();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlnn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */