package burp;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class Zk81<T> extends AbstractQueue<T> implements BlockingQueue<T> {
  private final AtomicReference<T> ZB = new AtomicReference<>();
  
  final Object Zd = new Object();
  
  public Iterator<T> iterator() {
    T t = peek();
    return (t == null) ? Collections.<T>emptyIterator() : Collections.<T>singleton(t).iterator();
  }
  
  public int size() {
    return (peek() == null) ? 0 : 1;
  }
  
  public void put(T paramT) throws InterruptedException {
    offer(paramT);
  }
  
  public boolean offer(T paramT, long paramLong, TimeUnit paramTimeUnit) throws InterruptedException {
    offer(paramT);
    return true;
  }
  
  public T take() throws InterruptedException {
    int i = Zl4x.Zt();
    synchronized (this.Zd) {
      T t;
      while ((t = poll()) == null) {
        this.Zd.wait();
        if (i != 0)
          break; 
      } 
      return t;
    } 
  }
  
  public T poll(long paramLong, TimeUnit paramTimeUnit) throws InterruptedException {
    synchronized (this.Zd) {
      T t = poll();
      if (t == null) {
        paramTimeUnit.timedWait(this.Zd, paramLong);
        return poll();
      } 
      return t;
    } 
  }
  
  public int remainingCapacity() {
    return (peek() == null) ? 1 : 0;
  }
  
  public int drainTo(Collection<? super T> paramCollection) {
    T t = poll();
    if (t == null)
      return 0; 
    paramCollection.add(t);
    return 1;
  }
  
  public int drainTo(Collection<? super T> paramCollection, int paramInt) {
    return (paramInt <= 0) ? 0 : drainTo(paramCollection);
  }
  
  public boolean offer(T paramT) {
    synchronized (this.Zd) {
      this.ZB.set(paramT);
      this.Zd.notifyAll();
    } 
    return true;
  }
  
  public T poll() {
    synchronized (this.Zd) {
      return this.ZB.getAndSet(null);
    } 
  }
  
  public T peek() {
    return this.ZB.get();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk81.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */