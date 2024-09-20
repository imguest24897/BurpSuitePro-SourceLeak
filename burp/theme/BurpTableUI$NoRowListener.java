package burp.theme;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class BurpTableUI$NoRowListener implements TableModelListener {
  final BurpTableUI this$0;
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    BurpTableUI.setEmptyStateVisibility(BurpTableUI.access$1200(BurpTableUI.this), BurpTableUI.this.noColumnEmptyStatePanel);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpTableUI$NoRowListener.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */