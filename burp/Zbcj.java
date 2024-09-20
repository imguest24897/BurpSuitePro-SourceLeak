package burp;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class Zbcj extends Zbc8 implements TableCellRenderer {
  Zbcj() {
    super((new Ze29(Zt00.BLOB_TABLE_FONT)).ZB());
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    int[] arrayOfInt = Ztpr.ZJx();
    if (paramObject instanceof Zebg) {
      Zebg zebg = (Zebg)paramObject;
      ZF(zebg.ZaK(), zebg.ZaU(), zebg.Za8(), zebg.Zab());
      if (arrayOfInt != null) {
        ZF(0, 0, 0, 0);
        Zeeb.Zh(this, paramJTable, paramBoolean1, paramInt1, paramInt2);
        return this;
      } 
      Zeeb.Zh(this, paramJTable, paramBoolean1, paramInt1, paramInt2);
      return this;
    } 
    ZF(0, 0, 0, 0);
    Zeeb.Zh(this, paramJTable, paramBoolean1, paramInt1, paramInt2);
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbcj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */