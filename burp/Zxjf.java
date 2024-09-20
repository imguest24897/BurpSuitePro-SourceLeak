package burp;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zxjf {
  static String Zi(Exception paramException) {
    String[] arrayOfString = Zkr6.Zfn();
    Exception exception = paramException;
    while (exception != null) {
      try {
        if (exception instanceof Ztku)
          return exception.getMessage(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      Throwable throwable = exception.getCause();
      if (arrayOfString != null)
        break; 
    } 
    return null;
  }
  
  public static <T> T ZQ(Callable<T> paramCallable) {
    T t;
    try {
      t = paramCallable.call();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.RETHROWN);
      throw new RuntimeException(exception);
    } 
    return t;
  }
  
  public static void Zi(Runnable paramRunnable) {
    paramRunnable.run();
  }
  
  public static void Zc(Runnable paramRunnable) {}
  
  public static void ZA(Runnable paramRunnable, ReentrantLock paramReentrantLock) {
    paramReentrantLock.lock();
    try {
      paramRunnable.run();
    } finally {
      paramReentrantLock.unlock();
    } 
  }
  
  public static void ZC(ScheduledExecutorService paramScheduledExecutorService) {
    paramScheduledExecutorService.shutdown();
    try {
      if (!paramScheduledExecutorService.awaitTermination(1L, TimeUnit.SECONDS))
        paramScheduledExecutorService.shutdownNow(); 
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.UNEXPECTED);
      paramScheduledExecutorService.shutdownNow();
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxjf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */