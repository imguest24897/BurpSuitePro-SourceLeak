package com.fasterxml.Zy;

import java.util.AbstractSet;
import java.util.Iterator;

final class Zh extends AbstractSet<K> {
  final Zr<K, V> Zb = this.Zk;
  
  final Zr Zk;
  
  Zh(Zr paramZr) {}
  
  public int size() {
    return this.Zb.size();
  }
  
  public void clear() {
    this.Zb.clear();
  }
  
  public Iterator<K> iterator() {
    return new Zk(this.Zk);
  }
  
  public boolean contains(Object paramObject) {
    return this.Zk.containsKey(paramObject);
  }
  
  public boolean remove(Object paramObject) {
    return (this.Zb.remove(paramObject) != null);
  }
  
  public Object[] toArray() {
    return this.Zb.Zi.keySet().toArray();
  }
  
  public <T> T[] toArray(T[] paramArrayOfT) {
    return (T[])this.Zb.Zi.keySet().toArray((Object[])paramArrayOfT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */