package com.fasterxml.Zs;

import com.fasterxml.Zh.Zd;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyp;

public abstract class Zux<T> extends Zuy<T> {
  private static final long serialVersionUID = 1L;
  
  protected final Zd ZB;
  
  protected final T ZP;
  
  protected final T ZY;
  
  protected final boolean Zg;
  
  private static final String e;
  
  protected Zux(Class<T> paramClass, Zd paramZd, T paramT1, T paramT2) {
    super(paramClass);
    this.ZB = paramZd;
    this.ZP = paramT1;
    this.ZY = paramT2;
    this.Zg = paramClass.isPrimitive();
  }
  
  public final T Zj(Zyg paramZyg) throws Zy_ {
    try {
      if (this.Zg)
        try {
          if (paramZyg.Zg(Zyp.FAIL_ON_NULL_FOR_PRIMITIVES))
            paramZyg.ZY(this, e, new Object[] { Zx.ZZ(ZX()) }); 
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return this.ZP;
  }
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    return this.ZY;
  }
  
  public final Zd Zb() {
    return this.ZB;
  }
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
  
  static {
    // Byte code:
    //   0: bipush #45
    //   2: ldc 'CHf"gmH(82lE(\\b83o\\tq3g%ZO 33 m\\n{$.aEr ".oG,g0.g+m35iHa73iFN73u[\\n&'Lv F>Le0N.P{&E(Vl<(9g'Od3` ] ( :+o^F'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zs/Zux.e : Ljava/lang/String;
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
    //   80: bipush #45
    //   82: goto -> 111
    //   85: iconst_4
    //   86: goto -> 111
    //   89: bipush #66
    //   91: goto -> 111
    //   94: bipush #37
    //   96: goto -> 111
    //   99: bipush #76
    //   101: goto -> 111
    //   104: bipush #123
    //   106: goto -> 111
    //   109: bipush #106
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zux.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */