package META-INF.versions.11.com.fasterxml.Zz;

import burp.Zbqc;
import burp.Zmuc;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;

class Zbb {
  private static final VarHandle readIntBE;
  
  private final int ZX;
  
  private final byte[] x;
  
  private int Zx;
  
  private static final String a;
  
  public Zbb(long paramLong) {
    if (paramLong > 0L)
      try {
        if (paramLong < 2147483647L) {
          int i = (int)(paramLong + 63L >>> 6L) + 1;
          this.ZX = i << 1;
          int j = i << 3;
          this.x = new byte[j];
          this.Zx = this.ZX;
          return;
        } 
        throw new IllegalArgumentException(a + a);
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      }  
    throw new IllegalArgumentException(a + a);
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
    int i = this.ZX - 1;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
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
    return new BigInteger(this.x);
  }
  
  private void Za(int paramInt1, int paramInt2) {
    readIntBE.set(this.x, paramInt1 << 2, paramInt2);
  }
  
  private int Zw(int paramInt) {
    return readIntBE.get(this.x, paramInt << 2);
  }
  
  static {
    // Byte code:
    //   0: bipush #95
    //   2: ldc ' 0u#K'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zz/Zbb.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #41
    //   82: goto -> 111
    //   85: bipush #10
    //   87: goto -> 111
    //   90: iconst_2
    //   91: goto -> 111
    //   94: bipush #27
    //   96: goto -> 111
    //   99: bipush #67
    //   101: goto -> 111
    //   104: bipush #56
    //   106: goto -> 111
    //   109: bipush #15
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: ldc [I
    //   155: getstatic java/nio/ByteOrder.BIG_ENDIAN : Ljava/nio/ByteOrder;
    //   158: invokestatic byteArrayViewVarHandle : (Ljava/lang/Class;Ljava/nio/ByteOrder;)Ljava/lang/invoke/VarHandle;
    //   161: putstatic com/fasterxml/Zz/Zbb.readIntBE : Ljava/lang/invoke/VarHandle;
    //   164: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\11\com\fasterxml\Zz\Zbb.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */