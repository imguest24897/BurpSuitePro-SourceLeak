package net.portswigger.devtools.client.impl;

import burp.Zlli;
import burp.Ztos;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import net.portswigger.browser.Zc3;
import net.portswigger.browser.Zcq;
import net.portswigger.browser.Zd;
import net.portswigger.browser.Zd0;
import net.portswigger.browser.Zdm;
import net.portswigger.browser.Ze3;
import net.portswigger.browser.Ze_;
import net.portswigger.browser.Zea;
import net.portswigger.browser.Zed;
import net.portswigger.browser.Zev;
import net.portswigger.browser.Zjo;
import net.portswigger.browser.Zjw;
import net.portswigger.browser.Zk;
import net.portswigger.browser.Zn;
import net.portswigger.browser.Zw;
import net.portswigger.browser.Zzk;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.protocol.ChromeDevTools;

public class Zm1 implements Zf, Zjw {
  private static final Zxa ZL;
  
  private static final Duration Ze;
  
  private final Zev Zg;
  
  private final Zd ZD;
  
  private final Zn ZY;
  
  private final Ztos<Zcq> Zx;
  
  private final Zxr Zp;
  
  private volatile Ze3 Zw;
  
  private final Zow ZR;
  
  private final Zme Zd;
  
  private final Zon ZI;
  
  private final Zm2 ZV;
  
  private final Zxt ZS;
  
  private final Zm8 Zk;
  
  private final Zm9 Zz;
  
  private final Zw Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zm1(Zc3 paramZc3, Zjo paramZjo, Zev paramZev, Zd paramZd, Zn paramZn, ExecutorService paramExecutorService) {
    // Byte code:
    //   0: invokestatic Zy : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: invokespecial <init> : ()V
    //   7: astore #7
    //   9: aload_0
    //   10: aload_3
    //   11: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   14: checkcast net/portswigger/browser/Zev
    //   17: putfield Zg : Lnet/portswigger/browser/Zev;
    //   20: aload_0
    //   21: aload #4
    //   23: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   26: checkcast net/portswigger/browser/Zd
    //   29: putfield ZD : Lnet/portswigger/browser/Zd;
    //   32: aload_0
    //   33: aload #5
    //   35: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   38: checkcast net/portswigger/devtools/client/Zn
    //   41: putfield ZY : Lnet/portswigger/devtools/client/Zn;
    //   44: aload_0
    //   45: new burp/Ztos
    //   48: dup
    //   49: invokestatic Zj : ()Lnet/portswigger/browser/Zcq;
    //   52: invokespecial <init> : (Lburp/Zt3y;)V
    //   55: putfield Zx : Lburp/Ztos;
    //   58: aload_0
    //   59: getstatic net/portswigger/browser/Ze3.ATTACHED : Lnet/portswigger/browser/Ze3;
    //   62: putfield Zw : Lnet/portswigger/browser/Ze3;
    //   65: aload_0
    //   66: aload_2
    //   67: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   70: aload_0
    //   71: aload_3
    //   72: aload #6
    //   74: <illegal opcode> apply : (Lnet/portswigger/devtools/client/impl/Zm1;Lnet/portswigger/browser/Zev;Ljava/util/concurrent/ExecutorService;)Ljava/util/function/Function;
    //   79: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   82: aload_0
    //   83: aload_3
    //   84: <illegal opcode> get : (Lnet/portswigger/devtools/client/impl/Zm1;Lnet/portswigger/browser/Zev;)Ljava/util/function/Supplier;
    //   89: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   92: checkcast net/portswigger/devtools/client/impl/Zow
    //   95: putfield ZR : Lnet/portswigger/devtools/client/impl/Zow;
    //   98: aload_0
    //   99: new net/portswigger/devtools/client/impl/Zm9
    //   102: dup
    //   103: aload_0
    //   104: getfield Zx : Lburp/Ztos;
    //   107: aload_0
    //   108: getfield ZR : Lnet/portswigger/devtools/client/impl/Zow;
    //   111: aload #5
    //   113: invokespecial <init> : (Lburp/Ztos;Lnet/portswigger/browser/Zzk;Lnet/portswigger/devtools/client/Zn;)V
    //   116: putfield Zz : Lnet/portswigger/devtools/client/impl/Zm9;
    //   119: aload_0
    //   120: new net/portswigger/devtools/client/impl/Zme
    //   123: dup
    //   124: aload #5
    //   126: invokespecial <init> : (Lnet/portswigger/devtools/client/Zn;)V
    //   129: putfield Zd : Lnet/portswigger/devtools/client/impl/Zme;
    //   132: aload_0
    //   133: new net/portswigger/devtools/client/impl/Zon
    //   136: dup
    //   137: aload_0
    //   138: getfield Zx : Lburp/Ztos;
    //   141: aload #5
    //   143: invokespecial <init> : (Lburp/Ztos;Lnet/portswigger/devtools/client/Zn;)V
    //   146: putfield ZI : Lnet/portswigger/devtools/client/impl/Zon;
    //   149: aload_0
    //   150: new net/portswigger/devtools/client/impl/Zm2
    //   153: dup
    //   154: aload #5
    //   156: invokespecial <init> : (Lnet/portswigger/devtools/client/Zn;)V
    //   159: putfield ZV : Lnet/portswigger/devtools/client/impl/Zm2;
    //   162: aload_0
    //   163: new net/portswigger/devtools/client/impl/Zxt
    //   166: dup
    //   167: aload #5
    //   169: invokespecial <init> : (Lnet/portswigger/devtools/client/Zn;)V
    //   172: putfield ZS : Lnet/portswigger/devtools/client/impl/Zxt;
    //   175: aload_0
    //   176: new net/portswigger/devtools/client/impl/Zm8
    //   179: dup
    //   180: aload #5
    //   182: invokespecial <init> : (Lnet/portswigger/devtools/client/Zn;)V
    //   185: putfield Zk : Lnet/portswigger/devtools/client/impl/Zm8;
    //   188: aload_0
    //   189: aload_1
    //   190: invokevirtual Za : ()Z
    //   193: ifeq -> 212
    //   196: new net/portswigger/devtools/client/impl/Zx3
    //   199: dup
    //   200: aload #5
    //   202: invokespecial <init> : (Lnet/portswigger/devtools/client/Zn;)V
    //   205: goto -> 222
    //   208: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   211: athrow
    //   212: new net/portswigger/devtools/client/impl/Zxw
    //   215: dup
    //   216: aload_3
    //   217: aload #5
    //   219: invokespecial <init> : (Lnet/portswigger/browser/Zev;Lnet/portswigger/devtools/client/Zn;)V
    //   222: putfield Zn : Lnet/portswigger/browser/Zw;
    //   225: aload_0
    //   226: new net/portswigger/devtools/client/impl/Zxr
    //   229: dup
    //   230: aload #5
    //   232: invokespecial <init> : (Lnet/portswigger/devtools/client/Zn;)V
    //   235: putfield Zp : Lnet/portswigger/devtools/client/impl/Zxr;
    //   238: aload #7
    //   240: ifnull -> 257
    //   243: iconst_3
    //   244: anewarray burp/Zbqc
    //   247: invokestatic Zr : ([Lburp/Zbqc;)V
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   256: athrow
    //   257: return
    // Exception table:
    //   from	to	target	type
    //   9	208	208	java/lang/RuntimeException
    //   222	250	253	java/lang/RuntimeException
  }
  
  public void ZW() throws Zi {
    // Byte code:
    //   0: invokestatic Zy : ()[Ljava/lang/String;
    //   3: getstatic net/portswigger/browser/Zds.DEBUG : Lnet/portswigger/browser/Zds;
    //   6: sipush #6740
    //   9: sipush #-25396
    //   12: invokestatic a : (II)Ljava/lang/String;
    //   15: iconst_0
    //   16: anewarray java/lang/Object
    //   19: invokestatic Zp : (Lnet/portswigger/browser/Zds;Ljava/lang/String;[Ljava/lang/Object;)V
    //   22: iconst_5
    //   23: anewarray java/util/concurrent/CompletableFuture
    //   26: dup
    //   27: iconst_0
    //   28: aload_0
    //   29: getfield ZI : Lnet/portswigger/devtools/client/impl/Zon;
    //   32: invokevirtual Zg : ()Ljava/util/concurrent/CompletableFuture;
    //   35: aastore
    //   36: dup
    //   37: iconst_1
    //   38: aload_0
    //   39: getfield ZV : Lnet/portswigger/devtools/client/impl/Zm2;
    //   42: invokevirtual Zc : ()Ljava/util/concurrent/CompletableFuture;
    //   45: aastore
    //   46: dup
    //   47: iconst_2
    //   48: aload_0
    //   49: getfield ZR : Lnet/portswigger/devtools/client/impl/Zow;
    //   52: invokeinterface Zy : ()Ljava/util/concurrent/CompletableFuture;
    //   57: aastore
    //   58: dup
    //   59: iconst_3
    //   60: aload_0
    //   61: getfield ZY : Lnet/portswigger/devtools/client/Zn;
    //   64: <illegal opcode> Zy : ()Lnet/portswigger/devtools/client/Zs;
    //   69: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   72: invokevirtual ZL : (Lnet/portswigger/devtools/client/Zk;)Ljava/util/concurrent/CompletableFuture;
    //   75: aastore
    //   76: dup
    //   77: iconst_4
    //   78: aload_0
    //   79: getfield ZY : Lnet/portswigger/devtools/client/Zn;
    //   82: <illegal opcode> Zy : ()Lnet/portswigger/devtools/client/Zs;
    //   87: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   90: invokevirtual ZL : (Lnet/portswigger/devtools/client/Zk;)Ljava/util/concurrent/CompletableFuture;
    //   93: aastore
    //   94: invokestatic allOf : ([Ljava/util/concurrent/CompletableFuture;)Ljava/util/concurrent/CompletableFuture;
    //   97: astore_2
    //   98: aload_0
    //   99: getfield Zz : Lnet/portswigger/devtools/client/impl/Zm9;
    //   102: invokevirtual ZP : ()V
    //   105: aconst_null
    //   106: astore_3
    //   107: astore_1
    //   108: getstatic net/portswigger/browser/Zds.DEBUG : Lnet/portswigger/browser/Zds;
    //   111: sipush #6736
    //   114: sipush #-18847
    //   117: invokestatic a : (II)Ljava/lang/String;
    //   120: iconst_0
    //   121: anewarray java/lang/Object
    //   124: invokestatic Zp : (Lnet/portswigger/browser/Zds;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: aload_0
    //   128: getfield ZY : Lnet/portswigger/devtools/client/Zn;
    //   131: aload_0
    //   132: <illegal opcode> Zy : (Lnet/portswigger/devtools/client/impl/Zm1;)Lnet/portswigger/devtools/client/Zs;
    //   137: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   140: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   143: checkcast net/portswigger/devtools/protocol/types/target/TargetInfo
    //   146: getfield url : Ljava/lang/String;
    //   149: astore #4
    //   151: aload #4
    //   153: invokestatic Zg : ()Ljava/lang/String;
    //   156: invokevirtual equals : (Ljava/lang/Object;)Z
    //   159: ifeq -> 189
    //   162: aload_0
    //   163: getfield ZY : Lnet/portswigger/devtools/client/Zn;
    //   166: <illegal opcode> Zy : ()Lnet/portswigger/devtools/client/Zs;
    //   171: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   174: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   177: pop
    //   178: aload_1
    //   179: ifnull -> 222
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   188: athrow
    //   189: getstatic net/portswigger/devtools/client/impl/Zm1.Ze : Ljava/time/Duration;
    //   192: invokestatic ZR : (Ljava/time/Duration;)Lnet/portswigger/browser/Zje;
    //   195: astore_3
    //   196: aload_3
    //   197: aload_0
    //   198: invokevirtual ZQ : (Lnet/portswigger/browser/Zjw;)V
    //   201: aload_0
    //   202: getfield ZY : Lnet/portswigger/devtools/client/Zn;
    //   205: <illegal opcode> Zy : ()Lnet/portswigger/devtools/client/Zs;
    //   210: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   213: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   216: pop
    //   217: aload_3
    //   218: aload_0
    //   219: invokevirtual ZA : (Lnet/portswigger/browser/Zjw;)V
    //   222: getstatic net/portswigger/browser/Zds.DEBUG : Lnet/portswigger/browser/Zds;
    //   225: aload_2
    //   226: invokevirtual isDone : ()Z
    //   229: ifeq -> 248
    //   232: sipush #6737
    //   235: sipush #-1967
    //   238: invokestatic a : (II)Ljava/lang/String;
    //   241: goto -> 257
    //   244: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   247: athrow
    //   248: sipush #6739
    //   251: sipush #-18037
    //   254: invokestatic a : (II)Ljava/lang/String;
    //   257: iconst_0
    //   258: anewarray java/lang/Object
    //   261: invokestatic Zp : (Lnet/portswigger/browser/Zds;Ljava/lang/String;[Ljava/lang/Object;)V
    //   264: aload_2
    //   265: ldc2_w 5
    //   268: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   271: invokevirtual get : (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   274: pop
    //   275: aload_3
    //   276: ifnull -> 441
    //   279: aload_3
    //   280: invokevirtual Zs : ()V
    //   283: goto -> 441
    //   286: astore #4
    //   288: aload #4
    //   290: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   293: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   296: invokestatic currentThread : ()Ljava/lang/Thread;
    //   299: invokevirtual interrupt : ()V
    //   302: aload_3
    //   303: ifnull -> 441
    //   306: aload_3
    //   307: invokevirtual Zs : ()V
    //   310: goto -> 441
    //   313: astore #4
    //   315: aload #4
    //   317: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   320: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   323: aload #4
    //   325: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   328: astore #7
    //   330: aload #7
    //   332: instanceof net/portswigger/devtools/client/Zi
    //   335: ifeq -> 348
    //   338: aload #7
    //   340: checkcast net/portswigger/devtools/client/Zi
    //   343: astore #5
    //   345: aload #5
    //   347: athrow
    //   348: aload #4
    //   350: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   353: astore #7
    //   355: aload #7
    //   357: instanceof java/lang/RuntimeException
    //   360: ifeq -> 373
    //   363: aload #7
    //   365: checkcast java/lang/RuntimeException
    //   368: astore #6
    //   370: aload #6
    //   372: athrow
    //   373: new java/lang/AssertionError
    //   376: dup
    //   377: sipush #6741
    //   380: sipush #7067
    //   383: invokestatic a : (II)Ljava/lang/String;
    //   386: aload #4
    //   388: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   391: athrow
    //   392: astore #4
    //   394: aload #4
    //   396: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   399: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   402: new net/portswigger/devtools/client/Zv
    //   405: dup
    //   406: sipush #6738
    //   409: sipush #-12142
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: aload #4
    //   417: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   420: athrow
    //   421: astore #8
    //   423: aload_3
    //   424: ifnull -> 438
    //   427: aload_3
    //   428: invokevirtual Zs : ()V
    //   431: goto -> 438
    //   434: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   437: athrow
    //   438: aload #8
    //   440: athrow
    //   441: return
    // Exception table:
    //   from	to	target	type
    //   108	275	286	java/lang/InterruptedException
    //   108	275	313	java/util/concurrent/ExecutionException
    //   108	275	392	java/util/concurrent/TimeoutException
    //   108	275	421	finally
    //   151	182	185	java/lang/InterruptedException
    //   222	244	244	java/lang/InterruptedException
    //   286	302	421	finally
    //   313	423	421	finally
    //   423	431	434	java/lang/InterruptedException
  }
  
  public Zd Z_() {
    return this.ZD;
  }
  
  public Ze3 ZO() {
    return this.Zw;
  }
  
  public void Zo(Ze3 paramZe3) {
    this.Zw = paramZe3;
  }
  
  public Zev ZG() {
    return this.Zg;
  }
  
  public Zn Zv() {
    return this.ZY;
  }
  
  public Zlli<Zcq> Zk() {
    return (Zlli<Zcq>)this.Zx;
  }
  
  public Zm9 ZE() {
    return this.Zz;
  }
  
  public Zme Zn() {
    return this.Zd;
  }
  
  public Zon ZL() {
    return this.ZI;
  }
  
  public Zm2 Zi() {
    return this.ZV;
  }
  
  public Zxt ZV() {
    return this.ZS;
  }
  
  public Zm8 Zd() {
    return this.Zk;
  }
  
  public Zw ZK() {
    return this.Zn;
  }
  
  public Zzk ZN() {
    return this.ZR;
  }
  
  public Zn ZU() {
    return this.Zp;
  }
  
  public void Zp() {
    this.ZY.ZX();
    this.ZR.Zd();
    this.ZV.Zz();
  }
  
  private CompletableFuture lambda$focus$7(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getTarget().activateTarget(ZG().ZB3());
  }
  
  private static CompletableFuture lambda$initialise$6(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().runIfWaitingForDebugger();
  }
  
  private static CompletableFuture lambda$initialise$5(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().runIfWaitingForDebugger();
  }
  
  private CompletableFuture lambda$initialise$4(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getTarget().getTargetInfo(this.Zg.ZB3());
  }
  
  private static CompletableFuture lambda$initialise$3(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getAnimation().setPlaybackRate(Double.valueOf(1000.0D));
  }
  
  private static CompletableFuture lambda$initialise$2(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getServiceWorker().enable();
  }
  
  private Zow lambda$new$1(Zev paramZev) {
    return new Zxs(paramZev, this.Zx, this.ZY);
  }
  
  private Zow lambda$new$0(Zev paramZev, ExecutorService paramExecutorService, Zjo paramZjo) {
    return new Zxn(paramZev, this.Zx, this.ZY, paramZjo, paramExecutorService);
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ZYQHæû?Ùä\\rò¬Tq\\rÁrâ»çQ}á¬3±û%¨,²CÖ7êj <Ãâ¤¦ ðÛ÷°uÓ"úÂW}F°£fékÛFSê¾n@+3<>*°,q:P4-HnKØõÛ]Éy°[-Õv?p]ºµÀÐÆÍTý¢ßùxÃûZð+@\\b¹äÃÁïÞâ°,'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #25
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #112
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
    //   68: ldc 'O3Sp¬²ðuHß¢ó}ü®/Y È¾ÁbÙ®zÁUW¼}äáÜò¥é_ôwßÍdµu[J¡ Ôïu\ãz2I§1¶édi'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #83
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #6
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
    //   129: putstatic net/portswigger/devtools/client/impl/Zm1.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/devtools/client/impl/Zm1.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #112
    //   214: goto -> 243
    //   217: bipush #17
    //   219: goto -> 243
    //   222: iconst_1
    //   223: goto -> 243
    //   226: bipush #74
    //   228: goto -> 243
    //   231: bipush #76
    //   233: goto -> 243
    //   236: bipush #50
    //   238: goto -> 243
    //   241: bipush #65
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: new net/portswigger/devtools/client/impl/Zxa
    //   303: dup
    //   304: sipush #6742
    //   307: sipush #-7314
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic net/portswigger/devtools/client/impl/Zm1.ZL : Lnet/portswigger/devtools/client/impl/Zxa;
    //   319: ldc2_w 50
    //   322: invokestatic ofMillis : (J)Ljava/time/Duration;
    //   325: putstatic net/portswigger/devtools/client/impl/Zm1.Ze : Ljava/time/Duration;
    //   328: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1A50) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zm1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */