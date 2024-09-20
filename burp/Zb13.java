package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class Zb13<K, V> implements ConcurrentMap<K, V> {
  private volatile Map<K, V> ZW = Collections.emptyMap();
  
  public synchronized V putIfAbsent(K paramK, V paramV) {
    Map<K, V> map = this.ZW;
    V v = map.get(paramK);
    if (v != null)
      return v; 
    ZN(paramK, paramV);
    return null;
  }
  
  public synchronized boolean remove(Object paramObject1, Object paramObject2) {
    Map<K, V> map = this.ZW;
    V v = map.get(paramObject1);
    if (v.equals(paramObject2)) {
      Zu(paramObject1);
      return true;
    } 
    return false;
  }
  
  public synchronized boolean replace(K paramK, V paramV1, V paramV2) {
    Map<K, V> map = this.ZW;
    V v = map.get(paramK);
    if (v.equals(paramV1)) {
      ZN(paramK, paramV2);
      return true;
    } 
    return false;
  }
  
  public synchronized V replace(K paramK, V paramV) {
    Map<K, V> map = this.ZW;
    V v = map.get(paramK);
    if (v != null) {
      ZN(paramK, paramV);
      return v;
    } 
    return null;
  }
  
  public int size() {
    return this.ZW.size();
  }
  
  public boolean isEmpty() {
    return this.ZW.isEmpty();
  }
  
  public boolean containsKey(Object paramObject) {
    return this.ZW.containsKey(paramObject);
  }
  
  public boolean containsValue(Object paramObject) {
    return this.ZW.containsValue(paramObject);
  }
  
  public V get(Object paramObject) {
    return this.ZW.get(paramObject);
  }
  
  public synchronized V put(K paramK, V paramV) {
    return ZN(paramK, paramV);
  }
  
  public synchronized V remove(Object paramObject) {
    return Zu(paramObject);
  }
  
  public synchronized void putAll(Map<? extends K, ? extends V> paramMap) {
    HashMap<K, V> hashMap = new HashMap<>(this.ZW);
    Iterator<Map.Entry> iterator = paramMap.entrySet().iterator();
    Zbqc[] arrayOfZbqc = Zb99.ZR();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      hashMap.put((K)entry.getKey(), (V)entry.getValue());
      if (arrayOfZbqc != null)
        break; 
    } 
    this.ZW = hashMap;
    if (Zbqc.Zwu() == null)
      Zb99.Zf(new Zbqc[2]); 
  }
  
  public synchronized void clear() {
    this.ZW = Collections.emptyMap();
  }
  
  public Set<K> keySet() {
    return this.ZW.keySet();
  }
  
  public Collection<V> values() {
    return this.ZW.values();
  }
  
  public Set<Map.Entry<K, V>> entrySet() {
    return this.ZW.entrySet();
  }
  
  private V ZN(K paramK, V paramV) {
    HashMap<K, V> hashMap = new HashMap<>(this.ZW);
    V v = hashMap.put(paramK, paramV);
    this.ZW = hashMap;
    return v;
  }
  
  private V Zu(Object paramObject) {
    HashMap<K, V> hashMap = new HashMap<>(this.ZW);
    V v = hashMap.remove(paramObject);
    this.ZW = hashMap;
    return v;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb13.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */