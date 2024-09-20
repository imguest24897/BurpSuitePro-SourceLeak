package burp;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.Position;
import javax.swing.text.View;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zz6k extends Zz6a {
  private static final Color Zz = Color.WHITE;
  
  private final AlphaComposite Zj = AlphaComposite.getInstance(3, 0.6F);
  
  private final Zlkk Zm;
  
  private final boolean Zc;
  
  public Zz6k(Zlkk paramZlkk, boolean paramBoolean) {
    this.Zm = paramZlkk;
    this.Zc = paramBoolean;
  }
  
  public Shape paintLayer(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent, View paramView) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    Composite composite = graphics2D.getComposite();
    graphics2D.setComposite(this.Zj);
    try {
      graphics2D.setColor(this.Zm.ZS());
      if (paramInt1 == paramInt2)
        try {
          Shape shape = paramView.modelToView(paramInt1, paramShape, Position.Bias.Forward);
          Rectangle rectangle = shape.getBounds();
          graphics2D.drawLine(rectangle.x, rectangle.y, rectangle.x, rectangle.y + rectangle.height);
          return rectangle;
        } catch (BadLocationException badLocationException) {
          Zah.Zl(badLocationException, Zk_.UNEXPECTED);
          return null;
        }  
      try {
        if (paramInt1 == paramView.getStartOffset())
          try {
            if (paramInt2 == paramView.getEndOffset()) {
              try {
              
              } catch (BadLocationException badLocationException) {
                throw b(null);
              } 
              Rectangle rectangle = (paramShape instanceof Rectangle) ? (Rectangle)paramShape : paramShape.getBounds();
              graphics2D.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
              return rectangle;
            } 
          } catch (BadLocationException badLocationException) {
            throw b(null);
          }  
      } catch (BadLocationException badLocationException) {
        throw b(null);
      } 
    } finally {
      graphics2D.setComposite(composite);
    } 
  }
  
  private static BadLocationException b(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz6k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */