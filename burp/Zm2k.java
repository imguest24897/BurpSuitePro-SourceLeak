package burp;

import java.awt.Component;
import javax.swing.JTable;

class Zm2k extends Zm2a {
  final Ztn1 ZG;
  
  private Zm2k(Ztn1 paramZtn1) {
    super(paramZtn1);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    boolean bool = this.ZG.Zk(paramJTable.convertRowIndexToModel(paramInt1));
    setForeground(bool ? Zlkk.MAP_NODE_REQUESTED.ZS() : Zlkk.MAP_NODE_NOT_REQUESTED.ZS());
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */