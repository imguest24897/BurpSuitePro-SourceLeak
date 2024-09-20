package burp;

import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JTable;

class Zm2c extends Zm2i {
  private final Zmxv Za = new Zmxv();
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Zlkk zlkk1 = (paramInt2 == 0) ? Zlkk.INSPECTOR_TABLE_ENTRY_NAME_FOREGROUND : Zlkk.INSPECTOR_TABLE_ENTRY_VALUE_FOREGROUND;
    JComponent jComponent = (JComponent)super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    jComponent.setBorder(Zbd7.ZA);
    jComponent.setForeground(zlkk1.ZS());
    jComponent.setToolTipText((paramObject == null) ? null : paramObject.toString());
    int i = (getPreferredSize()).height;
    this.Za.Zj(paramInt1, paramInt2, i);
    int j = this.Za.Ze(paramInt1);
    if (paramJTable.getRowHeight(paramInt1) != j)
      paramJTable.setRowHeight(paramInt1, j); 
    Zlkk zlkk2 = paramBoolean1 ? Zlkk.INSPECTOR_TABLE_ROW_HIGHLIGHT_BACKGROUND : Zlkk.INSPECTOR_TABLE_BACKGROUND;
    ZO(zlkk2);
    return jComponent;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */