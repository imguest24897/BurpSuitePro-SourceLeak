package burp;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public class Zrf3<T extends Zlm2> implements Iterator<T> {
  private final Zl5x ZK;
  
  private final Zbza Zd;
  
  private final Iterator<T> ZG;
  
  private final AtomicBoolean Zs = new AtomicBoolean();
  
  public Zrf3(Zl5x paramZl5x, Zbza paramZbza, Iterator<T> paramIterator) {
    this.ZK = paramZl5x;
    this.Zd = paramZbza;
    this.ZG = paramIterator;
  }
  
  public boolean hasNext() {
    if (!this.Zs.get() && ZY() && ZT())
      return this.ZG.hasNext(); 
    this.Zs.set(true);
    return false;
  }
  
  private boolean ZY() {
    synchronized (this.Zd.Zz6()) {
      return (this.Zd.Zg6() != 4);
    } 
  }
  
  private boolean ZT() {
    synchronized (this.Zd.Zz6()) {
      return (!this.Zd.ZO(this.ZK) || !this.Zd.ZgA().stream().anyMatch(this::lambda$queueItemHasNotFailedInPhase$0));
    } 
  }
  
  public T ZZ() {
    return this.ZG.next();
  }
  
  private boolean lambda$queueItemHasNotFailedInPhase$0(Zb09 paramZb09) {
    return paramZb09.ZY(this.ZK);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrf3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */