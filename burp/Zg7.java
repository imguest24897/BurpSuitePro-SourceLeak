package burp;

import java.util.Comparator;
import javax.swing.SortOrder;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public interface Zg7<E> {
  default Object ZV(int paramInt) {
    return null;
  }
  
  default TableCellRenderer Zt(int paramInt) {
    return null;
  }
  
  default TableCellRenderer ZC(int paramInt) {
    return null;
  }
  
  default TableCellEditor Zz(int paramInt) {
    return null;
  }
  
  default int ZS(int paramInt) {
    return 75;
  }
  
  default int ZJ(int paramInt) {
    return Math.max(0, ZS(paramInt));
  }
  
  default int ZM(int paramInt) {
    return Math.min(15, ZS(paramInt));
  }
  
  default int ZH(int paramInt) {
    return Integer.MAX_VALUE;
  }
  
  default boolean Ze(int paramInt) {
    return true;
  }
  
  default boolean ZY(int paramInt) {
    return true;
  }
  
  default boolean Zr(int paramInt) {
    return true;
  }
  
  default boolean ZU(int paramInt) {
    return true;
  }
  
  default boolean Zx(String paramString) {
    return true;
  }
  
  default Comparator<?> Zg(int paramInt) {
    return null;
  }
  
  default Zlcu ZR(int paramInt) {
    return null;
  }
  
  default SortOrder Zc(int paramInt) {
    return SortOrder.UNSORTED;
  }
  
  default boolean Zl(int paramInt) {
    return false;
  }
  
  default TableColumn ZK(int paramInt) {
    TableColumn tableColumn = new TableColumn(paramInt);
    tableColumn.setIdentifier(ZV(paramInt));
    tableColumn.setHeaderRenderer(Zt(paramInt));
    tableColumn.setCellRenderer(ZC(paramInt));
    tableColumn.setCellEditor(Zz(paramInt));
    tableColumn.setMinWidth(ZM(paramInt));
    tableColumn.setMaxWidth(ZH(paramInt));
    tableColumn.setPreferredWidth(ZJ(paramInt));
    tableColumn.setWidth(ZS(paramInt));
    tableColumn.setResizable(Ze(paramInt));
    return tableColumn;
  }
  
  Object ZS(int paramInt, E paramE);
  
  void ZB(int paramInt, E paramE, Object paramObject);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */