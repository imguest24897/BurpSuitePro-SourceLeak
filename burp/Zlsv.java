package burp;

import java.awt.Window;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Zlsv {
  private final Zrub ZJ;
  
  private final Zxts Zl;
  
  private final Zbhj Zs;
  
  private static final String a;
  
  Zlsv(Window paramWindow, Zmln paramZmln, Zs4c paramZs4c, Zkjl paramZkjl, Zrub paramZrub, Zbqp paramZbqp, Zr49 paramZr49, Zxts paramZxts, Zezx paramZezx, Zt8u paramZt8u, Zbnt paramZbnt, Zr_4 paramZr_4, Zvo_ paramZvo_, Zm9o paramZm9o, boolean paramBoolean) {
    this.ZJ = paramZrub;
    Zbqc[] arrayOfZbqc = Zb_8.Zj();
    this.Zl = paramZxts;
    Zzkm zzkm = new Zzkm();
    Zea2 zea2 = new Zea2(this);
    Zl0s zl0s = new Zl0s(paramWindow, a, paramZs4c, zzkm, zea2);
    zl0s.Zn(paramZkjl.Zm(paramZmln));
    Zsnq zsnq = paramBoolean ? new Zglr() : Zsnq.ZA;
    Map<String, List<? extends Zsnh>> map = Zs94.ZD(Set.of(paramZmln), paramZs4c.ZD(new String[0]), zzkm, paramZbqp, paramZxts, paramZr49, zl0s, paramZezx, paramZt8u, paramZbnt, paramZr_4, zsnq, paramZvo_, paramZm9o, true);
    this.Zs = new Zbhj(zl0s);
    zl0s.ZM(map, this.Zs);
    zl0s.setVisible(true);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  static {
    // Byte code:
    //   0: bipush #98
    //   2: ldc 'mt-C<EM\\njcWGL\\nedW*VBjb^'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlsv.a : Ljava/lang/String;
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
    //   80: bipush #65
    //   82: goto -> 112
    //   85: bipush #6
    //   87: goto -> 112
    //   90: bipush #97
    //   92: goto -> 112
    //   95: bipush #111
    //   97: goto -> 112
    //   100: bipush #82
    //   102: goto -> 112
    //   105: bipush #61
    //   107: goto -> 112
    //   110: bipush #70
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlsv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */