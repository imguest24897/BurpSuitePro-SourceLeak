package com.fasterxml.Zy;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

final class Zg<K, V> implements Serializable {
  final int ZB;
  
  final Map<K, V> ZU;
  
  final long Zm;
  
  static final long serialVersionUID = 1L;
  
  Zg(Zr<K, V> paramZr) {
    this.ZB = paramZr.Za;
    this.ZU = new HashMap<>(paramZr);
    this.Zm = paramZr.Zp.get();
  }
  
  Object readResolve() {
    Zr<K, V> zr = (new Zi<>()).Zn(this.Zm).ZM();
    zr.putAll(this.ZU);
    return zr;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */