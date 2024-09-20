package com.fasterxml.Zy;

import java.util.AbstractCollection;
import java.util.Iterator;

final class Zm extends AbstractCollection<V> {
  final Zr ZG;
  
  Zm(Zr paramZr) {}
  
  public int size() {
    return this.ZG.size();
  }
  
  public void clear() {
    this.ZG.clear();
  }
  
  public Iterator<V> iterator() {
    return new Zy(this.ZG);
  }
  
  public boolean contains(Object paramObject) {
    return this.ZG.containsValue(paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */