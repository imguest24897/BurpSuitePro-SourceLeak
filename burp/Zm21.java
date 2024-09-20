package burp;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableModel;

class Zm21 extends Zm23 {
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    TableModel tableModel = paramJTable.getModel();
    if (tableModel instanceof Zmud) {
      Zmud zmud = (Zmud)tableModel;
      int i = paramJTable.convertRowIndexToModel(paramInt1);
      Zt00 zt00 = zmud.Zs(i) ? Zt00.BOLD_FONT : Zt00.DEFAULT_FONT;
      ZE(zt00);
    } 
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm21.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */