package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zxgh {
  private final Zkry Zm = new Zkry();
  
  private final Zkry Zj = new Zkry();
  
  boolean Zx(Zmcm paramZmcm) {
    return this.Zm.ZY(paramZmcm);
  }
  
  boolean Zb(Zmcm paramZmcm) {
    return this.Zj.ZY(paramZmcm);
  }
  
  void ZI(Zsp paramZsp) throws Zzt7 {
    try {
      this.Zm.Zh(paramZsp);
    } catch (IllegalStateException illegalStateException) {
      Zah.Zl(illegalStateException, Zk_.RETHROWN);
      throw new Zzt7(Zlxi.PROTOCOL_ERROR);
    } 
  }
  
  void ZD(Zsp paramZsp) {
    this.Zj.Zh(paramZsp);
  }
  
  boolean ZG() {
    return this.Zm.Z_();
  }
  
  boolean Zh() {
    return this.Zj.Z_();
  }
  
  boolean ZQ() {
    return this.Zm.Zn();
  }
  
  boolean Zs() {
    return this.Zj.Zn();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxgh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */