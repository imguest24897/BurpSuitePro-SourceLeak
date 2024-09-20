package burp;

import java.util.Objects;

public class Zrau {
  Ztdi[] ZT = new Ztdi[2];
  
  Zmrz[] ZA;
  
  Zlh4 Zd;
  
  public Zrau(Zrgd paramZrgd, Zkr0 paramZkr0, Zl2z paramZl2z, Zz_r paramZz_r, Zgb6 paramZgb6, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6, Ztwv paramZtwv, Zr_4 paramZr_4, Zgx0 paramZgx0, Zm6x paramZm6x) {
    Zbqc[] arrayOfZbqc = Zzlr.Zp();
    this.ZA = new Zmrz[2];
    Zgg[] arrayOfZgg = new Zgg[2];
    byte b = 0;
    while (b < 2) {
      Zskz zskz = paramZr_4.<Zskz>ZH(new Zrkx());
      Objects.requireNonNull(paramZkr0.ZYa());
      this.ZT[b] = new Zlnu(paramZrgd, paramZgb6, paramZkl6, zskz, paramZtwv, paramZr_4, new Zk5c(paramZkr0.ZYa()::ZM, paramZz_r), new Zkml(paramZkl6, paramZm6x), paramZm6x);
      arrayOfZgg[b] = new Zgg(this.ZT[b], zskz);
      this.ZA[b] = paramZgx0.ZG(b, paramZkr0, this.ZT[b], arrayOfZgg[b], paramZkr0.Zj(), paramZl2z, paramZxgc, paramZgzy, paramZkl6);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    this.ZA[0].ZS(this.ZA[1], this.ZT[1]);
    this.ZA[1].ZS(this.ZA[0], this.ZT[0]);
    Zsk zsk = new Zsk();
    this.Zd = paramZgx0.Zx(zsk, new Zz5a(arrayOfZgg), false);
    paramZkr0.Zj().ZH(this.Zd);
    zsk.ZqO();
  }
  
  public void Zu() {
    Ztdi[] arrayOfZtdi = this.ZT;
    int i = arrayOfZtdi.length;
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zzlr.Zp();
    while (b < i) {
      Ztdi ztdi = arrayOfZtdi[b];
      ztdi.Zf();
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrau.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */