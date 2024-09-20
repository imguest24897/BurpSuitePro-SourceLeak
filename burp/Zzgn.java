package burp;

import java.awt.Component;
import javax.swing.JTable;

class Zzgn extends Zzgf {
  final Zt_b Zd;
  
  private Zzgn(Zt_b paramZt_b) {}
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Component component = super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    if (paramInt2 == 0)
      component.setEnabled(this.Zd.ZT); 
    return component;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzgn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */