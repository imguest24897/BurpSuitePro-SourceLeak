package burp;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;

class Zmts extends Zmt4<Zzme> {
  final BooleanSupplier Zs;
  
  Zmts(Zmio paramZmio, Predicate<Zzme> paramPredicate, BooleanSupplier paramBooleanSupplier) {
    super(paramPredicate);
  }
  
  public boolean ZI() {
    return this.Zs.getAsBoolean();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmts.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */