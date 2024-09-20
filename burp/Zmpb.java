package burp;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zmpb implements Zr97, Runnable, Ztu3 {
  private final Zbnt ZI;
  
  private final Consumer<Zto7> ZK;
  
  private final Zzes Zv;
  
  private final BlockingQueue<Zesy> Zn;
  
  private final AtomicBoolean ZW;
  
  public Zmpb(Zbnt paramZbnt, Consumer<Zto7> paramConsumer, Zzes paramZzes) {
    this.ZI = paramZbnt;
    this.ZK = paramConsumer;
    this.Zv = paramZzes;
    this.Zn = new LinkedBlockingQueue<>();
    this.ZW = new AtomicBoolean(true);
  }
  
  public void run() {
    int[] arrayOfInt = Ze5j.ZP9();
    while (this.ZW.get()) {
      try {
        Zesy zesy = this.Zn.take();
        try {
          if (this.Zv.ZZ(zesy)) {
            try {
            
            } catch (InterruptedException interruptedException) {
              throw a(null);
            } 
            Zstu zstu = (zesy.ZM != null) ? zesy.ZM.Za() : Zyf.ZQm();
            Ze5j ze5j = new Ze5j(this.ZI, zesy.ZW, zesy.Zq, zesy.Zx, zesy.ZV, zstu, zesy.Zd, zesy.ZQ, zesy.Zb, zesy.ZC, zesy.ZE);
            try {
              if (this.Zv.ZN(ze5j))
                this.ZK.accept(ze5j); 
            } catch (InterruptedException interruptedException) {
              throw a(null);
            } 
          } 
        } catch (InterruptedException interruptedException) {
          throw a(null);
        } 
      } catch (InterruptedException interruptedException) {
        Zah.Zl(interruptedException, Zk_.COMMON_RUNTIME_FAILURE);
        Thread.currentThread().interrupt();
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.UNEXPECTED);
        if (arrayOfInt == null)
          break; 
      } 
    } 
  }
  
  public void ZZ(Zesy paramZesy) {
    if (this.Zv.ZZ(paramZesy))
      this.Zn.add(paramZesy); 
  }
  
  public void ZY() {
    this.ZW.set(false);
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmpb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */