package burp;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

class Zzt3 {
  private final Zlkk ZK;
  
  public Zzt3(Zlkk paramZlkk) {
    this.ZK = paramZlkk;
  }
  
  void ZH(Dimension paramDimension, Graphics paramGraphics) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics.create();
    try {
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      graphics2D.setColor(this.ZK.ZS());
      graphics2D.setClip(paramDimension.width + 3, 0, 6, 6);
      graphics2D.fillOval(paramDimension.width + 3, 0, 6, 6);
    } finally {
      graphics2D.dispose();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzt3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */