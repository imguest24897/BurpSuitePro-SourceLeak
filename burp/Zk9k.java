package burp;

import burp.api.montoya.internal.MontoyaObjectFactory;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class Zk9k implements Zgf2 {
  private final Zz0n Z_;
  
  private final Zbqx Zq;
  
  private final Zerg ZP;
  
  private final Zkl6 ZE;
  
  private final Ztwv Zk;
  
  private final Ztks ZB;
  
  private final Zbjl ZQ;
  
  private final Zlaa Zw;
  
  private final Zl77 ZC;
  
  private final Ztyg ZV;
  
  private final Zgq7 ZY;
  
  private final Zs4c ZA;
  
  private final Zslu Zh;
  
  private final Zbnt Ze;
  
  private final Zr_4 ZZ;
  
  private final Zra1 Zr;
  
  private final Zxlg Zm;
  
  private final Zrid ZU;
  
  private final Zs0n ZO;
  
  private final MontoyaObjectFactory ZD;
  
  private final Zm6x Zu;
  
  private final Zmr3 Zs;
  
  private final Zm6v ZW;
  
  private final Supplier<Zbiv> Zp;
  
  private final Zz3j ZK;
  
  private final Zsus ZT;
  
  private static int ZL;
  
  private static final String a;
  
  public Zk9k(Zz0n paramZz0n, Zbqx paramZbqx, Zerg paramZerg, Zkl6 paramZkl6, Ztwv paramZtwv, Ztks paramZtks, Zbjl paramZbjl, Zlaa paramZlaa, Zl77 paramZl77, Ztyg paramZtyg, Zgq7 paramZgq7, Zs4c paramZs4c, Zz8a paramZz8a, Zslu paramZslu, Zbnt paramZbnt, Zr_4 paramZr_4, Zra1 paramZra1, Zm6v paramZm6v, Supplier<Zbiv> paramSupplier, Zz3j paramZz3j, Zrid paramZrid, Zs0n paramZs0n, MontoyaObjectFactory paramMontoyaObjectFactory, Zm6x paramZm6x, Zmr3 paramZmr3) {
    this.Z_ = paramZz0n;
    this.Zq = paramZbqx;
    this.ZP = paramZerg;
    this.ZE = paramZkl6;
    this.Zk = paramZtwv;
    this.ZB = paramZtks;
    this.ZQ = paramZbjl;
    this.Zw = paramZlaa;
    this.ZC = paramZl77;
    this.ZV = paramZtyg;
    this.ZY = paramZgq7;
    this.ZA = paramZs4c;
    this.Zh = paramZslu;
    this.Ze = paramZbnt;
    this.ZZ = paramZr_4;
    this.Zr = paramZra1;
    this.ZW = paramZm6v;
    this.Zp = paramSupplier;
    this.ZK = paramZz3j;
    this.ZU = paramZrid;
    this.ZO = paramZs0n;
    this.ZD = paramMontoyaObjectFactory;
    this.Zu = paramZm6x;
    this.Zs = paramZmr3;
    this.ZT = new Zsus(paramZkl6, paramZr_4);
    this.Zm = new Zxlg(paramZz8a);
  }
  
  public Zgn4 ZP(Zmo3 paramZmo3, List<Zrm2> paramList, Zxj8 paramZxj8) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zq : ()Ljava/util/Optional;
    //   6: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   11: invokevirtual orElseThrow : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   14: checkcast burp/Zsvm
    //   17: astore #5
    //   19: new java/util/concurrent/atomic/AtomicInteger
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #6
    //   28: aload_2
    //   29: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   34: aload_0
    //   35: aload #6
    //   37: <illegal opcode> apply : (Lburp/Zk9k;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Function;
    //   42: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   47: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   52: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   57: invokeinterface toList : ()Ljava/util/List;
    //   62: astore #7
    //   64: aload #6
    //   66: invokevirtual get : ()I
    //   69: istore #8
    //   71: aload_0
    //   72: getfield ZZ : Lburp/Zr_4;
    //   75: new burp/Ztwg
    //   78: dup
    //   79: iconst_1
    //   80: iconst_0
    //   81: invokespecial <init> : (ZZ)V
    //   84: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   89: checkcast burp/Zl34
    //   92: astore #9
    //   94: aload_0
    //   95: getfield ZZ : Lburp/Zr_4;
    //   98: new burp/Ztwg
    //   101: dup
    //   102: iconst_0
    //   103: invokespecial <init> : (Z)V
    //   106: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   111: checkcast burp/Zl34
    //   114: astore #10
    //   116: aload_0
    //   117: getfield ZZ : Lburp/Zr_4;
    //   120: new burp/Zmks
    //   123: dup
    //   124: iconst_1
    //   125: iconst_0
    //   126: ldc ''
    //   128: ldc ''
    //   130: ldc ''
    //   132: invokespecial <init> : (ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   135: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   140: checkcast burp/Zmy8
    //   143: astore #11
    //   145: aload #9
    //   147: invokeinterface ZjM : ()Lburp/Zefg;
    //   152: aload #11
    //   154: invokeinterface add : (Ljava/lang/Object;)Z
    //   159: pop
    //   160: new burp/Zzxj
    //   163: dup
    //   164: aload_0
    //   165: getfield Ze : Lburp/Zbnt;
    //   168: aload_0
    //   169: getfield ZZ : Lburp/Zr_4;
    //   172: invokespecial <init> : (Lburp/Zbnt;Lburp/Zr_4;)V
    //   175: astore #12
    //   177: aload #12
    //   179: aload #9
    //   181: aload #10
    //   183: invokevirtual ZU : (Lburp/Zl34;Lburp/Zl34;)V
    //   186: new burp/Ztfs
    //   189: dup
    //   190: getstatic burp/Zkcl.SCAN_AUDIT : Lburp/Zkcl;
    //   193: aload #12
    //   195: invokestatic emptyList : ()Ljava/util/List;
    //   198: aload #7
    //   200: invokespecial <init> : (Lburp/Zkcl;Lburp/Zzxj;Ljava/util/List;Ljava/util/List;)V
    //   203: astore #13
    //   205: new burp/Zkv4
    //   208: dup
    //   209: aload #13
    //   211: getstatic burp/Zz5.ZO : Lburp/Zz5;
    //   214: new burp/Zgyw
    //   217: dup
    //   218: aload_0
    //   219: getfield Zm : Lburp/Zxlg;
    //   222: invokevirtual ZC : ()Ljava/util/List;
    //   225: invokespecial <init> : (Ljava/util/List;)V
    //   228: new burp/Zmpo
    //   231: dup
    //   232: invokestatic emptyList : ()Ljava/util/List;
    //   235: invokespecial <init> : (Ljava/util/List;)V
    //   238: getstatic burp/Zk9k.a : Ljava/lang/String;
    //   241: iconst_1
    //   242: iconst_1
    //   243: iconst_0
    //   244: iconst_0
    //   245: iconst_0
    //   246: iconst_0
    //   247: iconst_0
    //   248: iconst_0
    //   249: iconst_0
    //   250: iconst_0
    //   251: iconst_0
    //   252: invokestatic emptyList : ()Ljava/util/List;
    //   255: invokestatic ZP : (Ljava/lang/String;ZIZIZZIZZZZLjava/util/List;)Lburp/Zb2y;
    //   258: getstatic burp/Zlj4.EXTENDER : Lburp/Zlj4;
    //   261: iconst_0
    //   262: invokespecial <init> : (Lburp/Ztfs;Lburp/Zz5;Lburp/Zgyw;Lburp/Zmpo;Lburp/Zb2y;Lburp/Zlj4;Z)V
    //   265: astore #14
    //   267: aload_0
    //   268: getfield ZZ : Lburp/Zr_4;
    //   271: new burp/Zl3g
    //   274: dup
    //   275: invokespecial <init> : ()V
    //   278: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   283: checkcast burp/Zzir
    //   286: astore #15
    //   288: aload #15
    //   290: invokeinterface Zv9 : ()Lburp/Zz4b;
    //   295: astore #16
    //   297: aload #16
    //   299: invokeinterface ZVR : ()Lburp/Zmju;
    //   304: getstatic burp/Zmti.PAUSED : Lburp/Zmti;
    //   307: invokeinterface ZP : (Lburp/Zmti;)V
    //   312: new burp/Zg0s
    //   315: dup
    //   316: aload #16
    //   318: invokestatic Zd : (Lburp/Zz4b;)Lburp/Zefg;
    //   321: invokespecial <init> : (Lburp/Zefg;)V
    //   324: astore #17
    //   326: new burp/Zs2g
    //   329: dup
    //   330: aload_0
    //   331: getfield ZZ : Lburp/Zr_4;
    //   334: aload_0
    //   335: getfield Z_ : Lburp/Zz0n;
    //   338: invokeinterface ZP : ()Lburp/Zrgd;
    //   343: aload #17
    //   345: invokespecial <init> : (Lburp/Zr_4;Lburp/Zrgd;Lburp/Zg0s;)V
    //   348: astore #18
    //   350: new burp/Zzqg
    //   353: dup
    //   354: aload #18
    //   356: invokespecial <init> : (Lburp/Zs2g;)V
    //   359: astore #19
    //   361: new burp/Zx46
    //   364: dup
    //   365: aload_0
    //   366: getfield Zk : Lburp/Ztwv;
    //   369: invokespecial <init> : (Lburp/Ztwv;)V
    //   372: astore #20
    //   374: new burp/Zz_s
    //   377: dup
    //   378: aload #20
    //   380: new burp/Zmur
    //   383: dup
    //   384: aload #20
    //   386: invokespecial <init> : (Lburp/Zx46;)V
    //   389: invokespecial <init> : (Lburp/Zx46;Lburp/Zmur;)V
    //   392: astore #21
    //   394: new burp/Ztd
    //   397: dup
    //   398: aload #21
    //   400: invokespecial <init> : (Lburp/Zz_s;)V
    //   403: astore #22
    //   405: new burp/Ztos
    //   408: dup
    //   409: invokestatic ZS : ()Lburp/Zt1s;
    //   412: invokespecial <init> : (Lburp/Zt3y;)V
    //   415: astore #23
    //   417: new burp/Zgu7
    //   420: dup
    //   421: aload #16
    //   423: invokespecial <init> : (Lburp/Zz4b;)V
    //   426: astore #24
    //   428: new burp/Zxea
    //   431: dup
    //   432: aload #24
    //   434: invokespecial <init> : (Lburp/Zgu7;)V
    //   437: astore #25
    //   439: invokestatic Zv : ()I
    //   442: aload #16
    //   444: aload_0
    //   445: getfield ZZ : Lburp/Zr_4;
    //   448: aload #23
    //   450: aload_0
    //   451: getfield Z_ : Lburp/Zz0n;
    //   454: invokeinterface ZP : ()Lburp/Zrgd;
    //   459: aload_0
    //   460: getfield Z_ : Lburp/Zz0n;
    //   463: invokeinterface ZU : ()Lnet/portswigger/Zsy;
    //   468: aload #22
    //   470: invokestatic Zu : (Lburp/Zz4b;Lburp/Zr_4;Lburp/Zz1m;Lburp/Zrgd;Lnet/portswigger/Zsy;Lburp/Zskh;)Lburp/Zzkr;
    //   473: astore #26
    //   475: new burp/Zmkx
    //   478: dup
    //   479: invokespecial <init> : ()V
    //   482: astore #27
    //   484: aload_0
    //   485: aload #16
    //   487: aload #22
    //   489: aload #26
    //   491: aload #24
    //   493: aload #25
    //   495: aload #27
    //   497: invokevirtual ZG : (Lburp/Zz4b;Lburp/Zskh;Lburp/Zzkr;Lburp/Zgu7;Lburp/Zxea;Lburp/Zmkx;)Lburp/Zrag;
    //   500: astore #28
    //   502: aload_0
    //   503: <illegal opcode> ZS : (Lburp/Zk9k;)Lburp/Zt6o;
    //   508: astore #29
    //   510: aload #29
    //   512: aload #15
    //   514: invokeinterface Zvm : ()Lburp/Zskz;
    //   519: invokeinterface ZS : (Lburp/Zskz;)Lburp/Ztdi;
    //   524: astore #30
    //   526: aload_0
    //   527: aload #15
    //   529: aload #17
    //   531: aload #19
    //   533: aload #22
    //   535: aload #28
    //   537: aload #26
    //   539: aload #25
    //   541: aload #29
    //   543: aload #30
    //   545: invokevirtual ZJ : (Lburp/Zzir;Lburp/Zg0s;Lburp/Zzqg;Lburp/Zskh;Lburp/Zrag;Lburp/Zzkr;Lburp/Zxea;Lburp/Zt6o;Lburp/Ztdi;)Lburp/Zrfd;
    //   548: astore #31
    //   550: new burp/Ztos
    //   553: dup
    //   554: invokestatic ZN : ()Lburp/Zt1n;
    //   557: invokespecial <init> : (Lburp/Zt3y;)V
    //   560: astore #32
    //   562: aload_0
    //   563: aload #32
    //   565: aload #17
    //   567: aload #18
    //   569: aload #19
    //   571: aload #21
    //   573: aload #22
    //   575: aload_3
    //   576: iload #8
    //   578: invokevirtual Zh : (Lburp/Ztos;Lburp/Zg0s;Lburp/Zs2g;Lburp/Zzqg;Lburp/Zz_s;Lburp/Zskh;Lburp/Zxj8;I)Lburp/Zlx8;
    //   581: astore #33
    //   583: aload #31
    //   585: aload #14
    //   587: aload #33
    //   589: aload #5
    //   591: <illegal opcode> ZU : (Lburp/Zsvm;)Lburp/Zsv0;
    //   596: iconst_1
    //   597: iconst_1
    //   598: invokevirtual ZP : (Lburp/Zkv4;Lburp/Zm0l;Lburp/Zsv0;ZZ)Lburp/Ztj1;
    //   601: astore #34
    //   603: istore #4
    //   605: new burp/Ztf7
    //   608: dup
    //   609: aload #32
    //   611: aload #34
    //   613: invokevirtual Zh : ()I
    //   616: aload #28
    //   618: aload #27
    //   620: aload_0
    //   621: getfield Zk : Lburp/Ztwv;
    //   624: aload #30
    //   626: dup
    //   627: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   630: pop
    //   631: <illegal opcode> run : (Lburp/Ztdi;)Ljava/lang/Runnable;
    //   636: invokespecial <init> : (Lburp/Zlli;ILburp/Zrag;Lburp/Zmkx;Lburp/Ztwv;Ljava/lang/Runnable;)V
    //   639: astore #35
    //   641: new burp/Zkru
    //   644: dup
    //   645: aload_0
    //   646: iload #8
    //   648: aload_2
    //   649: aload #22
    //   651: aload #34
    //   653: aload #32
    //   655: aload #35
    //   657: invokespecial <init> : (Lburp/Zk9k;ILjava/util/List;Lburp/Zskh;Lburp/Ztj1;Lburp/Ztos;Lburp/Ztf7;)V
    //   660: iload #4
    //   662: ifeq -> 672
    //   665: iconst_3
    //   666: anewarray burp/Zbqc
    //   669: invokestatic Zr : ([Lburp/Zbqc;)V
    //   672: areturn
  }
  
  Zlx8 Zh(Ztos<Zt1n> paramZtos, Zg0s paramZg0s, Zs2g paramZs2g, Zzqg paramZzqg, Zz_s paramZz_s, Zskh paramZskh, Zxj8 paramZxj8, int paramInt) {
    return new Zlx8(paramZtos, this.Z_, this.ZP, this.ZE, this.Ze, this.Zk, this.Zq, this.ZV, this.ZY, this.Zh, this.ZC, this.ZW, this.Zp, paramZzqg, paramZg0s, paramZs2g, paramZz_s, this.ZU, this.ZO, this.ZD, paramZxj8, paramInt, this.ZZ, this.Zu);
  }
  
  Zrag ZG(Zz4b paramZz4b, Zskh paramZskh, Zzkr paramZzkr, Zgu7 paramZgu7, Zxea paramZxea, Zmkx paramZmkx) {
    Ztos<Zt3y> ztos = new Ztos<>(Zt11.Zq());
    Zb3k zb3k = new Zb3k();
    Zr_h zr_h = new Zr_h(new Zrtb(zb3k, paramZskh));
    paramZmkx.ZZ(zr_h);
    Zs4 zs4 = new Zs4(paramZz4b, paramZgu7, zb3k, zr_h, paramZzkr, new Zm44(this.Zk), this.Zr, (Zlli)ztos, this.Z_.ZP());
    Zrag zrag = new Zrag(paramZz4b, zr_h, zs4, (Ztos)ztos, paramZzkr, paramZxea);
    Objects.requireNonNull(zrag);
    paramZmkx.ZZ(zrag::Zv);
    return zrag;
  }
  
  Zrfd ZJ(Zzir paramZzir, Zg0s paramZg0s, Zzqg paramZzqg, Zskh paramZskh, Zrag paramZrag, Zzkr paramZzkr, Zxea paramZxea, Zt6o paramZt6o, Ztdi paramZtdi) {
    Zzgq zzgq = new Zzgq(this, Zz1h.ZS, paramZzqg);
    Ztmc ztmc = new Ztmc(this.Z_.ZP(), this.Z_.ZU(), this.Z_.Zc(), this.Zq, this.ZP, this.ZE, this.ZZ, zzgq, Zz1h.ZS, this.Zk, this.ZB, this.ZQ, this.Zw, this.ZC, this.ZK, this.ZT, this.Zu, this.Zs);
    Zz5p zz5p = new Zz5p(null, ztmc, null, null, null, null, this.Zh, null, null, this.ZT, this.ZE);
    int i = Zt();
    Zg41 zg41 = new Zg41(this.Z_, this.Zk, this.ZZ, this.ZQ, true);
    Zxwj zxwj = Zk9k::lambda$buildTaskLauncher$3;
    Zgsa zgsa = new Zgsa(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.ZE, null, null, null, this.Zu);
    if (Zbqc.Zwu() == null)
      Zo(++i); 
    return new Zrfd(paramZzir, zz5p, paramZrag, paramZzkr, zxwj, this.ZZ, this.ZZ, zg41, this.ZT, paramZg0s, this.ZA, null, zgsa, null, paramZxea, paramZskh, this.ZE, this.Z_.ZU(), paramZtdi, paramZt6o, Zk9k::lambda$buildTaskLauncher$4, null, this.ZP, new Zn_());
  }
  
  private static Zzs1 lambda$buildTaskLauncher$4(Ztdi paramZtdi, Ztuv paramZtuv) {
    return null;
  }
  
  private static int lambda$buildTaskLauncher$3() {
    return -2;
  }
  
  private static List lambda$createBCheckTest$2(Zsvm paramZsvm) {
    return List.of(paramZsvm);
  }
  
  private Ztdi lambda$createBCheckTest$1(Zskz paramZskz) {
    return new Zlnu(this.Z_.ZP(), this.Zq, this.ZE, paramZskz, this.Zk, this.ZZ, null, new Zkml(this.ZE, this.Zu), this.Zu);
  }
  
  private Zetn lambda$createBCheckTest$0(AtomicInteger paramAtomicInteger, Zrm2 paramZrm2) {
    Zz1p zz1p = Zghc.ZY(paramZrm2.Zy(), paramZrm2.Zk(), (byte)1, this.Ze);
    try {
      if (zz1p != null)
        try {
          if (zz1p.Zo != null)
            return new Zetn(zz1p.Zo, paramZrm2.Zk(), paramZrm2.ZR()); 
          paramAtomicInteger.incrementAndGet();
          return null;
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    paramAtomicInteger.incrementAndGet();
    return null;
  }
  
  public static void Zo(int paramInt) {
    ZL = paramInt;
  }
  
  public static int Zv() {
    return ZL;
  }
  
  public static int Zt() {
    int i = Zv();
    try {
      if (i == 0)
        return 112; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: ifeq -> 10
    //   6: iconst_3
    //   7: invokestatic Zo : (I)V
    //   10: bipush #126
    //   12: ldc ' %oIbcN#u\\netM3r^'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic burp/Zk9k.a : Ljava/lang/String;
    //   21: goto -> 166
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_0
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 140
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #111
    //   94: goto -> 124
    //   97: bipush #66
    //   99: goto -> 124
    //   102: bipush #56
    //   104: goto -> 124
    //   107: bipush #20
    //   109: goto -> 124
    //   112: bipush #127
    //   114: goto -> 124
    //   117: bipush #84
    //   119: goto -> 124
    //   122: bipush #105
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 45
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 42
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 18
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk9k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */