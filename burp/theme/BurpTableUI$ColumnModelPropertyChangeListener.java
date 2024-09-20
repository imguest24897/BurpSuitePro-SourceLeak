package burp.theme;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.table.TableColumnModel;

class BurpTableUI$ColumnModelPropertyChangeListener implements PropertyChangeListener {
  final BurpTableUI this$0;
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    Object object = paramPropertyChangeEvent.getOldValue();
    if (object instanceof TableColumnModel) {
      TableColumnModel tableColumnModel = (TableColumnModel)object;
      tableColumnModel.removeColumnModelListener(BurpTableUI.this.chameleonNoColumnListener);
    } 
    object = paramPropertyChangeEvent.getNewValue();
    if (object instanceof TableColumnModel) {
      TableColumnModel tableColumnModel = (TableColumnModel)object;
      tableColumnModel.addColumnModelListener(BurpTableUI.this.chameleonNoColumnListener);
    } 
    BurpTableUI.this.noColumnEmptyStatePanel.setVisible((BurpTableUI.access$1800(BurpTableUI.this).getColumnModel().getColumnCount() == 0 && BurpTableUI.access$1900(BurpTableUI.this).getModel().getRowCount() != 0));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpTableUI$ColumnModelPropertyChangeListener.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */