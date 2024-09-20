package burp;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmse {
  private static int Zq;
  
  public static void Zf(Component paramComponent, int paramInt1, int paramInt2) {
    paramComponent.setPreferredSize(new Dimension((int)(Zrt.ZH() * paramInt1), (int)(Zrt.Zx() * paramInt2)));
  }
  
  public static void Zb(Component paramComponent, int paramInt) {
    paramComponent.setPreferredSize(new Dimension((int)(Zrt.ZH() * paramInt), (paramComponent.getPreferredSize()).height));
  }
  
  public static void ZF(Component paramComponent) {
    if (paramComponent == null)
      return; 
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    paramComponent.invalidate();
    paramComponent.validate();
    paramComponent.repaint();
  }
  
  public static void Zv(int paramInt) {
    Zq = paramInt;
  }
  
  public static int Ze() {
    return Zq;
  }
  
  public static int Zc() {
    int i = Ze();
    return (i == 0) ? 50 : 0;
  }
  
  static {
    if (Ze() != 0)
      Zv(101); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmse.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */