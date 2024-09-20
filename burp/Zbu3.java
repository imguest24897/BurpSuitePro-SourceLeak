package burp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

class Zbu3 extends Zbup {
  final Zbvc Ze;
  
  Zbu3(Zbvc paramZbvc) {}
  
  public void updateUI() {
    super.updateUI();
    ZC();
  }
  
  private void ZC() {
    Font font = this.Ze.Zy.getFont().deriveFont(Zrt.ZC());
    Insets insets = this.Ze.Zy.getInsets();
    Dimension dimension = new Dimension(0, 5 * this.Ze.Zy.getFontMetrics(font).getHeight() + insets.top + insets.bottom);
    setMinimumSize(dimension);
    setPreferredSize(dimension);
    invalidate();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbu3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */