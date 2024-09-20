package com.fasterxml.Zy;

import java.util.Iterator;
import java.util.Map;

final class Zv implements Iterator<Map.Entry<K, V>> {
  final Iterator<Zc<K, V>> Zd = this.Zk.Zi.values().iterator();
  
  Zc<K, V> ZG;
  
  final Zr Zk;
  
  Zv(Zr paramZr) {}
  
  public boolean hasNext() {
    return this.Zd.hasNext();
  }
  
  public Map.Entry<K, V> ZL() {
    this.ZG = this.Zd.next();
    return new Zq(this.Zk, this.ZG);
  }
  
  public void remove() {
    Zr.Zw((this.ZG != null));
    this.Zk.remove(this.ZG.ZT);
    this.ZG = null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */