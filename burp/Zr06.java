package burp;

public class Zr06 {
  private final Zl11 ZY;
  
  private final Zskh Zc;
  
  private final Zgb6 ZN;
  
  private static String[] Zy;
  
  private static final String a;
  
  public Zr06(Zl11 paramZl11, Zskh paramZskh, Zgb6 paramZgb6) {
    this.ZY = paramZl11;
    this.Zc = paramZskh;
    String[] arrayOfString = Zt();
    this.ZN = paramZgb6;
    if (Zbqc.Zwu() == null)
      Ze(new String[2]); 
  }
  
  public Zsxd Zt(Zefx paramZefx, Zsh8 paramZsh8, Zmdh paramZmdh, Zlgm paramZlgm, Zl1o paramZl1o) {
    Zs38 zs38 = Zs38.ZG(this.ZN).Zp(paramZlgm).Ze(paramZsh8.ZPj());
    Zsh0 zsh0 = paramZsh8.ZPY();
    String[] arrayOfString = Zt();
    if (zsh0.Zjo()) {
      Ze45 ze45 = zsh0.Zj7() ? Ze45.ONLY_HTTP2 : Ze45.SUPPRESS_HTTP2;
      zs38.ZV(ze45);
    } 
    Zrp zrp = paramZsh8.ZPH();
    if (zrp.ZJG())
      zs38.Zi(zrp.ZJ6()); 
    if (Ze(zrp, this.ZN))
      zs38.Za(true).ZR(a.formatted(new Object[] { paramZefx.ZT().toString(), Thread.currentThread().getName() })); 
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[4]); 
    return this.ZY.ZE(paramZefx, zs38.Zy(), new Zxfz(paramZsh8), new Zlbw(this.Zc, paramZmdh, paramZl1o));
  }
  
  private boolean Ze(Zrp paramZrp, Zgb6 paramZgb6) {
    return paramZrp.ZJG() ? paramZrp.ZJ6() : paramZgb6.Zcq();
  }
  
  public static void Ze(String[] paramArrayOfString) {
    Zy = paramArrayOfString;
  }
  
  public static String[] Zt() {
    return Zy;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zt : ()[Ljava/lang/String;
    //   3: ifnull -> 13
    //   6: iconst_4
    //   7: anewarray java/lang/String
    //   10: invokestatic Ze : ([Ljava/lang/String;)V
    //   13: bipush #14
    //   15: ldc 'Ezv.^'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zr06.a : Ljava/lang/String;
    //   24: goto -> 165
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 139
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 111, 5 -> 116
    //   92: bipush #110
    //   94: goto -> 123
    //   97: bipush #7
    //   99: goto -> 123
    //   102: bipush #66
    //   104: goto -> 123
    //   107: iconst_5
    //   108: goto -> 123
    //   111: bipush #35
    //   113: goto -> 123
    //   116: bipush #75
    //   118: goto -> 123
    //   121: bipush #110
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 48
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 45
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 21
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr06.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */