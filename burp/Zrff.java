package burp;

import java.util.List;
import java.util.function.Consumer;

public class Zrff implements Zky<Zzh2> {
  private final Zm6x Ze;
  
  public Zrff(Zm6x paramZm6x) {
    this.Ze = paramZm6x;
  }
  
  public Zmt5<?> ZI(Consumer<List<Zzh2>> paramConsumer) {
    return this.Ze.ZO(Zt4d.class, Zehw.ASYNC, paramConsumer::lambda$registerHistoryEventSubscriber$0);
  }
  
  public Zmt5<?> Zb(Consumer<Zzh2> paramConsumer) {
    return this.Ze.ZO(Zluv.class, Zehw.ASYNC, paramConsumer::lambda$registerInterceptedEventSubscriber$1);
  }
  
  private static void lambda$registerInterceptedEventSubscriber$1(Consumer<Zzh2> paramConsumer, Zluv paramZluv) {
    Zmw9<?> zmw9 = paramZluv.Zsq();
    if (zmw9 instanceof Zzh2) {
      Zzh2 zzh2 = (Zzh2)zmw9;
      paramConsumer.accept(zzh2);
    } 
  }
  
  private static void lambda$registerHistoryEventSubscriber$0(Consumer<List<Zzh2>> paramConsumer, Zt4d paramZt4d) {
    paramConsumer.accept(paramZt4d.ZYj());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrff.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */