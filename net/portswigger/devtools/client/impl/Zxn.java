package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import burp.Ztos;
import burp.Zxr8;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import net.portswigger.Zah;
import net.portswigger.Zi7;
import net.portswigger.Zk_;
import net.portswigger.browser.Zc7;
import net.portswigger.browser.Zcq;
import net.portswigger.browser.Zd2;
import net.portswigger.browser.Zd6;
import net.portswigger.browser.Zdn;
import net.portswigger.browser.Zev;
import net.portswigger.browser.Zjo;
import net.portswigger.browser.Zjt;
import net.portswigger.browser.Zth;
import net.portswigger.browser.Zti;
import net.portswigger.browser.Ztj;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztq;
import net.portswigger.browser.Ztv;
import net.portswigger.browser.Ztw;
import net.portswigger.browser.Zz8;
import net.portswigger.browser.Zzk;
import net.portswigger.devtools.client.Z_;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.events.fetch.RequestPaused;
import net.portswigger.devtools.protocol.events.network.LoadingFailed;
import net.portswigger.devtools.protocol.events.network.RequestWillBeSent;
import net.portswigger.devtools.protocol.events.page.FrameAttached;
import net.portswigger.devtools.protocol.events.page.FrameDetached;
import net.portswigger.devtools.protocol.events.page.FrameScheduledNavigation;
import net.portswigger.devtools.protocol.types.network.PostDataEntry;

public class Zxn implements Zzk, Zow {
  private final Zev ZB;
  
  private final Ztos<Zcq> ZY;
  
  private final Zn ZQ;
  
  private final Zjo Zl;
  
  private final ExecutorService ZP;
  
  private final Set<String> ZL = new CopyOnWriteArraySet<>();
  
  private final Map<String, Zdn> Ze = new ConcurrentHashMap<>();
  
  private final Map<Ztw, Integer> ZU = new ConcurrentHashMap<>();
  
  private final Map<Zd2, Zoh> Zp = new ConcurrentHashMap<>();
  
  private final Map<Zz8, Zxp> Zf;
  
  private static boolean Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zxn(Zev paramZev, Ztos<Zcq> paramZtos, Zn paramZn, Zjo paramZjo, ExecutorService paramExecutorService) {
    boolean bool = Zz();
    try {
      this.Zf = new ConcurrentHashMap<>();
      this.ZB = paramZev;
      this.ZY = Objects.<Ztos<Zcq>>requireNonNull(paramZtos);
      this.ZQ = Objects.<Zn>requireNonNull(paramZn);
      this.Zl = paramZjo;
      this.ZP = paramExecutorService;
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (CompletionException completionException) {
          throw a(null);
        } 
        ZN(!bool);
      } 
    } catch (CompletionException completionException) {
      throw a(null);
    } 
  }
  
  public CompletableFuture<?> Zy() throws Zi {
    this.ZQ.Zn(this::lambda$initialise$1);
    this.ZQ.Zn(this::lambda$initialise$3);
    this.ZQ.Zn(this::lambda$initialise$5);
    boolean bool = Zz();
    try {
      this.ZQ.Zn(this::lambda$initialise$8);
      this.ZQ.Zn(this::lambda$initialise$11);
      this.ZQ.Zn(this::lambda$initialise$14);
      if (bool)
        Zbqc.Zr(new Zbqc[2]); 
    } catch (Zi zi) {
      throw a(null);
    } 
    return CompletableFuture.allOf((CompletableFuture<?>[])new CompletableFuture[] { this.ZQ.ZL(Zk.ZA(Zxn::lambda$initialise$15)), this.ZQ.ZL(Zk.ZA(Zxn::lambda$initialise$16)) });
  }
  
  private void Zb(Zjo paramZjo, Zjt paramZjt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZL : Ljava/util/Set;
    //   4: aload_2
    //   5: invokevirtual ZV : ()Ljava/lang/String;
    //   8: invokeinterface remove : (Ljava/lang/Object;)Z
    //   13: ifne -> 50
    //   16: aload_0
    //   17: getfield ZU : Ljava/util/Map;
    //   20: aload_2
    //   21: invokevirtual Zj : ()Lnet/portswigger/browser/Ztw;
    //   24: iconst_0
    //   25: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   28: invokeinterface getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   33: checkcast java/lang/Integer
    //   36: invokevirtual intValue : ()I
    //   39: iconst_3
    //   40: if_icmple -> 119
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: getstatic net/portswigger/browser/Zds.WARNING : Lnet/portswigger/browser/Zds;
    //   53: sipush #-5291
    //   56: sipush #-21884
    //   59: invokestatic a : (II)Ljava/lang/String;
    //   62: iconst_1
    //   63: anewarray java/lang/Object
    //   66: dup
    //   67: iconst_0
    //   68: aload_2
    //   69: invokevirtual ZV : ()Ljava/lang/String;
    //   72: aastore
    //   73: invokestatic Zp : (Lnet/portswigger/browser/Zds;Ljava/lang/String;[Ljava/lang/Object;)V
    //   76: new net/portswigger/devtools/client/impl/Zmz
    //   79: dup
    //   80: aload_0
    //   81: getfield ZQ : Lnet/portswigger/devtools/client/Zn;
    //   84: aload_2
    //   85: invokespecial <init> : (Lnet/portswigger/devtools/client/Zn;Lnet/portswigger/browser/Zjt;)V
    //   88: new net/portswigger/browser/Zth
    //   91: dup
    //   92: invokespecial <init> : ()V
    //   95: invokevirtual ZX : (Lnet/portswigger/browser/Zth;)Ljava/util/concurrent/CompletableFuture;
    //   98: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   103: invokevirtual exceptionally : (Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;
    //   106: astore_3
    //   107: aload_3
    //   108: aload_0
    //   109: aload_2
    //   110: <illegal opcode> accept : (Lnet/portswigger/devtools/client/impl/Zxn;Lnet/portswigger/browser/Zjt;)Ljava/util/function/BiConsumer;
    //   115: invokevirtual whenCompleteAsync : (Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
    //   118: pop
    //   119: invokestatic ZD : ()Lnet/portswigger/browser/Ztv;
    //   122: astore_3
    //   123: aload_2
    //   124: invokevirtual ZT : ()Lnet/portswigger/browser/Zd2;
    //   127: ifnull -> 186
    //   130: aload_2
    //   131: invokevirtual ZT : ()Lnet/portswigger/browser/Zd2;
    //   134: invokevirtual ZB8 : ()Ljava/lang/String;
    //   137: ifnull -> 186
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: aload_0
    //   148: getfield Zp : Ljava/util/Map;
    //   151: aload_2
    //   152: invokevirtual ZT : ()Lnet/portswigger/browser/Zd2;
    //   155: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   160: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   165: checkcast net/portswigger/devtools/client/impl/Zoh
    //   168: invokevirtual Zd : ()Lnet/portswigger/browser/Ztv;
    //   171: astore_3
    //   172: aload_0
    //   173: getfield Zp : Ljava/util/Map;
    //   176: aload_2
    //   177: invokevirtual ZT : ()Lnet/portswigger/browser/Zd2;
    //   180: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   185: pop
    //   186: aload_0
    //   187: aload_1
    //   188: aload_2
    //   189: aload_3
    //   190: invokevirtual ZG : (Lnet/portswigger/browser/Zjo;Lnet/portswigger/browser/Zjt;Lnet/portswigger/browser/Ztv;)Lnet/portswigger/browser/Zd6;
    //   193: astore #4
    //   195: aload_0
    //   196: getfield Zf : Ljava/util/Map;
    //   199: dup
    //   200: astore #5
    //   202: monitorenter
    //   203: aload_0
    //   204: getfield Zf : Ljava/util/Map;
    //   207: aload_2
    //   208: invokevirtual ZU : ()Lnet/portswigger/browser/Zz8;
    //   211: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   216: ifeq -> 261
    //   219: new net/portswigger/devtools/client/impl/Zmz
    //   222: dup
    //   223: aload_0
    //   224: getfield ZQ : Lnet/portswigger/devtools/client/Zn;
    //   227: aload_2
    //   228: invokespecial <init> : (Lnet/portswigger/devtools/client/Zn;Lnet/portswigger/browser/Zjt;)V
    //   231: aload #4
    //   233: invokevirtual Zv : (Lnet/portswigger/browser/Zd6;)Ljava/util/concurrent/CompletableFuture;
    //   236: aload_0
    //   237: aload_2
    //   238: <illegal opcode> apply : (Lnet/portswigger/devtools/client/impl/Zxn;Lnet/portswigger/browser/Zjt;)Ljava/util/function/Function;
    //   243: invokevirtual exceptionally : (Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;
    //   246: astore #6
    //   248: aload #6
    //   250: aload_0
    //   251: aload_2
    //   252: <illegal opcode> accept : (Lnet/portswigger/devtools/client/impl/Zxn;Lnet/portswigger/browser/Zjt;)Ljava/util/function/BiConsumer;
    //   257: invokevirtual whenCompleteAsync : (Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
    //   260: pop
    //   261: aload #5
    //   263: monitorexit
    //   264: goto -> 275
    //   267: astore #7
    //   269: aload #5
    //   271: monitorexit
    //   272: aload #7
    //   274: athrow
    //   275: return
    // Exception table:
    //   from	to	target	type
    //   0	43	46	java/util/concurrent/CompletionException
    //   123	140	143	java/util/concurrent/CompletionException
    //   203	264	267	finally
    //   267	272	267	finally
  }
  
  private Zd6 ZG(Zjo paramZjo, Zjt paramZjt, Ztv paramZtv) {
    try {
      return paramZjo.ZJ(paramZtv, paramZjt);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
      return (Zd6)new Zth();
    } 
  }
  
  public void Zi(String paramString, Zdn paramZdn) {
    this.Ze.put(paramString, paramZdn);
  }
  
  private Zdn Zn(RequestPaused paramRequestPaused) {
    // Byte code:
    //   0: invokestatic Zz : ()Z
    //   3: aload_0
    //   4: getfield Ze : Ljava/util/Map;
    //   7: aload_1
    //   8: getfield request : Lnet/portswigger/devtools/protocol/types/network/Request;
    //   11: getfield headers : Ljava/util/Map;
    //   14: sipush #-5294
    //   17: sipush #27946
    //   20: invokestatic a : (II)Ljava/lang/String;
    //   23: ldc ''
    //   25: invokestatic ZN : (Ljava/lang/String;)Lnet/portswigger/Zhq;
    //   28: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   33: invokeinterface getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   38: checkcast net/portswigger/Zi7
    //   41: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   46: invokeinterface ZW : ()Ljava/lang/String;
    //   51: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   56: checkcast net/portswigger/browser/Zdn
    //   59: astore_3
    //   60: istore_2
    //   61: aload_3
    //   62: ifnonnull -> 210
    //   65: aload_1
    //   66: getfield request : Lnet/portswigger/devtools/protocol/types/network/Request;
    //   69: getfield headers : Ljava/util/Map;
    //   72: invokeinterface entrySet : ()Ljava/util/Set;
    //   77: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   82: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   87: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   92: invokestatic toList : ()Ljava/util/stream/Collector;
    //   95: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   100: checkcast java/util/List
    //   103: astore #4
    //   105: aload_1
    //   106: getfield request : Lnet/portswigger/devtools/protocol/types/network/Request;
    //   109: getfield postDataEntries : Ljava/util/List;
    //   112: astore #5
    //   114: aload #5
    //   116: ifnull -> 156
    //   119: aload #5
    //   121: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   126: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   131: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   136: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   141: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   146: ifeq -> 164
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: aconst_null
    //   157: goto -> 171
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: aload_1
    //   165: getfield request : Lnet/portswigger/devtools/protocol/types/network/Request;
    //   168: getfield postData : Ljava/lang/String;
    //   171: astore #6
    //   173: new net/portswigger/browser/Zdn
    //   176: dup
    //   177: aload_1
    //   178: getfield request : Lnet/portswigger/devtools/protocol/types/network/Request;
    //   181: getfield method : Ljava/lang/String;
    //   184: aload_1
    //   185: getfield request : Lnet/portswigger/devtools/protocol/types/network/Request;
    //   188: getfield url : Ljava/lang/String;
    //   191: aload_1
    //   192: getfield request : Lnet/portswigger/devtools/protocol/types/network/Request;
    //   195: getfield urlFragment : Ljava/lang/String;
    //   198: aload #4
    //   200: aload #6
    //   202: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    //   205: astore_3
    //   206: iload_2
    //   207: ifeq -> 299
    //   210: aload_3
    //   211: invokevirtual Zo : ()Z
    //   214: ifeq -> 299
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   223: athrow
    //   224: aload_1
    //   225: getfield request : Lnet/portswigger/devtools/protocol/types/network/Request;
    //   228: getfield headers : Ljava/util/Map;
    //   231: invokeinterface entrySet : ()Ljava/util/Set;
    //   236: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   241: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   246: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   251: invokeinterface findFirst : ()Ljava/util/Optional;
    //   256: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   261: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   264: astore #4
    //   266: aload #4
    //   268: invokevirtual isPresent : ()Z
    //   271: ifeq -> 299
    //   274: aload_3
    //   275: invokevirtual ZL : ()Ljava/util/List;
    //   278: aload #4
    //   280: invokevirtual get : ()Ljava/lang/Object;
    //   283: checkcast net/portswigger/browser/Zc7
    //   286: invokeinterface add : (Ljava/lang/Object;)Z
    //   291: pop
    //   292: goto -> 299
    //   295: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   298: athrow
    //   299: aload_3
    //   300: areturn
    // Exception table:
    //   from	to	target	type
    //   114	149	152	java/util/concurrent/CompletionException
    //   119	160	160	java/util/concurrent/CompletionException
    //   206	217	220	java/util/concurrent/CompletionException
    //   266	292	295	java/util/concurrent/CompletionException
  }
  
  private static void Zu(Zn paramZn, Zjt paramZjt) {
    (new Zmz(paramZn, paramZjt)).ZX(new Zth()).exceptionally(Zxn::lambda$silentlyFailRequest$26);
  }
  
  public void Zd() {
    synchronized (this.Zf) {
      this.Zf.forEach(Zxn::lambda$onTargetClose$27);
      this.Zf.clear();
    } 
  }
  
  public void ZL() throws Ztk {
    try {
      this.ZQ.Zz(Zk.ZA(Zxn::lambda$disableCache$28));
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(a(-5293, 19082), zi);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } 
  }
  
  public void ZU() {
    this.ZL.clear();
  }
  
  private static CompletableFuture lambda$disableCache$28(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getNetwork().setCacheDisabled(Boolean.valueOf(true));
  }
  
  private static void lambda$onTargetClose$27(Zz8 paramZz8, Zxp paramZxp) {
    paramZxp.Ze();
  }
  
  private static Void lambda$silentlyFailRequest$26(Throwable paramThrowable) {
    // Byte code:
    //   0: invokestatic Zl : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: instanceof java/util/concurrent/CompletionException
    //   8: ifeq -> 22
    //   11: aload_0
    //   12: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   15: goto -> 23
    //   18: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   21: athrow
    //   22: aload_0
    //   23: astore_2
    //   24: aload_2
    //   25: instanceof java/lang/InterruptedException
    //   28: ifeq -> 55
    //   31: aload_2
    //   32: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   35: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   38: invokestatic currentThread : ()Ljava/lang/Thread;
    //   41: invokevirtual interrupt : ()V
    //   44: iload_1
    //   45: ifne -> 161
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: aload_2
    //   56: instanceof net/portswigger/devtools/client/Ze
    //   59: ifne -> 97
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: aload_2
    //   70: instanceof net/portswigger/devtools/client/Z_
    //   73: ifne -> 97
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_2
    //   84: instanceof net/portswigger/devtools/client/Zp
    //   87: ifeq -> 115
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: aload_2
    //   98: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   101: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   104: iload_1
    //   105: ifne -> 161
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: aload_2
    //   116: instanceof net/portswigger/devtools/client/Zi
    //   119: ifeq -> 147
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: aload_2
    //   130: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   133: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   136: iload_1
    //   137: ifne -> 161
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: aload_2
    //   148: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   151: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   160: athrow
    //   161: aconst_null
    //   162: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	18	java/util/concurrent/CompletionException
    //   24	48	51	java/util/concurrent/CompletionException
    //   31	62	65	java/util/concurrent/CompletionException
    //   55	76	79	java/util/concurrent/CompletionException
    //   69	90	93	java/util/concurrent/CompletionException
    //   83	108	111	java/util/concurrent/CompletionException
    //   97	122	125	java/util/concurrent/CompletionException
    //   115	140	143	java/util/concurrent/CompletionException
    //   129	154	157	java/util/concurrent/CompletionException
  }
  
  private static Zc7 lambda$getRequestDetails$25(Map.Entry paramEntry) {
    return new Zc7((String)paramEntry.getKey(), ((Zi7)paramEntry.getValue()).ZP().ZW());
  }
  
  private static boolean lambda$getRequestDetails$24(Map.Entry paramEntry) {
    return ((String)paramEntry.getKey()).equalsIgnoreCase(a(-5296, -6241));
  }
  
  private static String lambda$getRequestDetails$23(PostDataEntry paramPostDataEntry) {
    return paramPostDataEntry.bytes;
  }
  
  private static Zc7 lambda$getRequestDetails$22(Map.Entry paramEntry) {
    return new Zc7((String)paramEntry.getKey(), ((Zi7)paramEntry.getValue()).ZP().ZW());
  }
  
  private void lambda$issueAndRespondToRequest$21(Zjt paramZjt, Void paramVoid, Throwable paramThrowable) {
    this.Zf.remove(paramZjt.ZU());
  }
  
  private Void lambda$issueAndRespondToRequest$20(Zjt paramZjt, Throwable paramThrowable) {
    // Byte code:
    //   0: invokestatic Zz : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: instanceof java/util/concurrent/CompletionException
    //   8: ifeq -> 22
    //   11: aload_2
    //   12: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   15: goto -> 23
    //   18: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   21: athrow
    //   22: aload_2
    //   23: astore #4
    //   25: aload #4
    //   27: instanceof net/portswigger/devtools/client/Ze
    //   30: ifne -> 63
    //   33: aload #4
    //   35: instanceof net/portswigger/devtools/client/Z_
    //   38: ifne -> 63
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: aload #4
    //   50: instanceof net/portswigger/devtools/client/Zp
    //   53: ifeq -> 82
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: aload #4
    //   65: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   68: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   71: iload_3
    //   72: ifeq -> 229
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload #4
    //   84: instanceof java/lang/InterruptedException
    //   87: ifeq -> 122
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: aload #4
    //   99: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   102: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   105: invokestatic currentThread : ()Ljava/lang/Thread;
    //   108: invokevirtual interrupt : ()V
    //   111: iload_3
    //   112: ifeq -> 229
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: aload #4
    //   124: instanceof net/portswigger/devtools/client/Zw
    //   127: ifeq -> 164
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   136: athrow
    //   137: aload #4
    //   139: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   142: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   145: aload_0
    //   146: getfield ZQ : Lnet/portswigger/devtools/client/Zn;
    //   149: aload_1
    //   150: invokestatic Zu : (Lnet/portswigger/devtools/client/Zn;Lnet/portswigger/browser/Zjt;)V
    //   153: iload_3
    //   154: ifeq -> 229
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: aload #4
    //   166: instanceof net/portswigger/devtools/client/Zv
    //   169: ifeq -> 206
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   178: athrow
    //   179: aload #4
    //   181: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   184: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   187: aload_0
    //   188: getfield ZQ : Lnet/portswigger/devtools/client/Zn;
    //   191: aload_1
    //   192: invokestatic Zu : (Lnet/portswigger/devtools/client/Zn;Lnet/portswigger/browser/Zjt;)V
    //   195: iload_3
    //   196: ifeq -> 229
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   205: athrow
    //   206: aload #4
    //   208: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   211: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   214: aload_0
    //   215: getfield ZQ : Lnet/portswigger/devtools/client/Zn;
    //   218: aload_1
    //   219: invokestatic Zu : (Lnet/portswigger/devtools/client/Zn;Lnet/portswigger/browser/Zjt;)V
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   228: athrow
    //   229: aconst_null
    //   230: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	18	java/util/concurrent/CompletionException
    //   25	41	44	java/util/concurrent/CompletionException
    //   33	56	59	java/util/concurrent/CompletionException
    //   48	75	78	java/util/concurrent/CompletionException
    //   63	90	93	java/util/concurrent/CompletionException
    //   82	115	118	java/util/concurrent/CompletionException
    //   97	130	133	java/util/concurrent/CompletionException
    //   122	157	160	java/util/concurrent/CompletionException
    //   137	172	175	java/util/concurrent/CompletionException
    //   164	199	202	java/util/concurrent/CompletionException
    //   179	222	225	java/util/concurrent/CompletionException
  }
  
  private static Zoh lambda$issueAndRespondToRequest$19(Zd2 paramZd2) {
    return new Zoh();
  }
  
  private void lambda$issueAndRespondToRequest$18(Zjt paramZjt, Void paramVoid, Throwable paramThrowable) {
    this.Zf.remove(paramZjt.ZU());
  }
  
  private static Void lambda$issueAndRespondToRequest$17(Throwable paramThrowable) {
    // Byte code:
    //   0: invokestatic Zz : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: instanceof java/util/concurrent/CompletionException
    //   8: ifeq -> 22
    //   11: aload_0
    //   12: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   15: goto -> 23
    //   18: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   21: athrow
    //   22: aload_0
    //   23: astore_2
    //   24: aload_2
    //   25: instanceof net/portswigger/devtools/client/Ze
    //   28: ifne -> 59
    //   31: aload_2
    //   32: instanceof net/portswigger/devtools/client/Zp
    //   35: ifne -> 59
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: aload_2
    //   46: instanceof net/portswigger/devtools/client/Z_
    //   49: ifeq -> 77
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: aload_2
    //   60: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   63: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   66: iload_1
    //   67: ifeq -> 161
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: aload_2
    //   78: instanceof java/lang/InterruptedException
    //   81: ifeq -> 115
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: aload_2
    //   92: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   95: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   98: invokestatic currentThread : ()Ljava/lang/Thread;
    //   101: invokevirtual interrupt : ()V
    //   104: iload_1
    //   105: ifeq -> 161
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: aload_2
    //   116: instanceof net/portswigger/devtools/client/Zi
    //   119: ifeq -> 147
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: aload_2
    //   130: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   133: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   136: iload_1
    //   137: ifeq -> 161
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: aload_2
    //   148: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   151: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   160: athrow
    //   161: aconst_null
    //   162: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	18	java/util/concurrent/CompletionException
    //   24	38	41	java/util/concurrent/CompletionException
    //   31	52	55	java/util/concurrent/CompletionException
    //   45	70	73	java/util/concurrent/CompletionException
    //   59	84	87	java/util/concurrent/CompletionException
    //   77	108	111	java/util/concurrent/CompletionException
    //   91	122	125	java/util/concurrent/CompletionException
    //   115	140	143	java/util/concurrent/CompletionException
    //   129	154	157	java/util/concurrent/CompletionException
  }
  
  private static CompletableFuture lambda$initialise$16(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getFetch().enable();
  }
  
  private static CompletableFuture lambda$initialise$15(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getNetwork().enable();
  }
  
  private Zs lambda$initialise$14(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getFetch().onRequestPaused(this::lambda$initialise$13);
  }
  
  private void lambda$initialise$13(RequestPaused paramRequestPaused) {
    // Byte code:
    //   0: new net/portswigger/browser/Zjt
    //   3: dup
    //   4: new net/portswigger/browser/Zz8
    //   7: dup
    //   8: aload_1
    //   9: getfield requestId : Ljava/lang/String;
    //   12: invokespecial <init> : (Ljava/lang/String;)V
    //   15: aload_0
    //   16: getfield ZB : Lnet/portswigger/browser/Zev;
    //   19: new net/portswigger/browser/Ztw
    //   22: dup
    //   23: aload_1
    //   24: getfield frameId : Ljava/lang/String;
    //   27: invokespecial <init> : (Ljava/lang/String;)V
    //   30: new net/portswigger/browser/Zd2
    //   33: dup
    //   34: aload_1
    //   35: getfield networkId : Ljava/lang/String;
    //   38: invokespecial <init> : (Ljava/lang/String;)V
    //   41: invokestatic Zi : ()Lnet/portswigger/devtools/client/impl/Zou;
    //   44: aload_1
    //   45: getfield resourceType : Lnet/portswigger/devtools/protocol/types/network/ResourceType;
    //   48: invokevirtual Zk : (Ljava/lang/Object;)Ljava/lang/Object;
    //   51: checkcast net/portswigger/browser/Zec
    //   54: aload_0
    //   55: aload_1
    //   56: invokevirtual Zn : (Lnet/portswigger/devtools/protocol/events/fetch/RequestPaused;)Lnet/portswigger/browser/Zdn;
    //   59: invokespecial <init> : (Lnet/portswigger/browser/Zz8;Lnet/portswigger/browser/Zev;Lnet/portswigger/browser/Ztw;Lnet/portswigger/browser/Zd2;Lnet/portswigger/browser/Zec;Lnet/portswigger/browser/Zdn;)V
    //   62: astore_2
    //   63: aload_0
    //   64: getfield Zf : Ljava/util/Map;
    //   67: dup
    //   68: astore_3
    //   69: monitorenter
    //   70: aload_0
    //   71: aload_2
    //   72: <illegal opcode> run : (Lnet/portswigger/devtools/client/impl/Zxn;Lnet/portswigger/browser/Zjt;)Ljava/lang/Runnable;
    //   77: astore #4
    //   79: aload #4
    //   81: aload_0
    //   82: getfield ZP : Ljava/util/concurrent/ExecutorService;
    //   85: invokestatic runAsync : (Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;
    //   88: astore #5
    //   90: aload_0
    //   91: getfield ZY : Lburp/Ztos;
    //   94: aload_2
    //   95: aload #5
    //   97: invokestatic ZQ : (Lnet/portswigger/browser/Zjt;Ljava/util/concurrent/CompletableFuture;)Lburp/Zxr8;
    //   100: invokevirtual ZD : (Lburp/Zxr8;)V
    //   103: aload_0
    //   104: getfield Zf : Ljava/util/Map;
    //   107: aload_2
    //   108: invokevirtual ZU : ()Lnet/portswigger/browser/Zz8;
    //   111: new net/portswigger/devtools/client/impl/Zxp
    //   114: dup
    //   115: aload_0
    //   116: aload_2
    //   117: aload #5
    //   119: invokespecial <init> : (Lnet/portswigger/devtools/client/impl/Zxn;Lnet/portswigger/browser/Zjt;Ljava/util/concurrent/Future;)V
    //   122: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   127: pop
    //   128: getstatic net/portswigger/browser/Zds.DEBUG : Lnet/portswigger/browser/Zds;
    //   131: sipush #-5295
    //   134: sipush #2091
    //   137: invokestatic a : (II)Ljava/lang/String;
    //   140: iconst_1
    //   141: anewarray java/lang/Object
    //   144: dup
    //   145: iconst_0
    //   146: aload_1
    //   147: getfield requestId : Ljava/lang/String;
    //   150: aastore
    //   151: invokestatic Zp : (Lnet/portswigger/browser/Zds;Ljava/lang/String;[Ljava/lang/Object;)V
    //   154: aload_3
    //   155: monitorexit
    //   156: goto -> 166
    //   159: astore #6
    //   161: aload_3
    //   162: monitorexit
    //   163: aload #6
    //   165: athrow
    //   166: return
    // Exception table:
    //   from	to	target	type
    //   70	156	159	finally
    //   159	163	159	finally
  }
  
  private void lambda$initialise$12(Zjt paramZjt) {
    Zb(this.Zl, paramZjt);
  }
  
  private Zs lambda$initialise$11(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getNetwork().onLoadingFailed(this::lambda$initialise$10);
  }
  
  private void lambda$initialise$10(LoadingFailed paramLoadingFailed) {
    this.Zf.values().removeIf(paramLoadingFailed::lambda$initialise$9);
    this.ZY.ZD(new Zxr8(Zcq.ZO, Zx1.Zn(paramLoadingFailed)));
  }
  
  private static boolean lambda$initialise$9(LoadingFailed paramLoadingFailed, Zxp paramZxp) {
    return paramZxp.ZN(paramLoadingFailed);
  }
  
  private Zs lambda$initialise$8(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getNetwork().onRequestWillBeSent(this::lambda$initialise$7);
  }
  
  private void lambda$initialise$7(RequestWillBeSent paramRequestWillBeSent) {
    ((Zoh)this.Zp.computeIfAbsent(new Zd2(paramRequestWillBeSent.requestId), Zxn::lambda$initialise$6)).Ze(Zmr.Zb().ZY(paramRequestWillBeSent.initiator));
  }
  
  private static Zoh lambda$initialise$6(Zd2 paramZd2) {
    return new Zoh();
  }
  
  private Zs lambda$initialise$5(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getPage().onFrameScheduledNavigation(this::lambda$initialise$4);
  }
  
  private void lambda$initialise$4(FrameScheduledNavigation paramFrameScheduledNavigation) {
    try {
      if (paramFrameScheduledNavigation.delay.doubleValue() > 0.0D)
        this.ZL.add(paramFrameScheduledNavigation.url); 
    } catch (CompletionException completionException) {
      throw a(null);
    } 
  }
  
  private Zs lambda$initialise$3(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getPage().onFrameDetached(this::lambda$initialise$2);
  }
  
  private void lambda$initialise$2(FrameDetached paramFrameDetached) {
    this.ZU.remove(new Ztw(paramFrameDetached.frameId));
  }
  
  private Zs lambda$initialise$1(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getPage().onFrameAttached(this::lambda$initialise$0);
  }
  
  private void lambda$initialise$0(FrameAttached paramFrameAttached) {
    this.ZU.put(new Ztw(paramFrameAttached.frameId), Integer.valueOf(((Integer)this.ZU.getOrDefault(new Ztw(paramFrameAttached.parentFrameId), Integer.valueOf(-1))).intValue() + 1));
  }
  
  public static void ZN(boolean paramBoolean) {
    Zi = paramBoolean;
  }
  
  public static boolean Zl() {
    return Zi;
  }
  
  public static boolean Zz() {
    boolean bool = Zl();
    try {
      if (!bool)
        return true; 
    } catch (CompletionException completionException) {
      throw a(null);
    } 
    return false;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_1
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '4V¨ºÙ$äæ5Wp8@XóEmbgãbíIàÌDºÅ:vïP<G¨Iè¨¿Zúî=vÇ\\fÚùc$¯¼É½!tKÍmñ¬'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #53
    //   20: istore_1
    //   21: invokestatic ZN : (Z)V
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #72
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 145
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc '-|j¾\\rÙ,ÖüËÊ+^;ïìFüAY¹¤øá+ ·ü x`Ç¥\\r~"/!y«¿Ò'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #7
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #81
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 145
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic net/portswigger/devtools/client/impl/Zxn.a : [Ljava/lang/String;
    //   135: iconst_5
    //   136: anewarray java/lang/String
    //   139: putstatic net/portswigger/devtools/client/impl/Zxn.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #6
    //   218: goto -> 248
    //   221: bipush #35
    //   223: goto -> 248
    //   226: bipush #10
    //   228: goto -> 248
    //   231: bipush #56
    //   233: goto -> 248
    //   236: bipush #17
    //   238: goto -> 248
    //   241: bipush #93
    //   243: goto -> 248
    //   246: bipush #25
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEB51) & 0xFFFF;
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
      char c = '°';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */