package burp;

import java.awt.Component;
import javax.swing.Icon;

class Zkj3 implements Zldk {
  private final Icon Zi;
  
  private final Icon ZB;
  
  private final Zm99 Zr;
  
  private boolean Zf;
  
  public Zkj3(Icon paramIcon1, Icon paramIcon2) {
    this.Zi = paramIcon1;
    this.ZB = paramIcon2;
    this.Zr = new Zm99();
    this.Zr.setIcon(paramIcon1);
  }
  
  public Component Zk() {
    return this.Zr;
  }
  
  public void ZU(boolean paramBoolean) {
    this.Zf = paramBoolean;
    Icon icon = paramBoolean ? this.ZB : this.Zi;
    this.Zr.setIcon(icon);
  }
  
  public void Zd(Runnable paramRunnable) {
    this.Zr.addMouseListener(new Zxa4(this, paramRunnable));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkj3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */