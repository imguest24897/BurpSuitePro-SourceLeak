package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;

public class Zs extends Zg {
  private static final long serialVersionUID = 1L;
  
  public static final Zs Za;
  
  private static final String a;
  
  protected Object readResolve() {
    return Za;
  }
  
  public static Zs Zx() {
    return Za;
  }
  
  public Zfr ZF() {
    return Zfr.NULL;
  }
  
  public Zl ZV() {
    return Zl.VALUE_NULL;
  }
  
  @Deprecated
  public String ZR(String paramString) {
    return paramString;
  }
  
  public String Zp() {
    return a;
  }
  
  public final void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    paramZyi.ZT(paramZf);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this || paramObject instanceof Zs);
  }
  
  public int hashCode() {
    return Zfr.NULL.ordinal();
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: ldc 'UlC'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zg/Zs.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #39
    //   82: goto -> 111
    //   85: iconst_5
    //   86: goto -> 111
    //   89: bipush #51
    //   91: goto -> 111
    //   94: bipush #117
    //   96: goto -> 111
    //   99: bipush #84
    //   101: goto -> 111
    //   104: bipush #107
    //   106: goto -> 111
    //   109: bipush #103
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
    //   153: new com/fasterxml/Zg/Zs
    //   156: dup
    //   157: invokespecial <init> : ()V
    //   160: putstatic com/fasterxml/Zg/Zs.Za : Lcom/fasterxml/Zg/Zs;
    //   163: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */