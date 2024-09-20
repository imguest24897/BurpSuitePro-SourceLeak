package burp;

import java.util.List;
import java.util.function.Consumer;

public class Zgf4 implements Zky<Zeo2> {
  private final Zm6x ZM;
  
  public Zgf4(Zm6x paramZm6x) {
    this.ZM = paramZm6x;
  }
  
  public Zmt5<?> ZI(Consumer<List<Zeo2>> paramConsumer) {
    return this.ZM.ZO(Zg4r.class, Zehw.ASYNC, paramConsumer::lambda$registerHistoryEventSubscriber$0);
  }
  
  public Zmt5<?> Zb(Consumer<Zeo2> paramConsumer) {
    return this.ZM.ZO(Zluv.class, Zehw.ASYNC, paramConsumer::lambda$registerInterceptedEventSubscriber$1);
  }
  
  private static void lambda$registerInterceptedEventSubscriber$1(Consumer<Zeo2> paramConsumer, Zluv paramZluv) {
    Zmw9<?> zmw9 = paramZluv.Zsq();
    if (zmw9 instanceof Zeo2) {
      Zeo2 zeo2 = (Zeo2)zmw9;
      paramConsumer.accept(zeo2);
    } 
  }
  
  private static void lambda$registerHistoryEventSubscriber$0(Consumer<List<Zeo2>> paramConsumer, Zg4r paramZg4r) {
    paramConsumer.accept(paramZg4r.Ziv());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgf4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */