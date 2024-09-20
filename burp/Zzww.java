package burp;

import burp.api.montoya.core.Registration;
import burp.api.montoya.ui.menu.Menu;
import burp.api.montoya.ui.menu.MenuBar;
import javax.swing.JMenu;

public class Zzww implements MenuBar {
  private final Zlz3 ZM;
  
  public Zzww(Zlz3 paramZlz3) {
    this.ZM = paramZlz3;
  }
  
  public Registration registerMenu(JMenu paramJMenu) {
    return this.ZM.Zj(paramJMenu);
  }
  
  public Registration registerMenu(Menu paramMenu) {
    return this.ZM.Zm(paramMenu);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzww.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */