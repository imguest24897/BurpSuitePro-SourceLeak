package burp;

import java.awt.Component;
import java.util.function.Consumer;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

class Zg32 implements TableModelListener {
  private final TableModel ZZ;
  
  private final Component ZS;
  
  private final Consumer<Zsgq> Zm;
  
  private Zg32(TableModel paramTableModel, Component paramComponent, Consumer<Zsgq> paramConsumer) {
    this.ZZ = paramTableModel;
    this.ZS = paramComponent;
    this.Zm = paramConsumer;
  }
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    if (this.ZZ.getRowCount() == 0 || paramTableModelEvent.getType() == -1)
      this.Zm.accept(null); 
    if (paramTableModelEvent.getColumn() == Zb2j.ENABLED.Zp())
      this.ZS.repaint(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg32.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */