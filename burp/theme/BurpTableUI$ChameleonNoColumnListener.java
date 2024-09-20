package burp.theme;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableColumnModelListener;

class BurpTableUI$ChameleonNoColumnListener implements TableColumnModelListener {
  final BurpTableUI this$0;
  
  public void columnAdded(TableColumnModelEvent paramTableColumnModelEvent) {
    updateChameleonVisibility();
  }
  
  private void updateChameleonVisibility() {
    BurpTableUI.setEmptyStateVisibility(BurpTableUI.access$1600(BurpTableUI.this), BurpTableUI.this.noColumnEmptyStatePanel);
  }
  
  public void columnRemoved(TableColumnModelEvent paramTableColumnModelEvent) {
    updateChameleonVisibility();
  }
  
  public void columnMoved(TableColumnModelEvent paramTableColumnModelEvent) {}
  
  public void columnMarginChanged(ChangeEvent paramChangeEvent) {}
  
  public void columnSelectionChanged(ListSelectionEvent paramListSelectionEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpTableUI$ChameleonNoColumnListener.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */