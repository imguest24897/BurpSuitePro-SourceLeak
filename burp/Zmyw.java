package burp;

import java.awt.Component;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmyw extends Zmyz {
  public Zmyw() {
    setDividerSize(10);
    super.setRightComponent(new Zbqc());
    setBorder(null);
    Zw(Zlkk.PANEL_BACKGROUND);
  }
  
  public void updateUI() {
    super.updateUI();
    Zf();
  }
  
  public void setRightComponent(Component paramComponent) {}
  
  private void Zf() {
    try {
      setUI(new Zxr_(this));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmyw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */