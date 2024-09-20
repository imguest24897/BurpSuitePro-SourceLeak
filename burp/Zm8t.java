package burp;

public class Zm8t {
  public final Zbza ZP;
  
  private final Zlba ZB;
  
  private final Zgev Zo;
  
  private final Zsy7 Zf;
  
  Zm8t(Zbza paramZbza, Zlba paramZlba, Zgev paramZgev, Zsy7 paramZsy7) {
    this.ZP = paramZbza;
    this.ZB = paramZlba;
    this.Zo = paramZgev;
    this.Zf = paramZsy7;
  }
  
  public void ZL(Zl5x paramZl5x) {
    Zlby zlby;
    boolean bool = false;
    synchronized (this.ZP.Zz6()) {
      zlby = this.ZP.ZW(paramZl5x);
      this.ZP.Zu(paramZl5x, Zlby.FINISHED);
      boolean bool1 = Ztcb.Zn(this.ZP);
      boolean bool2 = Ztcb.Zm(this.ZP);
      if (bool1 && bool2)
        bool = this.Zo.Zt(paramZl5x, this.ZP); 
      if (bool && this.ZP.Zg6() != 4)
        this.ZB.Zx(this.ZP); 
    } 
    this.Zo.ZP(paramZl5x, zlby);
    this.Zf.ZK(paramZl5x);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm8t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */