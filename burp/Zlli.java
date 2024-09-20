package burp;

import java.util.concurrent.Executor;
import java.util.function.Consumer;

public interface Zlli<E extends Zt3y> {
  default <T> Zgrn ZE(Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer) throws Zz_h {
    return Zo(paramZlnb, paramConsumer, Runnable::run, Zrij.Zx);
  }
  
  default <T> Zgrn ZO(Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer, Zrij paramZrij) throws Zz_h {
    return Zo(paramZlnb, paramConsumer, Runnable::run, paramZrij);
  }
  
  default <T> Zgrn Zb(Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer, Executor paramExecutor) throws Zz_h {
    return Zo(paramZlnb, paramConsumer, paramExecutor, Zrij.Zx);
  }
  
  <T> Zgrn Zo(Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer, Executor paramExecutor, Zrij paramZrij) throws Zz_h;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlli.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */