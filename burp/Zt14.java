package burp;

import java.util.Collection;
import java.util.List;

public class Zt14 extends Zt3y {
  public static final Zlnb<Zkaq> Za;
  
  public static final Zlnb<Ze9d> Zj;
  
  public static final Zlnb<Zbxu> Zc;
  
  public static final Zlnb<Void> ZE;
  
  public static final Zlnb<Zb4t> Zy;
  
  public static final Zlnb<Zse_> Zz;
  
  public static final Zlnb<Zedv> ZW;
  
  public static final Zlnb<Zr4g> ZS;
  
  private static final Zt14 Zk;
  
  private Zt14() {
    super((Zlnb<?>[])new Zlnb[] { Za, Zj, Zc, ZE, Zy, Zz, ZW, ZS });
  }
  
  public static Zt14 ZA() {
    return Zk;
  }
  
  public static Zxr8<Zkaq> ZI(Zxya paramZxya1, Zxya paramZxya2, boolean paramBoolean) {
    return new Zxr8<>(Za, new Zkaq(paramZxya1, paramZxya2, paramBoolean));
  }
  
  public static Zxr8<Ze9d> ZJ(Zxya paramZxya, boolean paramBoolean) {
    return new Zxr8<>(Zj, new Ze9d(paramZxya, paramBoolean));
  }
  
  public static Zxr8<Zbxu> Zz(Zxya paramZxya, boolean paramBoolean) {
    return new Zxr8<>(Zc, new Zbxu(paramZxya, paramBoolean));
  }
  
  public static Zxr8<Void> ZN() {
    return new Zxr8<>(ZE);
  }
  
  public static Zxr8<Zb4t> Zh(Zxya paramZxya, List<Zrdb> paramList) {
    return new Zxr8<>(Zy, new Zb4t(paramZxya, paramList));
  }
  
  public static Zxr8<Zse_> ZV(Collection<Zk7x> paramCollection) {
    return new Zxr8<>(Zz, new Zse_(paramCollection));
  }
  
  public static Zxr8<Zedv> Zk(Zxya paramZxya, List<Zrdb> paramList) {
    return new Zxr8<>(ZW, new Zedv(paramZxya, paramList));
  }
  
  public static Zxr8<Zr4g> Zd(Zxya paramZxya, Zrdb paramZrdb) {
    return new Zxr8<>(ZS, new Zr4g(paramZxya, paramZrdb));
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'b L,E;~#[8Trm:S-E;f<[0Fsy\\rb L,EQdn>P/E\\fb L,E;j7[<Df2OtI\\bsf~^=Drf2OtI\\bsf~M<M`n7'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #14
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #30
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
    //   68: ldc '&d\\bhK<bxK7+r"v0\\rL7":m Y&*s'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #17
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #90
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
    //   146: if_icmpgt -> 248
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #21
    //   202: goto -> 232
    //   205: bipush #77
    //   207: goto -> 232
    //   210: bipush #33
    //   212: goto -> 232
    //   215: bipush #71
    //   217: goto -> 232
    //   220: bipush #62
    //   222: goto -> 232
    //   225: bipush #98
    //   227: goto -> 232
    //   230: bipush #8
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 153
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 149
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 99
    //   288: aload_0
    //   289: iconst_4
    //   290: aaload
    //   291: ldc burp/Zkaq
    //   293: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   296: putstatic burp/Zt14.Za : Lburp/Zlnb;
    //   299: aload_0
    //   300: bipush #7
    //   302: aaload
    //   303: ldc burp/Ze9d
    //   305: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   308: putstatic burp/Zt14.Zj : Lburp/Zlnb;
    //   311: aload_0
    //   312: iconst_5
    //   313: aaload
    //   314: ldc burp/Zbxu
    //   316: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   319: putstatic burp/Zt14.Zc : Lburp/Zlnb;
    //   322: aload_0
    //   323: iconst_1
    //   324: aaload
    //   325: invokestatic ZW : (Ljava/lang/String;)Lburp/Zlnb;
    //   328: putstatic burp/Zt14.ZE : Lburp/Zlnb;
    //   331: aload_0
    //   332: iconst_3
    //   333: aaload
    //   334: ldc burp/Zb4t
    //   336: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   339: putstatic burp/Zt14.Zy : Lburp/Zlnb;
    //   342: aload_0
    //   343: iconst_0
    //   344: aaload
    //   345: ldc burp/Zse_
    //   347: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   350: putstatic burp/Zt14.Zz : Lburp/Zlnb;
    //   353: aload_0
    //   354: bipush #6
    //   356: aaload
    //   357: ldc burp/Zedv
    //   359: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   362: putstatic burp/Zt14.ZW : Lburp/Zlnb;
    //   365: aload_0
    //   366: iconst_2
    //   367: aaload
    //   368: ldc burp/Zr4g
    //   370: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   373: putstatic burp/Zt14.ZS : Lburp/Zlnb;
    //   376: new burp/Zt14
    //   379: dup
    //   380: invokespecial <init> : ()V
    //   383: putstatic burp/Zt14.Zk : Lburp/Zt14;
    //   386: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt14.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */