package net.portswigger;

import java.util.HashSet;
import java.util.Set;

public class Z_w extends Z_y {
  private final Set<Zb7> Zq = new HashSet<>();
  
  private Zgf ZP;
  
  public Zgf ZM() {
    return this.ZP;
  }
  
  public void Zy(Zgf paramZgf) {
    this.ZP = paramZgf;
  }
  
  public Set<Zb7> ZX() {
    return this.Zq.isEmpty() ? Set.<Zb7>of(Zb7.ANY) : this.Zq;
  }
  
  public void ZA(Zb7 paramZb7) {
    this.Zq.add(paramZb7);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */