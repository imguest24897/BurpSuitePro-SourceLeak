package burp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Zm97 extends Zm99 {
  private Color ZX;
  
  public Zm97(String paramString) {
    super(paramString);
    setOpaque(false);
    setForeground(Color.WHITE);
    setHorizontalAlignment(0);
    setVerticalAlignment(0);
    setHorizontalTextPosition(0);
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
  
  public Dimension getPreferredSize() {
    FontMetrics fontMetrics = getFontMetrics(getFont());
    int i = (int)(fontMetrics.getHeight() * 1.2D);
    int j = (int)(fontMetrics.charWidth('5') * 1.2D);
    int k = Math.max(j, i);
    return new Dimension(k, k);
  }
  
  protected void paintComponent(Graphics paramGraphics) {
    super.paintComponent(paramGraphics);
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    graphics2D.setColor(this.ZX);
    int i = Math.min((getPreferredSize()).width, (getPreferredSize()).height);
    graphics2D.fillOval(0, 0, i, i);
    graphics2D.setColor(getForeground());
    FontMetrics fontMetrics = graphics2D.getFontMetrics(getFont());
    int j = (i - fontMetrics.charWidth(getText().charAt(0))) / 2;
    int k = (i - fontMetrics.getHeight()) / 2 + fontMetrics.getAscent();
    graphics2D.drawString(getText(), j, k);
  }
  
  public void ZF(Zlkk paramZlkk) {
    Zb(paramZlkk.ZS());
  }
  
  public void Zb(Color paramColor) {
    this.ZX = paramColor;
    repaint();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm97.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */