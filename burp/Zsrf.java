package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zsrf extends Zsg5 {
  Zsrf(Zldn paramZldn, Zxgn paramZxgn, Zmf8 paramZmf8) {
    super(paramZldn, paramZxgn, paramZmf8);
  }
  
  public Zlnz Zq(char paramChar) {
    if (this.Zn.ZR && paramChar == '>') {
      this.Zn.ZE(22);
      return this.ZL.Zq;
    } 
    if (!this.Zn.Zq()) {
      Zuh.Zb(false, Zqf.Zr);
      return this;
    } 
    if (this.Zn.ZM(paramChar)) {
      this.Zn.ZE(22);
      return this.ZL.Zd;
    } 
    if (!Zekt.Zy(paramChar)) {
      this.Zn.ZE(22);
      return this.ZL.Zw;
    } 
    return this;
  }
  
  public int Zl() {
    return 22;
  }
  
  public int Zq(Character paramCharacter) {
    return Ztj6.Zp(paramCharacter);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsrf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */