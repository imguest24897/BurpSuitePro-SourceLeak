package burp;

import java.util.List;

class Zb3e {
  private final Zl9 Z_;
  
  private final Ztwv ZI;
  
  private final Object ZO = new Object();
  
  private final Zskh ZB;
  
  private Zk1p ZX;
  
  Zb3e(Zl9 paramZl9, Ztwv paramZtwv, Zskh paramZskh) {
    this.Z_ = paramZl9;
    this.ZI = paramZtwv;
    this.ZB = paramZskh;
  }
  
  void ZC(List<Zeu1> paramList, boolean paramBoolean) {
    synchronized (this.ZO) {
      if (this.ZX != null) {
        this.ZX.ZD();
        this.ZX.ZE();
      } 
      this.ZX = new Zk1p(this);
    } 
    this.ZX.ZA(paramList, paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb3e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */