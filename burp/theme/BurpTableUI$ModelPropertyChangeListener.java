package burp.theme;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.table.TableModel;

class BurpTableUI$ModelPropertyChangeListener implements PropertyChangeListener {
  final BurpTableUI this$0;
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    Object object = paramPropertyChangeEvent.getOldValue();
    if (object instanceof TableModel) {
      TableModel tableModel = (TableModel)object;
      tableModel.removeTableModelListener(BurpTableUI.this.noRowListener);
    } 
    object = paramPropertyChangeEvent.getNewValue();
    if (object instanceof TableModel) {
      TableModel tableModel = (TableModel)object;
      tableModel.addTableModelListener(BurpTableUI.this.noRowListener);
    } 
    BurpTableUI.setEmptyStateVisibility(BurpTableUI.access$1700(BurpTableUI.this), BurpTableUI.this.noColumnEmptyStatePanel);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpTableUI$ModelPropertyChangeListener.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */