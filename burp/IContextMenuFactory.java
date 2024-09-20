package burp;

import java.util.List;
import javax.swing.JMenuItem;

public interface IContextMenuFactory {
  List<JMenuItem> createMenuItems(IContextMenuInvocation paramIContextMenuInvocation);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IContextMenuFactory.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */