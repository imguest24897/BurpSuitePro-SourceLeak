package burp;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Zl1b implements Zs9h {
  private final Supplier<Zgsq> Zg;
  
  private final Consumer<Zgsq> Zo;
  
  public Zl1b(Supplier<Zgsq> paramSupplier, Consumer<Zgsq> paramConsumer) {
    this.Zg = paramSupplier;
    this.Zo = paramConsumer;
  }
  
  public Zgsq ZB() {
    return this.Zg.get();
  }
  
  public void ZG(Zgsq paramZgsq) {
    this.Zo.accept(paramZgsq);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl1b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */