package burp;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;

public class Zve implements Zsau {
  private final Zz9q ZE;
  
  private final Supplier<Boolean> ZT;
  
  private final Zrgd ZH;
  
  public Zve(Zz9q paramZz9q, Supplier<Boolean> paramSupplier, Zrgd paramZrgd) {
    this.ZE = paramZz9q;
    this.ZT = paramSupplier;
    this.ZH = paramZrgd;
  }
  
  public boolean ZB() {
    if (((Boolean)this.ZT.get()).booleanValue())
      return true; 
    Instant instant = this.ZE.ZO();
    return (instant == null || this.ZH.Zn().isAfter(instant.plus(7L, ChronoUnit.DAYS)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zve.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */