package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zv87 extends Zv84 {
  private final Zxf2 ZC;
  
  private static String[] Zd;
  
  Zv87(Zxf2 paramZxf2) {
    this.ZC = paramZxf2;
  }
  
  public Zvb Zb(Zvb paramZvb) {
    Zuh.Zb(paramZvb instanceof Zx6l, Zqf.Zr);
    if (paramZvb instanceof Zx6l) {
      Zx6l zx6l = (Zx6l)paramZvb;
      Zb0_ zb0_ = zx6l.Zl();
      Zzcs zzcs = zx6l.Zg();
      Zszw zszw1 = zb0_.Zv();
      Zszw zszw2 = zb0_.ZG();
      Zrp0 zrp0 = zb0_.Zo();
      Zlru zlru = zb0_.ZR();
      this.ZC.Zy(zzcs, zszw1, zszw2, zrp0, zlru, this.ZC.Zm());
      return Ze79.ZI();
    } 
    return null;
  }
  
  public static void ZI(String[] paramArrayOfString) {
    Zd = paramArrayOfString;
  }
  
  public static String[] Zg() {
    return Zd;
  }
  
  static {
    if (Zg() != null)
      ZI(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv87.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */