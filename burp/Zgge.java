package burp;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zgge extends ThreadPoolExecutor {
  Zgge(Zt55 paramZt55, int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue, ThreadFactory paramThreadFactory) {
    super(paramInt1, paramInt2, paramLong, paramTimeUnit, paramBlockingQueue, paramThreadFactory);
  }
  
  protected void afterExecute(Runnable paramRunnable, Throwable paramThrowable) {
    String str = Zrgd.Zy();
    try {
      super.afterExecute(paramRunnable, paramThrowable);
      if (paramThrowable == null && paramRunnable instanceof Future)
        try {
          ((Future)paramRunnable).get();
        } catch (CancellationException cancellationException) {
          Zah.Zl(cancellationException, Zk_.IGNORED);
        } catch (ExecutionException executionException) {
          Zah.Zl(executionException, Zk_.PROCESSED_LATER);
          paramThrowable = executionException.getCause();
        } catch (InterruptedException interruptedException) {
          Zah.Zl(interruptedException, Zk_.COMMON_RUNTIME_FAILURE);
          Thread.currentThread().interrupt();
        }  
    } catch (CancellationException cancellationException) {
      throw a(null);
    } 
    try {
      if (paramThrowable != null) {
        try {
          if (Zepz.Zm(paramThrowable)) {
            try {
              Zah.Zl(paramThrowable, Zk_.COMMON_RUNTIME_FAILURE);
              if (str != null) {
                Zah.Zl(paramThrowable, Zk_.UNEXPECTED);
                return;
              } 
            } catch (CancellationException cancellationException) {
              throw a(null);
            } 
            return;
          } 
        } catch (CancellationException cancellationException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (CancellationException cancellationException) {
      throw a(null);
    } 
    Zah.Zl(paramThrowable, Zk_.UNEXPECTED);
  }
  
  private static CancellationException a(CancellationException paramCancellationException) {
    return paramCancellationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgge.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */