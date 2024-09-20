package burp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

public class Zmgq extends Zmg2 {
  private final Zbf6 ZM;
  
  private boolean ZO;
  
  public Zmgq(Zbf6 paramZbf6) {
    this.ZM = paramZbf6;
    addMouseListener(new Zl7i(this));
  }
  
  public void paint(Graphics paramGraphics) {
    Rectangle rectangle = paramGraphics.getClipBounds();
    ((Graphics2D)paramGraphics).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    int i = Math.min(rectangle.width, rectangle.height);
    paramGraphics.setColor(this.ZO ? this.ZM.ZA() : this.ZM.selectorColour.ZS());
    paramGraphics.fillOval(rectangle.x, rectangle.y, i, i);
    if (isSelected()) {
      paramGraphics.setColor(Color.WHITE);
      paramGraphics.fillOval(rectangle.width / 2 - 4, rectangle.height / 2 - 4, 9, 9);
    } 
  }
  
  public Zbf6 Zw() {
    return this.ZM;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmgq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */