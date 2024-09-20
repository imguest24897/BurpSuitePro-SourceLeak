package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zkr1<T> implements Iterable<T> {
  private final List<T> ZI = new ArrayList<>();
  
  public void Zy(T paramT) {
    this.ZI.add(paramT);
  }
  
  public T Zc() {
    return (this.ZI.size() < 1) ? null : this.ZI.remove(this.ZI.size() - 1);
  }
  
  public T ZP() {
    return ZZ(1);
  }
  
  public T ZZ(int paramInt) {
    return (this.ZI.size() - paramInt < 0) ? null : this.ZI.get(this.ZI.size() - paramInt);
  }
  
  public void ZG() {
    this.ZI.clear();
  }
  
  public Iterator<T> iterator() {
    return this.ZI.iterator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkr1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */