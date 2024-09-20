package burp;

import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class Zzpb extends AbstractSet<Map.Entry<K, V>> {
  final Zrlv ZN;
  
  private Zzpb(Zrlv paramZrlv) {}
  
  public Iterator<Map.Entry<K, V>> iterator() {
    return new Zbpl(this.ZN);
  }
  
  public boolean contains(Object paramObject) {
    if (!(paramObject instanceof Map.Entry))
      return false; 
    Map.Entry entry = (Map.Entry)paramObject;
    return this.ZN.Zy(entry.getKey(), entry.getValue());
  }
  
  public boolean remove(Object paramObject) {
    if (!(paramObject instanceof Map.Entry))
      return false; 
    Map.Entry entry = (Map.Entry)paramObject;
    return this.ZN.ZE(entry.getKey(), entry.getValue());
  }
  
  public int size() {
    return this.ZN.ZG;
  }
  
  public void clear() {
    this.ZN.clear();
  }
  
  public boolean removeAll(Collection<?> paramCollection) {
    boolean bool = false;
    String str = Ztdo.ZX();
    Iterator<Map.Entry<K, V>> iterator = iterator();
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
  
  public Object[] toArray() {
    int i = size();
    Object[] arrayOfObject = new Object[i];
    Iterator<Map.Entry<K, V>> iterator = iterator();
    byte b = 0;
    String str = Ztdo.ZX();
    while (b < i) {
      arrayOfObject[b] = new AbstractMap.SimpleEntry<>(iterator.next());
      b++;
      if (str != null)
        break; 
    } 
    return arrayOfObject;
  }
  
  public <T> T[] toArray(T[] paramArrayOfT) {
    int i = size();
    String str = Ztdo.ZX();
    if (paramArrayOfT.length < i)
      paramArrayOfT = (T[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i); 
    Iterator<Map.Entry<K, V>> iterator = iterator();
    byte b = 0;
    while (b < i) {
      paramArrayOfT[b] = (T)new AbstractMap.SimpleEntry<>(iterator.next());
      b++;
      if (str != null)
        break; 
    } 
    if (paramArrayOfT.length > i)
      paramArrayOfT[i] = null; 
    return paramArrayOfT;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzpb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */