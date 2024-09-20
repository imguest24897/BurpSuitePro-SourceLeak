package burp;

import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JMenuItem;

public class Zepe extends JMenuItem {
  private boolean Zq;
  
  private static String ZX;
  
  public Zepe() {
    this(true);
  }
  
  public Zepe(boolean paramBoolean) {
    Zz(paramBoolean);
  }
  
  public Zepe(String paramString) {
    this(paramString, true);
  }
  
  public Zepe(String paramString, boolean paramBoolean) {
    super(paramString);
    Zz(paramBoolean);
  }
  
  public Zepe(String paramString, Icon paramIcon) {
    this(paramString, paramIcon, true);
  }
  
  public Zepe(String paramString, Icon paramIcon, boolean paramBoolean) {
    super(paramString, paramIcon);
    Zz(paramBoolean);
  }
  
  public void Zz(boolean paramBoolean) {
    this.Zq = paramBoolean;
  }
  
  public void processMouseEvent(MouseEvent paramMouseEvent) {
    if (!this.Zq && paramMouseEvent.getID() == 502 && contains(paramMouseEvent.getPoint())) {
      doClick();
      setArmed(true);
      return;
    } 
    super.processMouseEvent(paramMouseEvent);
  }
  
  public static void ZJ(String paramString) {
    ZX = paramString;
  }
  
  public static String ZI() {
    return ZX;
  }
  
  static {
    if (ZI() == null)
      ZJ("prz0tc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zepe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */