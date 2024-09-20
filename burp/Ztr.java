package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zsy;

public class Ztr implements Iterator<Zk5q> {
  private final Queue<Zx4o> ZE;
  
  private final AtomicBoolean Zm;
  
  private final Zsy Zc;
  
  private Iterator<Zx57> Zu;
  
  public Ztr(Zsy paramZsy, Collection<Zx4o> paramCollection) {
    this.Zc = paramZsy;
    this.ZE = new ConcurrentLinkedDeque<>(paramCollection);
    this.Zm = new AtomicBoolean();
  }
  
  public boolean hasNext() {
    if (this.Zu != null && !this.Zu.hasNext()) {
      this.ZE.poll();
      this.Zm.set(false);
    } 
    if (this.Zu == null || !this.Zu.hasNext())
      ZJ(); 
    return this.Zu.hasNext();
  }
  
  private void ZJ() {
    this.Zu = (this.ZE.peek() == null) ? Collections.<Zx57>emptyIterator() : ((Zx4o)this.ZE.peek()).ZE(this.Zc).iterator();
  }
  
  public Zk5q Zx() {
    return new Zk5q(this.ZE.peek(), this.Zu.next());
  }
  
  void Zr() {
    this.Zm.set(true);
    this.Zu = Collections.emptyIterator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */