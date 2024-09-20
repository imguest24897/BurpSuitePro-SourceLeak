package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Zts2 {
  private final AtomicBoolean Zp = new AtomicBoolean(true);
  
  private final List<Zgrn> Zi = new LinkedList<>();
  
  public static Zts2 Zr() {
    return new Zts2();
  }
  
  public <T> Zts2 Zz(Zlli<?> paramZlli, Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer) {
    return ZA(paramZlli, paramZlnb, paramConsumer, Zrij.Zx);
  }
  
  public <T> Zts2 ZA(Zlli<?> paramZlli, Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer, Zrij paramZrij) {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: aload_0
    //   3: aload_3
    //   4: <illegal opcode> accept : (Lburp/Zts2;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    //   9: aload #4
    //   11: invokeinterface ZO : (Lburp/Zlnb;Ljava/util/function/Consumer;Lburp/Zrij;)Lburp/Zgrn;
    //   16: astore #5
    //   18: aload_0
    //   19: getfield Zi : Ljava/util/List;
    //   22: aload #5
    //   24: invokeinterface add : (Ljava/lang/Object;)Z
    //   29: pop
    //   30: aload_0
    //   31: areturn
  }
  
  public <T> Zts2 Zv(Zlli<?> paramZlli, Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer) {
    return Zd(paramZlli, paramZlnb, paramConsumer, Zrij.Zx);
  }
  
  public <T> Zts2 Zd(Zlli<?> paramZlli, Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer, Zrij paramZrij) {
    return ZA(paramZlli, paramZlnb, paramConsumer, paramZrij);
  }
  
  public void Zo() {
    if (this.Zp.compareAndSet(true, false))
      Zn(); 
  }
  
  private void Zn() {
    this.Zi.forEach(Zgrn::ZZ);
    this.Zi.clear();
  }
  
  private void lambda$subscribingTo$0(Consumer<Zxr8> paramConsumer, Zxr8 paramZxr8) {
    if (this.Zp.compareAndSet(true, false)) {
      paramConsumer.accept(paramZxr8);
      Zn();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zts2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */