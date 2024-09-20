package burp;

import java.awt.Component;
import java.awt.Font;
import java.awt.Rectangle;
import java.io.Serializable;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

public class Zm23 extends Zm99 implements TableCellRenderer, Serializable {
  private static final Border ZN = BorderFactory.createEmptyBorder(0, 5, 0, 0);
  
  private final boolean Zl;
  
  private static boolean Zt;
  
  public Zm23() {
    this(false);
  }
  
  public Zm23(boolean paramBoolean) {
    this.Zl = paramBoolean;
    Zeeb.ZK(this);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    if (paramJTable == null)
      return this; 
    setFont(Zb(paramJTable));
    Zt(paramObject);
    Zeeb.Zh(this, paramJTable, paramBoolean1, paramInt1, paramInt2);
    Zeeb.Zd(this, paramJTable, paramBoolean1, paramBoolean2, paramInt1);
    if (paramInt2 == 0)
      setBorder(BorderFactory.createCompoundBorder(getBorder(), ZN)); 
    return this;
  }
  
  protected Font Zb(JTable paramJTable) {
    return paramJTable.getFont();
  }
  
  protected void Zt(Object paramObject) {
    String str = Objects.toString(paramObject, "");
    setText(str);
    if (this.Zl)
      setToolTipText(str); 
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
  
  static {
    Zd(false);
  }
  
  public static void Zd(boolean paramBoolean) {
    Zt = paramBoolean;
  }
  
  public static boolean Zt() {
    return Zt;
  }
  
  public static boolean ZO() {
    boolean bool = Zt();
    return !bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm23.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */