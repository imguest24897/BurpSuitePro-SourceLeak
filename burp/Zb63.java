package burp;

import java.awt.Component;
import javax.swing.JLayeredPane;
import javax.swing.OverlayLayout;

public class Zb63 {
  private final JLayeredPane ZR = new JLayeredPane();
  
  public Zb63(Component paramComponent) {
    this.ZR.setLayout(new OverlayLayout(this.ZR));
    ZD(paramComponent, JLayeredPane.DEFAULT_LAYER.intValue());
  }
  
  public void ZC(Component paramComponent) {
    ZD(paramComponent, JLayeredPane.PALETTE_LAYER.intValue());
  }
  
  public Component ZL() {
    return this.ZR;
  }
  
  private void ZD(Component paramComponent, int paramInt) {
    this.ZR.setLayer(paramComponent, paramInt);
    this.ZR.add(paramComponent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb63.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */