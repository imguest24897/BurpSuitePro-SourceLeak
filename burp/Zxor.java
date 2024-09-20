package burp;

import java.util.List;

public class Zxor implements Zkfj {
  private final Zldj Zi;
  
  private static boolean Zv;
  
  public Zxor(Zldj paramZldj) {
    this.Zi = paramZldj;
  }
  
  public Zsqx<Zrdb> Zt(Ze3n paramZe3n, Zxs7 paramZxs7, Zer0 paramZer0, Zbll paramZbll, List<Zer0> paramList) {
    boolean bool = ZX();
    Zvow zvow = paramZe3n.ZI().Zp(paramZbll.Zk.Zu(paramZxs7).ZE()).ZK(paramZbll.ZR).ZK(this.Zi.Zn(paramZbll, paramZxs7));
    if (Zbqc.Zwu() == null)
      ZC(!bool); 
    return Zkir.Zb(paramZe3n.Za(), paramZe3n.ZN(), zvow, paramZxs7, paramZbll.ZP, paramZbll.Zk.ZV());
  }
  
  public static void ZC(boolean paramBoolean) {
    Zv = paramBoolean;
  }
  
  public static boolean ZX() {
    return Zv;
  }
  
  public static boolean ZM() {
    boolean bool = ZX();
    return !bool;
  }
  
  static {
    if (!ZM())
      ZC(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */