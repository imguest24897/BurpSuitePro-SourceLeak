package burp;

import java.util.function.Supplier;

class Zbhe extends Zbhb {
  private final Zb7y ZO;
  
  private static final String e;
  
  Zbhe(Ztj1 paramZtj1, Zlfb paramZlfb, Supplier<Zbs1> paramSupplier, Zerg paramZerg, Zlba paramZlba, Ztyg paramZtyg, Zgq7 paramZgq7, Zkl6 paramZkl6, Zg09 paramZg09, Zkg9 paramZkg9, Zz_s paramZz_s, Zskh paramZskh, Zg9t paramZg9t, Zz0n paramZz0n, Ztwv paramZtwv, Zgb6 paramZgb6, Zx8n paramZx8n, Zrny paramZrny, Zs0g paramZs0g, Zg0s paramZg0s, Zs2g paramZs2g, Ztdi paramZtdi, Zt3h paramZt3h, Zgd paramZgd, Zxgc paramZxgc, Zgzy paramZgzy, Zgx0 paramZgx0, Zkf3 paramZkf3, Zlli<Zt1o> paramZlli, Zm6x paramZm6x) {
    super(paramZtj1, paramZlfb, paramSupplier, paramZerg, paramZlba, paramZtyg, paramZgq7, paramZkl6, paramZg09, paramZkg9, paramZz_s, paramZskh, paramZg9t, paramZz0n, paramZtwv, paramZgb6, paramZrny, paramZs0g, paramZg0s, paramZs2g, paramZlli, paramZm6x);
    this.ZO = new Zb7y(paramZtdi, new Zse(paramZt3h), paramZgd, false, paramZxgc, paramZgzy, paramZkl6, paramZtwv, paramZgx0, true, paramZkf3);
    ZH(e, this.ZO);
  }
  
  public void Zr() {
    super.Zr();
    this.ZO.ZH();
  }
  
  public void ZC() {
    super.ZC();
    this.ZO.Zw();
  }
  
  static {
    // Byte code:
    //   0: bipush #86
    //   2: ldc '.)['
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbhe.e : Ljava/lang/String;
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
    //   80: bipush #44
    //   82: goto -> 112
    //   85: bipush #30
    //   87: goto -> 112
    //   90: bipush #57
    //   92: goto -> 112
    //   95: bipush #106
    //   97: goto -> 112
    //   100: bipush #53
    //   102: goto -> 112
    //   105: bipush #51
    //   107: goto -> 112
    //   110: bipush #102
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbhe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */