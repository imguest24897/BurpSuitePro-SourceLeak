package org.bouncycastle.pqc.legacy.crypto.qtesla;

final class IntSlicer {
  private final int[] values;
  
  private int base;
  
  IntSlicer(int[] paramArrayOfint, int paramInt) {
    this.values = paramArrayOfint;
    this.base = paramInt;
  }
  
  final int at(int paramInt) {
    return this.values[this.base + paramInt];
  }
  
  final int at(int paramInt1, int paramInt2) {
    this.values[this.base + paramInt1] = paramInt2;
    return paramInt2;
  }
  
  final int at(int paramInt, long paramLong) {
    this.values[this.base + paramInt] = (int)paramLong;
    return (int)paramLong;
  }
  
  final IntSlicer from(int paramInt) {
    return new IntSlicer(this.values, this.base + paramInt);
  }
  
  final void incBase(int paramInt) {
    this.base += paramInt;
  }
  
  final IntSlicer copy() {
    return new IntSlicer(this.values, this.base);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\qtesla\IntSlicer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */