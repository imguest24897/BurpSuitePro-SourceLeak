package burp;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import javax.swing.SwingUtilities;

public interface Ztwv extends Executor {
  default void execute(Runnable paramRunnable) {
    Zx(paramRunnable);
  }
  
  Future<?> Zx(Runnable paramRunnable);
  
  <V> Future<V> ZO(Callable<V> paramCallable);
  
  Future<?> Zl(Runnable paramRunnable, String paramString);
  
  <V> Future<V> ZA(Callable<V> paramCallable, String paramString);
  
  default boolean Zu() {
    return SwingUtilities.isEventDispatchThread();
  }
  
  default ScheduledExecutorService Ze() {
    return Zu(1);
  }
  
  static ScheduledExecutorService Zu(int paramInt) {
    return Zv(paramInt, Executors.defaultThreadFactory());
  }
  
  static ScheduledExecutorService Zv(int paramInt, ThreadFactory paramThreadFactory) {
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(paramInt, paramThreadFactory);
    if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor)scheduledExecutorService;
      scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
    } 
    return scheduledExecutorService;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztwv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */