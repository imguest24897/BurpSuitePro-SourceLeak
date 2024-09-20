package burp;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;

class Zgfx extends Zg85 {
  final Zbae Zf;
  
  Zgfx(Zbae paramZbae, int paramInt) {
    setColumns(paramInt);
  }
  
  public void paintComponent(Graphics paramGraphics) {
    boolean bool = this.Zf.Zo.Zf2();
    ((Graphics2D)paramGraphics).setRenderingHint(RenderingHints.KEY_ANTIALIASING, bool ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
    ((Graphics2D)paramGraphics).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, bool ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
    paramGraphics.setColor(Zlkk.BACKGROUND.ZS());
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    paramGraphics.setColor(Zlkk.FOREGROUND.ZS());
    Font font = new Font(this.Zf.Zo.Zf8(), 0, this.Zf.Zo.ZfF());
    String str = this.Zf.Zn(font);
    FontMetrics fontMetrics = paramGraphics.getFontMetrics(font);
    Rectangle2D rectangle2D = fontMetrics.getStringBounds(str, paramGraphics);
    paramGraphics.drawString(str, (int)((getWidth() - rectangle2D.getWidth()) / 2.0D), (int)((getHeight() + rectangle2D.getHeight() - fontMetrics.getDescent()) / 2.0D));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgfx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */