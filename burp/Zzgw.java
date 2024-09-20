package burp;

import com.fasterxml.Zor.Zyg;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;

class Zzgw extends Zzgf {
  private static final Border ZW = BorderFactory.createEmptyBorder(0, 2, 0, 0);
  
  private Zzgw() {
    setHorizontalAlignment(2);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    String str = Zyg.ZH();
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    boolean bool = (paramObject != null) ? true : false;
    setEnabled(bool);
    if (!bool)
      setSelected(true); 
    setBorder(BorderFactory.createCompoundBorder(getBorder(), ZW));
    if (Zbqc.Zwu() == null)
      Zyg.Zv("hvAFMb"); 
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzgw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */