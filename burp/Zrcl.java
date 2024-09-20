package burp;

import net.portswigger.Zkv;
import net.portswigger.Zrm7;
import net.portswigger.Zrmr;
import net.portswigger.Zs7;
import net.portswigger.Zt0;
import net.portswigger.Zzx;
import net.portswigger.Zzz;

public class Zrcl extends Zrc8 {
  protected Zrcl(Zio paramZio) {
    super(paramZio);
  }
  
  public void ZY(Zs7 paramZs7) {
    paramZs7.examples().stream().map(String::valueOf).forEach(this::Zz);
  }
  
  public void ZC(Zrmr paramZrmr) {
    paramZrmr.Zmk().stream().map(String::valueOf).forEach(this::Zz);
    paramZrmr.Zm9().stream().map(String::valueOf).forEach(this::Zz);
  }
  
  public void Zz(Zzz paramZzz) {
    paramZzz.examples().stream().map(String::valueOf).forEach(this::Zz);
  }
  
  public void Zr(Zt0 paramZt0) {
    paramZt0.Zgl().stream().map(String::valueOf).forEach(this::Zz);
  }
  
  public void Zc(Zrm7 paramZrm7) {
    String str = paramZrm7.ZgH();
    Zz(str);
  }
  
  public void ZE(Zzx paramZzx) {
    String str = String.valueOf(paramZzx.Zwn());
    Zz(str);
  }
  
  public void ZT(Zkv paramZkv) {
    String str = String.valueOf(paramZkv.ZNG());
    Zz(str);
  }
  
  private void Zz(String paramString) {
    this.Zx.ZR(paramString);
    this.Zx.Zi(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrcl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */