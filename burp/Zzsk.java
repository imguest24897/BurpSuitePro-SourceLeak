package burp;

import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

class Zzsk extends Zzsb {
  private final Zlas Zh;
  
  private final Zsy ZJ;
  
  Zzsk(Zlas paramZlas, Zsy paramZsy) {
    this.Zh = paramZlas;
    this.ZJ = paramZsy;
  }
  
  public Zvb Zv(Ztpx paramZtpx, Zvb paramZvb) {
    Zuh.Zb(paramZvb instanceof Zx6w, Zqf.Zk);
    if (paramZvb instanceof Zx6w) {
      Zx6w zx6w = (Zx6w)paramZvb;
      Zrp0 zrp0 = zx6w.Zz().ZV().ZXL();
      if (zrp0 instanceof Zm5e) {
        Zm5e zm5e = (Zm5e)zrp0;
        Zm0f zm0f = this.Zh.Z_(zm5e.Zl(this.ZJ), zx6w.Zl().ZR(), paramZtpx);
        return new Zx60(zx6w.Zg(), zx6w.Zl(), zm0f);
      } 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzsk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */