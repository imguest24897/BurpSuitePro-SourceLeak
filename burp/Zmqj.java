package burp;

import java.awt.Component;
import java.awt.Point;
import javax.swing.JTable;

public class Zmqj extends Zmqf {
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Ze9n ze9n = (Ze9n)paramObject;
    boolean bool = Zm23.Zt();
    if (ZC(paramJTable, paramInt1, paramInt2)) {
      ze9n.Zx();
      if (bool) {
        ze9n.Zm();
        return super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
      } 
      return super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    } 
    ze9n.Zm();
    return super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }
  
  private boolean ZC(JTable paramJTable, int paramInt1, int paramInt2) {
    Point point = paramJTable.getMousePosition();
    return (point != null && paramJTable.getCellRect(paramInt1, paramInt2, false).contains(point));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmqj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */