package net.portswigger;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Zoq<T> {
  private final Supplier<T> Zb;
  
  private T Zd;
  
  private Zoq(Supplier<T> paramSupplier) {
    this.Zb = paramSupplier;
  }
  
  public static <T> Zoq<T> ZZ(Supplier<T> paramSupplier) {
    return new Zoq<>(paramSupplier);
  }
  
  public T Zz() {
    if (this.Zd == null)
      this.Zd = this.Zb.get(); 
    return this.Zd;
  }
  
  public void ZV(Consumer<T> paramConsumer) {
    if (this.Zd != null)
      paramConsumer.accept(this.Zd); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zoq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */