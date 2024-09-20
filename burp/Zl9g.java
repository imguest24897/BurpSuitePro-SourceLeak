package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zl9g extends Zl9l {
  final Zr05 ZL;
  
  final Zgd Zf;
  
  Zl9g(Zgd paramZgd, Zr05 paramZr05) {}
  
  public boolean ZF(Zez3 paramZez3) {
    try {
      if (!this.Zf.ZB.ZD(paramZez3))
        return false; 
      this.ZL.Zq(this.Zf.ZS(paramZez3, true), this.Zf.ZC.ZK(paramZez3.ZkJ()));
      paramZez3.ZK(this);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl9g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */