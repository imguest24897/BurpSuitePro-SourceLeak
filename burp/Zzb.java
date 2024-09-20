package burp;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.browser.Zc1;
import net.portswigger.browser.Zc5;
import net.portswigger.browser.Zcb;
import net.portswigger.browser.Zcv;
import net.portswigger.browser.Zd6;
import net.portswigger.browser.Zdu;
import net.portswigger.browser.Ze6;
import net.portswigger.browser.Ze7;
import net.portswigger.browser.Zee;
import net.portswigger.browser.Zev;
import net.portswigger.browser.Zf;
import net.portswigger.browser.Zjc;
import net.portswigger.browser.Zjq;
import net.portswigger.browser.Zjt;
import net.portswigger.browser.Zjw;
import net.portswigger.browser.Zt;
import net.portswigger.browser.Zt8;
import net.portswigger.browser.Ztf;
import net.portswigger.browser.Zth;
import net.portswigger.browser.Ztp;
import net.portswigger.browser.Ztr;
import net.portswigger.browser.Ztt;
import net.portswigger.browser.Ztv;
import net.portswigger.browser.Ztz;
import net.portswigger.browser.Zy;

public class Zzb {
  private final Zkl6 Zp;
  
  private final Zkvp ZS;
  
  private final Zzmb Zj;
  
  private final Zz28 ZD;
  
  private final Zzs1 ZX;
  
  private final Ze6 ZF;
  
  private final Zgb6 ZT;
  
  private final Zg10 ZO;
  
  private final AtomicReference<Zzvc> Zl;
  
  private final AtomicBoolean ZH;
  
  private final Zy Zb;
  
  private final AtomicBoolean ZW;
  
  private final List<Zmk2> Zm;
  
  private final Ztwv Z_;
  
  private final Zghf Zd;
  
  private static Zbqc[] Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzb(Zkl6 paramZkl6, Zsi7 paramZsi7, Zkvp paramZkvp, Zzs1 paramZzs1, Zzmb paramZzmb, Zz28 paramZz28, Zgb6 paramZgb6, Zg10 paramZg10, Zzgs paramZzgs, Zdu paramZdu, Ztwv paramZtwv) throws Ztf {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/util/concurrent/atomic/AtomicReference
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield Zl : Ljava/util/concurrent/atomic/AtomicReference;
    //   15: aload_0
    //   16: new java/util/concurrent/atomic/AtomicBoolean
    //   19: dup
    //   20: iconst_1
    //   21: invokespecial <init> : (Z)V
    //   24: putfield ZH : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   27: aload_0
    //   28: new java/util/concurrent/atomic/AtomicBoolean
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: putfield ZW : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   38: invokestatic ZZ : ()[Lburp/Zbqc;
    //   41: aload_0
    //   42: aload_1
    //   43: putfield Zp : Lburp/Zkl6;
    //   46: aload_0
    //   47: aload_3
    //   48: putfield ZS : Lburp/Zkvp;
    //   51: aload_0
    //   52: aload #5
    //   54: putfield Zj : Lburp/Zzmb;
    //   57: aload_0
    //   58: aload #6
    //   60: putfield ZD : Lburp/Zz28;
    //   63: aload_0
    //   64: aload #4
    //   66: putfield ZX : Lburp/Zzs1;
    //   69: aload_0
    //   70: invokestatic Ze : ()Lnet/portswigger/browser/Ze6;
    //   73: aload #5
    //   75: invokeinterface ZC : ()Z
    //   80: invokevirtual Zq : (Z)Lnet/portswigger/browser/Ze6;
    //   83: aload #5
    //   85: invokeinterface Z_ : ()Z
    //   90: invokevirtual ZW : (Z)Lnet/portswigger/browser/Ze6;
    //   93: putfield ZF : Lnet/portswigger/browser/Ze6;
    //   96: aload_0
    //   97: aload #7
    //   99: putfield ZT : Lburp/Zgb6;
    //   102: aload_0
    //   103: aload #8
    //   105: putfield ZO : Lburp/Zg10;
    //   108: astore #12
    //   110: aload_0
    //   111: aload #9
    //   113: invokestatic Zy : (Lburp/Zzgs;)Ljava/util/List;
    //   116: putfield Zm : Ljava/util/List;
    //   119: aload_0
    //   120: new net/portswigger/browser/Zy
    //   123: dup
    //   124: aload #10
    //   126: invokespecial <init> : (Lnet/portswigger/browser/Zdu;)V
    //   129: putfield Zb : Lnet/portswigger/browser/Zy;
    //   132: aload_0
    //   133: aload #11
    //   135: putfield Z_ : Lburp/Ztwv;
    //   138: aload_0
    //   139: new burp/Zghf
    //   142: dup
    //   143: aload_2
    //   144: invokeinterface Zu : ()Lnet/portswigger/browser/Zeu;
    //   149: aload_0
    //   150: <illegal opcode> ZJ : (Lburp/Zzb;)Lnet/portswigger/browser/Zjo;
    //   155: aload #5
    //   157: invokeinterface Zw : ()Ljava/lang/String;
    //   162: invokespecial <init> : (Lnet/portswigger/browser/Zeu;Lnet/portswigger/browser/Zjo;Ljava/lang/String;)V
    //   165: putfield Zd : Lburp/Zghf;
    //   168: aload #8
    //   170: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   175: aload_0
    //   176: invokevirtual Zo : ()Lburp/Zx7;
    //   179: invokeinterface Zh : (Ljava/util/function/Predicate;Lburp/Zx7;)V
    //   184: aload_3
    //   185: aload #7
    //   187: <illegal opcode> ZR : (Lburp/Zkvp;Lburp/Zgb6;)Lburp/Zsbf;
    //   192: astore #13
    //   194: aload #8
    //   196: new burp/Zxwx
    //   199: dup
    //   200: aload_1
    //   201: aload #13
    //   203: invokespecial <init> : (Lburp/Zkl6;Lburp/Zsbf;)V
    //   206: invokeinterface Zp : (Lburp/Zx7;)V
    //   211: aload #12
    //   213: ifnonnull -> 230
    //   216: iconst_4
    //   217: anewarray burp/Zbqc
    //   220: invokestatic Zr : ([Lburp/Zbqc;)V
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   229: athrow
    //   230: return
    // Exception table:
    //   from	to	target	type
    //   194	223	226	net/portswigger/browser/Ztf
  }
  
  private Zx7 Zo() {
    return this::lambda$makeWebSocketSupportingResponseHandler$3;
  }
  
  private Zd6 ZP(Ztv paramZtv, Zjt paramZjt) {
    Zzvc zzvc = this.Zl.get();
    try {
      if (!Thread.currentThread().isInterrupted())
        try {
          if (this.ZH.get())
            try {
              return (Zd6)((zzvc != null) ? zzvc.Zh(paramZtv, paramZjt) : new Zth());
            } catch (CancellationException cancellationException) {
              throw a(null);
            }  
        } catch (CancellationException cancellationException) {
          throw a(null);
        }  
    } catch (CancellationException cancellationException) {
      throw a(null);
    } 
    return (Zd6)new Zth();
  }
  
  boolean Zk() {
    return this.ZH.get();
  }
  
  Zkof Zu(Zlvj paramZlvj, Zrp0 paramZrp0, Zlru paramZlru, Zz3v paramZz3v) throws Zmnt, Zmny, Zmn5 {
    Zuh.Zb(this.ZH.get(), Zqf.Zr);
    Zlfh.ZB(Zrp6.DEBUG, a(-1009, 23768), new Object[] { paramZlvj.ZO() });
    try {
      this.Zd.Zc(false);
      Zjw zjw = this.Zd.Zw();
      Ze7 ze7 = paramZlvj.ZA(paramZlru.ZVS(), this.Zj);
      Zzl1 zzl1 = ZX(paramZlvj, paramZrp0, ze7, paramZz3v, zjw);
      return new Zkof(zzl1, zjw);
    } catch (Ztp|net.portswigger.browser.Ztg ztp) {
      Zah.Zl((Throwable)ztp, Zk_.RETHROWN);
      throw new Zm_8(ztp);
    } 
  }
  
  Zzl1 ZK(Zjw paramZjw, Ztiv paramZtiv, Zrp0 paramZrp0, Zlru paramZlru, Zz3v paramZz3v) throws Zmnt, Zmny, Zmn5 {
    Zuh.Zb(this.ZH.get(), Zqf.Zr);
    Zlfh.ZB(Zrp6.DEBUG, a(-1016, 14771), new Object[] { paramZtiv.ZO() });
    Ze7 ze7 = paramZtiv.Zc(paramZlru.ZVS(), this.Zj);
    return ZX(paramZtiv, paramZrp0, ze7, paramZz3v, paramZjw);
  }
  
  private Zzl1 ZX(Zg8y paramZg8y, Zrp0 paramZrp0, Ze7 paramZe7, Zz3v paramZz3v, Zjw paramZjw) throws Zmnt, Zmny, Zmn5 {
    // Byte code:
    //   0: new java/util/concurrent/FutureTask
    //   3: dup
    //   4: aload_0
    //   5: aload_3
    //   6: aload #5
    //   8: <illegal opcode> call : (Lburp/Zzb;Lnet/portswigger/browser/Ze7;Lnet/portswigger/browser/Zjw;)Ljava/util/concurrent/Callable;
    //   13: invokespecial <init> : (Ljava/util/concurrent/Callable;)V
    //   16: astore #6
    //   18: aload_0
    //   19: aload #5
    //   21: invokeinterface ZG : ()Lnet/portswigger/browser/Zev;
    //   26: aload_2
    //   27: aload #4
    //   29: aload #6
    //   31: <illegal opcode> run : (Ljava/util/concurrent/FutureTask;)Ljava/lang/Runnable;
    //   36: invokevirtual Zq : (Lnet/portswigger/browser/Zev;Lburp/Zrp0;Lburp/Zz3v;Ljava/lang/Runnable;)V
    //   39: aload_0
    //   40: getfield Z_ : Lburp/Ztwv;
    //   43: aload #6
    //   45: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   50: pop
    //   51: aload_0
    //   52: aload_1
    //   53: invokeinterface ZM : ()Lburp/Zz3o;
    //   58: aload #5
    //   60: aload #6
    //   62: invokevirtual get : ()Ljava/lang/Object;
    //   65: checkcast net/portswigger/browser/Zjq
    //   68: aload #4
    //   70: invokevirtual Zb : ()Z
    //   73: invokevirtual ZP : (Lburp/Zz3o;Lnet/portswigger/browser/Zjw;Lnet/portswigger/browser/Zjq;Z)Lburp/Zzl1;
    //   76: astore #7
    //   78: aload_0
    //   79: invokevirtual Zs : ()V
    //   82: aload #7
    //   84: areturn
    //   85: astore #7
    //   87: aload #7
    //   89: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   92: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   95: aload #5
    //   97: invokeinterface ZS : ()Lnet/portswigger/browser/Zed;
    //   102: invokeinterface ZZ : ()V
    //   107: aload_0
    //   108: aload_1
    //   109: invokeinterface ZM : ()Lburp/Zz3o;
    //   114: aload #5
    //   116: aconst_null
    //   117: iconst_0
    //   118: invokevirtual ZP : (Lburp/Zz3o;Lnet/portswigger/browser/Zjw;Lnet/portswigger/browser/Zjq;Z)Lburp/Zzl1;
    //   121: astore #8
    //   123: aload_0
    //   124: invokevirtual Zs : ()V
    //   127: aload #8
    //   129: areturn
    //   130: astore #7
    //   132: aload #7
    //   134: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   137: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   140: new burp/Zktz
    //   143: dup
    //   144: invokespecial <init> : ()V
    //   147: athrow
    //   148: astore #7
    //   150: aload #7
    //   152: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   155: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   158: invokestatic currentThread : ()Ljava/lang/Thread;
    //   161: invokevirtual interrupt : ()V
    //   164: new burp/Zm_f
    //   167: dup
    //   168: sipush #-1015
    //   171: sipush #31584
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: aload #7
    //   179: invokespecial <init> : (Ljava/lang/String;Ljava/lang/InterruptedException;)V
    //   182: athrow
    //   183: astore #7
    //   185: aload #7
    //   187: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   190: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   193: aload #7
    //   195: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   198: astore #9
    //   200: aload #9
    //   202: instanceof net/portswigger/browser/Ztt
    //   205: ifeq -> 225
    //   208: aload #9
    //   210: checkcast net/portswigger/browser/Ztt
    //   213: astore #8
    //   215: new burp/Zm_8
    //   218: dup
    //   219: aload #8
    //   221: invokespecial <init> : (Lnet/portswigger/browser/Ztt;)V
    //   224: athrow
    //   225: aload #7
    //   227: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   230: astore #9
    //   232: aload #9
    //   234: instanceof net/portswigger/browser/Ztk
    //   237: ifeq -> 266
    //   240: aload #9
    //   242: checkcast net/portswigger/browser/Ztk
    //   245: astore #8
    //   247: new burp/Zm_o
    //   250: dup
    //   251: sipush #-1010
    //   254: sipush #-31192
    //   257: invokestatic a : (II)Ljava/lang/String;
    //   260: aload #8
    //   262: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   265: athrow
    //   266: iconst_0
    //   267: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   270: aload #7
    //   272: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   275: invokevirtual getMessage : ()Ljava/lang/String;
    //   278: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   281: new burp/Zm_o
    //   284: dup
    //   285: aload #7
    //   287: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   290: invokevirtual getMessage : ()Ljava/lang/String;
    //   293: invokespecial <init> : (Ljava/lang/String;)V
    //   296: athrow
    //   297: astore #10
    //   299: aload_0
    //   300: invokevirtual Zs : ()V
    //   303: aload #10
    //   305: athrow
    // Exception table:
    //   from	to	target	type
    //   39	78	85	java/util/concurrent/CancellationException
    //   39	78	130	java/util/concurrent/RejectedExecutionException
    //   39	78	148	java/lang/InterruptedException
    //   39	78	183	java/util/concurrent/ExecutionException
    //   39	78	297	finally
    //   85	123	297	finally
    //   130	299	297	finally
  }
  
  Zkof ZM(Zm72 paramZm72, Zz3v paramZz3v) throws Zmnt, Zmny, Zmn5 {
    Zbqc[] arrayOfZbqc = ZZ();
    try {
      this.ZW.set(true);
      this.Zd.Zc(true);
      Zjw zjw1 = this.Zd.Zw();
      Zq(zjw1.ZG(), paramZm72, paramZz3v, Zzb::lambda$replaySequence$6);
      Zko4 zko4 = paramZm72.Zej();
      Zc5 zc5 = Zc5.Zr(zko4.ZRc());
      Zc1 zc1 = this.Zd.Zx();
      this.Zb.Zf(zc1, zc5);
      Zjw zjw2 = (Zjw)zc1.Zj().Zc().orElseThrow(Zzb::lambda$replaySequence$7);
      Zjq zjq = Ze7.Zb().Zl((Zt)Ztr.ZK(this.Zj.Zr())).ZY((Zt)Zee.ZO(this.Zj.ZH())).Zn(zjw2);
      Zm2.Zo(Zze0.SCANNER_RECORDED_LOGIN_SUCCEEDED);
      Zzl1 zzl1 = ZP(Zz3o.RECORDED_SEQUENCE, zjw2, zjq, paramZz3v.Zb());
      return zkof;
    } catch (Zcb zcb) {
      Zah.Zl((Throwable)zcb, Zk_.RETHROWN);
      Zm2.Zo(Zze0.SCANNER_RECORDED_LOGIN_FAILED);
      throw new Zm_6(a(-1013, -28757), zcb);
    } catch (Ztt ztt) {
      Zah.Zl((Throwable)ztt, Zk_.RETHROWN);
      throw new Zm_8(ztt);
    } catch (Ztz ztz) {
      Zah.Zl((Throwable)ztz, Zk_.RETHROWN);
      throw new Zm_o(a(-1011, -20778), ztz);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.RETHROWN);
      Thread.currentThread().interrupt();
      throw new Zm_f(a(-1012, 24357), interruptedException);
    } finally {
      Zs();
      this.ZW.set(false);
    } 
  }
  
  private void Zq(Zev paramZev, Zrp0 paramZrp0, Zz3v paramZz3v, Runnable paramRunnable) {
    Zzvc zzvc = new Zzvc(this, paramZev, paramZrp0, paramZz3v, paramRunnable);
    this.Zl.set(zzvc);
  }
  
  private void Zs() {
    this.Zl.set(null);
  }
  
  private Zzl1 ZP(Zz3o paramZz3o, Zjw paramZjw, Zjq paramZjq, boolean paramBoolean) throws Zmnt, Zmny, Zmn5 {
    // Byte code:
    //   0: invokestatic ZZ : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield Zl : Ljava/util/concurrent/atomic/AtomicReference;
    //   9: invokevirtual get : ()Ljava/lang/Object;
    //   12: ifnull -> 35
    //   15: aload_0
    //   16: getfield Zl : Ljava/util/concurrent/atomic/AtomicReference;
    //   19: invokevirtual get : ()Ljava/lang/Object;
    //   22: checkcast burp/Zzvc
    //   25: invokevirtual Zp : ()Lburp/Zsib;
    //   28: goto -> 48
    //   31: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: new burp/Zsib
    //   38: dup
    //   39: aload_2
    //   40: invokeinterface ZG : ()Lnet/portswigger/browser/Zev;
    //   45: invokespecial <init> : (Lnet/portswigger/browser/Zev;)V
    //   48: astore #6
    //   50: aload #6
    //   52: invokevirtual ZF : ()Ljava/util/List;
    //   55: astore #7
    //   57: invokestatic empty : ()Ljava/util/Optional;
    //   60: astore #8
    //   62: invokestatic empty : ()Ljava/util/Optional;
    //   65: astore #9
    //   67: aload #7
    //   69: invokeinterface isEmpty : ()Z
    //   74: ifne -> 107
    //   77: aload #7
    //   79: invokeinterface getFirst : ()Ljava/lang/Object;
    //   84: checkcast burp/Zgb7
    //   87: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   90: astore #8
    //   92: aload #7
    //   94: invokeinterface getLast : ()Ljava/lang/Object;
    //   99: checkcast burp/Zgb7
    //   102: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   105: astore #9
    //   107: aload #9
    //   109: invokevirtual isPresent : ()Z
    //   112: ifeq -> 184
    //   115: iload #4
    //   117: ifeq -> 146
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: aload_0
    //   128: aload_2
    //   129: invokevirtual Z_ : (Lnet/portswigger/browser/Zjw;)Ljava/util/Optional;
    //   132: aconst_null
    //   133: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   136: checkcast net/portswigger/browser/Zcv
    //   139: goto -> 147
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: aconst_null
    //   147: astore #11
    //   149: aload #9
    //   151: invokevirtual get : ()Ljava/lang/Object;
    //   154: checkcast burp/Zgb7
    //   157: aload_2
    //   158: aload_0
    //   159: getfield Zp : Lburp/Zkl6;
    //   162: invokeinterface ZB : ()Lburp/Zbnt;
    //   167: aload_3
    //   168: aload_0
    //   169: getfield ZF : Lnet/portswigger/browser/Ze6;
    //   172: aload #11
    //   174: invokevirtual ZW : (Lnet/portswigger/browser/Zjw;Lburp/Zbnt;Lnet/portswigger/browser/Zjq;Lnet/portswigger/browser/Ze6;Lnet/portswigger/browser/Zcv;)Lburp/Zlve;
    //   177: astore #10
    //   179: aload #5
    //   181: ifnonnull -> 229
    //   184: new burp/Zzpi
    //   187: dup
    //   188: invokespecial <init> : ()V
    //   191: aconst_null
    //   192: aload_2
    //   193: invokeinterface Zx : ()Lnet/portswigger/browser/Zd0;
    //   198: aload_0
    //   199: getfield ZF : Lnet/portswigger/browser/Ze6;
    //   202: invokeinterface Zi : (Lnet/portswigger/browser/Ze6;)Lnet/portswigger/browser/Zdb;
    //   207: aconst_null
    //   208: aload_3
    //   209: aload_0
    //   210: getfield Zp : Lburp/Zkl6;
    //   213: invokeinterface ZB : ()Lburp/Zbnt;
    //   218: invokestatic Zk : (Lburp/Zski;Lnet/portswigger/browser/Zdb;Lnet/portswigger/browser/Zcv;Lnet/portswigger/browser/Zjq;Lburp/Zbnt;)Lburp/Zmfc;
    //   221: invokevirtual ZE : (Lburp/Zmfc;)Lburp/Zzpi;
    //   224: invokevirtual Zu : ()Lburp/Zlve;
    //   227: astore #10
    //   229: goto -> 281
    //   232: astore #11
    //   234: aload #11
    //   236: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   239: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   242: new burp/Zm_8
    //   245: dup
    //   246: aload #11
    //   248: invokespecial <init> : (Lnet/portswigger/browser/Ztt;)V
    //   251: athrow
    //   252: astore #11
    //   254: aload #11
    //   256: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   259: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   262: new burp/Zm_o
    //   265: dup
    //   266: sipush #-1014
    //   269: sipush #-1834
    //   272: invokestatic a : (II)Ljava/lang/String;
    //   275: aload #11
    //   277: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   280: athrow
    //   281: aload #6
    //   283: invokevirtual ZF : ()Ljava/util/List;
    //   286: invokestatic ZT : (Ljava/util/List;)Lburp/Zsxd;
    //   289: aload #6
    //   291: invokevirtual Za : ()Ljava/util/List;
    //   294: invokestatic ZT : (Ljava/util/List;)Lburp/Zsxd;
    //   297: invokestatic ZB : (Lburp/Zsxd;Lburp/Zsxd;)Lburp/Zkan;
    //   300: astore #11
    //   302: aload_1
    //   303: getstatic burp/Zz3o.RECORDED_SEQUENCE : Lburp/Zz3o;
    //   306: invokevirtual equals : (Ljava/lang/Object;)Z
    //   309: ifeq -> 342
    //   312: aload #11
    //   314: invokevirtual Zj : ()Lburp/Zsxd;
    //   317: invokeinterface ZG : ()Lburp/Zg3d;
    //   322: invokeinterface ZL : ()Lburp/Zefx;
    //   327: invokeinterface ZF : ()Lburp/Zlit;
    //   332: invokestatic Zf : (Lburp/Zlit;)Lburp/Zski;
    //   335: astore #12
    //   337: aload #5
    //   339: ifnonnull -> 367
    //   342: aload #8
    //   344: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   349: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   352: aload #10
    //   354: <illegal opcode> get : (Lburp/Zlve;)Ljava/util/function/Supplier;
    //   359: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   362: checkcast burp/Zski
    //   365: astore #12
    //   367: new burp/Zzl1
    //   370: dup
    //   371: aload_1
    //   372: aload #12
    //   374: aload #10
    //   376: aload #11
    //   378: invokespecial <init> : (Lburp/Zz3o;Lburp/Zski;Lburp/Zlve;Lburp/Zkan;)V
    //   381: areturn
    // Exception table:
    //   from	to	target	type
    //   5	31	31	net/portswigger/browser/Ztt
    //   107	120	123	net/portswigger/browser/Ztt
    //   107	229	232	net/portswigger/browser/Ztt
    //   107	229	252	net/portswigger/browser/Ztk
    //   115	142	142	net/portswigger/browser/Ztt
  }
  
  private Optional<Zcv> Z_(Zjw paramZjw) {
    try {
      return paramZjw.Zx().Zh();
    } catch (IOException|net.portswigger.browser.Ztk iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
      return Optional.empty();
    } 
  }
  
  private static Zsxd ZT(List<Zgb7<Exception>> paramList) {
    List<Zg3d> list = (List)paramList.stream().map(Zgb7::Zk).flatMap(Optional::stream).map(Zsxd::ZG).collect(Collectors.toList());
    try {
    
    } catch (CancellationException cancellationException) {
      throw a(null);
    } 
    return list.isEmpty() ? Zr4y.ZO() : new Zrbo(list);
  }
  
  public void ZA() {
    this.Zd.Ze();
  }
  
  public void Zv(Zjw paramZjw) {
    this.Zd.ZF(paramZjw);
  }
  
  public void Zj() {
    try {
      this.ZO.Zp(null);
      this.ZO.ZP(Ztae::Zw);
      if (!this.ZH.getAndSet(false))
        return; 
    } catch (CancellationException cancellationException) {
      throw a(null);
    } 
    ZA();
  }
  
  private static Zski lambda$snapshotDom$9(Zlve paramZlve) {
    return paramZlve.ZJ().Zb();
  }
  
  private static Zski lambda$snapshotDom$8(Zgb7 paramZgb7) {
    return paramZgb7.Zb().Zd();
  }
  
  private static Zm_o lambda$replaySequence$7() {
    return new Zm_o(a(-1011, -20778));
  }
  
  private static void lambda$replaySequence$6() {}
  
  private static void lambda$pageStep$5(FutureTask paramFutureTask) {
    paramFutureTask.cancel(true);
  }
  
  private Zjq lambda$pageStep$4(Ze7 paramZe7, Zjw paramZjw) throws Exception {
    Zjq zjq = paramZe7.Zl((Zt)Ztr.ZK(this.Zj.Zr())).Zl((Zt)Zee.ZO(this.Zj.ZH())).Zn(paramZjw);
    Zt8 zt8 = this.Zd.Zx().Zj();
    Objects.requireNonNull(Zjw.class);
    Objects.requireNonNull(zt8);
    zt8.ZJ(Zf.ZF().and(Predicate.not(Zf.Zk((Zjc)paramZjw)))).map(Zjw.class::cast).forEach(zt8::ZE);
    return zjq;
  }
  
  private void lambda$makeWebSocketSupportingResponseHandler$3(Zz2j paramZz2j, Zml3 paramZml3) throws Zz8h, IOException, Zs2o {
    (new Zsgk(this.ZS, Zzb::lambda$makeWebSocketSupportingResponseHandler$2, paramZz2j, paramZml3, this.Zp, new Zs5a(this.Z_), this.Zj, this.ZT)).Zb();
  }
  
  private static void lambda$makeWebSocketSupportingResponseHandler$2(String paramString) {}
  
  private static Zsxd lambda$new$1(Zkvp paramZkvp, Zgb6 paramZgb6, Zefx paramZefx) throws Exception {
    return paramZkvp.Zl(Zzb::lambda$new$0, paramZefx, Duration.ofMillis(paramZgb6.ZfT()), Duration.ofMillis(paramZgb6.ZEj()), Ze45.ATTEMPT_HTTP2, false, Zxfj.ZI);
  }
  
  private static boolean lambda$new$0(Zrdu paramZrdu, String paramString) {
    return false;
  }
  
  public static void ZF(Zbqc[] paramArrayOfZbqc) {
    Zi = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZZ() {
    return Zi;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_2
    //   8: anewarray burp/Zbqc
    //   11: iconst_0
    //   12: istore_3
    //   13: ldc '\\tûãàoW=c66êüëoÄÿÛ.àïKv/åÙ2ï¾&'å×(2¦ö¥Ú366å_µ\\nk+¬õ;]ö8"©ÅúS|ÑÔîÂÔ§Y6Oýáò"*Ýê\\b iVEô'CJÌ%´0:@Ø¸M}¥4~@ÎÆ¢ºàÐüñ®ãÌ};ò#ØÎðÙskMô p¨ÅÄ!Kv!\ºx,æ¼'kÛG¨¿=%èV)üÊ«,uØ \\r2v¯sËJ»¾\\f/¿§j'¯E#L²'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #39
    //   24: istore_1
    //   25: invokestatic ZF : ([Lburp/Zbqc;)V
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #49
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
    //   75: ldc 'm#>Ç©ÔAu ¶Óëµû|'z\\f¾N\\b*Ã2FVL·À':'C¼\\t'19µØ¼ox[¡'ÄmW+ =ãIØ<sÙN¸*(á´×QÕïØ'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #43
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #9
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
    //   136: putstatic burp/Zzb.a : [Ljava/lang/String;
    //   139: bipush #8
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Zzb.b : [Ljava/lang/String;
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
    //   181: tableswitch default -> 249, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 244
    //   220: bipush #122
    //   222: goto -> 251
    //   225: bipush #119
    //   227: goto -> 251
    //   230: bipush #19
    //   232: goto -> 251
    //   235: bipush #68
    //   237: goto -> 251
    //   240: iconst_5
    //   241: goto -> 251
    //   244: bipush #9
    //   246: goto -> 251
    //   249: bipush #21
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
    int i = (paramInt1 ^ 0xFFFFFC0D) & 0xFFFF;
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
      byte b1 = 111;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */