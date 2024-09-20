package burp;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class Zbcf extends Zbc8 implements TableCellRenderer {
  private Zbcf() {
    super((new Ze29(Zt00.BLOB_TABLE_FONT)).Zb(2).ZB());
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    ZY(paramObject);
    Zeeb.Zh(this, paramJTable, paramBoolean1, paramInt1, paramInt2);
    Zeeb.Zd(this, paramJTable, paramBoolean1, paramBoolean2, paramInt1);
    return this;
  }
  
  private void ZY(Object paramObject) {
    if (paramObject instanceof Zbza) {
      Zbza zbza = (Zbza)paramObject;
      ZF(zbza.ZgS(), zbza.Zg9(), zbza.ZgH(), zbza.ZgJ());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbcf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */