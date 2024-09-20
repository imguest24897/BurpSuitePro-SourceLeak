package burp;

import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zv8i extends Zv84 {
  private final Zzcu ZT;
  
  private final Zez7 ZP;
  
  private final Zz1m<Zt35> Zn;
  
  private final Zzu3 ZK;
  
  public Zv8i(Zzcu paramZzcu, Zez7 paramZez7, Zz1m<Zt35> paramZz1m, Zzu3 paramZzu3) {
    this.ZT = paramZzcu;
    this.ZP = paramZez7;
    this.Zn = paramZz1m;
    this.ZK = paramZzu3;
  }
  
  protected Zvb Zb(Zvb paramZvb) {
    if (this.ZP.Zg())
      return new Zmnv(); 
    Zuh.Zb(paramZvb instanceof Ze79, Zqf.Zk);
    if (paramZvb instanceof Ze79) {
      Ze79 ze79 = (Ze79)paramZvb;
      Ztiq ztiq = ze79.ZX() ? Ztiq.Zk() : Ztiq.ZX(ze79.Z_(), ze79.ZW(), ze79.ZL());
      Optional<Ztc6> optional = this.ZT.ZV(ztiq);
      if (this.ZK.Zw())
        return new Zmkm(); 
      if (optional.isPresent() && !((Ztc6)optional.get()).ZB()) {
        Zbo4 zbo4 = new Zbo4(optional.get());
        this.Zn.ZD(new Zxr8(Zt35.Za, zbo4));
        return zbo4;
      } 
      return new Ze8_();
    } 
    return null;
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */