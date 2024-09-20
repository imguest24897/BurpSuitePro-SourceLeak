package burp;

import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.event.FocusEvent;
import javax.swing.JPopupMenu;
import net.portswigger.Zvh;

public class Zkj9 extends JPopupMenu {
  private Zlkk Zs;
  
  private static Zbqc[] ZS;
  
  public void ZE(Zlkk paramZlkk) {
    setBackground(paramZlkk.ZS());
    this.Zs = paramZlkk;
  }
  
  public void setVisible(boolean paramBoolean) {
    super.setVisible(paramBoolean);
    if (Zvh.ZU.ZG() && !paramBoolean) {
      Component component = getInvoker();
      if (component != null)
        KeyboardFocusManager.getCurrentKeyboardFocusManager().dispatchEvent(new FocusEvent(component, 1004)); 
    } 
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Zs != null)
      setBackground(this.Zs.ZS()); 
  }
  
  public static void ZX(Zbqc[] paramArrayOfZbqc) {
    ZS = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zg() {
    return ZS;
  }
  
  static {
    if (Zg() == null)
      ZX(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkj9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */