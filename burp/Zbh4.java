package burp;

import java.awt.Dimension;
import java.awt.LayoutManager;

class Zbh4 extends Zbqc {
  final Zbh0 Zu;
  
  Zbh4(Zbh0 paramZbh0, LayoutManager paramLayoutManager) {
    super(paramLayoutManager);
  }
  
  public Dimension getPreferredSize() {
    Zbqc[] arrayOfZbqc = Zbh0.Ze();
    Dimension dimension = super.getPreferredSize();
    if (Zbqc.Zwu() == null)
      Zbh0.ZW(new Zbqc[1]); 
    return new Dimension(Math.max((this.Zu.getPreferredSize()).width + 10, dimension.width), dimension.height);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbh4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */