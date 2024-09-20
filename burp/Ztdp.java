package burp;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ztdp<T> implements Zgra<T> {
  private final Zxnd<T> Zi;
  
  private final Object ZT;
  
  private final AtomicBoolean Zy;
  
  private final Runnable Zg;
  
  private final LongSupplier ZN;
  
  private static int Ze;
  
  public Ztdp(Executor paramExecutor, Consumer<List<T>> paramConsumer, LongSupplier paramLongSupplier) {
    this(paramExecutor, paramConsumer, new Zxnd<>(Ztdp::lambda$new$0, paramConsumer), paramLongSupplier);
  }
  
  private Ztdp(Executor paramExecutor, Consumer<List<T>> paramConsumer, Zxnd<T> paramZxnd, LongSupplier paramLongSupplier) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload #4
    //   7: putfield ZN : Ljava/util/function/LongSupplier;
    //   10: aload_0
    //   11: aload_3
    //   12: putfield Zi : Lburp/Zxnd;
    //   15: aload_0
    //   16: new java/lang/Object
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: putfield ZT : Ljava/lang/Object;
    //   26: aload_0
    //   27: new java/util/concurrent/atomic/AtomicBoolean
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: putfield Zy : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   37: aload_0
    //   38: aload_0
    //   39: aload_1
    //   40: aload_2
    //   41: <illegal opcode> run : (Lburp/Ztdp;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)Ljava/lang/Runnable;
    //   46: putfield Zg : Ljava/lang/Runnable;
    //   49: return
  }
  
  public void ZB(T paramT) {
    this.Zi.ZB(paramT);
  }
  
  public void Zv() {
    if (this.Zy.compareAndSet(false, true))
      Zltl.ZJ(this.Zg, this.ZN.getAsLong(), TimeUnit.MILLISECONDS); 
  }
  
  private List<T> ZX() {
    return this.Zi.ZV();
  }
  
  private void lambda$new$2(Executor paramExecutor, Consumer paramConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZT : Ljava/lang/Object;
    //   4: dup
    //   5: astore_3
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield Zy : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   11: iconst_0
    //   12: invokevirtual set : (Z)V
    //   15: aload_1
    //   16: aload_0
    //   17: aload_2
    //   18: <illegal opcode> run : (Lburp/Ztdp;Ljava/util/function/Consumer;)Ljava/lang/Runnable;
    //   23: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   28: aload_3
    //   29: monitorexit
    //   30: goto -> 40
    //   33: astore #4
    //   35: aload_3
    //   36: monitorexit
    //   37: aload #4
    //   39: athrow
    //   40: return
    // Exception table:
    //   from	to	target	type
    //   7	30	33	finally
    //   33	37	33	finally
  }
  
  private void lambda$new$1(Consumer<List<T>> paramConsumer) {
    try {
      paramConsumer.accept(ZX());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private static void lambda$new$0(Runnable paramRunnable) {}
  
  public static void ZD(int paramInt) {
    Ze = paramInt;
  }
  
  public static int ZT() {
    return Ze;
  }
  
  public static int Zy() {
    int i = ZT();
    return (i == 0) ? 107 : 0;
  }
  
  static {
    if (Zy() == 0)
      ZD(35); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztdp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */