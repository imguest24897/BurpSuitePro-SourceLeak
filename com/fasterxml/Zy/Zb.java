package com.fasterxml.Zy;

final class Zb implements Runnable {
  final Zc<K, V> ZY;
  
  final int ZZ;
  
  final Zr Zo;
  
  Zb(Zr paramZr, Zc<K, V> paramZc, int paramInt) {
    this.ZZ = paramInt;
    this.ZY = paramZc;
  }
  
  public void run() {
    this.Zo.Zf.lazySet(this.Zo.Zf.get() + this.ZZ);
    if (this.ZY.get().ZX()) {
      this.Zo.Zl.ZT(this.ZY);
      this.Zo.ZT();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */