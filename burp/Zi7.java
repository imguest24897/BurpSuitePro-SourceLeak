package burp;

import java.util.function.Supplier;

public class Zi7 {
  private final Supplier<Zl04> Zl;
  
  private final Supplier<Runnable> ZY;
  
  private Zi7() {
    this(Zi7::lambda$new$0, Zi7::lambda$new$2);
  }
  
  public Zi7(Supplier<Zl04> paramSupplier, Supplier<Runnable> paramSupplier1) {
    this.Zl = paramSupplier;
    this.ZY = paramSupplier1;
  }
  
  boolean Zw() {
    return (this.Zl.get() != null && this.ZY.get() != null);
  }
  
  private static Runnable lambda$new$2() {
    return Zi7::lambda$new$1;
  }
  
  private static void lambda$new$1() {}
  
  private static Zl04 lambda$new$0() {
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zi7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */