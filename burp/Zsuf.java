package burp;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Zsuf implements Zklo {
  private final Deque<Zmj7> Zi = new ConcurrentLinkedDeque<>();
  
  public boolean Zs() {
    return this.Zi.isEmpty();
  }
  
  public Zmj7 ZT() {
    return this.Zi.peek();
  }
  
  public Zmj7 ZO() {
    return this.Zi.poll();
  }
  
  public void Zz() {
    this.Zi.clear();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsuf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */