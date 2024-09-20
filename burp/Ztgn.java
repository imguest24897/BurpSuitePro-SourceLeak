package burp;

import java.util.Optional;
import net.portswigger.Zat;
import net.portswigger.Zif;
import net.portswigger.Zrml;
import net.portswigger.Zs_;
import net.portswigger.Zto;

class Ztgn implements Zs_ {
  private final Zgdu Zf;
  
  Zs_ Zk = (Zs_)new Zr5m(this);
  
  Ztgn(Zgdu paramZgdu) {
    this.Zf = paramZgdu;
  }
  
  public Optional<Zto<Zif, Zat>> ZR(Zat paramZat) throws Zrml {
    Optional<Zto<Zif, Zat>> optional = this.Zk.ZR(paramZat);
    try {
      if (optional.isPresent())
        return optional; 
    } catch (Zrml zrml) {
      throw a(null);
    } 
    try {
      if (this.Zf.ZR())
        return Optional.of(Zto.ZM(new Zzke(this), paramZat)); 
    } catch (Zrml zrml) {
      throw a(null);
    } 
    return Optional.empty();
  }
  
  private static Zrml a(Zrml paramZrml) {
    return paramZrml;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztgn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */