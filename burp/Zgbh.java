package burp;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zgbh implements Runnable, Zq0 {
  private final Queue<Zzi0> Zh;
  
  private final AtomicBoolean ZU;
  
  private final Zskh Zj;
  
  Zgbh(Queue<Zzi0> paramQueue, AtomicBoolean paramAtomicBoolean, Zskh paramZskh) {
    this.Zh = paramQueue;
    this.ZU = paramAtomicBoolean;
    this.Zj = paramZskh;
  }
  
  public void run() {
    Zbqc[] arrayOfZbqc = Ztpl.ZC();
    try {
      for (Zzi0 zzi0 : this.Zh) {
        if (!zzi0.Zd())
          return; 
        if (arrayOfZbqc == null)
          break; 
      } 
      for (Zzi0 zzi0 : this.Zh) {
        if (!zzi0.ZO())
          return; 
        zzi0.ZQ();
        zzi0.Zr();
        if (arrayOfZbqc == null)
          break; 
      } 
      for (Zzi0 zzi0 : this.Zh) {
        zzi0.ZY();
        if (arrayOfZbqc == null)
          break; 
      } 
    } catch (OutOfMemoryError outOfMemoryError) {
      Zah.Zl(outOfMemoryError, Zk_.COMMON_RUNTIME_FAILURE);
      Ztyh.ZR(this.Zj);
    } 
  }
  
  public void ZH() {
    Zm2.Zo(Zze0.REPEATER_UI_REQUEST_CANCELLED);
    this.ZU.set(true);
    this.Zh.forEach(Zzi0::ZV);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgbh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */