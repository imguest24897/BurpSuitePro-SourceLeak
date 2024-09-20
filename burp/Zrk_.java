package burp;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zrk_ {
  private final Ztz_ ZN;
  
  private final Supplier<Zes1> Zn;
  
  private final Zskh ZS;
  
  public Zrk_(Ztz_ paramZtz_, Supplier<Zes1> paramSupplier, Zskh paramZskh) {
    this.ZN = paramZtz_;
    this.Zn = paramSupplier;
    this.ZS = paramZskh;
  }
  
  public List<Zer0> ZO() {
    try {
      return this.ZN.ZY(this.Zn.get());
    } catch (Zxgt|java.io.IOException zxgt) {
      Zah.Zl(zxgt, Zk_.COMMON_RUNTIME_FAILURE);
      Zmgc.COLLABORATOR_UNREACHABLE.ZV(this.ZS, new Object[0]);
      return Collections.emptyList();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrk_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */