package burp;

import net.portswigger.Zm2;

public class Zgwa extends Zgwm {
  public Zgwa() {
    super(Zze0.INTRUDER_PAYLOADS_CASE_MODIFICATION, Zv8r.INTRUDER_CASE_MODIFICATION_PAYLOADS_COUNT);
  }
  
  public void Zy(Ze9k paramZe9k) {
    super.Zy(paramZe9k);
    if (paramZe9k instanceof Z_4) {
      Z_4 z_4 = (Z_4)paramZe9k;
      Zm2.Zi(Zv8r.INTRUDER_CASE_MODIFICATION_ITEMS_COUNT, z_4.ZP7().size());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgwa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */