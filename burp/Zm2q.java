package burp;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zm2q extends Zm2i {
  private final Ztnv Zc;
  
  Zm2q(Ztnv paramZtnv) {
    this.Zc = paramZtnv;
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    Zei9 zei9 = this.Zc.ZY(paramInt1);
    Color color = ((Zlkk)Zg9j.Zk.get(zei9.Zd)).ZS();
    if (color == null) {
      Zuh.ZT(false, Zqf.Zx, String.valueOf(zei9.Zd));
      color = Color.BLACK;
    } 
    setForeground(color);
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */