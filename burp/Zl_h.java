package burp;

import java.util.AbstractCollection;
import java.util.Iterator;

class Zl_h extends AbstractCollection<V> {
  final Zrlv Zj;
  
  private Zl_h(Zrlv paramZrlv) {}
  
  public Iterator<V> iterator() {
    return new Zbpz(this.Zj);
  }
  
  public int size() {
    return this.Zj.ZG;
  }
  
  public boolean contains(Object paramObject) {
    return this.Zj.containsValue(paramObject);
  }
  
  public boolean remove(Object paramObject) {
    Iterator<V> iterator = iterator();
    while (iterator.hasNext()) {
      if (iterator.next() == paramObject) {
        iterator.remove();
        return true;
      } 
    } 
    return false;
  }
  
  public void clear() {
    this.Zj.clear();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl_h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */