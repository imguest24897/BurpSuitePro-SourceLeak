package burp;

import java.util.Optional;
import net.portswigger.Zm2;

public class Zgwt extends Zgwm {
  public Zgwt() {
    super(Zze0.INTRUDER_PAYLOADS_ECB_BLOCK_SHUFFLER, Zv8r.INTRUDER_ECB_BLOCK_SHUFFLER_PAYLOADS_COUNT);
  }
  
  public void Zy(Ze9k paramZe9k) {
    super.Zy(paramZe9k);
    if (paramZe9k instanceof Z_2) {
      Z_2 z_2 = (Z_2)paramZe9k;
      int i = ((Integer)Optional.<String>ofNullable(z_2.ZFo()).map(String::length).orElse(Integer.valueOf(-1))).intValue();
      Zm2.Zi(Zv8r.INTRUDER_ECB_BLOCK_SHUFFLER_BASE_STRING_LENGTH, i);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgwt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */