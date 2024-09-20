package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.function.Consumer;
import java.util.function.Supplier;

class Zlny<T> implements Zzie, Zg5b<T> {
  private final Collection<Zzrh<T>> Zw;
  
  private final Supplier<T> ZN;
  
  Zlny(Supplier<T> paramSupplier) {
    this.ZN = paramSupplier;
    this.Zw = new ArrayList<>();
  }
  
  public Zkbs Zf(EnumSet<Zgu3> paramEnumSet, Zl8t paramZl8t, Runnable paramRunnable, Consumer<Zge7> paramConsumer) {
    Zzrh<T> zzrh = new Zzrh<>(this.ZN, paramEnumSet, paramZl8t, paramRunnable, paramConsumer);
    this.Zw.add(zzrh);
    return zzrh;
  }
  
  public void ZY(T paramT) {
    this.Zw.forEach(paramT::lambda$clear$0);
  }
  
  private static void lambda$clear$0(Object paramObject, Zzrh<Object> paramZzrh) {
    paramZzrh.ZY(paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlny.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */