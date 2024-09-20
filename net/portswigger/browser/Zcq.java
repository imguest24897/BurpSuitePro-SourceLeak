package net.portswigger.browser;

import burp.Zlnb;
import burp.Zt3y;

public class Zcq extends Zt3y {
  public static final Zlnb<Zdo> ZL;
  
  public static final Zlnb<Zdf> ZO;
  
  public static final Zlnb<Void> Zm;
  
  public static final Zlnb<Void> Zj;
  
  public static final Zlnb<Ztw> Zg;
  
  public static final Zlnb<Ztw> ZR;
  
  private static final Zcq Zd;
  
  private static int ZX;
  
  private Zcq() {
    super(new Zlnb[] { ZL, ZO, Zm, Zj, Zg, ZR });
  }
  
  public static Zcq Zj() {
    return Zd;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: bipush #76
    //   8: iconst_0
    //   9: istore #4
    //   11: invokestatic ZC : (I)V
    //   14: ldc 'aU);o-sH8&odAkH)2cncH+#ges\\n=&nabCaU);o-sF:"odAkH)2cnkH)2cn*A)?fe\\b'
    //   16: dup
    //   17: astore_3
    //   18: invokevirtual length : ()I
    //   21: istore #5
    //   23: bipush #21
    //   25: istore_2
    //   26: iconst_m1
    //   27: istore_1
    //   28: bipush #47
    //   30: iinc #1, 1
    //   33: aload_3
    //   34: iload_1
    //   35: dup
    //   36: iload_2
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 135
    //   45: aload_0
    //   46: swap
    //   47: iload #4
    //   49: iinc #4, 1
    //   52: swap
    //   53: aastore
    //   54: iload_1
    //   55: iload_2
    //   56: iadd
    //   57: dup
    //   58: istore_1
    //   59: iload #5
    //   61: if_icmpge -> 73
    //   64: aload_3
    //   65: iload_1
    //   66: invokevirtual charAt : (I)C
    //   69: istore_2
    //   70: goto -> 28
    //   73: ldc '@w\\fZF-{NOG6U`LV}NR@-Sf'
    //   75: dup
    //   76: astore_3
    //   77: invokevirtual length : ()I
    //   80: istore #5
    //   82: bipush #19
    //   84: istore_2
    //   85: iconst_m1
    //   86: istore_1
    //   87: bipush #26
    //   89: iinc #1, 1
    //   92: aload_3
    //   93: iload_1
    //   94: dup
    //   95: iload_2
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 135
    //   104: aload_0
    //   105: swap
    //   106: iload #4
    //   108: iinc #4, 1
    //   111: swap
    //   112: aastore
    //   113: iload_1
    //   114: iload_2
    //   115: iadd
    //   116: dup
    //   117: istore_1
    //   118: iload #5
    //   120: if_icmpge -> 132
    //   123: aload_3
    //   124: iload_1
    //   125: invokevirtual charAt : (I)C
    //   128: istore_2
    //   129: goto -> 87
    //   132: goto -> 292
    //   135: dup_x2
    //   136: pop
    //   137: invokevirtual toCharArray : ()[C
    //   140: dup_x1
    //   141: arraylength
    //   142: dup_x2
    //   143: pop
    //   144: iconst_0
    //   145: istore #6
    //   147: dup2_x1
    //   148: pop2
    //   149: dup_x2
    //   150: iconst_1
    //   151: if_icmpgt -> 252
    //   154: dup2
    //   155: swap
    //   156: iload #6
    //   158: dup2_x1
    //   159: caload
    //   160: swap
    //   161: iload #6
    //   163: bipush #7
    //   165: irem
    //   166: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #40
    //   206: goto -> 236
    //   209: bipush #8
    //   211: goto -> 236
    //   214: bipush #103
    //   216: goto -> 236
    //   219: bipush #121
    //   221: goto -> 236
    //   224: bipush #37
    //   226: goto -> 236
    //   229: bipush #47
    //   231: goto -> 236
    //   234: bipush #67
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 158
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 154
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 45, 0 -> 104
    //   292: aload_0
    //   293: iconst_4
    //   294: aaload
    //   295: ldc net/portswigger/browser/Zdo
    //   297: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   300: putstatic net/portswigger/browser/Zcq.ZL : Lburp/Zlnb;
    //   303: aload_0
    //   304: iconst_3
    //   305: aaload
    //   306: ldc net/portswigger/browser/Zdf
    //   308: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   311: putstatic net/portswigger/browser/Zcq.ZO : Lburp/Zlnb;
    //   314: aload_0
    //   315: iconst_1
    //   316: aaload
    //   317: ldc java/lang/Void
    //   319: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   322: putstatic net/portswigger/browser/Zcq.Zm : Lburp/Zlnb;
    //   325: aload_0
    //   326: iconst_5
    //   327: aaload
    //   328: ldc java/lang/Void
    //   330: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   333: putstatic net/portswigger/browser/Zcq.Zj : Lburp/Zlnb;
    //   336: aload_0
    //   337: iconst_2
    //   338: aaload
    //   339: ldc net/portswigger/browser/Ztw
    //   341: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   344: putstatic net/portswigger/browser/Zcq.Zg : Lburp/Zlnb;
    //   347: aload_0
    //   348: iconst_0
    //   349: aaload
    //   350: ldc net/portswigger/browser/Ztw
    //   352: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   355: putstatic net/portswigger/browser/Zcq.ZR : Lburp/Zlnb;
    //   358: new net/portswigger/browser/Zcq
    //   361: dup
    //   362: invokespecial <init> : ()V
    //   365: putstatic net/portswigger/browser/Zcq.Zd : Lnet/portswigger/browser/Zcq;
    //   368: return
  }
  
  public static void ZC(int paramInt) {
    ZX = paramInt;
  }
  
  public static int Zb() {
    return ZX;
  }
  
  public static int ZU() {
    int i = Zb();
    return (i == 0) ? 61 : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zcq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */