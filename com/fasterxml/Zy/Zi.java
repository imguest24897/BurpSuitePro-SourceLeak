package com.fasterxml.Zy;

public final class Zi<K, V> {
  int ZE = 16;
  
  int ZU = 16;
  
  long Zn = -1L;
  
  public Zi<K, V> ZX(int paramInt) {
    Zr.ZV((paramInt >= 0));
    this.ZU = paramInt;
    return this;
  }
  
  public Zi<K, V> Zn(long paramLong) {
    Zr.ZV((paramLong >= 0L));
    this.Zn = paramLong;
    return this;
  }
  
  public Zi<K, V> Zl(int paramInt) {
    Zr.ZV((paramInt > 0));
    this.ZE = paramInt;
    return this;
  }
  
  public Zr<K, V> ZM() {
    Zr.Zw((this.Zn >= 0L));
    return new Zr<>(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */