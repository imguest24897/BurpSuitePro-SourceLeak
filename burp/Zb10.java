package burp;

import java.time.Instant;
import java.util.LinkedList;

class Zb10 implements Zto5 {
  private final Zrgd ZH;
  
  private final Zso0 Zn;
  
  private final LinkedList<Zg3d> Zr;
  
  private Zlhj ZL;
  
  private Instant Ze;
  
  private Instant Zf;
  
  Zb10(Zrgd paramZrgd, Zso0 paramZso0, Zlhj paramZlhj) {
    this.ZH = paramZrgd;
    this.Zn = paramZso0;
    this.ZL = paramZlhj;
    this.Zr = new LinkedList<>();
  }
  
  public void ZF(Exception paramException) {
    ZA(Zb6g.Zx().Zd(this.Zn.ZA()).Zm(Zvom.NO_RESPONSE_DATA).Zs(paramException).Zc());
  }
  
  public void ZS(Zefx paramZefx, Exception paramException) {
    ZA(Zb6g.Zx().Zd(this.Zn.ZA()).Zf(paramZefx).Zm(Zvom.NO_RESPONSE_DATA).Zs(paramException).Zc());
  }
  
  public void ZC(Zefx paramZefx, Zm7u paramZm7u, Exception paramException) {
    ZA(Zb6g.Zx().Zd(this.Zn.ZA()).Zf(paramZefx).ZF(paramZm7u).ZT(this.Ze).Zg(this.Zf).ZQ(paramZm7u.ZR()).Zs(paramException).Zc());
  }
  
  public void Zr(Zefx paramZefx) {
    ZA(Zb6g.Zx().Zd(this.Zn.ZA()).Zf(paramZefx).Zm(Zvom.STREAMING_RESPONSE).Zc());
  }
  
  public void Zf(Zlhj paramZlhj) {
    ZA(paramZlhj);
  }
  
  void Z_() {
    this.Ze = this.ZH.Zn();
    if (this.Zf == null)
      this.Zf = this.Ze; 
  }
  
  Zlhj Zr() {
    return this.ZL;
  }
  
  void ZA(Zlhj paramZlhj) {
    this.ZL = paramZlhj;
  }
  
  Zmzk ZH() {
    return ((Zg3d)this.Zr.getFirst()).ZR().ZT();
  }
  
  Instant ZE() {
    return this.Ze;
  }
  
  Instant Zf() {
    return this.Zf;
  }
  
  Zsxd Zo() {
    return new Zrbo(this.Zr, this.ZL);
  }
  
  void ZL(Exception paramException) {
    ZA(Zb6g.Zx().Zd(this.Zn.ZA()).Zm(Zvom.UNKNOWN_HOST).Zs(paramException).Zc());
  }
  
  void ZH(Exception paramException) {
    ZA(Zb6g.Zx().Zd(this.Zn.ZA()).Zm(Zvom.CONNECTION_FAILED).Zs(paramException).Zc());
  }
  
  void Zz() {
    ZA(Zb6g.Zx().Zd(this.Zn.ZA()).Zm(Zvom.ABORTED).Zc());
  }
  
  void ZM() {
    ZA(Zb6g.Zx().Zd(this.Zn.ZA()).Zf(this.Zn.Zr()).Zm(Zvom.ABORTED).Zc());
  }
  
  void Zv(Zm7u paramZm7u) {
    ZA(Zb6g.Zx().Zd(this.Zn.ZA()).Zf(this.Zn.Zr()).ZF(paramZm7u).Zm(Zvom.ABORTED).ZT(this.Ze).Zg(this.Zf).ZQ(paramZm7u.ZR()).Zo(paramZm7u.ZQ()).Zc());
  }
  
  void Zg(Zm7u paramZm7u) {
    ZA(Zb6g.Zx().Zd(this.Zn.ZA()).Zf(this.Zn.Zr()).ZF(paramZm7u).ZT(this.Ze).ZQ(paramZm7u.ZR()).Zg(this.Zf).Zo(paramZm7u.ZQ()).Zc());
  }
  
  public void ZE(Zefx paramZefx, Zm7u paramZm7u, Exception paramException) {
    ZA(Zb6g.Zx().Zd(this.Zn.ZA()).Zf(paramZefx).ZF(paramZm7u).Zm(Zvom.TIMED_OUT).ZT(this.Ze).ZQ(paramZm7u.ZR()).Zg(this.Zf).Zs(paramException).Zc());
  }
  
  void ZE(Zm7u paramZm7u, Exception paramException) {
    ZA(Zb6g.Zx().Zd(this.Zn.ZA()).Zf(this.Zn.Zr()).ZF(paramZm7u).ZT(this.Ze).Zg(this.Zf).ZQ(paramZm7u.ZR()).Zo(paramZm7u.ZQ()).Zs(paramException).Zc());
  }
  
  void Zq(Exception paramException) {
    ZA(Zb6g.Zx().Zd(this.Zn.ZA()).Zf(this.Zn.Zr()).Zm(Zvom.NO_RESPONSE_DATA).Zs(paramException).Zc());
  }
  
  private void ZA(Zg3d paramZg3d) {
    this.Zr.add(paramZg3d);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb10.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */