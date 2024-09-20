package net.portswigger;

import java.util.Optional;
import org.openapi4j.Zph;

public class Zab {
  private final Zph Zx;
  
  public Zab(Zph paramZph) {
    this.Zx = Optional.<Zph>ofNullable(paramZph).orElse(new Zph());
  }
  
  public String ZL() {
    return this.Zx.getName();
  }
  
  public String ZQ() {
    return this.Zx.getNamespace();
  }
  
  public String Zw() {
    return this.Zx.getPrefix();
  }
  
  public Boolean Zy() {
    return Optional.<Boolean>ofNullable(this.Zx.getAttribute()).orElse(Boolean.valueOf(false));
  }
  
  public Boolean ZV() {
    return Optional.<Boolean>ofNullable(this.Zx.getWrapped()).orElse(Boolean.valueOf(false));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zab.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */