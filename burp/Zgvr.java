package burp;

import java.awt.Component;
import java.util.EventObject;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;

class Zgvr implements TableCellEditor {
  private final Zbws Zl;
  
  private final TableCellEditor ZU;
  
  private Zgvr(Zbws paramZbws) {
    this.Zl = paramZbws;
    this.ZU = paramZbws.getDefaultEditor(String.class);
  }
  
  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2) {
    Component component = this.ZU.getTableCellEditorComponent(paramJTable, paramObject, paramBoolean, paramInt1, paramInt2);
    component.setFont(this.Zl.getFont());
    return component;
  }
  
  public Object getCellEditorValue() {
    return this.ZU.getCellEditorValue();
  }
  
  public boolean isCellEditable(EventObject paramEventObject) {
    return this.ZU.isCellEditable(paramEventObject);
  }
  
  public boolean shouldSelectCell(EventObject paramEventObject) {
    return this.ZU.shouldSelectCell(paramEventObject);
  }
  
  public boolean stopCellEditing() {
    return this.ZU.stopCellEditing();
  }
  
  public void cancelCellEditing() {
    this.ZU.cancelCellEditing();
  }
  
  public void addCellEditorListener(CellEditorListener paramCellEditorListener) {
    this.ZU.addCellEditorListener(paramCellEditorListener);
  }
  
  public void removeCellEditorListener(CellEditorListener paramCellEditorListener) {
    this.ZU.removeCellEditorListener(paramCellEditorListener);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */