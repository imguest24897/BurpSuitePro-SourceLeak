package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javafx.collections.transformation.FilteredList;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zxwk<T> {
  private final FilteredList<T> ZN;
  
  private final Object Zb;
  
  private final List<Zgc<T>> Zh;
  
  private Zln7<T> ZI;
  
  private boolean ZD;
  
  private Zxwk(FilteredList<T> paramFilteredList) {
    this.ZN = paramFilteredList;
    this.Zb = new Object();
    this.Zh = new CopyOnWriteArrayList<>();
  }
  
  public void ZX(Zln7<T> paramZln7) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zb : Ljava/lang/Object;
    //   4: dup
    //   5: astore_2
    //   6: monitorenter
    //   7: invokestatic currentThread : ()Ljava/lang/Thread;
    //   10: invokevirtual isInterrupted : ()Z
    //   13: ifeq -> 19
    //   16: aload_2
    //   17: monitorexit
    //   18: return
    //   19: aload_0
    //   20: aload_1
    //   21: putfield ZI : Lburp/Zln7;
    //   24: aload_0
    //   25: iconst_0
    //   26: putfield ZD : Z
    //   29: aload_0
    //   30: invokevirtual ZM : ()V
    //   33: aload_1
    //   34: ifnonnull -> 56
    //   37: aload_0
    //   38: getfield ZN : Ljavafx/collections/transformation/FilteredList;
    //   41: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   46: invokevirtual setPredicate : (Ljava/util/function/Predicate;)V
    //   49: aload_0
    //   50: invokevirtual Zy : ()V
    //   53: aload_2
    //   54: monitorexit
    //   55: return
    //   56: aload_0
    //   57: getfield ZN : Ljavafx/collections/transformation/FilteredList;
    //   60: aload_0
    //   61: aload_1
    //   62: <illegal opcode> test : (Lburp/Zxwk;Lburp/Zln7;)Ljava/util/function/Predicate;
    //   67: invokevirtual setPredicate : (Ljava/util/function/Predicate;)V
    //   70: aload_0
    //   71: invokevirtual Zy : ()V
    //   74: goto -> 84
    //   77: astore_3
    //   78: aload_0
    //   79: invokevirtual Zy : ()V
    //   82: aload_3
    //   83: athrow
    //   84: aload_2
    //   85: monitorexit
    //   86: goto -> 96
    //   89: astore #4
    //   91: aload_2
    //   92: monitorexit
    //   93: aload #4
    //   95: athrow
    //   96: return
    // Exception table:
    //   from	to	target	type
    //   7	18	89	finally
    //   19	55	89	finally
    //   33	49	77	finally
    //   56	70	77	finally
    //   56	86	89	finally
    //   89	93	89	finally
  }
  
  public void ZS(Runnable paramRunnable) {
    synchronized (this.Zb) {
      paramRunnable.run();
    } 
  }
  
  private void ZM() {
    this.Zh.forEach(Zgc::ZH);
    if (this.ZI != null)
      this.ZI.Zf(); 
  }
  
  private void Zi(int paramInt, T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zh : Ljava/util/List;
    //   4: iload_1
    //   5: aload_2
    //   6: <illegal opcode> accept : (ILjava/lang/Object;)Ljava/util/function/Consumer;
    //   11: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   16: aload_0
    //   17: getfield ZI : Lburp/Zln7;
    //   20: ifnull -> 34
    //   23: aload_0
    //   24: getfield ZI : Lburp/Zln7;
    //   27: iload_1
    //   28: aload_2
    //   29: invokeinterface ZX : (ILjava/lang/Object;)V
    //   34: return
  }
  
  private void ZU(int paramInt) {
    this.Zh.forEach(paramInt::lambda$fireElementRemoved$3);
    if (this.ZI != null)
      this.ZI.ZA(paramInt); 
  }
  
  private void Zy() {
    this.Zh.forEach(Zgc::Za);
    if (this.ZI != null)
      this.ZI.ZN(); 
  }
  
  private int[] Zw() {
    // Byte code:
    //   0: invokestatic Zk : ()[I
    //   3: aload_0
    //   4: getfield Zb : Ljava/lang/Object;
    //   7: dup
    //   8: astore_2
    //   9: monitorenter
    //   10: astore_1
    //   11: aload_0
    //   12: getfield ZN : Ljavafx/collections/transformation/FilteredList;
    //   15: invokevirtual size : ()I
    //   18: istore_3
    //   19: iload_3
    //   20: newarray int
    //   22: astore #4
    //   24: iconst_0
    //   25: istore #5
    //   27: iload #5
    //   29: iload_3
    //   30: if_icmpge -> 58
    //   33: aload_0
    //   34: getfield ZN : Ljavafx/collections/transformation/FilteredList;
    //   37: iload #5
    //   39: invokevirtual getSourceIndex : (I)I
    //   42: istore #6
    //   44: aload #4
    //   46: iload #5
    //   48: iload #6
    //   50: iastore
    //   51: iinc #5, 1
    //   54: aload_1
    //   55: ifnonnull -> 27
    //   58: aload #4
    //   60: aload_2
    //   61: monitorexit
    //   62: areturn
    //   63: astore #7
    //   65: aload_2
    //   66: monitorexit
    //   67: aload #7
    //   69: athrow
    // Exception table:
    //   from	to	target	type
    //   11	62	63	finally
    //   63	67	63	finally
  }
  
  public void Zj() {
    this.ZD = true;
  }
  
  public boolean ZP() {
    return this.ZD;
  }
  
  private static void lambda$fireElementRemoved$3(int paramInt, Zgc paramZgc) {
    paramZgc.Zd(paramInt);
  }
  
  private static void lambda$fireElementFiltered$2(int paramInt, Object paramObject, Zgc<Object> paramZgc) {
    paramZgc.Zy(paramInt, paramObject);
  }
  
  private boolean lambda$filter$1(Zln7<Object> paramZln7, Object paramObject) {
    synchronized (this.Zb) {
      if (paramZln7.Zv()) {
        try {
          if (!paramZln7.ZI()) {
            if (!this.ZD)
              try {
                return paramZln7.Zx().test(paramObject);
              } catch (Throwable throwable) {
                Zah.Zl(throwable, Zk_.USER_ERROR);
                return false;
              }  
            return false;
          } 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        return false;
      } 
      if (!this.ZD)
        try {
          return paramZln7.Zx().test(paramObject);
        } catch (Throwable throwable) {
          Zah.Zl(throwable, Zk_.USER_ERROR);
          return false;
        }  
      return false;
    } 
  }
  
  private static boolean lambda$filter$0(Object paramObject) {
    return true;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxwk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */