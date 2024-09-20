package burp;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;

class Zmfa extends AbstractSet<K> {
  final Zrlv ZK;
  
  private Zmfa(Zrlv paramZrlv) {}
  
  public Iterator<K> iterator() {
    return new Zbp6(this.ZK);
  }
  
  public int size() {
    return this.ZK.ZG;
  }
  
  public boolean contains(Object paramObject) {
    return this.ZK.containsKey(paramObject);
  }
  
  public boolean remove(Object paramObject) {
    int i = this.ZK.ZG;
    this.ZK.remove(paramObject);
    return (this.ZK.ZG != i);
  }
  
  public boolean removeAll(Collection<?> paramCollection) {
    boolean bool = false;
    String str = Ztdo.ZX();
    Iterator<K> iterator = iterator();
    while (iterator.hasNext()) {
      if (paramCollection.contains(iterator.next())) {
        iterator.remove();
        bool = true;
        if (str != null)
          break; 
      } 
    } 
    return bool;
  }
  
  public void clear() {
    this.ZK.clear();
  }
  
  public int hashCode() {
    int i = 0;
    String str = Ztdo.ZX();
    for (Zgpi zgpi : this) {
      i += (zgpi == null) ? 0 : zgpi.hashCode();
      if (str != null)
        break; 
    } 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmfa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */