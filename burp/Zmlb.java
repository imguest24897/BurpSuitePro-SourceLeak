package burp;

import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zs6;
import net.portswigger.Zuh;
import net.portswigger.browser.Zc1;
import net.portswigger.browser.Zc2;
import net.portswigger.browser.Zc7;
import net.portswigger.browser.Zcb;
import net.portswigger.browser.Zcd;
import net.portswigger.browser.Zcl;
import net.portswigger.browser.Zct;
import net.portswigger.browser.Zcv;
import net.portswigger.browser.Zd0;
import net.portswigger.browser.Zd6;
import net.portswigger.browser.Zdu;
import net.portswigger.browser.Ze6;
import net.portswigger.browser.Ze7;
import net.portswigger.browser.Zee;
import net.portswigger.browser.Zeg;
import net.portswigger.browser.Zjo;
import net.portswigger.browser.Zjq;
import net.portswigger.browser.Zjt;
import net.portswigger.browser.Zjw;
import net.portswigger.browser.Zt;
import net.portswigger.browser.Zth;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztr;
import net.portswigger.browser.Ztv;
import net.portswigger.browser.Ztz;
import net.portswigger.browser.Zy;

public class Zmlb {
  private static final Zs6<?> Ze;
  
  private static final String Zw;
  
  public static final String ZT;
  
  public static final String Zl;
  
  private static final Duration Zk;
  
  private final Zm90 ZM;
  
  private final Zzmb Zz;
  
  private final Zz1m<Zt35> Zq;
  
  private final Zr_4 Zm;
  
  private final Zkl6 Zf;
  
  private final Zgb6 Zx;
  
  private final Zzs1 Za;
  
  private final Ze2m Zy;
  
  private final Zli8 Zd;
  
  private final Zeb5 Zr;
  
  private final Zzzx Zc;
  
  private final Zl2k ZI;
  
  private final Ze6 Zj;
  
  private final String Zn;
  
  private final Zg10 ZX;
  
  private final List<Zmk2> ZA;
  
  private final Ztwv ZZ;
  
  private final BiConsumer<String, String> ZH;
  
  private final AtomicReference<Zsib<Zxwm>> Zg;
  
  private final Map<String, Integer> ZY;
  
  private final AtomicReference<Zjw> Zu;
  
  private final AtomicReference<Zcv> Zh;
  
  protected final AtomicReference<Ztpx> ZE;
  
  protected final AtomicBoolean ZG;
  
  protected final Zy ZN;
  
  protected final Ztos<Zt18> ZL;
  
  protected final Zeys ZW;
  
  private Zlat ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zmlb(Zm90 paramZm90, Zeys paramZeys, Zzmb paramZzmb, Ztos<Zt18> paramZtos, Zz1m<Zt35> paramZz1m, Zr_4 paramZr_4, Zkl6 paramZkl6, Zgb6 paramZgb6, Zzs1 paramZzs1, Ze2m paramZe2m, Zli8 paramZli8, Zeb5 paramZeb5, Zzzx paramZzzx, Zl2k paramZl2k, Zg10 paramZg10, Zzgs paramZzgs, Zdu paramZdu, Ztwv paramZtwv, BiConsumer<String, String> paramBiConsumer) throws Ztk {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/util/concurrent/atomic/AtomicReference
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield Zg : Ljava/util/concurrent/atomic/AtomicReference;
    //   15: invokestatic Zu : ()Z
    //   18: aload_0
    //   19: new java/util/concurrent/ConcurrentHashMap
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: putfield ZY : Ljava/util/Map;
    //   29: aload_0
    //   30: new java/util/concurrent/atomic/AtomicReference
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: putfield Zu : Ljava/util/concurrent/atomic/AtomicReference;
    //   40: istore #20
    //   42: aload_0
    //   43: new java/util/concurrent/atomic/AtomicReference
    //   46: dup
    //   47: invokespecial <init> : ()V
    //   50: putfield Zh : Ljava/util/concurrent/atomic/AtomicReference;
    //   53: aload_0
    //   54: new java/util/concurrent/atomic/AtomicReference
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: putfield ZE : Ljava/util/concurrent/atomic/AtomicReference;
    //   64: aload_0
    //   65: new java/util/concurrent/atomic/AtomicBoolean
    //   68: dup
    //   69: invokespecial <init> : ()V
    //   72: putfield ZG : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   75: aload_0
    //   76: aload_1
    //   77: putfield ZM : Lburp/Zm90;
    //   80: aload_0
    //   81: aload_2
    //   82: putfield ZW : Lburp/Zeys;
    //   85: aload_0
    //   86: aload_3
    //   87: putfield Zz : Lburp/Zzmb;
    //   90: aload_0
    //   91: aload #4
    //   93: putfield ZL : Lburp/Ztos;
    //   96: aload_0
    //   97: aload #5
    //   99: putfield Zq : Lburp/Zz1m;
    //   102: aload_0
    //   103: aload #6
    //   105: putfield Zm : Lburp/Zr_4;
    //   108: aload_0
    //   109: aload #7
    //   111: putfield Zf : Lburp/Zkl6;
    //   114: aload_0
    //   115: aload #8
    //   117: putfield Zx : Lburp/Zgb6;
    //   120: aload_0
    //   121: aload #9
    //   123: putfield Za : Lburp/Zzs1;
    //   126: aload_0
    //   127: aload #10
    //   129: putfield Zy : Lburp/Ze2m;
    //   132: aload_0
    //   133: aload #11
    //   135: putfield Zd : Lburp/Zli8;
    //   138: aload_0
    //   139: aload #12
    //   141: putfield Zr : Lburp/Zeb5;
    //   144: aload_0
    //   145: aload #13
    //   147: putfield Zc : Lburp/Zzzx;
    //   150: aload_0
    //   151: aload #14
    //   153: putfield ZI : Lburp/Zl2k;
    //   156: aload_0
    //   157: invokestatic Ze : ()Lnet/portswigger/browser/Ze6;
    //   160: aload_3
    //   161: invokeinterface ZC : ()Z
    //   166: invokevirtual Zq : (Z)Lnet/portswigger/browser/Ze6;
    //   169: aload_3
    //   170: invokeinterface Z_ : ()Z
    //   175: invokevirtual ZW : (Z)Lnet/portswigger/browser/Ze6;
    //   178: putfield Zj : Lnet/portswigger/browser/Ze6;
    //   181: aload_0
    //   182: aload_3
    //   183: invokeinterface Zw : ()Ljava/lang/String;
    //   188: putfield Zn : Ljava/lang/String;
    //   191: aload_0
    //   192: aload #15
    //   194: putfield ZX : Lburp/Zg10;
    //   197: aload_0
    //   198: aload #16
    //   200: invokestatic Zy : (Lburp/Zzgs;)Ljava/util/List;
    //   203: putfield ZA : Ljava/util/List;
    //   206: aload_0
    //   207: aload #18
    //   209: putfield ZZ : Lburp/Ztwv;
    //   212: aload_0
    //   213: aload #19
    //   215: putfield ZH : Ljava/util/function/BiConsumer;
    //   218: aload #15
    //   220: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   225: aload_0
    //   226: invokevirtual Zv : ()Lburp/Zx7;
    //   229: invokeinterface Zh : (Ljava/util/function/Predicate;Lburp/Zx7;)V
    //   234: aload #13
    //   236: aload #8
    //   238: <illegal opcode> ZR : (Lburp/Zzzx;Lburp/Zgb6;)Lburp/Zsbf;
    //   243: astore #21
    //   245: aload #15
    //   247: new burp/Zxwx
    //   250: dup
    //   251: aload #7
    //   253: aload #21
    //   255: invokespecial <init> : (Lburp/Zkl6;Lburp/Zsbf;)V
    //   258: invokeinterface Zp : (Lburp/Zx7;)V
    //   263: aload_0
    //   264: aload_0
    //   265: <illegal opcode> ZJ : (Lburp/Zmlb;)Lnet/portswigger/browser/Zjo;
    //   270: invokevirtual ZJ : (Lnet/portswigger/browser/Zjo;)V
    //   273: aload_0
    //   274: new net/portswigger/browser/Zy
    //   277: dup
    //   278: aload #17
    //   280: invokespecial <init> : (Lnet/portswigger/browser/Zdu;)V
    //   283: putfield ZN : Lnet/portswigger/browser/Zy;
    //   286: iload #20
    //   288: ifeq -> 305
    //   291: iconst_2
    //   292: anewarray burp/Zbqc
    //   295: invokestatic Zr : ([Lburp/Zbqc;)V
    //   298: goto -> 305
    //   301: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   304: athrow
    //   305: return
    // Exception table:
    //   from	to	target	type
    //   245	298	301	net/portswigger/browser/Ztk
  }
  
  private Zx7 Zv() {
    return this::lambda$makeWebSocketSupportingResponseHandler$1;
  }
  
  private void Zl(String paramString) {
    try {
      String str = ((Zjw)this.Zu.get()).ZS().Zr();
      this.ZH.accept(str, paramString);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
  }
  
  private void ZJ(Zjo paramZjo) throws Ztk {
    this.ZW.Zu(paramZjo);
    Zc1 zc1 = this.ZW.Zi();
    if (zc1.Zj().Zc().isEmpty()) {
      Zjw zjw = zc1.Zj().ZV();
      ZE(zjw);
      zjw.ZK().ZW(1920, 1080);
      zjw.ZK().Zp();
      this.Zu.set(zjw);
    } 
    try {
      if (!Zb12.ZG() || this.Zz.Zb()) {
        Zeg zeg = zc1.ZE(80, Zcl.JPEG);
        zeg.Zc().ZE(Zc2.ZR, this::lambda$createIsolatedBrowserContext$3);
        zeg.Zv();
      } 
    } catch (Ztk ztk) {
      throw a(null);
    } 
  }
  
  private void ZE(Zjw paramZjw) throws Ztk {
    paramZjw.ZN().ZL();
    paramZjw.ZU().Zm(this.Zn);
    Zd0 zd0 = paramZjw.Zx();
    zd0.Zy();
    zd0.ZU(Zl);
  }
  
  private Zd6 ZD(Ztv paramZtv, Zjt paramZjt) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> Zq : (Lburp/Zmlb;Lnet/portswigger/browser/Zjt;)Lburp/Zeat;
    //   8: aload_0
    //   9: getfield ZX : Lburp/Zg10;
    //   12: invokestatic Zl : (Lnet/portswigger/browser/Zjt;Lburp/Zeat;Lburp/Zg10;)Ljava/util/Optional;
    //   15: aload_0
    //   16: aload_2
    //   17: aload_1
    //   18: <illegal opcode> get : (Lburp/Zmlb;Lnet/portswigger/browser/Zjt;Lnet/portswigger/browser/Ztv;)Ljava/util/function/Supplier;
    //   23: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   26: checkcast net/portswigger/browser/Zd6
    //   29: areturn
  }
  
  public Zmrv ZE(Zgyy paramZgyy, Zlru paramZlru, Ztpx paramZtpx) {
    Zlat zlat = paramZgyy.<Zlat>ZJ(new Ztra(this, paramZlru, paramZtpx));
    Zxss zxss = (Zxss)paramZgyy;
    return new Zmrv((paramZgyy instanceof Zxss) ? zxss.ZY() : null, zlat);
  }
  
  public void ZA() {
    this.ZX.Zp(null);
    this.ZX.ZP(Ztae::Zw);
    this.ZW.ZZ();
  }
  
  public static Optional<Zd6> Zl(Zjt paramZjt, Zeat paramZeat, Zg10 paramZg10) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZX : ()Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   14: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   19: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   24: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   29: istore_3
    //   30: iload_3
    //   31: ifeq -> 48
    //   34: aload_0
    //   35: invokevirtual ZC : ()Ljava/lang/String;
    //   38: ifnull -> 56
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: invokestatic empty : ()Ljava/util/Optional;
    //   51: areturn
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: invokestatic randomUUID : ()Ljava/util/UUID;
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: astore #4
    //   64: aload #4
    //   66: invokestatic Zn : (Ljava/lang/String;)Lnet/portswigger/browser/Zc7;
    //   69: astore #5
    //   71: aload_2
    //   72: aload #5
    //   74: aload #4
    //   76: <illegal opcode> test : (Lnet/portswigger/browser/Zc7;Ljava/lang/String;)Ljava/util/function/Predicate;
    //   81: new burp/Zms
    //   84: dup
    //   85: aload_1
    //   86: invokespecial <init> : (Lburp/Zeat;)V
    //   89: invokeinterface ZT : (Ljava/util/function/Predicate;Lburp/Zx7;)V
    //   94: new net/portswigger/browser/Ztm
    //   97: dup
    //   98: iconst_1
    //   99: anewarray net/portswigger/browser/Zc7
    //   102: dup
    //   103: iconst_0
    //   104: aload #5
    //   106: aastore
    //   107: invokespecial <init> : ([Lnet/portswigger/browser/Zc7;)V
    //   110: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   113: areturn
    // Exception table:
    //   from	to	target	type
    //   30	41	44	java/lang/MatchException
    //   34	52	52	java/lang/MatchException
  }
  
  private Zxx0 ZJ(Zjt paramZjt, Zstu paramZstu) {
    try {
      Ztgw ztgw = Ztgw.Zc(paramZjt, new Zkvk(this.Zy, this.Zz), this.Zf, paramZstu);
      Zz0z zz0z = ZH(ztgw);
      return Zxx0.Z_(zz0z);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
      this.ZM.ZU(paramZjt.Zc());
      return Zxx0.Zf();
    } 
  }
  
  private Zz0z ZH(Ztgw paramZtgw) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZE : Ljava/util/concurrent/atomic/AtomicReference;
    //   4: invokevirtual get : ()Ljava/lang/Object;
    //   7: checkcast burp/Ztpx
    //   10: astore_2
    //   11: aload_2
    //   12: ifnonnull -> 27
    //   15: new burp/Zz5y
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: areturn
    //   23: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload_0
    //   28: getfield ZY : Ljava/util/Map;
    //   31: aload_1
    //   32: invokevirtual Zd : ()Lburp/Zski;
    //   35: invokeinterface ZyR : ()Lburp/Zlit;
    //   40: invokeinterface Zdw : ()Ljava/lang/String;
    //   45: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   50: invokeinterface compute : (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    //   55: checkcast java/lang/Integer
    //   58: invokevirtual intValue : ()I
    //   61: istore_3
    //   62: iload_3
    //   63: bipush #28
    //   65: if_icmple -> 80
    //   68: new burp/Zz5y
    //   71: dup
    //   72: invokespecial <init> : ()V
    //   75: areturn
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: aload_1
    //   81: invokevirtual ZE : ()Z
    //   84: ifeq -> 152
    //   87: bipush #18
    //   89: aload_0
    //   90: getfield Zg : Ljava/util/concurrent/atomic/AtomicReference;
    //   93: invokevirtual get : ()Ljava/lang/Object;
    //   96: checkcast burp/Zsib
    //   99: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   102: aload_1
    //   103: <illegal opcode> apply : (Lburp/Ztgw;)Ljava/util/function/Function;
    //   108: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   111: iconst_0
    //   112: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   115: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   118: checkcast java/lang/Integer
    //   121: invokevirtual intValue : ()I
    //   124: if_icmpge -> 152
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: aload_1
    //   135: getstatic burp/Zxwm.MAX_REDIRECTS : Lburp/Zxwm;
    //   138: invokestatic ZU : (Lburp/Ztgw;Ljava/lang/Object;)Lburp/Zgbv;
    //   141: astore #4
    //   143: aload_0
    //   144: aload #4
    //   146: invokevirtual ZT : (Lburp/Zgb7;)V
    //   149: aload #4
    //   151: areturn
    //   152: aload_0
    //   153: getfield Zx : Lburp/Zgb6;
    //   156: invokeinterface ZU0 : ()Lburp/Zes1;
    //   161: aload_1
    //   162: invokevirtual Zt : ()Lburp/Zmzk;
    //   165: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   170: invokevirtual ZM : (Ljava/lang/String;)Z
    //   173: ifeq -> 194
    //   176: aload_1
    //   177: getstatic burp/Zxwm.OUT_OF_SCOPE : Lburp/Zxwm;
    //   180: invokestatic ZU : (Lburp/Ztgw;Ljava/lang/Object;)Lburp/Zgbv;
    //   183: astore #4
    //   185: aload_0
    //   186: aload #4
    //   188: invokevirtual ZT : (Lburp/Zgb7;)V
    //   191: aload #4
    //   193: areturn
    //   194: aload_0
    //   195: getfield ZG : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   198: invokevirtual get : ()Z
    //   201: ifne -> 308
    //   204: aload_0
    //   205: getfield Zz : Lburp/Zzmb;
    //   208: aload_1
    //   209: invokevirtual Zd : ()Lburp/Zski;
    //   212: invokeinterface ZyR : ()Lburp/Zlit;
    //   217: invokeinterface ZG : (Lburp/Zlit;)Z
    //   222: ifne -> 308
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   231: athrow
    //   232: aload_0
    //   233: getfield ZA : Ljava/util/List;
    //   236: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   241: aload_0
    //   242: aload_1
    //   243: <illegal opcode> test : (Lburp/Zmlb;Lburp/Ztgw;)Ljava/util/function/Predicate;
    //   248: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   253: ifeq -> 308
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   262: athrow
    //   263: aload_1
    //   264: invokevirtual ZP : ()Lburp/Zefx;
    //   267: astore #4
    //   269: aload_0
    //   270: getfield Zq : Lburp/Zz1m;
    //   273: new burp/Zxr8
    //   276: dup
    //   277: getstatic burp/Zt35.ZU : Lburp/Zlnb;
    //   280: aload #4
    //   282: invokespecial <init> : (Lburp/Zlnb;Ljava/lang/Object;)V
    //   285: invokeinterface ZD : (Lburp/Zxr8;)V
    //   290: aload_1
    //   291: getstatic burp/Zxwm.OUT_OF_SCOPE : Lburp/Zxwm;
    //   294: invokestatic ZU : (Lburp/Ztgw;Ljava/lang/Object;)Lburp/Zgbv;
    //   297: astore #5
    //   299: aload_0
    //   300: aload #5
    //   302: invokevirtual ZT : (Lburp/Zgb7;)V
    //   305: aload #5
    //   307: areturn
    //   308: aload_0
    //   309: aload_1
    //   310: invokevirtual ZN : (Lburp/Ztgw;)Ljava/util/Optional;
    //   313: aload_0
    //   314: aload_2
    //   315: aload_1
    //   316: <illegal opcode> get : (Lburp/Zmlb;Lburp/Ztpx;Lburp/Ztgw;)Ljava/util/function/Supplier;
    //   321: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   324: checkcast burp/Zz0z
    //   327: areturn
    // Exception table:
    //   from	to	target	type
    //   11	23	23	java/lang/MatchException
    //   62	76	76	java/lang/MatchException
    //   80	127	130	java/lang/MatchException
    //   194	225	228	java/lang/MatchException
    //   204	256	259	java/lang/MatchException
  }
  
  private void ZT(Zgb7<Zxwm> paramZgb7) {
    Optional.<Zsib>ofNullable(this.Zg.get()).ifPresent(paramZgb7::lambda$offerCorridors$13);
  }
  
  private Optional<Zz0z> ZN(Ztgw paramZtgw) {
    try {
      if (!paramZtgw.ZE())
        return this.Za.Zo(paramZtgw); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Optional.empty();
  }
  
  private Zgb7<Zxwm> Zr(Ztpx paramZtpx, Ztgw paramZtgw) {
    Zxfp zxfp = new Zxfp();
    try {
    
    } catch (Zgum zgum) {
      throw a(null);
    } 
    Duration duration1 = paramZtgw.ZE() ? null : Zk;
    try {
    
    } catch (Zgum zgum) {
      throw a(null);
    } 
    Duration duration2 = paramZtgw.ZE() ? null : this.Zz.Zy();
    try {
      Ztaw ztaw = this.Zc.ZJ(paramZtgw.ZP(), duration1, duration2, zxfp);
      Zsxd zsxd = paramZtpx.ZJ(ztaw);
      Zg3d zg3d = zsxd.ZG();
      try {
        Zxwm zxwm;
        switch (Zgdh.ZJ[zg3d.Zb().ordinal()]) {
          default:
            Zuh.ZT(false, Zqf.Zk, zg3d.Zb().name());
          case 1:
          case 2:
          case 3:
            this.ZM.ZJ();
            return Zj(paramZtgw, zsxd, Zxwm.MEDIA_OR_LARGE_RESPONSE);
          case 4:
            try {
              this.ZM.ZU(paramZtgw.ZE());
              this.Za.Zi(paramZtgw);
            } catch (Zgum zgum) {
              throw a(null);
            } 
            zxwm = (zg3d.Zx() instanceof Ztp7) ? Zxwm.PROXY_CONNECTION_FAILED : Zxwm.UNKNOWN_HOST;
            return Zj(paramZtgw, zsxd, zxwm);
          case 5:
            try {
              this.ZM.ZU(paramZtgw.ZE());
              this.Za.Zi(paramZtgw);
            } catch (Zgum zgum) {
              throw a(null);
            } 
            zxwm = (zg3d.Zx() instanceof Zr9q) ? Zxwm.PROXY_CONNECTION_FAILED : Zxwm.CONNECTION_FAILED;
            return Zj(paramZtgw, zsxd, zxwm);
          case 6:
            this.ZM.ZU(paramZtgw.ZE());
            this.Za.ZY(paramZtgw);
            return Zj(paramZtgw, zsxd, Zxwm.READ_TIMEOUT);
          case 7:
            this.ZM.ZU(paramZtgw.ZE());
            this.Za.Zv(paramZtgw);
            return Zj(paramZtgw, zsxd, Zxwm.NO_RESPONSE_DATA);
          case 8:
            this.Za.Zv(paramZtgw);
            return Zj(paramZtgw, zsxd, Zxwm.UNSUPPORTED_RESPONSE_DATA);
          case 9:
            break;
        } 
      } catch (Zgum zgum) {
        throw a(null);
      } 
      this.ZM.ZJ();
      Zgb7<?> zgb7 = Zgb7.ZA(paramZtgw, zsxd);
      try {
        if (zg3d.Zx() instanceof Zry8 || zg3d.Zx() instanceof Zryl) {
          Zgbv<?> zgbv = zgb7.ZA(Zxwm.PROXY_AUTHENTICATION_REQUIRED);
          ZT((Zgb7)zgbv);
          return (Zgb7)zgbv;
        } 
      } catch (Zgum zgum) {
        throw a(null);
      } 
      if (zgb7.ZD()) {
        Zgbv<?> zgbv = zgb7.ZA(Zxwm.MEDIA_OR_LARGE_RESPONSE);
        ZT((Zgb7)zgbv);
        return (Zgb7)zgbv;
      } 
      this.Za.ZW(zgb7);
      ZT((Zgb7)zgb7);
      return (Zgb7)zgb7;
    } catch (Zgum zgum) {
      Zah.Zl(zgum, Zk_.UNEXPECTED);
      this.ZM.ZU(paramZtgw.ZE());
      Zgbv<Zxwm> zgbv = Zgbv.ZU(paramZtgw, Zxwm.REQUEST_ENGINE_CLOSED);
      ZT(zgbv);
      return zgbv;
    } 
  }
  
  private Zgbv<Zxwm> Zj(Ztgw paramZtgw, Zsxd paramZsxd, Zxwm paramZxwm) {
    Zgb7<?> zgb7 = Zgb7.ZA(paramZtgw, paramZsxd);
    Zgbv<?> zgbv = zgb7.ZA(paramZxwm);
    ZT((Zgb7)zgbv);
    return (Zgbv)zgbv;
  }
  
  private Zlat ZA(Zz3o paramZz3o, Zeb5 paramZeb5) {
    Zlve zlve = (new Zzpi()).ZU(null).Zu();
    return (new Zrcq(paramZz3o, zlve, this.Zm.<Zzxz>ZH(new Ze88()))).ZP(paramZeb5.Zm()).ZN();
  }
  
  public Zmrv Zx(Zl_ paramZl_, Zlru paramZlru, Ztpx paramZtpx) {
    // Byte code:
    //   0: invokestatic ZR : ()Z
    //   3: istore #4
    //   5: aload_2
    //   6: invokeinterface ZVS : ()Lburp/Zkg3;
    //   11: astore #8
    //   13: aload_1
    //   14: instanceof burp/Zs82
    //   17: ifeq -> 82
    //   20: aload_1
    //   21: checkcast burp/Zs82
    //   24: astore #9
    //   26: aload_0
    //   27: getfield Zz : Lburp/Zzmb;
    //   30: invokeinterface Zt : ()Z
    //   35: ifeq -> 82
    //   38: aload #9
    //   40: invokeinterface Zfy : ()Lburp/Zm6i;
    //   45: astore #5
    //   47: aload #5
    //   49: checkcast burp/Zsp5
    //   52: invokeinterface Zhr : ()Lburp/Zlvj;
    //   57: astore #7
    //   59: aload #7
    //   61: checkcast burp/Zlvj
    //   64: aload #8
    //   66: aload_0
    //   67: getfield Zz : Lburp/Zzmb;
    //   70: invokeinterface ZA : (Lburp/Zkg3;Lburp/Zzmb;)Lnet/portswigger/browser/Ze7;
    //   75: astore #6
    //   77: iload #4
    //   79: ifne -> 263
    //   82: aload_0
    //   83: getfield ZD : Lburp/Zlat;
    //   86: ifnonnull -> 106
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: invokestatic emptyList : ()Ljava/util/List;
    //   99: goto -> 127
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: aload_0
    //   107: getfield Zd : Lburp/Zli8;
    //   110: aload_0
    //   111: getfield ZD : Lburp/Zlat;
    //   114: invokevirtual ZO : ()Lburp/Zz3o;
    //   117: aload_0
    //   118: getfield ZD : Lburp/Zlat;
    //   121: invokevirtual ZE : ()Lburp/Zlve;
    //   124: invokevirtual Zh : (Lburp/Zz3o;Lburp/Zlve;)Ljava/util/List;
    //   127: astore #10
    //   129: aload #10
    //   131: invokestatic ZW : (Ljava/util/List;)Lburp/Ze0_;
    //   134: astore #11
    //   136: aload_1
    //   137: aload #11
    //   139: invokeinterface Zr : (Ljava/lang/Iterable;)Lburp/Zm6i;
    //   144: astore #5
    //   146: aload #11
    //   148: aload #5
    //   150: invokevirtual ZA : (Lburp/Zm6i;)Lburp/Zg8y;
    //   153: astore #7
    //   155: aload #7
    //   157: dup
    //   158: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   161: pop
    //   162: astore #12
    //   164: iconst_0
    //   165: istore #13
    //   167: aload #12
    //   169: iload #13
    //   171: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   176: lookupswitch default -> 204, 0 -> 218, 1 -> 241
    //   204: new java/lang/MatchException
    //   207: dup
    //   208: aconst_null
    //   209: aconst_null
    //   210: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   213: athrow
    //   214: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   217: athrow
    //   218: aload #12
    //   220: checkcast burp/Ztiv
    //   223: astore #14
    //   225: aload #14
    //   227: aload #8
    //   229: aload_0
    //   230: getfield Zz : Lburp/Zzmb;
    //   233: invokeinterface Zc : (Lburp/Zkg3;Lburp/Zzmb;)Lnet/portswigger/browser/Ze7;
    //   238: goto -> 261
    //   241: aload #12
    //   243: checkcast burp/Zlvj
    //   246: astore #15
    //   248: aload #15
    //   250: aload #8
    //   252: aload_0
    //   253: getfield Zz : Lburp/Zzmb;
    //   256: invokeinterface ZA : (Lburp/Zkg3;Lburp/Zzmb;)Lnet/portswigger/browser/Ze7;
    //   261: astore #6
    //   263: aload_0
    //   264: getfield Zz : Lburp/Zzmb;
    //   267: invokeinterface ZD : ()Lburp/Zmv7;
    //   272: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   275: getstatic burp/Zlq7.AGENT_ACTION : Lburp/Zlq7;
    //   278: iconst_4
    //   279: anewarray java/lang/Object
    //   282: dup
    //   283: iconst_0
    //   284: getstatic burp/Ze2m.AGENT : Lburp/Ze2m;
    //   287: getfield debugName : Ljava/lang/String;
    //   290: aastore
    //   291: dup
    //   292: iconst_1
    //   293: aload #7
    //   295: invokeinterface ZO : ()Ljava/lang/String;
    //   300: aastore
    //   301: dup
    //   302: iconst_2
    //   303: aload_0
    //   304: invokevirtual Zi : ()Ljava/lang/String;
    //   307: aastore
    //   308: dup
    //   309: iconst_3
    //   310: aload_2
    //   311: aastore
    //   312: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   317: aload_0
    //   318: aload_0
    //   319: aload #7
    //   321: aload #6
    //   323: <illegal opcode> get : (Lburp/Zmlb;Lburp/Zg8y;Lnet/portswigger/browser/Ze7;)Ljava/util/function/Supplier;
    //   328: aload_3
    //   329: invokevirtual Zj : (Ljava/util/function/Supplier;Lburp/Ztpx;)Lburp/Zlat;
    //   332: astore #9
    //   334: new burp/Zmrv
    //   337: dup
    //   338: aload #7
    //   340: aload #9
    //   342: invokespecial <init> : (Lburp/Zg8y;Lburp/Zlat;)V
    //   345: areturn
    // Exception table:
    //   from	to	target	type
    //   77	89	92	java/lang/MatchException
    //   82	102	102	java/lang/MatchException
    //   167	214	214	java/lang/MatchException
  }
  
  private Zlat Zj(Supplier<Zlat> paramSupplier, Ztpx paramZtpx) {
    this.ZE.set(paramZtpx);
    this.Zh.set(null);
    this.Zg.set(new Zsib<>(((Zjw)this.Zu.get()).ZG()));
    try {
      this.ZD = paramSupplier.get();
      return this.ZD;
    } finally {
      this.Zg.set(null);
      this.ZE.set(null);
    } 
  }
  
  private Zlat Zz(Zko4 paramZko4) {
    try {
      Zkbb zkbb = Z_(paramZko4);
      Zjw zjw = zkbb.ZZ;
      this.Zu.set(zjw);
      Zm2.Zo(Zze0.CRAWLER_RECORDED_LOGIN_SUCCEEDED);
      return ZD(Zz3o.RECORDED_SEQUENCE, zjw, zkbb.Zf);
    } catch (Zcb zcb) {
      Zah.Zl((Throwable)zcb, Zk_.COMMON_RUNTIME_FAILURE);
      this.Zz.ZD().Zy(Zrp6.DEBUG, Zlq7.RECORDED_SEQUENCE_ERROR, new Object[] { paramZko4.ZP(), zcb.getMessage() });
      Zm2.Zo(Zze0.CRAWLER_RECORDED_LOGIN_FAILED);
      return ZA(Zz3o.RECORDED_SEQUENCE, this.Zr);
    } catch (Ztk ztk) {
      Zah.Zl((Throwable)ztk, Zk_.COMMON_RUNTIME_FAILURE);
      return ZA(Zz3o.RECORDED_SEQUENCE, this.Zr);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
      return ZA(Zz3o.RECORDED_SEQUENCE, this.Zr);
    } finally {
      this.Zg.set(null);
    } 
  }
  
  private Zlat Zu(Zz3o paramZz3o, Ze7 paramZe7) {
    try {
      Zjw zjw = this.Zu.get();
      Zjq zjq = paramZe7.Zl((Zt)Ztr.ZK(this.Zz.Zr())).Zl((Zt)Zee.ZO(this.Zz.ZH())).Zn(zjw);
      return ZD(paramZz3o, zjw, zjq);
    } catch (Ztk ztk) {
      try {
        if (!(ztk instanceof net.portswigger.browser.Ztj))
          try {
            if (!(ztk instanceof net.portswigger.browser.Zti)) {
              try {
                if (ztk instanceof net.portswigger.browser.Zt2);
              } catch (Ztk ztk1) {
                throw a(null);
              } 
              Zah.Zl((Throwable)ztk, Zk_.UNEXPECTED);
              return ZA(paramZz3o, this.Zr);
            } 
          } catch (Ztk ztk1) {
            throw a(null);
          }  
      } catch (Ztk ztk1) {
        throw a(null);
      } 
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
      return ZA(paramZz3o, this.Zr);
    } 
  }
  
  private Zlat ZD(Zz3o paramZz3o, Zjw paramZjw, Zjq paramZjq) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Ljava/util/concurrent/atomic/AtomicReference;
    //   4: invokevirtual get : ()Ljava/lang/Object;
    //   7: checkcast burp/Zsib
    //   10: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   13: checkcast burp/Zsib
    //   16: astore #5
    //   18: invokestatic ZR : ()Z
    //   21: aload #5
    //   23: invokevirtual ZF : ()Ljava/util/List;
    //   26: astore #6
    //   28: invokestatic empty : ()Ljava/util/Optional;
    //   31: astore #7
    //   33: istore #4
    //   35: aload #6
    //   37: invokeinterface isEmpty : ()Z
    //   42: ifne -> 60
    //   45: aload #6
    //   47: invokeinterface getLast : ()Ljava/lang/Object;
    //   52: checkcast burp/Zgb7
    //   55: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   58: astore #7
    //   60: aload_0
    //   61: getfield Zh : Ljava/util/concurrent/atomic/AtomicReference;
    //   64: aconst_null
    //   65: invokevirtual getAndSet : (Ljava/lang/Object;)Ljava/lang/Object;
    //   68: checkcast net/portswigger/browser/Zcv
    //   71: astore #9
    //   73: aload #7
    //   75: invokevirtual isPresent : ()Z
    //   78: ifeq -> 116
    //   81: aload #7
    //   83: invokevirtual get : ()Ljava/lang/Object;
    //   86: checkcast burp/Zgb7
    //   89: aload_2
    //   90: aload_0
    //   91: getfield Zf : Lburp/Zkl6;
    //   94: invokeinterface ZB : ()Lburp/Zbnt;
    //   99: aload_3
    //   100: aload_0
    //   101: getfield Zj : Lnet/portswigger/browser/Ze6;
    //   104: aload #9
    //   106: invokevirtual ZW : (Lnet/portswigger/browser/Zjw;Lburp/Zbnt;Lnet/portswigger/browser/Zjq;Lnet/portswigger/browser/Ze6;Lnet/portswigger/browser/Zcv;)Lburp/Zlve;
    //   109: astore #8
    //   111: iload #4
    //   113: ifne -> 162
    //   116: new burp/Zzpi
    //   119: dup
    //   120: invokespecial <init> : ()V
    //   123: aconst_null
    //   124: aload_2
    //   125: invokeinterface Zx : ()Lnet/portswigger/browser/Zd0;
    //   130: aload_0
    //   131: getfield Zj : Lnet/portswigger/browser/Ze6;
    //   134: invokeinterface Zi : (Lnet/portswigger/browser/Ze6;)Lnet/portswigger/browser/Zdb;
    //   139: aload #9
    //   141: aload_3
    //   142: aload_0
    //   143: getfield Zf : Lburp/Zkl6;
    //   146: invokeinterface ZB : ()Lburp/Zbnt;
    //   151: invokestatic Zk : (Lburp/Zski;Lnet/portswigger/browser/Zdb;Lnet/portswigger/browser/Zcv;Lnet/portswigger/browser/Zjq;Lburp/Zbnt;)Lburp/Zmfc;
    //   154: invokevirtual ZE : (Lburp/Zmfc;)Lburp/Zzpi;
    //   157: invokevirtual Zu : ()Lburp/Zlve;
    //   160: astore #8
    //   162: goto -> 218
    //   165: astore #9
    //   167: aload #9
    //   169: aload #9
    //   171: instanceof net/portswigger/browser/Ztj
    //   174: ifne -> 192
    //   177: aload #9
    //   179: instanceof net/portswigger/browser/Zti
    //   182: ifeq -> 202
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   191: athrow
    //   192: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   195: goto -> 205
    //   198: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   201: athrow
    //   202: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   205: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   208: aload_0
    //   209: aload_1
    //   210: aload_0
    //   211: getfield Zr : Lburp/Zeb5;
    //   214: invokevirtual ZA : (Lburp/Zz3o;Lburp/Zeb5;)Lburp/Zlat;
    //   217: areturn
    //   218: aload_0
    //   219: getfield Zm : Lburp/Zr_4;
    //   222: new burp/Ze88
    //   225: dup
    //   226: aload_0
    //   227: aload #6
    //   229: invokevirtual Ze : (Ljava/util/List;)Lburp/Ztrm;
    //   232: aload #5
    //   234: invokevirtual Zm : ()Ljava/util/Collection;
    //   237: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   242: aload_0
    //   243: <illegal opcode> apply : (Lburp/Zmlb;)Ljava/util/function/Function;
    //   248: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   253: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   258: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   263: checkcast [Lburp/Ztrm;
    //   266: invokespecial <init> : (Lburp/Ztrm;[Lburp/Ztrm;)V
    //   269: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   274: checkcast burp/Zzxz
    //   277: astore #9
    //   279: new burp/Zrcq
    //   282: dup
    //   283: aload_1
    //   284: aload #8
    //   286: aload #9
    //   288: invokespecial <init> : (Lburp/Zz3o;Lburp/Zlve;Lburp/Zzxz;)V
    //   291: astore #10
    //   293: aload #7
    //   295: aload_0
    //   296: aload #10
    //   298: <illegal opcode> accept : (Lburp/Zmlb;Lburp/Zrcq;)Ljava/util/function/Consumer;
    //   303: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   306: aload_0
    //   307: getfield Zg : Ljava/util/concurrent/atomic/AtomicReference;
    //   310: aconst_null
    //   311: invokevirtual set : (Ljava/lang/Object;)V
    //   314: aload_0
    //   315: getfield ZY : Ljava/util/Map;
    //   318: invokeinterface clear : ()V
    //   323: aload_0
    //   324: getfield Zu : Ljava/util/concurrent/atomic/AtomicReference;
    //   327: invokevirtual get : ()Ljava/lang/Object;
    //   330: checkcast net/portswigger/browser/Zjw
    //   333: invokeinterface ZN : ()Lnet/portswigger/browser/Zzk;
    //   338: invokeinterface ZU : ()V
    //   343: aload #10
    //   345: invokevirtual ZN : ()Lburp/Zlat;
    //   348: areturn
    // Exception table:
    //   from	to	target	type
    //   60	162	165	net/portswigger/browser/Ztk
    //   167	185	188	net/portswigger/browser/Ztk
    //   177	198	198	net/portswigger/browser/Ztk
  }
  
  public void Z_(List<Ztbr> paramList) throws Ztk {
    this.ZW.Zi().ZH().Za((List)paramList.stream().map(Zmlb::Zf).collect(Collectors.toList()));
  }
  
  private static Zcd Zf(Ztbr paramZtbr) {
    return Zcd.Zy(paramZtbr.Zqy(), paramZtbr.Zq0(), paramZtbr.ZqJ(), paramZtbr.ZqD(), paramZtbr.Zqj(), paramZtbr.ZqS(), paramZtbr.ZqU());
  }
  
  public void Zj() throws Zeij {
    this.ZI.Zk();
    this.ZD = null;
    this.ZE.set(null);
    try {
      Zy();
    } catch (Ztz ztz) {
      Zah.Zl((Throwable)ztz, Zk_.RETHROWN);
      throw new Zeij(ztz);
    } 
  }
  
  public void Zy() throws Ztk {
    ZJ(this::ZD);
  }
  
  private String Zi() {
    return Optional.<Zlat>ofNullable(this.ZD).map(Zlat::ZE).map(Zlve::ZJ).map(Zmfc::Zw).map(Zlit::Zdw).orElse(null);
  }
  
  public String toString() {
    return a(21571, 6258) + a(21571, 6258) + String.valueOf(this.Zy);
  }
  
  private Ztrm Ze(List<Zgb7<Zxwm>> paramList) {
    Zxwm zxwm = Zg(paramList);
    return this.Zm.<Ztrm>ZH(new Zkre((Collection<Zgnc>)paramList.stream().map(this::Zl).collect(Collectors.toList()), zxwm));
  }
  
  private Zgnc Zl(Zgb7<Zxwm> paramZgb7) {
    Ztgw ztgw = paramZgb7.Zb();
    Zstu zstu = null;
    long l = 0L;
    if (paramZgb7.Zk().isPresent()) {
      Zsxd zsxd = paramZgb7.Zk().get();
      zstu = Optional.<Zb6q>ofNullable(zsxd.ZG().Ze()).map(Zb6q::Za).filter(Zmlb::lambda$browserRequestResponseToHttpTraffic$17).orElse(null);
      l = zsxd.Zz().ZQ();
    } 
    return this.Zm.<Zgnc>ZH(new Zt8y(Zyf.Zy(ztgw.ZP().ZD()), zstu, ztgw.Zd(), ztgw.ZC(), l));
  }
  
  private static Zxwm Zg(List<Zgb7<Zxwm>> paramList) {
    try {
      if (paramList.isEmpty())
        return Zxwm.OK; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zgb7<Zxwm> zgb7 = paramList.getLast();
    try {
      if (zgb7.Zy().isPresent())
        return zgb7.Zy().get(); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Zxwm.OK;
  }
  
  public Zkbb Z_(Zko4 paramZko4) throws Ztk, Zcb, InterruptedException {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZW : Lburp/Zeys;
    //   4: invokevirtual Zi : ()Lnet/portswigger/browser/Zc1;
    //   7: astore_3
    //   8: invokestatic ZR : ()Z
    //   11: aload_0
    //   12: getfield ZL : Lburp/Ztos;
    //   15: getstatic burp/Zt18.ZT : Lburp/Zlnb;
    //   18: aload_0
    //   19: aload_1
    //   20: <illegal opcode> accept : (Lburp/Zmlb;Lburp/Zko4;)Ljava/util/function/Consumer;
    //   25: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   28: astore #4
    //   30: istore_2
    //   31: aload_0
    //   32: getfield ZG : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   35: iconst_1
    //   36: invokevirtual set : (Z)V
    //   39: aload_0
    //   40: getfield ZN : Lnet/portswigger/browser/Zy;
    //   43: aload_3
    //   44: aload_1
    //   45: invokeinterface ZRc : ()Ljava/lang/String;
    //   50: invokestatic Zr : (Ljava/lang/String;)Lnet/portswigger/browser/Zc5;
    //   53: invokevirtual Zf : (Lnet/portswigger/browser/Zc1;Lnet/portswigger/browser/Zc5;)V
    //   56: aload_3
    //   57: invokeinterface Zj : ()Lnet/portswigger/browser/Zt8;
    //   62: invokeinterface Zc : ()Ljava/util/Optional;
    //   67: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   72: invokevirtual orElseThrow : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   75: checkcast net/portswigger/browser/Zjw
    //   78: astore #5
    //   80: invokestatic Zb : ()Lnet/portswigger/browser/Ze7;
    //   83: aload_0
    //   84: getfield Zz : Lburp/Zzmb;
    //   87: invokeinterface Zr : ()Ljava/time/Duration;
    //   92: invokestatic ZK : (Ljava/time/Duration;)Lnet/portswigger/browser/Ztr;
    //   95: invokevirtual Zl : (Lnet/portswigger/browser/Zt;)Lnet/portswigger/browser/Ze7;
    //   98: aload_0
    //   99: getfield Zz : Lburp/Zzmb;
    //   102: invokeinterface ZH : ()Ljava/time/Duration;
    //   107: invokestatic ZO : (Ljava/time/Duration;)Lnet/portswigger/browser/Zee;
    //   110: invokevirtual ZY : (Lnet/portswigger/browser/Zt;)Lnet/portswigger/browser/Ze7;
    //   113: aload #5
    //   115: invokevirtual Zn : (Lnet/portswigger/browser/Zjw;)Lnet/portswigger/browser/Zjq;
    //   118: astore #6
    //   120: aload_0
    //   121: getfield Zq : Lburp/Zz1m;
    //   124: new burp/Zxr8
    //   127: dup
    //   128: getstatic burp/Zt35.Zj : Lburp/Zlnb;
    //   131: aload_1
    //   132: invokeinterface ZP : ()Ljava/lang/String;
    //   137: invokestatic Z_ : (Ljava/lang/String;)Lburp/Zrtf;
    //   140: invokespecial <init> : (Lburp/Zlnb;Ljava/lang/Object;)V
    //   143: invokeinterface ZD : (Lburp/Zxr8;)V
    //   148: new burp/Zkbb
    //   151: dup
    //   152: aload #5
    //   154: aload #6
    //   156: invokespecial <init> : (Lnet/portswigger/browser/Zjw;Lnet/portswigger/browser/Zjq;)V
    //   159: astore #7
    //   161: aload_0
    //   162: getfield ZG : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   165: iconst_0
    //   166: invokevirtual set : (Z)V
    //   169: aload #4
    //   171: invokeinterface ZZ : ()V
    //   176: aload #7
    //   178: invokestatic Zwu : ()[Lburp/Zbqc;
    //   181: ifnonnull -> 207
    //   184: iload_2
    //   185: ifeq -> 203
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   194: athrow
    //   195: iconst_0
    //   196: goto -> 204
    //   199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   202: athrow
    //   203: iconst_1
    //   204: invokestatic ZJ : (Z)V
    //   207: areturn
    //   208: astore #5
    //   210: aload #5
    //   212: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   215: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   218: aload_0
    //   219: getfield Zq : Lburp/Zz1m;
    //   222: new burp/Zxr8
    //   225: dup
    //   226: getstatic burp/Zt35.Zj : Lburp/Zlnb;
    //   229: aload_1
    //   230: invokeinterface ZP : ()Ljava/lang/String;
    //   235: aload #5
    //   237: invokevirtual getMessage : ()Ljava/lang/String;
    //   240: invokestatic ZV : (Ljava/lang/String;Ljava/lang/String;)Lburp/Zrtf;
    //   243: invokespecial <init> : (Lburp/Zlnb;Ljava/lang/Object;)V
    //   246: invokeinterface ZD : (Lburp/Zxr8;)V
    //   251: aload #5
    //   253: athrow
    //   254: astore #5
    //   256: aload #5
    //   258: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   261: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   264: aload_0
    //   265: getfield Zq : Lburp/Zz1m;
    //   268: new burp/Zxr8
    //   271: dup
    //   272: getstatic burp/Zt35.Zj : Lburp/Zlnb;
    //   275: aload_1
    //   276: invokeinterface ZP : ()Ljava/lang/String;
    //   281: sipush #21575
    //   284: sipush #-3314
    //   287: invokestatic a : (II)Ljava/lang/String;
    //   290: invokestatic ZV : (Ljava/lang/String;Ljava/lang/String;)Lburp/Zrtf;
    //   293: invokespecial <init> : (Lburp/Zlnb;Ljava/lang/Object;)V
    //   296: invokeinterface ZD : (Lburp/Zxr8;)V
    //   301: aload #5
    //   303: athrow
    //   304: astore #8
    //   306: aload_0
    //   307: getfield ZG : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   310: iconst_0
    //   311: invokevirtual set : (Z)V
    //   314: aload #4
    //   316: invokeinterface ZZ : ()V
    //   321: aload #8
    //   323: athrow
    // Exception table:
    //   from	to	target	type
    //   39	161	208	net/portswigger/browser/Zcb
    //   39	161	254	java/lang/Throwable
    //   39	161	304	finally
    //   161	188	191	net/portswigger/browser/Zcb
    //   184	199	199	net/portswigger/browser/Zcb
    //   208	306	304	finally
  }
  
  private static Zcb lambda$replaySequence$20() {
    return new Zcb(a(21570, 7369));
  }
  
  private void lambda$replaySequence$19(Zko4 paramZko4, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> accept : (Lburp/Zmlb;Lburp/Zko4;)Ljava/util/function/Consumer;
    //   8: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   11: return
  }
  
  private void lambda$replaySequence$18(Zko4 paramZko4, Zct paramZct) {
    this.Zq.ZD(new Zxr8(Zt35.Zd, new Zlea(paramZko4.ZP(), paramZct)));
  }
  
  private static boolean lambda$browserRequestResponseToHttpTraffic$17(Zstu paramZstu) {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (paramZstu.Zpu() > 0);
  }
  
  private void lambda$snapshotDom$16(Zrcq paramZrcq, Zgb7 paramZgb7) {
    try {
      if (paramZgb7 instanceof Zgbv)
        try {
          if (paramZgb7.Zy().isPresent())
            paramZrcq.ZP(((Zxwm)paramZgb7.Zy().get()).toRoom.apply(this.Zr)); 
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  private static Ztrm[] lambda$snapshotDom$15(int paramInt) {
    return new Ztrm[paramInt];
  }
  
  private Zlat lambda$takeDoorway$14(Zg8y paramZg8y, Ze7 paramZe7) {
    return Zu(paramZg8y.ZM(), paramZe7);
  }
  
  private static void lambda$offerCorridors$13(Zgb7 paramZgb7, Zsib paramZsib) {
    paramZsib.Zy(paramZgb7);
  }
  
  private Zz0z lambda$handleRequest$12(Ztpx paramZtpx, Ztgw paramZtgw) {
    return Zr(paramZtpx, paramZtgw);
  }
  
  private boolean lambda$handleRequest$11(Ztgw paramZtgw, Zmk2 paramZmk2) {
    return paramZmk2.ZT(paramZtgw, this.Zz);
  }
  
  private static Integer lambda$handleRequest$10(Ztgw paramZtgw, Zsib paramZsib) {
    return Integer.valueOf(paramZsib.ZB(paramZtgw));
  }
  
  private static Integer lambda$handleRequest$9(String paramString, Integer paramInteger) {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Integer.valueOf((paramInteger == null) ? 1 : (paramInteger.intValue() + 1));
  }
  
  private static boolean lambda$buildResultIfRequestIsAFileUpload$8(Zc7 paramZc7, String paramString, byte[] paramArrayOfbyte) {
    String str1 = paramZc7.ZRz() + ":";
    String str2 = Zsbj.ZT(paramArrayOfbyte, str1, false);
    try {
      if (str2 != null)
        try {
          if (paramString.equalsIgnoreCase(str2.substring(str1.length()).trim()));
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  private static boolean lambda$buildResultIfRequestIsAFileUpload$7(Zc7 paramZc7) {
    return paramZc7.ZRO().toLowerCase().startsWith(a(21569, 1198));
  }
  
  private static boolean lambda$buildResultIfRequestIsAFileUpload$6(Zc7 paramZc7) {
    return a(21574, 31060).equalsIgnoreCase(paramZc7.ZRz());
  }
  
  private Zd6 lambda$requestHandler$5(Zjt paramZjt, Ztv paramZtv) {
    try {
      Ztgw ztgw = Ztgw.Zn(paramZjt, paramZtv, new Zkvk(this.Zy, this.Zz), this.Zf);
      return ZH(ztgw).Zm();
    } catch (Zxgy|Zxg5|java.net.MalformedURLException zxgy) {
      Zah.Zl(zxgy, Zk_.IGNORED);
      this.ZM.ZU(paramZjt.Zc());
    } catch (Zk8e zk8e) {
      Zah.Zl(zk8e, Zk_.COMMON_RUNTIME_FAILURE);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
      this.ZM.ZU(paramZjt.Zc());
    } 
    return (Zd6)new Zth();
  }
  
  private Zxx0 lambda$requestHandler$4(Zjt paramZjt, Zstu paramZstu) {
    return ZJ(paramZjt, paramZstu);
  }
  
  private void lambda$createIsolatedBrowserContext$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$createIsolatedBrowserContext$2);
  }
  
  private void lambda$createIsolatedBrowserContext$2(Zct paramZct) {
    this.Zh.set(paramZct.ZR());
    this.ZL.ZD(new Zxr8(Zt18.ZT, paramZct));
  }
  
  private void lambda$makeWebSocketSupportingResponseHandler$1(Zz2j paramZz2j, Zml3 paramZml3) throws Zz8h, IOException, Zs2o {
    (new Zsgk(this.Zc, this::Zl, paramZz2j, paramZml3, this.Zf, new Zs5a(this.ZZ), this.Zz, this.Zx)).Zb();
  }
  
  private static Zsxd lambda$new$0(Zzzx paramZzzx, Zgb6 paramZgb6, Zefx paramZefx) throws Exception {
    return paramZzzx.ZJ(paramZefx, Duration.ofMillis(paramZgb6.ZfT()), Duration.ofMillis(paramZgb6.ZEj()), new Zxfp()).Zv();
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'râÖ°ÚåÿJ¯IF¢x¤ú(®½`(§þ×PQF%\\bÛUlIO)}!Ê[K{0¢êB®2*ZY;H[4Æ÷"K;¼ ûQYãÝȳ¸¿^ÄÑÓE¨m¿ùÆ×uH:Òpg@B±Éõ½Êé75¨æ ^õª(ôLÙiýåf¸XG)Ý[À~<¶5Raõ\\r¦ú«TI(Ò9=úI#ÂvÔ·-h4o\c¿$ì,pÚG^Z¥8ÙöðÆ¹¯?±ôH«IÛ{µ¹DW8 Ì5î$a[®G÷Ç`ýûî¡Ôû¢éºë\\r=ýb<qþKÀ 1¥/8öÍ´o¹Lüï[#µ(lÐ¬°B&¹:BÅ;DWë^¶\\bZÐ§ò*\\nãÎâ\\rÝúk0ýäbµ.Z[pÿ=¸Mpú)?i¬¡c«Wlréí\\bUáÑ«Tsýä¼0AÚ^V\\fs«é\\fsX[¸ð~À"%¦Ì­:;ZÎ¸íPgëÖÑ{Ñõ@æAñzB>KÄ¨^#*ºë,ô!áÌj`½HUPÑBªS¾>N1_1£ññ<¤bö¿B¥Ýý~÷¼³3\\r¸Lµswy?0¦:ÞM`Ô|2d?Æ=(Á):ÊÞzá¼ ØÕÕqºìÿÎÐÒ¹5O?¬Fö;f£ðÄÊq¬/ålå¼¢-ßC0oâúígÈú{ç~k/ÈÐ8{Èôæ'p\\fÑ¾d,åu'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #23
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #87
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'êÀÎP|ÓÜ|Â"Ù§Ó\\f×ü¶ú\\f r5Ó^Gä'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #16
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #81
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zmlb.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmlb.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #66
    //   214: goto -> 244
    //   217: bipush #110
    //   219: goto -> 244
    //   222: bipush #58
    //   224: goto -> 244
    //   227: bipush #37
    //   229: goto -> 244
    //   232: bipush #32
    //   234: goto -> 244
    //   237: bipush #20
    //   239: goto -> 244
    //   242: bipush #49
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new net/portswigger/Zs4
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zmlb.Ze : Lnet/portswigger/Zs6;
    //   310: sipush #21568
    //   313: getstatic burp/Zmlb.Ze : Lnet/portswigger/Zs6;
    //   316: bipush #10
    //   318: invokevirtual Z_ : (I)Ljava/lang/String;
    //   321: putstatic burp/Zmlb.Zw : Ljava/lang/String;
    //   324: sipush #-241
    //   327: getstatic burp/Zmlb.Ze : Lnet/portswigger/Zs6;
    //   330: bipush #10
    //   332: invokevirtual Z_ : (I)Ljava/lang/String;
    //   335: putstatic burp/Zmlb.ZT : Ljava/lang/String;
    //   338: invokestatic a : (II)Ljava/lang/String;
    //   341: iconst_2
    //   342: anewarray java/lang/Object
    //   345: dup
    //   346: iconst_0
    //   347: getstatic burp/Zmlb.Zw : Ljava/lang/String;
    //   350: aastore
    //   351: dup
    //   352: iconst_1
    //   353: getstatic burp/Zmlb.ZT : Ljava/lang/String;
    //   356: aastore
    //   357: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   360: putstatic burp/Zmlb.Zl : Ljava/lang/String;
    //   363: ldc2_w 10
    //   366: invokestatic ofSeconds : (J)Ljava/time/Duration;
    //   369: putstatic burp/Zmlb.Zk : Ljava/time/Duration;
    //   372: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5443) & 0xFFFF;
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
      byte b1 = 106;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmlb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */