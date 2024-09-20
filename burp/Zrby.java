package burp;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

class Zrby {
  private final AtomicInteger Ze;
  
  private final Consumer<Integer> Zh;
  
  private Zrby(int paramInt, Consumer<Integer> paramConsumer) {
    this.Ze = new AtomicInteger(paramInt);
    this.Zh = paramConsumer;
    paramConsumer.accept(Integer.valueOf(this.Ze.get()));
  }
  
  void Zu(int paramInt) {
    ZG(this.Ze.updateAndGet(paramInt::lambda$increase$0));
  }
  
  void Zy(int paramInt) {
    ZG(this.Ze.updateAndGet(paramInt::lambda$decrease$1));
  }
  
  private void ZG(int paramInt) {
    this.Zh.accept(Integer.valueOf(paramInt));
  }
  
  private static int lambda$decrease$1(int paramInt1, int paramInt2) {
    return paramInt2 - paramInt1;
  }
  
  private static int lambda$increase$0(int paramInt1, int paramInt2) {
    return paramInt2 + paramInt1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrby.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */