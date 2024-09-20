package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.portswigger.Zbd;
import net.portswigger.Zbf;
import net.portswigger.Zbk;
import net.portswigger.Zbq;
import net.portswigger.Zbt;
import net.portswigger.Zbv;
import net.portswigger.Zdh;
import net.portswigger.Ze7;
import net.portswigger.Zh3;
import net.portswigger.Zhc;
import net.portswigger.Zhm;
import net.portswigger.Zhn;
import net.portswigger.Zhz;
import net.portswigger.Zkd;
import net.portswigger.Zld;
import net.portswigger.Zx0;
import net.portswigger.Zx3;
import net.portswigger.Zx7;
import net.portswigger.Zxa;
import net.portswigger.Zxc;
import net.portswigger.Zxf;
import net.portswigger.Zxg;
import net.portswigger.Zxj;
import net.portswigger.Zxk;
import net.portswigger.Zxl;
import net.portswigger.Zxn;
import net.portswigger.Zxr;
import net.portswigger.Zxt;
import net.portswigger.Zxv;

public class Zl2a {
  private static String ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zsvm ZZ(Zhz paramZhz) {
    // Byte code:
    //   0: invokestatic emptyList : ()Ljava/util/List;
    //   3: astore_2
    //   4: invokestatic emptyList : ()Ljava/util/List;
    //   7: astore_3
    //   8: invokestatic Ze : ()Ljava/lang/String;
    //   11: aconst_null
    //   12: astore #4
    //   14: aconst_null
    //   15: astore #5
    //   17: aload_0
    //   18: invokevirtual ZK : ()Ljava/util/List;
    //   21: invokeinterface iterator : ()Ljava/util/Iterator;
    //   26: astore #6
    //   28: astore_1
    //   29: aload #6
    //   31: invokeinterface hasNext : ()Z
    //   36: ifeq -> 269
    //   39: aload #6
    //   41: invokeinterface next : ()Ljava/lang/Object;
    //   46: checkcast net/portswigger/Zld
    //   49: astore #7
    //   51: aload #7
    //   53: instanceof net/portswigger/Zbf
    //   56: ifeq -> 90
    //   59: aload #7
    //   61: checkcast net/portswigger/Zbf
    //   64: astore #8
    //   66: aload #8
    //   68: invokestatic ZQ : (Lnet/portswigger/Zbf;)Ljava/util/Collection;
    //   71: astore_2
    //   72: aload_1
    //   73: ifnull -> 265
    //   76: iconst_5
    //   77: anewarray burp/Zbqc
    //   80: invokestatic Zr : ([Lburp/Zbqc;)V
    //   83: goto -> 90
    //   86: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   89: athrow
    //   90: aload #7
    //   92: instanceof net/portswigger/Zxf
    //   95: ifeq -> 115
    //   98: aload #7
    //   100: checkcast net/portswigger/Zxf
    //   103: astore #9
    //   105: aload #9
    //   107: invokestatic Zf : (Lnet/portswigger/Zxf;)Ljava/util/Collection;
    //   110: astore_3
    //   111: aload_1
    //   112: ifnull -> 265
    //   115: aload #7
    //   117: instanceof net/portswigger/Zxj
    //   120: ifeq -> 145
    //   123: goto -> 130
    //   126: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   129: athrow
    //   130: aload #7
    //   132: checkcast net/portswigger/Zxj
    //   135: astore #10
    //   137: aload #10
    //   139: astore #4
    //   141: aload_1
    //   142: ifnull -> 265
    //   145: aload #7
    //   147: instanceof net/portswigger/Zxg
    //   150: ifeq -> 178
    //   153: goto -> 160
    //   156: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   159: athrow
    //   160: aload #7
    //   162: checkcast net/portswigger/Zxg
    //   165: astore #11
    //   167: aload #11
    //   169: invokestatic Zq : (Lnet/portswigger/Zxg;)Lburp/Ze58;
    //   172: astore #5
    //   174: aload_1
    //   175: ifnull -> 265
    //   178: aload #7
    //   180: instanceof net/portswigger/Zbb
    //   183: ifne -> 265
    //   186: goto -> 193
    //   189: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   192: athrow
    //   193: aload #7
    //   195: instanceof net/portswigger/Ze7
    //   198: ifeq -> 236
    //   201: goto -> 208
    //   204: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   207: athrow
    //   208: aload #7
    //   210: checkcast net/portswigger/Ze7
    //   213: astore #12
    //   215: getstatic net/portswigger/Zkd.EOF : Lnet/portswigger/Zkd;
    //   218: aload #12
    //   220: invokevirtual ZX : ()Lnet/portswigger/Zkd;
    //   223: invokevirtual equals : (Ljava/lang/Object;)Z
    //   226: ifeq -> 236
    //   229: goto -> 265
    //   232: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   235: athrow
    //   236: new burp/Ztuz
    //   239: dup
    //   240: sipush #19353
    //   243: sipush #-21347
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
    //   266: ifnull -> 29
    //   269: aload #4
    //   271: aload #5
    //   273: aload_2
    //   274: aload_3
    //   275: invokestatic ZP : (Lnet/portswigger/Zxj;Lburp/Ze58;Ljava/util/Collection;Ljava/util/Collection;)Lburp/Zsvm;
    //   278: areturn
    // Exception table:
    //   from	to	target	type
    //   72	83	86	burp/Ztuz
    //   111	123	126	burp/Ztuz
    //   141	153	156	burp/Ztuz
    //   174	186	189	burp/Ztuz
    //   178	201	204	burp/Ztuz
    //   215	232	232	burp/Ztuz
  }
  
  private static void Zz(Set<String> paramSet, String paramString) {
    try {
      if (paramString == null)
        return; 
    } catch (Ztuz ztuz) {
      throw a(null);
    } 
    try {
      if (Zbf.ZO(paramString))
        throw new Ze4i(paramString); 
    } catch (Ztuz ztuz) {
      throw a(null);
    } 
    try {
      if (paramSet.contains(paramString))
        throw new Ze4u(paramString); 
    } catch (Ztuz ztuz) {
      throw a(null);
    } 
  }
  
  private static Zsvm ZP(Zxj paramZxj, Ze58 paramZe58, Collection<Zzbl> paramCollection1, Collection<Zzbl> paramCollection2) {
    // Byte code:
    //   0: new java/util/HashSet
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: invokestatic Ze : ()Ljava/lang/String;
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
    //   71: getstatic burp/Zgv3.V2_BETA : Lburp/Zgv3;
    //   74: invokevirtual ZI : (Lburp/Zgv3;)Lburp/Zzy4;
    //   77: aload_1
    //   78: invokevirtual ZrS : ()Ljava/lang/String;
    //   81: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zzy4;
    //   84: aload_1
    //   85: invokevirtual ZrE : ()Ljava/util/Set;
    //   88: invokevirtual Zo : (Ljava/util/Set;)Lburp/Zzy4;
    //   91: aload_1
    //   92: invokevirtual Zrx : ()Ljava/util/Set;
    //   95: invokevirtual ZP : (Ljava/util/Set;)Lburp/Zzy4;
    //   98: aload_3
    //   99: invokestatic Zf : (Ljava/util/Collection;)Ljava/util/function/Consumer;
    //   102: invokevirtual Zx : (Ljava/util/function/Consumer;)Lburp/Zzy4;
    //   105: aload_2
    //   106: invokestatic Zf : (Ljava/util/Collection;)Ljava/util/function/Consumer;
    //   109: invokevirtual Ze : (Ljava/util/function/Consumer;)Lburp/Zzy4;
    //   112: getstatic burp/Zgvj.Zj : [I
    //   115: aload_0
    //   116: invokevirtual ZY : ()Lnet/portswigger/Zdh;
    //   119: invokevirtual ordinal : ()I
    //   122: iaload
    //   123: tableswitch default -> 156, 1 -> 166, 2 -> 172, 3 -> 178, 4 -> 184, 5 -> 190
    //   156: new java/lang/MatchException
    //   159: dup
    //   160: aconst_null
    //   161: aconst_null
    //   162: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   165: athrow
    //   166: getstatic burp/Ztst.APH : Lburp/Ztst;
    //   169: goto -> 193
    //   172: getstatic burp/Ztst.APR : Lburp/Ztst;
    //   175: goto -> 193
    //   178: getstatic burp/Zmc8.PPR : Lburp/Zmc8;
    //   181: goto -> 193
    //   184: getstatic burp/Ztst.APIP : Lburp/Ztst;
    //   187: goto -> 193
    //   190: getstatic burp/Ztst.APP : Lburp/Ztst;
    //   193: invokevirtual ZV : (Lburp/Zbjr;)Lburp/Zzy4;
    //   196: aload_0
    //   197: invokevirtual ZY : ()Lnet/portswigger/Zdh;
    //   200: aload_0
    //   201: invokevirtual Z_ : ()Ljava/util/Set;
    //   204: invokestatic ZN : (Lnet/portswigger/Zdh;Ljava/util/Set;)Ljava/util/Set;
    //   207: invokevirtual Zl : (Ljava/util/Set;)Lburp/Zzy4;
    //   210: astore #6
    //   212: aload_0
    //   213: invokevirtual ZK : ()Ljava/util/List;
    //   216: invokeinterface iterator : ()Ljava/util/Iterator;
    //   221: astore #7
    //   223: aload #7
    //   225: invokeinterface hasNext : ()Z
    //   230: ifeq -> 528
    //   233: aload #7
    //   235: invokeinterface next : ()Ljava/lang/Object;
    //   240: checkcast net/portswigger/Zld
    //   243: astore #8
    //   245: aload #8
    //   247: instanceof net/portswigger/Zxv
    //   250: ifeq -> 278
    //   253: aload #8
    //   255: checkcast net/portswigger/Zxv
    //   258: astore #9
    //   260: aload #6
    //   262: aload #9
    //   264: aload #5
    //   266: invokestatic Zs : (Lnet/portswigger/Zxv;Ljava/util/Set;)Ljava/util/List;
    //   269: invokevirtual ZT : (Ljava/util/List;)Lburp/Zzy4;
    //   272: pop
    //   273: aload #4
    //   275: ifnull -> 523
    //   278: aload #8
    //   280: instanceof net/portswigger/Zxh
    //   283: ifeq -> 334
    //   286: goto -> 293
    //   289: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   292: athrow
    //   293: aload #8
    //   295: checkcast net/portswigger/Zxh
    //   298: astore #10
    //   300: aload #10
    //   302: aload_1
    //   303: invokestatic Zr : (Lnet/portswigger/Zbk;Lburp/Ze58;)Lburp/Zlmr;
    //   306: astore #12
    //   308: aload #6
    //   310: aload #12
    //   312: invokevirtual ZyK : ()Lburp/Zmrn;
    //   315: aload #12
    //   317: invokevirtual ZyQ : ()Ljava/util/List;
    //   320: aload #12
    //   322: invokevirtual ZyI : ()Ljava/util/List;
    //   325: invokevirtual Z_ : (Lburp/Zmrn;Ljava/util/List;Ljava/util/List;)Lburp/Zzy4;
    //   328: pop
    //   329: aload #4
    //   331: ifnull -> 523
    //   334: aload #8
    //   336: instanceof net/portswigger/Zxr
    //   339: ifeq -> 383
    //   342: goto -> 349
    //   345: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   348: athrow
    //   349: aload #8
    //   351: checkcast net/portswigger/Zxr
    //   354: astore #11
    //   356: aload #11
    //   358: aload_1
    //   359: invokestatic Zs : (Lnet/portswigger/Zxr;Lburp/Ze58;)Lburp/Zsvm;
    //   362: astore #12
    //   364: aload #6
    //   366: getstatic burp/Zmrn.ZV : Lburp/Zmrn;
    //   369: aload #12
    //   371: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   374: invokevirtual Zv : (Lburp/Zmrn;Ljava/util/List;)Lburp/Zzy4;
    //   377: pop
    //   378: aload #4
    //   380: ifnull -> 523
    //   383: aload #8
    //   385: bipush #15
    //   387: anewarray java/lang/Class
    //   390: dup
    //   391: iconst_0
    //   392: ldc net/portswigger/Zpp
    //   394: aastore
    //   395: dup
    //   396: iconst_1
    //   397: ldc net/portswigger/Zph
    //   399: aastore
    //   400: dup
    //   401: iconst_2
    //   402: ldc net/portswigger/Zpc
    //   404: aastore
    //   405: dup
    //   406: iconst_3
    //   407: ldc net/portswigger/Zw9
    //   409: aastore
    //   410: dup
    //   411: iconst_4
    //   412: ldc net/portswigger/Zwx
    //   414: aastore
    //   415: dup
    //   416: iconst_5
    //   417: ldc net/portswigger/Zwy
    //   419: aastore
    //   420: dup
    //   421: bipush #6
    //   423: ldc net/portswigger/Zp0
    //   425: aastore
    //   426: dup
    //   427: bipush #7
    //   429: ldc net/portswigger/Zwi
    //   431: aastore
    //   432: dup
    //   433: bipush #8
    //   435: ldc net/portswigger/Zwa
    //   437: aastore
    //   438: dup
    //   439: bipush #9
    //   441: ldc net/portswigger/Zeq
    //   443: aastore
    //   444: dup
    //   445: bipush #10
    //   447: ldc net/portswigger/Ze0
    //   449: aastore
    //   450: dup
    //   451: bipush #11
    //   453: ldc net/portswigger/Zp_
    //   455: aastore
    //   456: dup
    //   457: bipush #12
    //   459: ldc net/portswigger/Zwh
    //   461: aastore
    //   462: dup
    //   463: bipush #13
    //   465: ldc net/portswigger/Ze4
    //   467: aastore
    //   468: dup
    //   469: bipush #14
    //   471: ldc net/portswigger/Zea
    //   473: aastore
    //   474: invokestatic Za : (Lnet/portswigger/Zld;[Ljava/lang/Class;)Z
    //   477: ifeq -> 494
    //   480: goto -> 487
    //   483: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   486: athrow
    //   487: goto -> 523
    //   490: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   493: athrow
    //   494: new burp/Ztuz
    //   497: dup
    //   498: sipush #19331
    //   501: sipush #14779
    //   504: invokestatic a : (II)Ljava/lang/String;
    //   507: iconst_1
    //   508: anewarray java/lang/Object
    //   511: dup
    //   512: iconst_0
    //   513: aload #8
    //   515: aastore
    //   516: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   519: invokespecial <init> : (Ljava/lang/String;)V
    //   522: athrow
    //   523: aload #4
    //   525: ifnull -> 223
    //   528: aload #6
    //   530: invokevirtual ZA : ()Lburp/Zsvm;
    //   533: areturn
    // Exception table:
    //   from	to	target	type
    //   260	286	289	burp/Ztuz
    //   308	342	345	burp/Ztuz
    //   364	480	483	burp/Ztuz
    //   383	490	490	burp/Ztuz
  }
  
  private static List<Zgd5> ZK(Zxv paramZxv) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Ze : ()Ljava/lang/String;
    //   11: aload_0
    //   12: invokevirtual ZK : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_3
    //   21: astore_1
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 111
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast net/portswigger/Zld
    //   40: astore #4
    //   42: aload #4
    //   44: instanceof net/portswigger/Zxk
    //   47: ifeq -> 73
    //   50: aload #4
    //   52: checkcast net/portswigger/Zxk
    //   55: astore #5
    //   57: aload_2
    //   58: aload #5
    //   60: invokestatic ZR : (Lnet/portswigger/Zxk;)Lburp/Zgd5;
    //   63: invokeinterface add : (Ljava/lang/Object;)Z
    //   68: pop
    //   69: aload_1
    //   70: ifnull -> 107
    //   73: aload #4
    //   75: instanceof net/portswigger/Zxa
    //   78: ifeq -> 107
    //   81: goto -> 88
    //   84: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   87: athrow
    //   88: aload #4
    //   90: checkcast net/portswigger/Zxa
    //   93: astore #6
    //   95: aload_2
    //   96: aload #6
    //   98: invokestatic ZR : (Lnet/portswigger/Zxa;)Ljava/util/List;
    //   101: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   106: pop
    //   107: aload_1
    //   108: ifnull -> 22
    //   111: aload_2
    //   112: areturn
    // Exception table:
    //   from	to	target	type
    //   57	81	84	burp/Ztuz
  }
  
  private static List<Zgd5> Zs(Zxv paramZxv, Set<String> paramSet) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Ze : ()Ljava/lang/String;
    //   11: aload_0
    //   12: invokevirtual ZK : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore #4
    //   22: astore_2
    //   23: aload #4
    //   25: invokeinterface hasNext : ()Z
    //   30: ifeq -> 194
    //   33: aload #4
    //   35: invokeinterface next : ()Ljava/lang/Object;
    //   40: checkcast net/portswigger/Zld
    //   43: astore #5
    //   45: aload #5
    //   47: instanceof net/portswigger/Zxk
    //   50: ifeq -> 104
    //   53: aload #5
    //   55: checkcast net/portswigger/Zxk
    //   58: astore #6
    //   60: aload #6
    //   62: invokestatic ZR : (Lnet/portswigger/Zxk;)Lburp/Zgd5;
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
    //   88: invokestatic Zz : (Ljava/util/Set;Ljava/lang/String;)V
    //   91: aload_3
    //   92: aload #8
    //   94: invokeinterface add : (Ljava/lang/Object;)Z
    //   99: pop
    //   100: aload_2
    //   101: ifnull -> 190
    //   104: aload #5
    //   106: instanceof net/portswigger/Zxa
    //   109: ifeq -> 190
    //   112: goto -> 119
    //   115: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   118: athrow
    //   119: aload #5
    //   121: checkcast net/portswigger/Zxa
    //   124: astore #7
    //   126: aload #7
    //   128: invokestatic ZR : (Lnet/portswigger/Zxa;)Ljava/util/List;
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
    //   191: ifnull -> 23
    //   194: aload_3
    //   195: areturn
    // Exception table:
    //   from	to	target	type
    //   91	112	115	burp/Ztuz
  }
  
  private static List<Zgd5> ZR(Zxa paramZxa) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Ze : ()Ljava/lang/String;
    //   11: aload_0
    //   12: invokevirtual ZK : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_3
    //   21: astore_1
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 201
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast net/portswigger/Zld
    //   40: astore #4
    //   42: aload #4
    //   44: instanceof net/portswigger/Zbt
    //   47: ifeq -> 92
    //   50: aload #4
    //   52: checkcast net/portswigger/Zbt
    //   55: astore #5
    //   57: aload_2
    //   58: aload #5
    //   60: <illegal opcode> apply : (Lnet/portswigger/Zbt;)Ljava/util/function/Function;
    //   65: invokestatic Zg : (Ljava/util/function/Function;)Lburp/Zzw9;
    //   68: aload_0
    //   69: invokevirtual ZN : ()Ljava/util/Optional;
    //   72: aconst_null
    //   73: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   76: checkcast java/lang/String
    //   79: invokevirtual Ze : (Ljava/lang/String;)Lburp/Zzw9;
    //   82: invokeinterface add : (Ljava/lang/Object;)Z
    //   87: pop
    //   88: aload_1
    //   89: ifnull -> 197
    //   92: aload #4
    //   94: instanceof net/portswigger/Zxl
    //   97: ifeq -> 149
    //   100: goto -> 107
    //   103: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   106: athrow
    //   107: aload #4
    //   109: checkcast net/portswigger/Zxl
    //   112: astore #6
    //   114: aload_2
    //   115: aload #6
    //   117: <illegal opcode> apply : (Lnet/portswigger/Zxl;)Ljava/util/function/Function;
    //   122: invokestatic Zf : (Ljava/util/function/Function;)Lburp/Zzw9;
    //   125: aload_0
    //   126: invokevirtual ZN : ()Ljava/util/Optional;
    //   129: aconst_null
    //   130: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   133: checkcast java/lang/String
    //   136: invokevirtual Ze : (Ljava/lang/String;)Lburp/Zzw9;
    //   139: invokeinterface add : (Ljava/lang/Object;)Z
    //   144: pop
    //   145: aload_1
    //   146: ifnull -> 197
    //   149: aload #4
    //   151: instanceof net/portswigger/Ze7
    //   154: ifne -> 197
    //   157: goto -> 164
    //   160: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   163: athrow
    //   164: new burp/Ztuz
    //   167: dup
    //   168: sipush #19340
    //   171: sipush #32019
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
    //   193: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   196: athrow
    //   197: aload_1
    //   198: ifnull -> 22
    //   201: aload_2
    //   202: areturn
    // Exception table:
    //   from	to	target	type
    //   57	100	103	burp/Ztuz
    //   114	157	160	burp/Ztuz
    //   149	193	193	burp/Ztuz
  }
  
  private static String ZA(Zzvx paramZzvx, Zbk paramZbk) {
    if (paramZbk instanceof Zh3) {
      Zh3 zh3 = (Zh3)paramZbk;
      return Zkbi.ZA(zh3).ZT(paramZzvx);
    } 
    if (paramZbk instanceof Zhm) {
      Zhm zhm = (Zhm)paramZbk;
      return Zkbi.Zw(zhm).ZT(paramZzvx);
    } 
    throw new Ztuz(a(19382, -18486).formatted(new Object[] { paramZbk }));
  }
  
  private static Zm3v<String> Zo(Zbk paramZbk) {
    if (paramZbk instanceof Zh3) {
      Zh3 zh3 = (Zh3)paramZbk;
      return Zkbi.ZA(zh3);
    } 
    if (paramZbk instanceof Zhm) {
      Zhm zhm = (Zhm)paramZbk;
      return Zkbi.Zw(zhm);
    } 
    throw new Ztuz(a(19351, 31516).formatted(new Object[] { paramZbk }));
  }
  
  private static Set<Zs66> ZN(Zdh paramZdh, Set<Zbv> paramSet) {
    try {
    
    } catch (Ztuz ztuz) {
      throw a(null);
    } 
    return (paramZdh != Zdh.PER_INSERTION_POINT) ? Collections.<Zs66>emptySet() : (Set<Zs66>)paramSet.stream().flatMap(Zl2a::lambda$convertIncludedInsertionPointTypes$6).collect(Collectors.toSet());
  }
  
  private static Zlmr Zr(Zbk paramZbk, Ze58 paramZe58) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: new java/util/ArrayList
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore #4
    //   17: invokestatic Ze : ()Ljava/lang/String;
    //   20: new java/util/ArrayList
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore #5
    //   29: astore_2
    //   30: aload_0
    //   31: invokevirtual ZK : ()Ljava/util/List;
    //   34: invokeinterface iterator : ()Ljava/util/Iterator;
    //   39: astore #6
    //   41: aload #6
    //   43: invokeinterface hasNext : ()Z
    //   48: ifeq -> 397
    //   51: aload #6
    //   53: invokeinterface next : ()Ljava/lang/Object;
    //   58: checkcast net/portswigger/Zld
    //   61: astore #7
    //   63: aload #7
    //   65: instanceof net/portswigger/Zbq
    //   68: ifne -> 86
    //   71: aload #7
    //   73: instanceof net/portswigger/Zb2
    //   76: ifeq -> 107
    //   79: goto -> 86
    //   82: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   85: athrow
    //   86: aload #5
    //   88: aload #7
    //   90: invokeinterface add : (Ljava/lang/Object;)Z
    //   95: pop
    //   96: aload_2
    //   97: ifnull -> 393
    //   100: goto -> 107
    //   103: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   106: athrow
    //   107: aload #7
    //   109: instanceof net/portswigger/Zxv
    //   112: ifeq -> 158
    //   115: goto -> 122
    //   118: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   121: athrow
    //   122: aload #7
    //   124: checkcast net/portswigger/Zxv
    //   127: astore #8
    //   129: aload_3
    //   130: new burp/Zzy4
    //   133: dup
    //   134: invokespecial <init> : ()V
    //   137: aload #8
    //   139: invokestatic ZK : (Lnet/portswigger/Zxv;)Ljava/util/List;
    //   142: invokevirtual ZT : (Ljava/util/List;)Lburp/Zzy4;
    //   145: invokevirtual ZA : ()Lburp/Zsvm;
    //   148: invokeinterface add : (Ljava/lang/Object;)Z
    //   153: pop
    //   154: aload_2
    //   155: ifnull -> 393
    //   158: aload #7
    //   160: instanceof net/portswigger/Zxh
    //   163: ifeq -> 227
    //   166: goto -> 173
    //   169: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   172: athrow
    //   173: aload #7
    //   175: checkcast net/portswigger/Zxh
    //   178: astore #9
    //   180: aload #9
    //   182: aload_1
    //   183: invokestatic Zr : (Lnet/portswigger/Zbk;Lburp/Ze58;)Lburp/Zlmr;
    //   186: astore #12
    //   188: aload_3
    //   189: new burp/Zzy4
    //   192: dup
    //   193: invokespecial <init> : ()V
    //   196: aload #12
    //   198: invokevirtual ZyK : ()Lburp/Zmrn;
    //   201: aload #12
    //   203: invokevirtual ZyQ : ()Ljava/util/List;
    //   206: aload #12
    //   208: invokevirtual ZyI : ()Ljava/util/List;
    //   211: invokevirtual Z_ : (Lburp/Zmrn;Ljava/util/List;Ljava/util/List;)Lburp/Zzy4;
    //   214: invokevirtual ZA : ()Lburp/Zsvm;
    //   217: invokeinterface add : (Ljava/lang/Object;)Z
    //   222: pop
    //   223: aload_2
    //   224: ifnull -> 393
    //   227: aload #7
    //   229: instanceof net/portswigger/Zxz
    //   232: ifeq -> 274
    //   235: goto -> 242
    //   238: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   241: athrow
    //   242: aload #7
    //   244: checkcast net/portswigger/Zxz
    //   247: astore #10
    //   249: aload #10
    //   251: aload_1
    //   252: invokestatic Zr : (Lnet/portswigger/Zbk;Lburp/Ze58;)Lburp/Zlmr;
    //   255: astore #12
    //   257: aload #4
    //   259: aload #12
    //   261: invokevirtual ZyQ : ()Ljava/util/List;
    //   264: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   269: pop
    //   270: aload_2
    //   271: ifnull -> 393
    //   274: aload #7
    //   276: instanceof net/portswigger/Zxr
    //   279: ifeq -> 313
    //   282: goto -> 289
    //   285: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   288: athrow
    //   289: aload #7
    //   291: checkcast net/portswigger/Zxr
    //   294: astore #11
    //   296: aload_3
    //   297: aload #11
    //   299: aload_1
    //   300: invokestatic Zs : (Lnet/portswigger/Zxr;Lburp/Ze58;)Lburp/Zsvm;
    //   303: invokeinterface add : (Ljava/lang/Object;)Z
    //   308: pop
    //   309: aload_2
    //   310: ifnull -> 393
    //   313: aload #7
    //   315: iconst_5
    //   316: anewarray java/lang/Class
    //   319: dup
    //   320: iconst_0
    //   321: ldc net/portswigger/Zp7
    //   323: aastore
    //   324: dup
    //   325: iconst_1
    //   326: ldc net/portswigger/Zpm
    //   328: aastore
    //   329: dup
    //   330: iconst_2
    //   331: ldc net/portswigger/Zwi
    //   333: aastore
    //   334: dup
    //   335: iconst_3
    //   336: ldc net/portswigger/Zwa
    //   338: aastore
    //   339: dup
    //   340: iconst_4
    //   341: ldc net/portswigger/Zpp
    //   343: aastore
    //   344: invokestatic Za : (Lnet/portswigger/Zld;[Ljava/lang/Class;)Z
    //   347: ifeq -> 364
    //   350: goto -> 357
    //   353: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   356: athrow
    //   357: goto -> 393
    //   360: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   363: athrow
    //   364: new burp/Ztuz
    //   367: dup
    //   368: sipush #19357
    //   371: sipush #-17499
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
    //   394: ifnull -> 41
    //   397: new burp/Zlmr
    //   400: dup
    //   401: aload #5
    //   403: invokestatic ZQ : (Ljava/util/List;)Lburp/Zmrn;
    //   406: aload_3
    //   407: aload #4
    //   409: invokespecial <init> : (Lburp/Zmrn;Ljava/util/List;Ljava/util/List;)V
    //   412: areturn
    // Exception table:
    //   from	to	target	type
    //   63	79	82	burp/Ztuz
    //   71	100	103	burp/Ztuz
    //   86	115	118	burp/Ztuz
    //   129	166	169	burp/Ztuz
    //   188	235	238	burp/Ztuz
    //   257	282	285	burp/Ztuz
    //   296	350	353	burp/Ztuz
    //   313	360	360	burp/Ztuz
  }
  
  private static Zmrn ZQ(List<Zld> paramList) {
    return ZA(ZH(paramList));
  }
  
  private static Deque<Zld> ZH(List<Zld> paramList) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Ze : ()Ljava/lang/String;
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
    //   31: checkcast net/portswigger/Zld
    //   34: astore #4
    //   36: aload #4
    //   38: instanceof net/portswigger/Zbq
    //   41: ifeq -> 104
    //   44: aload #4
    //   46: checkcast net/portswigger/Zbq
    //   49: astore #5
    //   51: aload #5
    //   53: ldc net/portswigger/Zwz
    //   55: invokevirtual ZZ : (Ljava/lang/Class;)Ljava/util/List;
    //   58: invokeinterface size : ()I
    //   63: ifle -> 104
    //   66: new net/portswigger/Zbq
    //   69: dup
    //   70: invokespecial <init> : ()V
    //   73: astore #6
    //   75: aload #5
    //   77: invokevirtual ZK : ()Ljava/util/List;
    //   80: invokestatic ZH : (Ljava/util/List;)Ljava/util/Deque;
    //   83: aload #6
    //   85: dup
    //   86: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   89: pop
    //   90: <illegal opcode> accept : (Lnet/portswigger/Zbq;)Ljava/util/function/Consumer;
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
    //   119: instanceof net/portswigger/Zb2
    //   122: ifeq -> 216
    //   125: aload #6
    //   127: checkcast net/portswigger/Zb2
    //   130: astore #5
    //   132: getstatic net/portswigger/Zkd.BOOL_AND : Lnet/portswigger/Zkd;
    //   135: aload #5
    //   137: invokevirtual Zj : ()Lnet/portswigger/Zld;
    //   140: invokeinterface Ze : ()Lnet/portswigger/Zkd;
    //   145: invokevirtual equals : (Ljava/lang/Object;)Z
    //   148: ifeq -> 216
    //   151: aload_2
    //   152: invokeinterface removeLast : ()Ljava/lang/Object;
    //   157: checkcast net/portswigger/Zld
    //   160: astore #6
    //   162: aload_2
    //   163: invokeinterface removeLast : ()Ljava/lang/Object;
    //   168: checkcast net/portswigger/Zld
    //   171: astore #7
    //   173: new net/portswigger/Zbq
    //   176: dup
    //   177: invokespecial <init> : ()V
    //   180: astore #8
    //   182: aload #8
    //   184: aload #7
    //   186: invokevirtual ZO : (Lnet/portswigger/Zld;)V
    //   189: aload #8
    //   191: aload #6
    //   193: invokevirtual ZO : (Lnet/portswigger/Zld;)V
    //   196: aload #8
    //   198: aload #4
    //   200: invokevirtual ZO : (Lnet/portswigger/Zld;)V
    //   203: aload_2
    //   204: aload #8
    //   206: invokeinterface add : (Ljava/lang/Object;)Z
    //   211: pop
    //   212: aload_1
    //   213: ifnull -> 232
    //   216: aload_2
    //   217: aload #4
    //   219: invokeinterface add : (Ljava/lang/Object;)Z
    //   224: pop
    //   225: goto -> 232
    //   228: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   231: athrow
    //   232: iinc #3, 1
    //   235: aload_1
    //   236: ifnull -> 14
    //   239: aload_2
    //   240: areturn
    // Exception table:
    //   from	to	target	type
    //   182	225	228	burp/Ztuz
  }
  
  private static Zmrn ZA(Iterable<Zld> paramIterable) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: invokestatic Ze : ()Ljava/lang/String;
    //   5: aload_0
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore_3
    //   12: astore_1
    //   13: aload_3
    //   14: invokeinterface hasNext : ()Z
    //   19: ifeq -> 427
    //   22: aload_3
    //   23: invokeinterface next : ()Ljava/lang/Object;
    //   28: checkcast net/portswigger/Zld
    //   31: astore #4
    //   33: aload #4
    //   35: instanceof net/portswigger/Zbq
    //   38: ifeq -> 122
    //   41: aload #4
    //   43: checkcast net/portswigger/Zbq
    //   46: astore #5
    //   48: aload #5
    //   50: invokestatic Zp : (Lnet/portswigger/Zbq;)Lnet/portswigger/Zld;
    //   53: astore #7
    //   55: aload #7
    //   57: instanceof net/portswigger/Zbd
    //   60: ifeq -> 80
    //   63: aload #7
    //   65: checkcast net/portswigger/Zbd
    //   68: astore #8
    //   70: aload #8
    //   72: invokestatic Zq : (Lnet/portswigger/Zbd;)Lburp/Zmrn;
    //   75: astore_2
    //   76: aload_1
    //   77: ifnull -> 118
    //   80: aload #7
    //   82: instanceof net/portswigger/Zbq
    //   85: ifeq -> 112
    //   88: goto -> 95
    //   91: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   94: athrow
    //   95: aload #5
    //   97: invokestatic ZH : (Lnet/portswigger/Zld;)Ljava/util/List;
    //   100: astore #9
    //   102: aload #9
    //   104: invokestatic ZA : (Ljava/lang/Iterable;)Lburp/Zmrn;
    //   107: astore_2
    //   108: aload_1
    //   109: ifnull -> 118
    //   112: aload #5
    //   114: invokestatic Za : (Lnet/portswigger/Zbq;)Lburp/Zmrn;
    //   117: astore_2
    //   118: aload_1
    //   119: ifnull -> 423
    //   122: aload #4
    //   124: instanceof net/portswigger/Zb2
    //   127: ifeq -> 423
    //   130: goto -> 137
    //   133: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   136: athrow
    //   137: aload #4
    //   139: checkcast net/portswigger/Zb2
    //   142: astore #6
    //   144: aload_2
    //   145: ifnonnull -> 169
    //   148: new burp/Ztuz
    //   151: dup
    //   152: sipush #19383
    //   155: sipush #29509
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: invokespecial <init> : (Ljava/lang/String;)V
    //   164: athrow
    //   165: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   168: athrow
    //   169: aload_3
    //   170: invokeinterface hasNext : ()Z
    //   175: ifne -> 199
    //   178: new burp/Ztuz
    //   181: dup
    //   182: sipush #19342
    //   185: sipush #3473
    //   188: invokestatic a : (II)Ljava/lang/String;
    //   191: invokespecial <init> : (Ljava/lang/String;)V
    //   194: athrow
    //   195: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   198: athrow
    //   199: aload_3
    //   200: invokeinterface next : ()Ljava/lang/Object;
    //   205: checkcast net/portswigger/Zld
    //   208: astore #7
    //   210: aload #7
    //   212: instanceof net/portswigger/Zbq
    //   215: ifeq -> 302
    //   218: aload #7
    //   220: checkcast net/portswigger/Zbq
    //   223: astore #9
    //   225: aload #9
    //   227: invokestatic Zp : (Lnet/portswigger/Zbq;)Lnet/portswigger/Zld;
    //   230: astore #10
    //   232: aload #10
    //   234: instanceof net/portswigger/Zbd
    //   237: ifeq -> 258
    //   240: aload #10
    //   242: checkcast net/portswigger/Zbd
    //   245: astore #11
    //   247: aload #11
    //   249: invokestatic Zq : (Lnet/portswigger/Zbd;)Lburp/Zmrn;
    //   252: astore #8
    //   254: aload_1
    //   255: ifnull -> 298
    //   258: aload #10
    //   260: instanceof net/portswigger/Zbq
    //   263: ifeq -> 291
    //   266: goto -> 273
    //   269: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   272: athrow
    //   273: aload #9
    //   275: invokestatic ZH : (Lnet/portswigger/Zld;)Ljava/util/List;
    //   278: astore #12
    //   280: aload #12
    //   282: invokestatic ZA : (Ljava/lang/Iterable;)Lburp/Zmrn;
    //   285: astore #8
    //   287: aload_1
    //   288: ifnull -> 298
    //   291: aload #9
    //   293: invokestatic Za : (Lnet/portswigger/Zbq;)Lburp/Zmrn;
    //   296: astore #8
    //   298: aload_1
    //   299: ifnull -> 323
    //   302: new burp/Ztuz
    //   305: dup
    //   306: sipush #19328
    //   309: sipush #10838
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: invokespecial <init> : (Ljava/lang/String;)V
    //   318: athrow
    //   319: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   322: athrow
    //   323: aload #6
    //   325: invokevirtual Zj : ()Lnet/portswigger/Zld;
    //   328: invokeinterface Ze : ()Lnet/portswigger/Zkd;
    //   333: astore #10
    //   335: getstatic net/portswigger/Zkd.BOOL_AND : Lnet/portswigger/Zkd;
    //   338: aload #10
    //   340: invokevirtual equals : (Ljava/lang/Object;)Z
    //   343: ifeq -> 359
    //   346: aload_2
    //   347: aload #8
    //   349: invokeinterface Zl : (Lburp/Zmrn;)Lburp/Zmrn;
    //   354: astore_2
    //   355: aload_1
    //   356: ifnull -> 423
    //   359: getstatic net/portswigger/Zkd.BOOL_OR : Lnet/portswigger/Zkd;
    //   362: aload #10
    //   364: invokevirtual equals : (Ljava/lang/Object;)Z
    //   367: ifeq -> 390
    //   370: goto -> 377
    //   373: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   376: athrow
    //   377: aload_2
    //   378: aload #8
    //   380: invokeinterface ZZ : (Lburp/Zmrn;)Lburp/Zmrn;
    //   385: astore_2
    //   386: aload_1
    //   387: ifnull -> 423
    //   390: new burp/Ztuz
    //   393: dup
    //   394: sipush #19335
    //   397: sipush #-13573
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
    //   419: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   422: athrow
    //   423: aload_1
    //   424: ifnull -> 13
    //   427: aload_2
    //   428: areturn
    // Exception table:
    //   from	to	target	type
    //   76	88	91	burp/Ztuz
    //   118	130	133	burp/Ztuz
    //   144	165	165	burp/Ztuz
    //   169	195	195	burp/Ztuz
    //   254	266	269	burp/Ztuz
    //   298	319	319	burp/Ztuz
    //   355	370	373	burp/Ztuz
    //   386	419	419	burp/Ztuz
  }
  
  private static Zld Zp(Zbq paramZbq) {
    Zld zld = paramZbq.Zu(0);
    if (zld instanceof net.portswigger.Zwz)
      zld = paramZbq.Zu(1); 
    return zld;
  }
  
  private static List<Zld> ZH(Zld paramZld) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Ze : ()Ljava/lang/String;
    //   11: aload_0
    //   12: invokeinterface ZK : ()Ljava/util/List;
    //   17: invokeinterface iterator : ()Ljava/util/Iterator;
    //   22: astore_3
    //   23: astore_1
    //   24: aload_3
    //   25: invokeinterface hasNext : ()Z
    //   30: ifeq -> 171
    //   33: aload_3
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: checkcast net/portswigger/Zld
    //   42: astore #4
    //   44: aload #4
    //   46: instanceof net/portswigger/Zbq
    //   49: ifne -> 67
    //   52: aload #4
    //   54: instanceof net/portswigger/Zb2
    //   57: ifeq -> 87
    //   60: goto -> 67
    //   63: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   66: athrow
    //   67: aload_2
    //   68: aload #4
    //   70: invokeinterface add : (Ljava/lang/Object;)Z
    //   75: pop
    //   76: aload_1
    //   77: ifnull -> 167
    //   80: goto -> 87
    //   83: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   86: athrow
    //   87: aload #4
    //   89: iconst_2
    //   90: anewarray java/lang/Class
    //   93: dup
    //   94: iconst_0
    //   95: ldc net/portswigger/Zwz
    //   97: aastore
    //   98: dup
    //   99: iconst_1
    //   100: ldc net/portswigger/Ze5
    //   102: aastore
    //   103: invokestatic Za : (Lnet/portswigger/Zld;[Ljava/lang/Class;)Z
    //   106: ifeq -> 123
    //   109: goto -> 116
    //   112: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   115: athrow
    //   116: goto -> 167
    //   119: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   122: athrow
    //   123: aload #4
    //   125: instanceof net/portswigger/Zbd
    //   128: ifeq -> 138
    //   131: goto -> 167
    //   134: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   137: athrow
    //   138: new burp/Ztuz
    //   141: dup
    //   142: sipush #19330
    //   145: sipush #-16921
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
    //   168: ifnull -> 24
    //   171: aload_2
    //   172: areturn
    // Exception table:
    //   from	to	target	type
    //   44	60	63	burp/Ztuz
    //   52	80	83	burp/Ztuz
    //   67	109	112	burp/Ztuz
    //   87	119	119	burp/Ztuz
    //   123	134	134	burp/Ztuz
  }
  
  private static Zmrn Zq(Zbd paramZbd) {
    Zld zld = paramZbd.ZI();
    try {
      if (zld.Ze() != Zkd.OPEN_BRACKET)
        throw new Ztuz(a(19343, 1197).formatted(new Object[] { zld })); 
    } catch (Ztuz ztuz) {
      throw a(null);
    } 
    zld = zld.ZI();
    if (zld instanceof Zbq) {
      Zbq zbq = (Zbq)zld;
      Zld zld1 = zld.ZI();
      try {
        if (zld1 == null)
          return Zmrn.Zf(Za(zbq)); 
      } catch (Ztuz ztuz) {
        throw a(null);
      } 
      List<Zld> list = ZH(zbq.Zo());
      return Zmrn.Zf(ZA(list));
    } 
    throw new Ztuz(a(19354, 3627).formatted(new Object[] { zld }));
  }
  
  private static Zsvm Zs(Zxr paramZxr, Ze58 paramZe58) {
    // Byte code:
    //   0: aload_1
    //   1: <illegal opcode> Zm : (Lburp/Ze58;)Lburp/Zm3v;
    //   6: astore_3
    //   7: iconst_0
    //   8: istore #4
    //   10: invokestatic Ze : ()Ljava/lang/String;
    //   13: iconst_0
    //   14: istore #5
    //   16: iconst_0
    //   17: istore #6
    //   19: aconst_null
    //   20: astore #7
    //   22: aconst_null
    //   23: astore #8
    //   25: aload_0
    //   26: invokevirtual ZK : ()Ljava/util/List;
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #9
    //   36: astore_2
    //   37: aload #9
    //   39: invokeinterface hasNext : ()Z
    //   44: ifeq -> 434
    //   47: aload #9
    //   49: invokeinterface next : ()Ljava/lang/Object;
    //   54: checkcast net/portswigger/Zld
    //   57: astore #10
    //   59: aload #10
    //   61: instanceof net/portswigger/Zxc
    //   64: ifeq -> 86
    //   67: aload #10
    //   69: checkcast net/portswigger/Zxc
    //   72: astore #11
    //   74: aload #11
    //   76: <illegal opcode> Zm : (Lnet/portswigger/Zxc;)Lburp/Zm3v;
    //   81: astore_3
    //   82: aload_2
    //   83: ifnull -> 430
    //   86: aload #10
    //   88: instanceof net/portswigger/Zxp
    //   91: ifeq -> 185
    //   94: goto -> 101
    //   97: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   100: athrow
    //   101: aload #10
    //   103: checkcast net/portswigger/Zxp
    //   106: astore #12
    //   108: getstatic burp/Zgvj.Zn : [I
    //   111: aload #12
    //   113: invokevirtual ZG : ()Lnet/portswigger/Zej;
    //   116: invokevirtual ordinal : ()I
    //   119: iaload
    //   120: tableswitch default -> 152, 1 -> 166, 2 -> 170, 3 -> 174, 4 -> 178
    //   152: new java/lang/MatchException
    //   155: dup
    //   156: aconst_null
    //   157: aconst_null
    //   158: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   161: athrow
    //   162: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   165: athrow
    //   166: iconst_1
    //   167: goto -> 179
    //   170: iconst_2
    //   171: goto -> 179
    //   174: iconst_3
    //   175: goto -> 179
    //   178: iconst_4
    //   179: istore #4
    //   181: aload_2
    //   182: ifnull -> 430
    //   185: aload #10
    //   187: instanceof net/portswigger/Zxs
    //   190: ifeq -> 273
    //   193: goto -> 200
    //   196: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   199: athrow
    //   200: aload #10
    //   202: checkcast net/portswigger/Zxs
    //   205: astore #13
    //   207: getstatic burp/Zgvj.Zr : [I
    //   210: aload #13
    //   212: invokevirtual ZO : ()Lnet/portswigger/Zkh;
    //   215: invokevirtual ordinal : ()I
    //   218: iaload
    //   219: tableswitch default -> 244, 1 -> 258, 2 -> 262, 3 -> 266
    //   244: new java/lang/MatchException
    //   247: dup
    //   248: aconst_null
    //   249: aconst_null
    //   250: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   253: athrow
    //   254: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   257: athrow
    //   258: iconst_1
    //   259: goto -> 267
    //   262: iconst_2
    //   263: goto -> 267
    //   266: iconst_3
    //   267: istore #5
    //   269: aload_2
    //   270: ifnull -> 430
    //   273: aload #10
    //   275: instanceof net/portswigger/Zxn
    //   278: ifeq -> 308
    //   281: goto -> 288
    //   284: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   287: athrow
    //   288: aload #10
    //   290: checkcast net/portswigger/Zxn
    //   293: astore #14
    //   295: aload #14
    //   297: <illegal opcode> Zm : (Lnet/portswigger/Zxn;)Lburp/Zm3v;
    //   302: astore #7
    //   304: aload_2
    //   305: ifnull -> 430
    //   308: aload #10
    //   310: instanceof net/portswigger/Zx3
    //   313: ifeq -> 343
    //   316: goto -> 323
    //   319: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   322: athrow
    //   323: aload #10
    //   325: checkcast net/portswigger/Zx3
    //   328: astore #15
    //   330: aload #15
    //   332: <illegal opcode> Zm : (Lnet/portswigger/Zx3;)Lburp/Zm3v;
    //   337: astore #8
    //   339: aload_2
    //   340: ifnull -> 430
    //   343: aload #10
    //   345: instanceof net/portswigger/Ze9
    //   348: ifeq -> 365
    //   351: goto -> 358
    //   354: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   357: athrow
    //   358: iconst_1
    //   359: istore #6
    //   361: aload_2
    //   362: ifnull -> 430
    //   365: aload #10
    //   367: iconst_2
    //   368: anewarray java/lang/Class
    //   371: dup
    //   372: iconst_0
    //   373: ldc net/portswigger/Zw7
    //   375: aastore
    //   376: dup
    //   377: iconst_1
    //   378: ldc net/portswigger/Ze8
    //   380: aastore
    //   381: invokestatic Za : (Lnet/portswigger/Zld;[Ljava/lang/Class;)Z
    //   384: ifeq -> 401
    //   387: goto -> 394
    //   390: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   393: athrow
    //   394: goto -> 430
    //   397: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   400: athrow
    //   401: new burp/Ztuz
    //   404: dup
    //   405: sipush #19355
    //   408: sipush #14792
    //   411: invokestatic a : (II)Ljava/lang/String;
    //   414: iconst_1
    //   415: anewarray java/lang/Object
    //   418: dup
    //   419: iconst_0
    //   420: aload #10
    //   422: aastore
    //   423: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   426: invokespecial <init> : (Ljava/lang/String;)V
    //   429: athrow
    //   430: aload_2
    //   431: ifnull -> 37
    //   434: new burp/Ztz1
    //   437: dup
    //   438: invokespecial <init> : ()V
    //   441: getstatic burp/Zzu2.BCHECK_GENERATED : Lburp/Zzu2;
    //   444: invokevirtual Zc : (Lburp/Zzu2;)Lburp/Zsvb;
    //   447: getstatic burp/Zgv3.V2_BETA : Lburp/Zgv3;
    //   450: invokevirtual ZM : (Lburp/Zgv3;)Lburp/Zsvb;
    //   453: aload_3
    //   454: invokevirtual Zu : (Lburp/Zm3v;)Lburp/Zsvb;
    //   457: aload #8
    //   459: invokevirtual ZX : (Lburp/Zm3v;)Lburp/Zsvb;
    //   462: aload #7
    //   464: invokevirtual ZE : (Lburp/Zm3v;)Lburp/Zsvb;
    //   467: iload #4
    //   469: invokevirtual ZQ : (B)Lburp/Zsvb;
    //   472: iload #5
    //   474: invokevirtual ZF : (B)Lburp/Zsvb;
    //   477: iload #6
    //   479: invokevirtual ZN : (Z)Lburp/Zsvm;
    //   482: areturn
    // Exception table:
    //   from	to	target	type
    //   82	94	97	burp/Ztuz
    //   108	162	162	burp/Ztuz
    //   181	193	196	burp/Ztuz
    //   207	254	254	burp/Ztuz
    //   269	281	284	burp/Ztuz
    //   304	316	319	burp/Ztuz
    //   339	351	354	burp/Ztuz
    //   361	387	390	burp/Ztuz
    //   365	397	397	burp/Ztuz
  }
  
  private static Zmrn Za(Zbq paramZbq) {
    // Byte code:
    //   0: invokestatic Ze : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: iconst_0
    //   6: invokevirtual Zu : (I)Lnet/portswigger/Zld;
    //   9: astore_2
    //   10: aload_2
    //   11: instanceof net/portswigger/Zbd
    //   14: ifeq -> 27
    //   17: aload_2
    //   18: checkcast net/portswigger/Zbd
    //   21: astore_3
    //   22: aload_3
    //   23: invokestatic Zq : (Lnet/portswigger/Zbd;)Lburp/Zmrn;
    //   26: areturn
    //   27: aload_2
    //   28: instanceof net/portswigger/Zwz
    //   31: ifeq -> 40
    //   34: aload_0
    //   35: iconst_1
    //   36: invokevirtual Zu : (I)Lnet/portswigger/Zld;
    //   39: astore_2
    //   40: aload_2
    //   41: instanceof net/portswigger/Zbi
    //   44: ifeq -> 692
    //   47: aload_2
    //   48: checkcast net/portswigger/Zbi
    //   51: astore_3
    //   52: aload_3
    //   53: invokevirtual Zj : ()Lnet/portswigger/Zld;
    //   56: astore #4
    //   58: aload #4
    //   60: instanceof net/portswigger/Zhs
    //   63: ifeq -> 304
    //   66: aload #4
    //   68: checkcast net/portswigger/Zhs
    //   71: astore #5
    //   73: aload_3
    //   74: iconst_1
    //   75: invokevirtual Zu : (I)Lnet/portswigger/Zld;
    //   78: invokeinterface Ze : ()Lnet/portswigger/Zkd;
    //   83: astore #7
    //   85: aload_3
    //   86: iconst_2
    //   87: invokevirtual Zu : (I)Lnet/portswigger/Zld;
    //   90: astore #8
    //   92: aload #5
    //   94: aload #7
    //   96: invokestatic Ze : (Lnet/portswigger/Zld;Lnet/portswigger/Zkd;)Lburp/Zeqj;
    //   99: astore #9
    //   101: aload #8
    //   103: aload #7
    //   105: invokestatic Ze : (Lnet/portswigger/Zld;Lnet/portswigger/Zkd;)Lburp/Zeqj;
    //   108: astore #10
    //   110: aload #9
    //   112: instanceof burp/Zm0j
    //   115: ifne -> 126
    //   118: iconst_1
    //   119: goto -> 127
    //   122: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   125: athrow
    //   126: iconst_0
    //   127: istore #11
    //   129: getstatic burp/Zgvj.Zc : [I
    //   132: aload #7
    //   134: invokevirtual ordinal : ()I
    //   137: iaload
    //   138: tableswitch default -> 274, 1 -> 168, 2 -> 210, 3 -> 245, 4 -> 258
    //   168: iload #11
    //   170: ifeq -> 197
    //   173: goto -> 180
    //   176: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   179: athrow
    //   180: aload #10
    //   182: invokestatic Zs : (Lburp/Zeqj;)Lburp/Zee_;
    //   185: aload #9
    //   187: invokevirtual Zt : (Lburp/Zeqj;)Lburp/Zmrn;
    //   190: goto -> 303
    //   193: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
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
    //   228: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
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
    //   274: new burp/Ztuz
    //   277: dup
    //   278: sipush #19358
    //   281: sipush #1727
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
    //   306: instanceof net/portswigger/Zbr
    //   309: ifeq -> 692
    //   312: aload #4
    //   314: checkcast net/portswigger/Zbr
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
    //   390: sipush #19349
    //   393: sipush #-15610
    //   396: invokestatic a : (II)Ljava/lang/String;
    //   399: invokevirtual equals : (Ljava/lang/Object;)Z
    //   402: ifeq -> 539
    //   405: goto -> 412
    //   408: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   411: athrow
    //   412: iconst_0
    //   413: istore #9
    //   415: aload_1
    //   416: ifnull -> 539
    //   419: aload #8
    //   421: sipush #19344
    //   424: sipush #26258
    //   427: invokestatic a : (II)Ljava/lang/String;
    //   430: invokevirtual equals : (Ljava/lang/Object;)Z
    //   433: ifeq -> 539
    //   436: goto -> 443
    //   439: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   442: athrow
    //   443: iconst_1
    //   444: istore #9
    //   446: aload_1
    //   447: ifnull -> 539
    //   450: aload #8
    //   452: sipush #19338
    //   455: sipush #-10767
    //   458: invokestatic a : (II)Ljava/lang/String;
    //   461: invokevirtual equals : (Ljava/lang/Object;)Z
    //   464: ifeq -> 539
    //   467: goto -> 474
    //   470: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   473: athrow
    //   474: iconst_2
    //   475: istore #9
    //   477: aload_1
    //   478: ifnull -> 539
    //   481: aload #8
    //   483: sipush #19346
    //   486: sipush #-16500
    //   489: invokestatic a : (II)Ljava/lang/String;
    //   492: invokevirtual equals : (Ljava/lang/Object;)Z
    //   495: ifeq -> 539
    //   498: goto -> 505
    //   501: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   504: athrow
    //   505: iconst_3
    //   506: istore #9
    //   508: aload_1
    //   509: ifnull -> 539
    //   512: aload #8
    //   514: sipush #19356
    //   517: sipush #30112
    //   520: invokestatic a : (II)Ljava/lang/String;
    //   523: invokevirtual equals : (Ljava/lang/Object;)Z
    //   526: ifeq -> 539
    //   529: goto -> 536
    //   532: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
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
    //   595: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
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
    //   662: new burp/Ztuz
    //   665: dup
    //   666: sipush #19348
    //   669: sipush #-6430
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
    //   692: new burp/Ztuz
    //   695: dup
    //   696: sipush #19336
    //   699: sipush #15259
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
    //   110	122	122	burp/Ztuz
    //   129	173	176	burp/Ztuz
    //   168	193	193	burp/Ztuz
    //   210	228	228	burp/Ztuz
    //   333	405	408	burp/Ztuz
    //   415	436	439	burp/Ztuz
    //   446	467	470	burp/Ztuz
    //   477	498	501	burp/Ztuz
    //   508	529	532	burp/Ztuz
    //   539	595	595	burp/Ztuz
  }
  
  private static Zeqj Ze(Zld paramZld, Zkd paramZkd) {
    try {
    
    } catch (Ztuz ztuz) {
      throw a(null);
    } 
    Zld zld = (paramZld instanceof net.portswigger.Zhs) ? paramZld.Zu(0) : paramZld;
    if (zld instanceof Zh3) {
      Zh3 zh3 = (Zh3)zld;
      Object object = ((Zhn)zh3.Zu(1)).ZT();
      if (object instanceof Zhc) {
        Zhc zhc = (Zhc)object;
        if (paramZkd == Zkd.DIFFERS_FROM_KEY) {
          String str = zhc.Zv();
          if (str.endsWith(a(19333, -2929)))
            str = str.substring(0, str.length() - a(19334, 23452).length()); 
          try {
            if (str.contains("."))
              throw new Ze4s(str); 
          } catch (Ztuz ztuz) {
            throw a(null);
          } 
          return Zeqj.Zx(str);
        } 
        return Zkbi.ZM(zhc);
      } 
      return Zeqj.ZA(Zkbi.ZA(zh3));
    } 
    if (zld instanceof Zhm) {
      Zhm zhm = (Zhm)zld;
      try {
        if (paramZkd == Zkd.DIFFERS_FROM_KEY)
          throw new Ze4s(zhm.toString()); 
      } catch (Ztuz ztuz) {
        throw a(null);
      } 
      return Zeqj.ZA(Zkbi.Zw(zhm));
    } 
    throw new Ztuz(a(19345, -14550).formatted(new Object[] { zld }));
  }
  
  private static Zgd5 ZR(Zxk paramZxk) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZN : ()Ljava/util/Optional;
    //   4: aconst_null
    //   5: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   8: checkcast java/lang/String
    //   11: astore_2
    //   12: new burp/Zzuy
    //   15: dup
    //   16: aload_2
    //   17: invokespecial <init> : (Ljava/lang/String;)V
    //   20: astore_3
    //   21: invokestatic Ze : ()Ljava/lang/String;
    //   24: aload_0
    //   25: invokevirtual ZK : ()Ljava/util/List;
    //   28: invokeinterface iterator : ()Ljava/util/Iterator;
    //   33: astore #4
    //   35: astore_1
    //   36: aload #4
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 994
    //   46: aload #4
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast net/portswigger/Zld
    //   56: astore #5
    //   58: aload #5
    //   60: instanceof net/portswigger/Zxi
    //   63: ifeq -> 880
    //   66: aload #5
    //   68: checkcast net/portswigger/Zxi
    //   71: astore #6
    //   73: aload #6
    //   75: ldc net/portswigger/Zxi
    //   77: invokevirtual ZL : (Ljava/lang/Class;)Lnet/portswigger/Zld;
    //   80: checkcast net/portswigger/Zxi
    //   83: astore #8
    //   85: aload #8
    //   87: invokevirtual ZO : ()Lnet/portswigger/Zx6;
    //   90: astore #9
    //   92: aload #9
    //   94: ifnonnull -> 105
    //   97: aconst_null
    //   98: goto -> 110
    //   101: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   104: athrow
    //   105: aload #9
    //   107: invokevirtual ZQ : ()Ljava/lang/Object;
    //   110: astore #10
    //   112: aload #8
    //   114: invokevirtual ZB : ()Lnet/portswigger/Zbo;
    //   117: astore #11
    //   119: aload #8
    //   121: instanceof net/portswigger/Zxd
    //   124: ifeq -> 343
    //   127: getstatic burp/Zgvj.Zs : [I
    //   130: aload #11
    //   132: invokevirtual ordinal : ()I
    //   135: iaload
    //   136: tableswitch default -> 310, 1 -> 180, 2 -> 199, 3 -> 218, 4 -> 237, 5 -> 256, 6 -> 283
    //   176: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   179: athrow
    //   180: aload_3
    //   181: invokevirtual ZK : ()Lburp/Zrjc;
    //   184: invokevirtual Zx : ()Lburp/Zm6k;
    //   187: pop
    //   188: aload_1
    //   189: ifnull -> 876
    //   192: goto -> 199
    //   195: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   198: athrow
    //   199: aload_3
    //   200: invokevirtual ZI : ()Lburp/Zrjc;
    //   203: invokevirtual Zx : ()Lburp/Zm6k;
    //   206: pop
    //   207: aload_1
    //   208: ifnull -> 876
    //   211: goto -> 218
    //   214: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   217: athrow
    //   218: aload_3
    //   219: invokevirtual Zl : ()Lburp/Zrjc;
    //   222: invokevirtual Zx : ()Lburp/Zm6k;
    //   225: pop
    //   226: aload_1
    //   227: ifnull -> 876
    //   230: goto -> 237
    //   233: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   236: athrow
    //   237: aload_3
    //   238: invokevirtual Zb : ()Lburp/Zrjc;
    //   241: invokevirtual Zx : ()Lburp/Zm6k;
    //   244: pop
    //   245: aload_1
    //   246: ifnull -> 876
    //   249: goto -> 256
    //   252: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   255: athrow
    //   256: aload #10
    //   258: checkcast java/util/List
    //   261: aload_3
    //   262: <illegal opcode> accept : (Lburp/Zzuy;)Ljava/util/function/Consumer;
    //   267: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   272: aload_1
    //   273: ifnull -> 876
    //   276: goto -> 283
    //   279: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   282: athrow
    //   283: aload #10
    //   285: checkcast java/util/List
    //   288: aload_3
    //   289: <illegal opcode> accept : (Lburp/Zzuy;)Ljava/util/function/Consumer;
    //   294: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   299: aload_1
    //   300: ifnull -> 876
    //   303: goto -> 310
    //   306: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   309: athrow
    //   310: new burp/Ztuz
    //   313: dup
    //   314: sipush #19347
    //   317: sipush #-20457
    //   320: invokestatic a : (II)Ljava/lang/String;
    //   323: iconst_1
    //   324: anewarray java/lang/Object
    //   327: dup
    //   328: iconst_0
    //   329: aload #11
    //   331: aastore
    //   332: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   335: invokespecial <init> : (Ljava/lang/String;)V
    //   338: athrow
    //   339: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   342: athrow
    //   343: aload #8
    //   345: instanceof net/portswigger/Zxq
    //   348: ifeq -> 595
    //   351: getstatic burp/Zgvj.Zs : [I
    //   354: aload #11
    //   356: invokevirtual ordinal : ()I
    //   359: iaload
    //   360: tableswitch default -> 562, 1 -> 404, 2 -> 430, 3 -> 456, 4 -> 482, 5 -> 508, 6 -> 535
    //   400: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   403: athrow
    //   404: aload_3
    //   405: invokevirtual ZK : ()Lburp/Zrjc;
    //   408: aload #10
    //   410: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   415: invokevirtual Zj : (Lburp/Zm3v;)Lburp/Zm6k;
    //   418: pop
    //   419: aload_1
    //   420: ifnull -> 876
    //   423: goto -> 430
    //   426: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   429: athrow
    //   430: aload_3
    //   431: invokevirtual ZI : ()Lburp/Zrjc;
    //   434: aload #10
    //   436: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   441: invokevirtual Zj : (Lburp/Zm3v;)Lburp/Zm6k;
    //   444: pop
    //   445: aload_1
    //   446: ifnull -> 876
    //   449: goto -> 456
    //   452: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   455: athrow
    //   456: aload_3
    //   457: invokevirtual Zl : ()Lburp/Zrjc;
    //   460: aload #10
    //   462: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   467: invokevirtual Zj : (Lburp/Zm3v;)Lburp/Zm6k;
    //   470: pop
    //   471: aload_1
    //   472: ifnull -> 876
    //   475: goto -> 482
    //   478: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   481: athrow
    //   482: aload_3
    //   483: invokevirtual Zb : ()Lburp/Zrjc;
    //   486: aload #10
    //   488: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   493: invokevirtual Zj : (Lburp/Zm3v;)Lburp/Zm6k;
    //   496: pop
    //   497: aload_1
    //   498: ifnull -> 876
    //   501: goto -> 508
    //   504: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   507: athrow
    //   508: aload #10
    //   510: checkcast java/util/List
    //   513: aload_3
    //   514: <illegal opcode> accept : (Lburp/Zzuy;)Ljava/util/function/Consumer;
    //   519: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   524: aload_1
    //   525: ifnull -> 876
    //   528: goto -> 535
    //   531: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   534: athrow
    //   535: aload #10
    //   537: checkcast java/util/List
    //   540: aload_3
    //   541: <illegal opcode> accept : (Lburp/Zzuy;)Ljava/util/function/Consumer;
    //   546: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   551: aload_1
    //   552: ifnull -> 876
    //   555: goto -> 562
    //   558: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   561: athrow
    //   562: new burp/Ztuz
    //   565: dup
    //   566: sipush #19352
    //   569: sipush #-1475
    //   572: invokestatic a : (II)Ljava/lang/String;
    //   575: iconst_1
    //   576: anewarray java/lang/Object
    //   579: dup
    //   580: iconst_0
    //   581: aload #11
    //   583: aastore
    //   584: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   587: invokespecial <init> : (Ljava/lang/String;)V
    //   590: athrow
    //   591: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   594: athrow
    //   595: aload #8
    //   597: instanceof net/portswigger/Zx2
    //   600: ifeq -> 847
    //   603: getstatic burp/Zgvj.Zs : [I
    //   606: aload #11
    //   608: invokevirtual ordinal : ()I
    //   611: iaload
    //   612: tableswitch default -> 814, 1 -> 656, 2 -> 682, 3 -> 708, 4 -> 734, 5 -> 760, 6 -> 787
    //   652: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   655: athrow
    //   656: aload_3
    //   657: invokevirtual ZK : ()Lburp/Zrjc;
    //   660: aload #10
    //   662: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   667: invokevirtual Zd : (Lburp/Zm3v;)Lburp/Zm6k;
    //   670: pop
    //   671: aload_1
    //   672: ifnull -> 876
    //   675: goto -> 682
    //   678: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   681: athrow
    //   682: aload_3
    //   683: invokevirtual ZI : ()Lburp/Zrjc;
    //   686: aload #10
    //   688: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   693: invokevirtual Zd : (Lburp/Zm3v;)Lburp/Zm6k;
    //   696: pop
    //   697: aload_1
    //   698: ifnull -> 876
    //   701: goto -> 708
    //   704: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   707: athrow
    //   708: aload_3
    //   709: invokevirtual Zl : ()Lburp/Zrjc;
    //   712: aload #10
    //   714: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   719: invokevirtual Zd : (Lburp/Zm3v;)Lburp/Zm6k;
    //   722: pop
    //   723: aload_1
    //   724: ifnull -> 876
    //   727: goto -> 734
    //   730: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   733: athrow
    //   734: aload_3
    //   735: invokevirtual Zb : ()Lburp/Zrjc;
    //   738: aload #10
    //   740: <illegal opcode> Zm : (Ljava/lang/Object;)Lburp/Zm3v;
    //   745: invokevirtual Zd : (Lburp/Zm3v;)Lburp/Zm6k;
    //   748: pop
    //   749: aload_1
    //   750: ifnull -> 876
    //   753: goto -> 760
    //   756: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   759: athrow
    //   760: aload #10
    //   762: checkcast java/util/List
    //   765: aload_3
    //   766: <illegal opcode> accept : (Lburp/Zzuy;)Ljava/util/function/Consumer;
    //   771: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   776: aload_1
    //   777: ifnull -> 876
    //   780: goto -> 787
    //   783: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   786: athrow
    //   787: aload #10
    //   789: checkcast java/util/List
    //   792: aload_3
    //   793: <illegal opcode> accept : (Lburp/Zzuy;)Ljava/util/function/Consumer;
    //   798: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   803: aload_1
    //   804: ifnull -> 876
    //   807: goto -> 814
    //   810: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   813: athrow
    //   814: new burp/Ztuz
    //   817: dup
    //   818: sipush #19352
    //   821: sipush #-1475
    //   824: invokestatic a : (II)Ljava/lang/String;
    //   827: iconst_1
    //   828: anewarray java/lang/Object
    //   831: dup
    //   832: iconst_0
    //   833: aload #11
    //   835: aastore
    //   836: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   839: invokespecial <init> : (Ljava/lang/String;)V
    //   842: athrow
    //   843: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   846: athrow
    //   847: new burp/Ztuz
    //   850: dup
    //   851: sipush #19341
    //   854: sipush #23175
    //   857: invokestatic a : (II)Ljava/lang/String;
    //   860: iconst_1
    //   861: anewarray java/lang/Object
    //   864: dup
    //   865: iconst_0
    //   866: aload #8
    //   868: aastore
    //   869: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   872: invokespecial <init> : (Ljava/lang/String;)V
    //   875: athrow
    //   876: aload_1
    //   877: ifnull -> 990
    //   880: aload #5
    //   882: instanceof net/portswigger/Zhm
    //   885: ifeq -> 922
    //   888: goto -> 895
    //   891: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   894: athrow
    //   895: aload #5
    //   897: checkcast net/portswigger/Zhm
    //   900: astore #7
    //   902: new burp/Zzut
    //   905: dup
    //   906: aload_2
    //   907: invokespecial <init> : (Ljava/lang/String;)V
    //   910: aload #7
    //   912: invokestatic Zw : (Lnet/portswigger/Zhm;)Lburp/Zmgt;
    //   915: invokevirtual Zg : (Lburp/Zmgt;)Lburp/Zzut;
    //   918: invokestatic Zo : (Lburp/Zzut;)Lburp/Zz89;
    //   921: areturn
    //   922: aload #5
    //   924: iconst_4
    //   925: anewarray java/lang/Class
    //   928: dup
    //   929: iconst_0
    //   930: ldc net/portswigger/Zw0
    //   932: aastore
    //   933: dup
    //   934: iconst_1
    //   935: ldc net/portswigger/Ze8
    //   937: aastore
    //   938: dup
    //   939: iconst_2
    //   940: ldc net/portswigger/Zek
    //   942: aastore
    //   943: dup
    //   944: iconst_3
    //   945: ldc net/portswigger/Zwe
    //   947: aastore
    //   948: invokestatic Za : (Lnet/portswigger/Zld;[Ljava/lang/Class;)Z
    //   951: ifeq -> 961
    //   954: goto -> 990
    //   957: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   960: athrow
    //   961: new burp/Ztuz
    //   964: dup
    //   965: sipush #19350
    //   968: sipush #-1334
    //   971: invokestatic a : (II)Ljava/lang/String;
    //   974: iconst_1
    //   975: anewarray java/lang/Object
    //   978: dup
    //   979: iconst_0
    //   980: aload #5
    //   982: aastore
    //   983: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   986: invokespecial <init> : (Ljava/lang/String;)V
    //   989: athrow
    //   990: aload_1
    //   991: ifnull -> 36
    //   994: aload_3
    //   995: areturn
    // Exception table:
    //   from	to	target	type
    //   92	101	101	burp/Ztuz
    //   119	176	176	burp/Ztuz
    //   127	192	195	burp/Ztuz
    //   180	211	214	burp/Ztuz
    //   199	230	233	burp/Ztuz
    //   218	249	252	burp/Ztuz
    //   237	276	279	burp/Ztuz
    //   256	303	306	burp/Ztuz
    //   283	339	339	burp/Ztuz
    //   343	400	400	burp/Ztuz
    //   351	423	426	burp/Ztuz
    //   404	449	452	burp/Ztuz
    //   430	475	478	burp/Ztuz
    //   456	501	504	burp/Ztuz
    //   482	528	531	burp/Ztuz
    //   508	555	558	burp/Ztuz
    //   535	591	591	burp/Ztuz
    //   595	652	652	burp/Ztuz
    //   603	675	678	burp/Ztuz
    //   656	701	704	burp/Ztuz
    //   682	727	730	burp/Ztuz
    //   708	753	756	burp/Ztuz
    //   734	780	783	burp/Ztuz
    //   760	807	810	burp/Ztuz
    //   787	843	843	burp/Ztuz
    //   876	888	891	burp/Ztuz
    //   922	957	957	burp/Ztuz
  }
  
  private static boolean Za(Zld paramZld, Class<? extends Ze7>... paramVarArgs) {
    Class<? extends Ze7>[] arrayOfClass = paramVarArgs;
    int i = arrayOfClass.length;
    byte b = 0;
    String str = Ze();
    while (b < i) {
      Class<? extends Ze7> clazz = arrayOfClass[b];
      try {
        if (clazz.isInstance(paramZld))
          return true; 
      } catch (Ztuz ztuz) {
        throw a(null);
      } 
      b++;
      if (str != null)
        break; 
    } 
    return false;
  }
  
  private static Collection<Zzbl> ZQ(Zbf paramZbf) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Ze : ()Ljava/lang/String;
    //   11: aload_0
    //   12: invokevirtual ZK : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_3
    //   21: astore_1
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 143
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast net/portswigger/Zld
    //   40: astore #4
    //   42: aload #4
    //   44: instanceof net/portswigger/Zxt
    //   47: ifeq -> 73
    //   50: aload #4
    //   52: checkcast net/portswigger/Zxt
    //   55: astore #5
    //   57: aload_2
    //   58: aload #5
    //   60: invokestatic ZY : (Lnet/portswigger/Zxt;)Lburp/Zmgt;
    //   63: invokeinterface add : (Ljava/lang/Object;)Z
    //   68: pop
    //   69: aload_1
    //   70: ifnull -> 139
    //   73: aload #4
    //   75: instanceof net/portswigger/Zed
    //   78: ifne -> 139
    //   81: goto -> 88
    //   84: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   87: athrow
    //   88: aload #4
    //   90: instanceof net/portswigger/Ze8
    //   93: ifeq -> 110
    //   96: goto -> 103
    //   99: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   102: athrow
    //   103: goto -> 139
    //   106: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   109: athrow
    //   110: new burp/Ztuz
    //   113: dup
    //   114: sipush #19339
    //   117: sipush #-22052
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
    //   140: ifnull -> 22
    //   143: aload_2
    //   144: areturn
    // Exception table:
    //   from	to	target	type
    //   57	81	84	burp/Ztuz
    //   73	96	99	burp/Ztuz
    //   88	106	106	burp/Ztuz
  }
  
  private static Collection<Zzbl> Zf(Zxf paramZxf) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Ze : ()Ljava/lang/String;
    //   11: aload_0
    //   12: invokevirtual ZK : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_3
    //   21: astore_1
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 142
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast net/portswigger/Zld
    //   40: astore #4
    //   42: aload #4
    //   44: instanceof net/portswigger/Zx7
    //   47: ifeq -> 73
    //   50: aload #4
    //   52: checkcast net/portswigger/Zx7
    //   55: astore #5
    //   57: aload_2
    //   58: aload #5
    //   60: invokestatic Zq : (Lnet/portswigger/Zx7;)Lburp/Zznd;
    //   63: invokeinterface add : (Ljava/lang/Object;)Z
    //   68: pop
    //   69: aload_1
    //   70: ifnull -> 138
    //   73: aload #4
    //   75: iconst_2
    //   76: anewarray java/lang/Class
    //   79: dup
    //   80: iconst_0
    //   81: ldc net/portswigger/Zwv
    //   83: aastore
    //   84: dup
    //   85: iconst_1
    //   86: ldc net/portswigger/Ze8
    //   88: aastore
    //   89: invokestatic Za : (Lnet/portswigger/Zld;[Ljava/lang/Class;)Z
    //   92: ifeq -> 109
    //   95: goto -> 102
    //   98: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   101: athrow
    //   102: goto -> 138
    //   105: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   108: athrow
    //   109: new burp/Ztuz
    //   112: dup
    //   113: sipush #19329
    //   116: sipush #-2006
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
    //   139: ifnull -> 22
    //   142: aload_2
    //   143: areturn
    // Exception table:
    //   from	to	target	type
    //   57	95	98	burp/Ztuz
    //   73	105	105	burp/Ztuz
  }
  
  private static Zmgt ZY(Zxt paramZxt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZN : ()Ljava/lang/String;
    //   4: astore_2
    //   5: invokestatic Ze : ()Ljava/lang/String;
    //   8: aload_0
    //   9: invokevirtual ZQ : ()Ljava/lang/Object;
    //   12: astore_3
    //   13: astore_1
    //   14: aload_3
    //   15: instanceof net/portswigger/Zh3
    //   18: ifeq -> 38
    //   21: aload_3
    //   22: checkcast net/portswigger/Zh3
    //   25: astore #6
    //   27: aload #6
    //   29: invokestatic ZA : (Lnet/portswigger/Zh3;)Lburp/Zmgt;
    //   32: astore #4
    //   34: aload_1
    //   35: ifnull -> 101
    //   38: aload_3
    //   39: instanceof net/portswigger/Zhm
    //   42: ifeq -> 69
    //   45: goto -> 52
    //   48: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   51: athrow
    //   52: aload_3
    //   53: checkcast net/portswigger/Zhm
    //   56: astore #5
    //   58: aload #5
    //   60: invokestatic Zw : (Lnet/portswigger/Zhm;)Lburp/Zmgt;
    //   63: astore #4
    //   65: aload_1
    //   66: ifnull -> 101
    //   69: new burp/Ztuz
    //   72: dup
    //   73: sipush #19337
    //   76: sipush #10890
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
    //   97: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   100: athrow
    //   101: aload #4
    //   103: aload_2
    //   104: invokevirtual Zf : (Ljava/lang/String;)Lburp/Zmgt;
    //   107: areturn
    // Exception table:
    //   from	to	target	type
    //   34	45	48	burp/Ztuz
    //   65	97	97	burp/Ztuz
  }
  
  private static Zznd Zq(Zx7 paramZx7) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZY : ()Ljava/lang/String;
    //   4: astore_2
    //   5: invokestatic Ze : ()Ljava/lang/String;
    //   8: aload_0
    //   9: invokevirtual ZX : ()Ljava/lang/Object;
    //   12: astore_3
    //   13: astore_1
    //   14: new java/util/LinkedList
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #4
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
    //   66: instanceof net/portswigger/Zhm
    //   69: ifeq -> 96
    //   72: aload #7
    //   74: checkcast net/portswigger/Zhm
    //   77: astore #9
    //   79: aload #4
    //   81: aload #9
    //   83: invokestatic Zw : (Lnet/portswigger/Zhm;)Lburp/Zmgt;
    //   86: invokeinterface add : (Ljava/lang/Object;)Z
    //   91: pop
    //   92: aload_1
    //   93: ifnull -> 165
    //   96: aload_3
    //   97: instanceof net/portswigger/Zh3
    //   100: ifeq -> 133
    //   103: goto -> 110
    //   106: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   109: athrow
    //   110: aload_3
    //   111: checkcast net/portswigger/Zh3
    //   114: astore #8
    //   116: aload #4
    //   118: aload #8
    //   120: invokestatic ZA : (Lnet/portswigger/Zh3;)Lburp/Zmgt;
    //   123: invokeinterface add : (Ljava/lang/Object;)Z
    //   128: pop
    //   129: aload_1
    //   130: ifnull -> 165
    //   133: new burp/Ztuz
    //   136: dup
    //   137: sipush #19332
    //   140: sipush #16193
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
    //   161: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   164: athrow
    //   165: aload_1
    //   166: ifnull -> 45
    //   169: aload_1
    //   170: ifnull -> 205
    //   173: new burp/Ztuz
    //   176: dup
    //   177: sipush #19337
    //   180: sipush #10890
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
    //   201: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
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
    //   79	103	106	burp/Ztuz
    //   116	161	161	burp/Ztuz
    //   169	201	201	burp/Ztuz
  }
  
  private static Ze58 Zq(Zxg paramZxg) {
    // Byte code:
    //   0: new burp/Zxjp
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Ze : ()Ljava/lang/String;
    //   11: aload_0
    //   12: invokevirtual ZK : ()Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_3
    //   21: astore_1
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 321
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast net/portswigger/Zld
    //   40: astore #4
    //   42: aload #4
    //   44: instanceof net/portswigger/Zxo
    //   47: ifeq -> 74
    //   50: aload #4
    //   52: checkcast net/portswigger/Zxo
    //   55: astore #5
    //   57: aload_2
    //   58: aload #5
    //   60: invokevirtual Zs : ()Lnet/portswigger/Zhx;
    //   63: invokevirtual toString : ()Ljava/lang/String;
    //   66: invokevirtual Zb : (Ljava/lang/String;)Lburp/Zxjp;
    //   69: pop
    //   70: aload_1
    //   71: ifnull -> 317
    //   74: aload #4
    //   76: instanceof net/portswigger/Zbw
    //   79: ifeq -> 113
    //   82: goto -> 89
    //   85: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   88: athrow
    //   89: aload #4
    //   91: checkcast net/portswigger/Zbw
    //   94: astore #6
    //   96: aload_2
    //   97: aload #6
    //   99: invokevirtual Zl : ()Lnet/portswigger/Zhx;
    //   102: invokevirtual toString : ()Ljava/lang/String;
    //   105: invokevirtual Zg : (Ljava/lang/String;)Lburp/Zxjp;
    //   108: pop
    //   109: aload_1
    //   110: ifnull -> 317
    //   113: aload #4
    //   115: instanceof net/portswigger/Zb5
    //   118: ifeq -> 175
    //   121: goto -> 128
    //   124: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   127: athrow
    //   128: aload #4
    //   130: checkcast net/portswigger/Zb5
    //   133: astore #7
    //   135: aload_2
    //   136: aload #7
    //   138: invokevirtual Z_ : ()Ljava/util/List;
    //   141: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   146: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   151: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   156: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   159: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   164: checkcast java/util/Set
    //   167: invokevirtual Zt : (Ljava/util/Set;)Lburp/Zxjp;
    //   170: pop
    //   171: aload_1
    //   172: ifnull -> 317
    //   175: aload #4
    //   177: instanceof net/portswigger/Zhu
    //   180: ifeq -> 237
    //   183: goto -> 190
    //   186: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   189: athrow
    //   190: aload #4
    //   192: checkcast net/portswigger/Zhu
    //   195: astore #8
    //   197: aload_2
    //   198: aload #8
    //   200: invokevirtual ZL : ()Ljava/util/List;
    //   203: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   208: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   213: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   218: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   221: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   226: checkcast java/util/Set
    //   229: invokevirtual ZN : (Ljava/util/Set;)Lburp/Zxjp;
    //   232: pop
    //   233: aload_1
    //   234: ifnull -> 317
    //   237: aload #4
    //   239: instanceof net/portswigger/Zxe
    //   242: ifne -> 317
    //   245: goto -> 252
    //   248: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   251: athrow
    //   252: aload #4
    //   254: iconst_2
    //   255: anewarray java/lang/Class
    //   258: dup
    //   259: iconst_0
    //   260: ldc net/portswigger/Zpd
    //   262: aastore
    //   263: dup
    //   264: iconst_1
    //   265: ldc net/portswigger/Ze8
    //   267: aastore
    //   268: invokestatic Za : (Lnet/portswigger/Zld;[Ljava/lang/Class;)Z
    //   271: ifeq -> 288
    //   274: goto -> 281
    //   277: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   280: athrow
    //   281: goto -> 317
    //   284: invokestatic a : (Lburp/Ztuz;)Lburp/Ztuz;
    //   287: athrow
    //   288: new burp/Ztuz
    //   291: dup
    //   292: sipush #19359
    //   295: sipush #-18316
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
    //   318: ifnull -> 22
    //   321: aload_2
    //   322: invokevirtual ZA : ()Lburp/Ze58;
    //   325: areturn
    // Exception table:
    //   from	to	target	type
    //   57	82	85	burp/Ztuz
    //   96	121	124	burp/Ztuz
    //   135	183	186	burp/Ztuz
    //   197	245	248	burp/Ztuz
    //   237	274	277	burp/Ztuz
    //   252	284	284	burp/Ztuz
  }
  
  private static void lambda$convertSendRequest$30(Zzuy paramZzuy, Object paramObject) {
    paramZzuy.ZV().Zq(paramObject::lambda$convertSendRequest$28, paramObject::lambda$convertSendRequest$29);
  }
  
  private static String lambda$convertSendRequest$29(Object paramObject, Zzvx paramZzvx) {
    return ZA(paramZzvx, ((Zx0)paramObject).Zl());
  }
  
  private static String lambda$convertSendRequest$28(Object paramObject, Zzvx paramZzvx) {
    return ZA(paramZzvx, ((Zx0)paramObject).ZC());
  }
  
  private static void lambda$convertSendRequest$27(Zzuy paramZzuy, Object paramObject) {
    paramZzuy.ZQ().Zl(paramObject::lambda$convertSendRequest$11);
  }
  
  private static void lambda$convertSendRequest$21(Zzuy paramZzuy, Object paramObject) {
    paramZzuy.ZV().Z_(Zo(((Zx0)paramObject).ZC()), Zo(((Zx0)paramObject).Zl()));
  }
  
  private static void lambda$convertSendRequest$20(Zzuy paramZzuy, Object paramObject) {
    paramZzuy.ZQ().ZO(paramObject::lambda$convertSendRequest$11);
  }
  
  private static void lambda$convertSendRequest$14(Zzuy paramZzuy, Object paramObject) {
    paramZzuy.ZV().ZD(paramObject::lambda$convertSendRequest$11);
  }
  
  private static void lambda$convertSendRequest$12(Zzuy paramZzuy, Object paramObject) {
    paramZzuy.ZQ().ZD(paramObject::lambda$convertSendRequest$11);
  }
  
  private static String lambda$convertSendRequest$11(Object paramObject, Zzvx paramZzvx) {
    return ZA(paramZzvx, (Zbk)paramObject);
  }
  
  private static String lambda$convertReportIssue$10(Zx3 paramZx3, Zzvx paramZzvx) {
    return ZA(paramZzvx, paramZx3.Zs());
  }
  
  private static String lambda$convertReportIssue$9(Zxn paramZxn, Zzvx paramZzvx) {
    return ZA(paramZzvx, paramZxn.ZX());
  }
  
  private static String lambda$convertReportIssue$8(Zxc paramZxc, Zzvx paramZzvx) {
    return ZA(paramZzvx, paramZxc.ZG());
  }
  
  private static String lambda$convertReportIssue$7(Ze58 paramZe58, Zzvx paramZzvx) {
    return paramZe58.ZrS();
  }
  
  private static Stream lambda$convertIncludedInsertionPointTypes$6(Zbv paramZbv) {
    try {
      switch (Zgvj.Zk[paramZbv.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
          break;
      } 
    } catch (Ztuz ztuz) {
      throw a(null);
    } 
    return Stream.of(Zs66.COOKIE);
  }
  
  private static String lambda$convertSendPayload$5(Zxl paramZxl, Zzvx paramZzvx) {
    return ZA(paramZzvx, paramZxl.ZQ());
  }
  
  private static String lambda$convertSendPayload$4(Zbt paramZbt, Zzvx paramZzvx) {
    return ZA(paramZzvx, paramZbt.ZR());
  }
  
  private static void lambda$convertNamedOperation$3(Set<String> paramSet, String paramString) {
    Zz(paramSet, paramString);
  }
  
  private static Zzur lambda$convertNamedOperation$2(Zgd5 paramZgd5) {
    return (Zzur)paramZgd5;
  }
  
  private static boolean lambda$convertNamedOperation$1(Zgd5 paramZgd5) {
    return paramZgd5 instanceof Zzur;
  }
  
  private static void lambda$convertGivenBlock$0(Set<String> paramSet, String paramString) {
    Zz(paramSet, paramString);
    paramSet.add(paramString);
  }
  
  public static void Zw(String paramString) {
    ZD = paramString;
  }
  
  public static String Ze() {
    return ZD;
  }
  
  private static Ztuz a(Ztuz paramZtuz) {
    return paramZtuz;
  }
  
  static {
    // Byte code:
    //   0: bipush #34
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'ñqªáðëÿê½0¢äáÓ°æô´¨^µ _¦ZCbÙ9`\\rÏBúíÙ~#²©ÊÌÄZG¨Uë¦ §k³Fq¨VÊ¬µkþ¶B·È\\tÁ¾6I|ç7ýÕMº"çr®åGÌðZË=Á>Ö~½CU¶>\\n,º³<!ÞÉíºnì«#i#\\rÊHcâQpùþsé}!è³i¬G+É­&ãS>+@Dê=+Þ¼Ç¿ÁkÿN\\ró_þ½ûXí!1±ú\\n8Ò\6KUÃìTAÏ!n£Y» 0D1U/&y&Gò|pÙñ9ÞúÕÁ §±´ÑçT¬üo4Ô¢9dÞ|K¤+ýi+âÀùæ}(çç³pêì5«2?£­¸å?\\níòP\\rýrJÔ¹gmDa\\f6î/1Q(·§9QðË;pà/þP2§wéY8>ù4}bËÛo'äZpT{~àïK)ØzÅhA·­u²æaMwX]sÙhÈ+l{P' çùÝ\\r «6¬Þ¦**x8H*$´BkeGk¤¡GâS2¤Æü5){´ûYÚüº\\b@%)Fl1å{S¢SKl´¦Q'æ,3®+#E«\\r¢@ÃJ9Î;u("¦Tã¢E±û\V"['V¹eßEi¡Åtæ¥H{¬¸tÌQ!Ôkñ ^(V5IA=\\t½É!oUãJ;"jiÏïüTA\\fØÃ,ÉðjóuÂ¢þ#ZòEÀ\\b{ £ïK­ü xçJÈ·zs­\\t\\ts.\\tséøknc-×&)§±;°0qÒT>"¯r2Ú 9#¶¨§!©r}VC#\Fd)g"ke¾¯KÔ´Åo]Õµ/6\PlU*9+Ä,dÒz.½£ÍÚn×/$ØTx0ë®h÷òµB#É7AÈueJ×c¨¤õk«\\rAs;+nlYB0dDÍ¦/XyéG|+j/¯èÂ5aKqÚÃ\\bÒÀpåTF9Ù#Fç«'·XÖ¡cmqs¾m¥.ÛÔYeÏtÝ8±Þú"ä@¶Z«<`ç8.G¾¡ªÃzfrÀÙ5O= \\fRµAÂç>¡UplK)ä¨c\\f¡zspÌ AåzPVaüõ\\tì/ì xôM¿M,X¢@¼å±b°¼Y¿<`\HË×6ª³ùÚ³Èí0h×¯Î­#Õ)ç0Ð³¹tào¯0r'¬QÚ¦Ç6ñÛ³nU?wµÕÒç\\f®Ö5%³ÄBLFhx$XIz|BÒtêÈ¬ðÑ[%2Ò=ÿpr·oXÍ%Ìt\\rÒTÌ3;ÁWÄ³W)<æd`Ê¸n&ë;¿tî/µàÇ+M×Î­ýéSr Óùl¤©+®V\\f²¸Cv'Bxªhb%o\\f­Ï'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #37
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic Zw : (Ljava/lang/String;)V
    //   27: bipush #51
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'Ü¥¬sv±XP_2ô´ê× %Âh$o>mÙ´êlÿ¥Äy^!«xÆW¦Öw6Pvc¿äÄ'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #25
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #92
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zl2a.a : [Ljava/lang/String;
    //   136: bipush #34
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zl2a.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 263
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 230, 4 -> 235, 5 -> 240
    //   216: bipush #74
    //   218: goto -> 247
    //   221: bipush #33
    //   223: goto -> 247
    //   226: iconst_4
    //   227: goto -> 247
    //   230: bipush #104
    //   232: goto -> 247
    //   235: bipush #29
    //   237: goto -> 247
    //   240: bipush #36
    //   242: goto -> 247
    //   245: bipush #6
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 170
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 166
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4B96) & 0xFFFF;
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
      char c = 'Ò';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl2a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */