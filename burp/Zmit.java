package burp;

import java.util.List;

public class Zmit implements Zkfj {
  private static final Zs40 ZE = Zmit::lambda$static$0;
  
  private final Zs40 Zu;
  
  private static String ZG;
  
  public Zmit() {
    this(ZE);
  }
  
  public Zmit(Zs40 paramZs40) {
    this.Zu = paramZs40;
  }
  
  public Zsqx<Zrdb> Zt(Ze3n paramZe3n, Zxs7 paramZxs7, Zer0 paramZer0, Zbll paramZbll, List<Zer0> paramList) {
    Zt5i zt5i = new Zt5i(paramZer0, paramList);
    Zvow zvow = paramZe3n.ZI().Zp(paramZbll.Zk.Zu(paramZxs7).ZE()).ZK(paramZbll.ZR).ZK(this.Zu.Zn(paramZbll, paramZxs7));
    String str = ZH();
    if (Zbqc.Zwu() == null)
      ZB("W2Fgmb"); 
    return Zog.ZL(paramZe3n.Za(), paramZe3n.ZN(), zt5i.ZE(), zt5i.ZG(), Zxwd.ZN(paramZbll.Zk.ZG(), paramZxs7), zvow, paramZbll.ZP, paramZxs7, paramZbll.Zk.ZV());
  }
  
  private static List lambda$static$0(Zbll paramZbll, Zxs7 paramZxs7) {
    return paramZbll.Zk.Zn(paramZbll, paramZxs7);
  }
  
  public static void ZB(String paramString) {
    ZG = paramString;
  }
  
  public static String ZH() {
    return ZG;
  }
  
  static {
    if (ZH() != null)
      ZB("Lj82Mc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmit.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */