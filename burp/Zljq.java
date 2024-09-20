package burp;

import java.util.function.Consumer;

class Zljq implements Zmgr {
  private final Zkl6 ZO;
  
  private final Zz2p Zf;
  
  private final Zk5q ZE;
  
  private final Zlvf Zn;
  
  private final Ztit Zr;
  
  private final Ze3n Zi;
  
  private final Zmz6 Zt;
  
  private final Zxs7 Zu;
  
  private final Zx5s ZT;
  
  private final Ztr ZX;
  
  private final Consumer<Throwable> Zc;
  
  private final Zqz Zw;
  
  private final Ztpx ZA;
  
  Zljq(Zkl6 paramZkl6, Zz2p paramZz2p, Zk5q paramZk5q, Zlvf paramZlvf, Ztit paramZtit, Ze3n paramZe3n, Zmz6 paramZmz6, Zxs7 paramZxs7, Zx5s paramZx5s, Ztr paramZtr, Consumer<Throwable> paramConsumer, Zqz paramZqz, Ztpx paramZtpx) {
    this.ZO = paramZkl6;
    this.Zf = paramZz2p;
    this.ZE = paramZk5q;
    int i = Zx4o.Zh();
    this.Zn = paramZlvf;
    this.Zr = paramZtit;
    this.Zi = paramZe3n;
    this.Zt = paramZmz6;
    this.Zu = paramZxs7;
    this.ZT = paramZx5s;
    this.ZX = paramZtr;
    this.Zc = paramConsumer;
    this.Zw = paramZqz;
    this.ZA = paramZtpx;
    if (Zbqc.Zwu() == null)
      Zx4o.ZW(++i); 
  }
  
  public void Za(Zrj paramZrj, Zlsy paramZlsy) {
    this.ZO.ZH();
    Zefx zefx = this.Zn.ZM().Z_();
    this.Zf.Zf(this.ZA, zefx, this.ZE.Zb.Zo.buildTaintSources.apply(this.ZE.Zb.Zm), this.Zn.ZM().ZT(), this.ZE.ZO.Zi(), this.Zr.ZA(this::lambda$execute$1, this.Zu, this.Zn, this.ZE.Zb.Zg, null, Zkv7.NO_FOLLOWUPS), this.ZE.Zb.Zo, this.ZE.Zb.Zo.buildPayload.apply(this.ZE.Zb.Zm));
    int i = Zx4o.Zm();
    if (this.ZX.hasNext())
      paramZlsy.ZR(new Zm6p(this.ZT, this.Zi, this.Zu, this.ZX.Zx(), this.Zc, this.Zw)); 
    if (i != 0)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  private void lambda$execute$1(Zx4o paramZx4o) {
    this.ZX.Zr();
    paramZx4o.Zn(this::lambda$execute$0);
  }
  
  private void lambda$execute$0(Zx_5 paramZx_5) {
    this.Zt.Zk(paramZx_5, this.Zi.ZM());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zljq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */