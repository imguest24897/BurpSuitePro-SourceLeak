package burp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

class Zzzn implements Zth1 {
  private Color ZA;
  
  Zzzn(Color paramColor) {
    ZT(paramColor);
  }
  
  Color Za() {
    return this.ZA;
  }
  
  void ZT(Color paramColor) {
    this.ZA = paramColor;
  }
  
  public void ZI(Graphics paramGraphics, Rectangle paramRectangle) {
    Color color = paramGraphics.getColor();
    paramGraphics.setColor(this.ZA);
    paramGraphics.fillRect(paramRectangle.x, paramRectangle.y, paramRectangle.width, paramRectangle.height);
    paramGraphics.setColor(color);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof Zzzn && this.ZA.equals(((Zzzn)paramObject).Za()));
  }
  
  public int hashCode() {
    return this.ZA.hashCode();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzzn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */