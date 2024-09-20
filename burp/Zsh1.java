package burp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.util.function.Supplier;
import javax.swing.border.EmptyBorder;

class Zsh1 extends EmptyBorder {
  private final Supplier<Color> Zm;
  
  private Zsh1(int paramInt, Supplier<Color> paramSupplier) {
    super(paramInt, paramInt, paramInt, paramInt);
    this.Zm = paramSupplier;
  }
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Color color = paramGraphics.getColor();
    try {
      Zs(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, getBorderInsets());
    } finally {
      paramGraphics.setColor(color);
    } 
  }
  
  private void Zs(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Insets paramInsets) {
    ((Graphics2D)paramGraphics).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    paramGraphics.setColor(this.Zm.get());
    ZA(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, paramInsets);
    Za(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, paramInsets);
  }
  
  private void ZA(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Insets paramInsets) {
    paramGraphics.fillArc(paramInt1, paramInt2, paramInsets.left * 2, paramInsets.top * 2, 90, 90);
    paramGraphics.fillArc(paramInt1 + paramInt3 - paramInsets.right * 2, paramInt2, paramInsets.right * 2, paramInsets.top * 2, 0, 90);
    paramGraphics.fillArc(paramInt1 + paramInt3 - paramInsets.right * 2, paramInt2 + paramInt4 - paramInsets.bottom * 2, paramInsets.right * 2, paramInsets.bottom * 2, 270, 90);
    paramGraphics.fillArc(paramInt1, paramInt2 + paramInt4 - paramInsets.bottom * 2, paramInsets.left * 2, paramInsets.bottom * 2, 180, 90);
  }
  
  private void Za(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Insets paramInsets) {
    paramGraphics.fillRect(paramInt1 + paramInsets.left, paramInt2, paramInt3 - paramInsets.left - paramInsets.right, paramInsets.top);
    paramGraphics.fillRect(paramInt1 + paramInt3 - paramInsets.right, paramInt2 + paramInsets.top, paramInsets.right, paramInt4 - paramInsets.top - paramInsets.bottom);
    paramGraphics.fillRect(paramInt1 + paramInsets.left, paramInt2 + paramInt4 - paramInsets.bottom, paramInt3 - paramInsets.left - paramInsets.right, paramInsets.bottom);
    paramGraphics.fillRect(paramInt1, paramInt2 + paramInsets.top, paramInsets.left, paramInt4 - paramInsets.top - paramInsets.bottom);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsh1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */