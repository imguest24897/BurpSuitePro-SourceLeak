package burp;

import java.awt.Dimension;
import java.awt.LayoutManager;

class Zbhd extends Zbqc {
  final Zbup ZB;
  
  final Zbhh ZG;
  
  Zbhd(Zbhh paramZbhh, LayoutManager paramLayoutManager, Zbup paramZbup) {
    super(paramLayoutManager);
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension1 = getMinimumSize();
    Dimension dimension2 = getMaximumSize();
    return new Dimension(Math.max(dimension1.width, dimension2.width), Math.max(dimension1.height, dimension2.height));
  }
  
  public Dimension getMaximumSize() {
    return this.ZB.getSize();
  }
  
  public Dimension getMinimumSize() {
    return new Dimension((int)(Zrt.ZH() * 150.0F), (int)(Zrt.Zx() * 30.0F));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbhd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */