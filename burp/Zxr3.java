package burp;

import java.awt.event.ActionEvent;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zxr3 {
  private final ReadWriteLock Zz = new ReentrantReadWriteLock();
  
  private final Deque<Runnable> Zv = new ConcurrentLinkedDeque<>();
  
  private final Timer ZV = new Timer(100, this::lambda$new$0);
  
  public Zxr3() {
    this.ZV.setInitialDelay(0);
    this.ZV.setRepeats(true);
  }
  
  public void ZF(Runnable paramRunnable) {
    this.Zv.addLast(paramRunnable);
    if (SwingUtilities.isEventDispatchThread() && Zu())
      return; 
    if (!this.ZV.isRunning())
      this.ZV.start(); 
  }
  
  private boolean Zu() {
    int[] arrayOfInt = Zmua.ZG();
    try {
      if (this.Zz.writeLock().tryLock(10L, TimeUnit.MILLISECONDS))
        try {
          this.ZV.stop();
          while (!this.Zv.isEmpty()) {
            ((Runnable)this.Zv.removeFirst()).run();
            if (arrayOfInt != null)
              break; 
          } 
          return true;
        } finally {
          this.Zz.writeLock().unlock();
        }  
      return false;
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      return false;
    } 
  }
  
  public void ZJ(Runnable paramRunnable) {
    this.Zz.readLock().lock();
    try {
      paramRunnable.run();
    } finally {
      this.Zz.readLock().unlock();
    } 
  }
  
  public void Zt(Runnable paramRunnable) throws InterruptedException {
    this.Zz.readLock().lockInterruptibly();
    try {
      paramRunnable.run();
    } finally {
      this.Zz.readLock().unlock();
    } 
  }
  
  public <T> T ZJ(Supplier<T> paramSupplier) {
    this.Zz.readLock().lock();
    try {
      return paramSupplier.get();
    } finally {
      this.Zz.readLock().unlock();
    } 
  }
  
  public int ZL(IntSupplier paramIntSupplier) {
    this.Zz.readLock().lock();
    try {
      return paramIntSupplier.getAsInt();
    } finally {
      this.Zz.readLock().unlock();
    } 
  }
  
  private void lambda$new$0(ActionEvent paramActionEvent) {
    Zu();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxr3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */