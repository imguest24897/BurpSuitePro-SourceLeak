package com.fasterxml.Zy;

import java.util.Iterator;

final class Zy implements Iterator<V> {
  final Iterator<Zc<K, V>> Zb = this.Zy.Zi.values().iterator();
  
  Zc<K, V> ZA;
  
  final Zr Zy;
  
  Zy(Zr paramZr) {}
  
  public boolean hasNext() {
    return this.Zb.hasNext();
  }
  
  public V next() {
    this.ZA = this.Zb.next();
    return this.ZA.ZF();
  }
  
  public void remove() {
    Zr.Zw((this.ZA != null));
    this.Zy.remove(this.ZA.ZT);
    this.ZA = null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */