package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

abstract class Zij implements Zlgm {
  protected final Zxgd ZL;
  
  protected final Zlb8<Zs2i> Zj;
  
  protected final Ze3n Zc;
  
  protected final Zxs7 Zw;
  
  protected final Zbnt Z_;
  
  protected final Zey9 Zh;
  
  private Zxs7 ZX;
  
  private Zefx Zp;
  
  private Zs2i ZW;
  
  Zij(Zxgd paramZxgd, Zlb8<Zs2i> paramZlb8, Ze3n paramZe3n, Zxs7 paramZxs7, Zbnt paramZbnt, Zey9 paramZey9) {
    this.ZL = paramZxgd;
    this.Zj = paramZlb8;
    this.Zc = paramZe3n;
    this.Zw = paramZxs7;
    this.Z_ = paramZbnt;
    this.Zh = paramZey9;
  }
  
  Zxs7 ZN() {
    return this.ZX;
  }
  
  Zs2i Zx() {
    return this.ZW;
  }
  
  Zxgd Zc() {
    return this.ZL.ZY(this::Z_).ZY(Zgyj::Zp).Zp(this::lambda$buildRequestModifier$0);
  }
  
  private Zefx Z_(Zefx paramZefx) {
    this.Zp = paramZefx;
    this.ZX = ZZ(this.Zw, paramZefx);
    Zmzk zmzk = this.Zc.Za();
    return this.Zh.ZY(zmzk, ZR(this.Zj));
  }
  
  private byte[] ZR(Zlb8<Zs2i> paramZlb8) {
    this.ZW = this.ZX.<Zs2i>Zk(paramZlb8);
    return this.ZW.ZE();
  }
  
  protected abstract Zxs7 ZZ(Zxs7 paramZxs7, Zefx paramZefx);
  
  public boolean Zh(Zrdu paramZrdu, String paramString) {
    Zuh.Zb((this.ZX != null), Zqf.Zr);
    return this.ZX.Zm(paramZrdu, paramString, this.Zp);
  }
  
  private Ztcd lambda$buildRequestModifier$0(Ztcd paramZtcd) {
    return paramZtcd.ZM(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zij.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */