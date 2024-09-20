package burp;

import java.util.List;

public class Zhy extends Zhg implements Zso5 {
  @Zzvo(11)
  private final Zlit ZV;
  
  @Zzvo(12)
  private final String ZL;
  
  @Zzvo(13)
  private final String ZK;
  
  @Zzvo(15)
  private final List<Zz_b> ZO;
  
  private final Zmfl Zg;
  
  private static final String b;
  
  Zhy(Zeu9 paramZeu9, Zzwo<Zszw, Zx0c> paramZzwo, Zlit paramZlit, String paramString1, Zmfl paramZmfl, String paramString2, List<Zz_b> paramList) {
    super(paramZeu9, paramZzwo);
    this.ZV = paramZlit;
    this.ZL = paramString1;
    this.Zg = paramZmfl;
    this.ZK = paramString2;
    this.ZO = paramList;
  }
  
  public List<Ze7n> ZFC() {
    return this.ZO.stream().map(Zz_b::ZZg).toList();
  }
  
  public Zmfl ZF1() {
    return this.Zg;
  }
  
  @Zzvo(14)
  private byte Zr1() {
    return this.Zg.ZA();
  }
  
  public String ZFL() {
    return this.ZK;
  }
  
  public String ZFA() {
    return this.ZL;
  }
  
  public Zlit ZFP() {
    return this.ZV;
  }
  
  public String toString() {
    return b + b + String.valueOf(ZF1()) + " ";
  }
  
  static {
    // Byte code:
    //   0: bipush #78
    //   2: ldc 'N0t\\r~)'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zhy.b : Ljava/lang/String;
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
    //   80: bipush #71
    //   82: goto -> 112
    //   85: bipush #13
    //   87: goto -> 112
    //   90: bipush #63
    //   92: goto -> 112
    //   95: bipush #106
    //   97: goto -> 112
    //   100: bipush #11
    //   102: goto -> 112
    //   105: bipush #97
    //   107: goto -> 112
    //   110: bipush #17
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zhy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */