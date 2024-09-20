package burp;

import java.awt.Component;
import javax.swing.AbstractButton;
import javax.swing.JTable;

class Zr22 extends Zr29 {
  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2) {
    if (paramObject instanceof Zg7g) {
      Zg7g zg7g = (Zg7g)paramObject;
      if (zg7g.ZK())
        this.delegate.setValue(Boolean.valueOf(zg7g.ZB())); 
    } 
    ((AbstractButton)this.editorComponent).setHorizontalAlignment(0);
    return this.editorComponent;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr22.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */