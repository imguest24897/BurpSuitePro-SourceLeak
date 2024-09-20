package burp;

import java.awt.Dimension;
import java.awt.LayoutManager;

class Zbh_ extends Zbqc {
  final Zbhw Zt;
  
  Zbh_(Zbhw paramZbhw, LayoutManager paramLayoutManager) {
    super(paramLayoutManager);
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
  
  public Dimension getMaximumSize() {
    return getPreferredSize();
  }
  
  public Dimension getPreferredSize() {
    int i = (super.getPreferredSize()).width;
    return new Dimension(i, 3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbh_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */