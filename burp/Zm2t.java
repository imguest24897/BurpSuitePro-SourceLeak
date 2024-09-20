package burp;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JTable;

public class Zm2t extends Zm2i {
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    super.getTableCellRendererComponent(paramJTable, "", paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    Rectangle rectangle = paramJTable.getCellRect(paramInt1, paramInt2, false);
    boolean bool = (paramObject != null && ((Boolean)paramObject).booleanValue()) ? true : false;
    putClientProperty(Zkcz.class, new Zkcz(bool, rectangle));
    return this;
  }
  
  public void paintComponent(Graphics paramGraphics) {
    super.paintComponent(paramGraphics);
    Zkcz zkcz = (Zkcz)getClientProperty(Zkcz.class);
    if (!zkcz.ZAd())
      return; 
    int i = (zkcz.ZAG()).width / 2 - 4;
    int j = (zkcz.ZAG()).height / 2 - 4;
    ((Graphics2D)paramGraphics).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    paramGraphics.setColor(Zlkk.BURP_TITLE.ZS());
    paramGraphics.fillOval(i, j, 8, 8);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */