package burp;

import net.portswigger.Zah;
import net.portswigger.Zip;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

abstract class Zr8b implements Ztf0 {
  private final Zlof ZX;
  
  private final Zxfv ZD;
  
  private final Zkit ZZ;
  
  private final Ze24 Zp;
  
  private final Class Za;
  
  private final boolean ZY;
  
  private final Zip Zr;
  
  private final Zeu4 ZK;
  
  Zr8b(Zxfv paramZxfv, Zlof paramZlof, Zkit paramZkit, Ze24 paramZe24, Class paramClass, boolean paramBoolean, Zip paramZip, Zeu4 paramZeu4) {
    this.ZX = paramZlof;
    this.ZD = paramZxfv;
    this.ZZ = paramZkit;
    this.Zp = paramZe24;
    this.Za = paramClass;
    this.ZY = paramBoolean;
    this.Zr = paramZip;
    this.ZK = paramZeu4;
  }
  
  public boolean Zr(Zr_4 paramZr_4, Zgpi paramZgpi) {
    return (paramZr_4 == null || !paramZr_4.Zi() || !this.Za.isInstance(paramZgpi) || !this.ZY) ? false : Zn(paramZr_4.Zl(), paramZgpi);
  }
  
  abstract boolean Zn(Zkit paramZkit, Zgpi paramZgpi);
  
  public <T extends Zgpi> T Zb(T paramT) {
    Zgpi zgpi;
    Zuh.Zb(this.ZY, Zqf.Zr);
    Zm2.ZC(this.Zr);
    try {
      zgpi = this.ZZ.ZH((Zsqx)new Zbjy<>(this.ZK));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZX.ZK(throwable);
      return null;
    } 
    this.Zp.Zb((Zgpi)paramT, zgpi);
    Zs7v zs7v = this.ZD.Zh((Zgpi)paramT, zgpi);
    paramT.ZQ(this.ZK.Zc(), zs7v);
    return (T)zgpi;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr8b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */