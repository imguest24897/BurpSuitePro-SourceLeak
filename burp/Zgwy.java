package burp;

import net.portswigger.Zm2;

public class Zgwy extends Zgwm {
  public Zgwy() {
    super(Zze0.INTRUDER_PAYLOADS_ILLEGAL_UNICODE, Zv8r.INTRUDER_ILLEGAL_UNICODE_PAYLOADS_COUNT);
  }
  
  public void Zy(Ze9k paramZe9k) {
    super.Zy(paramZe9k);
    if (paramZe9k instanceof Z_h) {
      Z_h z_h = (Z_h)paramZe9k;
      Zm2.Zi(Zv8r.INTRUDER_ILLEGAL_UNICODE_ITEMS_COUNT, z_h.Zgl().size());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgwy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */