package burp;

import java.awt.Component;
import java.awt.Window;
import java.beans.PropertyChangeListener;
import javax.swing.SwingUtilities;

public interface Zzqk {
  String Zs();
  
  Zgp1 Zk();
  
  Component ZZ();
  
  default Window Zt() {
    return SwingUtilities.getWindowAncestor(ZZ());
  }
  
  default Zl04 Zg() {
    Window window = Zt();
    Zl04 zl04 = (Zl04)window;
    return (window instanceof Zl04) ? zl04 : null;
  }
  
  void ZJ(String paramString, PropertyChangeListener paramPropertyChangeListener);
  
  void Zi(String paramString, PropertyChangeListener paramPropertyChangeListener);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzqk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */