package burp;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JTable;

class Zm29 extends Zm2i {
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    super.getTableCellRendererComponent(paramJTable, "", paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    putClientProperty(Zsyx.class, paramObject);
    return this;
  }
  
  public void paintComponent(Graphics paramGraphics) {
    super.paintComponent(paramGraphics);
    Zsyx zsyx = (Zsyx)getClientProperty(Zsyx.class);
    paramGraphics.translate(1, 2);
    int i = (int)((Zrt.Zx() - 2.0F) * 5.0F);
    int j = (int)(Zrt.Zx() - 4.0F);
    Zm9c.ZN(paramGraphics, zsyx.Zm(), i, j);
    paramGraphics.translate(-1, -2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm29.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */