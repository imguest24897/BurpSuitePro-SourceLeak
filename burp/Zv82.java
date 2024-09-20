package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zv82 extends Zv84 {
  private final Zlas ZE;
  
  public Zv82(Zlas paramZlas) {
    this.ZE = paramZlas;
  }
  
  public Zvb Zb(Zvb paramZvb) {
    Zuh.Zb(paramZvb instanceof Zbo4, Zqf.Zr);
    if (paramZvb instanceof Zbo4) {
      Zbo4 zbo4 = (Zbo4)paramZvb;
      Ztc6 ztc6 = zbo4.ZK();
      if (ztc6.ZB())
        return new Ze8_(); 
      if (ztc6.ZQ())
        this.ZE.Zk(); 
      return new Zx64(Zb0_.Zq(ztc6));
    } 
    return null;
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv82.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */