package net.portswigger;

import java.util.HashSet;
import java.util.Set;

public class Zxj extends Zbk {
  private final Set<Zbv> ZG = new HashSet<>();
  
  private Zdh ZX;
  
  public Zdh ZY() {
    return this.ZX;
  }
  
  public void ZI(Zdh paramZdh) {
    this.ZX = paramZdh;
  }
  
  public Set<Zbv> Z_() {
    return this.ZG.isEmpty() ? Set.<Zbv>of(Zbv.ANY) : this.ZG;
  }
  
  public void Zm(Zbv paramZbv) {
    this.ZG.add(paramZbv);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zxj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */