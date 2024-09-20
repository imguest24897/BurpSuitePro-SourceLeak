package burp;

import net.portswigger.Zm2;

public class Zgwc extends Zgwm {
  public Zgwc() {
    super(Zze0.INTRUDER_PAYLOADS_CHARACTER_SUBSTITUTION, Zv8r.INTRUDER_CHARACTER_SUBSTITUTION_PAYLOADS_COUNT);
  }
  
  public void Zy(Ze9k paramZe9k) {
    super.Zy(paramZe9k);
    if (paramZe9k instanceof Z_3) {
      Z_3 z_3 = (Z_3)paramZe9k;
      Zm2.Zi(Zv8r.INTRUDER_CHARACTER_SUBSTITUTION_ITEMS_COUNT, z_3.ZnW().size());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgwc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */