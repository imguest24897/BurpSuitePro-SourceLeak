package burp;

import java.awt.Component;
import java.util.Objects;
import javax.swing.JTabbedPane;
import net.portswigger.Zm2;

class Zk7h implements Zz9w {
  private final Zl3r Zx = new Zl3r();
  
  final Zsti ZZ;
  
  Zk7h(Zsti paramZsti) {}
  
  public boolean ZG(JTabbedPane paramJTabbedPane, int paramInt1, Zxer paramZxer, int paramInt2) {
    if (Objects.equals(paramJTabbedPane, paramZxer))
      return this.Zx.ZG(paramJTabbedPane, paramInt1, paramZxer, paramInt2); 
    if (paramInt2 < 0)
      return false; 
    Component component = paramJTabbedPane.getComponentAt(paramInt1);
    return this.ZZ.Zt(component).isPresent();
  }
  
  public boolean ZS(JTabbedPane paramJTabbedPane, int paramInt1, Zxer paramZxer, int paramInt2) {
    if (Objects.equals(paramJTabbedPane, paramZxer))
      return this.Zx.ZS(paramJTabbedPane, paramInt1, paramZxer, paramInt2); 
    Component component = paramJTabbedPane.getComponentAt(paramInt1);
    Zl5t zl5t = this.ZZ.Zt(component).orElse(null);
    if (zl5t != null && zl5t.Zz()) {
      zl5t.Zk(null);
      int i = paramZxer.indexOfComponent(component);
      if (i != paramInt2) {
        int j = (i < paramInt2) ? (paramInt2 + 1) : paramInt2;
        paramZxer.Zi(i, j);
      } 
      paramZxer.setSelectedComponent(component);
      Zq9.Z_(zl5t).ifPresent(Zm2::ZC);
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk7h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */