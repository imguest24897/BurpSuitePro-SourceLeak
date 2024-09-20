package burp;

import java.util.Optional;

public class Ztkj implements Zs_f {
  private final Zmcy Zr;
  
  private final Zeos Zc;
  
  private final Zxrg Zf;
  
  public Ztkj(Zmcy paramZmcy, Zeos paramZeos, Zxrg paramZxrg) {
    this.Zr = paramZmcy;
    this.Zc = paramZeos;
    this.Zf = paramZxrg;
  }
  
  public Optional<String> Zt() {
    return Optional.ofNullable(this.Zr.ZW());
  }
  
  public Optional<String> ZS(boolean paramBoolean) {
    return Optional.ofNullable(this.Zr.ZC(paramBoolean));
  }
  
  public Optional<String> Zi(Zlwu paramZlwu) {
    return Optional.ofNullable(this.Zr.Zb(paramZlwu));
  }
  
  public void ZX(Zshe paramZshe) {
    this.Zc.Zn(paramZshe);
  }
  
  public void Zq() {
    this.Zf.ZU();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztkj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */