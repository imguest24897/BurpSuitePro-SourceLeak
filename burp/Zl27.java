package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.portswigger.Z_4;
import net.portswigger.Z_5;
import net.portswigger.Z_8;
import net.portswigger.Z_r;
import net.portswigger.Z_w;
import net.portswigger.Z_y;
import net.portswigger.Zb7;
import net.portswigger.Zbj;
import net.portswigger.Zbu;
import net.portswigger.Zbx;
import net.portswigger.Zfh;
import net.portswigger.Zgf;
import net.portswigger.Zot;
import net.portswigger.Zy1;
import net.portswigger.Zy6;
import net.portswigger.Zy_;
import net.portswigger.Zya;
import net.portswigger.Zyd;
import net.portswigger.Zyg;
import net.portswigger.Zyj;
import net.portswigger.Zyl;
import net.portswigger.Zyn;
import net.portswigger.Zyp;
import net.portswigger.Zyq;
import net.portswigger.Zyu;
import net.portswigger.Zyv;
import net.portswigger.Zyy;
import net.portswigger.Zz;

public class Zl27 {
  private static Zbqc[] ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zsvm Z_(Zyq paramZyq) {
    // Byte code:
    //   0: invokestatic emptyList : ()Ljava/util/List;
    //   3: astore_2
    //   4: invokestatic emptyList : ()Ljava/util/List;
    //   7: astore_3
    //   8: aconst_null
    //   9: astore #4
    //   11: aconst_null
    //   12: astore #5
    //   14: invokestatic ZO : ()[Lburp/Zbqc;
    //   17: aload_0
    //   18: invokevirtual ZU : ()Ljava/util/List;
    //   21: invokeinterface iterator : ()Ljava/util/Iterator;
    //   26: astore #6
    //   28: astore_1
    //   29: aload #6
    //   31: invokeinterface hasNext : ()Z
    //   36: ifeq -> 269
    //   39: aload #6
    //   41: invokeinterface next : ()Ljava/lang/Object;
    //   46: checkcast net/portswigger/Zot
    //   49: astore #7
    //   51: aload #7
    //   53: instanceof net/portswigger/Z_r
    //   56: ifeq -> 90
    //   59: aload #7
    //   61: checkcast net/portswigger/Z_r
    //   64: astore #8
    //   66: aload #8
    //   68: invokestatic ZO : (Lnet/portswigger/Z_r;)Ljava/util/Collection;
    //   71: astore_2
    //   72: aload_1
    //   73: ifnonnull -> 265
    //   76: iconst_3
    //   77: anewarray burp/Zbqc
    //   80: invokestatic Zr : ([Lburp/Zbqc;)V
    //   83: goto -> 90
    //   86: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   89: athrow
    //   90: aload #7
    //   92: instanceof net/portswigger/Zyl
    //   95: ifeq -> 115
    //   98: aload #7
    //   100: checkcast net/portswigger/Zyl
    //   103: astore #9
    //   105: aload #9
    //   107: invokestatic Zh : (Lnet/portswigger/Zyl;)Ljava/util/Collection;
    //   110: astore_3
    //   111: aload_1
    //   112: ifnonnull -> 265
    //   115: aload #7
    //   117: instanceof net/portswigger/Z_w
    //   120: ifeq -> 145
    //   123: goto -> 130
    //   126: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   129: athrow
    //   130: aload #7
    //   132: checkcast net/portswigger/Z_w
    //   135: astore #10
    //   137: aload #10
    //   139: astore #4
    //   141: aload_1
    //   142: ifnonnull -> 265
    //   145: aload #7
    //   147: instanceof net/portswigger/Zyp
    //   150: ifeq -> 178
    //   153: goto -> 160
    //   156: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   159: athrow
    //   160: aload #7
    //   162: checkcast net/portswigger/Zyp
    //   165: astore #11
    //   167: aload #11
    //   169: invokestatic Z_ : (Lnet/portswigger/Zyp;)Lburp/Zlz6;
    //   172: astore #5
    //   174: aload_1
    //   175: ifnonnull -> 265
    //   178: aload #7
    //   180: instanceof net/portswigger/Z_q
    //   183: ifne -> 265
    //   186: goto -> 193
    //   189: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   192: athrow
    //   193: aload #7
    //   195: instanceof net/portswigger/Zz
    //   198: ifeq -> 236
    //   201: goto -> 208
    //   204: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   207: athrow
    //   208: aload #7
    //   210: checkcast net/portswigger/Zz
    //   213: astore #12
    //   215: getstatic net/portswigger/Zfh.EOF : Lnet/portswigger/Zfh;
    //   218: aload #12
    //   220: invokevirtual Zb : ()Lnet/portswigger/Zfh;
    //   223: invokevirtual equals : (Ljava/lang/Object;)Z
    //   226: ifeq -> 236
    //   229: goto -> 265
    //   232: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   235: athrow
    //   236: new burp/Zzbq
    //   239: dup
    //   240: sipush #13464
    //   243: sipush #-21707
    //   246: invokestatic a : (II)Ljava/lang/String;
    //   249: iconst_1
    //   250: anewarray java/lang/Object
    //   253: dup
    //   254: iconst_0
    //   255: aload #7
    //   257: aastore
    //   258: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   261: invokespecial <init> : (Ljava/lang/String;)V
    //   264: athrow
    //   265: aload_1
    //   266: ifnonnull -> 29
    //   269: aload #4
    //   271: aload #5
    //   273: aload_2
    //   274: aload_3
    //   275: invokestatic ZD : (Lnet/portswigger/Z_w;Lburp/Zlz6;Ljava/util/Collection;Ljava/util/Collection;)Lburp/Zsvm;
    //   278: areturn
    // Exception table:
    //   from	to	target	type
    //   72	83	86	burp/Zzbq
    //   111	123	126	burp/Zzbq
    //   141	153	156	burp/Zzbq
    //   174	186	189	burp/Zzbq
    //   178	201	204	burp/Zzbq
    //   215	232	232	burp/Zzbq
  }
  
  private static void Zh(Set<String> paramSet, String paramString) {
    try {
      if (paramString == null)
        return; 
    } catch (Zzbq zzbq) {
      throw a(null);
    } 
    try {
      if (Zrsz.ZQ(paramString))
        throw new Ze4i(paramString); 
    } catch (Zzbq zzbq) {
      throw a(null);
    } 
    try {
      if (paramSet.contains(paramString))
        throw new Ze4u(paramString); 
    } catch (Zzbq zzbq) {
      throw a(null);
    } 
  }
  
  private static Zsvm ZD(Z_w paramZ_w, Zlz6 paramZlz6, Collection<Zzbl> paramCollection1, Collection<Zzbl> paramCollection2) {
    // Byte code:
    //   0: new java/util/HashSet
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: invokestatic ZO : ()[Lburp/Zbqc;
    //   12: iconst_2
    //   13: anewarray java/util/Collection
    //   16: dup
    //   17: iconst_0
    //   18: aload_2
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: aload_3
    //   23: aastore
    //   24: invokestatic of : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   27: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   32: invokeinterface flatMap : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   37: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   42: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   47: aload #5
    //   49: <illegal opcode> accept : (Ljava/util/Set;)Ljava/util/function/Consumer;
    //   54: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   59: astore #4
    //   61: new burp/Zzy4
    //   64: dup
    //   65: invokespecial <init> : ()V
    //   68: invokevirtual ZH : ()Lburp/Zzy4;
    //   71: getstatic burp/Zgv3.V1_BETA : Lburp/Zgv3;
    //   74: invokevirtual ZI : (Lburp/Zgv3;)Lburp/Zzy4;
    //   77: aload_1
    //   78: invokevirtual ZAu : ()Ljava/lang/String;
    //   81: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zzy4;
    //   84: aload_1
    //   85: invokevirtual ZAJ : ()Ljava/util/Set;
    //   88: invokevirtual Zo : (Ljava/util/Set;)Lburp/Zzy4;
    //   91: aload_1
    //   92: invokevirtual ZAg : ()Ljava/util/Set;
    //   95: invokevirtual ZP : (Ljava/util/Set;)Lburp/Zzy4;
    //   98: aload_3
    //   99: invokestatic Zf : (Ljava/util/Collection;)Ljava/util/function/Consumer;
    //   102: invokevirtual Zx : (Ljava/util/function/Consumer;)Lburp/Zzy4;
    //   105: aload_2
    //   106: invokestatic Zf : (Ljava/util/Collection;)Ljava/util/function/Consumer;
    //   109: invokevirtual Ze : (Ljava/util/function/Consumer;)Lburp/Zzy4;
    //   112: getstatic burp/Zspi.Z_ : [I
    //   115: aload_0
    //   116: invokevirtual ZM : ()Lnet/portswigger/Zgf;
    //   119: invokevirtual ordinal : ()I
    //   122: iaload
    //   123: tableswitch default -> 152, 1 -> 162, 2 -> 168, 3 -> 174, 4 -> 180
    //   152: new java/lang/MatchException
    //   155: dup
    //   156: aconst_null
    //   157: aconst_null
    //   158: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   161: athrow
    //   162: getstatic burp/Ztst.APH : Lburp/Ztst;
    //   165: goto -> 183
    //   168: getstatic burp/Ztst.APR : Lburp/Ztst;
    //   171: goto -> 183
    //   174: getstatic burp/Zmc8.PPR : Lburp/Zmc8;
    //   177: goto -> 183
    //   180: getstatic burp/Ztst.APIP : Lburp/Ztst;
    //   183: invokevirtual ZV : (Lburp/Zbjr;)Lburp/Zzy4;
    //   186: aload_0
    //   187: invokevirtual ZM : ()Lnet/portswigger/Zgf;
    //   190: aload_0
    //   191: invokevirtual ZX : ()Ljava/util/Set;
    //   194: invokestatic Zn : (Lnet/portswigger/Zgf;Ljava/util/Set;)Ljava/util/Set;
    //   197: invokevirtual Zl : (Ljava/util/Set;)Lburp/Zzy4;
    //   200: astore #6
    //   202: aload_0
    //   203: invokevirtual ZU : ()Ljava/util/List;
    //   206: invokeinterface iterator : ()Ljava/util/Iterator;
    //   211: astore #7
    //   213: aload #7
    //   215: invokeinterface hasNext : ()Z
    //   220: ifeq -> 512
    //   223: aload #7
    //   225: invokeinterface next : ()Ljava/lang/Object;
    //   230: checkcast net/portswigger/Zot
    //   233: astore #8
    //   235: aload #8
    //   237: instanceof net/portswigger/Zy1
    //   240: ifeq -> 268
    //   243: aload #8
    //   245: checkcast net/portswigger/Zy1
    //   248: astore #9
    //   250: aload #6
    //   252: aload #9
    //   254: aload #5
    //   256: invokestatic ZL : (Lnet/portswigger/Zy1;Ljava/util/Set;)Ljava/util/List;
    //   259: invokevirtual ZT : (Ljava/util/List;)Lburp/Zzy4;
    //   262: pop
    //   263: aload #4
    //   265: ifnonnull -> 507
    //   268: aload #8
    //   270: instanceof net/portswigger/Zyz
    //   273: ifeq -> 324
    //   276: goto -> 283
    //   279: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   282: athrow
    //   283: aload #8
    //   285: checkcast net/portswigger/Zyz
    //   288: astore #10
    //   290: aload #10
    //   292: aload_1
    //   293: invokestatic ZQ : (Lnet/portswigger/Z_y;Lburp/Zlz6;)Lburp/Zte8;
    //   296: astore #12
    //   298: aload #6
    //   300: aload #12
    //   302: invokevirtual ZDt : ()Lburp/Zmrn;
    //   305: aload #12
    //   307: invokevirtual ZD2 : ()Ljava/util/List;
    //   310: aload #12
    //   312: invokevirtual ZDo : ()Ljava/util/List;
    //   315: invokevirtual Z_ : (Lburp/Zmrn;Ljava/util/List;Ljava/util/List;)Lburp/Zzy4;
    //   318: pop
    //   319: aload #4
    //   321: ifnonnull -> 507
    //   324: aload #8
    //   326: instanceof net/portswigger/Zya
    //   329: ifeq -> 373
    //   332: goto -> 339
    //   335: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   338: athrow
    //   339: aload #8
    //   341: checkcast net/portswigger/Zya
    //   344: astore #11
    //   346: aload #11
    //   348: aload_1
    //   349: invokestatic ZD : (Lnet/portswigger/Zya;Lburp/Zlz6;)Lburp/Zsvb;
    //   352: astore #12
    //   354: aload #6
    //   356: getstatic burp/Zmrn.ZV : Lburp/Zmrn;
    //   359: aload #12
    //   361: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   364: invokevirtual Zv : (Lburp/Zmrn;Ljava/util/List;)Lburp/Zzy4;
    //   367: pop
    //   368: aload #4
    //   370: ifnonnull -> 507
    //   373: aload #8
    //   375: bipush #14
    //   377: anewarray java/lang/Class
    //   380: dup
    //   381: iconst_0
    //   382: ldc net/portswigger/Zr1
    //   384: aastore
    //   385: dup
    //   386: iconst_1
    //   387: ldc net/portswigger/Zr3
    //   389: aastore
    //   390: dup
    //   391: iconst_2
    //   392: ldc net/portswigger/Zr0
    //   394: aastore
    //   395: dup
    //   396: iconst_3
    //   397: ldc net/portswigger/Zje
    //   399: aastore
    //   400: dup
    //   401: iconst_4
    //   402: ldc net/portswigger/Zjo
    //   404: aastore
    //   405: dup
    //   406: iconst_5
    //   407: ldc net/portswigger/Zry
    //   409: aastore
    //   410: dup
    //   411: bipush #6
    //   413: ldc net/portswigger/Zjd
    //   415: aastore
    //   416: dup
    //   417: bipush #7
    //   419: ldc net/portswigger/Zjt
    //   421: aastore
    //   422: dup
    //   423: bipush #8
    //   425: ldc net/portswigger/Zi
    //   427: aastore
    //   428: dup
    //   429: bipush #9
    //   431: ldc net/portswigger/Zd
    //   433: aastore
    //   434: dup
    //   435: bipush #10
    //   437: ldc net/portswigger/Zrp
    //   439: aastore
    //   440: dup
    //   441: bipush #11
    //   443: ldc net/portswigger/Zjn
    //   445: aastore
    //   446: dup
    //   447: bipush #12
    //   449: ldc net/portswigger/Zx
    //   451: aastore
    //   452: dup
    //   453: bipush #13
    //   455: ldc net/portswigger/Zp
    //   457: aastore
    //   458: invokestatic ZR : (Lnet/portswigger/Zot;[Ljava/lang/Class;)Z
    //   461: ifeq -> 478
    //   464: goto -> 471
    //   467: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   470: athrow
    //   471: goto -> 507
    //   474: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   477: athrow
    //   478: new burp/Zzbq
    //   481: dup
    //   482: sipush #13463
    //   485: sipush #8322
    //   488: invokestatic a : (II)Ljava/lang/String;
    //   491: iconst_1
    //   492: anewarray java/lang/Object
    //   495: dup
    //   496: iconst_0
    //   497: aload #8
    //   499: aastore
    //   500: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   503: invokespecial <init> : (Ljava/lang/String;)V
    //   506: athrow
    //   507: aload #4
    //   509: ifnonnull -> 213
    //   512: aload #6
    //   514: invokevirtual ZA : ()Lburp/Zsvm;
    //   517: areturn
    // Exception table:
    //   from	to	target	type
    //   250	276	279	burp/Zzbq
    //   298	332	335	burp/Zzbq
    //   354	464	467	burp/Zzbq
    //   373	474	474	burp/Zzbq
  }
  
  private static List<Zgd5> Zu(Zy1 paramZy1) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZO : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: invokevirtual ZU : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_3
    //   21: astore_1
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 111
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast net/portswigger/Zot
    //   40: astore #4
    //   42: aload #4
    //   44: instanceof net/portswigger/Zy6
    //   47: ifeq -> 73
    //   50: aload #4
    //   52: checkcast net/portswigger/Zy6
    //   55: astore #5
    //   57: aload_2
    //   58: aload #5
    //   60: invokestatic ZA : (Lnet/portswigger/Zy6;)Lburp/Zgd5;
    //   63: invokeinterface add : (Ljava/lang/Object;)Z
    //   68: pop
    //   69: aload_1
    //   70: ifnonnull -> 107
    //   73: aload #4
    //   75: instanceof net/portswigger/Zyg
    //   78: ifeq -> 107
    //   81: goto -> 88
    //   84: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   87: athrow
    //   88: aload #4
    //   90: checkcast net/portswigger/Zyg
    //   93: astore #6
    //   95: aload_2
    //   96: aload #6
    //   98: invokestatic Zq : (Lnet/portswigger/Zyg;)Ljava/util/List;
    //   101: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   106: pop
    //   107: aload_1
    //   108: ifnonnull -> 22
    //   111: aload_2
    //   112: areturn
    // Exception table:
    //   from	to	target	type
    //   57	81	84	burp/Zzbq
  }
  
  private static List<Zgd5> ZL(Zy1 paramZy1, Set<String> paramSet) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZO : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: invokevirtual ZU : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore #4
    //   22: astore_2
    //   23: aload #4
    //   25: invokeinterface hasNext : ()Z
    //   30: ifeq -> 194
    //   33: aload #4
    //   35: invokeinterface next : ()Ljava/lang/Object;
    //   40: checkcast net/portswigger/Zot
    //   43: astore #5
    //   45: aload #5
    //   47: instanceof net/portswigger/Zy6
    //   50: ifeq -> 104
    //   53: aload #5
    //   55: checkcast net/portswigger/Zy6
    //   58: astore #6
    //   60: aload #6
    //   62: invokestatic ZA : (Lnet/portswigger/Zy6;)Lburp/Zgd5;
    //   65: astore #8
    //   67: aload #8
    //   69: instanceof burp/Zzur
    //   72: ifeq -> 91
    //   75: aload #8
    //   77: checkcast burp/Zzur
    //   80: astore #9
    //   82: aload_1
    //   83: aload #9
    //   85: invokevirtual ZT : ()Ljava/lang/String;
    //   88: invokestatic Zh : (Ljava/util/Set;Ljava/lang/String;)V
    //   91: aload_3
    //   92: aload #8
    //   94: invokeinterface add : (Ljava/lang/Object;)Z
    //   99: pop
    //   100: aload_2
    //   101: ifnonnull -> 190
    //   104: aload #5
    //   106: instanceof net/portswigger/Zyg
    //   109: ifeq -> 190
    //   112: goto -> 119
    //   115: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   118: athrow
    //   119: aload #5
    //   121: checkcast net/portswigger/Zyg
    //   124: astore #7
    //   126: aload #7
    //   128: invokestatic Zq : (Lnet/portswigger/Zyg;)Ljava/util/List;
    //   131: astore #8
    //   133: aload #8
    //   135: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   140: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   145: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   150: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   155: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   160: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   165: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   170: aload_1
    //   171: <illegal opcode> accept : (Ljava/util/Set;)Ljava/util/function/Consumer;
    //   176: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   181: aload_3
    //   182: aload #8
    //   184: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   189: pop
    //   190: aload_2
    //   191: ifnonnull -> 23
    //   194: aload_3
    //   195: areturn
    // Exception table:
    //   from	to	target	type
    //   91	112	115	burp/Zzbq
  }
  
  private static List<Zgd5> Zq(Zyg paramZyg) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZO : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: invokevirtual ZU : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_3
    //   21: astore_1
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 201
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast net/portswigger/Zot
    //   40: astore #4
    //   42: aload #4
    //   44: instanceof net/portswigger/Z_4
    //   47: ifeq -> 92
    //   50: aload #4
    //   52: checkcast net/portswigger/Z_4
    //   55: astore #5
    //   57: aload_2
    //   58: aload #5
    //   60: <illegal opcode> apply : (Lnet/portswigger/Z_4;)Ljava/util/function/Function;
    //   65: invokestatic Zg : (Ljava/util/function/Function;)Lburp/Zzw9;
    //   68: aload_0
    //   69: invokevirtual ZV : ()Ljava/util/Optional;
    //   72: aconst_null
    //   73: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   76: checkcast java/lang/String
    //   79: invokevirtual Ze : (Ljava/lang/String;)Lburp/Zzw9;
    //   82: invokeinterface add : (Ljava/lang/Object;)Z
    //   87: pop
    //   88: aload_1
    //   89: ifnonnull -> 197
    //   92: aload #4
    //   94: instanceof net/portswigger/Zyv
    //   97: ifeq -> 149
    //   100: goto -> 107
    //   103: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   106: athrow
    //   107: aload #4
    //   109: checkcast net/portswigger/Zyv
    //   112: astore #6
    //   114: aload_2
    //   115: aload #6
    //   117: <illegal opcode> apply : (Lnet/portswigger/Zyv;)Ljava/util/function/Function;
    //   122: invokestatic Zf : (Ljava/util/function/Function;)Lburp/Zzw9;
    //   125: aload_0
    //   126: invokevirtual ZV : ()Ljava/util/Optional;
    //   129: aconst_null
    //   130: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   133: checkcast java/lang/String
    //   136: invokevirtual Ze : (Ljava/lang/String;)Lburp/Zzw9;
    //   139: invokeinterface add : (Ljava/lang/Object;)Z
    //   144: pop
    //   145: aload_1
    //   146: ifnonnull -> 197
    //   149: aload #4
    //   151: instanceof net/portswigger/Zz
    //   154: ifne -> 197
    //   157: goto -> 164
    //   160: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   163: athrow
    //   164: new burp/Zzbq
    //   167: dup
    //   168: sipush #13459
    //   171: sipush #23842
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: iconst_1
    //   178: anewarray java/lang/Object
    //   181: dup
    //   182: iconst_0
    //   183: aload #4
    //   185: aastore
    //   186: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   189: invokespecial <init> : (Ljava/lang/String;)V
    //   192: athrow
    //   193: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   196: athrow
    //   197: aload_1
    //   198: ifnonnull -> 22
    //   201: aload_2
    //   202: areturn
    // Exception table:
    //   from	to	target	type
    //   57	100	103	burp/Zzbq
    //   114	157	160	burp/Zzbq
    //   149	193	193	burp/Zzbq
  }
  
  private static String Zo(Zzvx paramZzvx, Z_y paramZ_y) {
    if (paramZ_y instanceof Zbu) {
      Zbu zbu = (Zbu)paramZ_y;
      return Zlsd.ZZ(zbu).ZT(paramZzvx);
    } 
    if (paramZ_y instanceof Zyd) {
      Zyd zyd = (Zyd)paramZ_y;
      return Zlsd.Za(zyd).ZT(paramZzvx);
    } 
    throw new Zzbq(a(13441, -1778).formatted(new Object[] { paramZ_y }));
  }
  
  private static Zm3v<String> ZK(Z_y paramZ_y) {
    if (paramZ_y instanceof Zbu) {
      Zbu zbu = (Zbu)paramZ_y;
      return Zlsd.ZZ(zbu);
    } 
    if (paramZ_y instanceof Zyd) {
      Zyd zyd = (Zyd)paramZ_y;
      return Zlsd.Za(zyd);
    } 
    throw new Zzbq(a(13454, 10586).formatted(new Object[] { paramZ_y }));
  }
  
  private static Set<Zs66> Zn(Zgf paramZgf, Set<Zb7> paramSet) {
    try {
    
    } catch (Zzbq zzbq) {
      throw a(null);
    } 
    return (paramZgf != Zgf.PER_INSERTION_POINT) ? Collections.<Zs66>emptySet() : (Set<Zs66>)paramSet.stream().flatMap(Zl27::lambda$convertIncludedInsertionPointTypes$6).collect(Collectors.toSet());
  }
  
  private static Zte8 ZQ(Z_y paramZ_y, Zlz6 paramZlz6) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZO : ()[Lburp/Zbqc;
    //   11: new java/util/ArrayList
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #4
    //   20: new java/util/ArrayList
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore #5
    //   29: aload_0
    //   30: invokevirtual ZU : ()Ljava/util/List;
    //   33: invokeinterface iterator : ()Ljava/util/Iterator;
    //   38: astore #6
    //   40: astore_2
    //   41: aload #6
    //   43: invokeinterface hasNext : ()Z
    //   48: ifeq -> 397
    //   51: aload #6
    //   53: invokeinterface next : ()Ljava/lang/Object;
    //   58: checkcast net/portswigger/Zot
    //   61: astore #7
    //   63: aload #7
    //   65: instanceof net/portswigger/Z_5
    //   68: ifne -> 86
    //   71: aload #7
    //   73: instanceof net/portswigger/Z_l
    //   76: ifeq -> 107
    //   79: goto -> 86
    //   82: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   85: athrow
    //   86: aload #5
    //   88: aload #7
    //   90: invokeinterface add : (Ljava/lang/Object;)Z
    //   95: pop
    //   96: aload_2
    //   97: ifnonnull -> 393
    //   100: goto -> 107
    //   103: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   106: athrow
    //   107: aload #7
    //   109: instanceof net/portswigger/Zy1
    //   112: ifeq -> 158
    //   115: goto -> 122
    //   118: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   121: athrow
    //   122: aload #7
    //   124: checkcast net/portswigger/Zy1
    //   127: astore #8
    //   129: aload_3
    //   130: new burp/Zzy4
    //   133: dup
    //   134: invokespecial <init> : ()V
    //   137: aload #8
    //   139: invokestatic Zu : (Lnet/portswigger/Zy1;)Ljava/util/List;
    //   142: invokevirtual ZT : (Ljava/util/List;)Lburp/Zzy4;
    //   145: invokevirtual ZA : ()Lburp/Zsvm;
    //   148: invokeinterface add : (Ljava/lang/Object;)Z
    //   153: pop
    //   154: aload_2
    //   155: ifnonnull -> 393
    //   158: aload #7
    //   160: instanceof net/portswigger/Zyz
    //   163: ifeq -> 227
    //   166: goto -> 173
    //   169: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   172: athrow
    //   173: aload #7
    //   175: checkcast net/portswigger/Zyz
    //   178: astore #9
    //   180: aload #9
    //   182: aload_1
    //   183: invokestatic ZQ : (Lnet/portswigger/Z_y;Lburp/Zlz6;)Lburp/Zte8;
    //   186: astore #12
    //   188: aload_3
    //   189: new burp/Zzy4
    //   192: dup
    //   193: invokespecial <init> : ()V
    //   196: aload #12
    //   198: invokevirtual ZDt : ()Lburp/Zmrn;
    //   201: aload #12
    //   203: invokevirtual ZD2 : ()Ljava/util/List;
    //   206: aload #12
    //   208: invokevirtual ZDo : ()Ljava/util/List;
    //   211: invokevirtual Z_ : (Lburp/Zmrn;Ljava/util/List;Ljava/util/List;)Lburp/Zzy4;
    //   214: invokevirtual ZA : ()Lburp/Zsvm;
    //   217: invokeinterface add : (Ljava/lang/Object;)Z
    //   222: pop
    //   223: aload_2
    //   224: ifnonnull -> 393
    //   227: aload #7
    //   229: instanceof net/portswigger/Z_d
    //   232: ifeq -> 274
    //   235: goto -> 242
    //   238: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   241: athrow
    //   242: aload #7
    //   244: checkcast net/portswigger/Z_d
    //   247: astore #10
    //   249: aload #10
    //   251: aload_1
    //   252: invokestatic ZQ : (Lnet/portswigger/Z_y;Lburp/Zlz6;)Lburp/Zte8;
    //   255: astore #12
    //   257: aload #4
    //   259: aload #12
    //   261: invokevirtual ZD2 : ()Ljava/util/List;
    //   264: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   269: pop
    //   270: aload_2
    //   271: ifnonnull -> 393
    //   274: aload #7
    //   276: instanceof net/portswigger/Zya
    //   279: ifeq -> 313
    //   282: goto -> 289
    //   285: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   288: athrow
    //   289: aload #7
    //   291: checkcast net/portswigger/Zya
    //   294: astore #11
    //   296: aload_3
    //   297: aload #11
    //   299: aload_1
    //   300: invokestatic ZD : (Lnet/portswigger/Zya;Lburp/Zlz6;)Lburp/Zsvb;
    //   303: invokeinterface add : (Ljava/lang/Object;)Z
    //   308: pop
    //   309: aload_2
    //   310: ifnonnull -> 393
    //   313: aload #7
    //   315: iconst_5
    //   316: anewarray java/lang/Class
    //   319: dup
    //   320: iconst_0
    //   321: ldc net/portswigger/Zrg
    //   323: aastore
    //   324: dup
    //   325: iconst_1
    //   326: ldc net/portswigger/Zr_
    //   328: aastore
    //   329: dup
    //   330: iconst_2
    //   331: ldc net/portswigger/Zjd
    //   333: aastore
    //   334: dup
    //   335: iconst_3
    //   336: ldc net/portswigger/Zjt
    //   338: aastore
    //   339: dup
    //   340: iconst_4
    //   341: ldc net/portswigger/Zr1
    //   343: aastore
    //   344: invokestatic ZR : (Lnet/portswigger/Zot;[Ljava/lang/Class;)Z
    //   347: ifeq -> 364
    //   350: goto -> 357
    //   353: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   356: athrow
    //   357: goto -> 393
    //   360: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   363: athrow
    //   364: new burp/Zzbq
    //   367: dup
    //   368: sipush #13461
    //   371: sipush #17326
    //   374: invokestatic a : (II)Ljava/lang/String;
    //   377: iconst_1
    //   378: anewarray java/lang/Object
    //   381: dup
    //   382: iconst_0
    //   383: aload #7
    //   385: aastore
    //   386: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   389: invokespecial <init> : (Ljava/lang/String;)V
    //   392: athrow
    //   393: aload_2
    //   394: ifnonnull -> 41
    //   397: new burp/Zte8
    //   400: dup
    //   401: aload #5
    //   403: invokestatic ZY : (Ljava/util/List;)Lburp/Zmrn;
    //   406: aload_3
    //   407: aload #4
    //   409: invokespecial <init> : (Lburp/Zmrn;Ljava/util/List;Ljava/util/List;)V
    //   412: areturn
    // Exception table:
    //   from	to	target	type
    //   63	79	82	burp/Zzbq
    //   71	100	103	burp/Zzbq
    //   86	115	118	burp/Zzbq
    //   129	166	169	burp/Zzbq
    //   188	235	238	burp/Zzbq
    //   257	282	285	burp/Zzbq
    //   296	350	353	burp/Zzbq
    //   313	360	360	burp/Zzbq
  }
  
  private static Zmrn ZY(List<Zot> paramList) {
    return Ze(ZR(paramList));
  }
  
  private static Deque<Zot> ZR(List<Zot> paramList) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZO : ()[Lburp/Zbqc;
    //   11: iconst_0
    //   12: istore_3
    //   13: astore_1
    //   14: iload_3
    //   15: aload_0
    //   16: invokeinterface size : ()I
    //   21: if_icmpge -> 239
    //   24: aload_0
    //   25: iload_3
    //   26: invokeinterface get : (I)Ljava/lang/Object;
    //   31: checkcast net/portswigger/Zot
    //   34: astore #4
    //   36: aload #4
    //   38: instanceof net/portswigger/Z_5
    //   41: ifeq -> 104
    //   44: aload #4
    //   46: checkcast net/portswigger/Z_5
    //   49: astore #5
    //   51: aload #5
    //   53: ldc net/portswigger/Zju
    //   55: invokevirtual Zg : (Ljava/lang/Class;)Ljava/util/List;
    //   58: invokeinterface size : ()I
    //   63: ifle -> 104
    //   66: new net/portswigger/Z_5
    //   69: dup
    //   70: invokespecial <init> : ()V
    //   73: astore #6
    //   75: aload #5
    //   77: invokevirtual ZU : ()Ljava/util/List;
    //   80: invokestatic ZR : (Ljava/util/List;)Ljava/util/Deque;
    //   83: aload #6
    //   85: dup
    //   86: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   89: pop
    //   90: <illegal opcode> accept : (Lnet/portswigger/Z_5;)Ljava/util/function/Consumer;
    //   95: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   100: aload #6
    //   102: astore #4
    //   104: iload_3
    //   105: iconst_1
    //   106: if_icmple -> 216
    //   109: aload_2
    //   110: invokeinterface peekLast : ()Ljava/lang/Object;
    //   115: astore #6
    //   117: aload #6
    //   119: instanceof net/portswigger/Z_l
    //   122: ifeq -> 216
    //   125: aload #6
    //   127: checkcast net/portswigger/Z_l
    //   130: astore #5
    //   132: getstatic net/portswigger/Zfh.BOOL_AND : Lnet/portswigger/Zfh;
    //   135: aload #5
    //   137: invokevirtual Zl : ()Lnet/portswigger/Zot;
    //   140: invokeinterface Ze : ()Lnet/portswigger/Zfh;
    //   145: invokevirtual equals : (Ljava/lang/Object;)Z
    //   148: ifeq -> 216
    //   151: aload_2
    //   152: invokeinterface removeLast : ()Ljava/lang/Object;
    //   157: checkcast net/portswigger/Zot
    //   160: astore #6
    //   162: aload_2
    //   163: invokeinterface removeLast : ()Ljava/lang/Object;
    //   168: checkcast net/portswigger/Zot
    //   171: astore #7
    //   173: new net/portswigger/Z_5
    //   176: dup
    //   177: invokespecial <init> : ()V
    //   180: astore #8
    //   182: aload #8
    //   184: aload #7
    //   186: invokevirtual Zs : (Lnet/portswigger/Zot;)V
    //   189: aload #8
    //   191: aload #6
    //   193: invokevirtual Zs : (Lnet/portswigger/Zot;)V
    //   196: aload #8
    //   198: aload #4
    //   200: invokevirtual Zs : (Lnet/portswigger/Zot;)V
    //   203: aload_2
    //   204: aload #8
    //   206: invokeinterface add : (Ljava/lang/Object;)Z
    //   211: pop
    //   212: aload_1
    //   213: ifnonnull -> 232
    //   216: aload_2
    //   217: aload #4
    //   219: invokeinterface add : (Ljava/lang/Object;)Z
    //   224: pop
    //   225: goto -> 232
    //   228: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   231: athrow
    //   232: iinc #3, 1
    //   235: aload_1
    //   236: ifnonnull -> 14
    //   239: aload_2
    //   240: areturn
    // Exception table:
    //   from	to	target	type
    //   182	225	228	burp/Zzbq
  }
  
  private static Zmrn Ze(Iterable<Zot> paramIterable) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: invokestatic ZO : ()[Lburp/Zbqc;
    //   5: aload_0
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore_3
    //   12: astore_1
    //   13: aload_3
    //   14: invokeinterface hasNext : ()Z
    //   19: ifeq -> 427
    //   22: aload_3
    //   23: invokeinterface next : ()Ljava/lang/Object;
    //   28: checkcast net/portswigger/Zot
    //   31: astore #4
    //   33: aload #4
    //   35: instanceof net/portswigger/Z_5
    //   38: ifeq -> 122
    //   41: aload #4
    //   43: checkcast net/portswigger/Z_5
    //   46: astore #5
    //   48: aload #5
    //   50: invokestatic Zc : (Lnet/portswigger/Z_5;)Lnet/portswigger/Zot;
    //   53: astore #7
    //   55: aload #7
    //   57: instanceof net/portswigger/Z_8
    //   60: ifeq -> 80
    //   63: aload #7
    //   65: checkcast net/portswigger/Z_8
    //   68: astore #8
    //   70: aload #8
    //   72: invokestatic Zi : (Lnet/portswigger/Z_8;)Lburp/Zmrn;
    //   75: astore_2
    //   76: aload_1
    //   77: ifnonnull -> 118
    //   80: aload #7
    //   82: instanceof net/portswigger/Z_5
    //   85: ifeq -> 112
    //   88: goto -> 95
    //   91: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   94: athrow
    //   95: aload #5
    //   97: invokestatic Zi : (Lnet/portswigger/Zot;)Ljava/util/List;
    //   100: astore #9
    //   102: aload #9
    //   104: invokestatic Ze : (Ljava/lang/Iterable;)Lburp/Zmrn;
    //   107: astore_2
    //   108: aload_1
    //   109: ifnonnull -> 118
    //   112: aload #5
    //   114: invokestatic Zm : (Lnet/portswigger/Z_5;)Lburp/Zmrn;
    //   117: astore_2
    //   118: aload_1
    //   119: ifnonnull -> 423
    //   122: aload #4
    //   124: instanceof net/portswigger/Z_l
    //   127: ifeq -> 423
    //   130: goto -> 137
    //   133: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   136: athrow
    //   137: aload #4
    //   139: checkcast net/portswigger/Z_l
    //   142: astore #6
    //   144: aload_2
    //   145: ifnonnull -> 169
    //   148: new burp/Zzbq
    //   151: dup
    //   152: sipush #13456
    //   155: sipush #8640
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: invokespecial <init> : (Ljava/lang/String;)V
    //   164: athrow
    //   165: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   168: athrow
    //   169: aload_3
    //   170: invokeinterface hasNext : ()Z
    //   175: ifne -> 199
    //   178: new burp/Zzbq
    //   181: dup
    //   182: sipush #13462
    //   185: sipush #31695
    //   188: invokestatic a : (II)Ljava/lang/String;
    //   191: invokespecial <init> : (Ljava/lang/String;)V
    //   194: athrow
    //   195: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   198: athrow
    //   199: aload_3
    //   200: invokeinterface next : ()Ljava/lang/Object;
    //   205: checkcast net/portswigger/Zot
    //   208: astore #7
    //   210: aload #7
    //   212: instanceof net/portswigger/Z_5
    //   215: ifeq -> 302
    //   218: aload #7
    //   220: checkcast net/portswigger/Z_5
    //   223: astore #9
    //   225: aload #9
    //   227: invokestatic Zc : (Lnet/portswigger/Z_5;)Lnet/portswigger/Zot;
    //   230: astore #10
    //   232: aload #10
    //   234: instanceof net/portswigger/Z_8
    //   237: ifeq -> 258
    //   240: aload #10
    //   242: checkcast net/portswigger/Z_8
    //   245: astore #11
    //   247: aload #11
    //   249: invokestatic Zi : (Lnet/portswigger/Z_8;)Lburp/Zmrn;
    //   252: astore #8
    //   254: aload_1
    //   255: ifnonnull -> 298
    //   258: aload #10
    //   260: instanceof net/portswigger/Z_5
    //   263: ifeq -> 291
    //   266: goto -> 273
    //   269: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   272: athrow
    //   273: aload #9
    //   275: invokestatic Zi : (Lnet/portswigger/Zot;)Ljava/util/List;
    //   278: astore #12
    //   280: aload #12
    //   282: invokestatic Ze : (Ljava/lang/Iterable;)Lburp/Zmrn;
    //   285: astore #8
    //   287: aload_1
    //   288: ifnonnull -> 298
    //   291: aload #9
    //   293: invokestatic Zm : (Lnet/portswigger/Z_5;)Lburp/Zmrn;
    //   296: astore #8
    //   298: aload_1
    //   299: ifnonnull -> 323
    //   302: new burp/Zzbq
    //   305: dup
    //   306: sipush #13457
    //   309: sipush #-11399
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: invokespecial <init> : (Ljava/lang/String;)V
    //   318: athrow
    //   319: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   322: athrow
    //   323: aload #6
    //   325: invokevirtual Zl : ()Lnet/portswigger/Zot;
    //   328: invokeinterface Ze : ()Lnet/portswigger/Zfh;
    //   333: astore #10
    //   335: getstatic net/portswigger/Zfh.BOOL_AND : Lnet/portswigger/Zfh;
    //   338: aload #10
    //   340: invokevirtual equals : (Ljava/lang/Object;)Z
    //   343: ifeq -> 359
    //   346: aload_2
    //   347: aload #8
    //   349: invokeinterface Zl : (Lburp/Zmrn;)Lburp/Zmrn;
    //   354: astore_2
    //   355: aload_1
    //   356: ifnonnull -> 423
    //   359: getstatic net/portswigger/Zfh.BOOL_OR : Lnet/portswigger/Zfh;
    //   362: aload #10
    //   364: invokevirtual equals : (Ljava/lang/Object;)Z
    //   367: ifeq -> 390
    //   370: goto -> 377
    //   373: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   376: athrow
    //   377: aload_2
    //   378: aload #8
    //   380: invokeinterface ZZ : (Lburp/Zmrn;)Lburp/Zmrn;
    //   385: astore_2
    //   386: aload_1
    //   387: ifnonnull -> 423
    //   390: new burp/Zzbq
    //   393: dup
    //   394: sipush #13443
    //   397: sipush #11362
    //   400: invokestatic a : (II)Ljava/lang/String;
    //   403: iconst_1
    //   404: anewarray java/lang/Object
    //   407: dup
    //   408: iconst_0
    //   409: aload #10
    //   411: aastore
    //   412: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   415: invokespecial <init> : (Ljava/lang/String;)V
    //   418: athrow
    //   419: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   422: athrow
    //   423: aload_1
    //   424: ifnonnull -> 13
    //   427: aload_2
    //   428: areturn
    // Exception table:
    //   from	to	target	type
    //   76	88	91	burp/Zzbq
    //   118	130	133	burp/Zzbq
    //   144	165	165	burp/Zzbq
    //   169	195	195	burp/Zzbq
    //   254	266	269	burp/Zzbq
    //   298	319	319	burp/Zzbq
    //   355	370	373	burp/Zzbq
    //   386	419	419	burp/Zzbq
  }
  
  private static Zot Zc(Z_5 paramZ_5) {
    Zot zot = paramZ_5.ZO(0);
    if (zot instanceof net.portswigger.Zju)
      zot = paramZ_5.ZO(1); 
    return zot;
  }
  
  private static List<Zot> Zi(Zot paramZot) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZO : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: invokeinterface ZU : ()Ljava/util/List;
    //   17: invokeinterface iterator : ()Ljava/util/Iterator;
    //   22: astore_3
    //   23: astore_1
    //   24: aload_3
    //   25: invokeinterface hasNext : ()Z
    //   30: ifeq -> 171
    //   33: aload_3
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: checkcast net/portswigger/Zot
    //   42: astore #4
    //   44: aload #4
    //   46: instanceof net/portswigger/Z_5
    //   49: ifne -> 67
    //   52: aload #4
    //   54: instanceof net/portswigger/Z_l
    //   57: ifeq -> 87
    //   60: goto -> 67
    //   63: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   66: athrow
    //   67: aload_2
    //   68: aload #4
    //   70: invokeinterface add : (Ljava/lang/Object;)Z
    //   75: pop
    //   76: aload_1
    //   77: ifnonnull -> 167
    //   80: goto -> 87
    //   83: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   86: athrow
    //   87: aload #4
    //   89: iconst_2
    //   90: anewarray java/lang/Class
    //   93: dup
    //   94: iconst_0
    //   95: ldc net/portswigger/Zju
    //   97: aastore
    //   98: dup
    //   99: iconst_1
    //   100: ldc net/portswigger/Zl
    //   102: aastore
    //   103: invokestatic ZR : (Lnet/portswigger/Zot;[Ljava/lang/Class;)Z
    //   106: ifeq -> 123
    //   109: goto -> 116
    //   112: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   115: athrow
    //   116: goto -> 167
    //   119: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   122: athrow
    //   123: aload #4
    //   125: instanceof net/portswigger/Z_8
    //   128: ifeq -> 138
    //   131: goto -> 167
    //   134: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   137: athrow
    //   138: new burp/Zzbq
    //   141: dup
    //   142: sipush #13447
    //   145: sipush #1947
    //   148: invokestatic a : (II)Ljava/lang/String;
    //   151: iconst_1
    //   152: anewarray java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: aload #4
    //   159: aastore
    //   160: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   163: invokespecial <init> : (Ljava/lang/String;)V
    //   166: athrow
    //   167: aload_1
    //   168: ifnonnull -> 24
    //   171: aload_2
    //   172: areturn
    // Exception table:
    //   from	to	target	type
    //   44	60	63	burp/Zzbq
    //   52	80	83	burp/Zzbq
    //   67	109	112	burp/Zzbq
    //   87	119	119	burp/Zzbq
    //   123	134	134	burp/Zzbq
  }
  
  private static Zmrn Zi(Z_8 paramZ_8) {
    Zot zot = paramZ_8.ZI();
    try {
      if (zot.Ze() != Zfh.OPEN_BRACKET)
        throw new Zzbq(a(13440, 8179).formatted(new Object[] { zot })); 
    } catch (Zzbq zzbq) {
      throw a(null);
    } 
    zot = zot.ZI();
    if (zot instanceof Z_5) {
      Z_5 z_5 = (Z_5)zot;
      Zot zot1 = zot.ZI();
      try {
        if (zot1 == null)
          return Zmrn.Zf(Zm(z_5)); 
      } catch (Zzbq zzbq) {
        throw a(null);
      } 
      List<Zot> list = Zi(z_5.Zi());
      return Zmrn.Zf(Ze(list));
    } 
    throw new Zzbq(a(13500, 29056).formatted(new Object[] { zot }));
  }
  
  private static Zsvb ZD(Zya paramZya, Zlz6 paramZlz6) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: invokestatic ZO : ()[Lburp/Zbqc;
    //   5: iconst_0
    //   6: istore #4
    //   8: astore_2
    //   9: aconst_null
    //   10: astore #5
    //   12: aconst_null
    //   13: astore #6
    //   15: aload_0
    //   16: invokevirtual ZU : ()Ljava/util/List;
    //   19: invokeinterface iterator : ()Ljava/util/Iterator;
    //   24: astore #7
    //   26: aload #7
    //   28: invokeinterface hasNext : ()Z
    //   33: ifeq -> 364
    //   36: aload #7
    //   38: invokeinterface next : ()Ljava/lang/Object;
    //   43: checkcast net/portswigger/Zot
    //   46: astore #8
    //   48: aload #8
    //   50: instanceof net/portswigger/Zyh
    //   53: ifeq -> 136
    //   56: aload #8
    //   58: checkcast net/portswigger/Zyh
    //   61: astore #9
    //   63: getstatic burp/Zspi.ZR : [I
    //   66: aload #9
    //   68: invokevirtual Zp : ()Lnet/portswigger/Zqp;
    //   71: invokevirtual ordinal : ()I
    //   74: iaload
    //   75: tableswitch default -> 104, 1 -> 118, 2 -> 122, 3 -> 126, 4 -> 130
    //   104: new java/lang/MatchException
    //   107: dup
    //   108: aconst_null
    //   109: aconst_null
    //   110: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   113: athrow
    //   114: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   117: athrow
    //   118: iconst_1
    //   119: goto -> 131
    //   122: iconst_2
    //   123: goto -> 131
    //   126: iconst_3
    //   127: goto -> 131
    //   130: iconst_4
    //   131: istore_3
    //   132: aload_2
    //   133: ifnonnull -> 360
    //   136: aload #8
    //   138: instanceof net/portswigger/Zyx
    //   141: ifeq -> 225
    //   144: goto -> 151
    //   147: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   150: athrow
    //   151: aload #8
    //   153: checkcast net/portswigger/Zyx
    //   156: astore #10
    //   158: getstatic burp/Zspi.Zk : [I
    //   161: aload #10
    //   163: invokevirtual Zz : ()Lnet/portswigger/Zhd;
    //   166: invokevirtual ordinal : ()I
    //   169: iaload
    //   170: tableswitch default -> 196, 1 -> 210, 2 -> 214, 3 -> 218
    //   196: new java/lang/MatchException
    //   199: dup
    //   200: aconst_null
    //   201: aconst_null
    //   202: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   205: athrow
    //   206: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   209: athrow
    //   210: iconst_1
    //   211: goto -> 219
    //   214: iconst_2
    //   215: goto -> 219
    //   218: iconst_3
    //   219: istore #4
    //   221: aload_2
    //   222: ifnonnull -> 360
    //   225: aload #8
    //   227: instanceof net/portswigger/Zyj
    //   230: ifeq -> 260
    //   233: goto -> 240
    //   236: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   239: athrow
    //   240: aload #8
    //   242: checkcast net/portswigger/Zyj
    //   245: astore #11
    //   247: aload #11
    //   249: <illegal opcode> Zm : (Lnet/portswigger/Zyj;)Lburp/Zm3v;
    //   254: astore #5
    //   256: aload_2
    //   257: ifnonnull -> 360
    //   260: aload #8
    //   262: instanceof net/portswigger/Zyu
    //   265: ifeq -> 295
    //   268: goto -> 275
    //   271: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   274: athrow
    //   275: aload #8
    //   277: checkcast net/portswigger/Zyu
    //   280: astore #12
    //   282: aload #12
    //   284: <illegal opcode> Zm : (Lnet/portswigger/Zyu;)Lburp/Zm3v;
    //   289: astore #6
    //   291: aload_2
    //   292: ifnonnull -> 360
    //   295: aload #8
    //   297: iconst_2
    //   298: anewarray java/lang/Class
    //   301: dup
    //   302: iconst_0
    //   303: ldc net/portswigger/Zj0
    //   305: aastore
    //   306: dup
    //   307: iconst_1
    //   308: ldc net/portswigger/Zm
    //   310: aastore
    //   311: invokestatic ZR : (Lnet/portswigger/Zot;[Ljava/lang/Class;)Z
    //   314: ifeq -> 331
    //   317: goto -> 324
    //   320: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   323: athrow
    //   324: goto -> 360
    //   327: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   330: athrow
    //   331: new burp/Zzbq
    //   334: dup
    //   335: sipush #13448
    //   338: sipush #-22398
    //   341: invokestatic a : (II)Ljava/lang/String;
    //   344: iconst_1
    //   345: anewarray java/lang/Object
    //   348: dup
    //   349: iconst_0
    //   350: aload #8
    //   352: aastore
    //   353: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   356: invokespecial <init> : (Ljava/lang/String;)V
    //   359: athrow
    //   360: aload_2
    //   361: ifnonnull -> 26
    //   364: new burp/Ztz1
    //   367: dup
    //   368: invokespecial <init> : ()V
    //   371: getstatic burp/Zzu2.BCHECK_GENERATED : Lburp/Zzu2;
    //   374: invokevirtual Zc : (Lburp/Zzu2;)Lburp/Zsvb;
    //   377: getstatic burp/Zgv3.V1_BETA : Lburp/Zgv3;
    //   380: invokevirtual ZM : (Lburp/Zgv3;)Lburp/Zsvb;
    //   383: aload_1
    //   384: invokevirtual ZAu : ()Ljava/lang/String;
    //   387: invokevirtual Zb : (Ljava/lang/String;)Lburp/Zsvb;
    //   390: aload #6
    //   392: invokevirtual ZX : (Lburp/Zm3v;)Lburp/Zsvb;
    //   395: aload #5
    //   397: invokevirtual ZE : (Lburp/Zm3v;)Lburp/Zsvb;
    //   400: iload_3
    //   401: invokevirtual ZQ : (B)Lburp/Zsvb;
    //   404: iload #4
    //   406: invokevirtual ZF : (B)Lburp/Zsvb;
    //   409: areturn
    // Exception table:
    //   from	to	target	type
    //   63	114	114	burp/Zzbq
    //   132	144	147	burp/Zzbq
    //   158	206	206	burp/Zzbq
    //   221	233	236	burp/Zzbq
    //   256	268	271	burp/Zzbq
    //   291	317	320	burp/Zzbq
    //   295	327	327	burp/Zzbq
  }
  
  private static Zmrn Zm(Z_5 paramZ_5) {
    // Byte code:
    //   0: invokestatic ZO : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: iconst_0
    //   6: invokevirtual ZO : (I)Lnet/portswigger/Zot;
    //   9: astore_2
    //   10: aload_2
    //   11: instanceof net/portswigger/Z_8
    //   14: ifeq -> 27
    //   17: aload_2
    //   18: checkcast net/portswigger/Z_8
    //   21: astore_3
    //   22: aload_3
    //   23: invokestatic Zi : (Lnet/portswigger/Z_8;)Lburp/Zmrn;
    //   26: areturn
    //   27: aload_2
    //   28: instanceof net/portswigger/Zju
    //   31: ifeq -> 40
    //   34: aload_0
    //   35: iconst_1
    //   36: invokevirtual ZO : (I)Lnet/portswigger/Zot;
    //   39: astore_2
    //   40: aload_2
    //   41: instanceof net/portswigger/Z_t
    //   44: ifeq -> 692
    //   47: aload_2
    //   48: checkcast net/portswigger/Z_t
    //   51: astore_3
    //   52: aload_3
    //   53: invokevirtual Zl : ()Lnet/portswigger/Zot;
    //   56: astore #4
    //   58: aload #4
    //   60: instanceof net/portswigger/Zbm
    //   63: ifeq -> 304
    //   66: aload #4
    //   68: checkcast net/portswigger/Zbm
    //   71: astore #5
    //   73: aload_3
    //   74: iconst_1
    //   75: invokevirtual ZO : (I)Lnet/portswigger/Zot;
    //   78: invokeinterface Ze : ()Lnet/portswigger/Zfh;
    //   83: astore #7
    //   85: aload_3
    //   86: iconst_2
    //   87: invokevirtual ZO : (I)Lnet/portswigger/Zot;
    //   90: astore #8
    //   92: aload #5
    //   94: aload #7
    //   96: invokestatic ZT : (Lnet/portswigger/Zot;Lnet/portswigger/Zfh;)Lburp/Zeqj;
    //   99: astore #9
    //   101: aload #8
    //   103: aload #7
    //   105: invokestatic ZT : (Lnet/portswigger/Zot;Lnet/portswigger/Zfh;)Lburp/Zeqj;
    //   108: astore #10
    //   110: aload #9
    //   112: instanceof burp/Zm0j
    //   115: ifne -> 126
    //   118: iconst_1
    //   119: goto -> 127
    //   122: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   125: athrow
    //   126: iconst_0
    //   127: istore #11
    //   129: getstatic burp/Zspi.ZW : [I
    //   132: aload #7
    //   134: invokevirtual ordinal : ()I
    //   137: iaload
    //   138: tableswitch default -> 274, 1 -> 168, 2 -> 210, 3 -> 245, 4 -> 258
    //   168: iload #11
    //   170: ifeq -> 197
    //   173: goto -> 180
    //   176: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   179: athrow
    //   180: aload #10
    //   182: invokestatic Zs : (Lburp/Zeqj;)Lburp/Zee_;
    //   185: aload #9
    //   187: invokevirtual Zt : (Lburp/Zeqj;)Lburp/Zmrn;
    //   190: goto -> 303
    //   193: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   196: athrow
    //   197: aload #9
    //   199: invokestatic Zs : (Lburp/Zeqj;)Lburp/Zee_;
    //   202: aload #10
    //   204: invokevirtual ZW : (Lburp/Zeqj;)Lburp/Zmrn;
    //   207: goto -> 303
    //   210: iload #11
    //   212: ifeq -> 232
    //   215: aload #10
    //   217: invokestatic Zs : (Lburp/Zeqj;)Lburp/Zee_;
    //   220: aload #9
    //   222: invokevirtual Zl : (Lburp/Zeqj;)Lburp/Zmrn;
    //   225: goto -> 303
    //   228: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   231: athrow
    //   232: aload #9
    //   234: invokestatic Zs : (Lburp/Zeqj;)Lburp/Zee_;
    //   237: aload #10
    //   239: invokevirtual Zl : (Lburp/Zeqj;)Lburp/Zmrn;
    //   242: goto -> 303
    //   245: aload #9
    //   247: invokestatic Zs : (Lburp/Zeqj;)Lburp/Zee_;
    //   250: aload #10
    //   252: invokevirtual Zw : (Lburp/Zeqj;)Lburp/Zmrn;
    //   255: goto -> 303
    //   258: aload #9
    //   260: invokestatic Zg : (Lburp/Zeqj;)Lburp/Zlsa;
    //   263: aload #10
    //   265: invokevirtual Zs : (Lburp/Zeqj;)Lburp/Zlsa;
    //   268: invokevirtual ZO : ()Lburp/Zmrn;
    //   271: goto -> 303
    //   274: new burp/Zzbq
    //   277: dup
    //   278: sipush #13460
    //   281: sipush #8529
    //   284: invokestatic a : (II)Ljava/lang/String;
    //   287: iconst_1
    //   288: anewarray java/lang/Object
    //   291: dup
    //   292: iconst_0
    //   293: aload #7
    //   295: aastore
    //   296: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   299: invokespecial <init> : (Ljava/lang/String;)V
    //   302: athrow
    //   303: areturn
    //   304: aload #4
    //   306: instanceof net/portswigger/Z_k
    //   309: ifeq -> 692
    //   312: aload #4
    //   314: checkcast net/portswigger/Z_k
    //   317: astore #6
    //   319: aload #6
    //   321: invokevirtual toString : ()Ljava/lang/String;
    //   324: astore #7
    //   326: aload #7
    //   328: astore #8
    //   330: iconst_m1
    //   331: istore #9
    //   333: aload #8
    //   335: invokevirtual hashCode : ()I
    //   338: lookupswitch default -> 539, -1741417993 -> 450, -1689451446 -> 388, 617409677 -> 481, 1332671649 -> 512, 1542418729 -> 419
    //   388: aload #8
    //   390: sipush #13471
    //   393: sipush #6391
    //   396: invokestatic a : (II)Ljava/lang/String;
    //   399: invokevirtual equals : (Ljava/lang/Object;)Z
    //   402: ifeq -> 539
    //   405: goto -> 412
    //   408: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   411: athrow
    //   412: iconst_0
    //   413: istore #9
    //   415: aload_1
    //   416: ifnonnull -> 539
    //   419: aload #8
    //   421: sipush #13451
    //   424: sipush #32132
    //   427: invokestatic a : (II)Ljava/lang/String;
    //   430: invokevirtual equals : (Ljava/lang/Object;)Z
    //   433: ifeq -> 539
    //   436: goto -> 443
    //   439: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   442: athrow
    //   443: iconst_1
    //   444: istore #9
    //   446: aload_1
    //   447: ifnonnull -> 539
    //   450: aload #8
    //   452: sipush #13465
    //   455: sipush #-32218
    //   458: invokestatic a : (II)Ljava/lang/String;
    //   461: invokevirtual equals : (Ljava/lang/Object;)Z
    //   464: ifeq -> 539
    //   467: goto -> 474
    //   470: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   473: athrow
    //   474: iconst_2
    //   475: istore #9
    //   477: aload_1
    //   478: ifnonnull -> 539
    //   481: aload #8
    //   483: sipush #13449
    //   486: sipush #-22223
    //   489: invokestatic a : (II)Ljava/lang/String;
    //   492: invokevirtual equals : (Ljava/lang/Object;)Z
    //   495: ifeq -> 539
    //   498: goto -> 505
    //   501: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   504: athrow
    //   505: iconst_3
    //   506: istore #9
    //   508: aload_1
    //   509: ifnonnull -> 539
    //   512: aload #8
    //   514: sipush #13445
    //   517: sipush #17739
    //   520: invokestatic a : (II)Ljava/lang/String;
    //   523: invokevirtual equals : (Ljava/lang/Object;)Z
    //   526: ifeq -> 539
    //   529: goto -> 536
    //   532: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   535: athrow
    //   536: iconst_4
    //   537: istore #9
    //   539: iload #9
    //   541: tableswitch default -> 662, 0 -> 576, 1 -> 599, 2 -> 624, 3 -> 649, 4 -> 649
    //   576: invokestatic ZM : ()Lburp/Zm4n;
    //   579: iconst_1
    //   580: anewarray burp/Zb25
    //   583: dup
    //   584: iconst_0
    //   585: getstatic burp/Zb25.DNS : Lburp/Zb25;
    //   588: aastore
    //   589: invokevirtual ZG : ([Lburp/Zb25;)Lburp/Zmrn;
    //   592: goto -> 691
    //   595: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   598: athrow
    //   599: invokestatic ZM : ()Lburp/Zm4n;
    //   602: iconst_2
    //   603: anewarray burp/Zb25
    //   606: dup
    //   607: iconst_0
    //   608: getstatic burp/Zb25.HTTP : Lburp/Zb25;
    //   611: aastore
    //   612: dup
    //   613: iconst_1
    //   614: getstatic burp/Zb25.HTTPS : Lburp/Zb25;
    //   617: aastore
    //   618: invokevirtual ZG : ([Lburp/Zb25;)Lburp/Zmrn;
    //   621: goto -> 691
    //   624: invokestatic ZM : ()Lburp/Zm4n;
    //   627: iconst_2
    //   628: anewarray burp/Zb25
    //   631: dup
    //   632: iconst_0
    //   633: getstatic burp/Zb25.SMTP : Lburp/Zb25;
    //   636: aastore
    //   637: dup
    //   638: iconst_1
    //   639: getstatic burp/Zb25.SMTPS : Lburp/Zb25;
    //   642: aastore
    //   643: invokevirtual ZG : ([Lburp/Zb25;)Lburp/Zmrn;
    //   646: goto -> 691
    //   649: invokestatic ZM : ()Lburp/Zm4n;
    //   652: iconst_0
    //   653: anewarray burp/Zb25
    //   656: invokevirtual ZG : ([Lburp/Zb25;)Lburp/Zmrn;
    //   659: goto -> 691
    //   662: new burp/Zzbq
    //   665: dup
    //   666: sipush #13452
    //   669: sipush #7331
    //   672: invokestatic a : (II)Ljava/lang/String;
    //   675: iconst_1
    //   676: anewarray java/lang/Object
    //   679: dup
    //   680: iconst_0
    //   681: aload #7
    //   683: aastore
    //   684: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   687: invokespecial <init> : (Ljava/lang/String;)V
    //   690: athrow
    //   691: areturn
    //   692: new burp/Zzbq
    //   695: dup
    //   696: sipush #13450
    //   699: sipush #12492
    //   702: invokestatic a : (II)Ljava/lang/String;
    //   705: iconst_1
    //   706: anewarray java/lang/Object
    //   709: dup
    //   710: iconst_0
    //   711: aload_0
    //   712: aastore
    //   713: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   716: invokespecial <init> : (Ljava/lang/String;)V
    //   719: athrow
    // Exception table:
    //   from	to	target	type
    //   110	122	122	burp/Zzbq
    //   129	173	176	burp/Zzbq
    //   168	193	193	burp/Zzbq
    //   210	228	228	burp/Zzbq
    //   333	405	408	burp/Zzbq
    //   415	436	439	burp/Zzbq
    //   446	467	470	burp/Zzbq
    //   477	498	501	burp/Zzbq
    //   508	529	532	burp/Zzbq
    //   539	595	595	burp/Zzbq
  }
  
  private static Zeqj ZT(Zot paramZot, Zfh paramZfh) {
    try {
    
    } catch (Zzbq zzbq) {
      throw a(null);
    } 
    Zot zot = (paramZot instanceof net.portswigger.Zbm) ? paramZot.ZO(0) : paramZot;
    if (zot instanceof Zbu) {
      Zbu zbu = (Zbu)zot;
      Object object = ((Zbx)zbu.ZO(1)).ZY();
      if (object instanceof Zbj) {
        Zbj zbj = (Zbj)object;
        if (paramZfh == Zfh.DIFFERS_FROM_KEY) {
          String str = zbj.Zj();
          if (str.endsWith(a(13458, 24116)))
            str = str.substring(0, str.length() - a(13444, -31929).length()); 
          try {
            if (str.contains("."))
              throw new Ze4s(str); 
          } catch (Zzbq zzbq) {
            throw a(null);
          } 
          return Zeqj.Zx(str);
        } 
        return Zlsd.Zk(zbj);
      } 
      return Zeqj.ZA(Zlsd.ZZ(zbu));
    } 
    if (zot instanceof Zyd) {
      Zyd zyd = (Zyd)zot;
      try {
        if (paramZfh == Zfh.DIFFERS_FROM_KEY)
          throw new Ze4s(zyd.toString()); 
      } catch (Zzbq zzbq) {
        throw a(null);
      } 
      return Zeqj.ZA(Zlsd.Za(zyd));
    } 
    throw new Zzbq(a(13455, -19755).formatted(new Object[] { zot }));
  }
  
  private static Zgd5 ZA(Zy6 paramZy6) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZV : ()Ljava/util/Optional;
    //   4: aconst_null
    //   5: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   8: checkcast java/lang/String
    //   11: astore_2
    //   12: invokestatic ZO : ()[Lburp/Zbqc;
    //   15: new burp/Zzuy
    //   18: dup
    //   19: aload_2
    //   20: invokespecial <init> : (Ljava/lang/String;)V
    //   23: astore_3
    //   24: aload_0
    //   25: invokevirtual ZU : ()Ljava/util/List;
    //   28: invokeinterface iterator : ()Ljava/util/Iterator;
    //   33: astore #4
    //   35: astore_1
    //   36: aload #4
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 908
    //   46: aload #4
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast net/portswigger/Zot
    //   56: astore #5
    //   58: aload #5
    //   60: instanceof net/portswigger/Zyk
    //   63: ifeq -> 794
    //   66: aload #5
    //   68: checkcast net/portswigger/Zyk
    //   71: astore #6
    //   73: aload #6
    //   75: ldc net/portswigger/Zyk
    //   77: invokevirtual ZR : (Ljava/lang/Class;)Lnet/portswigger/Zot;
    //   80: checkcast net/portswigger/Zyk
    //   83: astore #8
    //   85: aload #8
    //   87: invokevirtual Zb : ()Lnet/portswigger/Zy7;
    //   90: astore #9
    //   92: aload #9
    //   94: ifnonnull -> 105
    //   97: aconst_null
    //   98: goto -> 110
    //   101: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   104: athrow
    //   105: aload #9
    //   107: invokevirtual ZX : ()Ljava/lang/Object;
    //   110: astore #10
    //   112: aload #8
    //   114: invokevirtual ZK : ()Lnet/portswigger/Zgh;
    //   117: astore #11
    //   119: aload #8
    //   121: instanceof net/portswigger/Zy5
    //   124: ifeq -> 320
    //   127: getstatic burp/Zspi.ZO : [I
    //   130: aload #11
    //   132: invokevirtual ordinal : ()I
    //   135: iaload
    //   136: tableswitch default -> 287, 1 -> 176, 2 -> 195, 3 -> 214, 4 -> 233, 5 -> 260
    //   172: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   175: athrow
    //   176: aload_3
    //   177: invokevirtual ZK : ()Lburp/Zrjc;
    //   180: invokevirtual Zx : ()Lburp/Zm6k;
    //   183: pop
    //   184: aload_1
    //   185: ifnonnull -> 790
    //   188: goto -> 195
    //   191: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   194: athrow
    //   195: aload_3
    //   196: invokevirtual ZI : ()Lburp/Zrjc;
    //   199: invokevirtual Zx : ()Lburp/Zm6k;
    //   202: pop
    //   203: aload_1
    //   204: ifnonnull -> 790
    //   207: goto -> 214
    //   210: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   213: athrow
    //   214: aload_3
    //   215: invokevirtual Zl : ()Lburp/Zrjc;
    //   218: invokevirtual Zx : ()Lburp/Zm6k;
    //   221: pop
    //   222: aload_1
    //   223: ifnonnull -> 790
    //   226: goto -> 233
    //   229: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   232: athrow
    //   233: aload #10
    //   235: checkcast java/util/List
    //   238: aload_3
    //   239: <illegal opcode> accept : (Lburp/Zzuy;)Ljava/util/function/Consumer;
    //   244: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   249: aload_1
    //   250: ifnonnull -> 790
    //   253: goto -> 260
    //   256: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   259: athrow
    //   260: aload #10
    //   262: checkcast java/util/List
    //   265: aload_3
    //   266: <illegal opcode> accept : (Lburp/Zzuy;)Ljava/util/function/Consumer;
    //   271: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   276: aload_1
    //   277: ifnonnull -> 790
    //   280: goto -> 287
    //   283: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   286: athrow
    //   287: new burp/Zzbq
    //   290: dup
    //   291: sipush #13446
    //   294: sipush #17773
    //   297: invokestatic a : (II)Ljava/lang/String;
    //   300: iconst_1
    //   301: anewarray java/lang/Object
    //   304: dup
    //   305: iconst_0
    //   306: aload #11
    //   308: aastore
    //   309: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   312: invokespecial <init> : (Ljava/lang/String;)V
    //   315: athrow
    //   316: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   319: athrow
    //   320: aload #8
    //   322: instanceof net/portswigger/Zyt
    //   325: ifeq -> 541
    //   328: getstatic burp/Zspi.ZO : [I
    //   331: aload #11
    //   333: invokevirtual ordinal : ()I
    //   336: iaload
    //   337: tableswitch default -> 508, 1 -> 376, 2 -> 402, 3 -> 428, 4 -> 454, 5 -> 481
    //   372: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   375: athrow
    //   376: aload_3
    //   377: invokevirtual ZK : ()Lburp/Zrjc;
    //   380: aload #10
    //   382: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   387: invokevirtual Zj : (Lburp/Zm3v;)Lburp/Zm6k;
    //   390: pop
    //   391: aload_1
    //   392: ifnonnull -> 790
    //   395: goto -> 402
    //   398: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   401: athrow
    //   402: aload_3
    //   403: invokevirtual ZI : ()Lburp/Zrjc;
    //   406: aload #10
    //   408: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   413: invokevirtual Zj : (Lburp/Zm3v;)Lburp/Zm6k;
    //   416: pop
    //   417: aload_1
    //   418: ifnonnull -> 790
    //   421: goto -> 428
    //   424: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   427: athrow
    //   428: aload_3
    //   429: invokevirtual Zl : ()Lburp/Zrjc;
    //   432: aload #10
    //   434: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   439: invokevirtual Zj : (Lburp/Zm3v;)Lburp/Zm6k;
    //   442: pop
    //   443: aload_1
    //   444: ifnonnull -> 790
    //   447: goto -> 454
    //   450: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   453: athrow
    //   454: aload #10
    //   456: checkcast java/util/List
    //   459: aload_3
    //   460: <illegal opcode> accept : (Lburp/Zzuy;)Ljava/util/function/Consumer;
    //   465: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   470: aload_1
    //   471: ifnonnull -> 790
    //   474: goto -> 481
    //   477: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   480: athrow
    //   481: aload #10
    //   483: checkcast java/util/List
    //   486: aload_3
    //   487: <illegal opcode> accept : (Lburp/Zzuy;)Ljava/util/function/Consumer;
    //   492: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   497: aload_1
    //   498: ifnonnull -> 790
    //   501: goto -> 508
    //   504: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   507: athrow
    //   508: new burp/Zzbq
    //   511: dup
    //   512: sipush #13468
    //   515: sipush #-27902
    //   518: invokestatic a : (II)Ljava/lang/String;
    //   521: iconst_1
    //   522: anewarray java/lang/Object
    //   525: dup
    //   526: iconst_0
    //   527: aload #11
    //   529: aastore
    //   530: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   533: invokespecial <init> : (Ljava/lang/String;)V
    //   536: athrow
    //   537: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   540: athrow
    //   541: aload #8
    //   543: instanceof net/portswigger/Zy8
    //   546: ifeq -> 761
    //   549: getstatic burp/Zspi.ZO : [I
    //   552: aload #11
    //   554: invokevirtual ordinal : ()I
    //   557: iaload
    //   558: tableswitch default -> 728, 1 -> 596, 2 -> 622, 3 -> 648, 4 -> 674, 5 -> 701
    //   592: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   595: athrow
    //   596: aload_3
    //   597: invokevirtual ZK : ()Lburp/Zrjc;
    //   600: aload #10
    //   602: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   607: invokevirtual Zd : (Lburp/Zm3v;)Lburp/Zm6k;
    //   610: pop
    //   611: aload_1
    //   612: ifnonnull -> 790
    //   615: goto -> 622
    //   618: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   621: athrow
    //   622: aload_3
    //   623: invokevirtual ZI : ()Lburp/Zrjc;
    //   626: aload #10
    //   628: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   633: invokevirtual Zd : (Lburp/Zm3v;)Lburp/Zm6k;
    //   636: pop
    //   637: aload_1
    //   638: ifnonnull -> 790
    //   641: goto -> 648
    //   644: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   647: athrow
    //   648: aload_3
    //   649: invokevirtual Zl : ()Lburp/Zrjc;
    //   652: aload #10
    //   654: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   659: invokevirtual Zd : (Lburp/Zm3v;)Lburp/Zm6k;
    //   662: pop
    //   663: aload_1
    //   664: ifnonnull -> 790
    //   667: goto -> 674
    //   670: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   673: athrow
    //   674: aload #10
    //   676: checkcast java/util/List
    //   679: aload_3
    //   680: <illegal opcode> accept : (Lburp/Zzuy;)Ljava/util/function/Consumer;
    //   685: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   690: aload_1
    //   691: ifnonnull -> 790
    //   694: goto -> 701
    //   697: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   700: athrow
    //   701: aload #10
    //   703: checkcast java/util/List
    //   706: aload_3
    //   707: <illegal opcode> accept : (Lburp/Zzuy;)Ljava/util/function/Consumer;
    //   712: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   717: aload_1
    //   718: ifnonnull -> 790
    //   721: goto -> 728
    //   724: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   727: athrow
    //   728: new burp/Zzbq
    //   731: dup
    //   732: sipush #13468
    //   735: sipush #-27902
    //   738: invokestatic a : (II)Ljava/lang/String;
    //   741: iconst_1
    //   742: anewarray java/lang/Object
    //   745: dup
    //   746: iconst_0
    //   747: aload #11
    //   749: aastore
    //   750: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   753: invokespecial <init> : (Ljava/lang/String;)V
    //   756: athrow
    //   757: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   760: athrow
    //   761: new burp/Zzbq
    //   764: dup
    //   765: sipush #13442
    //   768: sipush #-31816
    //   771: invokestatic a : (II)Ljava/lang/String;
    //   774: iconst_1
    //   775: anewarray java/lang/Object
    //   778: dup
    //   779: iconst_0
    //   780: aload #8
    //   782: aastore
    //   783: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   786: invokespecial <init> : (Ljava/lang/String;)V
    //   789: athrow
    //   790: aload_1
    //   791: ifnonnull -> 904
    //   794: aload #5
    //   796: instanceof net/portswigger/Zyd
    //   799: ifeq -> 836
    //   802: goto -> 809
    //   805: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   808: athrow
    //   809: aload #5
    //   811: checkcast net/portswigger/Zyd
    //   814: astore #7
    //   816: new burp/Zzut
    //   819: dup
    //   820: aload_2
    //   821: invokespecial <init> : (Ljava/lang/String;)V
    //   824: aload #7
    //   826: invokestatic Za : (Lnet/portswigger/Zyd;)Lburp/Zmgt;
    //   829: invokevirtual Zg : (Lburp/Zmgt;)Lburp/Zzut;
    //   832: invokestatic Zo : (Lburp/Zzut;)Lburp/Zz89;
    //   835: areturn
    //   836: aload #5
    //   838: iconst_4
    //   839: anewarray java/lang/Class
    //   842: dup
    //   843: iconst_0
    //   844: ldc net/portswigger/Zj1
    //   846: aastore
    //   847: dup
    //   848: iconst_1
    //   849: ldc net/portswigger/Zm
    //   851: aastore
    //   852: dup
    //   853: iconst_2
    //   854: ldc net/portswigger/Zw
    //   856: aastore
    //   857: dup
    //   858: iconst_3
    //   859: ldc net/portswigger/Zjg
    //   861: aastore
    //   862: invokestatic ZR : (Lnet/portswigger/Zot;[Ljava/lang/Class;)Z
    //   865: ifeq -> 875
    //   868: goto -> 904
    //   871: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   874: athrow
    //   875: new burp/Zzbq
    //   878: dup
    //   879: sipush #13453
    //   882: sipush #3621
    //   885: invokestatic a : (II)Ljava/lang/String;
    //   888: iconst_1
    //   889: anewarray java/lang/Object
    //   892: dup
    //   893: iconst_0
    //   894: aload #5
    //   896: aastore
    //   897: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   900: invokespecial <init> : (Ljava/lang/String;)V
    //   903: athrow
    //   904: aload_1
    //   905: ifnonnull -> 36
    //   908: aload_3
    //   909: areturn
    // Exception table:
    //   from	to	target	type
    //   92	101	101	burp/Zzbq
    //   119	172	172	burp/Zzbq
    //   127	188	191	burp/Zzbq
    //   176	207	210	burp/Zzbq
    //   195	226	229	burp/Zzbq
    //   214	253	256	burp/Zzbq
    //   233	280	283	burp/Zzbq
    //   260	316	316	burp/Zzbq
    //   320	372	372	burp/Zzbq
    //   328	395	398	burp/Zzbq
    //   376	421	424	burp/Zzbq
    //   402	447	450	burp/Zzbq
    //   428	474	477	burp/Zzbq
    //   454	501	504	burp/Zzbq
    //   481	537	537	burp/Zzbq
    //   541	592	592	burp/Zzbq
    //   549	615	618	burp/Zzbq
    //   596	641	644	burp/Zzbq
    //   622	667	670	burp/Zzbq
    //   648	694	697	burp/Zzbq
    //   674	721	724	burp/Zzbq
    //   701	757	757	burp/Zzbq
    //   790	802	805	burp/Zzbq
    //   836	871	871	burp/Zzbq
  }
  
  private static boolean ZR(Zot paramZot, Class<? extends Zz>... paramVarArgs) {
    Class<? extends Zz>[] arrayOfClass = paramVarArgs;
    int i = arrayOfClass.length;
    byte b = 0;
    Zbqc[] arrayOfZbqc = ZO();
    while (b < i) {
      Class<? extends Zz> clazz = arrayOfClass[b];
      try {
        if (clazz.isInstance(paramZot))
          return true; 
      } catch (Zzbq zzbq) {
        throw a(null);
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return false;
  }
  
  private static Collection<Zzbl> ZO(Z_r paramZ_r) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZO : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: invokevirtual ZU : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_3
    //   21: astore_1
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 143
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast net/portswigger/Zot
    //   40: astore #4
    //   42: aload #4
    //   44: instanceof net/portswigger/Zyy
    //   47: ifeq -> 73
    //   50: aload #4
    //   52: checkcast net/portswigger/Zyy
    //   55: astore #5
    //   57: aload_2
    //   58: aload #5
    //   60: invokestatic ZS : (Lnet/portswigger/Zyy;)Lburp/Zmgt;
    //   63: invokeinterface add : (Ljava/lang/Object;)Z
    //   68: pop
    //   69: aload_1
    //   70: ifnonnull -> 139
    //   73: aload #4
    //   75: instanceof net/portswigger/Zrz
    //   78: ifne -> 139
    //   81: goto -> 88
    //   84: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   87: athrow
    //   88: aload #4
    //   90: instanceof net/portswigger/Zm
    //   93: ifeq -> 110
    //   96: goto -> 103
    //   99: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   102: athrow
    //   103: goto -> 139
    //   106: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   109: athrow
    //   110: new burp/Zzbq
    //   113: dup
    //   114: sipush #13466
    //   117: sipush #-26548
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: iconst_1
    //   124: anewarray java/lang/Object
    //   127: dup
    //   128: iconst_0
    //   129: aload #4
    //   131: aastore
    //   132: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   135: invokespecial <init> : (Ljava/lang/String;)V
    //   138: athrow
    //   139: aload_1
    //   140: ifnonnull -> 22
    //   143: aload_2
    //   144: areturn
    // Exception table:
    //   from	to	target	type
    //   57	81	84	burp/Zzbq
    //   73	96	99	burp/Zzbq
    //   88	106	106	burp/Zzbq
  }
  
  private static Collection<Zzbl> Zh(Zyl paramZyl) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZO : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: invokevirtual ZU : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_3
    //   21: astore_1
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 142
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast net/portswigger/Zot
    //   40: astore #4
    //   42: aload #4
    //   44: instanceof net/portswigger/Zy_
    //   47: ifeq -> 73
    //   50: aload #4
    //   52: checkcast net/portswigger/Zy_
    //   55: astore #5
    //   57: aload_2
    //   58: aload #5
    //   60: invokestatic Zc : (Lnet/portswigger/Zy_;)Lburp/Zznd;
    //   63: invokeinterface add : (Ljava/lang/Object;)Z
    //   68: pop
    //   69: aload_1
    //   70: ifnonnull -> 138
    //   73: aload #4
    //   75: iconst_2
    //   76: anewarray java/lang/Class
    //   79: dup
    //   80: iconst_0
    //   81: ldc net/portswigger/Zjk
    //   83: aastore
    //   84: dup
    //   85: iconst_1
    //   86: ldc net/portswigger/Zm
    //   88: aastore
    //   89: invokestatic ZR : (Lnet/portswigger/Zot;[Ljava/lang/Class;)Z
    //   92: ifeq -> 109
    //   95: goto -> 102
    //   98: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   101: athrow
    //   102: goto -> 138
    //   105: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   108: athrow
    //   109: new burp/Zzbq
    //   112: dup
    //   113: sipush #13469
    //   116: sipush #3941
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: iconst_1
    //   123: anewarray java/lang/Object
    //   126: dup
    //   127: iconst_0
    //   128: aload #4
    //   130: aastore
    //   131: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   134: invokespecial <init> : (Ljava/lang/String;)V
    //   137: athrow
    //   138: aload_1
    //   139: ifnonnull -> 22
    //   142: aload_2
    //   143: areturn
    // Exception table:
    //   from	to	target	type
    //   57	95	98	burp/Zzbq
    //   73	105	105	burp/Zzbq
  }
  
  private static Zmgt ZS(Zyy paramZyy) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZP : ()Ljava/lang/String;
    //   4: astore_2
    //   5: invokestatic ZO : ()[Lburp/Zbqc;
    //   8: aload_0
    //   9: invokevirtual ZH : ()Ljava/lang/Object;
    //   12: astore_3
    //   13: astore_1
    //   14: aload_3
    //   15: instanceof net/portswigger/Zbu
    //   18: ifeq -> 38
    //   21: aload_3
    //   22: checkcast net/portswigger/Zbu
    //   25: astore #6
    //   27: aload #6
    //   29: invokestatic ZZ : (Lnet/portswigger/Zbu;)Lburp/Zmgt;
    //   32: astore #4
    //   34: aload_1
    //   35: ifnonnull -> 101
    //   38: aload_3
    //   39: instanceof net/portswigger/Zyd
    //   42: ifeq -> 69
    //   45: goto -> 52
    //   48: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   51: athrow
    //   52: aload_3
    //   53: checkcast net/portswigger/Zyd
    //   56: astore #5
    //   58: aload #5
    //   60: invokestatic Za : (Lnet/portswigger/Zyd;)Lburp/Zmgt;
    //   63: astore #4
    //   65: aload_1
    //   66: ifnonnull -> 101
    //   69: new burp/Zzbq
    //   72: dup
    //   73: sipush #13470
    //   76: sipush #8662
    //   79: invokestatic a : (II)Ljava/lang/String;
    //   82: iconst_1
    //   83: anewarray java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: aload_2
    //   89: aastore
    //   90: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   93: invokespecial <init> : (Ljava/lang/String;)V
    //   96: athrow
    //   97: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   100: athrow
    //   101: aload #4
    //   103: aload_2
    //   104: invokevirtual Zf : (Ljava/lang/String;)Lburp/Zmgt;
    //   107: areturn
    // Exception table:
    //   from	to	target	type
    //   34	45	48	burp/Zzbq
    //   65	97	97	burp/Zzbq
  }
  
  private static Zznd Zc(Zy_ paramZy_) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zp : ()Ljava/lang/String;
    //   4: astore_2
    //   5: invokestatic ZO : ()[Lburp/Zbqc;
    //   8: aload_0
    //   9: invokevirtual ZH : ()Ljava/lang/Object;
    //   12: astore_3
    //   13: new java/util/LinkedList
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: astore #4
    //   22: astore_1
    //   23: aload_3
    //   24: instanceof java/util/List
    //   27: ifeq -> 173
    //   30: aload_3
    //   31: checkcast java/util/List
    //   34: astore #5
    //   36: aload #5
    //   38: invokeinterface iterator : ()Ljava/util/Iterator;
    //   43: astore #6
    //   45: aload #6
    //   47: invokeinterface hasNext : ()Z
    //   52: ifeq -> 169
    //   55: aload #6
    //   57: invokeinterface next : ()Ljava/lang/Object;
    //   62: astore #7
    //   64: aload #7
    //   66: instanceof net/portswigger/Zyd
    //   69: ifeq -> 96
    //   72: aload #7
    //   74: checkcast net/portswigger/Zyd
    //   77: astore #9
    //   79: aload #4
    //   81: aload #9
    //   83: invokestatic Za : (Lnet/portswigger/Zyd;)Lburp/Zmgt;
    //   86: invokeinterface add : (Ljava/lang/Object;)Z
    //   91: pop
    //   92: aload_1
    //   93: ifnonnull -> 165
    //   96: aload_3
    //   97: instanceof net/portswigger/Zbu
    //   100: ifeq -> 133
    //   103: goto -> 110
    //   106: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   109: athrow
    //   110: aload_3
    //   111: checkcast net/portswigger/Zbu
    //   114: astore #8
    //   116: aload #4
    //   118: aload #8
    //   120: invokestatic ZZ : (Lnet/portswigger/Zbu;)Lburp/Zmgt;
    //   123: invokeinterface add : (Ljava/lang/Object;)Z
    //   128: pop
    //   129: aload_1
    //   130: ifnonnull -> 165
    //   133: new burp/Zzbq
    //   136: dup
    //   137: sipush #13501
    //   140: sipush #12189
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: iconst_1
    //   147: anewarray java/lang/Object
    //   150: dup
    //   151: iconst_0
    //   152: aload_2
    //   153: aastore
    //   154: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   157: invokespecial <init> : (Ljava/lang/String;)V
    //   160: athrow
    //   161: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   164: athrow
    //   165: aload_1
    //   166: ifnonnull -> 45
    //   169: aload_1
    //   170: ifnonnull -> 205
    //   173: new burp/Zzbq
    //   176: dup
    //   177: sipush #13501
    //   180: sipush #12189
    //   183: invokestatic a : (II)Ljava/lang/String;
    //   186: iconst_1
    //   187: anewarray java/lang/Object
    //   190: dup
    //   191: iconst_0
    //   192: aload_2
    //   193: aastore
    //   194: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   197: invokespecial <init> : (Ljava/lang/String;)V
    //   200: athrow
    //   201: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   204: athrow
    //   205: new burp/Zznd
    //   208: dup
    //   209: aload #4
    //   211: invokespecial <init> : (Ljava/util/List;)V
    //   214: aload_2
    //   215: invokevirtual Zj : (Ljava/lang/String;)Lburp/Zznd;
    //   218: areturn
    // Exception table:
    //   from	to	target	type
    //   79	103	106	burp/Zzbq
    //   116	161	161	burp/Zzbq
    //   169	201	201	burp/Zzbq
  }
  
  private static Zlz6 Z_(Zyp paramZyp) {
    // Byte code:
    //   0: new burp/Zgkk
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZO : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: invokevirtual ZU : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_3
    //   21: astore_1
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 321
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast net/portswigger/Zot
    //   40: astore #4
    //   42: aload #4
    //   44: instanceof net/portswigger/Zye
    //   47: ifeq -> 74
    //   50: aload #4
    //   52: checkcast net/portswigger/Zye
    //   55: astore #5
    //   57: aload_2
    //   58: aload #5
    //   60: invokevirtual Zb : ()Lnet/portswigger/Zy2;
    //   63: invokevirtual toString : ()Ljava/lang/String;
    //   66: invokevirtual Zg : (Ljava/lang/String;)Lburp/Zgkk;
    //   69: pop
    //   70: aload_1
    //   71: ifnonnull -> 317
    //   74: aload #4
    //   76: instanceof net/portswigger/Z_i
    //   79: ifeq -> 113
    //   82: goto -> 89
    //   85: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   88: athrow
    //   89: aload #4
    //   91: checkcast net/portswigger/Z_i
    //   94: astore #6
    //   96: aload_2
    //   97: aload #6
    //   99: invokevirtual ZK : ()Lnet/portswigger/Zy2;
    //   102: invokevirtual toString : ()Ljava/lang/String;
    //   105: invokevirtual Zp : (Ljava/lang/String;)Lburp/Zgkk;
    //   108: pop
    //   109: aload_1
    //   110: ifnonnull -> 317
    //   113: aload #4
    //   115: instanceof net/portswigger/Z_o
    //   118: ifeq -> 175
    //   121: goto -> 128
    //   124: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   127: athrow
    //   128: aload #4
    //   130: checkcast net/portswigger/Z_o
    //   133: astore #7
    //   135: aload_2
    //   136: aload #7
    //   138: invokevirtual ZG : ()Ljava/util/List;
    //   141: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   146: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   151: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   156: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   159: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   164: checkcast java/util/Set
    //   167: invokevirtual Zt : (Ljava/util/Set;)Lburp/Zgkk;
    //   170: pop
    //   171: aload_1
    //   172: ifnonnull -> 317
    //   175: aload #4
    //   177: instanceof net/portswigger/Zyw
    //   180: ifeq -> 237
    //   183: goto -> 190
    //   186: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   189: athrow
    //   190: aload #4
    //   192: checkcast net/portswigger/Zyw
    //   195: astore #8
    //   197: aload_2
    //   198: aload #8
    //   200: invokevirtual ZV : ()Ljava/util/List;
    //   203: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   208: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   213: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   218: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   221: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   226: checkcast java/util/Set
    //   229: invokevirtual ZB : (Ljava/util/Set;)Lburp/Zgkk;
    //   232: pop
    //   233: aload_1
    //   234: ifnonnull -> 317
    //   237: aload #4
    //   239: instanceof net/portswigger/Zyc
    //   242: ifne -> 317
    //   245: goto -> 252
    //   248: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   251: athrow
    //   252: aload #4
    //   254: iconst_2
    //   255: anewarray java/lang/Class
    //   258: dup
    //   259: iconst_0
    //   260: ldc net/portswigger/Zrb
    //   262: aastore
    //   263: dup
    //   264: iconst_1
    //   265: ldc net/portswigger/Zm
    //   267: aastore
    //   268: invokestatic ZR : (Lnet/portswigger/Zot;[Ljava/lang/Class;)Z
    //   271: ifeq -> 288
    //   274: goto -> 281
    //   277: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   280: athrow
    //   281: goto -> 317
    //   284: invokestatic a : (Lburp/Zzbq;)Lburp/Zzbq;
    //   287: athrow
    //   288: new burp/Zzbq
    //   291: dup
    //   292: sipush #13467
    //   295: sipush #15511
    //   298: invokestatic a : (II)Ljava/lang/String;
    //   301: iconst_1
    //   302: anewarray java/lang/Object
    //   305: dup
    //   306: iconst_0
    //   307: aload #4
    //   309: aastore
    //   310: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: athrow
    //   317: aload_1
    //   318: ifnonnull -> 22
    //   321: aload_2
    //   322: invokevirtual Zy : ()Lburp/Zlz6;
    //   325: areturn
    // Exception table:
    //   from	to	target	type
    //   57	82	85	burp/Zzbq
    //   96	121	124	burp/Zzbq
    //   135	183	186	burp/Zzbq
    //   197	245	248	burp/Zzbq
    //   237	274	277	burp/Zzbq
    //   252	284	284	burp/Zzbq
  }
  
  private static void lambda$convertSendRequest$26(Zzuy paramZzuy, Object paramObject) {
    paramZzuy.ZV().Zq(paramObject::lambda$convertSendRequest$24, paramObject::lambda$convertSendRequest$25);
  }
  
  private static String lambda$convertSendRequest$25(Object paramObject, Zzvx paramZzvx) {
    return Zo(paramZzvx, ((Zyn)paramObject).ZK());
  }
  
  private static String lambda$convertSendRequest$24(Object paramObject, Zzvx paramZzvx) {
    return Zo(paramZzvx, ((Zyn)paramObject).Zy());
  }
  
  private static void lambda$convertSendRequest$23(Zzuy paramZzuy, Object paramObject) {
    paramZzuy.ZQ().Zl(paramObject::lambda$convertSendRequest$9);
  }
  
  private static void lambda$convertSendRequest$18(Zzuy paramZzuy, Object paramObject) {
    paramZzuy.ZV().Z_(ZK(((Zyn)paramObject).Zy()), ZK(((Zyn)paramObject).ZK()));
  }
  
  private static void lambda$convertSendRequest$17(Zzuy paramZzuy, Object paramObject) {
    paramZzuy.ZQ().ZO(paramObject::lambda$convertSendRequest$9);
  }
  
  private static void lambda$convertSendRequest$12(Zzuy paramZzuy, Object paramObject) {
    paramZzuy.ZV().ZD(paramObject::lambda$convertSendRequest$9);
  }
  
  private static void lambda$convertSendRequest$10(Zzuy paramZzuy, Object paramObject) {
    paramZzuy.ZQ().ZD(paramObject::lambda$convertSendRequest$9);
  }
  
  private static String lambda$convertSendRequest$9(Object paramObject, Zzvx paramZzvx) {
    return Zo(paramZzvx, (Z_y)paramObject);
  }
  
  private static String lambda$convertReportIssue$8(Zyu paramZyu, Zzvx paramZzvx) {
    return Zo(paramZzvx, paramZyu.Zm());
  }
  
  private static String lambda$convertReportIssue$7(Zyj paramZyj, Zzvx paramZzvx) {
    return Zo(paramZzvx, paramZyj.ZX());
  }
  
  private static Stream lambda$convertIncludedInsertionPointTypes$6(Zb7 paramZb7) {
    try {
      switch (Zspi.ZK[paramZb7.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
          break;
      } 
    } catch (Zzbq zzbq) {
      throw a(null);
    } 
    return Stream.of(Zs66.COOKIE);
  }
  
  private static String lambda$convertSendPayload$5(Zyv paramZyv, Zzvx paramZzvx) {
    return Zo(paramZzvx, paramZyv.Zy());
  }
  
  private static String lambda$convertSendPayload$4(Z_4 paramZ_4, Zzvx paramZzvx) {
    return Zo(paramZzvx, paramZ_4.ZM());
  }
  
  private static void lambda$convertNamedOperation$3(Set<String> paramSet, String paramString) {
    Zh(paramSet, paramString);
  }
  
  private static Zzur lambda$convertNamedOperation$2(Zgd5 paramZgd5) {
    return (Zzur)paramZgd5;
  }
  
  private static boolean lambda$convertNamedOperation$1(Zgd5 paramZgd5) {
    return paramZgd5 instanceof Zzur;
  }
  
  private static void lambda$convertGivenBlock$0(Set<String> paramSet, String paramString) {
    Zh(paramSet, paramString);
    paramSet.add(paramString);
  }
  
  public static void Ze(Zbqc[] paramArrayOfZbqc) {
    ZB = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZO() {
    return ZB;
  }
  
  private static Zzbq a(Zzbq paramZzbq) {
    return paramZzbq;
  }
  
  static {
    // Byte code:
    //   0: bipush #34
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_4
    //   8: anewarray burp/Zbqc
    //   11: iconst_0
    //   12: istore_3
    //   13: ldc '{Ê ¦ ã}!µs×ý=mÑàzÂ°¾Ý5«}7ë¢k.ì{Y+r±%õS!7>Q÷Ü]Ü8\ÕòÜQa;þ{üQ®ØÓT1QÌëYeh ùºÑ¾»åÀ?å{­\\r8Ãe`{¯(fÂ.àû7ÈýgM_q\\bY°0²ü«SVÂ§7uyó5ÉÏq¾½eså\!TE8ÃÁÈ\\ba×yÙÄMx§|MÕ%Á÷\\rJb¾Ó`æ<*$0$³Ð×ç\\nyÐ-±kr¦²+xïðIÝÞ$gãßhGßÙ°yì>OÛÊEhZÈ^R ÃÔÔ,^k¹´ÅöÂ%vel% ¿ýU+Ð(7)¯6ÅYå1aµ¿q%I"|¹Â$r;¿ÀçÁGø9¾ñ hAóCv ÿºP|vªr¦ÿHèÅùß_ÛpÀzp±t°xqÆ øÀ#rÖ%ggs±t¾Æt4qÿ\\f}ÖId!¥Wo ,ÀsSß$1váðÔ_dX¡µ]!aþ:yDcP¦¯7°£eÍ9ÑEýWk`Ó£Q\\b½}iwQs]f¶ñrê~¿tjEJëÃ/n7ó¢¾«sP*'^\\tñ~ó©/5Ë,íÒd¨ìofÃ\\r¥aê\¸F7õìþg6\\fÀA©´ZQád`¬«7UDÖß¸ÁISª7¿K90èNQëånHA Ö)EÛoÄ»7ùYÒ¢E9I×Iã6_ÎÌ*Scµ­ó>¹éCþü+%c£¬ÀVïU °£&g%=Ý9óÍN=UÕt­÷4ÉoòÞf?|[AÎ.:8rÇü'1Õd¡ò!ê\\r^æ\\b+8É°\\tà[Ã¬ªìw½¯¡ÿ&~%`*)r.:g±ûOÆJÚ4ÿ.;ÂIòù6\\n~@4Û$»HëE\\nK 14=» ÈéÕ_\\t§üg Ë:ÞûIv;õÑÆRN¬Ëa8kG?K­cwO@ý{5\\téHðo~÷9J\\fÿËÀ¡èùË<Q+%,[1¨ÑgK[YôY]s_HãNvÎªÔØg_"YÙª&¹/ø«\\rëM4\\nÁÒÿ3?ò¿ÃÔÿï"×\\b¸_ôGÃ^¶õ>ÿ95ßÇDx05Ö,: Wîë³?¿ #¶máIÆÂ×¯ÌFË9.\ËMFdªÓQ!yÝÇXMÜM+o#RÈbfh¯0Ûì´b"³n+×ÒÊ¬úÒÌKÅJx*ÈÒÿ¥¼Ýÿ} %À)¤\\f"Þ\\t)A_ÓÅ»e·ÿÕXÇG;fÓd×~¹ZW*UÅ¬9nL'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #43
    //   24: istore_1
    //   25: invokestatic Ze : ([Lburp/Zbqc;)V
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #7
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc ')2íomëmÇPªóÆì×Æ4ò@zAø¨G+íë$QºõLn¨4Ù§Å6Aæú$BdÙôâ°K!!9ÓëE×ÌØÃ;ÀÎ\\n¾. 4Â8ºhT±Co¡o]7«û\\bV=Rj\\näÑ'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #84
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #8
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic burp/Zl27.a : [Ljava/lang/String;
    //   139: bipush #34
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Zl27.b : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 267
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 249, 0 -> 220, 1 -> 225, 2 -> 229, 3 -> 234, 4 -> 239, 5 -> 244
    //   220: bipush #60
    //   222: goto -> 251
    //   225: iconst_5
    //   226: goto -> 251
    //   229: bipush #35
    //   231: goto -> 251
    //   234: bipush #110
    //   236: goto -> 251
    //   239: bipush #90
    //   241: goto -> 251
    //   244: bipush #66
    //   246: goto -> 251
    //   249: bipush #74
    //   251: ixor
    //   252: ixor
    //   253: i2c
    //   254: castore
    //   255: iinc #6, 1
    //   258: dup
    //   259: ifne -> 267
    //   262: dup2
    //   263: dup_x1
    //   264: goto -> 173
    //   267: dup2_x1
    //   268: pop2
    //   269: dup_x2
    //   270: iload #6
    //   272: if_icmpgt -> 169
    //   275: pop
    //   276: new java/lang/String
    //   279: dup_x1
    //   280: swap
    //   281: invokespecial <init> : ([C)V
    //   284: invokevirtual intern : ()Ljava/lang/String;
    //   287: swap
    //   288: pop
    //   289: swap
    //   290: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x349C) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = ' ';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl27.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */