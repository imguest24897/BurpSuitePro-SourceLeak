package burp;

import java.awt.Component;
import net.portswigger.Zl0;

public class Zbqp {
  private final Zxts Zc;
  
  private final Zl0 Za;
  
  private final Zz8a ZG;
  
  private final Zrq8 ZM;
  
  public Zbqp(Zxts paramZxts, Zl0 paramZl0, Zz8a paramZz8a) {
    this.Zc = paramZxts;
    this.Za = paramZl0;
    this.ZG = paramZz8a;
    this.ZM = new Zgjo();
  }
  
  public Zbm8 Zi(Zl4w paramZl4w, Zb5 paramZb5) {
    return new Zbm8(paramZl4w, paramZb5, this.ZM, this.Zc, this.Za, this.ZG);
  }
  
  public Zrhb Zh(Component paramComponent, Zmln... paramVarArgs) {
    return new Zrhb(paramComponent, this.ZG, paramVarArgs);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbqp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */