package burp;

import java.util.function.Supplier;
import net.portswigger.Zg_;

public class Zrdl<T extends Zg_> {
  private final Supplier<T> Zn;
  
  private T Z_;
  
  Zrdl(Supplier<T> paramSupplier) {
    this.Zn = paramSupplier;
  }
  
  public T ZO() {
    return (this.Z_ != null) ? this.Z_ : (this.Z_ = this.Zn.get());
  }
  
  public void Zz() {
    if (this.Z_ != null)
      this.Z_.Zz(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrdl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */