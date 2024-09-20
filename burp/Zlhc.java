package burp;

import java.awt.Component;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.swing.JTabbedPane;
import net.portswigger.Zm2;

class Zlhc implements Zz9w {
  private final Zl3r ZA = new Zl3r();
  
  final Function ZM;
  
  final Supplier ZI;
  
  Zlhc(Zxr paramZxr, Function paramFunction, Supplier paramSupplier) {}
  
  public boolean ZG(JTabbedPane paramJTabbedPane, int paramInt1, Zxer paramZxer, int paramInt2) {
    if (Objects.equals(paramJTabbedPane, paramZxer))
      return this.ZA.ZG(paramJTabbedPane, paramInt1, paramZxer, paramInt2); 
    if (paramInt2 < 0)
      return false; 
    Component component = paramJTabbedPane.getComponentAt(paramInt1);
    return (this.ZM.apply(component) != null);
  }
  
  public boolean ZS(JTabbedPane paramJTabbedPane, int paramInt1, Zxer paramZxer, int paramInt2) {
    if (Objects.equals(paramJTabbedPane, paramZxer))
      return this.ZA.ZS(paramJTabbedPane, paramInt1, paramZxer, paramInt2); 
    Component component = paramJTabbedPane.getComponentAt(paramInt1);
    Zl5t zl5t = this.ZM.apply(component);
    if (zl5t != null) {
      if (!zl5t.Zz())
        Zq9.Zv(zl5t).ifPresent(Zm2::ZC); 
      zl5t.Zk(this.ZI.get());
      int i = paramZxer.indexOfComponent(component);
      if (i != paramInt2) {
        int j = (i < paramInt2) ? (paramInt2 + 1) : paramInt2;
        paramZxer.Zi(i, j);
      } 
      paramZxer.setSelectedComponent(component);
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlhc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */