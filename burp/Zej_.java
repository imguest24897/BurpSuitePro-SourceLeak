package burp;

import java.awt.Component;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

class Zej_ implements Zxj4, TableCellRenderer {
  private final Zmuy Zp;
  
  private final TableColumnModel Zr;
  
  private final boolean ZT;
  
  public Zej_(Zmuy paramZmuy, TableColumnModel paramTableColumnModel, boolean paramBoolean) {
    this.Zp = paramZmuy;
    this.Zr = paramTableColumnModel;
    this.ZT = paramBoolean;
  }
  
  public void ZW(MouseEvent paramMouseEvent, JTableHeader paramJTableHeader) {
    boolean bool = (paramMouseEvent.getClickCount() == 1) ? true : false;
    if (this.ZT && bool && paramMouseEvent.isControlDown()) {
      ZY(paramMouseEvent);
      paramMouseEvent.consume();
    } 
  }
  
  private void ZY(MouseEvent paramMouseEvent) {
    int i = paramMouseEvent.getX();
    int j = this.Zr.getColumnIndexAtX(i);
    if (j != -1)
      this.Zp.ZT(j); 
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    TableCellRenderer tableCellRenderer = paramJTable.getTableHeader().getDefaultRenderer();
    return tableCellRenderer.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zej_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */