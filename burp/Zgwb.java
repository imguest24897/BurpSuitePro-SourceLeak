package burp;

import java.util.Optional;
import net.portswigger.Zm2;

public class Zgwb extends Zgwm {
  public Zgwb() {
    super(Zze0.INTRUDER_PAYLOADS_BIT_FLIPPER, Zv8r.INTRUDER_BIT_FLIPPER_PAYLOADS_COUNT);
  }
  
  public void Zy(Ze9k paramZe9k) {
    super.Zy(paramZe9k);
    if (paramZe9k instanceof Z__) {
      Z__ z__ = (Z__)paramZe9k;
      int i = ((Integer)Optional.<String>ofNullable(z__.ZKV()).map(String::length).orElse(Integer.valueOf(-1))).intValue();
      Zm2.Zi(Zv8r.INTRUDER_BIT_FLIPPER_BASE_STRING_LENGTH, i);
      Zm2.Zi(Zv8r.INTRUDER_BIT_FLIPPER_MASK_MODIFY_BITS, z__.ZKl());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgwb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */