package burp;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;

class Zzg6 extends Zzgj {
  private static final Border ZZ = BorderFactory.createEmptyBorder(0, 4, 0, 0);
  
  private Zzg6() {
    setHorizontalAlignment(2);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Component component = super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    setBorder(BorderFactory.createCompoundBorder(getBorder(), ZZ));
    return component;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzg6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */