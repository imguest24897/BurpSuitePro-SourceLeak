package burp;

import java.awt.Component;
import javax.swing.JTable;

public class Zzgj extends Zzgf {
  private static final Zbgn Zb = new Zbg1();
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    return (paramObject == null) ? Zb.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2) : super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzgj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */