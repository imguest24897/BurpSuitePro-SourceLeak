package burp;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class Zgsj {
  private final Runnable Ze;
  
  private final ScheduledExecutorService ZA;
  
  private final Object ZH = new Object();
  
  private ScheduledFuture<?> ZR;
  
  Zgsj(Runnable paramRunnable, ScheduledExecutorService paramScheduledExecutorService) {
    this.Ze = paramRunnable;
    this.ZA = paramScheduledExecutorService;
  }
  
  void Zz(long paramLong, TimeUnit paramTimeUnit) {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield ZH : Ljava/lang/Object;
    //   9: dup
    //   10: astore #5
    //   12: monitorenter
    //   13: aload_3
    //   14: lload_1
    //   15: invokevirtual toMillis : (J)J
    //   18: lstore #6
    //   20: aload_0
    //   21: getfield ZR : Ljava/util/concurrent/ScheduledFuture;
    //   24: ifnull -> 85
    //   27: aload_0
    //   28: getfield ZR : Ljava/util/concurrent/ScheduledFuture;
    //   31: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   34: invokeinterface getDelay : (Ljava/util/concurrent/TimeUnit;)J
    //   39: lstore #8
    //   41: lload #6
    //   43: lload #8
    //   45: lcmp
    //   46: ifle -> 80
    //   49: lload #8
    //   51: l2d
    //   52: lload #6
    //   54: l2d
    //   55: ldc2_w 0.67
    //   58: dmul
    //   59: dcmpg
    //   60: ifge -> 80
    //   63: aload_0
    //   64: getfield ZR : Ljava/util/concurrent/ScheduledFuture;
    //   67: iconst_0
    //   68: invokeinterface cancel : (Z)Z
    //   73: pop
    //   74: aload_0
    //   75: lload #6
    //   77: invokevirtual ZR : (J)V
    //   80: iload #4
    //   82: ifeq -> 91
    //   85: aload_0
    //   86: lload #6
    //   88: invokevirtual ZR : (J)V
    //   91: aload #5
    //   93: monitorexit
    //   94: goto -> 105
    //   97: astore #10
    //   99: aload #5
    //   101: monitorexit
    //   102: aload #10
    //   104: athrow
    //   105: return
    // Exception table:
    //   from	to	target	type
    //   13	94	97	finally
    //   97	102	97	finally
  }
  
  private void ZR(long paramLong) {
    this.ZR = this.ZA.schedule(this::lambda$scheduleTask$0, paramLong, TimeUnit.MILLISECONDS);
  }
  
  private void lambda$scheduleTask$0() {
    this.Ze.run();
    synchronized (this.ZH) {
      this.ZR = null;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgsj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */