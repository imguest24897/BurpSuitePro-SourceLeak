package burp;

import java.awt.Window;
import java.util.List;
import java.util.Map;

class Zljn {
  private final Zrub Za;
  
  private final Zxts ZE;
  
  private final Zl0s ZS;
  
  private final Zbhj ZD;
  
  private static final String a;
  
  static void Zf(Window paramWindow, Zs4c paramZs4c, Zkbn paramZkbn, Zrub paramZrub, Zbqp paramZbqp, Zr49 paramZr49, Zxts paramZxts, Zezx paramZezx, Zt8u paramZt8u, Zbnt paramZbnt, Zr_4 paramZr_4, Zvo_ paramZvo_, Zm9o paramZm9o, boolean paramBoolean) {
    Zsnq zsnq = paramZkbn.Zl() ? new Zm34() : Zsnq.ZA;
    Zljn zljn = new Zljn(paramWindow, paramZs4c, paramZkbn, paramZrub, paramZbqp, paramZr49, paramZxts, paramZezx, paramZt8u, paramZbnt, paramZr_4, zsnq, paramZvo_, paramZm9o, paramBoolean);
    zljn.ZG();
  }
  
  static void Zd(Window paramWindow, Zs4c paramZs4c, Zkbn paramZkbn, Zrub paramZrub, Zbqp paramZbqp, Zr49 paramZr49, Zxts paramZxts, Zezx paramZezx, Zt8u paramZt8u, Zbnt paramZbnt, Zr_4 paramZr_4, Zvo_ paramZvo_, Zm9o paramZm9o, boolean paramBoolean1, boolean paramBoolean2) {
    Zsnq zsnq = paramBoolean1 ? new Zm34() : Zsnq.ZA;
    Zljn zljn = new Zljn(paramWindow, paramZs4c, paramZkbn, paramZrub, paramZbqp, paramZr49, paramZxts, paramZezx, paramZt8u, paramZbnt, paramZr_4, zsnq, paramZvo_, paramZm9o, paramBoolean2);
    zljn.ZC();
    zljn.Zk();
  }
  
  private Zljn(Window paramWindow, Zs4c paramZs4c, Zkbn paramZkbn, Zrub paramZrub, Zbqp paramZbqp, Zr49 paramZr49, Zxts paramZxts, Zezx paramZezx, Zt8u paramZt8u, Zbnt paramZbnt, Zr_4 paramZr_4, Zsnq paramZsnq, Zvo_ paramZvo_, Zm9o paramZm9o, boolean paramBoolean) {
    this.Za = paramZrub;
    this.ZE = paramZxts;
    Zx8s zx8s = new Zx8s(this);
    Zmf_ zmf_ = paramZkbn.ZR();
    this.ZS = new Zl0s(paramWindow, a, paramZs4c, zmf_, zx8s);
    Map<String, List<? extends Zsnh>> map = Zs94.ZD(paramZkbn.Zw(), paramZs4c.ZD(new String[0]), zmf_, paramZbqp, paramZxts, paramZr49, this.ZS, paramZezx, paramZt8u, paramZbnt, paramZr_4, paramZsnq, paramZvo_, paramZm9o, paramBoolean);
    this.ZD = new Zbhj(this.ZS);
    this.ZS.ZM(map, this.ZD);
    this.ZS.Zn(paramZkbn.Zd());
  }
  
  void ZG() {
    this.ZS.setVisible(true);
  }
  
  void Zk() {
    this.ZS.Zl();
    this.ZS.setVisible(true);
  }
  
  void ZC() {
    this.ZS.Zk();
  }
  
  static {
    // Byte code:
    //   0: bipush #111
    //   2: ldc ')ki$Ov\\ranj[5`nm[`ntkR'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zljn.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_3
    //   81: goto -> 111
    //   84: bipush #96
    //   86: goto -> 111
    //   89: bipush #111
    //   91: goto -> 111
    //   94: bipush #26
    //   96: goto -> 111
    //   99: bipush #107
    //   101: goto -> 111
    //   104: bipush #83
    //   106: goto -> 111
    //   109: bipush #122
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zljn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */