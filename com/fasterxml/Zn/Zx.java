package com.fasterxml.Zn;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zk.Zs;
import com.fasterxml.Zm.Z_;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zoz.Zia;
import com.fasterxml.Zoz.Zp;
import com.fasterxml.Zz_;

public class Zx extends Zs {
  private static final long serialVersionUID = 1L;
  
  protected final String Zv;
  
  private static final String c;
  
  protected Zx(String paramString, Zp paramZp, Z_ paramZ_, Zk paramZk) {
    this(paramString, paramZp, paramZ_, paramZk, paramZp.Z_());
  }
  
  protected Zx(String paramString, Zp paramZp, Z_ paramZ_, Zk paramZk, Zz_ paramZz_) {
    super(paramZp, paramZ_, paramZk, null, null, null, paramZz_, null);
    this.Zv = paramString;
  }
  
  public static Zx ZP(String paramString, Zp paramZp, Z_ paramZ_, Zk paramZk) {
    return new Zx(paramString, paramZp, paramZ_, paramZk);
  }
  
  public Zs ZS(Zf<?> paramZf, Zia paramZia, Zp paramZp, Zk paramZk) {
    throw new IllegalStateException(c);
  }
  
  protected Object ZP(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    return paramZyi.Zj(this.Zv);
  }
  
  static {
    // Byte code:
    //   0: bipush #74
    //   2: ldc 'C$7oUR+D?baTR&J'.fUR*Ek6kXe_22f'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zn/Zx.c : Ljava/lang/String;
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
    //   80: bipush #15
    //   82: goto -> 111
    //   85: bipush #97
    //   87: goto -> 111
    //   90: iconst_1
    //   91: goto -> 111
    //   94: bipush #8
    //   96: goto -> 111
    //   99: bipush #73
    //   101: goto -> 111
    //   104: bipush #123
    //   106: goto -> 111
    //   109: bipush #56
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
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */