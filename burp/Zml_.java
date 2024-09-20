package burp;

import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

class Zml_ implements Zrbu {
  private final Zsy ZW;
  
  private final int Zr;
  
  private final int ZA;
  
  private final Zbjl ZV;
  
  private final Ztu0 Zq;
  
  Zml_(Zsy paramZsy, Ztu0 paramZtu0, Zbjl paramZbjl, int paramInt1, int paramInt2) {
    this.ZV = paramZbjl;
    this.Zr = paramInt1;
    this.ZA = paramInt2;
    this.ZW = paramZsy;
    this.Zq = paramZtu0;
  }
  
  public Zzwz Zc(Zxs7 paramZxs7) {
    Zlp9 zlp9 = this.Zq.Zu(paramZxs7);
    if (Zlp9.Za(Ztwf.Zx, zlp9))
      return new Zkm1(Zk7g.XML_INJECTION, this.ZW, this.Zr, this.ZA, this.ZV, paramZxs7); 
    if (Zlp9.Za(Ztwo.ZE, zlp9))
      return new Ztg0(Zk7g.XML_INJECTION, this.ZW, this.Zr, this.ZA, this.ZV, paramZxs7); 
    Zuh.Zv(false, Zqf.Zk, zlp9.Zz());
    return new Zkm1(Zk7g.XML_INJECTION, this.ZW, this.Zr, this.ZA, this.ZV, paramZxs7);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zml_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */