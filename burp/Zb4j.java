package burp;

import net.portswigger.Zl0;

public class Zb4j implements Zkvu {
  private final Runnable ZQ;
  
  private final Zr_4 ZG;
  
  private final Zt4u Zd;
  
  private final Zb0h Zr;
  
  private final Zl0 ZU;
  
  private final boolean Zm;
  
  public Zb4j(Runnable paramRunnable, Zr_4 paramZr_4, Zt4u paramZt4u, Zb0h paramZb0h, Zl0 paramZl0, boolean paramBoolean) {
    this.ZQ = paramRunnable;
    this.ZG = paramZr_4;
    this.Zd = paramZt4u;
    this.Zr = paramZb0h;
    int[] arrayOfInt = Zbq4.ZU();
    this.ZU = paramZl0;
    this.Zm = paramBoolean;
    if (Zbqc.Zwu() == null)
      Zbq4.ZE(new int[1]); 
  }
  
  public Zx_2 ZV(Zrnm paramZrnm) {
    return new Zbmd(paramZrnm, this.ZQ);
  }
  
  public Zesr Zn() {
    return new Zbmt(this.ZG);
  }
  
  public Zedf ZB() {
    return new Zbbo(this.Zd, this.ZG, this.ZU, this.Zr);
  }
  
  public Zmvs ZT() {
    return new Zbbz();
  }
  
  public Zr6x Zv() {
    return new Zbb0();
  }
  
  public Ztec Zx() {
    return new Zbbs();
  }
  
  public Zs3_ ZN() {
    return new Zbbu(this.ZQ, this.Zm);
  }
  
  public Zrk3 Zb() {
    return new Zbbj(this.ZG);
  }
  
  public Zghj Zl() {
    return new Zbbw(this.ZG);
  }
  
  public Ztow Zp() {
    return new Zbbn(this.ZG);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb4j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */