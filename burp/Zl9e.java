package burp;

import java.util.List;

class Zl9e extends Zl9l {
  private final List<Zez3> Zm;
  
  private final Zlc8 Zu;
  
  private float ZE;
  
  private final float ZW;
  
  private final String ZS;
  
  private Zl9e(List<Zez3> paramList, Zlc8 paramZlc8, float paramFloat1, float paramFloat2, String paramString) {
    this.Zm = paramList;
    this.Zu = paramZlc8;
    this.ZE = paramFloat1;
    this.ZW = paramFloat2;
    this.ZS = paramString;
  }
  
  protected boolean ZF(Zez3 paramZez3) {
    if (!Zzyo.Zx(this.Zm, paramZez3, this.Zu, this.ZE, this.ZW, this.ZS))
      return true; 
    this.ZE += this.ZW;
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl9e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */