package burp;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

class Zmqd extends Zm23 {
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Zt6y zt6y = (Zt6y)paramObject;
    Component component = super.getTableCellRendererComponent(paramJTable, zt6y.ZbI(), paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    if (component instanceof Zm23) {
      Zm23 zm23 = (Zm23)component;
      Ze9n ze9n = zt6y.Zbu();
      zm23.setIcon(ze9n);
      zm23.setIconTextGap(15);
      zm23.ZE(Zt00.TITLE_PLAIN_FONT);
      zm23.setBorder(new EmptyBorder(10, 20, 10, 20));
    } 
    return component;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmqd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */