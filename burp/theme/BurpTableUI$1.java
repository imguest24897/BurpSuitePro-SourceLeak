package burp.theme;

import burp.Zbws;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JTable;

class BurpTableUI$1 extends ComponentAdapter {
  final BurpTableUI this$0;
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    JTable jTable = BurpTableUI.access$000(BurpTableUI.this);
    if (jTable instanceof Zbws) {
      Zbws zbws = (Zbws)jTable;
      if (zbws.Zp())
        BurpTableUI.access$100(BurpTableUI.this).doLayout(); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpTableUI$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */