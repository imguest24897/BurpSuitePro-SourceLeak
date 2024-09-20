package burp;

import java.awt.Component;
import javax.swing.JTable;

class Zm2d extends Zm2i {
  private final Ze9n ZD = Ze3m.ZC(Zeuf.LOCK, Zlkk.INSPECTOR_TABLE_LOCK).ZU(Zmcx.SMALL_LINE_SIZE).Z_();
  
  Zm2d() {
    setIconTextGap(0);
    setHorizontalAlignment(0);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    int[] arrayOfInt = Ze3m.ZJ();
    super.getTableCellRendererComponent(paramJTable, "", paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    if (((Boolean)paramObject).booleanValue()) {
      setIcon(this.ZD);
      if (arrayOfInt == null) {
        setIcon(null);
        return this;
      } 
      return this;
    } 
    setIcon(null);
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */