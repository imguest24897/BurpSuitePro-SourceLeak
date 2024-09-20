package burp;

import java.awt.Component;
import javax.swing.JTable;

class Zmq7 extends Zm23 {
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Zg7g zg7g = (Zg7g)paramObject;
    Component component = super.getTableCellRendererComponent(paramJTable, zg7g.Zs(), paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    component.setEnabled(zg7g.ZK());
    return component;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmq7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */