package com.fasterxml.Zc;

import java.io.Serializable;

public final class Zz<F extends Zm> implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected int Z_;
  
  private static final String a;
  
  protected Zz(int paramInt) {
    this.Z_ = paramInt;
  }
  
  public static <F extends Zm> Zz<F> ZU(F[] paramArrayOfF) {
    if (paramArrayOfF.length > 31) {
      String str = paramArrayOfF[0].getClass().getName();
      throw new IllegalArgumentException(String.format(a, new Object[] { str, Integer.valueOf(paramArrayOfF.length) }));
    } 
    int i = 0;
    for (F f : paramArrayOfF) {
      if (f.ZP())
        i |= f.ZV(); 
    } 
    return new Zz<>(i);
  }
  
  public Zz<F> Zj(F paramF) {
    int i = this.Z_ | paramF.ZV();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (i == this.Z_) ? this : new Zz(i);
  }
  
  public boolean ZR(F paramF) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ((paramF.ZV() & this.Z_) != 0);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #45
    //   2: ldc '}|P0E)hMu2Nxp5jWdCf$_~UcD(([|JeY#=[i0_)p_~RfPiLyN5N8Z0f]4'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zc/Zz.a : Ljava/lang/String;
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
    //   80: bipush #19
    //   82: goto -> 112
    //   85: bipush #48
    //   87: goto -> 112
    //   90: bipush #19
    //   92: goto -> 112
    //   95: bipush #61
    //   97: goto -> 112
    //   100: bipush #6
    //   102: goto -> 112
    //   105: bipush #107
    //   107: goto -> 112
    //   110: bipush #67
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zc\Zz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */