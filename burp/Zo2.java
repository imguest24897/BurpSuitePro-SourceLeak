package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zo2 {
  private final Zl3z ZL;
  
  private final Ze3o ZE;
  
  private final Zxym ZC;
  
  public Zo2(Zl3z paramZl3z, Ze3o paramZe3o, Zxym paramZxym) {
    this.ZL = paramZl3z;
    this.ZE = paramZe3o;
    this.ZC = paramZxym;
  }
  
  public void ZF() {
    if (this.ZL.ZY() == null) {
      Zuh.Zb(false, Zqf.Zs);
      return;
    } 
    if (this.ZC.ZA())
      this.ZC.Zr(this.ZL, this.ZE, Zeew.SCANNER); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zo2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */