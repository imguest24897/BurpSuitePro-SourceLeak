package burp;

import java.util.Iterator;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

class Zmje implements MenuListener {
  final Zztv ZQ;
  
  final Zsm8 ZU;
  
  Zmje(Zsm8 paramZsm8, Zztv paramZztv) {}
  
  public void menuSelected(MenuEvent paramMenuEvent) {
    this.ZQ.removeAll();
    Iterator<JMenuItem> iterator = this.ZU.ZO.iterator();
    boolean bool = Zbhg.Zs();
    while (iterator.hasNext()) {
      JMenuItem jMenuItem = iterator.next();
      this.ZQ.add(jMenuItem);
      if (!bool)
        break; 
    } 
  }
  
  public void menuDeselected(MenuEvent paramMenuEvent) {}
  
  public void menuCanceled(MenuEvent paramMenuEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmje.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */