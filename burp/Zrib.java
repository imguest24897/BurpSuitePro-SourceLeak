package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zrz_;
import net.portswigger.Zuh;

class Zrib {
  private final Zbw_<?> Zr;
  
  private final Zl3z ZO;
  
  private final Zm6x ZV;
  
  private final Zs_y Zb;
  
  private final Ze3o ZR;
  
  private final int Zc;
  
  private final Zxym ZN;
  
  private final Zlit ZQ;
  
  private final byte[] Ze;
  
  private final int Zv;
  
  private final Zzxx Zq;
  
  private byte[] ZF;
  
  private byte[] Zx;
  
  private Zl36 ZE;
  
  private Zzh2 ZX;
  
  Zrib(Zbw_<?> paramZbw_, Zl3z paramZl3z, Ze3o paramZe3o, int paramInt1, Zxym paramZxym, Zlit paramZlit, int paramInt2, Zm6x paramZm6x, Zs_y paramZs_y, Zzxx paramZzxx) {
    this.Zr = paramZbw_;
    this.ZO = paramZl3z;
    this.ZV = paramZm6x;
    this.Zb = paramZs_y;
    this.ZE = this.ZO;
    this.Zc = paramInt1;
    int i = Zzzt.Zc();
    this.ZR = paramZe3o;
    this.ZN = paramZxym;
    this.ZQ = paramZlit;
    this.Zv = paramInt2;
    this.Zq = paramZzxx;
    this.Ze = this.ZO.ZH();
    if (Zbqc.Zwu() == null)
      Zzzt.ZX(++i); 
  }
  
  void ZI() {
    try {
      if (this.ZO.ZY() == null) {
        Zuh.Zb(false, Zqf.Zs);
        return;
      } 
    } catch (Zz87 zz87) {
      throw a(null);
    } 
    try {
      boolean bool = Ze();
      try {
        if (bool) {
          Zv();
          ZM();
          Zc();
          ZV();
        } 
      } catch (Zz87 zz87) {
        throw a(null);
      } 
      Zmhv zmhv = this.ZN.Zr(this.ZE, this.ZR, Zeew.PROXY);
      try {
        if (zmhv.ZJ() && bool) {
          boolean bool1 = ZR();
          try {
            this.ZX.Zxg(zmhv.ZA());
            this.ZX.ZB(zmhv.ZS());
            if (bool1)
              this.ZV.ZB(new Zluv(this.ZX, Zg9f.PROXY_ENGINE)); 
          } catch (Zz87 zz87) {
            throw a(null);
          } 
        } 
      } catch (Zz87 zz87) {
        throw a(null);
      } 
    } catch (Zz87 zz87) {
      Zah.Zl(zz87, Zk_.IGNORED);
    } 
  }
  
  private boolean Ze() {
    switch (Ziu.ZH[this.ZO.ZY().ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
        return true;
      case 5:
      case 6:
      case 7:
        return false;
    } 
    Zuh.ZT(false, Zqf.Zk, this.ZO.ZY().name());
    return false;
  }
  
  private void Zv() {
    this.ZX = this.Zr.ZFh().ZN(this.Zc, this.ZQ, this.Ze, (this.ZR == Ze3o.CLIENT_TO_SERVER), this.ZO.ZX(), this.ZO.Zs(), this.Zv, this.ZO.ZU().ZOf(), this.ZO.ZU().ZOX());
  }
  
  private void ZM() {
    Zgh0 zgh0 = this.Zb.Zi(this.Ze, this.ZR, this.ZQ);
    if (zgh0.ZG1()) {
      this.Zx = zgh0.ZGp();
      this.Zr.ZFh().ZF(this.ZX, this.Zx);
    } 
  }
  
  private void Zc() throws Zz87 {
    Zxx8 zxx8 = ZP(this.ZX);
    this.ZF = zxx8.Zz();
  }
  
  Zxx8 ZP(Zzh2 paramZzh2) throws Zz87 {
    try {
    
    } catch (Zz87 zz87) {
      throw a(null);
    } 
    Zl3z zl3z = (this.Zx == null) ? this.ZO : new Zl3z(this.ZO.ZV(this.Zx), this.ZO.Zw());
    Zxx8 zxx8 = new Zxx8(paramZzh2, this.Zr, this.ZQ, this.ZR, zl3z, this.Zq);
    zxx8.ZO();
    return zxx8;
  }
  
  private void ZV() {
    if (ZS())
      this.Zr.ZFh().ZC(this.ZX, this.ZF); 
    if (Zy() || this.ZX.ZaP() != this.ZO.ZU().ZOX() || ZR())
      this.ZE = new Zl36(new Zrz_(this.ZO.ZT(), this.ZO.Zs(), this.ZO.ZX(), this.ZO.ZR(), this.ZO.Za(), this.ZF), new Zt83(this.ZX.ZIx(), this.ZX.ZaP())); 
  }
  
  private boolean ZS() {
    return (this.Zx == null) ? ((this.ZF != this.Ze)) : ((this.ZF != this.Zx));
  }
  
  private boolean Zy() {
    boolean bool = (this.Zx != null) ? true : false;
    return (bool || this.ZF != this.Ze);
  }
  
  private boolean ZR() {
    String str = this.ZO.ZU().ZOf();
    return str.isEmpty() ? Zsw8.ZS(this.ZX.ZIx()) : (!str.equals(this.ZX.ZIx()));
  }
  
  private static Zz87 a(Zz87 paramZz87) {
    return paramZz87;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrib.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */