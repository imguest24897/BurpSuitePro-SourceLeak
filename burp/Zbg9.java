package burp;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class Zbg9 extends Zbgu {
  private final Zl2z ZS;
  
  public Zbg9(Zl2z paramZl2z) {
    this.ZS = paramZl2z;
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    TableModel tableModel = paramJTable.getModel();
    Zbqc[] arrayOfZbqc = Zmq0.ZP();
    if (tableModel instanceof Zmin) {
      Zmin zmin = (Zmin)tableModel;
      int i = paramJTable.convertRowIndexToModel(paramInt1);
      Zz_1 zz_1 = zmin.Zs(i);
      if (zz_1 != null)
        Zz_a.Zm(this, zz_1, this.ZS); 
    } 
    if (Zbqc.Zwu() == null)
      Zmq0.ZJ(new Zbqc[5]); 
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbg9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */