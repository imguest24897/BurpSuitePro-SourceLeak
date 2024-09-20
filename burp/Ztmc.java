package burp;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zs4;
import net.portswigger.Zsy;
import net.portswigger.Zuh;
import net.portswigger.browser.Zi;

public class Ztmc {
  private final Zrgd ZU;
  
  private final Zsy Ze;
  
  private final Zs4 Zo;
  
  private final Zerg ZH;
  
  private final Zgb6 ZO;
  
  private final Zkl6 Zg;
  
  private final Zr_4 Za;
  
  private final Ztwv Zy;
  
  private final Zr_4 ZT;
  
  private final Zzg2 Zz;
  
  private final Zz1h ZN;
  
  private final Ztks ZQ;
  
  private final Zbjl Zn;
  
  private final Zlaa ZY;
  
  private final Zlcb ZL;
  
  private final Zsus ZP;
  
  private final Zm6x ZD;
  
  private final Zmr3 Zh;
  
  private final Zz3j Zi;
  
  public Ztmc(Zrgd paramZrgd, Zsy paramZsy, Zs4 paramZs4, Zgb6 paramZgb6, Zerg paramZerg, Zkl6 paramZkl6, Zr_4 paramZr_4, Zzg2 paramZzg2, Zz1h paramZz1h, Ztwv paramZtwv, Ztks paramZtks, Zbjl paramZbjl, Zlaa paramZlaa, Zlcb paramZlcb, Zz3j paramZz3j, Zsus paramZsus, Zm6x paramZm6x, Zmr3 paramZmr3) {
    this.ZU = paramZrgd;
    this.Ze = paramZsy;
    this.Zo = paramZs4;
    this.ZO = paramZgb6;
    this.ZH = paramZerg;
    this.Zg = paramZkl6;
    this.Za = paramZr_4;
    this.Zy = paramZtwv;
    this.ZQ = paramZtks;
    this.Zn = paramZbjl;
    this.ZY = paramZlaa;
    this.ZL = paramZlcb;
    this.ZP = paramZsus;
    int i = Zriy.Zq();
    this.ZD = paramZm6x;
    this.Zh = paramZmr3;
    this.ZT = new Zruo();
    this.Zz = paramZzg2;
    this.ZN = paramZz1h;
    this.Zi = paramZz3j;
    if (Zbqc.Zwu() == null)
      Zriy.ZU(++i); 
  }
  
  public Zriy ZL(Ztzd paramZtzd) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZJ : ()Lburp/Zr5h;
    //   4: astore_3
    //   5: aload_3
    //   6: invokeinterface Zdm : ()Lburp/Zz1i;
    //   11: astore #4
    //   13: aload_1
    //   14: invokevirtual Zk : ()Lburp/Zkq4;
    //   17: astore #5
    //   19: invokestatic Zq : ()I
    //   22: aload_1
    //   23: invokevirtual Zt : ()Lburp/Zkg9;
    //   26: astore #6
    //   28: istore_2
    //   29: aload_1
    //   30: invokevirtual ZT : ()Lburp/Zb9a;
    //   33: astore #7
    //   35: aload_1
    //   36: invokevirtual Zp : ()Lburp/Zkcl;
    //   39: astore #8
    //   41: aload_1
    //   42: invokevirtual ZR : ()Lburp/Ztdi;
    //   45: astore #9
    //   47: aload_1
    //   48: invokevirtual Zi : ()Lburp/Zzs1;
    //   51: astore #10
    //   53: aload_1
    //   54: invokevirtual Zz : ()Lburp/Zsv0;
    //   57: astore #11
    //   59: aload_1
    //   60: invokevirtual ZF : ()Z
    //   63: istore #12
    //   65: aload_1
    //   66: invokevirtual Zf : ()Z
    //   69: istore #13
    //   71: aload #8
    //   73: ifnull -> 80
    //   76: iconst_1
    //   77: goto -> 81
    //   80: iconst_0
    //   81: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   84: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   87: aload_1
    //   88: invokevirtual Za : ()Lburp/Zskh;
    //   91: astore #14
    //   93: aload_0
    //   94: getfield ZL : Lburp/Zlcb;
    //   97: getstatic burp/Zeew.SCANNER : Lburp/Zeew;
    //   100: aload_3
    //   101: invokeinterface ZPo : ()I
    //   106: invokeinterface Za : (Lburp/Zeew;I)Lburp/Zgg0;
    //   111: astore #15
    //   113: aload #4
    //   115: aload_0
    //   116: getfield Za : Lburp/Zr_4;
    //   119: invokestatic ZH : (Lburp/Zz1i;Lburp/Zr_4;)Lburp/Zzqm;
    //   122: astore #16
    //   124: new burp/Zssh
    //   127: dup
    //   128: aload #16
    //   130: invokespecial <init> : (Lburp/Zzqm;)V
    //   133: astore #17
    //   135: new burp/Zk5u
    //   138: dup
    //   139: aload #16
    //   141: new burp/Zsz4
    //   144: dup
    //   145: aload_0
    //   146: getfield Za : Lburp/Zr_4;
    //   149: aload #9
    //   151: invokespecial <init> : (Lburp/Zr_4;Lburp/Zrny;)V
    //   154: new burp/Zzq2
    //   157: dup
    //   158: aload_0
    //   159: getfield Za : Lburp/Zr_4;
    //   162: aload #9
    //   164: invokespecial <init> : (Lburp/Zr_4;Lburp/Zrny;)V
    //   167: new burp/Zg6v
    //   170: dup
    //   171: aload_0
    //   172: getfield Za : Lburp/Zr_4;
    //   175: invokespecial <init> : (Lburp/Zr_4;)V
    //   178: invokespecial <init> : (Lburp/Zzqm;Lburp/Zsz4;Lburp/Zzq2;Lburp/Zg6v;)V
    //   181: astore #18
    //   183: aload_1
    //   184: invokevirtual ZU : ()Lburp/Zto9;
    //   187: astore #20
    //   189: new burp/Ztos
    //   192: dup
    //   193: invokestatic Zn : ()Lburp/Zt1o;
    //   196: invokespecial <init> : (Lburp/Zt3y;)V
    //   199: astore #21
    //   201: aload #21
    //   203: getstatic burp/Zt1o.Zx : Lburp/Zlnb;
    //   206: aload_0
    //   207: <illegal opcode> accept : (Lburp/Ztmc;)Ljava/util/function/Consumer;
    //   212: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   215: astore #22
    //   217: invokestatic Zr : ()Lburp/Zts2;
    //   220: aload #20
    //   222: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   225: aload #22
    //   227: <illegal opcode> accept : (Lburp/Zgrn;)Ljava/util/function/Consumer;
    //   232: invokevirtual Zz : (Lburp/Zlli;Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zts2;
    //   235: pop
    //   236: new java/util/concurrent/ConcurrentHashMap
    //   239: dup
    //   240: invokespecial <init> : ()V
    //   243: astore #23
    //   245: aload #21
    //   247: getstatic burp/Zt1o.Zt : Lburp/Zlnb;
    //   250: aload #4
    //   252: <illegal opcode> accept : (Lburp/Zz1i;)Ljava/util/function/Consumer;
    //   257: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   260: pop
    //   261: new burp/Zra0
    //   264: dup
    //   265: aload_0
    //   266: getfield ZQ : Lburp/Ztks;
    //   269: aload_3
    //   270: invokeinterface ZPo : ()I
    //   275: invokespecial <init> : (Lburp/Ztks;I)V
    //   278: aload #20
    //   280: aload #21
    //   282: invokevirtual ZL : (Lburp/Zlli;Lburp/Zlli;)V
    //   285: new burp/Zslo
    //   288: dup
    //   289: aload #14
    //   291: aload #8
    //   293: invokespecial <init> : (Lburp/Zskh;Lburp/Zkcl;)V
    //   296: aload #21
    //   298: invokevirtual Zt : (Lburp/Zlli;)V
    //   301: new burp/Zgq1
    //   304: dup
    //   305: aload #8
    //   307: invokespecial <init> : (Lburp/Zkcl;)V
    //   310: aload #21
    //   312: invokevirtual Zs : (Lburp/Zlli;)V
    //   315: aload_3
    //   316: invokeinterface ZNs : ()Lburp/Zkcl;
    //   321: getstatic burp/Zkcl.SCAN_CRAWL_AND_AUDIT : Lburp/Zkcl;
    //   324: if_acmpeq -> 339
    //   327: aload_3
    //   328: invokeinterface ZNs : ()Lburp/Zkcl;
    //   333: getstatic burp/Zkcl.SOAP_API_AUDIT : Lburp/Zkcl;
    //   336: if_acmpne -> 484
    //   339: aload_1
    //   340: invokevirtual Zj : ()Lburp/Zl7h;
    //   343: astore #24
    //   345: aload #24
    //   347: dup
    //   348: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   351: pop
    //   352: <illegal opcode> get : (Lburp/Zl7h;)Ljava/util/function/Supplier;
    //   357: astore #25
    //   359: new burp/Zlvl
    //   362: dup
    //   363: aload_0
    //   364: getfield ZU : Lburp/Zrgd;
    //   367: aload #25
    //   369: aload_1
    //   370: invokevirtual ZV : ()Lburp/Zr69;
    //   373: aload_1
    //   374: invokevirtual ZX : ()Lburp/Zz28;
    //   377: aload_1
    //   378: invokevirtual Zk : ()Lburp/Zkq4;
    //   381: aload_0
    //   382: getfield Zg : Lburp/Zkl6;
    //   385: aload_0
    //   386: getfield ZO : Lburp/Zgb6;
    //   389: invokeinterface Zfo : ()Lburp/Zrs4;
    //   394: aload_0
    //   395: getfield ZO : Lburp/Zgb6;
    //   398: aload #6
    //   400: aload_1
    //   401: <illegal opcode> get : (Lburp/Ztzd;)Ljava/util/function/Supplier;
    //   406: aload #23
    //   408: aload #5
    //   410: <illegal opcode> get : (Ljava/util/Map;Lburp/Zkq4;)Ljava/util/function/Supplier;
    //   415: aload #23
    //   417: dup
    //   418: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   421: pop
    //   422: <illegal opcode> accept : (Ljava/util/Map;)Ljava/util/function/Consumer;
    //   427: aload #9
    //   429: aload_0
    //   430: getfield ZQ : Lburp/Ztks;
    //   433: aload #10
    //   435: new burp/Zkus
    //   438: dup
    //   439: aload_0
    //   440: getfield ZY : Lburp/Zlaa;
    //   443: aload_1
    //   444: invokevirtual ZX : ()Lburp/Zz28;
    //   447: aload #14
    //   449: aload_0
    //   450: getfield ZO : Lburp/Zgb6;
    //   453: aload #5
    //   455: aload #15
    //   457: aload_0
    //   458: getfield Zi : Lburp/Zz3j;
    //   461: invokespecial <init> : (Lburp/Zlaa;Lburp/Zz28;Lburp/Zskh;Lburp/Zgb6;Lburp/Zkq4;Lburp/Zgg0;Lburp/Zz3j;)V
    //   464: aload_0
    //   465: getfield Ze : Lnet/portswigger/Zsy;
    //   468: invokespecial <init> : (Lburp/Zrgd;Ljava/util/function/Supplier;Lburp/Zzmb;Lburp/Zz28;Lburp/Zkq4;Lburp/Zkl6;Lburp/Zrs4;Lburp/Zgb6;Lburp/Zkg9;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Consumer;Lburp/Ztdi;Lburp/Ztks;Lburp/Zzs1;Lburp/Zkus;Lnet/portswigger/Zsy;)V
    //   471: astore #19
    //   473: iload_2
    //   474: ifne -> 491
    //   477: iconst_2
    //   478: anewarray burp/Zbqc
    //   481: invokestatic Zr : ([Lburp/Zbqc;)V
    //   484: <illegal opcode> ZA : ()Lburp/Zeu7;
    //   489: astore #19
    //   491: aload_0
    //   492: getfield Zg : Lburp/Zkl6;
    //   495: invokeinterface ZB : ()Lburp/Zbnt;
    //   500: astore #24
    //   502: aload_0
    //   503: getfield Zg : Lburp/Zkl6;
    //   506: invokeinterface ZH : ()Lburp/Zey9;
    //   511: astore #25
    //   513: aload_0
    //   514: getfield ZY : Lburp/Zlaa;
    //   517: aload #14
    //   519: aload #15
    //   521: aload_1
    //   522: invokevirtual ZX : ()Lburp/Zz28;
    //   525: invokevirtual Ze : (Lburp/Zskh;Lburp/Zgg0;Lburp/Zz28;)Lburp/Zl11;
    //   528: astore #26
    //   530: new burp/Zggx
    //   533: dup
    //   534: aload #26
    //   536: aload #14
    //   538: aload #24
    //   540: aload_0
    //   541: getfield ZO : Lburp/Zgb6;
    //   544: aload #5
    //   546: aload_0
    //   547: getfield Zi : Lburp/Zz3j;
    //   550: invokespecial <init> : (Lburp/Zl11;Lburp/Zskh;Lburp/Zbnt;Lburp/Zgb6;Lburp/Zkq4;Lburp/Zz3j;)V
    //   553: astore #27
    //   555: new burp/Zsoh
    //   558: dup
    //   559: aload #27
    //   561: aload #5
    //   563: aload #7
    //   565: aload #6
    //   567: aload #25
    //   569: invokespecial <init> : (Lburp/Zggx;Lburp/Zkq4;Lburp/Zlba;Lburp/Zkg9;Lburp/Zey9;)V
    //   572: astore #28
    //   574: new burp/Zesv
    //   577: dup
    //   578: aload #5
    //   580: aload #24
    //   582: aload #25
    //   584: aload #21
    //   586: invokespecial <init> : (Lburp/Zbph;Lburp/Zbnt;Lburp/Zey9;Lburp/Zz1m;)V
    //   589: astore #29
    //   591: aload #4
    //   593: aload #5
    //   595: aload_0
    //   596: getfield Za : Lburp/Zr_4;
    //   599: invokestatic Zn : (Lburp/Zz1i;Lburp/Zkq4;Lburp/Zr_4;)Lburp/Zly1;
    //   602: astore #30
    //   604: aload_0
    //   605: getfield Zz : Lburp/Zzg2;
    //   608: aload_3
    //   609: aload #5
    //   611: aload #21
    //   613: aload #9
    //   615: invokevirtual Zy : (Lburp/Zr5h;Lburp/Zkq4;Lburp/Ztos;Lburp/Zrny;)Lburp/Zmz6;
    //   618: astore #31
    //   620: aload_0
    //   621: getfield Zn : Lburp/Zbjl;
    //   624: aload #5
    //   626: aload #7
    //   628: aload_0
    //   629: getfield Zg : Lburp/Zkl6;
    //   632: aload #31
    //   634: aload_0
    //   635: getfield ZT : Lburp/Zr_4;
    //   638: aload #29
    //   640: aload_0
    //   641: getfield ZH : Lburp/Zerg;
    //   644: getstatic burp/Zeew.EXTENDER : Lburp/Zeew;
    //   647: invokevirtual ZU : (Lburp/Zeew;)Z
    //   650: ifeq -> 668
    //   653: aload_0
    //   654: getfield ZH : Lburp/Zerg;
    //   657: invokevirtual ZM : ()Lburp/Zgvn;
    //   660: invokeinterface Zo : ()Ljava/util/List;
    //   665: goto -> 669
    //   668: aconst_null
    //   669: aload_0
    //   670: getfield Ze : Lnet/portswigger/Zsy;
    //   673: aload #30
    //   675: aload_3
    //   676: iload #13
    //   678: aload #21
    //   680: invokeinterface ZF : (Lburp/Zkq4;Lburp/Zb9a;Lburp/Zkl6;Lburp/Zmz6;Lburp/Zr_4;Lburp/Zesv;Ljava/util/List;Lnet/portswigger/Zsy;Lburp/Zly1;Lburp/Zr5h;ZLburp/Zz1m;)V
    //   685: new burp/Zsy7
    //   688: dup
    //   689: aload_3
    //   690: new burp/Zk2p
    //   693: dup
    //   694: aload #5
    //   696: aload_0
    //   697: getfield ZO : Lburp/Zgb6;
    //   700: invokeinterface ZU0 : ()Lburp/Zes1;
    //   705: invokespecial <init> : (Lburp/Zkq4;Lburp/Zes1;)V
    //   708: aload_0
    //   709: getfield Zy : Lburp/Ztwv;
    //   712: invokeinterface Ze : ()Ljava/util/concurrent/ScheduledExecutorService;
    //   717: aload #21
    //   719: aload_0
    //   720: getfield ZU : Lburp/Zrgd;
    //   723: iload #13
    //   725: invokespecial <init> : (Lburp/Zr5h;Lburp/Zk2p;Ljava/util/concurrent/ScheduledExecutorService;Lburp/Zz1m;Lburp/Zrgd;Z)V
    //   728: aload #20
    //   730: aload #21
    //   732: invokevirtual Zp : (Lburp/Zlli;Lburp/Zlli;)Lburp/Zsy7;
    //   735: astore #32
    //   737: aload #7
    //   739: aload #32
    //   741: invokevirtual ZM : (Lburp/Zsy7;)V
    //   744: new burp/Zkc
    //   747: dup
    //   748: aload #24
    //   750: aload #25
    //   752: aload #7
    //   754: aload_0
    //   755: getfield Zn : Lburp/Zbjl;
    //   758: aload_0
    //   759: getfield ZH : Lburp/Zerg;
    //   762: aload #21
    //   764: invokespecial <init> : (Lburp/Zbnt;Lburp/Zey9;Lburp/Zlba;Lburp/Zbjl;Lburp/Zerg;Lburp/Zz1m;)V
    //   767: astore #33
    //   769: new burp/Zrjd
    //   772: dup
    //   773: aload #19
    //   775: aload #24
    //   777: aload #25
    //   779: aload_0
    //   780: getfield ZU : Lburp/Zrgd;
    //   783: aload #5
    //   785: aload #7
    //   787: aload_0
    //   788: getfield Zn : Lburp/Zbjl;
    //   791: aload_0
    //   792: getfield ZH : Lburp/Zerg;
    //   795: aload #28
    //   797: aload #21
    //   799: iload #13
    //   801: invokespecial <init> : (Lburp/Zeu7;Lburp/Zbnt;Lburp/Zey9;Lburp/Zrgd;Lburp/Zkq4;Lburp/Zlba;Lburp/Zbjl;Lburp/Zerg;Lburp/Zsoh;Lburp/Zz1m;Z)V
    //   804: astore #34
    //   806: new burp/Zkm8
    //   809: dup
    //   810: aload_0
    //   811: getfield Za : Lburp/Zr_4;
    //   814: aload_0
    //   815: getfield ZO : Lburp/Zgb6;
    //   818: aload #28
    //   820: aload_0
    //   821: getfield Zg : Lburp/Zkl6;
    //   824: aload #9
    //   826: invokespecial <init> : (Lburp/Zr_4;Lburp/Zgb6;Lburp/Zsoh;Lburp/Zkl6;Lburp/Ztdi;)V
    //   829: astore #35
    //   831: aload #17
    //   833: aload #4
    //   835: aload_0
    //   836: getfield ZH : Lburp/Zerg;
    //   839: aload #5
    //   841: aload_0
    //   842: getfield Zg : Lburp/Zkl6;
    //   845: aload_0
    //   846: getfield Zy : Lburp/Ztwv;
    //   849: aload_0
    //   850: getfield ZU : Lburp/Zrgd;
    //   853: aload #14
    //   855: aload_0
    //   856: getfield Ze : Lnet/portswigger/Zsy;
    //   859: aload #11
    //   861: iload #12
    //   863: iload #13
    //   865: aload_1
    //   866: <illegal opcode> get : (Lburp/Ztzd;)Ljava/util/function/Supplier;
    //   871: aload_0
    //   872: getfield ZD : Lburp/Zm6x;
    //   875: invokestatic ZT : (Lburp/Zssh;Lburp/Zz1i;Lburp/Zerg;Lburp/Zkq4;Lburp/Zkl6;Lburp/Ztwv;Lburp/Zrgd;Lburp/Zskh;Lnet/portswigger/Zsy;Lburp/Zsv0;ZZLjava/util/function/Supplier;Lburp/Zm6x;)Lburp/Zg0g;
    //   878: astore #36
    //   880: iload #13
    //   882: ifeq -> 891
    //   885: getstatic burp/Zgbu.Zm : Lburp/Zgbu;
    //   888: goto -> 900
    //   891: new burp/Zm_t
    //   894: dup
    //   895: aload #5
    //   897: invokespecial <init> : (Lburp/Zkq4;)V
    //   900: astore #37
    //   902: new burp/Zmpd
    //   905: dup
    //   906: aload #7
    //   908: aload #31
    //   910: aload_0
    //   911: getfield ZO : Lburp/Zgb6;
    //   914: aload #5
    //   916: aload_0
    //   917: getfield Za : Lburp/Zr_4;
    //   920: aload_0
    //   921: getfield ZT : Lburp/Zr_4;
    //   924: aload #36
    //   926: aload #24
    //   928: aload #17
    //   930: aload #18
    //   932: aload_0
    //   933: getfield ZN : Lburp/Zz1h;
    //   936: aload #33
    //   938: aload_0
    //   939: getfield ZU : Lburp/Zrgd;
    //   942: aload_0
    //   943: getfield Zo : Lnet/portswigger/Zs4;
    //   946: aload #14
    //   948: aload #4
    //   950: aload_3
    //   951: invokeinterface ZPo : ()I
    //   956: aload #35
    //   958: aload #37
    //   960: aload_0
    //   961: getfield Zn : Lburp/Zbjl;
    //   964: aload_1
    //   965: invokevirtual Zy : ()Lburp/Znn;
    //   968: aload_0
    //   969: getfield ZQ : Lburp/Ztks;
    //   972: aload #10
    //   974: aload #28
    //   976: aload_1
    //   977: invokevirtual ZX : ()Lburp/Zz28;
    //   980: aload #20
    //   982: aload #21
    //   984: invokespecial <init> : (Lburp/Zlba;Lburp/Zmz6;Lburp/Zgb6;Lburp/Zkq4;Lburp/Zr_4;Lburp/Zr_4;Lburp/Zg0g;Lburp/Zbnt;Lburp/Zssh;Lburp/Zk5u;Lburp/Zz1h;Lburp/Zkc;Lburp/Zrgd;Lnet/portswigger/Zs4;Lburp/Zskh;Lburp/Zz1i;ILburp/Zkm8;Lburp/Zgbu;Lburp/Zbjl;Lburp/Znn;Lburp/Ztks;Lburp/Zzs1;Lburp/Zsoh;Lburp/Zz28;Lburp/Zlli;Lburp/Ztos;)V
    //   987: astore #38
    //   989: aload_0
    //   990: getfield Zg : Lburp/Zkl6;
    //   993: aload_0
    //   994: getfield ZT : Lburp/Zr_4;
    //   997: aload_0
    //   998: getfield Ze : Lnet/portswigger/Zsy;
    //   1001: aload_0
    //   1002: getfield ZH : Lburp/Zerg;
    //   1005: aload_0
    //   1006: getfield Za : Lburp/Zr_4;
    //   1009: aload_0
    //   1010: getfield ZO : Lburp/Zgb6;
    //   1013: aload #9
    //   1015: aload #5
    //   1017: aload #28
    //   1019: aload #29
    //   1021: aload #4
    //   1023: aload_0
    //   1024: getfield Zn : Lburp/Zbjl;
    //   1027: aload #14
    //   1029: aload #11
    //   1031: iload #12
    //   1033: iload #13
    //   1035: aload_1
    //   1036: <illegal opcode> get : (Lburp/Ztzd;)Ljava/util/function/Supplier;
    //   1041: aload_0
    //   1042: getfield ZD : Lburp/Zm6x;
    //   1045: aload_0
    //   1046: getfield Zh : Lburp/Zmr3;
    //   1049: invokestatic Zn : (Lburp/Zkl6;Lburp/Zr_4;Lnet/portswigger/Zsy;Lburp/Zerg;Lburp/Zr_4;Lburp/Zgb6;Lburp/Ztdi;Lburp/Zkq4;Lburp/Zsoh;Lburp/Zesv;Lburp/Zz1i;Lburp/Zbjl;Lburp/Zskh;Lburp/Zsv0;ZZLjava/util/function/Supplier;Lburp/Zm6x;Lburp/Zmr3;)Lburp/Zb0k;
    //   1052: astore #39
    //   1054: new burp/Zmnf
    //   1057: dup
    //   1058: aload #7
    //   1060: aload #31
    //   1062: aload #5
    //   1064: aload_0
    //   1065: getfield Za : Lburp/Zr_4;
    //   1068: aload_0
    //   1069: getfield ZT : Lburp/Zr_4;
    //   1072: aload #39
    //   1074: new burp/Zens
    //   1077: dup
    //   1078: aload_0
    //   1079: getfield Zg : Lburp/Zkl6;
    //   1082: aload_0
    //   1083: getfield Zn : Lburp/Zbjl;
    //   1086: aload #5
    //   1088: aload_0
    //   1089: getfield Ze : Lnet/portswigger/Zsy;
    //   1092: aload #7
    //   1094: aload #33
    //   1096: aload #29
    //   1098: aload #4
    //   1100: invokespecial <init> : (Lburp/Zkl6;Lburp/Zbjl;Lburp/Zkq4;Lnet/portswigger/Zsy;Lburp/Zlba;Lburp/Zkc;Lburp/Zesv;Lburp/Zz1i;)V
    //   1103: aload_0
    //   1104: getfield Ze : Lnet/portswigger/Zsy;
    //   1107: aload_0
    //   1108: getfield Zo : Lnet/portswigger/Zs4;
    //   1111: aload #34
    //   1113: aload #29
    //   1115: aload #28
    //   1117: aload_0
    //   1118: getfield ZU : Lburp/Zrgd;
    //   1121: aload #14
    //   1123: aload_0
    //   1124: getfield Zg : Lburp/Zkl6;
    //   1127: aload_0
    //   1128: getfield Zn : Lburp/Zbjl;
    //   1131: aload #35
    //   1133: aload_1
    //   1134: invokevirtual Zy : ()Lburp/Znn;
    //   1137: aload #30
    //   1139: aload_0
    //   1140: getfield ZQ : Lburp/Ztks;
    //   1143: aload #10
    //   1145: aload #4
    //   1147: aload_3
    //   1148: invokeinterface ZPo : ()I
    //   1153: aload_1
    //   1154: invokevirtual ZX : ()Lburp/Zz28;
    //   1157: aload #20
    //   1159: aload #21
    //   1161: invokespecial <init> : (Lburp/Zlba;Lburp/Zmz6;Lburp/Zkq4;Lburp/Zr_4;Lburp/Zr_4;Lburp/Zb0k;Lburp/Zens;Lnet/portswigger/Zsy;Lnet/portswigger/Zs4;Lburp/Zrjd;Lburp/Zesv;Lburp/Zsoh;Lburp/Zrgd;Lburp/Zskh;Lburp/Zkl6;Lburp/Zbjl;Lburp/Zkm8;Lburp/Znn;Lburp/Zly1;Lburp/Ztks;Lburp/Zzs1;Lburp/Zz1i;ILburp/Zz28;Lburp/Zlli;Lburp/Ztos;)V
    //   1164: astore #40
    //   1166: new burp/Zgev
    //   1169: dup
    //   1170: aload #4
    //   1172: aload #5
    //   1174: aload_0
    //   1175: getfield ZU : Lburp/Zrgd;
    //   1178: aload #23
    //   1180: <illegal opcode> accept : (Ljava/util/Map;)Ljava/util/function/Consumer;
    //   1185: aload #40
    //   1187: dup
    //   1188: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1191: pop
    //   1192: <illegal opcode> get : (Lburp/Zmnf;)Ljava/util/function/Supplier;
    //   1197: aload #38
    //   1199: dup
    //   1200: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1203: pop
    //   1204: <illegal opcode> get : (Lburp/Zmpd;)Ljava/util/function/Supplier;
    //   1209: aload #21
    //   1211: aload #5
    //   1213: invokeinterface ZqC : ()I
    //   1218: invokespecial <init> : (Lburp/Zz1i;Lburp/Zkyp;Lburp/Zrgd;Ljava/util/function/Consumer;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Lburp/Ztos;I)V
    //   1221: astore #41
    //   1223: aload #7
    //   1225: aload #41
    //   1227: invokevirtual Zx : (Lburp/Zgev;)V
    //   1230: new burp/Zxsk
    //   1233: dup
    //   1234: aload #7
    //   1236: aload #32
    //   1238: aload #41
    //   1240: invokespecial <init> : (Lburp/Zlba;Lburp/Zsy7;Lburp/Zgev;)V
    //   1243: astore #42
    //   1245: aload #21
    //   1247: getstatic burp/Zt1o.Zx : Lburp/Zlnb;
    //   1250: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   1255: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   1258: pop
    //   1259: invokestatic Zr : ()Lburp/Zts2;
    //   1262: aload #21
    //   1264: getstatic burp/Zt1o.Zv : Lburp/Zlnb;
    //   1267: aload_0
    //   1268: iload #13
    //   1270: aload #5
    //   1272: <illegal opcode> accept : (Lburp/Ztmc;ZLburp/Zkq4;)Ljava/util/function/Consumer;
    //   1277: invokevirtual Zz : (Lburp/Zlli;Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zts2;
    //   1280: pop
    //   1281: new burp/Zriy
    //   1284: dup
    //   1285: aload #7
    //   1287: aload #5
    //   1289: aload_3
    //   1290: aload #38
    //   1292: aload #40
    //   1294: aload #41
    //   1296: aload #42
    //   1298: aload #31
    //   1300: aload #21
    //   1302: new burp/Zzle
    //   1305: dup
    //   1306: aload #6
    //   1308: aload #4
    //   1310: aload #23
    //   1312: <illegal opcode> accept : (Ljava/util/Map;)Ljava/util/function/Consumer;
    //   1317: aload #14
    //   1319: aload_1
    //   1320: invokevirtual Zb : ()Lburp/Zgq5;
    //   1323: aload #21
    //   1325: invokespecial <init> : (Lburp/Zkg9;Lburp/Zz1i;Ljava/util/function/Consumer;Lburp/Zskh;Lburp/Zgq5;Lburp/Zz1m;)V
    //   1328: aload_0
    //   1329: getfield ZP : Lburp/Zsus;
    //   1332: aload #20
    //   1334: invokespecial <init> : (Lburp/Zb9a;Lburp/Zkq4;Lburp/Zr5h;Lburp/Zk7r;Lburp/Zk7r;Lburp/Zgev;Lburp/Zxsk;Lburp/Zmz6;Lburp/Ztos;Lburp/Zzle;Lburp/Zsus;Lburp/Zlli;)V
    //   1337: areturn
  }
  
  private static void lambda$build$15(Map<Zrp0, AtomicInteger> paramMap, Zrp0 paramZrp0) {
    if (paramZrp0 != null)
      int i = ((AtomicInteger)paramMap.computeIfAbsent(paramZrp0, Ztmc::lambda$build$14)).incrementAndGet(); 
  }
  
  private static AtomicInteger lambda$build$14(Zrp0 paramZrp0) {
    return new AtomicInteger();
  }
  
  private void lambda$build$13(boolean paramBoolean, Zkq4 paramZkq4, Zxr8 paramZxr8) {
    if (!paramBoolean) {
      Zgvn zgvn = this.ZH.ZM();
      List<Zryx> list = zgvn.Zd();
      long l1 = list.stream().filter(Zryx::Zl).count();
      Zm2.Zi(Zv8r.SCANNER_BCHECK_NO_ENABLED, l1);
      long l2 = list.stream().filter(Ztmc::lambda$build$12).count();
      Zm2.Zi(Zv8r.SCANNER_BCHECK_NO_DISABLED_AND_INVALID, l2);
      Zm2.Zi(Zv8r.SCANNER_BCHECK_NO_DISABLED_AND_VALID, list.size() - l2 - l1);
      boolean bool = paramZkq4.Zr(Zzu2.EXTENSION_GENERATED) ? zgvn.ZT() : false;
      Zm2.Zi(Zv8r.SCANNER_EXTENSION_NO_ENABLED, bool);
    } 
  }
  
  private static boolean lambda$build$12(Zryx paramZryx) {
    return !paramZryx.Zb();
  }
  
  private static void lambda$build$11(Zxr8 paramZxr8) {
    Ztyh.Zc();
  }
  
  private static void lambda$build$10(Map paramMap, Zl5x paramZl5x) {
    paramMap.clear();
  }
  
  private static String lambda$build$8(Ztzd paramZtzd) {
    return Optional.<Zr69>ofNullable(paramZtzd.ZV()).map(Zzmb::Zw).orElse(Zi.ZC());
  }
  
  private static Ztv0 lambda$build$7(Zbza paramZbza, Ztpx paramZtpx) {
    Zuh.Zb(false, Zqf.ZC);
    return null;
  }
  
  private static Collection lambda$build$6(Map paramMap, Zkq4 paramZkq4) {
    Set set = (Set)paramMap.entrySet().stream().filter(paramZkq4::lambda$build$5).map(Map.Entry::getKey).collect(Collectors.toSet());
    Zm2.Zi(Zv8r.SCANNER_NUMBER_OF_BLOCKED_DOORWAYS, set.size());
    return set;
  }
  
  private static boolean lambda$build$5(Zkq4 paramZkq4, Map.Entry paramEntry) {
    return (((AtomicInteger)paramEntry.getValue()).get() >= paramZkq4.ZYM());
  }
  
  private static Zg0y lambda$build$4(Ztzd paramZtzd) {
    Zl7h zl7h = paramZtzd.Zj();
    Zr69 zr69 = paramZtzd.ZV();
    return Zg0y.ZF(zl7h, zr69, Zrp6.DEBUG);
  }
  
  private static void lambda$build$3(Zz1i paramZz1i, Zxr8 paramZxr8) {
    paramZxr8.ZP(paramZz1i::lambda$build$2);
  }
  
  private static void lambda$build$2(Zz1i paramZz1i, Zebg paramZebg) {
    paramZz1i.ZHD().ZbB(paramZebg.ZaK());
    paramZz1i.ZHD().Zbp(paramZebg.ZaU());
    paramZz1i.ZHD().Zb8(paramZebg.Za8());
    paramZz1i.ZHD().ZbO(paramZebg.Zab());
  }
  
  private static void lambda$build$1(Zgrn paramZgrn, Zxr8 paramZxr8) {
    paramZgrn.ZZ();
  }
  
  private void lambda$build$0(Zxr8 paramZxr8) {
    this.Zn.ZP();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztmc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */