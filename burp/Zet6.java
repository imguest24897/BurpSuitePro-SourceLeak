package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zet6 {
  private final Zz28 Z_;
  
  private final Zr_4 ZE;
  
  private final Zr_4 Zb;
  
  private final Zr1j Zk;
  
  public Zet6(Zz28 paramZz28, Zr_4 paramZr_41, Zr_4 paramZr_42, Zr1j paramZr1j) {
    this.Z_ = paramZz28;
    this.ZE = paramZr_41;
    this.Zb = paramZr_42;
    this.Zk = paramZr1j;
  }
  
  public Zz28 Zr(Zkj1 paramZkj1) {
    switch (Ztyk.ZP[paramZkj1.ZGk().ordinal()]) {
      case 1:
        return Zslu.ZY;
      case 2:
        return this.Z_;
      case 3:
        return new Zlor(paramZkj1.ZGY(), paramZkj1.ZGp(), this.ZE, this.Zb, this.Zk);
    } 
    Zuh.Zb(false, Zqf.Zr);
    return this.Z_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zet6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */