package burp;

import java.awt.Component;
import java.awt.Rectangle;
import java.io.Serializable;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public abstract class Zbgn extends Zbqc implements TableCellRenderer, Serializable {
  protected Zbgn() {
    Zeeb.ZK(this);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    if (paramJTable == null)
      return this; 
    Zq(paramObject);
    Zeeb.Zh(this, paramJTable, paramBoolean1, paramInt1, paramInt2);
    Zeeb.Zd(this, paramJTable, paramBoolean1, paramBoolean2, paramInt1);
    return this;
  }
  
  protected void Zq(Object paramObject) {}
  
  public boolean isOpaque() {
    return Zeeb.ZG(this, super.isOpaque());
  }
  
  public void repaint(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void repaint(Rectangle paramRectangle) {}
  
  public void repaint() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbgn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */