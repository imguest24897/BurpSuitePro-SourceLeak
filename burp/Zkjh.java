package burp;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.AWTEventListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.SwingUtilities;

public class Zkjh extends Zkj9 implements AWTEventListener, WindowFocusListener {
  private final Window Zx;
  
  public Zkjh(Window paramWindow) {
    this.Zx = paramWindow;
  }
  
  public void setVisible(boolean paramBoolean) {
    if (paramBoolean) {
      super.setVisible(true);
      SwingUtilities.invokeLater(this::lambda$setVisible$0);
    } 
  }
  
  public void windowGainedFocus(WindowEvent paramWindowEvent) {}
  
  public void windowLostFocus(WindowEvent paramWindowEvent) {
    if (paramWindowEvent.getOppositeWindow() != Zt2m.ZF(this))
      Zy(); 
  }
  
  public void eventDispatched(AWTEvent paramAWTEvent) {
    int i = paramAWTEvent.getID();
    boolean bool = Zm99.ZM();
    if (i != 501 && i != 500)
      return; 
    Object object = paramAWTEvent.getSource();
    if (object instanceof Component) {
      Component component = (Component)object;
      if (bool) {
        Window window = Zt2m.ZF(this);
        if (Zt2m.ZT(Zt2m.ZF(component), window))
          return; 
        if (isVisible())
          Zy(); 
        return;
      } 
    } 
  }
  
  public void Zy() {
    SwingUtilities.invokeLater(this::lambda$close$1);
    super.setVisible(false);
  }
  
  private void lambda$close$1() {
    this.Zx.removeWindowFocusListener(this);
    Toolkit.getDefaultToolkit().removeAWTEventListener(this);
  }
  
  private void lambda$setVisible$0() {
    this.Zx.removeWindowFocusListener(this);
    this.Zx.addWindowFocusListener(this);
    Toolkit.getDefaultToolkit().removeAWTEventListener(this);
    Toolkit.getDefaultToolkit().addAWTEventListener(this, 16L);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkjh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */