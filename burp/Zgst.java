package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zgst implements Runnable {
  private final Zzi0 Zd;
  
  private final AtomicBoolean ZD;
  
  private final Zskh Zv;
  
  Zgst(Zzi0 paramZzi0, AtomicBoolean paramAtomicBoolean, Zskh paramZskh) {
    this.Zd = paramZzi0;
    this.ZD = paramAtomicBoolean;
    this.Zv = paramZskh;
  }
  
  public void run() {
    try {
      if (!this.Zd.Zd())
        return; 
      if (!this.Zd.ZO())
        return; 
      this.Zd.ZQ();
      this.Zd.Zr();
      this.Zd.ZY();
    } catch (OutOfMemoryError outOfMemoryError) {
      Zah.Zl(outOfMemoryError, Zk_.COMMON_RUNTIME_FAILURE);
      Ztyh.ZR(this.Zv);
    } 
  }
  
  public void ZW() {
    Zm2.Zo(Zze0.REPEATER_UI_REQUEST_CANCELLED);
    this.ZD.set(true);
    this.Zd.ZV();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgst.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */