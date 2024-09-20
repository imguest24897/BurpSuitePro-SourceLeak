package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrxi implements Zmxz {
  private final Zmxz Zd;
  
  private final Zb0f ZH;
  
  public Zrxi(Zmxz paramZmxz, Zb0f paramZb0f) {
    this.Zd = paramZmxz;
    this.ZH = paramZb0f;
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    if (paramZrdb1.Za7().Zg()) {
      Zl4m zl4m1 = Zx(paramZrdb1, paramZrdb2, paramZz1h);
      return (zl4m1 == null) ? Zl4m.Zh : zl4m1;
    } 
    if (paramZrdb2.Za7().Zg()) {
      Zx(paramZrdb2, paramZrdb1, paramZz1h);
      return Zl4m.Zf;
    } 
    if (paramZrdb1.Za7().ZK()) {
      Zl4m zl4m1 = Zx(paramZrdb1, paramZrdb2, paramZz1h);
      return (zl4m1 == null) ? Zl4m.Zh : zl4m1;
    } 
    if (paramZrdb2.Za7().ZK()) {
      Zx(paramZrdb2, paramZrdb1, paramZz1h);
      return Zl4m.Zf;
    } 
    Zuh.Zb((Zsqv.ZB(paramZrdb1) && Zsqv.ZB(paramZrdb2)), Zqf.Zr);
    Zl4m zl4m = Zx(paramZrdb1, paramZrdb2, paramZz1h);
    return (zl4m == null) ? this.Zd.Zi(paramZrdb1, paramZrdb2, paramZz1h) : zl4m;
  }
  
  private Zl4m Zx(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    if (!Zsqv.ZB(paramZrdb2))
      return null; 
    Zl4m zl4m1 = null;
    Zl4m zl4m2 = paramZrdb1.Za7().Zd(paramZrdb2.Za7().ZH(), paramZz1h);
    if (zl4m2 != null) {
      zl4m1 = zl4m2;
      if ((zl4m1 == Zl4m.Zw || zl4m1 == Zl4m.Zu || zl4m1 == Zl4m.ZY) && this.ZH != null)
        this.ZH.ZG(paramZrdb1, paramZrdb2); 
    } 
    if (paramZrdb2.Zak() > paramZrdb1.Zak())
      paramZrdb1.Zq(paramZrdb2.Zak()); 
    return zl4m1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrxi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */