package burp;

import net.portswigger.Zfg;
import net.portswigger.Zrz_;

class Zlw1 implements Zfg {
  final Zrwh Zu;
  
  private Zlw1(Zrwh paramZrwh) {}
  
  public void Zo(Zrz_ paramZrz_) {
    Zbqc[] arrayOfZbqc = Zsg3.Zh();
    Zl3z zl3z = (paramZrz_ == null) ? null : new Zl3z(paramZrz_, false, Zt83.ZS);
    for (Zlm zlm : this.Zu.ZR) {
      if (zl3z != null)
        zl3z = zlm.ZG(zl3z); 
      if (arrayOfZbqc != null)
        break; 
    } 
    if (zl3z != null)
      for (Zlm zlm : this.Zu.ZR) {
        zlm.Zx(zl3z);
        if (arrayOfZbqc != null)
          break; 
      }  
  }
  
  public void Zy(Throwable paramThrowable) {
    this.Zu.Zk.run();
    this.Zu.ZR.forEach(Zlm::ZI);
    this.Zu.ZR.clear();
    this.Zu.Zh.forEach(Zr0l::ZP);
    this.Zu.Zh.clear();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlw1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */