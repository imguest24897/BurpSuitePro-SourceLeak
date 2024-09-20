package burp;

public class Zxbj extends Zxsr implements Zl2_ {
  private static String Zw;
  
  private static final String a;
  
  public Zxbj(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Ztpr ZB6() {
    Zrp0 zrp0 = this.Za.<Zrp0>ZJ(this, Zkst.ZU);
    return Zl0.ZJ(zrp0);
  }
  
  public String ZBq() {
    String str = ZTA();
    Zeu9 zeu9 = this.Za.<Zeu9>ZJ(this, Zkst.ZQ);
    if (str != null)
      Zbqc.Zr(new Zbqc[4]); 
    return zeu9.ZHk().<String>map(Zski::toString).orElse(a);
  }
  
  public Zeu4<? extends Zl2_> ZF() {
    return Zl2_.ZI;
  }
  
  public static void Zx(String paramString) {
    Zw = paramString;
  }
  
  public static String ZTA() {
    return Zw;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZTA : ()Ljava/lang/String;
    //   3: ifnull -> 11
    //   6: ldc 'P3lTEb'
    //   8: invokestatic Zx : (Ljava/lang/String;)V
    //   11: bipush #10
    //   13: ldc 'K'=! s'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zxbj.a : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #20
    //   94: goto -> 124
    //   97: bipush #67
    //   99: goto -> 124
    //   102: bipush #92
    //   104: goto -> 124
    //   107: bipush #69
    //   109: goto -> 124
    //   112: bipush #69
    //   114: goto -> 124
    //   117: bipush #127
    //   119: goto -> 124
    //   122: bipush #23
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxbj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */