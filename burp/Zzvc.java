package burp;

import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zd6;
import net.portswigger.browser.Zev;
import net.portswigger.browser.Zjt;
import net.portswigger.browser.Zth;
import net.portswigger.browser.Ztv;

class Zzvc {
  private final Zrp0 ZC;
  
  private final Zz3v ZH;
  
  private final Zsib<Exception> Zi;
  
  private final Runnable ZL;
  
  private final AtomicBoolean ZZ;
  
  private final Object ZT = new Object();
  
  final Zzb ZM;
  
  private static final String a;
  
  private Zzvc(Zzb paramZzb, Zev paramZev, Zrp0 paramZrp0, Zz3v paramZz3v, Runnable paramRunnable) {
    this.ZC = paramZrp0;
    this.ZH = paramZz3v;
    this.Zi = new Zsib<>(paramZev);
    this.ZL = paramRunnable;
    this.ZZ = new AtomicBoolean();
  }
  
  private void Zv() {
    try {
      if (this.ZZ.compareAndSet(false, true))
        this.ZL.run(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  Zsib<Exception> Zp() throws Zmnt, Zmny, Zmn5 {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zi : Lburp/Zsib;
    //   4: invokevirtual Za : ()Ljava/util/List;
    //   7: invokeinterface isEmpty : ()Z
    //   12: ifne -> 29
    //   15: aload_0
    //   16: getfield Zi : Lburp/Zsib;
    //   19: invokevirtual Za : ()Ljava/util/List;
    //   22: goto -> 36
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_0
    //   30: getfield Zi : Lburp/Zsib;
    //   33: invokevirtual ZF : ()Ljava/util/List;
    //   36: astore_1
    //   37: aload_1
    //   38: invokeinterface isEmpty : ()Z
    //   43: ifne -> 191
    //   46: aload_1
    //   47: invokeinterface getLast : ()Ljava/lang/Object;
    //   52: checkcast burp/Zgb7
    //   55: astore_2
    //   56: aload_2
    //   57: invokevirtual Zy : ()Ljava/util/Optional;
    //   60: invokevirtual isPresent : ()Z
    //   63: ifeq -> 191
    //   66: aload_2
    //   67: invokevirtual Zy : ()Ljava/util/Optional;
    //   70: invokevirtual get : ()Ljava/lang/Object;
    //   73: checkcast java/lang/Exception
    //   76: astore_3
    //   77: aload_3
    //   78: dup
    //   79: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   82: pop
    //   83: astore #4
    //   85: iconst_0
    //   86: istore #5
    //   88: aload #4
    //   90: iload #5
    //   92: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   97: tableswitch default -> 168, 0 -> 128, 1 -> 138, 2 -> 148, 3 -> 158
    //   128: aload #4
    //   130: checkcast burp/Zmnt
    //   133: astore #6
    //   135: aload #6
    //   137: athrow
    //   138: aload #4
    //   140: checkcast burp/Zmny
    //   143: astore #7
    //   145: aload #7
    //   147: athrow
    //   148: aload #4
    //   150: checkcast burp/Zmn5
    //   153: astore #8
    //   155: aload #8
    //   157: athrow
    //   158: aload #4
    //   160: checkcast java/lang/RuntimeException
    //   163: astore #9
    //   165: aload #9
    //   167: athrow
    //   168: iconst_0
    //   169: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   172: aload_3
    //   173: invokevirtual getClass : ()Ljava/lang/Class;
    //   176: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   179: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   182: new java/lang/RuntimeException
    //   185: dup
    //   186: aload_3
    //   187: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   190: athrow
    //   191: aload_0
    //   192: getfield Zi : Lburp/Zsib;
    //   195: areturn
    // Exception table:
    //   from	to	target	type
    //   0	25	25	burp/Zmnt
  }
  
  Zd6 Zh(Ztv paramZtv, Zjt paramZjt) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> Zq : (Lburp/Zzvc;Lnet/portswigger/browser/Zjt;)Lburp/Zeat;
    //   8: aload_0
    //   9: getfield ZM : Lburp/Zzb;
    //   12: getfield ZO : Lburp/Zg10;
    //   15: invokestatic Zl : (Lnet/portswigger/browser/Zjt;Lburp/Zeat;Lburp/Zg10;)Ljava/util/Optional;
    //   18: aload_0
    //   19: aload_2
    //   20: aload_1
    //   21: <illegal opcode> get : (Lburp/Zzvc;Lnet/portswigger/browser/Zjt;Lnet/portswigger/browser/Ztv;)Ljava/util/function/Supplier;
    //   26: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   29: checkcast net/portswigger/browser/Zd6
    //   32: areturn
  }
  
  private Zz0z Zl(Ztgw paramZtgw) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZM : Lburp/Zzb;
    //   8: getfield ZH : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   11: invokevirtual get : ()Z
    //   14: ifne -> 29
    //   17: new burp/Zz5y
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: areturn
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_0
    //   30: aload_1
    //   31: invokevirtual Ze : (Lburp/Ztgw;)I
    //   34: bipush #28
    //   36: if_icmplt -> 51
    //   39: new burp/Zz5y
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: areturn
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: aload_1
    //   52: invokevirtual ZE : ()Z
    //   55: ifeq -> 91
    //   58: aload_0
    //   59: aload_1
    //   60: invokevirtual Ze : (Lburp/Ztgw;)I
    //   63: bipush #18
    //   65: if_icmple -> 91
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: aload_1
    //   76: aconst_null
    //   77: invokestatic ZU : (Lburp/Ztgw;Ljava/lang/Object;)Lburp/Zgbv;
    //   80: astore_3
    //   81: aload_0
    //   82: getfield Zi : Lburp/Zsib;
    //   85: aload_3
    //   86: invokevirtual Zy : (Lburp/Zgb7;)V
    //   89: aload_3
    //   90: areturn
    //   91: aload_0
    //   92: getfield Zi : Lburp/Zsib;
    //   95: aload_1
    //   96: invokevirtual ZA : (Lburp/Ztgw;)Z
    //   99: ifeq -> 135
    //   102: aload_0
    //   103: getfield ZH : Lburp/Zz3v;
    //   106: invokevirtual ZY : ()Z
    //   109: ifne -> 135
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   118: athrow
    //   119: aload_1
    //   120: aconst_null
    //   121: invokestatic ZU : (Lburp/Ztgw;Ljava/lang/Object;)Lburp/Zgbv;
    //   124: astore_3
    //   125: aload_0
    //   126: getfield Zi : Lburp/Zsib;
    //   129: aload_3
    //   130: invokevirtual Zy : (Lburp/Zgb7;)V
    //   133: aload_3
    //   134: areturn
    //   135: aload_0
    //   136: getfield ZM : Lburp/Zzb;
    //   139: getfield ZT : Lburp/Zgb6;
    //   142: invokeinterface ZU0 : ()Lburp/Zes1;
    //   147: aload_1
    //   148: invokevirtual Zt : ()Lburp/Zmzk;
    //   151: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   156: invokevirtual ZM : (Ljava/lang/String;)Z
    //   159: ifeq -> 213
    //   162: aload_1
    //   163: aload_0
    //   164: getfield Zi : Lburp/Zsib;
    //   167: invokevirtual Zf : ()Z
    //   170: ifeq -> 198
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   179: athrow
    //   180: new burp/Zmny
    //   183: dup
    //   184: aload_0
    //   185: getfield ZC : Lburp/Zrp0;
    //   188: invokespecial <init> : (Lburp/Zrp0;)V
    //   191: goto -> 199
    //   194: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   197: athrow
    //   198: aconst_null
    //   199: invokestatic ZU : (Lburp/Ztgw;Ljava/lang/Object;)Lburp/Zgbv;
    //   202: astore_3
    //   203: aload_0
    //   204: getfield Zi : Lburp/Zsib;
    //   207: aload_3
    //   208: invokevirtual Zy : (Lburp/Zgb7;)V
    //   211: aload_3
    //   212: areturn
    //   213: aload_0
    //   214: getfield ZM : Lburp/Zzb;
    //   217: getfield ZD : Lburp/Zz28;
    //   220: ifnull -> 391
    //   223: aload_0
    //   224: getfield ZM : Lburp/Zzb;
    //   227: getfield ZD : Lburp/Zz28;
    //   230: aload_1
    //   231: invokevirtual Zd : ()Lburp/Zski;
    //   234: invokeinterface ZyR : ()Lburp/Zlit;
    //   239: invokeinterface ZG : (Lburp/Zlit;)Z
    //   244: ifne -> 391
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   253: athrow
    //   254: aload_0
    //   255: getfield ZM : Lburp/Zzb;
    //   258: getfield ZW : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   261: invokevirtual get : ()Z
    //   264: ifne -> 391
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   273: athrow
    //   274: aload_0
    //   275: getfield Zi : Lburp/Zsib;
    //   278: aload_1
    //   279: invokevirtual ZA : (Lburp/Ztgw;)Z
    //   282: ifne -> 326
    //   285: goto -> 292
    //   288: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   291: athrow
    //   292: aload_0
    //   293: getfield ZM : Lburp/Zzb;
    //   296: getfield Zm : Ljava/util/List;
    //   299: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   304: aload_0
    //   305: aload_1
    //   306: <illegal opcode> test : (Lburp/Zzvc;Lburp/Ztgw;)Ljava/util/function/Predicate;
    //   311: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   316: ifeq -> 391
    //   319: goto -> 326
    //   322: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   325: athrow
    //   326: aload_1
    //   327: aload_1
    //   328: invokevirtual ZE : ()Z
    //   331: ifeq -> 376
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   340: athrow
    //   341: aload_0
    //   342: getfield Zi : Lburp/Zsib;
    //   345: invokevirtual Zf : ()Z
    //   348: ifeq -> 376
    //   351: goto -> 358
    //   354: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   357: athrow
    //   358: new burp/Zmny
    //   361: dup
    //   362: aload_0
    //   363: getfield ZC : Lburp/Zrp0;
    //   366: invokespecial <init> : (Lburp/Zrp0;)V
    //   369: goto -> 377
    //   372: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   375: athrow
    //   376: aconst_null
    //   377: invokestatic ZU : (Lburp/Ztgw;Ljava/lang/Object;)Lburp/Zgbv;
    //   380: astore_3
    //   381: aload_0
    //   382: getfield Zi : Lburp/Zsib;
    //   385: aload_3
    //   386: invokevirtual Zy : (Lburp/Zgb7;)V
    //   389: aload_3
    //   390: areturn
    //   391: aload_1
    //   392: invokevirtual ZE : ()Z
    //   395: ifne -> 431
    //   398: aload_0
    //   399: getfield ZM : Lburp/Zzb;
    //   402: getfield ZX : Lburp/Zzs1;
    //   405: aload_1
    //   406: invokeinterface Zo : (Lburp/Ztgw;)Ljava/util/Optional;
    //   411: astore_3
    //   412: aload_3
    //   413: invokevirtual isPresent : ()Z
    //   416: ifeq -> 431
    //   419: aload_3
    //   420: invokevirtual get : ()Ljava/lang/Object;
    //   423: checkcast burp/Zz0z
    //   426: areturn
    //   427: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   430: athrow
    //   431: aconst_null
    //   432: astore_3
    //   433: aload_0
    //   434: getfield ZH : Lburp/Zz3v;
    //   437: invokevirtual Z_ : ()Ljava/time/Duration;
    //   440: astore #4
    //   442: iconst_0
    //   443: istore #5
    //   445: aload_1
    //   446: invokestatic Zy : (Lburp/Ztgw;)Lburp/Zxe7;
    //   449: astore #6
    //   451: aload_0
    //   452: getfield ZH : Lburp/Zz3v;
    //   455: invokevirtual ZJ : ()Lburp/Zkks;
    //   458: aload_1
    //   459: invokevirtual ZP : ()Lburp/Zefx;
    //   462: aload_0
    //   463: getfield Zi : Lburp/Zsib;
    //   466: aload_1
    //   467: invokevirtual ZB : (Lburp/Ztgw;)I
    //   470: aload_1
    //   471: invokevirtual ZE : ()Z
    //   474: invokevirtual Zd : (Lburp/Zefx;IZ)Z
    //   477: ifeq -> 549
    //   480: aload_0
    //   481: aload_1
    //   482: invokevirtual Zm : (Lburp/Ztgw;)Lburp/Zxe7;
    //   485: astore #6
    //   487: aload_0
    //   488: getfield ZH : Lburp/Zz3v;
    //   491: invokevirtual Zb : ()Z
    //   494: ifne -> 542
    //   497: aload_0
    //   498: getfield ZH : Lburp/Zz3v;
    //   501: invokevirtual ZU : ()Z
    //   504: ifeq -> 542
    //   507: goto -> 514
    //   510: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   513: athrow
    //   514: aload_0
    //   515: getfield ZH : Lburp/Zz3v;
    //   518: invokevirtual ZJ : ()Lburp/Zkks;
    //   521: invokevirtual ZL : ()Z
    //   524: ifeq -> 542
    //   527: goto -> 534
    //   530: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   533: athrow
    //   534: iconst_1
    //   535: goto -> 543
    //   538: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   541: athrow
    //   542: iconst_0
    //   543: istore #5
    //   545: aload_2
    //   546: ifnonnull -> 584
    //   549: aload_1
    //   550: invokevirtual ZE : ()Z
    //   553: ifne -> 584
    //   556: goto -> 563
    //   559: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   562: athrow
    //   563: ldc2_w 10
    //   566: invokestatic ofSeconds : (J)Ljava/time/Duration;
    //   569: astore_3
    //   570: aload_0
    //   571: getfield ZM : Lburp/Zzb;
    //   574: getfield Zj : Lburp/Zzmb;
    //   577: invokeinterface Zy : ()Ljava/time/Duration;
    //   582: astore #4
    //   584: aload_0
    //   585: aload #6
    //   587: aload_3
    //   588: aload #4
    //   590: iload #5
    //   592: invokevirtual Zr : (Lburp/Zxe7;Ljava/time/Duration;Ljava/time/Duration;Z)Lburp/Zz0z;
    //   595: areturn
    //   596: astore #7
    //   598: aload #7
    //   600: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   603: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   606: aload_0
    //   607: getfield ZM : Lburp/Zzb;
    //   610: getfield Zj : Lburp/Zzmb;
    //   613: invokeinterface ZD : ()Lburp/Zmv7;
    //   618: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   621: getstatic burp/Zlq7.INSERTION_POINT_NOT_FOUND : Lburp/Zlq7;
    //   624: iconst_2
    //   625: anewarray java/lang/Object
    //   628: dup
    //   629: iconst_0
    //   630: aload_0
    //   631: getfield ZC : Lburp/Zrp0;
    //   634: aastore
    //   635: dup
    //   636: iconst_1
    //   637: aload #7
    //   639: invokevirtual Zj : ()Lburp/Zscq;
    //   642: aastore
    //   643: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   648: aload_0
    //   649: aload_1
    //   650: new burp/Zmnt
    //   653: dup
    //   654: aload_0
    //   655: getfield ZC : Lburp/Zrp0;
    //   658: aload #7
    //   660: invokevirtual Zj : ()Lburp/Zscq;
    //   663: invokespecial <init> : (Lburp/Zrp0;Lburp/Zscq;)V
    //   666: invokevirtual Zp : (Lburp/Ztgw;Ljava/lang/Exception;)Lburp/Zz0z;
    //   669: areturn
    // Exception table:
    //   from	to	target	type
    //   4	25	25	burp/Zrj5
    //   29	47	47	burp/Zrj5
    //   51	68	71	burp/Zrj5
    //   91	112	115	burp/Zrj5
    //   135	173	176	burp/Zrj5
    //   162	194	194	burp/Zrj5
    //   213	247	250	burp/Zrj5
    //   223	267	270	burp/Zrj5
    //   254	285	288	burp/Zrj5
    //   274	319	322	burp/Zrj5
    //   292	334	337	burp/Zrj5
    //   326	351	354	burp/Zrj5
    //   341	372	372	burp/Zrj5
    //   412	427	427	burp/Zrj5
    //   451	595	596	burp/Zrj5
    //   487	507	510	burp/Zrj5
    //   497	527	530	burp/Zrj5
    //   514	538	538	burp/Zrj5
    //   545	556	559	burp/Zrj5
  }
  
  private Zxe7 Zm(Ztgw paramZtgw) throws Zrj5 {
    try {
      Zxgd zxgd = this.ZH.Zc();
      synchronized (this.ZT) {
        if (!this.Zi.ZA()) {
          Zefx zefx = zxgd.Zo(paramZtgw.ZP());
          this.Zi.ZS(paramZtgw);
          return new Zxe7(paramZtgw, zefx, zxgd.ZO(), zxgd.Zh(), this.ZH.ZD());
        } 
      } 
    } catch (Zscq zscq) {
      try {
        if (paramZtgw.ZE()) {
          Zah.Zl(zscq, Zk_.RETHROWN);
          throw new Zrj5(zscq);
        } 
      } catch (Zscq zscq1) {
        throw a(null);
      } 
      Zah.Zl(zscq, Zk_.IGNORED);
    } 
    return Zxe7.Zy(paramZtgw);
  }
  
  private Zxx0 ZU(Zjt paramZjt, Zstu paramZstu) {
    try {
      Ztgw ztgw = Ztgw.Zc(paramZjt, new Zkvk(Ze2m.PATH_EXECUTOR, this.ZM.Zj), this.ZM.Zp, paramZstu);
      Zz0z zz0z = Zl(ztgw);
      return Zxx0.Z_(zz0z);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.RETHROWN);
      return Zxx0.Zf();
    } 
  }
  
  private int Ze(Ztgw paramZtgw) {
    return this.Zi.ZB(paramZtgw);
  }
  
  private Zz0z Zr(Zxe7 paramZxe7, Duration paramDuration1, Duration paramDuration2, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield ZM : Lburp/Zzb;
    //   9: getfield ZS : Lburp/Zkvp;
    //   12: aload_1
    //   13: getfield ZB : Lburp/Zlgm;
    //   16: aload_1
    //   17: getfield ZA : Lburp/Zefx;
    //   20: aload_2
    //   21: aload_3
    //   22: aload_1
    //   23: getfield Zu : Lburp/Ze45;
    //   26: aload_1
    //   27: getfield ZP : Z
    //   30: getstatic burp/Zxfj.ZI : Lburp/Zxfj;
    //   33: invokevirtual Zl : (Lburp/Zlgm;Lburp/Zefx;Ljava/time/Duration;Ljava/time/Duration;Lburp/Ze45;ZLburp/Zsil;)Lburp/Zsxd;
    //   36: astore #6
    //   38: aload #6
    //   40: invokeinterface ZG : ()Lburp/Zg3d;
    //   45: astore #7
    //   47: aload_1
    //   48: getfield Za : Lburp/Ztgw;
    //   51: aload #6
    //   53: invokestatic ZA : (Lburp/Ztgw;Lburp/Zsxd;)Lburp/Zgb7;
    //   56: astore #8
    //   58: aload #7
    //   60: invokeinterface Zb : ()Lburp/Zvom;
    //   65: getstatic burp/Zvom.RESPONSE_RECEIVED : Lburp/Zvom;
    //   68: if_acmpeq -> 217
    //   71: aload #7
    //   73: invokeinterface Zb : ()Lburp/Zvom;
    //   78: getstatic burp/Zvom.TIMED_OUT : Lburp/Zvom;
    //   81: if_acmpne -> 119
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: aload_0
    //   92: getfield ZM : Lburp/Zzb;
    //   95: getfield ZX : Lburp/Zzs1;
    //   98: aload_1
    //   99: getfield Za : Lburp/Ztgw;
    //   102: invokeinterface ZY : (Lburp/Ztgw;)V
    //   107: aload #5
    //   109: ifnonnull -> 210
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   118: athrow
    //   119: aload #7
    //   121: invokeinterface Zb : ()Lburp/Zvom;
    //   126: getstatic burp/Zvom.CONNECTION_FAILED : Lburp/Zvom;
    //   129: if_acmpeq -> 159
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: aload #7
    //   141: invokeinterface Zb : ()Lburp/Zvom;
    //   146: getstatic burp/Zvom.UNKNOWN_HOST : Lburp/Zvom;
    //   149: if_acmpne -> 187
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: aload_0
    //   160: getfield ZM : Lburp/Zzb;
    //   163: getfield ZX : Lburp/Zzs1;
    //   166: aload_1
    //   167: getfield Za : Lburp/Ztgw;
    //   170: invokeinterface Zi : (Lburp/Ztgw;)V
    //   175: aload #5
    //   177: ifnonnull -> 210
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: aload_0
    //   188: getfield ZM : Lburp/Zzb;
    //   191: getfield ZX : Lburp/Zzs1;
    //   194: aload_1
    //   195: getfield Za : Lburp/Ztgw;
    //   198: invokeinterface Zv : (Lburp/Ztgw;)V
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   209: athrow
    //   210: aload_0
    //   211: aload #8
    //   213: invokevirtual Zk : (Lburp/Zgb7;)Lburp/Zz0z;
    //   216: areturn
    //   217: aload #8
    //   219: invokevirtual ZD : ()Z
    //   222: ifeq -> 236
    //   225: aload_0
    //   226: aload #8
    //   228: invokevirtual Zk : (Lburp/Zgb7;)Lburp/Zz0z;
    //   231: areturn
    //   232: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   235: athrow
    //   236: iload #4
    //   238: ifeq -> 272
    //   241: aload_0
    //   242: aload #8
    //   244: invokevirtual ZX : (Lburp/Zgb7;)Z
    //   247: ifne -> 272
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   256: athrow
    //   257: aload_0
    //   258: aload #8
    //   260: invokevirtual Zk : (Lburp/Zgb7;)Lburp/Zz0z;
    //   263: astore #9
    //   265: aload_0
    //   266: invokevirtual Zv : ()V
    //   269: aload #9
    //   271: areturn
    //   272: aload_0
    //   273: getfield ZM : Lburp/Zzb;
    //   276: getfield ZX : Lburp/Zzs1;
    //   279: aload #8
    //   281: invokeinterface ZW : (Lburp/Zgb7;)V
    //   286: aload_0
    //   287: getfield Zi : Lburp/Zsib;
    //   290: aload #8
    //   292: invokevirtual Zy : (Lburp/Zgb7;)V
    //   295: aload #8
    //   297: areturn
    //   298: astore #6
    //   300: aload #6
    //   302: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   305: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   308: aload #6
    //   310: getfield Zy : Lburp/Zkhr;
    //   313: getstatic burp/Zkhr.CONNECTION_FAILURE : Lburp/Zkhr;
    //   316: if_acmpeq -> 337
    //   319: aload #6
    //   321: getfield Zy : Lburp/Zkhr;
    //   324: getstatic burp/Zkhr.UNKNOWN_HOST : Lburp/Zkhr;
    //   327: if_acmpne -> 365
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   336: athrow
    //   337: aload_0
    //   338: getfield ZM : Lburp/Zzb;
    //   341: getfield ZX : Lburp/Zzs1;
    //   344: aload_1
    //   345: getfield Za : Lburp/Ztgw;
    //   348: invokeinterface Zi : (Lburp/Ztgw;)V
    //   353: aload #5
    //   355: ifnonnull -> 434
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   364: athrow
    //   365: aload #6
    //   367: getfield Zy : Lburp/Zkhr;
    //   370: getstatic burp/Zkhr.TIMED_OUT : Lburp/Zkhr;
    //   373: if_acmpne -> 411
    //   376: goto -> 383
    //   379: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   382: athrow
    //   383: aload_0
    //   384: getfield ZM : Lburp/Zzb;
    //   387: getfield ZX : Lburp/Zzs1;
    //   390: aload_1
    //   391: getfield Za : Lburp/Ztgw;
    //   394: invokeinterface ZY : (Lburp/Ztgw;)V
    //   399: aload #5
    //   401: ifnonnull -> 434
    //   404: goto -> 411
    //   407: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   410: athrow
    //   411: aload_0
    //   412: getfield ZM : Lburp/Zzb;
    //   415: getfield ZX : Lburp/Zzs1;
    //   418: aload_1
    //   419: getfield Za : Lburp/Ztgw;
    //   422: invokeinterface Zv : (Lburp/Ztgw;)V
    //   427: goto -> 434
    //   430: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   433: athrow
    //   434: aload_0
    //   435: aload_1
    //   436: getfield Za : Lburp/Ztgw;
    //   439: aload #6
    //   441: invokevirtual Zp : (Lburp/Ztgw;Ljava/lang/Exception;)Lburp/Zz0z;
    //   444: areturn
    //   445: astore #6
    //   447: aload #6
    //   449: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   452: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   455: aload_0
    //   456: aload_1
    //   457: getfield Za : Lburp/Ztgw;
    //   460: aload #6
    //   462: invokevirtual Zp : (Lburp/Ztgw;Ljava/lang/Exception;)Lburp/Zz0z;
    //   465: areturn
    // Exception table:
    //   from	to	target	type
    //   5	216	298	burp/Zm_j
    //   5	216	445	burp/Zktz
    //   58	84	87	burp/Zm_j
    //   71	112	115	burp/Zm_j
    //   91	132	135	burp/Zm_j
    //   119	152	155	burp/Zm_j
    //   139	180	183	burp/Zm_j
    //   159	203	206	burp/Zm_j
    //   217	231	298	burp/Zm_j
    //   217	231	445	burp/Zktz
    //   217	232	232	burp/Zscq
    //   236	250	253	burp/Zm_j
    //   236	271	298	burp/Zm_j
    //   236	271	445	burp/Zktz
    //   272	297	298	burp/Zm_j
    //   272	297	445	burp/Zktz
    //   300	330	333	burp/Zm_j
    //   319	358	361	burp/Zm_j
    //   337	376	379	burp/Zm_j
    //   365	404	407	burp/Zm_j
    //   383	427	430	burp/Zm_j
  }
  
  private Zz0z Zk(Zgb7<Exception> paramZgb7) {
    Zgbv<Exception> zgbv = paramZgb7.ZA(null);
    this.Zi.Zy(zgbv);
    return zgbv;
  }
  
  private Zz0z Zp(Ztgw paramZtgw, Exception paramException) {
    Zgbv<Exception> zgbv = Zgbv.ZU(paramZtgw, paramException);
    this.Zi.Zy(zgbv);
    return zgbv;
  }
  
  private boolean ZX(Zgb7<Exception> paramZgb7) {
    Optional<Zsxd> optional = paramZgb7.Zk();
    try {
      if (optional.isEmpty())
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Zb6q zb6q = ((Zsxd)optional.get()).ZG().Ze();
    try {
      if (zb6q == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (Zgyj.ZZ(zb6q.Zm(), a, false) != null);
  }
  
  private boolean lambda$issueRequest$2(Ztgw paramZtgw, Zmk2 paramZmk2) {
    return paramZmk2.ZT(paramZtgw, this.ZM.Zj);
  }
  
  private Zd6 lambda$issueRequest$1(Zjt paramZjt, Ztv paramZtv) {
    try {
      Ztgw ztgw = Ztgw.Zn(paramZjt, paramZtv, new Zkvk(Ze2m.PATH_EXECUTOR, this.ZM.Zj), this.ZM.Zp);
      return Zl(ztgw).Zm();
    } catch (Zxg5|Zxgy|java.net.MalformedURLException zxg5) {
      Zah.Zl(zxg5, Zk_.IGNORED);
    } catch (Zk8e zk8e) {
      try {
      
      } catch (Zxg5 zxg5) {
        throw a(null);
      } 
      Zah.Zl(zk8e, this.ZM.ZH.get() ? Zk_.COMMON_RUNTIME_FAILURE : Zk_.IGNORED);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
    return (Zd6)new Zth();
  }
  
  private Zxx0 lambda$issueRequest$0(Zjt paramZjt, Zstu paramZstu) {
    return ZU(paramZjt, paramZstu);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #68
    //   2: ldc '[!h;\\n!Myt'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzvc.a : Ljava/lang/String;
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
    //   80: bipush #83
    //   82: goto -> 112
    //   85: bipush #10
    //   87: goto -> 112
    //   90: bipush #79
    //   92: goto -> 112
    //   95: bipush #30
    //   97: goto -> 112
    //   100: bipush #58
    //   102: goto -> 112
    //   105: bipush #12
    //   107: goto -> 112
    //   110: bipush #102
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzvc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */