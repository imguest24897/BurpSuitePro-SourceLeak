package burp;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.text.LayeredHighlighter;
import javax.swing.text.View;

class Zb8n {
  private final LayeredHighlighter Zk;
  
  private final Graphics2D Zb;
  
  private final Rectangle Ze;
  
  private final Zmgn ZL;
  
  private final View Zf;
  
  Zb8n(LayeredHighlighter paramLayeredHighlighter, Graphics2D paramGraphics2D, Rectangle paramRectangle, Zmgn paramZmgn, View paramView) {
    this.Zk = paramLayeredHighlighter;
    this.Zb = paramGraphics2D;
    this.Ze = paramRectangle;
    this.ZL = paramZmgn;
    this.Zf = paramView;
  }
  
  void Zi(int paramInt1, int paramInt2) {
    this.Zk.paintLayeredHighlights(this.Zb, paramInt1, paramInt2, this.Ze, this.ZL, this.Zf);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb8n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */