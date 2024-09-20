package burp;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.util.Arrays;

class Ze3a extends CardLayout {
  final Zbc6 ZR;
  
  Ze3a(Zbc6 paramZbc6) {}
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    Dimension dimension = super.minimumLayoutSize(paramContainer);
    Arrays.<Component>stream(paramContainer.getComponents()).map(Component::getPreferredSize).forEach(dimension::lambda$minimumLayoutSize$0);
    return dimension;
  }
  
  private static void lambda$minimumLayoutSize$0(Dimension paramDimension1, Dimension paramDimension2) {
    paramDimension1.width = Math.min(paramDimension1.width, paramDimension2.width);
    paramDimension1.height = Math.min(paramDimension1.height, paramDimension2.height);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze3a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */