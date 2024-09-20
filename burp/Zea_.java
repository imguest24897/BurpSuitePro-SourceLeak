package burp;

class Zea_ {
  private static final Zxtv Zv = Zxtv.ZP().ZR(Ze45.SUPPRESS_HTTP2).ZF();
  
  private final Zgb6 ZW;
  
  private final Ztbb Zr;
  
  Zea_(Zgb6 paramZgb6, Ztbb paramZtbb) {
    this.ZW = paramZgb6;
    this.Zr = paramZtbb;
  }
  
  Zxtv ZF(Zxtv paramZxtv, Zmzk paramZmzk) {
    boolean bool1 = (paramZxtv.Zo() && !this.ZW.ZcC()) ? true : false;
    boolean bool2 = (paramZxtv.Zx() && this.Zr.ZQ(paramZmzk)) ? true : false;
    return (!paramZxtv.Zh() || bool1 || bool2) ? Zv : paramZxtv;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zea_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */