package org.yaml;

import java.util.List;

public abstract class Zv<T> extends Zi {
  private Zp Zd;
  
  private static final String a;
  
  public Zv(Zj9 paramZj9, Zt1 paramZt11, Zt1 paramZt12, Zp paramZp) {
    super(paramZj9, paramZt11, paramZt12);
    Zq(paramZp);
  }
  
  public abstract List<T> Zk();
  
  public void Zq(Zp paramZp) {
    try {
      if (paramZp == null)
        throw new NullPointerException(a); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Zd = paramZp;
  }
  
  public void Zd(Zt1 paramZt1) {
    this.Zs = paramZt1;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: ldc 'a'*dXD^' 3BSk'vXGH=,wSJ'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic org/yaml/Zv.a : Ljava/lang/String;
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
    //   80: bipush #32
    //   82: goto -> 112
    //   85: bipush #76
    //   87: goto -> 112
    //   90: bipush #66
    //   92: goto -> 112
    //   95: bipush #20
    //   97: goto -> 112
    //   100: bipush #127
    //   102: goto -> 112
    //   105: bipush #48
    //   107: goto -> 112
    //   110: bipush #99
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zv.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */