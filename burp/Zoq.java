package burp;

import java.awt.Window;
import java.util.List;
import java.util.Map;

class Zoq {
  private final Zrve Zt;
  
  private final Zrub Zk;
  
  private final Zbh8 Zc;
  
  private static final String a;
  
  Zoq(Window paramWindow, Zs4c paramZs4c, Zrve paramZrve, Zrub paramZrub, Zbqp paramZbqp, Zxts paramZxts, Zr49 paramZr49, Zezx paramZezx, Zt8u paramZt8u, Zbnt paramZbnt, Zr_4 paramZr_4, Zvo_ paramZvo_, Zm9o paramZm9o) {
    this.Zt = paramZrve;
    this.Zk = paramZrub;
    Zn0 zn0 = new Zn0(this);
    Zmf_ zmf_ = paramZrve.ZR();
    String str = String.format(a, new Object[] { Zmln.ZW(paramZrve.Zw()) });
    Zl0s zl0s = new Zl0s(paramWindow, str, paramZs4c, zmf_, zn0);
    Map<String, List<? extends Zsnh>> map = Zs94.Zc(paramZrve.Zw(), paramZs4c.ZD(new String[0]), zmf_, paramZbqp, paramZxts, paramZr49, zl0s, paramZezx, paramZt8u, paramZbnt, paramZr_4, paramZvo_, paramZm9o);
    this.Zc = new Zbh8(zl0s);
    zl0s.ZM(map, this.Zc);
    zl0s.Zn(paramZrve.Zd());
    zl0s.setVisible(true);
  }
  
  static {
    // Byte code:
    //   0: bipush #121
    //   2: ldc '8h7~?n-ZJ+.`7UL'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zoq.a : Ljava/lang/String;
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
    //   80: bipush #39
    //   82: goto -> 112
    //   85: bipush #37
    //   87: goto -> 112
    //   90: bipush #120
    //   92: goto -> 112
    //   95: bipush #58
    //   97: goto -> 112
    //   100: bipush #69
    //   102: goto -> 112
    //   105: bipush #90
    //   107: goto -> 112
    //   110: bipush #8
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zoq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */