package burp;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zztv extends JMenu {
  private boolean ZJ;
  
  public Zztv() {
    this(true);
  }
  
  public Zztv(boolean paramBoolean) {
    ZJ(paramBoolean);
  }
  
  public Zztv(String paramString) {
    this(paramString, true);
  }
  
  public Zztv(String paramString, boolean paramBoolean) {
    super(paramString);
    ZJ(paramBoolean);
  }
  
  public void ZJ(boolean paramBoolean) {
    this.ZJ = paramBoolean;
  }
  
  public void processMouseEvent(MouseEvent paramMouseEvent) {
    if (!this.ZJ && paramMouseEvent.getID() == 500 && contains(paramMouseEvent.getPoint())) {
      ZD();
      setSelected(true);
      return;
    } 
    super.processMouseEvent(paramMouseEvent);
  }
  
  private void ZD() {
    this.model.setArmed(true);
    this.model.setPressed(true);
    try {
      Dimension dimension = getSize();
      paintImmediately(new Rectangle(0, 0, dimension.width, dimension.height));
      try {
        Thread.sleep(68L);
      } catch (InterruptedException interruptedException) {
        Zah.Zl(interruptedException, Zk_.IGNORED);
      } 
    } finally {
      this.model.setPressed(false);
      this.model.setArmed(false);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zztv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */