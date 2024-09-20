package burp;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import net.portswigger.Zkd;

class Zzgx extends Zzgf {
  private static final Border Ze = BorderFactory.createEmptyBorder(0, 2, 0, 0);
  
  private Zzgx() {
    setHorizontalAlignment(2);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    boolean bool = Zkd.Zz();
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    boolean bool1 = (paramObject != null) ? true : false;
    setEnabled(bool1);
    if (!bool1)
      setSelected(true); 
    setBorder(BorderFactory.createCompoundBorder(getBorder(), Ze));
    if (Zbqc.Zwu() == null)
      Zkd.Zp(!bool); 
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzgx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */