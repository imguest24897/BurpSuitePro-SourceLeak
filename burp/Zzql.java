package burp;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;

class Zzql extends DefaultCellEditor {
  final Zlxk ZC;
  
  Zzql(Zlxk paramZlxk, Zedd<?> paramZedd) {
    super(paramZedd);
  }
  
  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2) {
    this.ZC.ZV = (paramObject instanceof String) ? (String)paramObject : paramObject.toString();
    return super.getTableCellEditorComponent(paramJTable, paramObject, paramBoolean, paramInt1, paramInt2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzql.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */