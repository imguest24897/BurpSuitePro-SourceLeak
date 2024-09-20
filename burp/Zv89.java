package burp;

import java.util.Optional;

public class Zv89 extends Zv84 {
  private final Zl7h Zd;
  
  private final Zzcu Zr;
  
  private final Zz1m<Zt35> ZG;
  
  private final Zr69 ZU;
  
  private final Zez7 ZR;
  
  public Zv89(Zl7h paramZl7h, Zzcu paramZzcu, Zz1m<Zt35> paramZz1m, Zr69 paramZr69, Zez7 paramZez7) {
    this.Zd = paramZl7h;
    this.Zr = paramZzcu;
    this.ZG = paramZz1m;
    this.ZU = paramZr69;
    this.ZR = paramZez7;
  }
  
  public void ZZ(Zvb paramZvb) {
    this.Zd.Zg(this.ZR.Zn());
    this.ZU.ZN(this.ZR.Zp());
  }
  
  public Zvb Zb(Zvb paramZvb) {
    boolean bool = this.ZR.ZN(this.Zd.ZVv());
    if (!bool)
      return new Zljv(); 
    this.ZU.ZD().Zy(Zrp6.DEBUG, Zlq7.SCENE_STARTED, new Object[] { this.ZR });
    this.ZG.ZD(new Zxr8(Zt35.ZT, this.ZR));
    Optional<Ztc6> optional = this.Zr.ZV(Ztiq.Zk());
    if (optional.isPresent() && !((Ztc6)optional.get()).ZB()) {
      Zbo4 zbo4 = new Zbo4(optional.get());
      this.ZG.ZD(new Zxr8(Zt35.Za, zbo4));
      return zbo4;
    } 
    return new Ze8_();
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv89.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */