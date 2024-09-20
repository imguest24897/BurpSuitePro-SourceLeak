package burp;

public abstract class Zxkd {
  protected final Zrgd Zq;
  
  protected final Zgb6 ZM;
  
  protected final Zkl6 ZF;
  
  protected final Zbw_ ZY;
  
  Zxkd(Zrgd paramZrgd, Zbw_ paramZbw_, Zgb6 paramZgb6, Zkl6 paramZkl6) {
    this.Zq = paramZrgd;
    this.ZY = paramZbw_;
    this.ZM = paramZgb6;
    this.ZF = paramZkl6;
  }
  
  protected Zmzk Zd(Zml3 paramZml3) {
    Zmzk zmzk = paramZml3.ZZ();
    Zrt_ zrt_ = this.ZF.Zt().ZG(zmzk.ZJ1());
    return (zrt_ == null) ? zmzk : zrt_.ZH();
  }
  
  abstract void ZL(Zml3 paramZml3) throws Zz8v, Zz8b;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxkd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */