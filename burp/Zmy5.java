package burp;

import java.awt.Component;
import java.util.function.Supplier;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class Zmy5 implements TableCellRenderer {
  private final Supplier<Boolean> ZK;
  
  private final Zm2c ZP;
  
  private final Zl80 Za;
  
  public Zmy5(Zmxv paramZmxv, Supplier<Boolean> paramSupplier) {
    this.ZK = paramSupplier;
    this.ZP = new Zm2c();
    this.Za = new Zl80(paramZmxv);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    TableCellRenderer tableCellRenderer = (TableCellRenderer)(((Boolean)this.ZK.get()).booleanValue() ? this.Za : this.ZP);
    return tableCellRenderer.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmy5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */