package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Supplier;

public final class Zxnd<T> implements Zgra<T> {
  private final Executor Zj;
  
  private final Consumer<T> ZB;
  
  private final Supplier<List<T>> ZN;
  
  private final AtomicBoolean ZC;
  
  private final Object ZO;
  
  private final Runnable ZU;
  
  public Zxnd(Executor paramExecutor, Consumer<List<T>> paramConsumer, Consumer<T> paramConsumer1, Supplier<List<T>> paramSupplier, AtomicBoolean paramAtomicBoolean, Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zj : Ljava/util/concurrent/Executor;
    //   9: invokestatic Zy : ()I
    //   12: aload_0
    //   13: aload_3
    //   14: putfield ZB : Ljava/util/function/Consumer;
    //   17: aload_0
    //   18: aload #4
    //   20: putfield ZN : Ljava/util/function/Supplier;
    //   23: aload_0
    //   24: aload #5
    //   26: putfield ZC : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   29: istore #8
    //   31: aload_0
    //   32: aload #6
    //   34: putfield ZO : Ljava/lang/Object;
    //   37: aload_0
    //   38: aload_0
    //   39: aload #7
    //   41: aload #5
    //   43: aload_2
    //   44: <illegal opcode> run : (Lburp/Zxnd;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/function/Consumer;)Ljava/lang/Runnable;
    //   49: putfield ZU : Ljava/lang/Runnable;
    //   52: iload #8
    //   54: ifne -> 64
    //   57: iconst_2
    //   58: anewarray burp/Zbqc
    //   61: invokestatic Zr : ([Lburp/Zbqc;)V
    //   64: return
  }
  
  public Zxnd(Executor paramExecutor, Consumer<List<T>> paramConsumer) {
    this(paramExecutor, paramConsumer, new ArrayList<>());
  }
  
  public Zxnd(Executor paramExecutor, Consumer<List<T>> paramConsumer, List<T> paramList) {
    this(paramExecutor, paramConsumer, paramList::add, paramList::lambda$new$1);
  }
  
  public Zxnd(Executor paramExecutor, Consumer<List<T>> paramConsumer, Consumer<T> paramConsumer1, Supplier<List<T>> paramSupplier) {
    this(paramExecutor, paramConsumer, paramConsumer1, paramSupplier, new AtomicBoolean(), new Object(), new Object());
  }
  
  public void ZB(T paramT) {
    // Byte code:
    //   0: invokestatic Zy : ()I
    //   3: aload_0
    //   4: getfield ZO : Ljava/lang/Object;
    //   7: dup
    //   8: astore_3
    //   9: monitorenter
    //   10: istore_2
    //   11: aload_0
    //   12: getfield ZB : Ljava/util/function/Consumer;
    //   15: aload_1
    //   16: invokeinterface accept : (Ljava/lang/Object;)V
    //   21: aload_3
    //   22: monitorexit
    //   23: goto -> 33
    //   26: astore #4
    //   28: aload_3
    //   29: monitorexit
    //   30: aload #4
    //   32: athrow
    //   33: invokestatic Zwu : ()[Lburp/Zbqc;
    //   36: ifnonnull -> 46
    //   39: iinc #2, 1
    //   42: iload_2
    //   43: invokestatic ZD : (I)V
    //   46: return
    // Exception table:
    //   from	to	target	type
    //   11	23	26	finally
    //   26	30	26	finally
  }
  
  public void Zv() {
    if (this.ZC.compareAndSet(false, true))
      this.Zj.execute(this.ZU); 
  }
  
  List<T> ZV() {
    synchronized (this.ZO) {
      return this.ZN.get();
    } 
  }
  
  private static List lambda$new$1(List<?> paramList) {
    ArrayList arrayList = new ArrayList(paramList);
    paramList.clear();
    return arrayList;
  }
  
  private void lambda$new$0(Object paramObject, AtomicBoolean paramAtomicBoolean, Consumer<List<T>> paramConsumer) {
    synchronized (paramObject) {
      paramAtomicBoolean.set(false);
      paramConsumer.accept(ZV());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxnd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */