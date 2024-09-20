package burp;

import java.util.Objects;

class Zxx2 implements Zxlu {
  private final Zxlu ZC;
  
  private final Zxlu ZE;
  
  Zxx2(Zxlu paramZxlu1, Zxlu paramZxlu2) {
    this.ZC = paramZxlu1;
    this.ZE = paramZxlu2;
  }
  
  public Zsqx<Zrdb> Zr() {
    Zsqx<Zrdb> zsqx1 = this.ZC.Zr();
    if (zsqx1 == null)
      return null; 
    Zsqx<Zrdb> zsqx2 = this.ZE.Zr();
    return Objects.<Zsqx<Zrdb>>requireNonNullElse(zsqx2, zsqx1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxx2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */