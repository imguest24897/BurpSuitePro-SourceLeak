package burp;

public class Zt1j extends Zt3y {
  public static final Zlnb<Void> ZD;
  
  public static final Zlnb<Void> ZK;
  
  public static final Zlnb<Zrpp> Zk;
  
  public static final Zlnb<Zs_i> Zm;
  
  public static final Zlnb<Zs_i> Zx;
  
  private static final Zt1j ZM;
  
  private static String ZB;
  
  private Zt1j() {
    super((Zlnb<?>[])new Zlnb[] { ZD, ZK, Zk, Zm, Zx });
  }
  
  static Zt1j ZG() {
    return ZM;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'A~`V]A{amVH\\ra[s`VQ\\tQxh_^PzWs\\bWotRQDlV'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: ldc 'lfSNb'
    //   19: bipush #19
    //   21: istore_2
    //   22: invokestatic Zg : (Ljava/lang/String;)V
    //   25: iconst_m1
    //   26: istore_1
    //   27: bipush #114
    //   29: iinc #1, 1
    //   32: aload_3
    //   33: iload_1
    //   34: dup
    //   35: iload_2
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 134
    //   44: aload_0
    //   45: swap
    //   46: iload #4
    //   48: iinc #4, 1
    //   51: swap
    //   52: aastore
    //   53: iload_1
    //   54: iload_2
    //   55: iadd
    //   56: dup
    //   57: istore_1
    //   58: iload #5
    //   60: if_icmpge -> 72
    //   63: aload_3
    //   64: iload_1
    //   65: invokevirtual charAt : (I)C
    //   68: istore_2
    //   69: goto -> 27
    //   72: ldc 'Jd{DFX]b|JA]g}qJTqGxhCBEpJ'
    //   74: dup
    //   75: astore_3
    //   76: invokevirtual length : ()I
    //   79: istore #5
    //   81: bipush #6
    //   83: istore_2
    //   84: iconst_m1
    //   85: istore_1
    //   86: bipush #110
    //   88: iinc #1, 1
    //   91: aload_3
    //   92: iload_1
    //   93: dup
    //   94: iload_2
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 134
    //   103: aload_0
    //   104: swap
    //   105: iload #4
    //   107: iinc #4, 1
    //   110: swap
    //   111: aastore
    //   112: iload_1
    //   113: iload_2
    //   114: iadd
    //   115: dup
    //   116: istore_1
    //   117: iload #5
    //   119: if_icmpge -> 131
    //   122: aload_3
    //   123: iload_1
    //   124: invokevirtual charAt : (I)C
    //   127: istore_2
    //   128: goto -> 86
    //   131: goto -> 292
    //   134: dup_x2
    //   135: pop
    //   136: invokevirtual toCharArray : ()[C
    //   139: dup_x1
    //   140: arraylength
    //   141: dup_x2
    //   142: pop
    //   143: iconst_0
    //   144: istore #6
    //   146: dup2_x1
    //   147: pop2
    //   148: dup_x2
    //   149: iconst_1
    //   150: if_icmpgt -> 252
    //   153: dup2
    //   154: swap
    //   155: iload #6
    //   157: dup2_x1
    //   158: caload
    //   159: swap
    //   160: iload #6
    //   162: bipush #7
    //   164: irem
    //   165: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #64
    //   206: goto -> 236
    //   209: bipush #101
    //   211: goto -> 236
    //   214: bipush #118
    //   216: goto -> 236
    //   219: bipush #65
    //   221: goto -> 236
    //   224: bipush #77
    //   226: goto -> 236
    //   229: bipush #82
    //   231: goto -> 236
    //   234: bipush #123
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 157
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 153
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 44, 0 -> 103
    //   292: aload_0
    //   293: iconst_2
    //   294: aaload
    //   295: invokestatic ZW : (Ljava/lang/String;)Lburp/Zlnb;
    //   298: putstatic burp/Zt1j.ZD : Lburp/Zlnb;
    //   301: aload_0
    //   302: iconst_1
    //   303: aaload
    //   304: invokestatic ZW : (Ljava/lang/String;)Lburp/Zlnb;
    //   307: putstatic burp/Zt1j.ZK : Lburp/Zlnb;
    //   310: aload_0
    //   311: iconst_3
    //   312: aaload
    //   313: ldc burp/Zrpp
    //   315: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   318: putstatic burp/Zt1j.Zk : Lburp/Zlnb;
    //   321: aload_0
    //   322: iconst_4
    //   323: aaload
    //   324: ldc burp/Zs_i
    //   326: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   329: putstatic burp/Zt1j.Zm : Lburp/Zlnb;
    //   332: aload_0
    //   333: iconst_0
    //   334: aaload
    //   335: ldc burp/Zs_i
    //   337: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   340: putstatic burp/Zt1j.Zx : Lburp/Zlnb;
    //   343: new burp/Zt1j
    //   346: dup
    //   347: invokespecial <init> : ()V
    //   350: putstatic burp/Zt1j.ZM : Lburp/Zt1j;
    //   353: return
  }
  
  public static void Zg(String paramString) {
    ZB = paramString;
  }
  
  public static String ZP() {
    return ZB;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt1j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */