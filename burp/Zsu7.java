package burp;

import java.awt.Window;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Zsu7 {
  private final Zrub Zv;
  
  private final Zxts ZD;
  
  private final Zbhf Z_;
  
  private static final String a;
  
  Zsu7(Window paramWindow, Zmln paramZmln, Zs4c paramZs4c, Zrub paramZrub, Zbqp paramZbqp, Zr49 paramZr49, Zxts paramZxts, Zezx paramZezx, Zt8u paramZt8u, Zbnt paramZbnt, Zr_4 paramZr_4, Zvo_ paramZvo_, Zm9o paramZm9o) {
    this.Zv = paramZrub;
    this.ZD = paramZxts;
    Zzkm zzkm = new Zzkm();
    Zm_h zm_h = new Zm_h(this);
    String str2 = String.format(a, new Object[] { Zmln.Zi(new Zmln[] { paramZmln }) });
    String str1 = Zb5.ZP();
    Zl0s zl0s = new Zl0s(paramWindow, str2, paramZs4c, zzkm, zm_h);
    Map<String, List<? extends Zsnh>> map = Zs94.Zc(Set.of(paramZmln), paramZs4c.ZD(new String[0]), zzkm, paramZbqp, paramZxts, paramZr49, zl0s, paramZezx, paramZt8u, paramZbnt, paramZr_4, paramZvo_, paramZm9o);
    this.Z_ = new Zbhf(zl0s);
    zl0s.ZM(map, this.Z_);
    zl0s.setVisible(true);
    if (str1 != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  static {
    // Byte code:
    //   0: bipush #98
    //   2: ldc ']v!mlp0my9a?kp'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsu7.a : Ljava/lang/String;
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
    //   85: bipush #26
    //   87: goto -> 112
    //   90: bipush #9
    //   92: goto -> 112
    //   95: bipush #52
    //   97: goto -> 112
    //   100: bipush #102
    //   102: goto -> 112
    //   105: bipush #124
    //   107: goto -> 112
    //   110: bipush #46
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsu7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */