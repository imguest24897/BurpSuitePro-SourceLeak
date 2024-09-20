package burp;

import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ztgp {
  Zb0p ZH;
  
  Zsnv Zs;
  
  Zzj5 ZJ;
  
  final Zt69 Zj;
  
  Ztgp(Zt69 paramZt69, List<Zsjh<?>> paramList, Zr_4 paramZr_4) {
    String str = Zt69.Zj();
    this.ZH = this.Zj.ZO;
    this.Zs = this.Zj.ZU;
    this.ZJ = this.Zj.ZJ;
    for (Zsjh<Ztkk> zsjh : paramList) {
      Ztkk ztkk = paramZr_4.<Ztkk>ZH(zsjh);
      switch (Zmhw.ZR[ztkk.Zu().ordinal()]) {
        case 1:
          this.ZH = (Zb0p)ztkk;
        case 2:
          this.Zs = (Zsnv)ztkk;
        case 3:
          this.ZJ = (Zzj5)ztkk;
        default:
          Zuh.ZT(false, Zqf.Zk, ztkk.Zu().toString());
          break;
      } 
      continue;
      if (str != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztgp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */