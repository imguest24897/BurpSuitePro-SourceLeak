package com.fasterxml.Zc;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Zo implements Zxc<Zo> {
  private static final int[] ZT;
  
  private static final int[] ZV;
  
  protected final AtomicReferenceArray<byte[]> Zg;
  
  protected final AtomicReferenceArray<char[]> Zv;
  
  private Ze<Zo> Zx;
  
  private static final String a;
  
  public Zo() {
    this(4, 4);
  }
  
  protected Zo(int paramInt1, int paramInt2) {
    this.Zg = (AtomicReferenceArray)new AtomicReferenceArray<>(paramInt1);
    this.Zv = (AtomicReferenceArray)new AtomicReferenceArray<>(paramInt2);
  }
  
  public final byte[] Zz(int paramInt) {
    return ZP(paramInt, 0);
  }
  
  public byte[] ZP(int paramInt1, int paramInt2) {
    int i = Zp(paramInt1);
    if (paramInt2 < i)
      paramInt2 = i; 
    byte[] arrayOfByte = this.Zg.getAndSet(paramInt1, null);
    try {
      if (arrayOfByte == null || arrayOfByte.length < paramInt2)
        arrayOfByte = ZN(paramInt2); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return arrayOfByte;
  }
  
  public void ZC(int paramInt, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = this.Zg.get(paramInt);
    try {
      if (arrayOfByte != null) {
        try {
          if (paramArrayOfbyte.length > arrayOfByte.length) {
            this.Zg.set(paramInt, paramArrayOfbyte);
            return;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zg.set(paramInt, paramArrayOfbyte);
  }
  
  public final char[] ZO(int paramInt) {
    return Zx(paramInt, 0);
  }
  
  public char[] Zx(int paramInt1, int paramInt2) {
    int i = Zj(paramInt1);
    if (paramInt2 < i)
      paramInt2 = i; 
    char[] arrayOfChar = this.Zv.getAndSet(paramInt1, null);
    try {
      if (arrayOfChar == null || arrayOfChar.length < paramInt2)
        arrayOfChar = ZW(paramInt2); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return arrayOfChar;
  }
  
  public void Zx(int paramInt, char[] paramArrayOfchar) {
    char[] arrayOfChar = this.Zv.get(paramInt);
    try {
      if (arrayOfChar != null) {
        try {
          if (paramArrayOfchar.length > arrayOfChar.length) {
            this.Zv.set(paramInt, paramArrayOfchar);
            return;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zv.set(paramInt, paramArrayOfchar);
  }
  
  protected int Zp(int paramInt) {
    return ZT[paramInt];
  }
  
  protected int Zj(int paramInt) {
    return ZV[paramInt];
  }
  
  protected byte[] ZN(int paramInt) {
    return new byte[paramInt];
  }
  
  protected char[] ZW(int paramInt) {
    return new char[paramInt];
  }
  
  public Zo ZL(Ze<Zo> paramZe) {
    try {
      if (this.Zx != null)
        throw new IllegalStateException(a + paramZe); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zx = Objects.<Ze<Zo>>requireNonNull(paramZe);
    return this;
  }
  
  public void Zh() {
    if (this.Zx != null) {
      Ze<Zo> ze = this.Zx;
      this.Zx = null;
      ze.Zy(this);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #87
    //   2: ldc '[T88^]/1}\\rOT+'$Z\\rT_!&9ZR:,2['
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zc/Zo.a : Ljava/lang/String;
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
    //   80: bipush #10
    //   82: goto -> 112
    //   85: bipush #45
    //   87: goto -> 112
    //   90: bipush #54
    //   92: goto -> 112
    //   95: bipush #106
    //   97: goto -> 112
    //   100: bipush #102
    //   102: goto -> 112
    //   105: bipush #29
    //   107: goto -> 112
    //   110: bipush #20
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
    //   154: iconst_4
    //   155: newarray int
    //   157: dup
    //   158: iconst_0
    //   159: sipush #8000
    //   162: iastore
    //   163: dup
    //   164: iconst_1
    //   165: sipush #8000
    //   168: iastore
    //   169: dup
    //   170: iconst_2
    //   171: sipush #2000
    //   174: iastore
    //   175: dup
    //   176: iconst_3
    //   177: sipush #2000
    //   180: iastore
    //   181: putstatic com/fasterxml/Zc/Zo.ZT : [I
    //   184: iconst_4
    //   185: newarray int
    //   187: dup
    //   188: iconst_0
    //   189: sipush #4000
    //   192: iastore
    //   193: dup
    //   194: iconst_1
    //   195: sipush #4000
    //   198: iastore
    //   199: dup
    //   200: iconst_2
    //   201: sipush #200
    //   204: iastore
    //   205: dup
    //   206: iconst_3
    //   207: sipush #200
    //   210: iastore
    //   211: putstatic com/fasterxml/Zc/Zo.ZV : [I
    //   214: return
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zc\Zo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */