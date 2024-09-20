package com.fasterxml.Zy;

import java.util.Iterator;

final class Zk implements Iterator<K> {
  final Iterator<K> ZZ = this.Z_.Zi.keySet().iterator();
  
  K ZS;
  
  final Zr Z_;
  
  Zk(Zr paramZr) {}
  
  public boolean hasNext() {
    return this.ZZ.hasNext();
  }
  
  public K next() {
    this.ZS = this.ZZ.next();
    return this.ZS;
  }
  
  public void remove() {
    Zr.Zw((this.ZS != null));
    this.Z_.remove(this.ZS);
    this.ZS = null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */