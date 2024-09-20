package burp;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;

class Zzgz extends Zzgf {
  private static final Border Zs = BorderFactory.createEmptyBorder(0, 2, 0, 0);
  
  private Zzgz() {
    setHorizontalAlignment(2);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    int[] arrayOfInt = Ze3m.ZJ();
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    boolean bool = (paramObject != null) ? true : false;
    setEnabled(bool);
    if (!bool)
      setSelected(true); 
    setBorder(BorderFactory.createCompoundBorder(getBorder(), Zs));
    if (Zbqc.Zwu() == null)
      Ze3m.ZQ(new int[5]); 
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzgz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */