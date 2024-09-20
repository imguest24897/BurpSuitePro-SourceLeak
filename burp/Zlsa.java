package burp;

import java.util.HashSet;
import java.util.Set;

public class Zlsa {
  private final Zeqj ZO;
  
  private Zeqj ZT;
  
  private final Set<Zlug> Z_;
  
  private static final String a;
  
  public Zlsa(Zeqj paramZeqj) {
    this.ZO = paramZeqj;
    this.Z_ = new HashSet<>(Zsb8.ZO);
  }
  
  public Zlsa Zs(Zeqj paramZeqj) {
    this.ZT = paramZeqj;
    return this;
  }
  
  public Zmrn ZO() {
    return this::lambda$findsDelta$0;
  }
  
  private boolean Zl(Zzvx paramZzvx, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZK : ()[I
    //   3: astore #4
    //   5: aconst_null
    //   6: astore #5
    //   8: iconst_0
    //   9: istore #6
    //   11: iload #6
    //   13: iload_2
    //   14: if_icmpge -> 416
    //   17: aload_0
    //   18: getfield ZO : Lburp/Zeqj;
    //   21: aload_1
    //   22: iconst_0
    //   23: anewarray java/lang/String
    //   26: invokeinterface Zj : (Lburp/Zzvx;[Ljava/lang/String;)Ljava/lang/Object;
    //   31: astore #7
    //   33: aload_0
    //   34: getfield ZT : Lburp/Zeqj;
    //   37: aload_1
    //   38: iconst_0
    //   39: anewarray java/lang/String
    //   42: invokeinterface Zj : (Lburp/Zzvx;[Ljava/lang/String;)Ljava/lang/Object;
    //   47: astore #8
    //   49: aload #7
    //   51: instanceof burp/Zzbn
    //   54: ifeq -> 393
    //   57: aload #7
    //   59: checkcast burp/Zzbn
    //   62: astore #9
    //   64: aload #8
    //   66: instanceof burp/Zzbn
    //   69: ifeq -> 393
    //   72: aload #8
    //   74: checkcast burp/Zzbn
    //   77: astore #10
    //   79: aload #10
    //   81: invokevirtual Zb : ()Lburp/Zb6q;
    //   84: invokeinterface Za : ()Lburp/Zstu;
    //   89: astore #11
    //   91: aload #9
    //   93: invokevirtual Zb : ()Lburp/Zb6q;
    //   96: invokeinterface Za : ()Lburp/Zstu;
    //   101: astore #12
    //   103: aload #5
    //   105: ifnonnull -> 150
    //   108: new burp/Zsb8
    //   111: dup
    //   112: aload #9
    //   114: invokevirtual ZR : ()Lburp/Zefx;
    //   117: invokeinterface ZF : ()Lburp/Zlit;
    //   122: aload #12
    //   124: aload #11
    //   126: aload_1
    //   127: invokevirtual ZU : ()Lburp/Zbnr;
    //   130: invokeinterface Zq : ()Lburp/Zbnt;
    //   135: aload_0
    //   136: getfield Z_ : Ljava/util/Set;
    //   139: aconst_null
    //   140: invokespecial <init> : (Lburp/Zlit;Lburp/Zstu;Lburp/Zstu;Lburp/Zbnt;Ljava/util/Set;Ljava/util/Set;)V
    //   143: astore #5
    //   145: aload #4
    //   147: ifnonnull -> 171
    //   150: aload #5
    //   152: aload #12
    //   154: invokevirtual ZQ : (Lburp/Zstu;)V
    //   157: aload #5
    //   159: aload #11
    //   161: invokevirtual Zr : (Lburp/Zstu;)V
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   170: athrow
    //   171: aload #5
    //   173: invokevirtual Zw : ()Z
    //   176: ifne -> 187
    //   179: iconst_1
    //   180: goto -> 188
    //   183: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   186: athrow
    //   187: iconst_0
    //   188: istore #13
    //   190: aload_1
    //   191: invokevirtual Zw : ()Lburp/Zzeq;
    //   194: aload #12
    //   196: aload #11
    //   198: iload #13
    //   200: ifne -> 211
    //   203: iconst_1
    //   204: goto -> 212
    //   207: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   210: athrow
    //   211: iconst_0
    //   212: invokeinterface Za : (Lburp/Zstu;Lburp/Zstu;Z)V
    //   217: iload #6
    //   219: iload_2
    //   220: iconst_1
    //   221: isub
    //   222: if_icmpne -> 233
    //   225: iconst_1
    //   226: goto -> 234
    //   229: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   232: athrow
    //   233: iconst_0
    //   234: istore #14
    //   236: iload #13
    //   238: ifeq -> 274
    //   241: iload_3
    //   242: ifne -> 274
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   251: athrow
    //   252: aload_1
    //   253: aload #9
    //   255: invokevirtual ZI : (Lburp/Zzbn;)V
    //   258: aload_1
    //   259: aload #10
    //   261: invokevirtual ZI : (Lburp/Zzbn;)V
    //   264: iconst_1
    //   265: istore #15
    //   267: aload_1
    //   268: invokevirtual ZA : ()V
    //   271: iload #15
    //   273: ireturn
    //   274: iload #14
    //   276: ifeq -> 388
    //   279: iload #13
    //   281: ifeq -> 302
    //   284: goto -> 291
    //   287: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   290: athrow
    //   291: iload_3
    //   292: ifne -> 325
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   301: athrow
    //   302: iload #13
    //   304: ifne -> 335
    //   307: goto -> 314
    //   310: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   313: athrow
    //   314: iload_3
    //   315: ifne -> 335
    //   318: goto -> 325
    //   321: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   324: athrow
    //   325: iconst_0
    //   326: istore #15
    //   328: aload_1
    //   329: invokevirtual ZA : ()V
    //   332: iload #15
    //   334: ireturn
    //   335: iload_3
    //   336: ifeq -> 366
    //   339: aload #5
    //   341: invokevirtual Zp : ()Lburp/Zkvd;
    //   344: astore #15
    //   346: aload #9
    //   348: aload #15
    //   350: invokevirtual ZF : ()Ljava/util/List;
    //   353: invokevirtual Zm : (Ljava/util/List;)V
    //   356: aload #10
    //   358: aload #15
    //   360: invokevirtual ZR : ()Ljava/util/List;
    //   363: invokevirtual Zm : (Ljava/util/List;)V
    //   366: aload_1
    //   367: aload #9
    //   369: invokevirtual ZI : (Lburp/Zzbn;)V
    //   372: aload_1
    //   373: aload #10
    //   375: invokevirtual ZI : (Lburp/Zzbn;)V
    //   378: iconst_1
    //   379: istore #15
    //   381: aload_1
    //   382: invokevirtual ZA : ()V
    //   385: iload #15
    //   387: ireturn
    //   388: aload #4
    //   390: ifnonnull -> 408
    //   393: new java/lang/IllegalArgumentException
    //   396: dup
    //   397: getstatic burp/Zlsa.a : Ljava/lang/String;
    //   400: invokespecial <init> : (Ljava/lang/String;)V
    //   403: athrow
    //   404: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   407: athrow
    //   408: iinc #6, 1
    //   411: aload #4
    //   413: ifnonnull -> 11
    //   416: iconst_0
    //   417: istore #6
    //   419: aload_1
    //   420: invokevirtual ZA : ()V
    //   423: iload #6
    //   425: ireturn
    //   426: astore #16
    //   428: aload_1
    //   429: invokevirtual ZA : ()V
    //   432: aload #16
    //   434: athrow
    // Exception table:
    //   from	to	target	type
    //   5	267	426	finally
    //   145	164	167	java/lang/IllegalArgumentException
    //   171	183	183	java/lang/IllegalArgumentException
    //   190	207	207	java/lang/IllegalArgumentException
    //   212	229	229	java/lang/IllegalArgumentException
    //   236	245	248	java/lang/IllegalArgumentException
    //   274	284	287	java/lang/IllegalArgumentException
    //   274	328	426	finally
    //   279	295	298	java/lang/IllegalArgumentException
    //   291	307	310	java/lang/IllegalArgumentException
    //   302	318	321	java/lang/IllegalArgumentException
    //   335	381	426	finally
    //   388	404	404	java/lang/IllegalArgumentException
    //   388	419	426	finally
    //   426	428	426	finally
  }
  
  public static Zlsa Zg(Zeqj paramZeqj) {
    return new Zlsa(paramZeqj);
  }
  
  private boolean lambda$findsNothing$1(Zzvx paramZzvx) {
    return Zl(paramZzvx, 1, false);
  }
  
  private boolean lambda$findsDelta$0(Zzvx paramZzvx) {
    return Zl(paramZzvx, 1, true);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: ldc 'WjXT+gkpr((wmwQ=gpq>\\bX*!klsXY1!bwp:"pi{Sx5amnS+"w'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlsa.a : Ljava/lang/String;
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
    //   80: bipush #18
    //   82: goto -> 112
    //   85: bipush #18
    //   87: goto -> 112
    //   90: bipush #116
    //   92: goto -> 112
    //   95: bipush #49
    //   97: goto -> 112
    //   100: bipush #84
    //   102: goto -> 112
    //   105: bipush #75
    //   107: goto -> 112
    //   110: bipush #8
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlsa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */