package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import javax.swing.SwingUtilities;

class Zlw2<T extends Zd7> {
  private final Supplier<Zxet<T>> ZZ;
  
  private final List<Zr0r<T>> Zz;
  
  private final Object Zu;
  
  private Zlw2(Supplier<Zxet<T>> paramSupplier) {
    this.ZZ = paramSupplier;
    this.Zz = new ArrayList<>();
    this.Zu = new Object();
  }
  
  private Zxer ZF(T paramT) {
    synchronized (this.Zu) {
      Zr0r<T> zr0r = this.Zz.stream().filter(Zr0r::ZX).findFirst().orElseGet(this::lambda$display$0);
      return zr0r.Zf(paramT);
    } 
  }
  
  private void Zz() {
    synchronized (this.Zu) {
      this.Zz.forEach(Zr0r::ZC);
    } 
  }
  
  private void Zg() {
    synchronized (this.Zu) {
      this.Zz.stream().map(Zr0r::Za).filter(Zlw2::lambda$updateUI$1).forEach(SwingUtilities::updateComponentTreeUI);
    } 
  }
  
  private static boolean lambda$updateUI$1(Zxet paramZxet) {
    return (paramZxet.getParent() == null);
  }
  
  private Zr0r lambda$display$0() {
    Zr0r<Zd7> zr0r = new Zr0r<>((Zxet<Zd7>)this.ZZ.get());
    this.Zz.add(zr0r);
    return zr0r;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlw2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */