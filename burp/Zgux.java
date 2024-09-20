package burp;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.Icon;

class Zgux implements Icon {
  private static final Insets ZM = new Insets(1, 8, 1, 8);
  
  private String ZF = "0";
  
  final Zbvc ZK;
  
  private Zgux(Zbvc paramZbvc) {}
  
  public void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2) {
    Font font = this.ZK.Zf.getFont().deriveFont(1);
    int i = getIconWidth();
    int j = getIconHeight();
    int k = this.ZK.getFontMetrics(font).getAscent();
    Graphics2D graphics2D = (Graphics2D)paramGraphics.create();
    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    graphics2D.setColor(Zlkk.SETTING_TYPE_BACKGROUND.ZS());
    graphics2D.fillRoundRect(paramInt1, paramInt2, i, j, j / 2, j / 2);
    graphics2D.setColor(Zlkk.FOREGROUND.ZS());
    graphics2D.setFont(font);
    graphics2D.drawString(this.ZF, paramInt1 + ZM.left, paramInt2 + ZM.top + k);
    graphics2D.dispose();
  }
  
  public int getIconWidth() {
    return this.ZK.getFontMetrics(this.ZK.Zf.getFont().deriveFont(1)).stringWidth(this.ZF) + ZM.left + ZM.right;
  }
  
  public int getIconHeight() {
    return this.ZK.getFontMetrics(this.ZK.Zf.getFont().deriveFont(1)).getHeight() + ZM.top + ZM.bottom;
  }
  
  void Zi(int paramInt) {
    this.ZF = String.valueOf(paramInt);
    this.ZK.repaint();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgux.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */