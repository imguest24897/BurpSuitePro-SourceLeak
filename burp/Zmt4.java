package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

public class Zmt4<T> implements Zln7<T> {
  private final Predicate<T> Zv;
  
  private final AtomicBoolean ZB;
  
  private final AtomicBoolean Zl;
  
  private final List<Zgc<T>> Ze;
  
  public Zmt4(Predicate<T> paramPredicate) {
    this.Zv = paramPredicate;
    this.ZB = new AtomicBoolean();
    int[] arrayOfInt = Zgxr.Zk();
    this.Zl = new AtomicBoolean();
    this.Ze = new CopyOnWriteArrayList<>();
    Zb(new Zgw8(this));
    if (Zbqc.Zwu() == null)
      Zgxr.Zn(new int[3]); 
  }
  
  public Predicate<T> Zx() {
    return this.Zv;
  }
  
  public boolean Zv() {
    return this.ZB.get();
  }
  
  public boolean ZI() {
    return this.Zl.get();
  }
  
  public void ZH() {
    this.Zl.set(true);
  }
  
  public void Zb(Zgc<T> paramZgc) {
    this.Ze.add(paramZgc);
  }
  
  public void ZA(Zgc<T> paramZgc) {
    this.Ze.remove(paramZgc);
  }
  
  public void Zf() {
    this.Ze.forEach(Zgc::ZH);
  }
  
  public void ZX(int paramInt, T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Ze : Ljava/util/List;
    //   4: iload_1
    //   5: aload_2
    //   6: <illegal opcode> accept : (ILjava/lang/Object;)Ljava/util/function/Consumer;
    //   11: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   16: return
  }
  
  public void ZA(int paramInt) {
    this.Ze.forEach(paramInt::lambda$fireElementRemoved$1);
  }
  
  public void ZN() {
    this.Ze.forEach(Zgc::Za);
  }
  
  private static void lambda$fireElementRemoved$1(int paramInt, Zgc paramZgc) {
    paramZgc.Zd(paramInt);
  }
  
  private static void lambda$fireElementFiltered$0(int paramInt, Object paramObject, Zgc<Object> paramZgc) {
    paramZgc.Zy(paramInt, paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmt4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */