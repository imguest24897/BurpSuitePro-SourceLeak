package burp;

import java.time.Duration;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Supplier;

public class Zxcf {
  private static final Duration ZF = Duration.ofMillis(2500L);
  
  private static final Supplier<Boolean> Zx = Zxcf::lambda$static$0;
  
  private final ScheduledExecutorService Zy;
  
  private static String[] Zq;
  
  public Zxcf(Runnable paramRunnable) {
    this(Zx, paramRunnable, ZF);
  }
  
  public Zxcf(Runnable paramRunnable, Duration paramDuration) {
    this(Zx, paramRunnable, paramDuration);
  }
  
  public Zxcf(Supplier<Boolean> paramSupplier, Runnable paramRunnable) {
    this(paramSupplier, paramRunnable, ZF);
  }
  
  public Zxcf(Supplier<Boolean> paramSupplier, Runnable paramRunnable, Duration paramDuration) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: invokestatic newSingleThreadScheduledExecutor : ()Ljava/util/concurrent/ScheduledExecutorService;
    //   8: putfield Zy : Ljava/util/concurrent/ScheduledExecutorService;
    //   11: invokestatic ZG : ()Z
    //   14: ifne -> 42
    //   17: aload_0
    //   18: getfield Zy : Ljava/util/concurrent/ScheduledExecutorService;
    //   21: aload_1
    //   22: aload_2
    //   23: <illegal opcode> run : (Ljava/util/function/Supplier;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    //   28: lconst_0
    //   29: aload_3
    //   30: invokevirtual toMillis : ()J
    //   33: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   36: invokeinterface scheduleAtFixedRate : (Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   41: pop
    //   42: return
  }
  
  public void Zz() {
    Zxjf.ZC(this.Zy);
  }
  
  private static void lambda$new$1(Supplier<Boolean> paramSupplier, Runnable paramRunnable) {
    if (((Boolean)paramSupplier.get()).booleanValue())
      paramRunnable.run(); 
  }
  
  private static Boolean lambda$static$0() {
    return Boolean.valueOf(true);
  }
  
  static {
    Zy(null);
  }
  
  public static void Zy(String[] paramArrayOfString) {
    Zq = paramArrayOfString;
  }
  
  public static String[] Zq() {
    return Zq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxcf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */