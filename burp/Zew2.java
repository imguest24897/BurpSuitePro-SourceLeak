package burp;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import net.portswigger.Zl0;

public class Zew2 {
  private final Zl04 Zd;
  
  private final Zz0n Zu;
  
  private final Zt4u ZP;
  
  private final Zerg Zf;
  
  private final Zgbj ZG;
  
  private final Zgb6 ZT;
  
  private final Zxgc ZX;
  
  private final Zskh Zz;
  
  private final Zkl6 Zt;
  
  private final Supplier<Zkr6> ZH;
  
  private final Ztwv Zb;
  
  private final Zr_4 ZI;
  
  private final Zr_4 ZR;
  
  private final Supplier<Zbiv> ZS;
  
  private final Zkn ZJ;
  
  private final Supplier<Zr06> ZE;
  
  private final Zsw5 ZL;
  
  private final Zmo9 Zy;
  
  private final Zl0 Ze;
  
  private final Zlpb ZQ;
  
  private final Zxwj Zo;
  
  private final Zskh Zp;
  
  private final Zrgm Zx;
  
  private final Ztg8 Zl;
  
  private final Supplier<Zm0l> ZK;
  
  private final Supplier<Zrqq> ZV;
  
  private final Zgxi ZF;
  
  private final boolean Zn;
  
  private final Zxea ZA;
  
  private final Zzc3 Zq;
  
  private final Zxa ZZ;
  
  private final Zz3j Zj;
  
  private final int Za;
  
  private final Zb_j Zh;
  
  private final Zmw4 Zs;
  
  private final Zxco Zc;
  
  private final Zllh ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zew2(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgbj paramZgbj, Zgb6 paramZgb6, Zxgc paramZxgc, Zskh paramZskh1, Zkl6 paramZkl6, Supplier<Zkr6> paramSupplier, Zl04 paramZl04, Ztwv paramZtwv, Zr_4 paramZr_41, Zr_4 paramZr_42, Supplier<Zbiv> paramSupplier1, Ztyg paramZtyg, Zgq7 paramZgq7, Zkn paramZkn, Supplier<Zr06> paramSupplier2, Zsw5 paramZsw5, Zmo9 paramZmo9, Zl0 paramZl0, Zlpb paramZlpb, Zxwj paramZxwj, Zskh paramZskh2, Zrgm paramZrgm, Ztg8 paramZtg8, Supplier<Zm0l> paramSupplier3, Supplier<Zrqq> paramSupplier4, Zgxi paramZgxi, boolean paramBoolean, Zxea paramZxea, Zzc3 paramZzc3, Zxa paramZxa, Zz3j paramZz3j, Zb_j paramZb_j, Zllh paramZllh, int paramInt, Zmw4 paramZmw4) {
    this.Zu = paramZz0n;
    this.ZP = paramZt4u;
    this.Zf = paramZerg;
    this.ZG = paramZgbj;
    this.ZT = paramZgb6;
    this.ZX = paramZxgc;
    this.Zz = paramZskh1;
    this.Zt = paramZkl6;
    this.ZH = paramSupplier;
    this.Zd = paramZl04;
    this.Zb = paramZtwv;
    this.ZI = paramZr_41;
    this.ZR = paramZr_42;
    this.ZS = paramSupplier1;
    this.ZJ = paramZkn;
    this.ZE = paramSupplier2;
    this.ZL = paramZsw5;
    boolean bool = Zs7w.Zw();
    try {
      this.Zy = paramZmo9;
      this.Ze = paramZl0;
      this.Zx = paramZrgm;
      this.Zl = paramZtg8;
      this.ZK = paramSupplier3;
      this.ZV = paramSupplier4;
      this.ZF = paramZgxi;
      this.Zn = paramBoolean;
      this.ZQ = paramZlpb;
      this.Zo = paramZxwj;
      this.Zp = paramZskh2;
      this.ZA = paramZxea;
      this.Zq = paramZzc3;
      this.ZZ = paramZxa;
      this.Zj = paramZz3j;
      this.Za = paramInt;
      this.Zh = paramZb_j;
      this.ZM = paramZllh;
      this.Zs = paramZmw4;
      this.Zc = new Zxco(paramZz0n, paramZgb6, paramZtyg, paramZgq7, paramZkl6.ZH());
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        Zs7w.Zs(!bool);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public Zlvv ZT(Zxw4 paramZxw4) {
    // Byte code:
    //   0: aload_1
    //   1: getfield ZF : Lburp/Zsh8;
    //   4: invokeinterface ZPQ : ()Z
    //   9: ifeq -> 23
    //   12: aload_0
    //   13: getfield ZI : Lburp/Zr_4;
    //   16: goto -> 27
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aload_0
    //   24: getfield ZR : Lburp/Zr_4;
    //   27: astore_2
    //   28: new java/util/concurrent/atomic/AtomicReference
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore_3
    //   36: new java/util/concurrent/atomic/AtomicReference
    //   39: dup
    //   40: invokespecial <init> : ()V
    //   43: astore #4
    //   45: new java/util/concurrent/atomic/AtomicReference
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: astore #5
    //   54: new java/util/concurrent/atomic/AtomicReference
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: astore #6
    //   63: aload_1
    //   64: invokevirtual Zl : ()V
    //   67: new burp/Zzi4
    //   70: dup
    //   71: aload_0
    //   72: getfield ZT : Lburp/Zgb6;
    //   75: aload_0
    //   76: getfield Zu : Lburp/Zz0n;
    //   79: invokeinterface ZP : ()Lburp/Zrgd;
    //   84: aload_0
    //   85: getfield Zt : Lburp/Zkl6;
    //   88: aload_0
    //   89: getfield Zf : Lburp/Zerg;
    //   92: aload_0
    //   93: getfield Zd : Lburp/Zl04;
    //   96: aload_0
    //   97: getfield Zn : Z
    //   100: invokespecial <init> : (Lburp/Zgb6;Lburp/Zrgd;Lburp/Zkl6;Lburp/Zerg;Lburp/Zl04;Z)V
    //   103: astore #7
    //   105: new burp/Zr_d
    //   108: dup
    //   109: aload_1
    //   110: getfield ZF : Lburp/Zsh8;
    //   113: invokeinterface ZPE : ()Lburp/Zxpp;
    //   118: invokeinterface ZwZ : ()Lburp/Zstu;
    //   123: aload_1
    //   124: getfield ZF : Lburp/Zsh8;
    //   127: invokeinterface ZPJ : ()Lburp/Zstu;
    //   132: new burp/Ztr7
    //   135: dup
    //   136: aload_0
    //   137: getfield Zt : Lburp/Zkl6;
    //   140: invokeinterface ZB : ()Lburp/Zbnt;
    //   145: invokespecial <init> : (Lburp/Zbnt;)V
    //   148: aload_2
    //   149: dup
    //   150: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   153: pop
    //   154: <illegal opcode> apply : (Lburp/Zr_4;)Ljava/util/function/Function;
    //   159: aload_1
    //   160: <illegal opcode> test : (Lburp/Zxw4;)Ljava/util/function/Predicate;
    //   165: invokespecial <init> : (Lburp/Zstu;Lburp/Zstu;Lburp/Ztr7;Ljava/util/function/Function;Ljava/util/function/Predicate;)V
    //   168: astore #8
    //   170: aload #7
    //   172: aload_1
    //   173: aload #8
    //   175: invokevirtual Zx : (Lburp/Zxw4;Lburp/Zr_d;)Lburp/Zluf;
    //   178: invokeinterface ZK : ()Z
    //   183: ifne -> 192
    //   186: aconst_null
    //   187: areturn
    //   188: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   191: athrow
    //   192: aload_1
    //   193: getfield ZF : Lburp/Zsh8;
    //   196: invokeinterface ZPU : ()V
    //   201: goto -> 227
    //   204: astore #9
    //   206: aload #9
    //   208: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   211: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   214: aload_0
    //   215: getfield Zp : Lburp/Zskh;
    //   218: aload #9
    //   220: invokeinterface Zl : (Ljava/lang/Exception;)V
    //   225: aconst_null
    //   226: areturn
    //   227: aload_2
    //   228: new burp/Zxoy
    //   231: dup
    //   232: invokespecial <init> : ()V
    //   235: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   240: checkcast burp/Zlfa
    //   243: astore #9
    //   245: aload_0
    //   246: aload_1
    //   247: getfield ZF : Lburp/Zsh8;
    //   250: aload_2
    //   251: aload #9
    //   253: invokevirtual Zc : (Lburp/Zsh8;Lburp/Zr_4;Lburp/Zlfa;)Lburp/Zzys;
    //   256: astore #10
    //   258: aload #10
    //   260: invokeinterface ZNH : ()Lburp/Zmz1;
    //   265: astore #11
    //   267: aload #11
    //   269: invokeinterface Zek : ()Lburp/Zxxx;
    //   274: astore #12
    //   276: aload #10
    //   278: invokeinterface ZNJ : ()Lburp/Zz1y;
    //   283: astore #13
    //   285: new burp/Zb_x
    //   288: dup
    //   289: aload #12
    //   291: aload #13
    //   293: invokespecial <init> : (Lburp/Zxxx;Lburp/Zz1y;)V
    //   296: astore #14
    //   298: new burp/Zg03
    //   301: dup
    //   302: aload #11
    //   304: invokeinterface ZeF : ()Lburp/Zkgn;
    //   309: invokespecial <init> : (Lburp/Zkgn;)V
    //   312: astore #15
    //   314: aload_0
    //   315: getfield Zq : Lburp/Zzc3;
    //   318: aload #10
    //   320: invokeinterface ZPo : ()I
    //   325: invokeinterface ZD : (I)Lburp/Ze3w;
    //   330: astore #16
    //   332: aload_0
    //   333: aload #10
    //   335: invokevirtual ZU : (Lburp/Zzys;)Lburp/Ztou;
    //   338: astore #17
    //   340: new burp/Zemt
    //   343: dup
    //   344: aload #15
    //   346: aload #17
    //   348: aload #14
    //   350: aload #16
    //   352: dup
    //   353: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   356: pop
    //   357: <illegal opcode> run : (Lburp/Ze3w;)Ljava/lang/Runnable;
    //   362: invokespecial <init> : (Lburp/Zg03;Lburp/Ztou;Lburp/Zb_x;Ljava/lang/Runnable;)V
    //   365: astore #18
    //   367: aload #11
    //   369: invokeinterface Zeg : ()Lburp/Ze5c;
    //   374: astore #19
    //   376: new burp/Zeo4
    //   379: dup
    //   380: invokespecial <init> : ()V
    //   383: astore #20
    //   385: new burp/Zz1e
    //   388: dup
    //   389: aload_1
    //   390: getfield ZF : Lburp/Zsh8;
    //   393: aload_0
    //   394: getfield Zp : Lburp/Zskh;
    //   397: invokespecial <init> : (Lburp/Zsh8;Lburp/Zskh;)V
    //   400: astore #21
    //   402: new burp/Zg2c
    //   405: dup
    //   406: aload #21
    //   408: invokespecial <init> : (Lburp/Zz1e;)V
    //   411: astore #22
    //   413: aload #19
    //   415: invokeinterface ZHJ : ()Lburp/Zlee;
    //   420: astore #23
    //   422: aload_0
    //   423: getfield Zs : Lburp/Zmw4;
    //   426: invokeinterface ZM : ()Lburp/Zbws;
    //   431: astore #24
    //   433: new burp/Zmuy
    //   436: dup
    //   437: aload_2
    //   438: aload #19
    //   440: invokeinterface ZHZ : ()Lburp/Zefg;
    //   445: aload #22
    //   447: aload_0
    //   448: getfield Zu : Lburp/Zz0n;
    //   451: invokeinterface ZD : ()Lburp/Zb0h;
    //   456: aload #15
    //   458: aload #20
    //   460: aload #23
    //   462: aload_0
    //   463: getfield Za : I
    //   466: aload #24
    //   468: invokespecial <init> : (Lburp/Zr_4;Lburp/Zefg;Lburp/Zg2c;Lburp/Zb0h;Ljavafx/collections/ObservableList;Lburp/Zeo4;Lburp/Zlee;ILburp/Zbws;)V
    //   471: astore #25
    //   473: new burp/Zxcm
    //   476: dup
    //   477: aconst_null
    //   478: aload_0
    //   479: getfield Zt : Lburp/Zkl6;
    //   482: invokeinterface ZB : ()Lburp/Zbnt;
    //   487: invokespecial <init> : ([BLburp/Zbnt;)V
    //   490: astore #26
    //   492: new burp/Zk7k
    //   495: dup
    //   496: aload_0
    //   497: getfield Zl : Lburp/Ztg8;
    //   500: aload_0
    //   501: getfield ZS : Ljava/util/function/Supplier;
    //   504: invokeinterface get : ()Ljava/lang/Object;
    //   509: checkcast burp/Zbiv
    //   512: invokevirtual ZW : ()Lburp/Zrfd;
    //   515: dup
    //   516: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   519: pop
    //   520: <illegal opcode> accept : (Lburp/Zrfd;)Ljava/util/function/BiConsumer;
    //   525: aload #10
    //   527: aload_0
    //   528: getfield Zb : Lburp/Ztwv;
    //   531: aload #5
    //   533: dup
    //   534: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   537: pop
    //   538: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   543: aload_0
    //   544: getfield ZV : Ljava/util/function/Supplier;
    //   547: invokeinterface get : ()Ljava/lang/Object;
    //   552: checkcast burp/Zrqq
    //   555: aload_0
    //   556: getfield ZK : Ljava/util/function/Supplier;
    //   559: invokeinterface get : ()Ljava/lang/Object;
    //   564: checkcast burp/Zm0l
    //   567: aload_0
    //   568: getfield ZX : Lburp/Zxgc;
    //   571: invokeinterface ZK1 : ()Lburp/Zl04;
    //   576: aload_0
    //   577: getfield Zo : Lburp/Zxwj;
    //   580: new burp/Zeql
    //   583: dup
    //   584: invokespecial <init> : ()V
    //   587: new java/util/concurrent/atomic/AtomicBoolean
    //   590: dup
    //   591: iconst_0
    //   592: invokespecial <init> : (Z)V
    //   595: invokespecial <init> : (Lburp/Ztg8;Ljava/util/function/BiConsumer;Lburp/Zzys;Lburp/Ztwv;Ljava/util/function/Supplier;Lburp/Zrqq;Lburp/Zm0l;Ljava/awt/Window;Lburp/Zxwj;Lburp/Zggy;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    //   598: astore #27
    //   600: new burp/Zm3c
    //   603: dup
    //   604: aload #4
    //   606: dup
    //   607: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   610: pop
    //   611: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   616: aload #18
    //   618: aload #6
    //   620: dup
    //   621: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   624: pop
    //   625: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   630: aload #14
    //   632: aload_1
    //   633: getfield ZF : Lburp/Zsh8;
    //   636: aload_0
    //   637: getfield Zy : Lburp/Zmo9;
    //   640: aload_0
    //   641: getfield Zb : Lburp/Ztwv;
    //   644: aload_0
    //   645: getfield Zp : Lburp/Zskh;
    //   648: aload #25
    //   650: aload_2
    //   651: invokespecial <init> : (Ljava/util/function/Supplier;Lburp/Zemt;Ljava/util/function/Supplier;Lburp/Zb_x;Lburp/Zsh8;Lburp/Zmo9;Lburp/Ztwv;Lburp/Zskh;Lburp/Zmuy;Lburp/Zr_4;)V
    //   654: astore #28
    //   656: aload_0
    //   657: getfield ZA : Lburp/Zxea;
    //   660: aload #10
    //   662: invokevirtual Zt : (Lburp/Zgna;)Lburp/Zto9;
    //   665: astore #29
    //   667: aload_0
    //   668: aload #29
    //   670: aload #16
    //   672: invokevirtual ZO : (Lburp/Zto9;Lburp/Ze3w;)V
    //   675: new burp/Zl4e
    //   678: dup
    //   679: aload #14
    //   681: aload_1
    //   682: getfield ZF : Lburp/Zsh8;
    //   685: dup
    //   686: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   689: pop
    //   690: <illegal opcode> get : (Lburp/Zsh8;)Ljava/util/function/Supplier;
    //   695: aload #29
    //   697: <illegal opcode> run : (Lburp/Zto9;)Ljava/lang/Runnable;
    //   702: invokespecial <init> : (Lburp/Zb_x;Ljava/util/function/Supplier;Ljava/lang/Runnable;)V
    //   705: astore #30
    //   707: aload_0
    //   708: getfield ZL : Lburp/Zsw5;
    //   711: aload #26
    //   713: aload #27
    //   715: aload_2
    //   716: aload #5
    //   718: dup
    //   719: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   722: pop
    //   723: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   728: aload #28
    //   730: aload #30
    //   732: dup
    //   733: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   736: pop
    //   737: <illegal opcode> run : (Lburp/Zlpe;)Ljava/lang/Runnable;
    //   742: invokeinterface Zn : (Lburp/Zt84;Lburp/Zeg4;Lburp/Zr_4;Ljava/util/function/Supplier;Lburp/Zxaw;Ljava/lang/Runnable;)Lburp/Zbyn;
    //   747: astore #31
    //   749: aload #6
    //   751: aload #31
    //   753: invokevirtual set : (Ljava/lang/Object;)V
    //   756: new burp/Zx_d
    //   759: dup
    //   760: aload_0
    //   761: getfield Zy : Lburp/Zmo9;
    //   764: aload_0
    //   765: getfield Ze : Lnet/portswigger/Zl0;
    //   768: aload_0
    //   769: getfield ZP : Lburp/Zt4u;
    //   772: aload_0
    //   773: getfield ZH : Ljava/util/function/Supplier;
    //   776: invokeinterface get : ()Ljava/lang/Object;
    //   781: checkcast burp/Zkr6
    //   784: aload #31
    //   786: aload #25
    //   788: aload_0
    //   789: getfield Zp : Lburp/Zskh;
    //   792: aload #22
    //   794: dup
    //   795: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   798: pop
    //   799: <illegal opcode> apply : (Lburp/Zg2c;)Ljava/util/function/Function;
    //   804: aload #24
    //   806: invokespecial <init> : (Lburp/Zmo9;Lnet/portswigger/Zl0;Lburp/Zt4u;Lburp/Zkr6;Lburp/Zbyn;Lburp/Zmuy;Lburp/Zskh;Ljava/util/function/Function;Lburp/Zbws;)V
    //   809: astore #32
    //   811: aload_0
    //   812: getfield Zz : Lburp/Zskh;
    //   815: aload #10
    //   817: invokeinterface ZPo : ()I
    //   822: invokeinterface ZD : (I)Lburp/Zskh;
    //   827: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   830: invokeinterface ZQ : (Lburp/Zeew;)Lburp/Zskh;
    //   835: astore #33
    //   837: new burp/Zlok
    //   840: dup
    //   841: aload #12
    //   843: invokeinterface Zhi : ()Lburp/Zzcq;
    //   848: aload #17
    //   850: aload #14
    //   852: aload #13
    //   854: invokeinterface Zf7 : ()Lburp/Zzyg;
    //   859: invokespecial <init> : (Lburp/Zzcq;Lburp/Ztos;Lburp/Zb_x;Lburp/Zzyg;)V
    //   862: astore #34
    //   864: aload_0
    //   865: getfield ZM : Lburp/Zllh;
    //   868: aload #10
    //   870: invokevirtual Zz : (Lburp/Zzys;)V
    //   873: new burp/Zznr
    //   876: dup
    //   877: aload #17
    //   879: aload #13
    //   881: invokeinterface Zf7 : ()Lburp/Zzyg;
    //   886: aload #29
    //   888: aload_0
    //   889: aload #10
    //   891: <illegal opcode> run : (Lburp/Zew2;Lburp/Zzys;)Ljava/lang/Runnable;
    //   896: invokespecial <init> : (Lburp/Zz1m;Lburp/Zzyg;Lburp/Ztos;Ljava/lang/Runnable;)V
    //   899: astore #35
    //   901: new java/util/concurrent/atomic/AtomicReference
    //   904: dup
    //   905: invokespecial <init> : ()V
    //   908: astore #36
    //   910: aload_0
    //   911: aload #10
    //   913: aload #14
    //   915: aload_1
    //   916: getfield ZF : Lburp/Zsh8;
    //   919: invokevirtual ZQ : (Lburp/Zzys;Lburp/Zb_x;Lburp/Zsh8;)Lburp/Zx_v;
    //   922: astore #37
    //   924: new burp/Zzlx
    //   927: dup
    //   928: aload_0
    //   929: getfield Zf : Lburp/Zerg;
    //   932: invokevirtual ZM : ()Lburp/Zgvn;
    //   935: aload_0
    //   936: getfield ZH : Ljava/util/function/Supplier;
    //   939: invokeinterface get : ()Ljava/lang/Object;
    //   944: checkcast burp/Zkr6
    //   947: aload_0
    //   948: getfield Zp : Lburp/Zskh;
    //   951: aload_0
    //   952: getfield Zb : Lburp/Ztwv;
    //   955: aload_1
    //   956: getfield ZF : Lburp/Zsh8;
    //   959: aload #31
    //   961: aload #14
    //   963: aload #12
    //   965: invokeinterface Zhi : ()Lburp/Zzcq;
    //   970: aload #35
    //   972: aload #15
    //   974: aload #36
    //   976: dup
    //   977: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   980: pop
    //   981: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   986: aload #37
    //   988: invokespecial <init> : (Lburp/Zgvn;Lburp/Zkr6;Lburp/Zskh;Lburp/Ztwv;Lburp/Zsh8;Lburp/Zbyn;Lburp/Zb_x;Lburp/Zzcq;Lburp/Zznr;Lburp/Zg03;Ljava/util/function/Supplier;Lburp/Zx_v;)V
    //   991: astore #38
    //   993: aload #9
    //   995: aload_1
    //   996: getfield ZF : Lburp/Zsh8;
    //   999: invokeinterface ZPg : ()Ljava/util/List;
    //   1004: aload #8
    //   1006: aload_1
    //   1007: getfield ZF : Lburp/Zsh8;
    //   1010: invokeinterface ZPa : ()Lburp/Zejb;
    //   1015: aload #38
    //   1017: aload_2
    //   1018: invokestatic ZH : (Lburp/Zlfa;Ljava/util/List;Lburp/Zr_d;Lburp/Zejb;Lburp/Zzlx;Lburp/Zr_4;)Lburp/Zg8k;
    //   1021: astore #39
    //   1023: new burp/Zkar
    //   1026: dup
    //   1027: aload_1
    //   1028: getfield ZF : Lburp/Zsh8;
    //   1031: aload_2
    //   1032: aload #39
    //   1034: aload #14
    //   1036: dup
    //   1037: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1040: pop
    //   1041: <illegal opcode> accept : (Lburp/Zb_x;)Ljava/util/function/Consumer;
    //   1046: aload #30
    //   1048: aload #8
    //   1050: invokespecial <init> : (Lburp/Zsh8;Lburp/Zr_4;Lburp/Zg8k;Ljava/util/function/Consumer;Lburp/Zlpe;Lburp/Zr_d;)V
    //   1053: astore #40
    //   1055: aload #36
    //   1057: aload #40
    //   1059: invokevirtual set : (Ljava/lang/Object;)V
    //   1062: new burp/Zeaw
    //   1065: dup
    //   1066: aload_0
    //   1067: getfield ZI : Lburp/Zr_4;
    //   1070: invokeinterface Zi : ()Z
    //   1075: aload_1
    //   1076: getfield ZF : Lburp/Zsh8;
    //   1079: invokeinterface ZPQ : ()Z
    //   1084: ifne -> 1095
    //   1087: iconst_1
    //   1088: goto -> 1096
    //   1091: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1094: athrow
    //   1095: iconst_0
    //   1096: invokespecial <init> : (ZZ)V
    //   1099: astore #41
    //   1101: new burp/Zg7v
    //   1104: dup
    //   1105: aload_0
    //   1106: getfield Zf : Lburp/Zerg;
    //   1109: aload #40
    //   1111: aload_0
    //   1112: getfield Zp : Lburp/Zskh;
    //   1115: aload_0
    //   1116: getfield ZS : Ljava/util/function/Supplier;
    //   1119: invokeinterface get : ()Ljava/lang/Object;
    //   1124: checkcast burp/Zbiv
    //   1127: aload_0
    //   1128: getfield ZG : Lburp/Zgbj;
    //   1131: aload_0
    //   1132: getfield Zy : Lburp/Zmo9;
    //   1135: aload_0
    //   1136: getfield Zb : Lburp/Ztwv;
    //   1139: aload_0
    //   1140: getfield Zt : Lburp/Zkl6;
    //   1143: invokeinterface ZB : ()Lburp/Zbnt;
    //   1148: aload_0
    //   1149: getfield ZI : Lburp/Zr_4;
    //   1152: aload_0
    //   1153: getfield ZX : Lburp/Zxgc;
    //   1156: aload_3
    //   1157: <illegal opcode> accept : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   1162: aload #31
    //   1164: dup
    //   1165: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1168: pop
    //   1169: <illegal opcode> accept : (Lburp/Zbyn;)Ljava/util/function/Consumer;
    //   1174: aload_0
    //   1175: <illegal opcode> accept : (Lburp/Zew2;)Ljava/util/function/Consumer;
    //   1180: aload_0
    //   1181: getfield Zz : Lburp/Zskh;
    //   1184: aload #25
    //   1186: dup
    //   1187: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1190: pop
    //   1191: <illegal opcode> run : (Lburp/Zmuy;)Ljava/lang/Runnable;
    //   1196: aload_0
    //   1197: getfield ZT : Lburp/Zgb6;
    //   1200: invokeinterface ZU0 : ()Lburp/Zes1;
    //   1205: aload_0
    //   1206: getfield ZP : Lburp/Zt4u;
    //   1209: aload_0
    //   1210: getfield Ze : Lnet/portswigger/Zl0;
    //   1213: aload_0
    //   1214: getfield ZF : Lburp/Zgxi;
    //   1217: invokespecial <init> : (Lburp/Zerg;Lburp/Zkar;Lburp/Zskh;Lburp/Zbiv;Lburp/Zgbj;Lburp/Zmo9;Lburp/Ztwv;Lburp/Zbnt;Lburp/Zr_4;Lburp/Zxgc;Ljava/util/function/Consumer;Ljava/util/function/Consumer;Ljava/util/function/Consumer;Lburp/Zskh;Ljava/lang/Runnable;Lburp/Zes1;Lburp/Zmjm;Lnet/portswigger/Zl0;Lburp/Zgxi;)V
    //   1220: astore #42
    //   1222: new burp/Zgf3
    //   1225: dup
    //   1226: aload_0
    //   1227: getfield Zb : Lburp/Ztwv;
    //   1230: aload_3
    //   1231: dup
    //   1232: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1235: pop
    //   1236: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   1241: aload #31
    //   1243: aload_1
    //   1244: getfield ZF : Lburp/Zsh8;
    //   1247: aload #32
    //   1249: aload #25
    //   1251: aload_0
    //   1252: getfield ZQ : Lburp/Zlpb;
    //   1255: aload #19
    //   1257: aload #13
    //   1259: invokeinterface Zf7 : ()Lburp/Zzyg;
    //   1264: aload #27
    //   1266: aload #41
    //   1268: aload #42
    //   1270: aload_0
    //   1271: getfield Zc : Lburp/Zxco;
    //   1274: aload #24
    //   1276: invokespecial <init> : (Lburp/Ztwv;Ljava/util/function/Supplier;Lburp/Zbyn;Lburp/Zsh8;Lburp/Zx_d;Lburp/Zmuy;Lburp/Zlpb;Lburp/Ze5c;Lburp/Zzyg;Lburp/Zeg4;Lburp/Zeaw;Lburp/Zg7v;Lburp/Zxco;Lburp/Zbws;)V
    //   1279: astore #43
    //   1281: aload #4
    //   1283: aload #43
    //   1285: invokevirtual set : (Ljava/lang/Object;)V
    //   1288: aload_0
    //   1289: aload #34
    //   1291: new burp/Zl_x
    //   1294: dup
    //   1295: aload #14
    //   1297: invokespecial <init> : (Lburp/Zb_x;)V
    //   1300: aload #29
    //   1302: aload #17
    //   1304: invokevirtual Zr : (Lburp/Zlok;Lburp/Zl_x;Lburp/Zlli;Lburp/Ztou;)V
    //   1307: aload_0
    //   1308: aload #38
    //   1310: aload_1
    //   1311: getfield ZF : Lburp/Zsh8;
    //   1314: aload #28
    //   1316: aload #35
    //   1318: aload #18
    //   1320: aload #14
    //   1322: aload #17
    //   1324: aload_2
    //   1325: aload #25
    //   1327: invokevirtual ZP : ()Lburp/Zxr3;
    //   1330: invokevirtual Zr : (Lburp/Zzlx;Lburp/Zsh8;Lburp/Zm3c;Lburp/Zznr;Lburp/Zemt;Lburp/Zb_x;Lburp/Ztou;Lburp/Zr_4;Lburp/Zxr3;)Lburp/Ztvd;
    //   1333: astore #44
    //   1335: new burp/Zkb3
    //   1338: dup
    //   1339: iconst_1
    //   1340: aload_0
    //   1341: aload #5
    //   1343: dup
    //   1344: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1347: pop
    //   1348: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   1353: aload #35
    //   1355: invokevirtual Zl : (Ljava/util/function/Supplier;Lburp/Zznr;)Ljava/util/function/Supplier;
    //   1358: aload #41
    //   1360: aload_0
    //   1361: getfield Zx : Lburp/Zrgm;
    //   1364: aload #27
    //   1366: invokespecial <init> : (ZLjava/util/function/Supplier;Lburp/Zeaw;Lburp/Zrgm;Lburp/Zeg4;)V
    //   1369: astore #45
    //   1371: new burp/Zeoh
    //   1374: dup
    //   1375: aload #43
    //   1377: aload #27
    //   1379: aload #45
    //   1381: aload_0
    //   1382: getfield Zh : Lburp/Zb_j;
    //   1385: aload #34
    //   1387: aload #17
    //   1389: aload_0
    //   1390: getfield ZI : Lburp/Zr_4;
    //   1393: invokeinterface Zi : ()Z
    //   1398: invokespecial <init> : (Lburp/Zgf3;Lburp/Zeg4;Lburp/Zkb3;Lburp/Zb_j;Lburp/Zlok;Lburp/Ztou;Z)V
    //   1401: astore #46
    //   1403: aload_0
    //   1404: aload #10
    //   1406: aload #14
    //   1408: aload #44
    //   1410: aload #46
    //   1412: aload_1
    //   1413: getfield Zl : Lburp/Zip;
    //   1416: getfield ZU : Lburp/Zb2y;
    //   1419: aload #33
    //   1421: aload #29
    //   1423: invokevirtual ZQ : (Lburp/Zzys;Lburp/Zb_x;Lburp/Ztvd;Lburp/Zl2h;Lburp/Zb2y;Lburp/Zskh;Lburp/Zto9;)Lburp/Ztj1;
    //   1426: astore #47
    //   1428: aload #5
    //   1430: aload #47
    //   1432: invokevirtual set : (Ljava/lang/Object;)V
    //   1435: new burp/Zlvv
    //   1438: dup
    //   1439: aload_0
    //   1440: getfield Zb : Lburp/Ztwv;
    //   1443: aload_1
    //   1444: getfield ZF : Lburp/Zsh8;
    //   1447: aload #25
    //   1449: aload #32
    //   1451: aload_3
    //   1452: dup
    //   1453: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1456: pop
    //   1457: <illegal opcode> accept : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   1462: aload_0
    //   1463: aload #47
    //   1465: <illegal opcode> get : (Lburp/Ztj1;)Ljava/util/function/Supplier;
    //   1470: aload #35
    //   1472: invokevirtual Zl : (Ljava/util/function/Supplier;Lburp/Zznr;)Ljava/util/function/Supplier;
    //   1475: aload #28
    //   1477: aload #38
    //   1479: aload #35
    //   1481: aload_0
    //   1482: <illegal opcode> apply : (Lburp/Zew2;)Ljava/util/function/Function;
    //   1487: aload #31
    //   1489: aload #18
    //   1491: aload #47
    //   1493: <illegal opcode> get : (Lburp/Ztj1;)Ljava/util/function/Supplier;
    //   1498: aload #14
    //   1500: aload #44
    //   1502: aload #46
    //   1504: aload #34
    //   1506: aload #17
    //   1508: aload #30
    //   1510: aload #16
    //   1512: aload #23
    //   1514: invokespecial <init> : (Lburp/Ztwv;Lburp/Zsh8;Lburp/Zmuy;Lburp/Zx_d;Ljava/util/function/Consumer;Ljava/util/function/Supplier;Lburp/Zm3c;Lburp/Zzlx;Lburp/Zznr;Ljava/util/function/Function;Lburp/Zbyn;Lburp/Zemt;Ljava/util/function/Supplier;Lburp/Zb_x;Lburp/Ztvd;Lburp/Zeoh;Lburp/Zlok;Lburp/Ztou;Lburp/Zlpe;Lburp/Ze3w;Lburp/Zlee;)V
    //   1517: areturn
    // Exception table:
    //   from	to	target	type
    //   0	19	19	burp/Ztku
    //   170	188	188	burp/Ztku
    //   192	201	204	burp/Ztku
    //   1055	1091	1091	burp/Ztku
  }
  
  private void ZO(Zto9 paramZto9, Ze3w paramZe3w) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic burp/Zt13.ZV : Lburp/Zlnb;
    //   4: aload_2
    //   5: <illegal opcode> accept : (Lburp/Ze3w;)Ljava/util/function/Consumer;
    //   10: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   13: astore_3
    //   14: aload_1
    //   15: getstatic burp/Zt13.ZC : Lburp/Zlnb;
    //   18: aload_2
    //   19: <illegal opcode> accept : (Lburp/Ze3w;)Ljava/util/function/Consumer;
    //   24: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   27: astore #4
    //   29: new java/util/concurrent/atomic/AtomicReference
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: astore #5
    //   38: aload #5
    //   40: aload_1
    //   41: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   44: aload_2
    //   45: aload_3
    //   46: aload #4
    //   48: aload #5
    //   50: <illegal opcode> accept : (Lburp/Ze3w;Lburp/Zgrn;Lburp/Zgrn;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   55: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   58: invokevirtual set : (Ljava/lang/Object;)V
    //   61: return
  }
  
  private Supplier<Zl_q> Zl(Supplier<Ztj1> paramSupplier, Zznr paramZznr) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zew2;Ljava/util/function/Supplier;Lburp/Zznr;)Ljava/util/function/Supplier;
    //   8: areturn
  }
  
  public Zlvv Zm(Zxyn paramZxyn) throws Ze27, IOException {
    // Byte code:
    //   0: aload_1
    //   1: sipush #-19221
    //   4: sipush #-2146
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: invokevirtual Zm : (Ljava/lang/String;)Lburp/Zgyp;
    //   13: astore_2
    //   14: aload_0
    //   15: getfield ZR : Lburp/Zr_4;
    //   18: astore_3
    //   19: aload_2
    //   20: ifnonnull -> 44
    //   23: getstatic burp/Zmgc.SAVED_ATTACK_FILE_FORMAT : Lburp/Zmgc;
    //   26: aload_0
    //   27: getfield Zp : Lburp/Zskh;
    //   30: iconst_0
    //   31: anewarray java/lang/Object
    //   34: invokevirtual ZV : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   37: pop
    //   38: aconst_null
    //   39: areturn
    //   40: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: aload_0
    //   45: getfield Zt : Lburp/Zkl6;
    //   48: invokeinterface ZB : ()Lburp/Zbnt;
    //   53: astore #4
    //   55: sipush #-19230
    //   58: aload_2
    //   59: aload #4
    //   61: aload_3
    //   62: invokestatic Zm : (Lburp/Zgyp;Lburp/Zbnt;Lburp/Zr_4;)Lburp/Zsh8;
    //   65: astore #5
    //   67: sipush #17215
    //   70: aload #5
    //   72: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   75: pop
    //   76: aload_3
    //   77: new burp/Zxoy
    //   80: dup
    //   81: invokespecial <init> : ()V
    //   84: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   89: checkcast burp/Zlfa
    //   92: astore #6
    //   94: aload_0
    //   95: aload #5
    //   97: aload_3
    //   98: aload #6
    //   100: invokevirtual Zc : (Lburp/Zsh8;Lburp/Zr_4;Lburp/Zlfa;)Lburp/Zzys;
    //   103: astore #7
    //   105: aload #7
    //   107: invokeinterface ZNH : ()Lburp/Zmz1;
    //   112: astore #8
    //   114: aload #8
    //   116: invokeinterface Zek : ()Lburp/Zxxx;
    //   121: astore #9
    //   123: aload #7
    //   125: invokeinterface ZNJ : ()Lburp/Zz1y;
    //   130: astore #10
    //   132: new java/util/concurrent/atomic/AtomicReference
    //   135: dup
    //   136: invokespecial <init> : ()V
    //   139: astore #11
    //   141: new java/util/concurrent/atomic/AtomicReference
    //   144: dup
    //   145: invokespecial <init> : ()V
    //   148: astore #12
    //   150: new java/util/concurrent/atomic/AtomicReference
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: astore #13
    //   159: new java/util/concurrent/atomic/AtomicReference
    //   162: dup
    //   163: invokespecial <init> : ()V
    //   166: astore #14
    //   168: new java/util/concurrent/atomic/AtomicReference
    //   171: dup
    //   172: invokespecial <init> : ()V
    //   175: astore #15
    //   177: aload_0
    //   178: aload #7
    //   180: invokevirtual ZU : (Lburp/Zzys;)Lburp/Ztou;
    //   183: astore #16
    //   185: new burp/Zg03
    //   188: dup
    //   189: aload #8
    //   191: invokeinterface ZeF : ()Lburp/Zkgn;
    //   196: invokespecial <init> : (Lburp/Zkgn;)V
    //   199: astore #17
    //   201: new burp/Zb_x
    //   204: dup
    //   205: aload #9
    //   207: aload #10
    //   209: invokespecial <init> : (Lburp/Zxxx;Lburp/Zz1y;)V
    //   212: astore #18
    //   214: aload_0
    //   215: getfield Zq : Lburp/Zzc3;
    //   218: aload #7
    //   220: invokeinterface ZPo : ()I
    //   225: invokeinterface ZD : (I)Lburp/Ze3w;
    //   230: astore #19
    //   232: new burp/Zemt
    //   235: dup
    //   236: aload #17
    //   238: aload #16
    //   240: aload #18
    //   242: aload #19
    //   244: dup
    //   245: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   248: pop
    //   249: <illegal opcode> run : (Lburp/Ze3w;)Ljava/lang/Runnable;
    //   254: invokespecial <init> : (Lburp/Zg03;Lburp/Ztou;Lburp/Zb_x;Ljava/lang/Runnable;)V
    //   257: astore #20
    //   259: aload_0
    //   260: getfield ZA : Lburp/Zxea;
    //   263: aload #7
    //   265: invokevirtual Zt : (Lburp/Zgna;)Lburp/Zto9;
    //   268: astore #21
    //   270: aload_0
    //   271: aload #21
    //   273: aload #19
    //   275: invokevirtual ZO : (Lburp/Zto9;Lburp/Ze3w;)V
    //   278: new burp/Zl4e
    //   281: dup
    //   282: aload #18
    //   284: aload #5
    //   286: dup
    //   287: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   290: pop
    //   291: <illegal opcode> get : (Lburp/Zsh8;)Ljava/util/function/Supplier;
    //   296: aload #21
    //   298: <illegal opcode> run : (Lburp/Zto9;)Ljava/lang/Runnable;
    //   303: invokespecial <init> : (Lburp/Zb_x;Ljava/util/function/Supplier;Ljava/lang/Runnable;)V
    //   306: astore #22
    //   308: new burp/Zr_d
    //   311: dup
    //   312: aload #5
    //   314: invokeinterface ZPE : ()Lburp/Zxpp;
    //   319: invokeinterface ZwZ : ()Lburp/Zstu;
    //   324: aload #5
    //   326: invokeinterface ZPJ : ()Lburp/Zstu;
    //   331: new burp/Ztr7
    //   334: dup
    //   335: aload_0
    //   336: getfield Zt : Lburp/Zkl6;
    //   339: invokeinterface ZB : ()Lburp/Zbnt;
    //   344: invokespecial <init> : (Lburp/Zbnt;)V
    //   347: aload_3
    //   348: dup
    //   349: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   352: pop
    //   353: <illegal opcode> apply : (Lburp/Zr_4;)Ljava/util/function/Function;
    //   358: aload #5
    //   360: <illegal opcode> test : (Lburp/Zsh8;)Ljava/util/function/Predicate;
    //   365: invokespecial <init> : (Lburp/Zstu;Lburp/Zstu;Lburp/Ztr7;Ljava/util/function/Function;Ljava/util/function/Predicate;)V
    //   368: astore #23
    //   370: invokestatic a : (II)Ljava/lang/String;
    //   373: aload_2
    //   374: aload #5
    //   376: aload #15
    //   378: dup
    //   379: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   382: pop
    //   383: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   388: aload_3
    //   389: aload #22
    //   391: aload #23
    //   393: aload #6
    //   395: invokestatic Zm : (Ljava/lang/String;Lburp/Zgyp;Lburp/Zsh8;Ljava/util/function/Supplier;Lburp/Zr_4;Lburp/Zlpe;Lburp/Zr_d;Lburp/Zlfa;)Lburp/Zkar;
    //   398: astore #24
    //   400: sipush #-19218
    //   403: aload #24
    //   405: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   408: pop
    //   409: sipush #16773
    //   412: aload #8
    //   414: invokeinterface Zeg : ()Lburp/Ze5c;
    //   419: astore #25
    //   421: new burp/Zeo4
    //   424: dup
    //   425: invokespecial <init> : ()V
    //   428: astore #26
    //   430: new burp/Zz1e
    //   433: dup
    //   434: aload #5
    //   436: aload_0
    //   437: getfield Zp : Lburp/Zskh;
    //   440: invokespecial <init> : (Lburp/Zsh8;Lburp/Zskh;)V
    //   443: astore #27
    //   445: new burp/Zg2c
    //   448: dup
    //   449: aload #27
    //   451: invokespecial <init> : (Lburp/Zz1e;)V
    //   454: astore #28
    //   456: aload #25
    //   458: invokeinterface ZHJ : ()Lburp/Zlee;
    //   463: astore #29
    //   465: aload_0
    //   466: getfield Zs : Lburp/Zmw4;
    //   469: invokeinterface ZM : ()Lburp/Zbws;
    //   474: astore #30
    //   476: invokestatic a : (II)Ljava/lang/String;
    //   479: aload_2
    //   480: aload #23
    //   482: aload #4
    //   484: aload_3
    //   485: aload #25
    //   487: invokeinterface ZHZ : ()Lburp/Zefg;
    //   492: aload #28
    //   494: aload #17
    //   496: aload_0
    //   497: getfield Zu : Lburp/Zz0n;
    //   500: invokeinterface ZD : ()Lburp/Zb0h;
    //   505: aload #26
    //   507: aload #29
    //   509: aload_0
    //   510: getfield Za : I
    //   513: aload #30
    //   515: invokestatic Zs : (Ljava/lang/String;Lburp/Zgyp;Lburp/Zr_d;Lburp/Zbnt;Lburp/Zr_4;Lburp/Zefg;Lburp/Zg2c;Lburp/Zg03;Lburp/Zb0h;Lburp/Zeo4;Lburp/Zlee;ILburp/Zbws;)Lburp/Zmuy;
    //   518: astore #31
    //   520: aload #31
    //   522: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   525: pop
    //   526: aload_2
    //   527: aload #9
    //   529: aload #10
    //   531: dup
    //   532: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   535: pop
    //   536: <illegal opcode> accept : (Lburp/Zz1y;)Ljava/util/function/Consumer;
    //   541: invokestatic ZB : (Lburp/Zgyp;Lburp/Zxxx;Ljava/util/function/Consumer;)V
    //   544: new burp/Zxcm
    //   547: dup
    //   548: aconst_null
    //   549: aload #4
    //   551: invokespecial <init> : ([BLburp/Zbnt;)V
    //   554: astore #32
    //   556: new burp/Zk7k
    //   559: dup
    //   560: aload_0
    //   561: getfield Zl : Lburp/Ztg8;
    //   564: aload_0
    //   565: getfield ZS : Ljava/util/function/Supplier;
    //   568: invokeinterface get : ()Ljava/lang/Object;
    //   573: checkcast burp/Zbiv
    //   576: invokevirtual ZW : ()Lburp/Zrfd;
    //   579: dup
    //   580: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   583: pop
    //   584: <illegal opcode> accept : (Lburp/Zrfd;)Ljava/util/function/BiConsumer;
    //   589: aload #7
    //   591: aload_0
    //   592: getfield Zb : Lburp/Ztwv;
    //   595: aload #13
    //   597: dup
    //   598: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   601: pop
    //   602: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   607: aload_0
    //   608: getfield ZV : Ljava/util/function/Supplier;
    //   611: invokeinterface get : ()Ljava/lang/Object;
    //   616: checkcast burp/Zrqq
    //   619: aload_0
    //   620: getfield ZK : Ljava/util/function/Supplier;
    //   623: invokeinterface get : ()Ljava/lang/Object;
    //   628: checkcast burp/Zm0l
    //   631: aload_0
    //   632: getfield ZX : Lburp/Zxgc;
    //   635: invokeinterface ZK1 : ()Lburp/Zl04;
    //   640: aload_0
    //   641: getfield Zo : Lburp/Zxwj;
    //   644: new burp/Zeql
    //   647: dup
    //   648: invokespecial <init> : ()V
    //   651: new java/util/concurrent/atomic/AtomicBoolean
    //   654: dup
    //   655: iconst_0
    //   656: invokespecial <init> : (Z)V
    //   659: invokespecial <init> : (Lburp/Ztg8;Ljava/util/function/BiConsumer;Lburp/Zzys;Lburp/Ztwv;Ljava/util/function/Supplier;Lburp/Zrqq;Lburp/Zm0l;Ljava/awt/Window;Lburp/Zxwj;Lburp/Zggy;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    //   662: astore #33
    //   664: new burp/Zm3c
    //   667: dup
    //   668: aload #11
    //   670: dup
    //   671: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   674: pop
    //   675: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   680: aload #20
    //   682: aload #14
    //   684: dup
    //   685: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   688: pop
    //   689: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   694: aload #18
    //   696: aload #5
    //   698: aload_0
    //   699: getfield Zy : Lburp/Zmo9;
    //   702: aload_0
    //   703: getfield Zb : Lburp/Ztwv;
    //   706: aload_0
    //   707: getfield Zp : Lburp/Zskh;
    //   710: aload #31
    //   712: aload_3
    //   713: invokespecial <init> : (Ljava/util/function/Supplier;Lburp/Zemt;Ljava/util/function/Supplier;Lburp/Zb_x;Lburp/Zsh8;Lburp/Zmo9;Lburp/Ztwv;Lburp/Zskh;Lburp/Zmuy;Lburp/Zr_4;)V
    //   716: astore #34
    //   718: aload_0
    //   719: getfield ZL : Lburp/Zsw5;
    //   722: aload #32
    //   724: aload #33
    //   726: aload_3
    //   727: aload #13
    //   729: dup
    //   730: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   733: pop
    //   734: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   739: aload #34
    //   741: aload #22
    //   743: dup
    //   744: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   747: pop
    //   748: <illegal opcode> run : (Lburp/Zlpe;)Ljava/lang/Runnable;
    //   753: invokeinterface Zn : (Lburp/Zt84;Lburp/Zeg4;Lburp/Zr_4;Ljava/util/function/Supplier;Lburp/Zxaw;Ljava/lang/Runnable;)Lburp/Zbyn;
    //   758: astore #35
    //   760: aload #14
    //   762: aload #35
    //   764: invokevirtual set : (Ljava/lang/Object;)V
    //   767: new burp/Zx_d
    //   770: dup
    //   771: aload_0
    //   772: getfield Zy : Lburp/Zmo9;
    //   775: aload_0
    //   776: getfield Ze : Lnet/portswigger/Zl0;
    //   779: aload_0
    //   780: getfield ZP : Lburp/Zt4u;
    //   783: aload_0
    //   784: getfield ZH : Ljava/util/function/Supplier;
    //   787: invokeinterface get : ()Ljava/lang/Object;
    //   792: checkcast burp/Zkr6
    //   795: aload #35
    //   797: aload #31
    //   799: aload_0
    //   800: getfield Zp : Lburp/Zskh;
    //   803: aload #28
    //   805: dup
    //   806: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   809: pop
    //   810: <illegal opcode> apply : (Lburp/Zg2c;)Ljava/util/function/Function;
    //   815: aload #30
    //   817: invokespecial <init> : (Lburp/Zmo9;Lnet/portswigger/Zl0;Lburp/Zt4u;Lburp/Zkr6;Lburp/Zbyn;Lburp/Zmuy;Lburp/Zskh;Ljava/util/function/Function;Lburp/Zbws;)V
    //   820: astore #36
    //   822: aload_0
    //   823: getfield Zz : Lburp/Zskh;
    //   826: aload #7
    //   828: invokeinterface ZPo : ()I
    //   833: invokeinterface ZD : (I)Lburp/Zskh;
    //   838: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   841: invokeinterface ZQ : (Lburp/Zeew;)Lburp/Zskh;
    //   846: astore #37
    //   848: new burp/Zlok
    //   851: dup
    //   852: aload #9
    //   854: invokeinterface Zhi : ()Lburp/Zzcq;
    //   859: aload #16
    //   861: aload #18
    //   863: aload #10
    //   865: invokeinterface Zf7 : ()Lburp/Zzyg;
    //   870: invokespecial <init> : (Lburp/Zzcq;Lburp/Ztos;Lburp/Zb_x;Lburp/Zzyg;)V
    //   873: astore #38
    //   875: aload_0
    //   876: getfield ZM : Lburp/Zllh;
    //   879: aload #7
    //   881: invokevirtual Zz : (Lburp/Zzys;)V
    //   884: new burp/Zznr
    //   887: dup
    //   888: aload #16
    //   890: aload #10
    //   892: invokeinterface Zf7 : ()Lburp/Zzyg;
    //   897: aload #21
    //   899: aload_0
    //   900: aload #7
    //   902: <illegal opcode> run : (Lburp/Zew2;Lburp/Zzys;)Ljava/lang/Runnable;
    //   907: invokespecial <init> : (Lburp/Zz1m;Lburp/Zzyg;Lburp/Ztos;Ljava/lang/Runnable;)V
    //   910: astore #39
    //   912: aload_0
    //   913: aload #7
    //   915: aload #18
    //   917: aload #5
    //   919: invokevirtual ZQ : (Lburp/Zzys;Lburp/Zb_x;Lburp/Zsh8;)Lburp/Zx_v;
    //   922: astore #40
    //   924: aload_2
    //   925: aload_0
    //   926: getfield ZH : Ljava/util/function/Supplier;
    //   929: invokeinterface get : ()Ljava/lang/Object;
    //   934: checkcast burp/Zkr6
    //   937: aload_0
    //   938: getfield Zf : Lburp/Zerg;
    //   941: invokevirtual ZM : ()Lburp/Zgvn;
    //   944: aload #5
    //   946: aload #24
    //   948: aload #18
    //   950: aload #35
    //   952: aload #9
    //   954: invokeinterface Zhi : ()Lburp/Zzcq;
    //   959: aload #39
    //   961: aload #17
    //   963: aload #40
    //   965: invokestatic ZJ : (Lburp/Zgyp;Lburp/Zkr6;Lburp/Zgvn;Lburp/Zsh8;Lburp/Zkar;Lburp/Zb_x;Lburp/Zbyn;Lburp/Zzcq;Lburp/Zznr;Lburp/Zg03;Lburp/Zx_v;)Lburp/Zzlx;
    //   968: astore #41
    //   970: aload #15
    //   972: aload #41
    //   974: invokevirtual set : (Ljava/lang/Object;)V
    //   977: new burp/Zeaw
    //   980: dup
    //   981: aload_0
    //   982: getfield ZI : Lburp/Zr_4;
    //   985: invokeinterface Zi : ()Z
    //   990: aload #5
    //   992: invokeinterface ZPQ : ()Z
    //   997: ifne -> 1008
    //   1000: iconst_1
    //   1001: goto -> 1009
    //   1004: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1007: athrow
    //   1008: iconst_0
    //   1009: invokespecial <init> : (ZZ)V
    //   1012: astore #42
    //   1014: new burp/Zt3d
    //   1017: dup
    //   1018: aload #5
    //   1020: invokeinterface ZPQ : ()Z
    //   1025: aload #13
    //   1027: dup
    //   1028: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1031: pop
    //   1032: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   1037: invokespecial <init> : (ZLjava/util/function/Supplier;)V
    //   1040: astore #43
    //   1042: new burp/Zg7v
    //   1045: dup
    //   1046: aload_0
    //   1047: getfield Zf : Lburp/Zerg;
    //   1050: aload #24
    //   1052: aload_0
    //   1053: getfield Zp : Lburp/Zskh;
    //   1056: aload_0
    //   1057: getfield ZS : Ljava/util/function/Supplier;
    //   1060: invokeinterface get : ()Ljava/lang/Object;
    //   1065: checkcast burp/Zbiv
    //   1068: aload_0
    //   1069: getfield ZG : Lburp/Zgbj;
    //   1072: aload_0
    //   1073: getfield Zy : Lburp/Zmo9;
    //   1076: aload_0
    //   1077: getfield Zb : Lburp/Ztwv;
    //   1080: aload_0
    //   1081: getfield Zt : Lburp/Zkl6;
    //   1084: invokeinterface ZB : ()Lburp/Zbnt;
    //   1089: aload_0
    //   1090: getfield ZI : Lburp/Zr_4;
    //   1093: aload_0
    //   1094: getfield ZX : Lburp/Zxgc;
    //   1097: aload #12
    //   1099: <illegal opcode> accept : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   1104: aload #35
    //   1106: dup
    //   1107: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1110: pop
    //   1111: <illegal opcode> accept : (Lburp/Zbyn;)Ljava/util/function/Consumer;
    //   1116: aload_0
    //   1117: <illegal opcode> accept : (Lburp/Zew2;)Ljava/util/function/Consumer;
    //   1122: aload_0
    //   1123: getfield Zz : Lburp/Zskh;
    //   1126: aload #31
    //   1128: dup
    //   1129: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1132: pop
    //   1133: <illegal opcode> run : (Lburp/Zmuy;)Ljava/lang/Runnable;
    //   1138: aload_0
    //   1139: getfield ZT : Lburp/Zgb6;
    //   1142: invokeinterface ZU0 : ()Lburp/Zes1;
    //   1147: aload_0
    //   1148: getfield ZP : Lburp/Zt4u;
    //   1151: aload_0
    //   1152: getfield Ze : Lnet/portswigger/Zl0;
    //   1155: aload_0
    //   1156: getfield ZF : Lburp/Zgxi;
    //   1159: invokespecial <init> : (Lburp/Zerg;Lburp/Zkar;Lburp/Zskh;Lburp/Zbiv;Lburp/Zgbj;Lburp/Zmo9;Lburp/Ztwv;Lburp/Zbnt;Lburp/Zr_4;Lburp/Zxgc;Ljava/util/function/Consumer;Ljava/util/function/Consumer;Ljava/util/function/Consumer;Lburp/Zskh;Ljava/lang/Runnable;Lburp/Zes1;Lburp/Zmjm;Lnet/portswigger/Zl0;Lburp/Zgxi;)V
    //   1162: astore #44
    //   1164: new burp/Zgf3
    //   1167: dup
    //   1168: aload_0
    //   1169: getfield Zb : Lburp/Ztwv;
    //   1172: aload #12
    //   1174: dup
    //   1175: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1178: pop
    //   1179: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   1184: aload #35
    //   1186: aload #5
    //   1188: aload #36
    //   1190: aload #31
    //   1192: aload_0
    //   1193: getfield ZQ : Lburp/Zlpb;
    //   1196: aload #25
    //   1198: aload #10
    //   1200: invokeinterface Zf7 : ()Lburp/Zzyg;
    //   1205: aload #33
    //   1207: aload #42
    //   1209: aload #44
    //   1211: aload_0
    //   1212: getfield Zc : Lburp/Zxco;
    //   1215: aload #30
    //   1217: invokespecial <init> : (Lburp/Ztwv;Ljava/util/function/Supplier;Lburp/Zbyn;Lburp/Zsh8;Lburp/Zx_d;Lburp/Zmuy;Lburp/Zlpb;Lburp/Ze5c;Lburp/Zzyg;Lburp/Zeg4;Lburp/Zeaw;Lburp/Zg7v;Lburp/Zxco;Lburp/Zbws;)V
    //   1220: astore #45
    //   1222: aload #11
    //   1224: aload #45
    //   1226: invokevirtual set : (Ljava/lang/Object;)V
    //   1229: aload_0
    //   1230: aload #38
    //   1232: new burp/Zl_x
    //   1235: dup
    //   1236: aload #18
    //   1238: invokespecial <init> : (Lburp/Zb_x;)V
    //   1241: aload #21
    //   1243: aload #16
    //   1245: invokevirtual Zr : (Lburp/Zlok;Lburp/Zl_x;Lburp/Zlli;Lburp/Ztou;)V
    //   1248: aload #10
    //   1250: invokeinterface Zf7 : ()Lburp/Zzyg;
    //   1255: getstatic burp/Zev0.PAUSED : Lburp/Zev0;
    //   1258: invokeinterface ZM : (Lburp/Zev0;)V
    //   1263: aload #38
    //   1265: sipush #-19223
    //   1268: sipush #-13854
    //   1271: invokestatic a : (II)Ljava/lang/String;
    //   1274: aload #9
    //   1276: invokeinterface Zhf : ()I
    //   1281: invokestatic Zt : (Ljava/lang/String;I)Lburp/Zlj9;
    //   1284: invokevirtual ZY : (Lburp/Zlj9;)V
    //   1287: aload_0
    //   1288: aload #41
    //   1290: aload #5
    //   1292: aload #34
    //   1294: aload #39
    //   1296: aload #20
    //   1298: aload #18
    //   1300: aload #16
    //   1302: aload_3
    //   1303: aload #31
    //   1305: invokevirtual ZP : ()Lburp/Zxr3;
    //   1308: invokevirtual Zr : (Lburp/Zzlx;Lburp/Zsh8;Lburp/Zm3c;Lburp/Zznr;Lburp/Zemt;Lburp/Zb_x;Lburp/Ztou;Lburp/Zr_4;Lburp/Zxr3;)Lburp/Ztvd;
    //   1311: astore #46
    //   1313: new burp/Zkb3
    //   1316: dup
    //   1317: iconst_1
    //   1318: aload_0
    //   1319: aload #13
    //   1321: dup
    //   1322: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1325: pop
    //   1326: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   1331: aload #39
    //   1333: invokevirtual Zl : (Ljava/util/function/Supplier;Lburp/Zznr;)Ljava/util/function/Supplier;
    //   1336: aload #42
    //   1338: aload_0
    //   1339: getfield Zx : Lburp/Zrgm;
    //   1342: aload #33
    //   1344: invokespecial <init> : (ZLjava/util/function/Supplier;Lburp/Zeaw;Lburp/Zrgm;Lburp/Zeg4;)V
    //   1347: astore #47
    //   1349: new burp/Zeoh
    //   1352: dup
    //   1353: aload #45
    //   1355: aload #33
    //   1357: aload #47
    //   1359: aload_0
    //   1360: getfield Zh : Lburp/Zb_j;
    //   1363: aload #38
    //   1365: aload #16
    //   1367: aload_0
    //   1368: getfield ZI : Lburp/Zr_4;
    //   1371: invokeinterface Zi : ()Z
    //   1376: invokespecial <init> : (Lburp/Zgf3;Lburp/Zeg4;Lburp/Zkb3;Lburp/Zb_j;Lburp/Zlok;Lburp/Ztou;Z)V
    //   1379: astore #48
    //   1381: aload_0
    //   1382: aload #7
    //   1384: aload #18
    //   1386: aload #46
    //   1388: aload #48
    //   1390: invokestatic ZX : ()Lburp/Zb2y;
    //   1393: aload #37
    //   1395: aload #21
    //   1397: invokevirtual ZQ : (Lburp/Zzys;Lburp/Zb_x;Lburp/Ztvd;Lburp/Zl2h;Lburp/Zb2y;Lburp/Zskh;Lburp/Zto9;)Lburp/Ztj1;
    //   1400: astore #49
    //   1402: aload #9
    //   1404: invokeinterface Zhw : ()Z
    //   1409: ifeq -> 1463
    //   1412: aload #38
    //   1414: aload #9
    //   1416: invokeinterface ZhM : ()I
    //   1421: aload #9
    //   1423: invokeinterface ZhY : ()I
    //   1428: sipush #-19222
    //   1431: sipush #-8564
    //   1434: invokestatic a : (II)Ljava/lang/String;
    //   1437: swap
    //   1438: <illegal opcode> makeConcatWithConstants : (ILjava/lang/String;I)Ljava/lang/String;
    //   1443: bipush #100
    //   1445: invokestatic Zt : (Ljava/lang/String;I)Lburp/Zlj9;
    //   1448: invokevirtual ZY : (Lburp/Zlj9;)V
    //   1451: aload #49
    //   1453: invokevirtual Zp : ()V
    //   1456: goto -> 1463
    //   1459: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1462: athrow
    //   1463: aload #13
    //   1465: aload #49
    //   1467: invokevirtual set : (Ljava/lang/Object;)V
    //   1470: new burp/Zlvv
    //   1473: dup
    //   1474: aload_0
    //   1475: getfield Zb : Lburp/Ztwv;
    //   1478: aload #5
    //   1480: aload #31
    //   1482: aload #36
    //   1484: aload #12
    //   1486: dup
    //   1487: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1490: pop
    //   1491: <illegal opcode> accept : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   1496: aload_0
    //   1497: aload #49
    //   1499: <illegal opcode> get : (Lburp/Ztj1;)Ljava/util/function/Supplier;
    //   1504: aload #39
    //   1506: invokevirtual Zl : (Ljava/util/function/Supplier;Lburp/Zznr;)Ljava/util/function/Supplier;
    //   1509: aload #34
    //   1511: aload #41
    //   1513: aload #39
    //   1515: aload_0
    //   1516: <illegal opcode> apply : (Lburp/Zew2;)Ljava/util/function/Function;
    //   1521: aload #35
    //   1523: aload #20
    //   1525: aload #49
    //   1527: <illegal opcode> get : (Lburp/Ztj1;)Ljava/util/function/Supplier;
    //   1532: aload #18
    //   1534: aload #46
    //   1536: aload #48
    //   1538: aload #38
    //   1540: aload #16
    //   1542: aload #22
    //   1544: aload #19
    //   1546: aload #29
    //   1548: invokespecial <init> : (Lburp/Ztwv;Lburp/Zsh8;Lburp/Zmuy;Lburp/Zx_d;Ljava/util/function/Consumer;Ljava/util/function/Supplier;Lburp/Zm3c;Lburp/Zzlx;Lburp/Zznr;Ljava/util/function/Function;Lburp/Zbyn;Lburp/Zemt;Ljava/util/function/Supplier;Lburp/Zb_x;Lburp/Ztvd;Lburp/Zeoh;Lburp/Zlok;Lburp/Ztou;Lburp/Zlpe;Lburp/Ze3w;Lburp/Zlee;)V
    //   1551: areturn
    // Exception table:
    //   from	to	target	type
    //   19	40	40	burp/Ze27
    //   970	1004	1004	burp/Ze27
    //   1402	1456	1459	burp/Ze27
  }
  
  private void Zr(Zlok paramZlok, Zl_x paramZl_x, Zlli<Zt13> paramZlli, Ztou paramZtou) {
    // Byte code:
    //   0: aload #4
    //   2: getstatic burp/Zt1l.ZP : Lburp/Zlnb;
    //   5: aload_1
    //   6: aload_2
    //   7: <illegal opcode> accept : (Lburp/Zlok;Lburp/Zl_x;)Ljava/util/function/Consumer;
    //   12: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   15: pop
    //   16: aload_3
    //   17: getstatic burp/Zt13.ZC : Lburp/Zlnb;
    //   20: aload_1
    //   21: aload_2
    //   22: <illegal opcode> accept : (Lburp/Zlok;Lburp/Zl_x;)Ljava/util/function/Consumer;
    //   27: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   32: pop
    //   33: aload_3
    //   34: getstatic burp/Zt13.ZV : Lburp/Zlnb;
    //   37: aload_2
    //   38: <illegal opcode> accept : (Lburp/Zl_x;)Ljava/util/function/Consumer;
    //   43: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   48: pop
    //   49: return
  }
  
  private Ztj1 ZQ(Zzys paramZzys, Zb_x paramZb_x, Ztvd paramZtvd, Zl2h paramZl2h, Zb2y paramZb2y, Zskh paramZskh, Zto9 paramZto9) {
    Zbiv zbiv = this.ZS.get();
    try {
      if (zbiv == null)
        throw new IllegalStateException(a(-19217, -32284)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return zbiv.Zn(paramZtvd, this.Zf.Zk(), paramZzys, paramZb_x, paramZl2h, paramZb2y, paramZto9, paramZskh);
  }
  
  private Ztvd Zr(Zzlx paramZzlx, Zsh8 paramZsh8, Zm3c paramZm3c, Zznr paramZznr, Zemt paramZemt, Zb_x paramZb_x, Ztou paramZtou, Zr_4 paramZr_4, Zxr3 paramZxr3) {
    Zggp zggp = new Zggp(this.Zt.ZB(), this.Zp, this.ZE.get(), paramZsh8, this.Zt.ZH());
    return new Ztvd(paramZzlx, zggp, paramZsh8, paramZm3c, paramZr_4, this.ZJ, paramZb_x, paramZznr, this.Zb, paramZemt, paramZtou, this.ZT, this.Zj, paramZxr3);
  }
  
  private Zzys Zc(Zsh8 paramZsh8, Zr_4 paramZr_4, Zlfa paramZlfa) {
    Zkgn zkgn = paramZr_4.<Zkgn>ZH(new Ztzx());
    Zefg<Zgpi> zefg1 = Zkk.ZV(paramZr_4, Zzrc.Zj);
    Zlee zlee = paramZr_4.<Zlee>ZH(Zr2u.ZK());
    int i = this.Zo.ZL();
    String str = Zg1j.Zo();
    Zb4g zb4g = Zbit.Zw(paramZr_4, i);
    Zrpc.ZF(zb4g);
    Ze5c ze5c = paramZr_4.<Ze5c>ZH(new Zmvv(zlee, (Zefg)zefg1, zb4g));
    Zefg<Zgpi> zefg2 = Zkk.ZV(paramZr_4, Zgxp.ZN);
    Zxxx zxxx = paramZr_4.<Zxxx>ZH(new Zru_(paramZlfa, (Zefg)zefg2, paramZsh8.ZPX()));
    Zmz1 zmz1 = paramZr_4.<Zmz1>ZH(new Zret(paramZsh8, zkgn, ze5c, zxxx));
    Zzyg zzyg = paramZr_4.<Zzyg>ZH(new Zts4());
    Zz1y zz1y = paramZr_4.<Zz1y>ZH(new Zer6(zzyg));
    int j = ZF(paramZsh8);
    Zl5o zl5o = paramZr_4.<Zl5o>ZH(new Zrb4(j));
    return paramZr_4.<Zzys>ZH(new Zx5f(i, str, Zglq.Zv((paramZsh8.ZPa()).name, Arrays.asList(paramZsh8.ZPq().ZbF())), paramZsh8.ZPE().ZwZ().Zis(), zmz1, zz1y, zl5o));
  }
  
  private static int ZF(Zsh8 paramZsh8) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return paramZsh8.ZP0() ? 1 : Zrb4.ZU;
  }
  
  public Zlvv ZM(Zzys paramZzys, Supplier<Ztj1> paramSupplier, Zto9 paramZto9) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZNH : ()Lburp/Zmz1;
    //   6: astore #5
    //   8: aload #5
    //   10: invokeinterface Zek : ()Lburp/Zxxx;
    //   15: astore #6
    //   17: aload #5
    //   19: invokeinterface Zei : ()V
    //   24: new java/util/concurrent/atomic/AtomicReference
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: astore #7
    //   33: new java/util/concurrent/atomic/AtomicReference
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: astore #8
    //   42: new java/util/concurrent/atomic/AtomicReference
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: astore #9
    //   51: aload_0
    //   52: aload_1
    //   53: invokevirtual ZU : (Lburp/Zzys;)Lburp/Ztou;
    //   56: astore #10
    //   58: new burp/Zb_x
    //   61: dup
    //   62: aload #6
    //   64: aload_1
    //   65: invokeinterface ZNJ : ()Lburp/Zz1y;
    //   70: invokespecial <init> : (Lburp/Zxxx;Lburp/Zz1y;)V
    //   73: astore #11
    //   75: new burp/Zg03
    //   78: dup
    //   79: aload #5
    //   81: invokeinterface ZeF : ()Lburp/Zkgn;
    //   86: invokespecial <init> : (Lburp/Zkgn;)V
    //   89: astore #12
    //   91: aload_0
    //   92: getfield Zq : Lburp/Zzc3;
    //   95: aload_1
    //   96: invokeinterface ZPo : ()I
    //   101: invokeinterface ZD : (I)Lburp/Ze3w;
    //   106: astore #13
    //   108: aload_0
    //   109: aload_3
    //   110: aload #13
    //   112: invokevirtual ZO : (Lburp/Zto9;Lburp/Ze3w;)V
    //   115: new burp/Zemt
    //   118: dup
    //   119: aload #12
    //   121: aload #10
    //   123: aload #11
    //   125: aload #13
    //   127: dup
    //   128: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: <illegal opcode> run : (Lburp/Ze3w;)Ljava/lang/Runnable;
    //   137: invokespecial <init> : (Lburp/Zg03;Lburp/Ztou;Lburp/Zb_x;Ljava/lang/Runnable;)V
    //   140: astore #14
    //   142: aload #5
    //   144: invokeinterface Zeg : ()Lburp/Ze5c;
    //   149: astore #15
    //   151: aload #5
    //   153: invokeinterface ZeY : ()Lburp/Zsh8;
    //   158: astore #16
    //   160: new burp/Zeo4
    //   163: dup
    //   164: invokespecial <init> : ()V
    //   167: astore #17
    //   169: new burp/Zz1e
    //   172: dup
    //   173: aload #16
    //   175: aload_0
    //   176: getfield Zp : Lburp/Zskh;
    //   179: invokespecial <init> : (Lburp/Zsh8;Lburp/Zskh;)V
    //   182: astore #18
    //   184: new burp/Zg2c
    //   187: dup
    //   188: aload #18
    //   190: invokespecial <init> : (Lburp/Zz1e;)V
    //   193: astore #19
    //   195: aload #15
    //   197: invokeinterface ZHJ : ()Lburp/Zlee;
    //   202: astore #20
    //   204: aload_0
    //   205: getfield Zs : Lburp/Zmw4;
    //   208: invokeinterface ZM : ()Lburp/Zbws;
    //   213: astore #21
    //   215: new burp/Zmuy
    //   218: dup
    //   219: aload_0
    //   220: getfield ZI : Lburp/Zr_4;
    //   223: aload #15
    //   225: invokeinterface ZHZ : ()Lburp/Zefg;
    //   230: aload #19
    //   232: aload_0
    //   233: getfield Zu : Lburp/Zz0n;
    //   236: invokeinterface ZD : ()Lburp/Zb0h;
    //   241: aload #12
    //   243: aload #17
    //   245: aload #20
    //   247: aload_0
    //   248: getfield Za : I
    //   251: aload #21
    //   253: invokespecial <init> : (Lburp/Zr_4;Lburp/Zefg;Lburp/Zg2c;Lburp/Zb0h;Ljavafx/collections/ObservableList;Lburp/Zeo4;Lburp/Zlee;ILburp/Zbws;)V
    //   256: astore #22
    //   258: new burp/Zxcm
    //   261: dup
    //   262: aconst_null
    //   263: aload_0
    //   264: getfield Zt : Lburp/Zkl6;
    //   267: invokeinterface ZB : ()Lburp/Zbnt;
    //   272: invokespecial <init> : ([BLburp/Zbnt;)V
    //   275: astore #23
    //   277: new burp/Zm3c
    //   280: dup
    //   281: aload #8
    //   283: dup
    //   284: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   287: pop
    //   288: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   293: aload #14
    //   295: aload #9
    //   297: dup
    //   298: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   301: pop
    //   302: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   307: aload #11
    //   309: aload #16
    //   311: aload_0
    //   312: getfield Zy : Lburp/Zmo9;
    //   315: aload_0
    //   316: getfield Zb : Lburp/Ztwv;
    //   319: aload_0
    //   320: getfield Zp : Lburp/Zskh;
    //   323: aload #22
    //   325: aload_0
    //   326: getfield ZI : Lburp/Zr_4;
    //   329: invokespecial <init> : (Ljava/util/function/Supplier;Lburp/Zemt;Ljava/util/function/Supplier;Lburp/Zb_x;Lburp/Zsh8;Lburp/Zmo9;Lburp/Ztwv;Lburp/Zskh;Lburp/Zmuy;Lburp/Zr_4;)V
    //   332: astore #24
    //   334: invokestatic Zw : ()Z
    //   337: new burp/Zl4e
    //   340: dup
    //   341: aload #11
    //   343: aload #16
    //   345: dup
    //   346: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   349: pop
    //   350: <illegal opcode> get : (Lburp/Zsh8;)Ljava/util/function/Supplier;
    //   355: aload_3
    //   356: <illegal opcode> run : (Lburp/Zto9;)Ljava/lang/Runnable;
    //   361: invokespecial <init> : (Lburp/Zb_x;Ljava/util/function/Supplier;Ljava/lang/Runnable;)V
    //   364: astore #25
    //   366: aload_0
    //   367: getfield ZL : Lburp/Zsw5;
    //   370: aload #23
    //   372: getstatic burp/Zeg4.Zf : Lburp/Zeg4;
    //   375: aload_0
    //   376: getfield ZI : Lburp/Zr_4;
    //   379: aload_2
    //   380: aload #24
    //   382: aload #25
    //   384: dup
    //   385: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   388: pop
    //   389: <illegal opcode> run : (Lburp/Zlpe;)Ljava/lang/Runnable;
    //   394: invokeinterface Zn : (Lburp/Zt84;Lburp/Zeg4;Lburp/Zr_4;Ljava/util/function/Supplier;Lburp/Zxaw;Ljava/lang/Runnable;)Lburp/Zbyn;
    //   399: astore #26
    //   401: aload #9
    //   403: aload #26
    //   405: invokevirtual set : (Ljava/lang/Object;)V
    //   408: new burp/Zx_d
    //   411: dup
    //   412: aload_0
    //   413: getfield Zy : Lburp/Zmo9;
    //   416: aload_0
    //   417: getfield Ze : Lnet/portswigger/Zl0;
    //   420: aload_0
    //   421: getfield ZP : Lburp/Zt4u;
    //   424: aload_0
    //   425: getfield ZH : Ljava/util/function/Supplier;
    //   428: invokeinterface get : ()Ljava/lang/Object;
    //   433: checkcast burp/Zkr6
    //   436: aload #26
    //   438: aload #22
    //   440: aload_0
    //   441: getfield Zp : Lburp/Zskh;
    //   444: aload #19
    //   446: dup
    //   447: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   450: pop
    //   451: <illegal opcode> apply : (Lburp/Zg2c;)Ljava/util/function/Function;
    //   456: aload #21
    //   458: invokespecial <init> : (Lburp/Zmo9;Lnet/portswigger/Zl0;Lburp/Zt4u;Lburp/Zkr6;Lburp/Zbyn;Lburp/Zmuy;Lburp/Zskh;Ljava/util/function/Function;Lburp/Zbws;)V
    //   461: astore #27
    //   463: aload_1
    //   464: invokeinterface ZNJ : ()Lburp/Zz1y;
    //   469: invokeinterface Zf7 : ()Lburp/Zzyg;
    //   474: astore #28
    //   476: new burp/Zlok
    //   479: dup
    //   480: aload #6
    //   482: invokeinterface Zhi : ()Lburp/Zzcq;
    //   487: aload #10
    //   489: aload #11
    //   491: aload #28
    //   493: invokespecial <init> : (Lburp/Zzcq;Lburp/Ztos;Lburp/Zb_x;Lburp/Zzyg;)V
    //   496: astore #29
    //   498: aload #29
    //   500: aload #5
    //   502: invokeinterface ZeF : ()Lburp/Zkgn;
    //   507: invokevirtual ZS : (Lburp/Zkgn;)V
    //   510: aload_0
    //   511: getfield ZM : Lburp/Zllh;
    //   514: aload_1
    //   515: invokevirtual Zz : (Lburp/Zzys;)V
    //   518: new burp/Zznr
    //   521: dup
    //   522: aload #10
    //   524: aload #28
    //   526: aload_3
    //   527: aload_0
    //   528: aload_1
    //   529: <illegal opcode> run : (Lburp/Zew2;Lburp/Zzys;)Ljava/lang/Runnable;
    //   534: invokespecial <init> : (Lburp/Zz1m;Lburp/Zzyg;Lburp/Ztos;Ljava/lang/Runnable;)V
    //   537: astore #30
    //   539: istore #4
    //   541: new java/util/concurrent/atomic/AtomicReference
    //   544: dup
    //   545: invokespecial <init> : ()V
    //   548: astore #31
    //   550: aload_0
    //   551: aload_1
    //   552: aload #11
    //   554: aload #16
    //   556: invokevirtual ZQ : (Lburp/Zzys;Lburp/Zb_x;Lburp/Zsh8;)Lburp/Zx_v;
    //   559: astore #32
    //   561: new burp/Zzlx
    //   564: dup
    //   565: aload_0
    //   566: getfield Zf : Lburp/Zerg;
    //   569: invokevirtual ZM : ()Lburp/Zgvn;
    //   572: aload_0
    //   573: getfield ZH : Ljava/util/function/Supplier;
    //   576: invokeinterface get : ()Ljava/lang/Object;
    //   581: checkcast burp/Zkr6
    //   584: aload_0
    //   585: getfield Zp : Lburp/Zskh;
    //   588: aload_0
    //   589: getfield Zb : Lburp/Ztwv;
    //   592: aload #16
    //   594: aload #26
    //   596: aload #11
    //   598: aload #6
    //   600: invokeinterface Zhi : ()Lburp/Zzcq;
    //   605: aload #30
    //   607: aload #12
    //   609: aload #31
    //   611: dup
    //   612: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   615: pop
    //   616: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   621: aload #32
    //   623: invokespecial <init> : (Lburp/Zgvn;Lburp/Zkr6;Lburp/Zskh;Lburp/Ztwv;Lburp/Zsh8;Lburp/Zbyn;Lburp/Zb_x;Lburp/Zzcq;Lburp/Zznr;Lburp/Zg03;Ljava/util/function/Supplier;Lburp/Zx_v;)V
    //   626: astore #33
    //   628: new burp/Zr_d
    //   631: dup
    //   632: aload #16
    //   634: invokeinterface ZPE : ()Lburp/Zxpp;
    //   639: invokeinterface ZwZ : ()Lburp/Zstu;
    //   644: aload #16
    //   646: invokeinterface ZPJ : ()Lburp/Zstu;
    //   651: new burp/Ztr7
    //   654: dup
    //   655: aload_0
    //   656: getfield Zt : Lburp/Zkl6;
    //   659: invokeinterface ZB : ()Lburp/Zbnt;
    //   664: invokespecial <init> : (Lburp/Zbnt;)V
    //   667: aload_0
    //   668: getfield ZI : Lburp/Zr_4;
    //   671: dup
    //   672: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   675: pop
    //   676: <illegal opcode> apply : (Lburp/Zr_4;)Ljava/util/function/Function;
    //   681: aload #16
    //   683: <illegal opcode> test : (Lburp/Zsh8;)Ljava/util/function/Predicate;
    //   688: invokespecial <init> : (Lburp/Zstu;Lburp/Zstu;Lburp/Ztr7;Ljava/util/function/Function;Ljava/util/function/Predicate;)V
    //   691: astore #34
    //   693: aload #6
    //   695: invokeinterface Zh5 : ()Lburp/Zlfa;
    //   700: aload #16
    //   702: invokeinterface ZPg : ()Ljava/util/List;
    //   707: aload #34
    //   709: aload #16
    //   711: invokeinterface ZPa : ()Lburp/Zejb;
    //   716: aload #33
    //   718: aload_0
    //   719: getfield ZI : Lburp/Zr_4;
    //   722: invokestatic ZH : (Lburp/Zlfa;Ljava/util/List;Lburp/Zr_d;Lburp/Zejb;Lburp/Zzlx;Lburp/Zr_4;)Lburp/Zg8k;
    //   725: astore #35
    //   727: new burp/Zkar
    //   730: dup
    //   731: aload #16
    //   733: aload_0
    //   734: getfield ZI : Lburp/Zr_4;
    //   737: aload #35
    //   739: aload #11
    //   741: dup
    //   742: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   745: pop
    //   746: <illegal opcode> accept : (Lburp/Zb_x;)Ljava/util/function/Consumer;
    //   751: aload #25
    //   753: aload #34
    //   755: invokespecial <init> : (Lburp/Zsh8;Lburp/Zr_4;Lburp/Zg8k;Ljava/util/function/Consumer;Lburp/Zlpe;Lburp/Zr_d;)V
    //   758: astore #36
    //   760: aload #31
    //   762: aload #36
    //   764: invokevirtual set : (Ljava/lang/Object;)V
    //   767: new burp/Zeaw
    //   770: dup
    //   771: aload_0
    //   772: getfield ZI : Lburp/Zr_4;
    //   775: invokeinterface Zi : ()Z
    //   780: aload #16
    //   782: invokeinterface ZPQ : ()Z
    //   787: ifne -> 798
    //   790: iconst_1
    //   791: goto -> 799
    //   794: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   797: athrow
    //   798: iconst_0
    //   799: invokespecial <init> : (ZZ)V
    //   802: astore #37
    //   804: new burp/Zt3d
    //   807: dup
    //   808: aload #16
    //   810: invokeinterface ZPQ : ()Z
    //   815: aload_2
    //   816: invokespecial <init> : (ZLjava/util/function/Supplier;)V
    //   819: astore #38
    //   821: new burp/Zg7v
    //   824: dup
    //   825: aload_0
    //   826: getfield Zf : Lburp/Zerg;
    //   829: aload #36
    //   831: aload_0
    //   832: getfield Zp : Lburp/Zskh;
    //   835: aload_0
    //   836: getfield ZS : Ljava/util/function/Supplier;
    //   839: invokeinterface get : ()Ljava/lang/Object;
    //   844: checkcast burp/Zbiv
    //   847: aload_0
    //   848: getfield ZG : Lburp/Zgbj;
    //   851: aload_0
    //   852: getfield Zy : Lburp/Zmo9;
    //   855: aload_0
    //   856: getfield Zb : Lburp/Ztwv;
    //   859: aload_0
    //   860: getfield Zt : Lburp/Zkl6;
    //   863: invokeinterface ZB : ()Lburp/Zbnt;
    //   868: aload_0
    //   869: getfield ZI : Lburp/Zr_4;
    //   872: aload_0
    //   873: getfield ZX : Lburp/Zxgc;
    //   876: aload #7
    //   878: <illegal opcode> accept : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   883: aload #26
    //   885: dup
    //   886: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   889: pop
    //   890: <illegal opcode> accept : (Lburp/Zbyn;)Ljava/util/function/Consumer;
    //   895: aload_0
    //   896: <illegal opcode> accept : (Lburp/Zew2;)Ljava/util/function/Consumer;
    //   901: aload_0
    //   902: getfield Zz : Lburp/Zskh;
    //   905: aload #22
    //   907: dup
    //   908: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   911: pop
    //   912: <illegal opcode> run : (Lburp/Zmuy;)Ljava/lang/Runnable;
    //   917: aload_0
    //   918: getfield ZT : Lburp/Zgb6;
    //   921: invokeinterface ZU0 : ()Lburp/Zes1;
    //   926: aload_0
    //   927: getfield ZP : Lburp/Zt4u;
    //   930: aload_0
    //   931: getfield Ze : Lnet/portswigger/Zl0;
    //   934: aload_0
    //   935: getfield ZF : Lburp/Zgxi;
    //   938: invokespecial <init> : (Lburp/Zerg;Lburp/Zkar;Lburp/Zskh;Lburp/Zbiv;Lburp/Zgbj;Lburp/Zmo9;Lburp/Ztwv;Lburp/Zbnt;Lburp/Zr_4;Lburp/Zxgc;Ljava/util/function/Consumer;Ljava/util/function/Consumer;Ljava/util/function/Consumer;Lburp/Zskh;Ljava/lang/Runnable;Lburp/Zes1;Lburp/Zmjm;Lnet/portswigger/Zl0;Lburp/Zgxi;)V
    //   941: astore #39
    //   943: new burp/Zgf3
    //   946: dup
    //   947: aload_0
    //   948: getfield Zb : Lburp/Ztwv;
    //   951: aload #7
    //   953: dup
    //   954: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   957: pop
    //   958: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   963: aload #26
    //   965: aload #16
    //   967: aload #27
    //   969: aload #22
    //   971: aload_0
    //   972: getfield ZQ : Lburp/Zlpb;
    //   975: aload #15
    //   977: aload #28
    //   979: getstatic burp/Zeg4.Zf : Lburp/Zeg4;
    //   982: aload #37
    //   984: aload #39
    //   986: aload_0
    //   987: getfield Zc : Lburp/Zxco;
    //   990: aload #21
    //   992: invokespecial <init> : (Lburp/Ztwv;Ljava/util/function/Supplier;Lburp/Zbyn;Lburp/Zsh8;Lburp/Zx_d;Lburp/Zmuy;Lburp/Zlpb;Lburp/Ze5c;Lburp/Zzyg;Lburp/Zeg4;Lburp/Zeaw;Lburp/Zg7v;Lburp/Zxco;Lburp/Zbws;)V
    //   995: astore #40
    //   997: aload #8
    //   999: aload #40
    //   1001: invokevirtual set : (Ljava/lang/Object;)V
    //   1004: aload #28
    //   1006: invokeinterface Zyq : ()Lburp/Zev0;
    //   1011: getstatic burp/Zev0.PAUSED : Lburp/Zev0;
    //   1014: if_acmpne -> 1038
    //   1017: aload #29
    //   1019: sipush #-19223
    //   1022: sipush #-13854
    //   1025: invokestatic a : (II)Ljava/lang/String;
    //   1028: invokevirtual Zy : (Ljava/lang/String;)V
    //   1031: goto -> 1038
    //   1034: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1037: athrow
    //   1038: aload_0
    //   1039: aload #29
    //   1041: new burp/Zl_x
    //   1044: dup
    //   1045: aload #11
    //   1047: invokespecial <init> : (Lburp/Zb_x;)V
    //   1050: aload_3
    //   1051: aload #10
    //   1053: invokevirtual Zr : (Lburp/Zlok;Lburp/Zl_x;Lburp/Zlli;Lburp/Ztou;)V
    //   1056: new burp/Zr10
    //   1059: dup
    //   1060: aload #33
    //   1062: invokespecial <init> : (Lburp/Zzlx;)V
    //   1065: astore #41
    //   1067: aload #41
    //   1069: aload #5
    //   1071: invokeinterface ZeF : ()Lburp/Zkgn;
    //   1076: invokevirtual Zg : (Lburp/Zkgn;)V
    //   1079: aload_0
    //   1080: aload #33
    //   1082: aload #16
    //   1084: aload #24
    //   1086: aload #30
    //   1088: aload #14
    //   1090: aload #11
    //   1092: aload #10
    //   1094: aload_0
    //   1095: getfield ZI : Lburp/Zr_4;
    //   1098: aload #22
    //   1100: invokevirtual ZP : ()Lburp/Zxr3;
    //   1103: invokevirtual Zr : (Lburp/Zzlx;Lburp/Zsh8;Lburp/Zm3c;Lburp/Zznr;Lburp/Zemt;Lburp/Zb_x;Lburp/Ztou;Lburp/Zr_4;Lburp/Zxr3;)Lburp/Ztvd;
    //   1106: astore #42
    //   1108: new burp/Zkb3
    //   1111: dup
    //   1112: iconst_0
    //   1113: aload_0
    //   1114: aload_2
    //   1115: aload #30
    //   1117: invokevirtual Zl : (Ljava/util/function/Supplier;Lburp/Zznr;)Ljava/util/function/Supplier;
    //   1120: aload #37
    //   1122: aload_0
    //   1123: getfield Zx : Lburp/Zrgm;
    //   1126: getstatic burp/Zeg4.Zf : Lburp/Zeg4;
    //   1129: invokespecial <init> : (ZLjava/util/function/Supplier;Lburp/Zeaw;Lburp/Zrgm;Lburp/Zeg4;)V
    //   1132: astore #43
    //   1134: new burp/Zeoh
    //   1137: dup
    //   1138: aload #40
    //   1140: getstatic burp/Zeg4.Zf : Lburp/Zeg4;
    //   1143: aload #43
    //   1145: aload_0
    //   1146: getfield Zh : Lburp/Zb_j;
    //   1149: aload #29
    //   1151: aload #10
    //   1153: aload_0
    //   1154: getfield ZI : Lburp/Zr_4;
    //   1157: invokeinterface Zi : ()Z
    //   1162: invokespecial <init> : (Lburp/Zgf3;Lburp/Zeg4;Lburp/Zkb3;Lburp/Zb_j;Lburp/Zlok;Lburp/Ztou;Z)V
    //   1165: astore #44
    //   1167: new burp/Zlvv
    //   1170: dup
    //   1171: aload_0
    //   1172: getfield Zb : Lburp/Ztwv;
    //   1175: aload #16
    //   1177: aload #22
    //   1179: aload #27
    //   1181: aload #7
    //   1183: dup
    //   1184: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1187: pop
    //   1188: <illegal opcode> accept : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   1193: aload_0
    //   1194: aload_2
    //   1195: aload #30
    //   1197: invokevirtual Zl : (Ljava/util/function/Supplier;Lburp/Zznr;)Ljava/util/function/Supplier;
    //   1200: aload #24
    //   1202: aload #33
    //   1204: aload #30
    //   1206: aload_0
    //   1207: <illegal opcode> apply : (Lburp/Zew2;)Ljava/util/function/Function;
    //   1212: aload #26
    //   1214: aload #14
    //   1216: aload_2
    //   1217: aload #11
    //   1219: aload #42
    //   1221: aload #44
    //   1223: aload #29
    //   1225: aload #10
    //   1227: aload #25
    //   1229: aload #13
    //   1231: aload #20
    //   1233: invokespecial <init> : (Lburp/Ztwv;Lburp/Zsh8;Lburp/Zmuy;Lburp/Zx_d;Ljava/util/function/Consumer;Ljava/util/function/Supplier;Lburp/Zm3c;Lburp/Zzlx;Lburp/Zznr;Ljava/util/function/Function;Lburp/Zbyn;Lburp/Zemt;Ljava/util/function/Supplier;Lburp/Zb_x;Lburp/Ztvd;Lburp/Zeoh;Lburp/Zlok;Lburp/Ztou;Lburp/Zlpe;Lburp/Ze3w;Lburp/Zlee;)V
    //   1236: iload #4
    //   1238: ifeq -> 1248
    //   1241: iconst_2
    //   1242: anewarray burp/Zbqc
    //   1245: invokestatic Zr : ([Lburp/Zbqc;)V
    //   1248: areturn
    // Exception table:
    //   from	to	target	type
    //   760	794	794	java/lang/IllegalStateException
    //   997	1031	1034	java/lang/IllegalStateException
  }
  
  private Ztou ZU(Zzys paramZzys) {
    Ztou ztou = this.ZZ.Zo(paramZzys.ZPo());
    ztou.ZE(Zt1l.Ze, this::lambda$getIntruderAttackEventBus$30);
    return ztou;
  }
  
  private Zx_v ZQ(Zzys paramZzys, Zb_x paramZb_x, Zsh8 paramZsh8) {
    return new Zl2s(paramZzys.ZPo(), paramZb_x::lambda$createIntruderCollaboratorInterface$31, this.Zf.ZC(), paramZsh8);
  }
  
  private static boolean ZZ(int paramInt, Zsh8 paramZsh8) {
    try {
      if (paramInt != 0)
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zrte<Ze9k> zrte = paramZsh8.ZPq();
    try {
      if (zrte.Zpu() == 1)
        try {
          if (((Ze9k)zrte.ZdF(0)).Zyi() == Zzvm.NULL_PAYLOADS);
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  private static Integer lambda$createIntruderCollaboratorInterface$31(Zb_x paramZb_x) {
    return Integer.valueOf(paramZb_x.Zw() + 1);
  }
  
  private void lambda$getIntruderAttackEventBus$30(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::lambda$getIntruderAttackEventBus$29);
  }
  
  private void lambda$getIntruderAttackEventBus$29(Zzqc paramZzqc) {
    this.Zp.ZQ(Zeew.DASHBOARD).ZD(paramZzqc.Zbu()).Zl(Zkqn.INFORMATION, a(-19224, 29208));
    this.Zf.Zk().ZD(-1, true, true, true);
  }
  
  private static void lambda$setupTaskEventSubscriptions$23(Zl_x paramZl_x, Zxr8 paramZxr8) {
    paramZxr8.ZP(paramZl_x::lambda$setupTaskEventSubscriptions$22);
  }
  
  private static void lambda$setupTaskEventSubscriptions$22(Zl_x paramZl_x, Ztak paramZtak) {
    try {
      if (paramZtak.ZX())
        paramZl_x.ZG(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private static void lambda$setupTaskEventSubscriptions$21(Zlok paramZlok, Zl_x paramZl_x, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> accept : (Lburp/Zlok;Lburp/Zl_x;)Ljava/util/function/Consumer;
    //   8: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   11: return
  }
  
  private static void lambda$setupTaskEventSubscriptions$20(Zlok paramZlok, Zl_x paramZl_x, Zst9 paramZst9) {
    try {
      if (paramZst9.ZB()) {
        paramZlok.Zy(a(-19220, -3010));
        paramZl_x.Zb();
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private static void lambda$setupTaskEventSubscriptions$19(Zlok paramZlok, Zl_x paramZl_x, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> accept : (Lburp/Zlok;Lburp/Zl_x;)Ljava/util/function/Consumer;
    //   8: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   11: return
  }
  
  private static void lambda$setupTaskEventSubscriptions$18(Zlok paramZlok, Zl_x paramZl_x, Zev0 paramZev0) {
    try {
      if (paramZev0 == Zev0.FINISHED) {
        paramZlok.Zr(Zlj9.Zt(a(-19219, -18292), 100));
        paramZl_x.ZZ();
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private static boolean lambda$createAttackControllerFromSerialisedData$12(Zsh8 paramZsh8, Integer paramInteger) {
    return ZZ(paramInteger.intValue(), paramZsh8);
  }
  
  private Zl_q lambda$getAttackResultsViewTaskController$10(Supplier paramSupplier, Zznr paramZznr) {
    return new Zt5m(this, paramSupplier, paramZznr);
  }
  
  private static void lambda$subscribePerformanceMonitorToTask$9(Ze3w paramZe3w, Zgrn paramZgrn1, Zgrn paramZgrn2, AtomicReference<Zgrn> paramAtomicReference, Zxr8 paramZxr8) {
    paramZe3w.Zr();
    paramZgrn1.ZZ();
    paramZgrn2.ZZ();
    ((Zgrn)paramAtomicReference.get()).ZZ();
  }
  
  private static void lambda$subscribePerformanceMonitorToTask$8(Ze3w paramZe3w, Zxr8 paramZxr8) {
    paramZe3w.Zr();
  }
  
  private static void lambda$subscribePerformanceMonitorToTask$7(Ze3w paramZe3w, Zxr8 paramZxr8) {
    paramZe3w.Zt();
  }
  
  private static Ztj1 lambda$createAttackController$5(Ztj1 paramZtj1) {
    return paramZtj1;
  }
  
  private void lambda$createAttackController$4(String paramString) {
    this.Zu.ZD().ZR(paramString);
  }
  
  private static void lambda$createAttackController$3(AtomicReference<Zlvv> paramAtomicReference, List<Zgxp> paramList) {
    ((Zlvv)paramAtomicReference.get()).ZC(paramList);
  }
  
  private void lambda$createAttackController$2(Zzys paramZzys) {
    this.ZZ.ZI(paramZzys.ZPo());
    this.ZM.Zf(paramZzys);
  }
  
  private static void lambda$createAttackController$1(Zto9 paramZto9) {
    paramZto9.ZD(Zt13.Zf);
  }
  
  private static boolean lambda$createAttackController$0(Zxw4 paramZxw4, Integer paramInteger) {
    return ZZ(paramInteger.intValue(), paramZxw4.ZF);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '©\\f nµóØ¨;;>j Ñ2j*^HÖIzÊz^©oãyØD>g[ÜØÁ$+ÉãË3E#Ù*xÿí¯¿ò~È;æº¯P¡D/£KU"=vMHzt]95SêÆÙ@\\tq"cëWrR4Ð¸ÐwlÚÓ\\b×y(@'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #84
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'yZåV¨ÂË©'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #8
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #110
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zew2.a : [Ljava/lang/String;
    //   131: bipush #9
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zew2.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #29
    //   214: goto -> 244
    //   217: bipush #37
    //   219: goto -> 244
    //   222: bipush #42
    //   224: goto -> 244
    //   227: bipush #55
    //   229: goto -> 244
    //   232: bipush #34
    //   234: goto -> 244
    //   237: bipush #48
    //   239: goto -> 244
    //   242: bipush #72
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB4EA) & 0xFFFF;
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
      char c = 'ù';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zew2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */