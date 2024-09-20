package burp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;

public class Zrqg extends EmptyBorder {
  private Color ZQ = new Color(221, 221, 221);
  
  private Rectangle ZH = new Rectangle();
  
  public Zrqg(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = Zz85.ZT();
    this.ZH = paramGraphics.getClipBounds(this.ZH);
    if (this.ZH == null)
      this.ZH = ((JComponent)paramComponent).getVisibleRect(); 
    paramGraphics.setColor(this.ZQ);
    if (this.left == 1) {
      paramGraphics.drawLine(0, this.ZH.y, 0, this.ZH.y + this.ZH.height);
      if (i == 0) {
        paramGraphics.drawLine(paramInt3 - 1, this.ZH.y, paramInt3 - 1, this.ZH.y + this.ZH.height);
        return;
      } 
      return;
    } 
    paramGraphics.drawLine(paramInt3 - 1, this.ZH.y, paramInt3 - 1, this.ZH.y + this.ZH.height);
  }
  
  public void ZR(Color paramColor) {
    this.ZQ = paramColor;
  }
  
  public void ZE(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.top = paramInt1;
    this.left = paramInt2;
    this.bottom = paramInt3;
    this.right = paramInt4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrqg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */