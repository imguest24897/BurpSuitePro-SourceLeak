package burp;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class Zmq_ extends Zmqw {
  private final Zl2z ZG;
  
  public Zmq_(Zl2z paramZl2z) {
    this.ZG = paramZl2z;
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    TableModel tableModel = paramJTable.getModel();
    if (tableModel instanceof Zmin) {
      Zmin zmin = (Zmin)tableModel;
      int i = paramJTable.convertRowIndexToModel(paramInt1);
      Zz_1 zz_1 = zmin.Zs(i);
      if (zz_1 != null)
        Zz_a.Zm(this, zz_1, this.ZG); 
    } 
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmq_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */