package burp;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JTable;

class Zm22 extends Zm2i {
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    super.getTableCellRendererComponent(paramJTable, "", paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    putClientProperty(Zzog.class, paramObject);
    return this;
  }
  
  public void paintComponent(Graphics paramGraphics) {
    super.paintComponent(paramGraphics);
    Zzog zzog = (Zzog)getClientProperty(Zzog.class);
    int i = (int)(Zrt.Zx() - Zbz3.ZK(Zxpj.PANEL_STAR_EMPTY_SMALL).getIconHeight());
    int j = (int)Math.ceil(i / 2.0D);
    paramGraphics.translate(j, j);
    Zm2z.Zb(paramGraphics, zzog.Zk(), Zbz3.ZK(Zxpj.PANEL_STAR_EMPTY_SMALL), Zbz3.ZK(Zxpj.PANEL_STAR_FULL_SMALL));
    paramGraphics.translate(-j, -j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm22.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */