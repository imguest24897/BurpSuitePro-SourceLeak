package burp;

import java.util.Collection;
import java.util.List;

public class Zt10 extends Zt3y {
  public static final Zlnb<Zew> Zn;
  
  public static final Zlnb<Zrnp> Zz;
  
  public static final Zlnb<Zmdd> ZN;
  
  public static final Zlnb<Zs7k> Zf;
  
  public static final Zlnb<Ztws> ZH;
  
  public static final Zlnb<Zez3> ZB;
  
  public static final Zlnb<Zzze> Zo;
  
  public static final Zlnb<Zez3> ZA;
  
  public static final Zlnb<Void> Zw;
  
  private static final Zxr8<Void> Zl;
  
  public static final Zlnb<Void> ZC;
  
  private static final Zxr8<Void> Zj;
  
  public static final Zlnb<Void> ZY;
  
  private static final Zxr8<Void> ZX;
  
  private static final Zt10 Zt;
  
  private Zt10() {
    super((Zlnb<?>[])new Zlnb[] { 
          Zn, Zz, ZN, Zf, ZH, ZB, Zo, ZA, Zw, ZC, 
          ZY });
  }
  
  public static Zt10 ZH() {
    return Zt;
  }
  
  static Zxr8<Zew> Ze(Zmxt paramZmxt, List<Zrdb> paramList, boolean paramBoolean) {
    return new Zxr8<>(Zn, new Zew(paramZmxt, paramList, paramBoolean));
  }
  
  public static Zxr8<Zrnp> ZT(Collection<Zk7x> paramCollection) {
    return new Zxr8<>(Zz, new Zrnp(paramCollection));
  }
  
  public static Zxr8<Zmdd> ZH(Zmxt paramZmxt, List<Zrdb> paramList) {
    return new Zxr8<>(ZN, new Zmdd(paramZmxt, paramList));
  }
  
  public static Zxr8<Zs7k> ZQ(Zmxt paramZmxt, Zrdb paramZrdb) {
    return new Zxr8<>(Zf, new Zs7k(paramZmxt, paramZrdb));
  }
  
  static Zxr8<Ztws> Zr(Zez3 paramZez3) {
    return Zz(paramZez3, (short)0);
  }
  
  static Zxr8<Ztws> Zz(Zez3 paramZez3, short paramShort) {
    return new Zxr8<>(ZH, new Ztws(paramZez3, paramShort));
  }
  
  static Zxr8<Zez3> ZH(Zez3 paramZez3) {
    return new Zxr8<>(ZB, paramZez3);
  }
  
  static Zxr8<Zzze> Zw(Zmxt paramZmxt, short paramShort) {
    return new Zxr8<>(Zo, new Zzze(paramZmxt, paramShort));
  }
  
  static Zxr8<Zez3> ZW(Zez3 paramZez3) {
    return new Zxr8<>(ZA, paramZez3);
  }
  
  static Zxr8<Void> Zw() {
    return Zj;
  }
  
  static Zxr8<Void> Zv() {
    return ZX;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'g\\tB\\bMDgEGU\\fXUo\\fcAP\\rJ\\fVD\Eg\\tB\\bMDgESA\\f\Eg\\tB\\bMDgE@@VWo\\fg\\tB\\bUDkWA\\fcAP\\rJ\\fk\\fV@\\foV\\b\R~@@EJUkW\\rcAP\\rSo]S\\r]cAP\\rJ\\fyB@JDn\\rV'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #16
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #108
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 130
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc 'kAEA}\\tTX\\bNkACvWR]yITW[R\\rQ^]|'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #19
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #126
    //   84: iinc #1, 1
    //   87: aload_3
    //   88: iload_1
    //   89: dup
    //   90: iload_2
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 130
    //   99: aload_0
    //   100: swap
    //   101: iload #4
    //   103: iinc #4, 1
    //   106: swap
    //   107: aastore
    //   108: iload_1
    //   109: iload_2
    //   110: iadd
    //   111: dup
    //   112: istore_1
    //   113: iload #5
    //   115: if_icmpge -> 127
    //   118: aload_3
    //   119: iload_1
    //   120: invokevirtual charAt : (I)C
    //   123: istore_2
    //   124: goto -> 82
    //   127: goto -> 288
    //   130: dup_x2
    //   131: pop
    //   132: invokevirtual toCharArray : ()[C
    //   135: dup_x1
    //   136: arraylength
    //   137: dup_x2
    //   138: pop
    //   139: iconst_0
    //   140: istore #6
    //   142: dup2_x1
    //   143: pop2
    //   144: dup_x2
    //   145: iconst_1
    //   146: if_icmpgt -> 246
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 228, 0 -> 200, 1 -> 205, 2 -> 209, 3 -> 214, 4 -> 219, 5 -> 223
    //   200: bipush #102
    //   202: goto -> 230
    //   205: iconst_4
    //   206: goto -> 230
    //   209: bipush #94
    //   211: goto -> 230
    //   214: bipush #73
    //   216: goto -> 230
    //   219: iconst_4
    //   220: goto -> 230
    //   223: bipush #85
    //   225: goto -> 230
    //   228: bipush #77
    //   230: ixor
    //   231: ixor
    //   232: i2c
    //   233: castore
    //   234: iinc #6, 1
    //   237: dup
    //   238: ifne -> 246
    //   241: dup2
    //   242: dup_x1
    //   243: goto -> 153
    //   246: dup2_x1
    //   247: pop2
    //   248: dup_x2
    //   249: iload #6
    //   251: if_icmpgt -> 149
    //   254: pop
    //   255: new java/lang/String
    //   258: dup_x1
    //   259: swap
    //   260: invokespecial <init> : ([C)V
    //   263: invokevirtual intern : ()Ljava/lang/String;
    //   266: swap
    //   267: pop
    //   268: swap
    //   269: tableswitch default -> 40, 0 -> 99
    //   288: aload_0
    //   289: iconst_5
    //   290: aaload
    //   291: ldc burp/Zew
    //   293: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   296: putstatic burp/Zt10.Zn : Lburp/Zlnb;
    //   299: aload_0
    //   300: iconst_1
    //   301: aaload
    //   302: ldc burp/Zrnp
    //   304: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   307: putstatic burp/Zt10.Zz : Lburp/Zlnb;
    //   310: aload_0
    //   311: bipush #8
    //   313: aaload
    //   314: ldc burp/Zmdd
    //   316: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   319: putstatic burp/Zt10.ZN : Lburp/Zlnb;
    //   322: aload_0
    //   323: bipush #7
    //   325: aaload
    //   326: ldc burp/Zs7k
    //   328: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   331: putstatic burp/Zt10.Zf : Lburp/Zlnb;
    //   334: aload_0
    //   335: iconst_2
    //   336: aaload
    //   337: ldc burp/Ztws
    //   339: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   342: putstatic burp/Zt10.ZH : Lburp/Zlnb;
    //   345: aload_0
    //   346: iconst_3
    //   347: aaload
    //   348: ldc burp/Zez3
    //   350: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   353: putstatic burp/Zt10.ZB : Lburp/Zlnb;
    //   356: aload_0
    //   357: bipush #10
    //   359: aaload
    //   360: ldc burp/Zzze
    //   362: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   365: putstatic burp/Zt10.Zo : Lburp/Zlnb;
    //   368: aload_0
    //   369: iconst_0
    //   370: aaload
    //   371: ldc burp/Zez3
    //   373: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   376: putstatic burp/Zt10.ZA : Lburp/Zlnb;
    //   379: aload_0
    //   380: iconst_4
    //   381: aaload
    //   382: invokestatic ZW : (Ljava/lang/String;)Lburp/Zlnb;
    //   385: putstatic burp/Zt10.Zw : Lburp/Zlnb;
    //   388: new burp/Zxr8
    //   391: dup
    //   392: getstatic burp/Zt10.Zw : Lburp/Zlnb;
    //   395: invokespecial <init> : (Lburp/Zlnb;)V
    //   398: putstatic burp/Zt10.Zl : Lburp/Zxr8;
    //   401: aload_0
    //   402: bipush #9
    //   404: aaload
    //   405: invokestatic ZW : (Ljava/lang/String;)Lburp/Zlnb;
    //   408: putstatic burp/Zt10.ZC : Lburp/Zlnb;
    //   411: new burp/Zxr8
    //   414: dup
    //   415: getstatic burp/Zt10.ZC : Lburp/Zlnb;
    //   418: invokespecial <init> : (Lburp/Zlnb;)V
    //   421: putstatic burp/Zt10.Zj : Lburp/Zxr8;
    //   424: aload_0
    //   425: bipush #6
    //   427: aaload
    //   428: invokestatic ZW : (Ljava/lang/String;)Lburp/Zlnb;
    //   431: putstatic burp/Zt10.ZY : Lburp/Zlnb;
    //   434: new burp/Zxr8
    //   437: dup
    //   438: getstatic burp/Zt10.ZY : Lburp/Zlnb;
    //   441: invokespecial <init> : (Lburp/Zlnb;)V
    //   444: putstatic burp/Zt10.ZX : Lburp/Zxr8;
    //   447: new burp/Zt10
    //   450: dup
    //   451: invokespecial <init> : ()V
    //   454: putstatic burp/Zt10.Zt : Lburp/Zt10;
    //   457: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt10.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */