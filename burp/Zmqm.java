package burp;

import java.awt.Component;
import javax.swing.JTable;

class Zmqm extends Zm23 {
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Zgi zgi = (Zgi)paramObject;
    Component component = super.getTableCellRendererComponent(paramJTable, zgi.Zo(), paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    component.setEnabled(zgi.ZY());
    return component;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmqm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */