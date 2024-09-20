package com.fasterxml.Zz;

import burp.Zbqc;
import burp.Zmuc;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

class Zbb {
  private final int ZX;
  
  private final int[] Zi;
  
  private int Zx;
  
  private static final String a;
  
  public Zbb(long paramLong) {
    if (paramLong > 0L)
      try {
        if (paramLong < 2147483647L) {
          int i = (int)(paramLong + 63L >>> 6L) + 1;
          this.ZX = i << 1;
          this.Zi = new int[this.ZX];
          this.Zx = this.ZX;
          return;
        } 
        throw new IllegalArgumentException(a + paramLong);
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      }  
    throw new IllegalArgumentException(a + paramLong);
  }
  
  public void Zx(int paramInt) {
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    try {
      if (paramInt == 0)
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    long l = paramInt & 0xFFFFFFFFL;
    int i = this.ZX - 1;
    while (l != 0L) {
      long l1 = (Zw(i) & 0xFFFFFFFFL) + l;
      Za(i, (int)l1);
      l = l1 >>> 32L;
      i--;
      if (arrayOfZbqc != null)
        break; 
    } 
    this.Zx = Math.min(this.Zx, i + 1);
  }
  
  public void Zv(int paramInt1, int paramInt2) {
    long l1 = paramInt1 & 0xFFFFFFFFL;
    long l2 = paramInt2;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    int i = this.ZX - 1;
    while (i >= this.Zx) {
      long l = l1 * (Zw(i) & 0xFFFFFFFFL) + l2;
      Za(i, (int)l);
      l2 = l >>> 32L;
      i--;
      if (arrayOfZbqc != null)
        break; 
    } 
    try {
      if (l2 != 0L) {
        Za(i, (int)l2);
        this.Zx = i;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public BigInteger ZM() {
    byte[] arrayOfByte = new byte[this.Zi.length << 2];
    IntBuffer intBuffer = ByteBuffer.wrap(arrayOfByte).asIntBuffer();
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    while (b < this.Zi.length) {
      intBuffer.put(b, this.Zi[b]);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return new BigInteger(arrayOfByte);
  }
  
  private void Za(int paramInt1, int paramInt2) {
    this.Zi[paramInt1] = paramInt2;
  }
  
  private int Zw(int paramInt) {
    return this.Zi[paramInt];
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #110
    //   2: ldc 'qq4\\f}"'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zz/Zbb.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #113
    //   82: goto -> 112
    //   85: bipush #106
    //   87: goto -> 112
    //   90: bipush #30
    //   92: goto -> 112
    //   95: bipush #24
    //   97: goto -> 112
    //   100: bipush #17
    //   102: goto -> 112
    //   105: bipush #22
    //   107: goto -> 112
    //   110: bipush #96
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zbb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */