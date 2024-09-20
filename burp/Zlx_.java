package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

class Zlx_ extends MouseAdapter implements PopupMenuListener {
  private final Ze01 Ze;
  
  private final Zmar Zf;
  
  private final Runnable Za;
  
  private Zkj9 ZU;
  
  Zlx_(Ze01 paramZe01, Zmar paramZmar, Runnable paramRunnable) {
    this.Ze = paramZe01;
    this.Zf = paramZmar;
    this.Za = paramRunnable;
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (this.ZU != null) {
      this.ZU.setVisible(false);
      this.ZU = null;
      return;
    } 
    this.ZU = new Zkj9();
    this.ZU.add(new Zg82(this.Zf));
    this.ZU.addPopupMenuListener(this);
    this.ZU.pack();
    this.ZU.show(this.Ze, this.Ze.getWidth() - (this.ZU.getMinimumSize()).width, this.Ze.getHeight() + 5);
  }
  
  public void popupMenuWillBecomeInvisible(PopupMenuEvent paramPopupMenuEvent) {
    SwingUtilities.invokeLater(this::lambda$popupMenuWillBecomeInvisible$0);
    this.Za.run();
  }
  
  public void popupMenuWillBecomeVisible(PopupMenuEvent paramPopupMenuEvent) {}
  
  public void popupMenuCanceled(PopupMenuEvent paramPopupMenuEvent) {}
  
  private void lambda$popupMenuWillBecomeInvisible$0() {
    this.ZU = null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlx_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */