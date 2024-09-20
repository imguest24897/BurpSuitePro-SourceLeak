package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

class Ztwk implements Runnable {
  final Zbmo Zl;
  
  Ztwk(Zbmo paramZbmo) {}
  
  public void run() {
    try {
      String str = this.Zl.ZS.Zp();
      if (str == null)
        return; 
      this.Zl.Zy(Zyf.Zy(Zkb.Zy(str)));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztwk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */