package burp;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zlrw implements Runnable {
  private final BlockingQueue<Zs1a> ZX;
  
  private final Zeuj ZT;
  
  private final Supplier<Boolean> Zb;
  
  private final AtomicBoolean Ze;
  
  Zlrw(BlockingQueue<Zs1a> paramBlockingQueue, Zeuj paramZeuj, Supplier<Boolean> paramSupplier) {
    this.ZX = paramBlockingQueue;
    this.ZT = paramZeuj;
    this.Zb = paramSupplier;
    this.Ze = new AtomicBoolean();
  }
  
  public void run() {
    String[] arrayOfString = Zzxk.Zj();
    while (!this.Ze.get()) {
      try {
        Zs1a zs1a = this.ZX.take();
        try {
          if (((Boolean)this.Zb.get()).booleanValue())
            this.ZT.ZW(zs1a); 
        } catch (InterruptedException interruptedException) {
          throw a(null);
        } 
      } catch (InterruptedException interruptedException) {
        Zah.Zl(interruptedException, Zk_.COMMON_RUNTIME_FAILURE);
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.UNEXPECTED);
        if (arrayOfString != null)
          break; 
      } 
    } 
  }
  
  void ZF() {
    this.Ze.set(true);
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlrw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */