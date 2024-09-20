package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zrza implements Runnable {
  private Zm82 ZR;
  
  Zrza(Zm82 paramZm82) {
    this.ZR = paramZm82;
  }
  
  public void run() {
    Zbqc[] arrayOfZbqc = Zm82.Zb();
    try {
      boolean bool;
      do {
        bool = this.ZR.ZU();
      } while (bool && arrayOfZbqc != null);
    } catch (OutOfMemoryError outOfMemoryError) {
      Zah.Zl(outOfMemoryError, Zk_.COMMON_RUNTIME_FAILURE);
      Ztyh.ZR(this.ZR.Zk());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrza.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */