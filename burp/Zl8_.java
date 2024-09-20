package burp;

import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class Zl8_ extends Zl86 implements TableCellRenderer {
  private final Zmx7 ZD;
  
  public Zl8_() {
    this(new Zmx7());
  }
  
  public Zl8_(Zmx7 paramZmx7) {
    this.ZD = paramZmx7;
    Zeeb.ZK(this);
    setLineWrap(true);
    setEditable(false);
    setFocusable(false);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    if (paramJTable == null)
      return this; 
    setFont(paramJTable.getFont());
    setSize(paramJTable.getColumnModel().getColumn(paramInt2).getWidth(), paramJTable.getRowHeight());
    setEnabled(paramJTable.isEnabled());
    Zq(paramObject);
    this.ZD.Zj(paramInt1, paramInt2, (getPreferredSize()).height);
    int i = this.ZD.Ze(paramInt1);
    if (paramJTable.getRowHeight(paramInt1) != i)
      paramJTable.setRowHeight(paramInt1, i); 
    Zeeb.Zh(this, paramJTable, paramBoolean1, paramInt1, paramInt2);
    Zeeb.Zd(this, paramJTable, paramBoolean1, paramBoolean2, paramInt1);
    return this;
  }
  
  protected void Zq(Object paramObject) {
    setText((paramObject == null) ? "" : paramObject.toString());
  }
  
  public boolean isOpaque() {
    return Zeeb.ZG(this, super.isOpaque());
  }
  
  public void invalidate() {}
  
  public void validate() {}
  
  public void revalidate() {}
  
  public void repaint(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void repaint(Rectangle paramRectangle) {}
  
  public void repaint() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl8_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */