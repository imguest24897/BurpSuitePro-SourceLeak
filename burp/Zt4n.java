package burp;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;

public class Zt4n implements TableCellEditor {
  private final Zxtu Zz;
  
  private final Zt8j Zd;
  
  private final Supplier<Boolean> ZK;
  
  private TableCellEditor Zc;
  
  public Zt4n(Zbws paramZbws, Function<Integer, Zb6u> paramFunction, Zgtm paramZgtm, Zlns paramZlns, Zmxv paramZmxv, Supplier<Boolean> paramSupplier) {
    this.ZK = paramSupplier;
    this.Zz = Zxtu.ZH(paramZbws, paramFunction, paramZgtm, paramZlns);
    this.Zd = Zt8j.ZN(paramZbws, paramFunction, paramZgtm, paramZlns, paramZmxv);
  }
  
  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2) {
    this.Zc = ((Boolean)this.ZK.get()).booleanValue() ? this.Zd : this.Zz;
    return this.Zc.getTableCellEditorComponent(paramJTable, paramObject, paramBoolean, paramInt1, paramInt2);
  }
  
  public Object getCellEditorValue() {
    return this.Zc.getCellEditorValue();
  }
  
  public boolean isCellEditable(EventObject paramEventObject) {
    return (paramEventObject instanceof MouseEvent) ? ((((MouseEvent)paramEventObject).getClickCount() >= 2)) : true;
  }
  
  public boolean shouldSelectCell(EventObject paramEventObject) {
    return true;
  }
  
  public boolean stopCellEditing() {
    return this.Zc.stopCellEditing();
  }
  
  public void cancelCellEditing() {
    this.Zc.cancelCellEditing();
  }
  
  public void addCellEditorListener(CellEditorListener paramCellEditorListener) {
    this.Zc.addCellEditorListener(paramCellEditorListener);
  }
  
  public void removeCellEditorListener(CellEditorListener paramCellEditorListener) {
    this.Zc.removeCellEditorListener(paramCellEditorListener);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt4n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */