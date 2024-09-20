package net.portswigger.devtools.client.impl;

import burp.Ztos;
import burp.Zxr8;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zb;
import net.portswigger.browser.Zc3;
import net.portswigger.browser.Zck;
import net.portswigger.browser.Zcx;
import net.portswigger.browser.Zd;
import net.portswigger.browser.Zds;
import net.portswigger.browser.Zdz;
import net.portswigger.browser.Ze;
import net.portswigger.browser.Ze3;
import net.portswigger.browser.Zev;
import net.portswigger.browser.Zf;
import net.portswigger.browser.Zjc;
import net.portswigger.browser.Zjo;
import net.portswigger.browser.Zjw;
import net.portswigger.browser.Zt8;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztx;
import net.portswigger.browser.Zzf;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.events.target.DetachedFromTarget;
import net.portswigger.devtools.protocol.events.target.TargetCrashed;
import net.portswigger.devtools.protocol.types.target.TargetInfo;

public class Zxy implements Zt8 {
  private static final Duration Z_;
  
  private final Zc3 ZP;
  
  private final Zn Zu;
  
  private final Zdz ZJ;
  
  private final Zjo ZR;
  
  private final Ztos<Zck> Zn;
  
  private final ExecutorService ZO;
  
  private final BlockingDeque<Zf> ZG;
  
  private static String ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zxy(Zc3 paramZc3, Ztos<Zck> paramZtos, Zjo paramZjo, Zn paramZn, Zdz paramZdz, ExecutorService paramExecutorService) {
    this.ZP = Objects.<Zc3>requireNonNull(paramZc3);
    this.Zn = Objects.<Ztos<Zck>>requireNonNull(paramZtos);
    this.Zu = Objects.<Zn>requireNonNull(paramZn);
    this.ZR = paramZjo;
    this.ZJ = paramZdz;
    this.ZO = Objects.<ExecutorService>requireNonNull(paramExecutorService);
    this.ZG = new LinkedBlockingDeque<>();
  }
  
  public Zjw ZV() throws Ztk {
    return Zn(Zzf.Zg(), new Ze[0]);
  }
  
  public Zjw Zn(String paramString, Ze... paramVarArgs) throws Ztk {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   4: astore #4
    //   6: getstatic net/portswigger/browser/Zds.DEBUG : Lnet/portswigger/browser/Zds;
    //   9: sipush #-24576
    //   12: sipush #19746
    //   15: invokestatic a : (II)Ljava/lang/String;
    //   18: iconst_3
    //   19: anewarray java/lang/Object
    //   22: dup
    //   23: iconst_0
    //   24: aload_1
    //   25: aastore
    //   26: dup
    //   27: iconst_1
    //   28: aload #4
    //   30: aastore
    //   31: dup
    //   32: iconst_2
    //   33: aload_0
    //   34: getfield ZJ : Lnet/portswigger/browser/Zdz;
    //   37: aastore
    //   38: invokestatic Zp : (Lnet/portswigger/browser/Zds;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: invokestatic Zx : ()Ljava/lang/String;
    //   44: new net/portswigger/devtools/client/impl/Zy
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: astore #5
    //   53: astore_3
    //   54: aload_0
    //   55: getfield Zn : Lburp/Ztos;
    //   58: getstatic net/portswigger/browser/Zck.ZD : Lburp/Zlnb;
    //   61: aload #5
    //   63: <illegal opcode> accept : (Lnet/portswigger/devtools/client/impl/Zy;)Ljava/util/function/Consumer;
    //   68: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   71: astore #6
    //   73: aload_0
    //   74: aload_1
    //   75: aload #4
    //   77: <illegal opcode> Zy : (Lnet/portswigger/devtools/client/impl/Zxy;Ljava/lang/String;Ljava/util/List;)Lnet/portswigger/devtools/client/Zs;
    //   82: astore #8
    //   84: aload #8
    //   86: invokestatic ZW : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zx;
    //   89: getstatic net/portswigger/devtools/client/impl/Zxy.Z_ : Ljava/time/Duration;
    //   92: invokevirtual Zc : (Ljava/time/Duration;)Lnet/portswigger/devtools/client/Zx;
    //   95: invokevirtual Zj : ()Lnet/portswigger/devtools/client/Zk;
    //   98: astore #9
    //   100: new net/portswigger/browser/Zev
    //   103: dup
    //   104: aload_0
    //   105: getfield Zu : Lnet/portswigger/devtools/client/Zn;
    //   108: aload #9
    //   110: invokevirtual Zz : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/Object;
    //   113: checkcast java/lang/String
    //   116: invokespecial <init> : (Ljava/lang/String;)V
    //   119: astore #7
    //   121: goto -> 208
    //   124: astore #8
    //   126: aload #8
    //   128: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   131: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   134: new net/portswigger/browser/Zti
    //   137: dup
    //   138: aload #8
    //   140: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   143: athrow
    //   144: astore #8
    //   146: aload #8
    //   148: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   151: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   154: new net/portswigger/browser/Ztq
    //   157: dup
    //   158: sipush #-24560
    //   161: sipush #18858
    //   164: invokestatic a : (II)Ljava/lang/String;
    //   167: aload #8
    //   169: invokespecial <init> : (Ljava/lang/String;Ljava/io/IOException;)V
    //   172: athrow
    //   173: astore #8
    //   175: aload #8
    //   177: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   180: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   183: invokestatic currentThread : ()Ljava/lang/Thread;
    //   186: invokevirtual interrupt : ()V
    //   189: new net/portswigger/browser/Ztg
    //   192: dup
    //   193: sipush #-24569
    //   196: sipush #26974
    //   199: invokestatic a : (II)Ljava/lang/String;
    //   202: aload #8
    //   204: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   207: athrow
    //   208: aload #5
    //   210: aload #7
    //   212: invokevirtual ZM : (Lnet/portswigger/browser/Zev;)Lnet/portswigger/browser/Zez;
    //   215: invokevirtual Zt : ()Lnet/portswigger/browser/Zjw;
    //   218: astore #8
    //   220: aload #6
    //   222: invokeinterface ZZ : ()V
    //   227: aload #8
    //   229: invokestatic Zwu : ()[Lburp/Zbqc;
    //   232: ifnonnull -> 240
    //   235: ldc 'Xnt3Ac'
    //   237: invokestatic Zq : (Ljava/lang/String;)V
    //   240: areturn
    //   241: astore #8
    //   243: aload #8
    //   245: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   248: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   251: aload_0
    //   252: getfield Zu : Lnet/portswigger/devtools/client/Zn;
    //   255: aload #7
    //   257: <illegal opcode> Zy : (Lnet/portswigger/browser/Zev;)Lnet/portswigger/devtools/client/Zs;
    //   262: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   265: invokestatic ZX : ()Lnet/portswigger/devtools/client/Zu;
    //   268: invokevirtual Zg : (Lnet/portswigger/devtools/client/Zk;Lnet/portswigger/devtools/client/Zu;)Ljava/util/concurrent/CompletableFuture;
    //   271: pop
    //   272: new net/portswigger/browser/Ztg
    //   275: dup
    //   276: sipush #-24558
    //   279: sipush #1594
    //   282: invokestatic a : (II)Ljava/lang/String;
    //   285: aload #8
    //   287: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   290: athrow
    //   291: astore #8
    //   293: aload #8
    //   295: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   298: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   301: aload_0
    //   302: getfield Zu : Lnet/portswigger/devtools/client/Zn;
    //   305: aload #7
    //   307: <illegal opcode> Zy : (Lnet/portswigger/browser/Zev;)Lnet/portswigger/devtools/client/Zs;
    //   312: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   315: invokestatic ZX : ()Lnet/portswigger/devtools/client/Zu;
    //   318: invokevirtual Zg : (Lnet/portswigger/devtools/client/Zk;Lnet/portswigger/devtools/client/Zu;)Ljava/util/concurrent/CompletableFuture;
    //   321: pop
    //   322: aload #8
    //   324: athrow
    //   325: astore #8
    //   327: aload #8
    //   329: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   332: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   335: invokestatic currentThread : ()Ljava/lang/Thread;
    //   338: invokevirtual interrupt : ()V
    //   341: aload_0
    //   342: getfield Zu : Lnet/portswigger/devtools/client/Zn;
    //   345: aload #7
    //   347: <illegal opcode> Zy : (Lnet/portswigger/browser/Zev;)Lnet/portswigger/devtools/client/Zs;
    //   352: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   355: invokestatic ZX : ()Lnet/portswigger/devtools/client/Zu;
    //   358: invokevirtual Zg : (Lnet/portswigger/devtools/client/Zk;Lnet/portswigger/devtools/client/Zu;)Ljava/util/concurrent/CompletableFuture;
    //   361: pop
    //   362: new net/portswigger/browser/Ztg
    //   365: dup
    //   366: sipush #-24562
    //   369: sipush #-13212
    //   372: invokestatic a : (II)Ljava/lang/String;
    //   375: aload #8
    //   377: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   380: athrow
    // Exception table:
    //   from	to	target	type
    //   73	121	124	net/portswigger/devtools/client/Zp
    //   73	121	144	net/portswigger/devtools/client/Zi
    //   73	121	173	java/lang/InterruptedException
    //   208	229	241	java/util/concurrent/TimeoutException
    //   208	229	291	net/portswigger/browser/Ztg
    //   208	229	325	java/lang/InterruptedException
  }
  
  public boolean ZE(Zjw paramZjw) {
    Zm1 zm1 = (Zm1)paramZjw;
    try {
      if (!this.ZG.remove(zm1)) {
        Zb.Zp(Zds.WARNING, a(-24559, 3565), new Object[] { paramZjw, this.ZJ });
        return false;
      } 
    } catch (Zp zp) {
      throw a(null);
    } 
    Zb.Zp(Zds.DEBUG, a(-24566, -13479), new Object[] { zm1.ZG(), zm1.Z_() });
    try {
      this.Zu.Zz(Zk.ZA(zm1::lambda$close$5));
      Zu(zm1);
      return true;
    } catch (Zp|net.portswigger.devtools.client.Z_ zp) {
      Zah.Zl((Throwable)zp, Zk_.IGNORED);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.UNEXPECTED);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.RETHROWN);
      Zu(zm1);
      Thread.currentThread().interrupt();
    } 
    return false;
  }
  
  private void Zu(Zm1 paramZm1) {
    paramZm1.Zo(Ze3.DETACHED);
    paramZm1.Zp();
    this.Zn.ZD(Zcx.ZX(paramZm1, paramZm1.ZO()));
  }
  
  public List<Zjc> Zl() {
    return new ArrayList<>((Collection)this.ZG);
  }
  
  public void Zh() {
    Zb.Zp(Zds.DEBUG, a(-24561, 10443), new Object[] { this.ZJ });
    String str = Zx();
    for (Zjc zjc : Zl()) {
      ZE((Zf)zjc, Ze3.DETACHED);
      if (str == null)
        break; 
    } 
    Zb.Zp(Zds.DEBUG, a(-24565, 3900), new Object[0]);
  }
  
  public Zf ZH(TargetInfo paramTargetInfo, Zd paramZd) throws Zi {
    // Byte code:
    //   0: invokestatic Zx : ()Ljava/lang/String;
    //   3: new net/portswigger/browser/Zev
    //   6: dup
    //   7: aload_1
    //   8: getfield targetId : Ljava/lang/String;
    //   11: invokespecial <init> : (Ljava/lang/String;)V
    //   14: astore #4
    //   16: astore_3
    //   17: aload_1
    //   18: getfield type : Ljava/lang/String;
    //   21: sipush #-24570
    //   24: sipush #-13229
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokevirtual equals : (Ljava/lang/Object;)Z
    //   33: ifne -> 79
    //   36: getstatic net/portswigger/devtools/client/impl/Zov.BROWSER_TARGET_TYPE : Lnet/portswigger/devtools/client/impl/Zov;
    //   39: aload_1
    //   40: getfield type : Ljava/lang/String;
    //   43: invokestatic ZB : (Lnet/portswigger/Zrmw;Ljava/lang/String;)V
    //   46: getstatic net/portswigger/browser/Zds.INFO : Lnet/portswigger/browser/Zds;
    //   49: sipush #-24564
    //   52: sipush #-27831
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: iconst_1
    //   59: anewarray java/lang/Object
    //   62: dup
    //   63: iconst_0
    //   64: aload_1
    //   65: getfield type : Ljava/lang/String;
    //   68: aastore
    //   69: invokestatic Zp : (Lnet/portswigger/browser/Zds;Ljava/lang/String;[Ljava/lang/Object;)V
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   78: athrow
    //   79: aload_0
    //   80: getfield ZG : Ljava/util/concurrent/BlockingDeque;
    //   83: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   88: aload #4
    //   90: <illegal opcode> test : (Lnet/portswigger/browser/Zev;)Ljava/util/function/Predicate;
    //   95: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   100: invokeinterface findAny : ()Ljava/util/Optional;
    //   105: astore #5
    //   107: aload #5
    //   109: invokevirtual isPresent : ()Z
    //   112: ifeq -> 241
    //   115: aload #5
    //   117: invokevirtual get : ()Ljava/lang/Object;
    //   120: checkcast net/portswigger/devtools/client/impl/Zm1
    //   123: astore #6
    //   125: aload #6
    //   127: invokevirtual Z_ : ()Lnet/portswigger/browser/Zd;
    //   130: aload_2
    //   131: invokevirtual equals : (Ljava/lang/Object;)Z
    //   134: ifeq -> 158
    //   137: new java/lang/AssertionError
    //   140: dup
    //   141: sipush #-24575
    //   144: sipush #-8971
    //   147: invokestatic a : (II)Ljava/lang/String;
    //   150: invokespecial <init> : (Ljava/lang/Object;)V
    //   153: athrow
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: aload_0
    //   159: getfield ZG : Ljava/util/concurrent/BlockingDeque;
    //   162: aload #6
    //   164: invokeinterface remove : (Ljava/lang/Object;)Z
    //   169: ifne -> 204
    //   172: new java/util/ConcurrentModificationException
    //   175: dup
    //   176: aload #4
    //   178: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   181: sipush #-24568
    //   184: sipush #-2075
    //   187: invokestatic a : (II)Ljava/lang/String;
    //   190: swap
    //   191: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   196: invokespecial <init> : (Ljava/lang/String;)V
    //   199: athrow
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: getstatic net/portswigger/browser/Zds.WARNING : Lnet/portswigger/browser/Zds;
    //   207: sipush #-24574
    //   210: sipush #22550
    //   213: invokestatic a : (II)Ljava/lang/String;
    //   216: iconst_2
    //   217: anewarray java/lang/Object
    //   220: dup
    //   221: iconst_0
    //   222: aload #4
    //   224: aastore
    //   225: dup
    //   226: iconst_1
    //   227: aload #6
    //   229: invokevirtual Z_ : ()Lnet/portswigger/browser/Zd;
    //   232: aastore
    //   233: invokestatic Zp : (Lnet/portswigger/browser/Zds;Ljava/lang/String;[Ljava/lang/Object;)V
    //   236: aload #6
    //   238: invokevirtual Zp : ()V
    //   241: invokestatic Zy : ()Lnet/portswigger/devtools/client/Zm;
    //   244: aload_2
    //   245: invokevirtual Zj : (Lnet/portswigger/browser/Zd;)Lnet/portswigger/devtools/client/Zm;
    //   248: aload_0
    //   249: getfield Zu : Lnet/portswigger/devtools/client/Zn;
    //   252: invokevirtual Zd : ()Lnet/portswigger/devtools/client/impl/connection/Zl;
    //   255: invokevirtual ZZ : (Lnet/portswigger/devtools/client/impl/connection/Zl;)Lnet/portswigger/devtools/client/Zm;
    //   258: invokevirtual Zb : ()Lnet/portswigger/devtools/client/Zn;
    //   261: astore #6
    //   263: aload_1
    //   264: getfield type : Ljava/lang/String;
    //   267: astore #8
    //   269: iconst_m1
    //   270: istore #9
    //   272: aload #8
    //   274: invokevirtual hashCode : ()I
    //   277: lookupswitch default -> 362, -1776778168 -> 335, 3433103 -> 304
    //   304: aload #8
    //   306: sipush #-24571
    //   309: sipush #28997
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: invokevirtual equals : (Ljava/lang/Object;)Z
    //   318: ifeq -> 362
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   327: athrow
    //   328: iconst_0
    //   329: istore #9
    //   331: aload_3
    //   332: ifnonnull -> 362
    //   335: aload #8
    //   337: sipush #-24563
    //   340: sipush #-14859
    //   343: invokestatic a : (II)Ljava/lang/String;
    //   346: invokevirtual equals : (Ljava/lang/Object;)Z
    //   349: ifeq -> 362
    //   352: goto -> 359
    //   355: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   358: athrow
    //   359: iconst_1
    //   360: istore #9
    //   362: iload #9
    //   364: lookupswitch default -> 438, 0 -> 392, 1 -> 423
    //   392: new net/portswigger/devtools/client/impl/Zm1
    //   395: dup
    //   396: aload_0
    //   397: getfield ZP : Lnet/portswigger/browser/Zc3;
    //   400: aload_0
    //   401: getfield ZR : Lnet/portswigger/browser/Zjo;
    //   404: aload #4
    //   406: aload_2
    //   407: aload #6
    //   409: aload_0
    //   410: getfield ZO : Ljava/util/concurrent/ExecutorService;
    //   413: invokespecial <init> : (Lnet/portswigger/browser/Zc3;Lnet/portswigger/browser/Zjo;Lnet/portswigger/browser/Zev;Lnet/portswigger/browser/Zd;Lnet/portswigger/devtools/client/Zn;Ljava/util/concurrent/ExecutorService;)V
    //   416: goto -> 461
    //   419: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   422: athrow
    //   423: new net/portswigger/devtools/client/impl/Zxj
    //   426: dup
    //   427: aload #4
    //   429: aload_2
    //   430: aload #6
    //   432: invokespecial <init> : (Lnet/portswigger/browser/Zev;Lnet/portswigger/browser/Zd;Lnet/portswigger/devtools/client/Zn;)V
    //   435: goto -> 461
    //   438: new net/portswigger/devtools/client/impl/Zxb
    //   441: dup
    //   442: aload #4
    //   444: aload_2
    //   445: new net/portswigger/devtools/client/impl/Zxa
    //   448: dup
    //   449: aload_1
    //   450: getfield type : Ljava/lang/String;
    //   453: invokespecial <init> : (Ljava/lang/String;)V
    //   456: aload #6
    //   458: invokespecial <init> : (Lnet/portswigger/browser/Zev;Lnet/portswigger/browser/Zd;Lnet/portswigger/devtools/client/impl/Zxa;Lnet/portswigger/devtools/client/Zn;)V
    //   461: astore #7
    //   463: aload #7
    //   465: invokeinterface ZW : ()V
    //   470: aload_0
    //   471: getfield ZG : Ljava/util/concurrent/BlockingDeque;
    //   474: aload #7
    //   476: invokeinterface add : (Ljava/lang/Object;)Z
    //   481: pop
    //   482: aload #7
    //   484: areturn
    // Exception table:
    //   from	to	target	type
    //   17	72	75	net/portswigger/devtools/client/Zi
    //   125	154	154	net/portswigger/devtools/client/Zi
    //   158	200	200	net/portswigger/devtools/client/Zi
    //   272	321	324	net/portswigger/devtools/client/Zi
    //   331	352	355	net/portswigger/devtools/client/Zi
    //   362	419	419	net/portswigger/devtools/client/Zi
  }
  
  private void ZE(Zf paramZf, Ze3 paramZe3) {
    try {
      if (!this.ZG.remove(paramZf)) {
        Zb.Zp(Zds.WARNING, a(-24572, 2225), new Object[] { this.ZG });
        return;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    Zb.Zp(Zds.DEBUG, a(-24573, 14731), new Object[] { paramZf.ZG(), paramZf.Z_() });
    paramZf.Zo(paramZe3);
    paramZf.Zp();
    this.Zn.ZD(Zcx.ZX(paramZf, paramZe3));
  }
  
  void Zv(DetachedFromTarget paramDetachedFromTarget) {
    Objects.requireNonNull(Zf.class);
    ZJ(Zf.ZJ(paramDetachedFromTarget.sessionId)).map(Zf.class::cast).peek(Zxy::lambda$onTargetDetached$7).forEach(this::lambda$onTargetDetached$8);
  }
  
  void Zl(TargetCrashed paramTargetCrashed) {
    Objects.requireNonNull(Zf.class);
    ZJ(Zf.Zh(paramTargetCrashed.targetId)).map(Zf.class::cast).peek(Zxy::lambda$onTargetCrashed$9).forEach(this::lambda$onTargetCrashed$10);
  }
  
  private void lambda$onTargetCrashed$10(Zf paramZf) {
    ZE(paramZf, Ze3.CRASHED);
  }
  
  private static void lambda$onTargetCrashed$9(Zf paramZf) {
    Zb.Zp(Zds.WARNING, a(-24557, 11126), new Object[] { paramZf.ZG(), paramZf.Z_() });
  }
  
  private void lambda$onTargetDetached$8(Zf paramZf) {
    ZE(paramZf, Ze3.DETACHED);
  }
  
  private static void lambda$onTargetDetached$7(Zf paramZf) {
    Zb.Zp(Zds.INFO, a(-24567, 3307), new Object[] { paramZf.ZG(), paramZf.Z_() });
  }
  
  private static boolean lambda$targetAttachedInContext$6(Zev paramZev, Zf paramZf) {
    return paramZf.ZG().equals(paramZev);
  }
  
  private static CompletableFuture lambda$close$5(Zm1 paramZm1, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getTarget().closeTarget(paramZm1.ZG().ZB3());
  }
  
  private static CompletableFuture lambda$create$4(Zev paramZev, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getTarget().closeTarget(paramZev.ZB3());
  }
  
  private static CompletableFuture lambda$create$3(Zev paramZev, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getTarget().closeTarget(paramZev.ZB3());
  }
  
  private static CompletableFuture lambda$create$2(Zev paramZev, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getTarget().closeTarget(paramZev.ZB3());
  }
  
  private CompletableFuture lambda$create$1(String paramString, List paramList, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getTarget().createTarget(paramString, null, null, this.ZJ.ZVJ(), Boolean.valueOf(false), Boolean.valueOf(paramList.contains(Ztx.OPEN_IN_NEW_WINDOW)), Boolean.valueOf(false), Boolean.valueOf(false));
  }
  
  private static void lambda$create$0(Zy paramZy, Zxr8 paramZxr8) {
    Objects.requireNonNull(paramZy);
    paramZxr8.ZP(paramZy::Zl);
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: ldc 'z8RR7b'
    //   9: iconst_0
    //   10: istore_3
    //   11: ldc 'ê5øÂ`pñV÷>èE°²JÊ.mÇc0>Ç"¿§+¹¾]­BhW7ÈÅÞA¡!\E¢-qnáØï\\t]«[»%(b}E4ø2-Zv¹FÑ@Ðµ¨'©Í\\tGVÇIß»\\b»?#²Ó\\bÑ¡«w6¿tñ¸e:$2ÀÌðm§¨+!CrAOÂTêáJ ¶dÆnÂòEoÀ¸9ùÚxµT6£,"í,è¤Kòp8M²ôIþ°@W@\\nÅ×û/V$¾·§æÆý¬íÆYAýð`t(­ÁH¢¬4ÜÝ;ðÊdûmî'3¿DK¹\\bYcY¯%'äÌ7ìàø½p5ô¬CÞFY$:·CÂ*§¬5¢\\fKKiRè# GçÝzBìa \\f ÊOål©\\bYf·Ô5à>!ÔÖ0pZÖlÅL#¯¸ÆÙ¼V6 ÷_fùfÛÔ-¨ä 9ÎþÆ×÷!&9J3TGUcí3É¯W ÍºÉoõ\\nÚÍíÞ0ìÆÍ\\fc°ézZ=Ò\\tæUû÷£ÒP5t\´dMª)Íz{Ù¯-§º5`\\fmLS4Ø§¢÷¦¥©´ÀYÉÛ>»¥«ðVy8?g¤Þ¶\\n2ý(Ö(ý7]ÏK°ï/ÁzÙ^}c}\\n</fý²\\twq28ÓÎr!L©P\\bÔêqkrayÕ5\Bfr[FÊ£0Ã#çøk'Ñ7³ËÒøUp,?Yà¦¯-E¾ÈòF:Ææ7<:£Ê³·&,'Ra&Kåõ+¹.x¯ß>éù¸}7W\\f%æÚ¢ee/ ÒfyR\\b ÅêÂÓLg¨3!GA}ÖGÍÊxX¿½zX¥Ïä'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: invokestatic Zq : (Ljava/lang/String;)V
    //   23: bipush #81
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #100
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 148
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc '\\nøáhf¡äãsM©óE¢"YpE6Áý"ä4jã3¥¦ÖËó/w¡ñA0cµ`/þN¾HhëËë«ýí¾#s*²muM¿ñßÍEKTÔ1ÿÁ{æàÐäåÑÛ4Y'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #52
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #82
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic net/portswigger/devtools/client/impl/Zxy.a : [Ljava/lang/String;
    //   137: bipush #20
    //   139: anewarray java/lang/String
    //   142: putstatic net/portswigger/devtools/client/impl/Zxy.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #8
    //   218: goto -> 248
    //   221: bipush #97
    //   223: goto -> 248
    //   226: bipush #116
    //   228: goto -> 248
    //   231: bipush #107
    //   233: goto -> 248
    //   236: bipush #83
    //   238: goto -> 248
    //   241: bipush #29
    //   243: goto -> 248
    //   246: bipush #74
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 104
    //   304: ldc2_w 600
    //   307: invokestatic ofSeconds : (J)Ljava/time/Duration;
    //   310: putstatic net/portswigger/devtools/client/impl/Zxy.Z_ : Ljava/time/Duration;
    //   313: return
  }
  
  public static void Zq(String paramString) {
    ZW = paramString;
  }
  
  public static String Zx() {
    return ZW;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA001) & 0xFFFF;
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
      byte b1 = 64;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */