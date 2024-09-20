package burp;

import java.time.Duration;
import java.time.Instant;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zb6g {
  private Zefx ZO;
  
  private Zefx ZR;
  
  private Zb6q ZC;
  
  private Zvom Zo;
  
  private Instant Zm;
  
  private Instant ZT;
  
  private Instant Zt;
  
  private Instant ZJ;
  
  private Exception ZD;
  
  static Zb6g Zx() {
    return new Zb6g();
  }
  
  Zb6g Zd(Zefx paramZefx) {
    this.ZO = paramZefx;
    return this;
  }
  
  Zb6g Zf(Zefx paramZefx) {
    this.ZR = paramZefx;
    return this;
  }
  
  Zb6g ZF(Zb6q paramZb6q) {
    this.ZC = paramZb6q;
    return this;
  }
  
  Zb6g Zm(Zvom paramZvom) {
    this.Zo = paramZvom;
    return this;
  }
  
  Zb6g ZT(Instant paramInstant) {
    this.Zm = paramInstant;
    return this;
  }
  
  Zb6g ZQ(Instant paramInstant) {
    this.Zt = paramInstant;
    return this;
  }
  
  Zb6g Zg(Instant paramInstant) {
    this.ZT = paramInstant;
    return this;
  }
  
  Zb6g Zo(Instant paramInstant) {
    this.ZJ = paramInstant;
    return this;
  }
  
  Zb6g Zs(Exception paramException) {
    this.ZD = paramException;
    return this;
  }
  
  Zg3d Zc() {
    Zuh.Zv((this.ZO != null), Zqf.Zv, 1L);
    if (this.ZC == null)
      Zuh.Zv((this.Zo != null), Zqf.Zv, 2L); 
    if (this.Zo == null)
      this.Zo = (this.ZC.Za().Zpu() == 0) ? Zvom.NO_RESPONSE_DATA : Zvom.RESPONSE_RECEIVED; 
    return new Ztj2(this.ZO, this.ZR, this.ZC, this.Zo, this.Zm, this.Zt, Zo(this.ZT, this.Zt), Zo(this.ZT, this.ZJ), this.ZD);
  }
  
  private static Duration Zo(Instant paramInstant1, Instant paramInstant2) {
    return (paramInstant1 == null || paramInstant2 == null) ? Zsxd.ZG : Duration.between(paramInstant1, paramInstant2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb6g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */