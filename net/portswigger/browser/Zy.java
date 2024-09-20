package net.portswigger.browser;

import burp.Zxr8;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zy {
  private final Zdu Zc;
  
  private final AtomicBoolean ZK = new AtomicBoolean(false);
  
  private int ZZ = 1080;
  
  private int ZM = 1920;
  
  public Zy() {
    this(Zzr.ZU().Zp());
  }
  
  public Zy(Zdu paramZdu) {
    this.Zc = paramZdu;
  }
  
  public void Zf(Zc1 paramZc1, Zc5 paramZc5) throws Ztk, InterruptedException, Zcb {
    boolean bool = Zcb.ZK();
    try {
      Zdr zdr = paramZc5.Zv();
      while (paramZc5.Zb()) {
        try {
          if (!this.ZK.get())
            try {
              if (!Thread.currentThread().isInterrupted()) {
                ZE(paramZc1, paramZc5.Zm(), zdr);
                if (bool)
                  break; 
              } 
            } catch (Zda zda) {
              throw a(null);
            }  
        } catch (Zda zda) {
          throw a(null);
        } 
      } 
    } catch (Zda zda) {
      Zah.Zl(zda, Zk_.RETHROWN);
      throw new Zcb(zda.getMessage());
    } finally {
      try {
        if (!paramZc1.Zz().Zo())
          this.Zc.Zg().ifPresent(Zy::Zl); 
      } catch (Zda zda) {
        throw a(null);
      } 
    } 
  }
  
  public void ZE(Zc1 paramZc1, Zd_ paramZd_, Zdr paramZdr) throws Ztk, InterruptedException, Zda {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: new net/portswigger/browser/Zzq
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #5
    //   12: istore #4
    //   14: new java/util/concurrent/atomic/AtomicReference
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #6
    //   23: aload_2
    //   24: invokevirtual ZT : ()Z
    //   27: ifeq -> 63
    //   30: invokestatic Zr : ()Lburp/Zts2;
    //   33: aload_1
    //   34: getstatic net/portswigger/browser/Zck.ZD : Lburp/Zlnb;
    //   37: aload_0
    //   38: aload #6
    //   40: aload #5
    //   42: <illegal opcode> accept : (Lnet/portswigger/browser/Zy;Ljava/util/concurrent/atomic/AtomicReference;Lnet/portswigger/browser/Zzq;)Ljava/util/function/Consumer;
    //   47: invokevirtual Zz : (Lburp/Zlli;Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zts2;
    //   50: pop
    //   51: iload #4
    //   53: ifeq -> 119
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: aload_2
    //   64: invokevirtual ZE : ()Z
    //   67: ifeq -> 107
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: invokestatic Zr : ()Lburp/Zts2;
    //   80: aload_1
    //   81: getstatic net/portswigger/browser/Zck.Zf : Lburp/Zlnb;
    //   84: aload #5
    //   86: <illegal opcode> accept : (Lnet/portswigger/browser/Zzq;)Ljava/util/function/Consumer;
    //   91: invokevirtual Zz : (Lburp/Zlli;Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zts2;
    //   94: pop
    //   95: iload #4
    //   97: ifeq -> 119
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: aload #5
    //   109: invokevirtual ZJ : ()V
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   118: athrow
    //   119: aload_1
    //   120: invokeinterface Zj : ()Lnet/portswigger/browser/Zt8;
    //   125: invokeinterface Zc : ()Ljava/util/Optional;
    //   130: invokevirtual orElseThrow : ()Ljava/lang/Object;
    //   133: checkcast net/portswigger/browser/Zjw
    //   136: astore #7
    //   138: aload_0
    //   139: aload #7
    //   141: aload_2
    //   142: invokevirtual Zw : (Lnet/portswigger/browser/Zjw;Lnet/portswigger/browser/Zd_;)V
    //   145: aload_2
    //   146: new net/portswigger/browser/Zew
    //   149: dup
    //   150: aload_0
    //   151: getfield Zc : Lnet/portswigger/browser/Zdu;
    //   154: aload_3
    //   155: aload #5
    //   157: invokespecial <init> : (Lnet/portswigger/browser/Zdu;Lnet/portswigger/browser/Zdr;Lnet/portswigger/browser/Zzq;)V
    //   160: invokevirtual Zy : (Lnet/portswigger/browser/Zj;)Ljava/lang/Object;
    //   163: checkcast net/portswigger/browser/Ze7
    //   166: astore #8
    //   168: aload #8
    //   170: aload #7
    //   172: invokevirtual Zn : (Lnet/portswigger/browser/Zjw;)Lnet/portswigger/browser/Zjq;
    //   175: pop
    //   176: aload #6
    //   178: invokevirtual get : ()Ljava/lang/Object;
    //   181: checkcast net/portswigger/browser/Zez
    //   184: astore #9
    //   186: aload #9
    //   188: ifnull -> 233
    //   191: aload #9
    //   193: invokevirtual Zt : ()Lnet/portswigger/browser/Zjw;
    //   196: pop
    //   197: goto -> 233
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: astore #10
    //   206: invokestatic currentThread : ()Ljava/lang/Thread;
    //   209: invokevirtual interrupt : ()V
    //   212: aload #10
    //   214: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   217: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   220: goto -> 233
    //   223: astore #10
    //   225: aload #10
    //   227: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   230: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   233: return
    // Exception table:
    //   from	to	target	type
    //   23	56	59	java/lang/InterruptedException
    //   30	70	73	java/lang/InterruptedException
    //   63	100	103	java/lang/InterruptedException
    //   77	112	115	java/lang/InterruptedException
    //   186	200	200	net/portswigger/browser/Zda
    //   191	197	204	java/lang/InterruptedException
    //   191	197	223	net/portswigger/browser/Ztg
  }
  
  private void Zw(Zjw paramZjw, Zd_ paramZd_) {
    try {
      if (!paramZd_.ZQ())
        try {
          if (paramZd_.ZH()) {
            this.ZM = paramZd_.ZK();
            this.ZZ = paramZd_.Zi();
          } 
        } catch (Zda zda) {
          throw a(null);
        }  
    } catch (Zda zda) {
      throw a(null);
    } 
    ZB(paramZjw);
  }
  
  private void ZB(Zjw paramZjw) {
    try {
      paramZjw.ZK().ZW(this.ZM, this.ZZ);
    } catch (Ztk ztk) {
      Zah.Zl(ztk, Zk_.UNEXPECTED);
    } 
  }
  
  static void Zl(Duration paramDuration) {
    try {
      Thread.sleep(paramDuration.toMillis());
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.UNEXPECTED);
      Thread.currentThread().interrupt();
    } 
  }
  
  private static void lambda$replayStep$2(Zzq paramZzq, Zxr8 paramZxr8) {
    paramZzq.ZJ();
  }
  
  private void lambda$replayStep$1(AtomicReference paramAtomicReference, Zzq paramZzq, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_3
    //   1: aload_0
    //   2: aload_1
    //   3: aload_2
    //   4: <illegal opcode> accept : (Lnet/portswigger/browser/Zy;Ljava/util/concurrent/atomic/AtomicReference;Lnet/portswigger/browser/Zzq;)Ljava/util/function/Consumer;
    //   9: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   12: return
  }
  
  private void lambda$replayStep$0(AtomicReference<Zez> paramAtomicReference, Zzq paramZzq, Zez paramZez) {
    paramAtomicReference.set(paramZez);
    paramZez.Zx(this::ZB);
    paramZzq.ZJ();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */