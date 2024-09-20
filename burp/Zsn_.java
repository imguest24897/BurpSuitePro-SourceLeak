package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Zsn_ implements Border, MouseListener, SwingConstants {
  int Zg = 5;
  
  Component Zx;
  
  JComponent ZE;
  
  Rectangle Zj;
  
  Border ZO;
  
  public Zsn_(Component paramComponent, JComponent paramJComponent, Border paramBorder) {
    this.Zx = paramComponent;
    this.ZE = paramJComponent;
    this.ZO = paramBorder;
    paramJComponent.addMouseListener(this);
  }
  
  public boolean isBorderOpaque() {
    return true;
  }
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Insets insets1 = this.ZO.getBorderInsets(paramComponent);
    Insets insets2 = getBorderInsets(paramComponent);
    int i = (insets2.top - insets1.top) / 2;
    this.ZO.paintBorder(paramComponent, paramGraphics, paramInt1, paramInt2 + i, paramInt3, paramInt4 - i);
    Dimension dimension = this.Zx.getPreferredSize();
    this.Zj = new Rectangle(this.Zg, 0, dimension.width, dimension.height);
    SwingUtilities.paintComponent(paramGraphics, this.Zx, (Container)paramComponent, this.Zj);
  }
  
  public Insets getBorderInsets(Component paramComponent) {
    Dimension dimension = this.Zx.getPreferredSize();
    Insets insets = this.ZO.getBorderInsets(paramComponent);
    insets.top = Math.max(insets.top, dimension.height);
    return insets;
  }
  
  private void ZM(MouseEvent paramMouseEvent) {
    if (this.Zj != null && this.Zj.contains(paramMouseEvent.getX(), paramMouseEvent.getY())) {
      Point point = paramMouseEvent.getPoint();
      point.translate(-this.Zg, 0);
      this.Zx.setBounds(this.Zj);
      this.Zx.dispatchEvent(new MouseEvent(this.Zx, paramMouseEvent.getID(), paramMouseEvent.getWhen(), paramMouseEvent.getModifiers(), point.x, point.y, paramMouseEvent.getClickCount(), paramMouseEvent.isPopupTrigger(), paramMouseEvent.getButton()));
      if (!this.Zx.isValid())
        this.ZE.repaint(); 
    } 
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    ZM(paramMouseEvent);
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    ZM(paramMouseEvent);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    ZM(paramMouseEvent);
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    ZM(paramMouseEvent);
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    ZM(paramMouseEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsn_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */