package com.fasterxml.Zk;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zn.Z_m;
import com.fasterxml.Zn.Zs;
import com.fasterxml.Zn.Zt;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zzp;
import java.io.IOException;
import java.util.Set;

public class Zr extends Zzp {
  private static final long serialVersionUID = 29L;
  
  private static final String f;
  
  public Zr(Zk paramZk, Zo paramZo, Zt[] paramArrayOfZt1, Zt[] paramArrayOfZt2) {
    super(paramZk, paramZo, paramArrayOfZt1, paramArrayOfZt2);
  }
  
  protected Zr(Zzp paramZzp, Zt paramZt, Object paramObject) {
    super(paramZzp, paramZt, paramObject);
  }
  
  protected Zr(Zzp paramZzp, Set<String> paramSet1, Set<String> paramSet2) {
    super(paramZzp, paramSet1, paramSet2);
  }
  
  protected Zr(Zzp paramZzp, Zt[] paramArrayOfZt1, Zt[] paramArrayOfZt2) {
    super(paramZzp, paramArrayOfZt1, paramArrayOfZt2);
  }
  
  public static Zr ZH(Zk paramZk, Zo paramZo) {
    return new Zr(paramZk, paramZo, ZP, null);
  }
  
  public Zyd<Object> Zq(Zee paramZee) {
    return (Zyd<Object>)new Z_m(this, paramZee);
  }
  
  public Zzp ZW(Zt paramZt) {
    return new Zr(this, paramZt, this.Zu);
  }
  
  public Zzp ZS(Object paramObject) {
    return new Zr(this, this.Zx, paramObject);
  }
  
  protected Zzp Zv(Set<String> paramSet1, Set<String> paramSet2) {
    return new Zr(this, paramSet1, paramSet2);
  }
  
  protected Zzp ZI(Zt[] paramArrayOfZt1, Zt[] paramArrayOfZt2) {
    return new Zr(this, paramArrayOfZt1, paramArrayOfZt2);
  }
  
  public Zyd<?> ZS(Set<String> paramSet) {
    return (Zyd<?>)new Zr(this, paramSet, null);
  }
  
  protected Zzp ZZ() {
    return (Zzp)((this.Zx == null && this.ZS == null && this.Zu == null) ? new Zs(this) : this);
  }
  
  public final void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield Zx : Lcom/fasterxml/Zn/Zt;
    //   9: ifnull -> 30
    //   12: aload_2
    //   13: aload_1
    //   14: invokevirtual Z_ : (Ljava/lang/Object;)V
    //   17: aload_0
    //   18: aload_1
    //   19: aload_2
    //   20: aload_3
    //   21: iconst_1
    //   22: invokevirtual ZC : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Z)V
    //   25: return
    //   26: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   29: athrow
    //   30: aload_2
    //   31: aload_1
    //   32: invokevirtual ZB : (Ljava/lang/Object;)V
    //   35: aload_0
    //   36: getfield Zu : Ljava/lang/Object;
    //   39: ifnull -> 61
    //   42: aload_0
    //   43: aload_1
    //   44: aload_2
    //   45: aload_3
    //   46: invokevirtual Zu : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   49: iload #4
    //   51: ifeq -> 75
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   60: athrow
    //   61: aload_0
    //   62: aload_1
    //   63: aload_2
    //   64: aload_3
    //   65: invokevirtual ZI : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   74: athrow
    //   75: aload_2
    //   76: invokevirtual Zh : ()V
    //   79: return
    // Exception table:
    //   from	to	target	type
    //   5	26	26	java/io/IOException
    //   30	54	57	java/io/IOException
    //   42	68	71	java/io/IOException
  }
  
  public String toString() {
    return f + Zz().getName();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: ldc 'E+]#l;6n/P$E;6'(S?'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zk/Zr.f : Ljava/lang/String;
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
    //   80: bipush #26
    //   82: goto -> 112
    //   85: bipush #83
    //   87: goto -> 112
    //   90: bipush #33
    //   92: goto -> 112
    //   95: bipush #80
    //   97: goto -> 112
    //   100: bipush #34
    //   102: goto -> 112
    //   105: bipush #67
    //   107: goto -> 112
    //   110: bipush #89
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zk\Zr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */