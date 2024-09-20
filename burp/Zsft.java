package burp;

import burp.api.montoya.ui.contextmenu.AuditIssueContextMenuEvent;
import burp.api.montoya.ui.contextmenu.ContextMenuEvent;
import burp.api.montoya.ui.contextmenu.ContextMenuItemsProvider;
import burp.api.montoya.ui.contextmenu.WebSocketContextMenuEvent;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JMenuItem;

public class Zsft implements ContextMenuItemsProvider {
  private final IContextMenuFactory ZM;
  
  private final Zbnt Ze;
  
  private final Zzqf Zt;
  
  public Zsft(IContextMenuFactory paramIContextMenuFactory, Zbnt paramZbnt, Zzqf paramZzqf) {
    this.ZM = paramIContextMenuFactory;
    this.Ze = paramZbnt;
    this.Zt = paramZzqf;
  }
  
  public List<Component> provideMenuItems(ContextMenuEvent paramContextMenuEvent) {
    byte b = Zzgg.ZT(paramContextMenuEvent.invocationType());
    List<JMenuItem> list = (b != -1) ? this.ZM.createMenuItems(new Zr38(paramContextMenuEvent, this.Ze, this.Zt, b)) : null;
    return (list == null) ? Collections.<Component>emptyList() : new ArrayList<>((Collection)list);
  }
  
  public List<Component> provideMenuItems(WebSocketContextMenuEvent paramWebSocketContextMenuEvent) {
    return Collections.emptyList();
  }
  
  public List<Component> provideMenuItems(AuditIssueContextMenuEvent paramAuditIssueContextMenuEvent) {
    return Collections.emptyList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsft.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */