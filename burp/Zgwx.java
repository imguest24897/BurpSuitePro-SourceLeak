package burp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

public class Zgwx<T> implements Zgk4<T> {
  private final Set<Integer> Zf;
  
  private final FilteredList<T> ZP;
  
  private final ObservableList<T> ZO;
  
  private final Zxr3 ZK;
  
  private final ObservableList<T> Zn;
  
  private final Zgra<Runnable> Zc;
  
  private final Object ZG;
  
  private final Object Zg;
  
  private final Zxwk<T> Zs;
  
  private final List<Runnable> ZM;
  
  private volatile Future<?> ZA;
  
  private boolean Zo;
  
  public Zgwx(ObservableList<T> paramObservableList, long paramLong, Zxr3 paramZxr3) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield Zo : Z
    //   9: aload_0
    //   10: aload #4
    //   12: putfield ZK : Lburp/Zxr3;
    //   15: aload_0
    //   16: aload_1
    //   17: putfield Zn : Ljavafx/collections/ObservableList;
    //   20: aload_0
    //   21: aload_1
    //   22: invokestatic observableArrayList : (Ljava/util/Collection;)Ljavafx/collections/ObservableList;
    //   25: putfield ZO : Ljavafx/collections/ObservableList;
    //   28: aload_0
    //   29: aload_0
    //   30: getfield ZO : Ljavafx/collections/ObservableList;
    //   33: aconst_null
    //   34: invokeinterface filtered : (Ljava/util/function/Predicate;)Ljavafx/collections/transformation/FilteredList;
    //   39: putfield ZP : Ljavafx/collections/transformation/FilteredList;
    //   42: aload_0
    //   43: new java/util/HashSet
    //   46: dup
    //   47: invokespecial <init> : ()V
    //   50: putfield Zf : Ljava/util/Set;
    //   53: aload_0
    //   54: aload_0
    //   55: invokevirtual Zq : ()Lburp/Zgra;
    //   58: putfield Zc : Lburp/Zgra;
    //   61: invokestatic Zk : ()[I
    //   64: aload_0
    //   65: new java/lang/Object
    //   68: dup
    //   69: invokespecial <init> : ()V
    //   72: putfield ZG : Ljava/lang/Object;
    //   75: aload_0
    //   76: new java/lang/Object
    //   79: dup
    //   80: invokespecial <init> : ()V
    //   83: putfield Zg : Ljava/lang/Object;
    //   86: aload_0
    //   87: new burp/Zxwk
    //   90: dup
    //   91: aload_0
    //   92: getfield ZP : Ljavafx/collections/transformation/FilteredList;
    //   95: invokespecial <init> : (Ljavafx/collections/transformation/FilteredList;)V
    //   98: putfield Zs : Lburp/Zxwk;
    //   101: aload_0
    //   102: new java/util/concurrent/CopyOnWriteArrayList
    //   105: dup
    //   106: invokespecial <init> : ()V
    //   109: putfield ZM : Ljava/util/List;
    //   112: astore #5
    //   114: aload_0
    //   115: invokevirtual Zt : ()V
    //   118: aload_0
    //   119: lload_2
    //   120: invokevirtual ZG : (J)V
    //   123: aload_0
    //   124: aload_1
    //   125: <illegal opcode> run : (Lburp/Zgwx;Ljavafx/collections/ObservableList;)Ljava/lang/Runnable;
    //   130: invokestatic ZO : (Ljava/lang/Runnable;)V
    //   133: aload #5
    //   135: ifnonnull -> 145
    //   138: iconst_3
    //   139: anewarray burp/Zbqc
    //   142: invokestatic Zr : ([Lburp/Zbqc;)V
    //   145: return
  }
  
  public boolean Zr(int paramInt) {
    synchronized (this.Zg) {
      return this.Zf.contains(Integer.valueOf(paramInt));
    } 
  }
  
  public void ZB(Runnable paramRunnable) {
    this.ZM.add(paramRunnable);
  }
  
  public void Zq(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zc : Lburp/Zgra;
    //   4: aload_0
    //   5: iload_1
    //   6: iload_2
    //   7: <illegal opcode> run : (Lburp/Zgwx;II)Ljava/lang/Runnable;
    //   12: invokeinterface ZB : (Ljava/lang/Object;)V
    //   17: aload_0
    //   18: getfield Zc : Lburp/Zgra;
    //   21: invokeinterface Zv : ()V
    //   26: return
  }
  
  public void ZI(Zln7<T> paramZln7) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Ljava/lang/Object;
    //   4: dup
    //   5: astore_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield Zs : Lburp/Zxwk;
    //   11: invokevirtual Zj : ()V
    //   14: aload_0
    //   15: getfield ZA : Ljava/util/concurrent/Future;
    //   18: ifnull -> 32
    //   21: aload_0
    //   22: getfield ZA : Ljava/util/concurrent/Future;
    //   25: iconst_1
    //   26: invokeinterface cancel : (Z)Z
    //   31: pop
    //   32: aload_0
    //   33: aload_0
    //   34: aload_1
    //   35: <illegal opcode> run : (Lburp/Zgwx;Lburp/Zln7;)Ljava/lang/Runnable;
    //   40: invokestatic ZM : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   43: putfield ZA : Ljava/util/concurrent/Future;
    //   46: aload_2
    //   47: monitorexit
    //   48: goto -> 56
    //   51: astore_3
    //   52: aload_2
    //   53: monitorexit
    //   54: aload_3
    //   55: athrow
    //   56: return
    // Exception table:
    //   from	to	target	type
    //   7	48	51	finally
    //   51	54	51	finally
  }
  
  public void Zb() {
    synchronized (this.ZG) {
      this.Zo = false;
    } 
  }
  
  public void ZV() {
    this.Zc.ZB(this::lambda$finishFilterBatch$3);
    this.Zc.Zv();
  }
  
  private Zgra<Runnable> Zq() {
    return new Zxnd<>(this::lambda$createFilterQueueBatchHandler$5, Zgwx::lambda$createFilterQueueBatchHandler$6);
  }
  
  private void Zt() {
    this.Zn.addListener(new Zx4a<>(this.ZO, this.Zc));
  }
  
  private void ZG(long paramLong) {
    // Byte code:
    //   0: invokestatic Zk : ()[I
    //   3: astore_3
    //   4: lload_1
    //   5: lconst_0
    //   6: lcmp
    //   7: ifgt -> 34
    //   10: new burp/Zxnd
    //   13: dup
    //   14: aload_0
    //   15: <illegal opcode> execute : (Lburp/Zgwx;)Ljava/util/concurrent/Executor;
    //   20: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   25: invokespecial <init> : (Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V
    //   28: astore #4
    //   30: aload_3
    //   31: ifnonnull -> 60
    //   34: new burp/Ztdp
    //   37: dup
    //   38: aload_0
    //   39: <illegal opcode> execute : (Lburp/Zgwx;)Ljava/util/concurrent/Executor;
    //   44: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   49: lload_1
    //   50: <illegal opcode> getAsLong : (J)Ljava/util/function/LongSupplier;
    //   55: invokespecial <init> : (Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;Ljava/util/function/LongSupplier;)V
    //   58: astore #4
    //   60: aload_0
    //   61: getfield ZP : Ljavafx/collections/transformation/FilteredList;
    //   64: new burp/Zzn_
    //   67: dup
    //   68: aload_0
    //   69: aload #4
    //   71: new burp/Zgwf
    //   74: dup
    //   75: aload_0
    //   76: invokespecial <init> : (Lburp/Zgwx;)V
    //   79: invokespecial <init> : (Lburp/Zgwx;Lburp/Zgra;Lburp/Zgc;)V
    //   82: invokevirtual addListener : (Ljavafx/collections/ListChangeListener;)V
    //   85: return
  }
  
  private static long lambda$initialiseFilteredElementMapping$13(long paramLong) {
    return paramLong;
  }
  
  private static void lambda$initialiseFilteredElementMapping$12(List<Runnable> paramList) {
    if (!paramList.isEmpty())
      ((Runnable)paramList.getLast()).run(); 
  }
  
  private void lambda$initialiseFilteredElementMapping$11(Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zgwx;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    //   7: invokestatic ZM : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   10: pop
    //   11: return
  }
  
  private void lambda$initialiseFilteredElementMapping$10(Runnable paramRunnable) {
    this.Zs.ZS(paramRunnable);
  }
  
  private static void lambda$initialiseFilteredElementMapping$9(List<Runnable> paramList) {
    if (!paramList.isEmpty())
      ((Runnable)paramList.getLast()).run(); 
  }
  
  private void lambda$initialiseFilteredElementMapping$8(Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zgwx;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    //   7: invokestatic ZM : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   10: pop
    //   11: return
  }
  
  private void lambda$initialiseFilteredElementMapping$7(Runnable paramRunnable) {
    this.Zs.ZS(paramRunnable);
  }
  
  private static void lambda$createFilterQueueBatchHandler$6(List paramList) {
    paramList.forEach(Runnable::run);
  }
  
  private void lambda$createFilterQueueBatchHandler$5(Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Ljava/lang/Object;
    //   4: dup
    //   5: astore_2
    //   6: monitorenter
    //   7: aload_0
    //   8: aload_1
    //   9: <illegal opcode> run : (Lburp/Zgwx;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    //   14: invokestatic ZM : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   17: pop
    //   18: aload_2
    //   19: monitorexit
    //   20: goto -> 28
    //   23: astore_3
    //   24: aload_2
    //   25: monitorexit
    //   26: aload_3
    //   27: athrow
    //   28: return
    // Exception table:
    //   from	to	target	type
    //   7	20	23	finally
    //   23	26	23	finally
  }
  
  private void lambda$createFilterQueueBatchHandler$4(Runnable paramRunnable) {
    this.Zs.ZS(paramRunnable);
  }
  
  private void lambda$finishFilterBatch$3() {
    if (!this.Zo)
      this.ZM.forEach(Runnable::run); 
    this.Zo = false;
  }
  
  private void lambda$filter$2(Zln7<T> paramZln7) {
    this.Zs.ZX(paramZln7);
  }
  
  private void lambda$fireRowsUpdated$1(int paramInt1, int paramInt2) {
    int i = this.ZO.size();
    int j = paramInt1;
    int[] arrayOfInt = Zgxr.Zk();
    while (j <= paramInt2) {
      if (j < i) {
        Object object = this.ZO.get(j);
        this.ZO.set(j, object);
      } 
      j++;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private void lambda$new$0(ObservableList paramObservableList) {
    // Byte code:
    //   0: invokestatic Zk : ()[I
    //   3: aload_0
    //   4: getfield Zg : Ljava/lang/Object;
    //   7: dup
    //   8: astore_3
    //   9: monitorenter
    //   10: astore_2
    //   11: aload_1
    //   12: invokeinterface size : ()I
    //   17: istore #4
    //   19: iconst_0
    //   20: istore #5
    //   22: iload #5
    //   24: iload #4
    //   26: if_icmpge -> 51
    //   29: aload_0
    //   30: getfield Zf : Ljava/util/Set;
    //   33: iload #5
    //   35: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   38: invokeinterface add : (Ljava/lang/Object;)Z
    //   43: pop
    //   44: iinc #5, 1
    //   47: aload_2
    //   48: ifnonnull -> 22
    //   51: aload_3
    //   52: monitorexit
    //   53: goto -> 63
    //   56: astore #6
    //   58: aload_3
    //   59: monitorexit
    //   60: aload #6
    //   62: athrow
    //   63: return
    // Exception table:
    //   from	to	target	type
    //   11	53	56	finally
    //   56	60	56	finally
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgwx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */