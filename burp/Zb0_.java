package burp;

import java.util.Optional;

public class Zb0_ {
  protected final int ZC;
  
  protected final Ztc6 ZP;
  
  private Zb0_(int paramInt, Ztc6 paramZtc6) {
    this.ZC = paramInt;
    this.ZP = paramZtc6;
  }
  
  public static Zb0_ Zq(Ztc6 paramZtc6) {
    return new Zb0_(0, paramZtc6);
  }
  
  public Ztc6 ZC() {
    return this.ZP;
  }
  
  private Zxs9 Zp() {
    return this.ZP.ZQ(this.ZC);
  }
  
  public Zlru ZR() {
    return Zp().ZXa();
  }
  
  public Zeu9 Zl() {
    return Zp().ZXh();
  }
  
  public Zszw ZG() {
    return Zp().ZXq();
  }
  
  public Zszw Zv() {
    return (this.ZC == 0) ? this.ZP.Zy() : this.ZP.ZQ(this.ZC - 1).ZXq();
  }
  
  public Zrp0 Zo() {
    return Zp().ZXL();
  }
  
  public Optional<Zb0_> Zc() {
    return (this.ZC + 1 == this.ZP.Zr()) ? Optional.empty() : Optional.of(new Zb0_(this.ZC + 1, this.ZP));
  }
  
  public Zm0f ZQ(Zlas paramZlas, Ztpx paramZtpx) {
    Zxs9 zxs9 = Zp();
    Zrp0 zrp0 = zxs9.ZXL();
    boolean bool = Zx6f.ZW();
    Zlru zlru = zxs9.ZXa();
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
    return zrp0.<Zm0f>Zv(new Zejv(this, paramZlas, zlru, paramZtpx));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb0_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */