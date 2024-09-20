package burp;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public class Zxgk {
  private final Zgna ZL;
  
  private final Ztos<Zt13> ZW;
  
  private final AtomicBoolean ZU;
  
  private final AtomicBoolean Zs;
  
  private final BlockingQueue<Zrke> ZI;
  
  public Zxgk(Zgna paramZgna, Ztos<Zt13> paramZtos, Zspa paramZspa, Zlli<Zt11> paramZlli) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZD : ()Ljava/lang/String;
    //   7: aload_0
    //   8: new java/util/concurrent/atomic/AtomicBoolean
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield ZU : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   18: aload_0
    //   19: new java/util/concurrent/atomic/AtomicBoolean
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: putfield Zs : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   29: aload_0
    //   30: new java/util/concurrent/LinkedBlockingQueue
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: putfield ZI : Ljava/util/concurrent/BlockingQueue;
    //   40: aload_0
    //   41: aload_1
    //   42: putfield ZL : Lburp/Zgna;
    //   45: aload_0
    //   46: aload_2
    //   47: putfield ZW : Lburp/Ztos;
    //   50: aload_2
    //   51: getstatic burp/Zt13.ZC : Lburp/Zlnb;
    //   54: aload_0
    //   55: <illegal opcode> accept : (Lburp/Zxgk;)Ljava/util/function/Consumer;
    //   60: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   63: pop
    //   64: astore #5
    //   66: aload_2
    //   67: getstatic burp/Zt13.ZV : Lburp/Zlnb;
    //   70: aload_0
    //   71: aload_1
    //   72: aload_2
    //   73: <illegal opcode> accept : (Lburp/Zxgk;Lburp/Zgna;Lburp/Ztos;)Ljava/util/function/Consumer;
    //   78: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   81: pop
    //   82: aload_2
    //   83: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   86: aload_0
    //   87: <illegal opcode> accept : (Lburp/Zxgk;)Ljava/util/function/Consumer;
    //   92: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   95: pop
    //   96: invokestatic newSingleThreadExecutor : ()Ljava/util/concurrent/ExecutorService;
    //   99: astore #6
    //   101: aload #6
    //   103: aload_0
    //   104: aload_1
    //   105: aload_3
    //   106: aload #6
    //   108: <illegal opcode> run : (Lburp/Zxgk;Lburp/Zgna;Lburp/Zspa;Ljava/util/concurrent/ExecutorService;)Ljava/lang/Runnable;
    //   113: invokeinterface submit : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   118: pop
    //   119: aload #4
    //   121: getstatic burp/Zt11.Zc : Lburp/Zlnb;
    //   124: aload #6
    //   126: <illegal opcode> accept : (Ljava/util/concurrent/ExecutorService;)Ljava/util/function/Consumer;
    //   131: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   136: pop
    //   137: invokestatic Zwu : ()[Lburp/Zbqc;
    //   140: ifnonnull -> 148
    //   143: ldc 'KsSS6'
    //   145: invokestatic ZM : (Ljava/lang/String;)V
    //   148: return
  }
  
  public void Zp() {
    this.ZI.add(Zrke.ITEM_STARTED);
  }
  
  public void ZQ() {
    this.ZI.add(Zrke.ITEM_FINISHED);
  }
  
  public boolean ZF() {
    return this.ZL.ZPf().isEmpty() ? false : ((this.ZL.ZPB().compareTo(this.ZL.ZPf().get()) >= 0));
  }
  
  public void ZJ() {
    if (this.ZU.compareAndSet(false, true))
      this.ZW.ZD(Zt13.Zy); 
  }
  
  private static void lambda$new$6(ExecutorService paramExecutorService, Zxr8 paramZxr8) {
    paramExecutorService.shutdownNow();
  }
  
  private void lambda$new$5(Zgna paramZgna, Zspa paramZspa, ExecutorService paramExecutorService) {
    // Byte code:
    //   0: invokestatic ZD : ()Ljava/lang/String;
    //   3: astore #4
    //   5: iconst_1
    //   6: istore #5
    //   8: iload #5
    //   10: ifeq -> 173
    //   13: aload_1
    //   14: invokeinterface ZPf : ()Ljava/util/Optional;
    //   19: getstatic java/time/Duration.ZERO : Ljava/time/Duration;
    //   22: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   25: checkcast java/time/Duration
    //   28: aload_1
    //   29: invokeinterface ZPB : ()Ljava/time/Duration;
    //   34: invokevirtual minus : (Ljava/time/Duration;)Ljava/time/Duration;
    //   37: astore #6
    //   39: aload #6
    //   41: invokevirtual isZero : ()Z
    //   44: ifne -> 76
    //   47: aload #6
    //   49: invokevirtual isNegative : ()Z
    //   52: ifne -> 76
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   61: athrow
    //   62: aload_2
    //   63: invokevirtual Zc : ()Z
    //   66: ifne -> 99
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   75: athrow
    //   76: aload_2
    //   77: aload_0
    //   78: getfield ZI : Ljava/util/concurrent/BlockingQueue;
    //   81: invokeinterface take : ()Ljava/lang/Object;
    //   86: checkcast burp/Zrke
    //   89: invokevirtual ZT : (Lburp/Zrke;)Z
    //   92: istore #5
    //   94: aload #4
    //   96: ifnull -> 150
    //   99: aload_0
    //   100: getfield ZI : Ljava/util/concurrent/BlockingQueue;
    //   103: aload #6
    //   105: invokevirtual toMillis : ()J
    //   108: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   111: invokeinterface poll : (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   116: checkcast burp/Zrke
    //   119: astore #7
    //   121: aload #7
    //   123: ifnull -> 139
    //   126: aload_2
    //   127: aload #7
    //   129: invokevirtual ZT : (Lburp/Zrke;)Z
    //   132: istore #5
    //   134: aload #4
    //   136: ifnull -> 150
    //   139: aload_2
    //   140: invokevirtual ZJ : ()V
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   149: athrow
    //   150: aload_0
    //   151: invokevirtual ZF : ()Z
    //   154: ifeq -> 168
    //   157: aload_0
    //   158: invokevirtual ZJ : ()V
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   167: athrow
    //   168: aload #4
    //   170: ifnull -> 8
    //   173: goto -> 192
    //   176: astore #6
    //   178: aload #6
    //   180: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   183: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   186: invokestatic currentThread : ()Ljava/lang/Thread;
    //   189: invokevirtual interrupt : ()V
    //   192: aload_3
    //   193: invokeinterface shutdown : ()V
    //   198: return
    // Exception table:
    //   from	to	target	type
    //   8	173	176	java/lang/InterruptedException
    //   39	55	58	java/lang/InterruptedException
    //   47	69	72	java/lang/InterruptedException
    //   134	143	146	java/lang/InterruptedException
    //   150	161	164	java/lang/InterruptedException
  }
  
  private void lambda$new$4(Zxr8 paramZxr8) {
    this.ZI.add(Zrke.TASK_DELETED);
  }
  
  private void lambda$new$3(Zgna paramZgna, Ztos paramZtos, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_3
    //   1: aload_0
    //   2: aload_1
    //   3: aload_2
    //   4: <illegal opcode> accept : (Lburp/Zxgk;Lburp/Zgna;Lburp/Ztos;)Ljava/util/function/Consumer;
    //   9: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   12: return
  }
  
  private void lambda$new$2(Zgna paramZgna, Ztos paramZtos, Ztak paramZtak) {
    if (this.ZU.get() && this.Zs.compareAndSet(false, true)) {
      paramZgna.Zr(null);
      paramZtos.ZD(Zt13.Zj);
    } 
    if (paramZtak.ZO())
      this.ZI.add(Zrke.TASK_RESUMED); 
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$0);
  }
  
  private void lambda$new$0(Zst9 paramZst9) {
    this.ZI.add(Zrke.TASK_PAUSED);
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxgk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */