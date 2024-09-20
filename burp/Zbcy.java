package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.util.Arrays;

class Zbcy extends Zbqc {
  final Zbct ZD;
  
  Zbcy(Zbct paramZbct) {}
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    Arrays.<Component>stream(getComponents()).forEach(paramBoolean::lambda$setEnabled$0);
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    return (dimension.getHeight() >= 170.0D) ? dimension : new Dimension(dimension.width, 170);
  }
  
  private static void lambda$setEnabled$0(boolean paramBoolean, Component paramComponent) {
    paramComponent.setEnabled(paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbcy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */