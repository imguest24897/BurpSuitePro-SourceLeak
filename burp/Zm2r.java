package burp;

import java.awt.Component;
import javax.swing.JTable;

class Zm2r extends Zm2i {
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    setToolTipText((String)paramObject);
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */