package burp;

import java.awt.Component;
import java.util.List;
import java.util.Optional;

class Ztb6 implements Zmgv {
  private final Zbws Zy;
  
  private final Zg09 ZY;
  
  public Ztb6(Zbws paramZbws, Zg09 paramZg09) {
    this.Zy = paramZbws;
    this.ZY = paramZg09;
  }
  
  public Zmzk Zod() {
    return Zp().<Zmzk>map(Zbza::Zg0).orElse(null);
  }
  
  public Zstu Zos() {
    return Zp().<Zstu>map(Zbza::Zgy).orElse(null);
  }
  
  public Zstu ZoO() {
    return Zp().<Zstu>map(Zbza::Zgz).orElse(null);
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public long ZoB() {
    return ((Long)Zp().<Long>map(Zbza::Zgw).orElse(Long.valueOf(0L))).longValue();
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zp().<Zmfj>map(Zbza::ZgW).orElse(null);
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return null;
  }
  
  private Optional<Zbza> Zp() {
    int i = this.Zy.getSelectedRow();
    return (i > 0) ? Optional.of(this.ZY.get(i)) : Optional.empty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztb6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */