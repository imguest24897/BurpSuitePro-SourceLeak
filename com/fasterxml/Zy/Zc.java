package com.fasterxml.Zy;

import java.util.concurrent.atomic.AtomicReference;

final class Zc<K, V> extends AtomicReference<Z_<V>> implements Zu<Zc<K, V>> {
  final K ZT;
  
  Zc<K, V> ZW;
  
  Zc<K, V> Zt;
  
  Zc(K paramK, Z_<V> paramZ_) {
    super(paramZ_);
    this.ZT = paramK;
  }
  
  public Zc<K, V> Zq() {
    return this.ZW;
  }
  
  public void Zd(Zc<K, V> paramZc) {
    this.ZW = paramZc;
  }
  
  public Zc<K, V> ZR() {
    return this.Zt;
  }
  
  public void ZF(Zc<K, V> paramZc) {
    this.Zt = paramZc;
  }
  
  V ZF() {
    return (get()).Zv;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */