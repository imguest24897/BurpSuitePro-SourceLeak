package burp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

public class Zmo8 {
  private final Zmgw Zh;
  
  public Zmo8(Zmgw paramZmgw) {
    this.Zh = paramZmgw;
  }
  
  public float ZE(Zs5o paramZs5o, float paramFloat1, float paramFloat2, Graphics2D paramGraphics2D) {
    Font font = this.Zh.getFont();
    Zzkh zzkh = this.Zh.Zl(font);
    float f1 = paramFloat1 + paramZs5o.ZY();
    float f2 = paramFloat2 - zzkh.ZV() + paramZs5o.ZY();
    float f3 = f1 + paramZs5o.Zd();
    float f4 = paramFloat2 - paramZs5o.ZY();
    paramGraphics2D.setFont(paramZs5o.ZK());
    float f5 = ZS(paramZs5o, f1, f2, f3, f4, Zlkk.TEXT_EDITOR_LOZENGE_BACKGROUND.ZS(), Zlkk.TEXT_EDITOR_LOZENGE_TEXT.ZS(), paramGraphics2D);
    int i = Zs5o.Zj();
    paramGraphics2D.setFont(font);
    if (Zbqc.Zwu() == null)
      Zs5o.Zd(++i); 
    return f5;
  }
  
  private float ZS(Zs5o paramZs5o, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Color paramColor1, Color paramColor2, Graphics2D paramGraphics2D) {
    paramGraphics2D.setColor(paramColor1);
    paramGraphics2D.fill(new RoundRectangle2D.Double(paramFloat1, paramFloat2, paramZs5o.ZZ(), paramZs5o.Zz(), 4.0D, 4.0D));
    paramGraphics2D.setColor(paramColor2);
    paramGraphics2D.drawString(paramZs5o.ZG(), paramFloat3, paramFloat4);
    return paramFloat1 + paramZs5o.ZZ();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmo8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */