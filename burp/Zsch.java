package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zsch extends Zsc2 {
  private final Zrp0 ZS;
  
  Zsch(Zrp0 paramZrp0) {
    Zuh.Zb((paramZrp0 != null), Zqf.Zv);
    this.ZS = paramZrp0;
  }
  
  Zsch(Zrp0 paramZrp0, Throwable paramThrowable) {
    super(paramThrowable);
    Zuh.Zb((paramZrp0 != null), Zqf.Zv);
    this.ZS = paramZrp0;
  }
  
  public Zrp0 Zr() {
    return this.ZS;
  }
  
  public String toString() {
    return super.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsch.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */