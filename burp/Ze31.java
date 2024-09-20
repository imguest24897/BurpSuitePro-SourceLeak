package burp;

import java.awt.Component;
import java.awt.Container;
import java.util.Optional;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;

public class Ze31 {
  public static Optional<JScrollBar> Zy(Component paramComponent, int paramInt) {
    return (paramInt == 0) ? ZD(paramComponent) : Zi(paramComponent);
  }
  
  public static Optional<JScrollBar> Zi(Component paramComponent) {
    JScrollPane jScrollPane = (JScrollPane)paramComponent;
    return (paramComponent instanceof JScrollPane) ? Optional.<JScrollBar>ofNullable(jScrollPane.getVerticalScrollBar()) : Zm(paramComponent).<JScrollBar>map(JScrollPane::getVerticalScrollBar);
  }
  
  public static Optional<JScrollBar> ZD(Component paramComponent) {
    JScrollPane jScrollPane = (JScrollPane)paramComponent;
    return (paramComponent instanceof JScrollPane) ? Optional.<JScrollBar>ofNullable(jScrollPane.getHorizontalScrollBar()) : Zm(paramComponent).<JScrollBar>map(JScrollPane::getHorizontalScrollBar);
  }
  
  public static Optional<JScrollPane> Zm(Component paramComponent) {
    Container container = SwingUtilities.getUnwrappedParent(paramComponent);
    if (container instanceof JViewport) {
      JViewport jViewport = (JViewport)container;
      Container container1 = jViewport.getParent();
      if (container1 instanceof JScrollPane) {
        JScrollPane jScrollPane = (JScrollPane)container1;
        container1 = jScrollPane.getViewport();
        if (container1 != null && SwingUtilities.getUnwrappedView((JViewport)container1) == paramComponent)
          return Optional.of(jScrollPane); 
      } 
    } 
    return Optional.empty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze31.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */