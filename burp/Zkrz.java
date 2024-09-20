package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkrz extends Zkro {
  private final Zl77 ZS;
  
  private final Zegl ZA;
  
  private final Zm6v Zp;
  
  private final Zbnt ZR;
  
  private final Zz28 Zk;
  
  private final Zskl Za;
  
  private Zl4 ZN;
  
  public Zkrz(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgbj paramZgbj, Zgb6 paramZgb6, Zxgc paramZxgc, Zskh paramZskh, Zgzy paramZgzy, Zkl6 paramZkl6, Ztwv paramZtwv, Zr_4 paramZr_4, Zl77 paramZl77, Zegl paramZegl, Zm6v paramZm6v, Zbnt paramZbnt, Zz28 paramZz28, Zm6x paramZm6x, Zskl paramZskl) {
    super(paramZz0n, paramZt4u, paramZerg, paramZgbj, paramZgb6, paramZxgc, paramZskh, paramZgzy, paramZkl6, Zeew.LOGGER, paramZtwv, paramZr_4, paramZl77, paramZm6x);
    this.ZS = paramZl77;
    this.ZA = paramZegl;
    this.Zp = paramZm6v;
    this.ZR = paramZbnt;
    this.Zk = paramZz28;
    this.Za = paramZskl;
  }
  
  public void ZYE() {}
  
  public void ZYq() {
    this.ZN = new Zl4(this.ZW, this.ZS, this.ZA, this.ZJ.ZN().ZvB().ZmN(), this.Zl, this.ZR, this.Zp, this.Zk, this.Za);
    this.Z_ = this.ZN.ZA();
  }
  
  public void ZYO() {
    if (this.ZN == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    this.ZN.Zt2();
  }
  
  public void Zd(Zmf_ paramZmf_) {
    if (this.ZN == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    this.ZN.Zd(paramZmf_);
  }
  
  public void Zl(Zg4j paramZg4j) {
    this.ZN.Zl(paramZg4j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkrz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */