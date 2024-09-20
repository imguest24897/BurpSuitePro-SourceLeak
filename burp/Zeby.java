package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zeby implements Zmxf {
  private final Zefx Zm;
  
  private final Zlou ZL;
  
  private final Zmxf Zo;
  
  Zeby(Zbnt paramZbnt, Zey9 paramZey9, Zefx paramZefx, Zlou paramZlou) {
    this.Zm = paramZefx;
    this.ZL = paramZlou;
    this.Zo = new Zm8(paramZbnt, paramZey9, paramZefx, paramZlou);
  }
  
  public Zefx ZF(Zr6h paramZr6h) {
    boolean bool = this.Zm.Zc().stream().anyMatch(this::lambda$modify$0);
    return bool ? this.Zo.ZF(paramZr6h) : this.Zm;
  }
  
  private static boolean Zn(Zlou paramZlou) {
    switch (Zeb2.ZK[paramZlou.Zx.ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
        return true;
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
        return false;
    } 
    Zuh.ZT(false, Zqf.Zr, paramZlou.Zx.name());
    return false;
  }
  
  private boolean lambda$modify$0(Zlou paramZlou) {
    return (Zn(paramZlou) && paramZlou.ZA.equals(this.ZL.ZA) && paramZlou.Zx == this.ZL.Zx && (this.ZL.Zr == null || this.ZL.Zr.equals(paramZlou.Zr)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeby.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */