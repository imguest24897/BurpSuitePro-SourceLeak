package burp;

import java.util.Objects;

class Zsr_ extends Zsg5 {
  Zsr_(Zldn paramZldn, Zxgn paramZxgn, Zmf8 paramZmf8) {
    super(paramZldn, paramZxgn, paramZmf8);
  }
  
  public Zlnz Zq(char paramChar) {
    this.Zn.ZE(26);
    this.Zn.ZR = false;
    if (this.Zn.Zc) {
      this.Zn.Zc = false;
      Objects.requireNonNull(this.Zn);
      Objects.requireNonNull(this.Zn);
      return this.Zn.ZX(1, Zska.ZK(), this.Zn::ZN, this.Zn::Z_, Ztj6::Za, this.ZL.ZL);
    } 
    if (this.Zn.ZB) {
      this.Zn.ZB = false;
      Objects.requireNonNull(this.Zn);
      Objects.requireNonNull(this.Zn);
      return this.Zn.ZX(2, Zska.ZK(), this.Zn::Zp, this.Zn::ZL, Ztj6::Zt, this.ZL.ZL);
    } 
    return (paramChar == '<') ? this.ZL.ZL : (Zekt.Zy(paramChar) ? this.ZL.Ze : this.ZL.Zc);
  }
  
  public int Zl() {
    return 26;
  }
  
  public void ZA() {
    String[] arrayOfString = Zldn.ZS();
    if (this.Zn.Zc) {
      this.Zj.ZQ(Ztj6.Za(this.Zj.Zy()));
      this.Zj.ZO(1);
      if (arrayOfString != null) {
        if (this.Zn.ZB) {
          this.Zj.ZQ(Ztj6.Zt(this.Zj.Zy()));
          this.Zj.ZO(2);
        } 
        return;
      } 
      return;
    } 
    if (this.Zn.ZB) {
      this.Zj.ZQ(Ztj6.Zt(this.Zj.Zy()));
      this.Zj.ZO(2);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsr_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */