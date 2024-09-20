package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.SwingUtilities;

public class Zr3a implements Zeii {
  public Component ZL(Zbcp paramZbcp, Ze2_ paramZe2_, int paramInt) {
    Object object = paramZe2_.Zm();
    if (object == null)
      return new Zm99(); 
    String str = String.valueOf(object);
    Zm99 zm99 = new Zm99(str);
    zm99.setToolTipText(str);
    ZU(zm99);
    return zm99;
  }
  
  private static void ZU(Component paramComponent) {
    paramComponent.addMouseListener(new Ztoc(paramComponent));
    paramComponent.addMouseMotionListener(new Ztm(paramComponent));
    paramComponent.addMouseWheelListener(paramComponent::lambda$redispatchMouseEvents$0);
  }
  
  private static void Zd(Component paramComponent, MouseEvent paramMouseEvent) {
    Container container = paramComponent.getParent();
    if (container != null) {
      MouseEvent mouseEvent = SwingUtilities.convertMouseEvent(paramComponent, paramMouseEvent, container);
      container.dispatchEvent(mouseEvent);
    } 
  }
  
  private static void lambda$redispatchMouseEvents$0(Component paramComponent, MouseWheelEvent paramMouseWheelEvent) {
    Zd(paramComponent, paramMouseWheelEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr3a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */