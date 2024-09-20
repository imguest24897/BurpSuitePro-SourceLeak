package burp;

import java.util.Optional;
import net.portswigger.Zm2;

public class Zsvf implements Zez {
  public void Zy(Ze9k paramZe9k) {
    Zm2.Zo(Zze0.INTRUDER_PAYLOADS_CHARACTER_FROBBER);
    if (paramZe9k instanceof Z_s) {
      Z_s z_s = (Z_s)paramZe9k;
      int i = ((Integer)Optional.<String>ofNullable(z_s.Zk_()).map(String::length).orElse(Integer.valueOf(-1))).intValue();
      Zm2.Zi(Zv8r.INTRUDER_CHARACTER_FROBBER_BASE_STRING_LENGTH, i);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsvf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */