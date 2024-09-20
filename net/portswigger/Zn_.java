package net.portswigger;

import java.util.HashMap;
import java.util.Map;

public class Zn_ implements Zf7 {
  private final Zf7 Zb;
  
  private final Map<Zat, Zu0> ZZ = new HashMap<>();
  
  public Zn_(Zf7 paramZf7) {
    this.Zb = paramZf7;
  }
  
  public Zu0 Zl(Zz0 paramZz0, Zat paramZat, Zsv paramZsv) {
    Zu0 zu0 = this.ZZ.get(paramZat);
    if (zu0 != null)
      return zu0; 
    synchronized (this.ZZ) {
      Zu0 zu01 = this.ZZ.get(paramZat);
      if (zu01 != null)
        return zu01; 
      Zu0 zu02 = this.Zb.Zl(paramZz0, paramZat, paramZsv);
      if (zu02 == null || (zu02.ZD >= 200 && zu02.ZD < 400))
        this.ZZ.put(paramZat, zu02); 
      return zu02;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zn_.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */