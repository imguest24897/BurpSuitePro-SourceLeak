package burp;

import burp.api.montoya.ui.menu.BasicMenuItem;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

public class Zzaa extends JMenuItem {
  public Zzaa(BasicMenuItem paramBasicMenuItem) {
    super(paramBasicMenuItem.caption());
    addActionListener(paramBasicMenuItem::lambda$new$0);
  }
  
  private static void lambda$new$0(BasicMenuItem paramBasicMenuItem, ActionEvent paramActionEvent) {
    paramBasicMenuItem.action();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzaa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */