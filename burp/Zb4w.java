package burp;

import net.portswigger.Zrzg;

class Zb4w {
  private final Zkit Zr;
  
  private final Ztdi Zb;
  
  private final Zr3c ZL;
  
  Zb4w(Zrgd paramZrgd, Zrzg paramZrzg, Zkit paramZkit1, Zkit paramZkit2, Ztg8 paramZtg8, Zzir paramZzir, Ztwv paramZtwv, Zm6x paramZm6x) {
    this.Zr = paramZkit1;
    paramZkit2.Zj(Zzir.Zg);
    Zbnt zbnt = new Zbnt(paramZzir.ZvE(), paramZkit2);
    Zcf zcf = new Zcf();
    Zlf2 zlf2 = new Zlf2();
    Zbqx zbqx = new Zbqx(zcf, null, zlf2, new Zr5v(), null, null, paramZrzg, Zra1.EXECUTION_MODE_DESKTOP);
    Zkh7 zkh7 = new Zkh7(zbqx, paramZkit2);
    Zgex zgex = new Zgex(zbqx, paramZkit2, Zskh.Zo, new Zr0i(), zkh7, null, zbnt, null, null, Zxdt.ZW, new Zey9(zbnt));
    Zskz zskz = paramZzir.Zvm();
    this.Zb = new Zlnu(paramZrgd, zbqx, zgex, zskz, paramZtwv, paramZkit2, null, null, paramZm6x);
    this.Zb.Zf();
    int i = Zlbi.ZV();
    new Zgd(this.Zb, zskz);
    this.ZL = new Zr3c(zskz, this.Zb, paramZtg8, paramZkit2);
    if (i == 0)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  Ztmr ZT() {
    return new Zehs(this, (Zeu4)Zmxt.Ze);
  }
  
  Ztmr ZO() {
    return new Zehs(this, (Zeu4)Zg6u.ZT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb4w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */