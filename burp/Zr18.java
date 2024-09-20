package burp;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public class Zr18 {
  private final long ZG;
  
  private final ScheduledExecutorService Ze;
  
  private final AtomicBoolean ZK;
  
  private Zgbj ZU = null;
  
  public Zr18(long paramLong) {
    this(paramLong, Executors.newSingleThreadScheduledExecutor());
  }
  
  Zr18(long paramLong, ScheduledExecutorService paramScheduledExecutorService) {
    this.ZG = paramLong;
    this.Ze = paramScheduledExecutorService;
    this.ZK = new AtomicBoolean();
  }
  
  public void Z_(Zmg9 paramZmg9) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZK : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   4: iconst_0
    //   5: iconst_1
    //   6: invokevirtual compareAndSet : (ZZ)Z
    //   9: ifeq -> 36
    //   12: aload_0
    //   13: getfield Ze : Ljava/util/concurrent/ScheduledExecutorService;
    //   16: aload_0
    //   17: aload_1
    //   18: <illegal opcode> run : (Lburp/Zr18;Lburp/Zmg9;)Ljava/lang/Runnable;
    //   23: aload_0
    //   24: getfield ZG : J
    //   27: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   30: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   35: pop
    //   36: return
  }
  
  public void ZH(Zgbj paramZgbj) {
    this.ZU = paramZgbj;
  }
  
  private void lambda$execute$0(Zmg9 paramZmg9) {
    int i = Zgdu.Zb();
    if (this.ZU != null) {
      this.ZU.ZK(false);
      if (i != 0) {
        StartBurp.ZL.ZH(paramZmg9);
        return;
      } 
      return;
    } 
    StartBurp.ZL.ZH(paramZmg9);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr18.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */