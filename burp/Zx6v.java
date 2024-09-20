package burp;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

public class Zx6v<T> extends Zx67<T> {
  private final List<Zzkg> Zv = new CopyOnWriteArrayList<>();
  
  public Object put(T paramT, Object paramObject) {
    return this.Zw.put(paramT, Z_(paramObject));
  }
  
  public Object computeIfAbsent(T paramT, Function<? super T, ?> paramFunction) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zw : Ljava/util/concurrent/ConcurrentMap;
    //   4: aload_1
    //   5: aload_0
    //   6: aload_2
    //   7: <illegal opcode> apply : (Lburp/Zx6v;Ljava/util/function/Function;)Ljava/util/function/Function;
    //   12: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   17: areturn
  }
  
  private Object Z_(Object paramObject) {
    Object object = paramObject;
    if (paramObject instanceof Zsij) {
      Zsij zsij = (Zsij)paramObject;
      object = zsij.ZMm();
      this.Zv.forEach(zsij::lambda$extractThrowableAndNotifyErrorListeners$1);
    } 
    return object;
  }
  
  public void ZH(Zzkg paramZzkg) {
    Objects.requireNonNull(paramZzkg);
    this.Zw.values().stream().map(Zx6v::lambda$addListener$2).filter(Objects::nonNull).sorted(Comparator.comparing(Zsij::ZM2)).forEach(paramZzkg::Zn);
    this.Zv.add(paramZzkg);
  }
  
  public void Zf(Zzkg paramZzkg) {
    this.Zv.remove(paramZzkg);
  }
  
  private static Zsij lambda$addListener$2(Object paramObject) {
    Zsij zsij = (Zsij)paramObject;
    return (paramObject instanceof Zsij) ? zsij : null;
  }
  
  private static void lambda$extractThrowableAndNotifyErrorListeners$1(Zsij paramZsij, Zzkg paramZzkg) {
    paramZzkg.Zn(paramZsij);
  }
  
  private Object lambda$computeIfAbsent$0(Function paramFunction, Object paramObject) {
    return Z_(paramFunction.apply(paramObject));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx6v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */