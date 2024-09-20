package burp;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Comparator;

class Zbwm extends Zbws {
  final Zsbp ZD;
  
  Zbwm(Zsbp paramZsbp, Zztu paramZztu) {
    super(paramZztu);
  }
  
  public void updateUI() {
    super.updateUI();
    int i = getFontMetrics(Zt00.DEFAULT_FONT.ZV()).getHeight();
    setRowHeight((int)(i * 3.0F));
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    return new Dimension(dimension.width + 100, getRowHeight() * 7);
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    Graphics graphics = getGraphics();
    if (graphics != null) {
      FontMetrics fontMetrics = graphics.getFontMetrics(Zt00.TITLE_PLAIN_FONT.ZV());
      String str = this.ZD.Zg.stream().map(Zt6y::ZbI).max(Comparator.comparing(String::length)).orElse("");
      if (str.length() > 70)
        str = "x".repeat(70); 
      int i = fontMetrics.stringWidth(str);
      byte b1 = 55;
      byte b2 = this.ZD.Zg.isEmpty() ? 0 : ((Zt6y)this.ZD.Zg.getFirst()).Zbu().getIconWidth();
      return new Dimension(i + b1 + b2, getRowHeight() * this.ZD.Zg.size());
    } 
    return new Dimension(dimension.width + 200, getRowHeight() * this.ZD.Zg.size());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbwm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */