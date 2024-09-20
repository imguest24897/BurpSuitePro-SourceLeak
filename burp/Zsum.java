package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zsum implements Runnable {
  final Zx_ Zt;
  
  Zsum(Zx_ paramZx_) {}
  
  public void run() {
    try {
      this.Zt.ZT.scopeChanged(new Zsy0());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.Zt.ZW.ZN(throwable, this.Zt.Zh);
    } 
    synchronized (this) {
      notifyAll();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsum.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */