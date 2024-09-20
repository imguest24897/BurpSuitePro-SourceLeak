package burp;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.Timer;

public class Zkaz implements Icon {
  protected final Icon Zw;
  
  protected final int ZA;
  
  protected final float ZT;
  
  protected Timer ZL;
  
  protected float ZU;
  
  public Zkaz(Icon paramIcon) {
    this(paramIcon, 20, 1.0F);
  }
  
  public Zkaz(Icon paramIcon, int paramInt, float paramFloat) {
    this.Zw = paramIcon;
    this.ZA = 1000 / paramInt;
    this.ZT = 6.2831855F / paramInt * paramFloat;
  }
  
  public void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2) {
    boolean bool = Zm99.ZQ();
    if (paramComponent.isShowing()) {
      if (this.ZL == null) {
        this.ZL = new Timer(this.ZA, paramComponent::lambda$paintIcon$0);
        this.ZL.start();
      } 
      Graphics2D graphics2D = null;
      try {
        graphics2D = ZK(paramGraphics, paramInt1, paramInt2);
        this.Zw.paintIcon(paramComponent, graphics2D, paramInt1, paramInt2);
      } finally {
        if (graphics2D != null)
          graphics2D.dispose(); 
      } 
      this.ZU += this.ZT;
      if (Float.compare(this.ZU, 6.2831855F) >= 0)
        this.ZU -= 6.2831855F; 
      if (bool) {
        this.ZL.stop();
        this.ZL = null;
        return;
      } 
      return;
    } 
    this.ZL.stop();
    this.ZL = null;
  }
  
  protected Graphics2D ZK(Graphics paramGraphics, int paramInt1, int paramInt2) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics.create();
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    graphics2D.rotate(this.ZU, (paramInt1 + getIconWidth() / 2.0F), (paramInt2 + getIconHeight() / 2.0F));
    return graphics2D;
  }
  
  public int getIconWidth() {
    return this.Zw.getIconWidth();
  }
  
  public int getIconHeight() {
    return this.Zw.getIconHeight();
  }
  
  private static void lambda$paintIcon$0(Component paramComponent, ActionEvent paramActionEvent) {
    paramComponent.repaint();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkaz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */