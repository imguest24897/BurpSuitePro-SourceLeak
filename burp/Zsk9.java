package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

class Zsk9 extends JComponent {
  private final Component Za;
  
  private boolean Zx = false;
  
  private boolean Zu;
  
  final Zr8f Zo;
  
  Zsk9(Zr8f paramZr8f, Component paramComponent) {
    this.Za = paramComponent;
    addMouseListener(new Zlxn(this, paramZr8f));
    paramZr8f.Zz.ZT(this);
  }
  
  public void paint(Graphics paramGraphics) {
    if (!isVisible())
      return; 
    paramGraphics.setColor(Zlkk.FOREGROUND.ZS());
    if (!this.Zx && this.Zu && this.Zo.Zz.getTabCount() > 1 && this.Zo.Zz.getSelectedComponent() == this.Za)
      paramGraphics.drawRect(0, 0, 8, 8); 
    paramGraphics.drawLine(2, 2, 6, 6);
    paramGraphics.drawLine(2, 6, 6, 2);
  }
  
  public int getWidth() {
    return 9;
  }
  
  public int getHeight() {
    return 9;
  }
  
  public Dimension getPreferredSize() {
    return new Dimension(9, 9);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsk9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */