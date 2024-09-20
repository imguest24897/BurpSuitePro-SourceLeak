package burp;

import java.awt.EventQueue;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import javafx.collections.ObservableList;
import javax.swing.SwingUtilities;

public class Zmuc<T> extends Zmua<T> implements Zlm8<T> {
  private final Zgwx<T> ZH;
  
  private final AtomicBoolean Zx = new AtomicBoolean();
  
  private Zln7<T> Zt;
  
  private Predicate<T> ZS;
  
  private static Zbqc[] Zz;
  
  public Zmuc(Zmjx<T> paramZmjx, ObservableList<T> paramObservableList) {
    this(paramZmjx, paramObservableList, -1L);
  }
  
  public Zmuc(Zmjx<T> paramZmjx, ObservableList<T> paramObservableList, long paramLong) {
    super(paramZmjx, paramObservableList, paramLong);
    this.ZH = new Zgwx<>(this.Zl, paramLong, this.Z_);
    this.ZS = Zmuc::lambda$new$0;
    this.ZH.ZB(this::Zn);
  }
  
  public void fireTableDataChanged() {
    ZI(this.Zt);
  }
  
  public void Zd(T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zmuc;Ljava/lang/Object;)Ljava/lang/Runnable;
    //   7: invokestatic ZM : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   10: pop
    //   11: return
  }
  
  public void ZU() {
    ZE();
    fireTableDataChanged();
  }
  
  private void Zn() {
    if (this.Zx.compareAndSet(false, true))
      SwingUtilities.invokeLater(this::lambda$scheduleDataChanged$3); 
  }
  
  public void fireTableRowsUpdated(int paramInt1, int paramInt2) {
    super.fireTableRowsUpdated(paramInt1, paramInt2);
    this.ZH.Zq(paramInt1, paramInt2);
  }
  
  public void ZI(Zln7<T> paramZln7) {
    this.Zt = paramZln7;
    Zln7 zln7 = (Zln7)((paramZln7 == null) ? new Zmt4<>(this.ZS) : new Ztjj(this, paramZln7, paramZln7));
    this.ZH.ZI(zln7);
  }
  
  public boolean Zh(int paramInt) {
    return this.ZH.Zr(paramInt);
  }
  
  protected Zgra<Runnable> Zn(long paramLong) {
    return (Zgra<Runnable>)((paramLong > 0L) ? new Ztdp<>(EventQueue::invokeLater, new Zlz2(this), paramLong::lambda$createEventQueueBatchJob$4) : new Zxnd<>(EventQueue::invokeLater, new Zlz2(this)));
  }
  
  public void Zv(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> test : (Lburp/Zmuc;Ljava/lang/String;)Ljava/util/function/Predicate;
    //   8: putfield ZS : Ljava/util/function/Predicate;
    //   11: aload_0
    //   12: getfield Zt : Lburp/Zln7;
    //   15: astore_2
    //   16: aload_0
    //   17: getfield Zt : Lburp/Zln7;
    //   20: ifnull -> 56
    //   23: aload_0
    //   24: getfield Zt : Lburp/Zln7;
    //   27: invokeinterface ZI : ()Z
    //   32: ifeq -> 56
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: aload_0
    //   43: aload_0
    //   44: getfield Zt : Lburp/Zln7;
    //   47: invokeinterface Zx : ()Ljava/util/function/Predicate;
    //   52: invokevirtual Zy : (Ljava/util/function/Predicate;)Lburp/Zeaz;
    //   55: astore_2
    //   56: aload_0
    //   57: aload_2
    //   58: invokevirtual ZI : (Lburp/Zln7;)V
    //   61: goto -> 72
    //   64: astore_2
    //   65: aload_2
    //   66: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   69: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   72: return
    // Exception table:
    //   from	to	target	type
    //   0	61	64	java/lang/Exception
    //   16	35	38	java/lang/Exception
  }
  
  private Zeaz<T> Zy(Predicate<T> paramPredicate) {
    List<T> list1 = Zz();
    Objects.requireNonNull(list1);
    List<T> list2 = IntStream.range(0, list1.size()).filter(this::Zh).mapToObj(list1::get).toList();
    return new Zeaz<>(paramPredicate, list1, list2);
  }
  
  private boolean lambda$search$5(String paramString, Object paramObject) {
    if (paramString == null || paramString.isEmpty())
      return true; 
    Zgzj<T> zgzj = (Zgzj)paramObject;
    return zgzj.Zd(this.ZM, paramString);
  }
  
  private static long lambda$createEventQueueBatchJob$4(long paramLong) {
    return paramLong;
  }
  
  private void lambda$scheduleDataChanged$3() {
    this.Zx.set(false);
    ZB();
  }
  
  private void lambda$fireElementUpdated$2(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z_ : Lburp/Zxr3;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> getAsInt : (Lburp/Zmuc;Ljava/lang/Object;)Ljava/util/function/IntSupplier;
    //   11: invokevirtual ZL : (Ljava/util/function/IntSupplier;)I
    //   14: istore_2
    //   15: iload_2
    //   16: iconst_m1
    //   17: if_icmpeq -> 29
    //   20: aload_0
    //   21: getfield ZH : Lburp/Zgwx;
    //   24: iload_2
    //   25: iload_2
    //   26: invokevirtual Zq : (II)V
    //   29: return
  }
  
  private int lambda$fireElementUpdated$1(Object paramObject) {
    return this.Zl.lastIndexOf(paramObject);
  }
  
  private static boolean lambda$new$0(Object paramObject) {
    return true;
  }
  
  static Zxr3 ZZ(Zmuc paramZmuc) {
    return paramZmuc.Z_;
  }
  
  public static void Zd(Zbqc[] paramArrayOfZbqc) {
    Zz = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZA() {
    return Zz;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    if (ZA() != null)
      Zd(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmuc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */