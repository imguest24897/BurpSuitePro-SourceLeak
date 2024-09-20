package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zgjp implements ScheduledExecutorService {
  private final ScheduledExecutorService ZW;
  
  private Zgjp(ScheduledExecutorService paramScheduledExecutorService) {
    this.ZW = paramScheduledExecutorService;
  }
  
  public ScheduledFuture<?> schedule(Runnable paramRunnable, long paramLong, TimeUnit paramTimeUnit) {
    return this.ZW.schedule(paramRunnable, paramLong, paramTimeUnit);
  }
  
  public <V> ScheduledFuture<V> schedule(Callable<V> paramCallable, long paramLong, TimeUnit paramTimeUnit) {
    return this.ZW.schedule(paramCallable, paramLong, paramTimeUnit);
  }
  
  public ScheduledFuture<?> scheduleAtFixedRate(Runnable paramRunnable, long paramLong1, long paramLong2, TimeUnit paramTimeUnit) {
    return this.ZW.scheduleAtFixedRate(paramRunnable, paramLong1, paramLong2, paramTimeUnit);
  }
  
  public ScheduledFuture<?> scheduleWithFixedDelay(Runnable paramRunnable, long paramLong1, long paramLong2, TimeUnit paramTimeUnit) {
    return this.ZW.scheduleWithFixedDelay(paramRunnable, paramLong1, paramLong2, paramTimeUnit);
  }
  
  public void shutdown() {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public List<Runnable> shutdownNow() {
    Zuh.Zb(false, Zqf.ZC);
    return Collections.emptyList();
  }
  
  public boolean isShutdown() {
    Zuh.Zb(false, Zqf.ZC);
    return this.ZW.isShutdown();
  }
  
  public boolean isTerminated() {
    Zuh.Zb(false, Zqf.ZC);
    return this.ZW.isTerminated();
  }
  
  public boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit) throws InterruptedException {
    Zuh.Zb(false, Zqf.ZC);
    return this.ZW.awaitTermination(paramLong, paramTimeUnit);
  }
  
  public <T> Future<T> submit(Callable<T> paramCallable) {
    Zuh.Zb(false, Zqf.ZC);
    return this.ZW.submit(paramCallable);
  }
  
  public <T> Future<T> submit(Runnable paramRunnable, T paramT) {
    Zuh.Zb(false, Zqf.ZC);
    return this.ZW.submit(paramRunnable, paramT);
  }
  
  public Future<?> submit(Runnable paramRunnable) {
    Zuh.Zb(false, Zqf.ZC);
    return this.ZW.submit(paramRunnable);
  }
  
  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection) throws InterruptedException {
    Zuh.Zb(false, Zqf.ZC);
    return this.ZW.invokeAll(paramCollection);
  }
  
  public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit) throws InterruptedException {
    Zuh.Zb(false, Zqf.ZC);
    return this.ZW.invokeAll(paramCollection, paramLong, paramTimeUnit);
  }
  
  public <T> T invokeAny(Collection<? extends Callable<T>> paramCollection) throws InterruptedException, ExecutionException {
    Zuh.Zb(false, Zqf.ZC);
    return this.ZW.invokeAny(paramCollection);
  }
  
  public <T> T invokeAny(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit) throws InterruptedException, ExecutionException, TimeoutException {
    Zuh.Zb(false, Zqf.ZC);
    return this.ZW.invokeAny(paramCollection, paramLong, paramTimeUnit);
  }
  
  public void execute(Runnable paramRunnable) {
    Zuh.Zb(false, Zqf.ZC);
    this.ZW.execute(paramRunnable);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgjp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */