package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Zbup extends JScrollPane implements MouseWheelListener {
  private Zlkk ZJ;
  
  private static String[] ZH;
  
  public Zbup() {
    getVerticalScrollBar().setUnitIncrement(25);
    getHorizontalScrollBar().setUnitIncrement(25);
    addMouseWheelListener(this);
  }
  
  public Zbup(Component paramComponent) {
    this();
    setViewportView(paramComponent);
  }
  
  public void setViewportView(Component paramComponent) {
    super.setViewportView(paramComponent);
    if (paramComponent instanceof Zbws && ((Zbws)paramComponent).getAutoResizeMode() == 4)
      Zy((Zbws)paramComponent); 
  }
  
  public void Zh(Zlkk paramZlkk) {
    this.ZJ = paramZlkk;
    ZI();
  }
  
  public void Zy(Zbws paramZbws) {
    setPreferredSize(new Dimension((paramZbws.getPreferredSize()).width, 150));
  }
  
  public void updateUI() {
    super.updateUI();
    ZI();
  }
  
  private void ZI() {
    if (this.ZJ != null) {
      setBackground(this.ZJ.ZS());
      getViewport().setBackground(this.ZJ.ZS());
      JScrollBar jScrollBar = getVerticalScrollBar();
      jScrollBar.setBackground(this.ZJ.ZS());
    } 
  }
  
  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent) {
    if (isValid())
      getParent().dispatchEvent(paramMouseWheelEvent); 
  }
  
  public static void ZL(String[] paramArrayOfString) {
    ZH = paramArrayOfString;
  }
  
  public static String[] ZM() {
    return ZH;
  }
  
  static {
    if (ZM() != null)
      ZL(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbup.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */