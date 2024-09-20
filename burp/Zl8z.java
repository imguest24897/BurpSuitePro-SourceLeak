package burp;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

class Zl8z extends Zl86 {
  final Zb7d Zf;
  
  Zl8z(Zb7d paramZb7d) {}
  
  protected void paintComponent(Graphics paramGraphics) {
    super.paintComponent(paramGraphics);
    int i = getFontMetrics(getFont()).getHeight() * 4;
    int j = getHeight();
    String[] arrayOfString = Zb7d.ZY();
    Color color = getBackground();
    GradientPaint gradientPaint = new GradientPaint(new Point2D.Float(0.0F, (j - i)), new Color(color.getRed(), color.getGreen(), color.getBlue(), 0), new Point2D.Float(0.0F, j), new Color(color.getRed(), color.getGreen(), color.getBlue(), 200));
    Graphics2D graphics2D = (Graphics2D)paramGraphics.create();
    graphics2D.setPaint(gradientPaint);
    graphics2D.fillRect(0, j - i, getWidth(), i);
    graphics2D.dispose();
    if (Zbqc.Zwu() == null)
      Zb7d.Zc(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl8z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */