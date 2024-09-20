package burp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zm9c extends Zm99 {
  private static final int Z_ = (int)(Zrt.Zx() * 1.35D) * 5;
  
  private static final int ZJ = (int)(Zrt.Zx() * 1.2D);
  
  private int ZO;
  
  public Zm9c() {
    Dimension dimension = new Dimension(Z_, ZJ);
    setPreferredSize(dimension);
    setMinimumSize(dimension);
    setMaximumSize(dimension);
  }
  
  public void Z_(Zsyx paramZsyx) {
    this.ZO = paramZsyx.Zm();
  }
  
  public void paintComponent(Graphics paramGraphics) {
    super.paintComponent(paramGraphics);
    ZN(paramGraphics, this.ZO, Z_, ZJ);
  }
  
  public static void ZN(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    try {
      float f = paramInt1 / 100.0F;
      int i = Math.min((int)(paramInt2 / 100.0F * f), paramInt2 - 2);
      try {
        paramGraphics.setColor(Zlkk.BURP_ORANGE.ZS());
        if (i > 0)
          paramGraphics.drawLine(0, paramInt3 / 2, i - 1, paramInt3 / 2); 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        paramGraphics.drawLine(i, 0, i, paramInt3);
        paramGraphics.drawLine(i + 1, 0, i + 1, paramInt3);
        if (i + 2 < paramInt2 - 1) {
          paramGraphics.setColor(Color.LIGHT_GRAY);
          paramGraphics.drawLine(i + 2, paramInt3 / 2, paramInt2 - 1, paramInt3 / 2);
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void setText(String paramString) {}
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */