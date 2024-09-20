package burp;

import net.portswigger.Zrmr;
import net.portswigger.Zs7;
import net.portswigger.Zzz;

public class Zrcf extends Zrc8 {
  public Zrcf(Zio paramZio) {
    super(paramZio);
  }
  
  public void ZY(Zs7 paramZs7) {
    Zrbg zrbg = new Zrbg();
    if (paramZs7.min() != null)
      zrbg.Zq(Integer.valueOf(paramZs7.min().intValue())); 
    if (paramZs7.max() != null)
      zrbg.ZE(Integer.valueOf(paramZs7.max().intValue())); 
    this.Zx.Zo(zrbg.ZV());
  }
  
  public void ZC(Zrmr paramZrmr) {
    Zrbg zrbg = new Zrbg();
    if (paramZrmr.Zma() != null)
      zrbg.Zp(paramZrmr.Zma()); 
    if (paramZrmr.ZmO() != null)
      zrbg.Zj(paramZrmr.ZmO()); 
    this.Zx.Zo(zrbg.ZV());
  }
  
  public void Zz(Zzz paramZzz) {
    Zrbg zrbg = new Zrbg();
    if (paramZzz.min() != null)
      zrbg.Zq(Integer.valueOf(paramZzz.min().intValue())); 
    if (paramZzz.max() != null)
      zrbg.ZE(Integer.valueOf(paramZzz.max().intValue())); 
    this.Zx.Zo(zrbg.ZV());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrcf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */