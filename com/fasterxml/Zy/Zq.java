package com.fasterxml.Zy;

import java.util.AbstractMap;

final class Zq extends AbstractMap.SimpleEntry<K, V> {
  static final long serialVersionUID = 1L;
  
  final Zr Zd;
  
  Zq(Zr paramZr, Zc<K, V> paramZc) {
    super(paramZc.ZT, paramZc.ZF());
  }
  
  public V setValue(V paramV) {
    this.Zd.put(getKey(), paramV);
    return super.setValue(paramV);
  }
  
  Object writeReplace() {
    return new AbstractMap.SimpleEntry<>(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */