package burp;

import java.awt.EventQueue;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class Zl1p implements TableModelListener {
  final Zg8x ZT;
  
  Zl1p(Zg8x paramZg8x) {}
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    if (paramTableModelEvent.getType() == 0 && paramTableModelEvent.getFirstRow() == 0 && paramTableModelEvent.getLastRow() == Integer.MAX_VALUE && paramTableModelEvent.getColumn() == -1) {
      EventQueue.invokeLater(this::lambda$tableChanged$0);
      this.ZT.Zs.removeTableModelListener(this);
    } 
  }
  
  private void lambda$tableChanged$0() {
    if (this.ZT.Zd.getRowCount() > 0)
      this.ZT.Zd.changeSelection(0, 0, false, false); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl1p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */