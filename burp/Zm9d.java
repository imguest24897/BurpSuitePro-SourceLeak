package burp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Zm9d extends Zm99 {
  private Color Zq;
  
  public Zm9d(String paramString) {
    super(paramString);
    setOpaque(false);
    setForeground(Color.WHITE);
    setHorizontalAlignment(0);
    setVerticalAlignment(0);
    setHorizontalTextPosition(0);
  }
  
  public Dimension getMinimumSize() {
    int i = (getPreferredSize()).height;
    FontMetrics fontMetrics = getFontMetrics(getFont());
    int j = (int)Math.max(i, fontMetrics.stringWidth(getText()) * 1.2D);
    return new Dimension(j, i);
  }
  
  protected void paintComponent(Graphics paramGraphics) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    graphics2D.setColor(this.Zq);
    graphics2D.fillRoundRect(0, 0, getWidth(), getHeight(), getHeight(), getHeight());
    super.paintComponent(paramGraphics);
  }
  
  public void ZX(Zlkk paramZlkk) {
    ZN(paramZlkk.ZS());
  }
  
  public void ZN(Color paramColor) {
    this.Zq = paramColor;
    repaint();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */