package burp;

import java.util.Iterator;
import net.portswigger.Zen;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zz_;

public class Zbj2 implements Iterator<Zlkb> {
  private final Iterator<Zen> Zt;
  
  private final Zbjl Zp;
  
  private final Zlba Zz;
  
  private final Zbnt Z_;
  
  private final Zk8s ZW;
  
  private Zlkb ZG;
  
  Zbj2(Zbjl paramZbjl, Zlba paramZlba, Zbnt paramZbnt, Zk8s paramZk8s, Zz_ paramZz_) {
    this.Zp = paramZbjl;
    this.Zz = paramZlba;
    this.Z_ = paramZbnt;
    this.ZW = paramZk8s;
    this.Zt = paramZz_.Z_().iterator();
  }
  
  public boolean hasNext() {
    this.ZG = Zc();
    return (this.ZG != null);
  }
  
  public Zlkb ZV() {
    return this.ZG;
  }
  
  private Zlkb Zc() {
    Zbqc[] arrayOfZbqc = Zb9e.ZI();
    while (this.Zt.hasNext()) {
      Zen zen = this.Zt.next();
      if (!this.Zp.ZF(zen) || zen.Zb != 1)
        continue; 
      Ztt6 ztt6 = (new Zrh3(zen.ZO)).Zd();
      if (ztt6 == null)
        continue; 
      Zbza zbza = this.Zz.ZW(ztt6.ZK());
      if (zbza == null)
        continue; 
      Zuh.ZT(ztt6.Zk().ZES(), Zqf.Zr, String.valueOf(zen) + " " + String.valueOf(zen));
      Zsoq zsoq = this.ZW.ZK(zbza);
      Zxs7 zxs7 = zsoq.ZB(ztt6.Zk());
      if (zxs7 != null)
        return new Zlkb(zen, ztt6, zxs7, zbza, (zbza.ZU(this.Z_)).Zo); 
      if (arrayOfZbqc == null)
        break; 
    } 
    return null;
  }
  
  public void remove() {
    Zuh.Zb(false, Zqf.Zr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbj2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */