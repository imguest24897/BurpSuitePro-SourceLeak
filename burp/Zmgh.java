package burp;

import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class Zmgh extends Zmg2 implements TableCellRenderer {
  public Zmgh() {
    Zeeb.ZK(this);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    if (paramJTable == null)
      return this; 
    setEnabled(paramJTable.isEnabled());
    Zj(paramObject);
    Zeeb.Zh(this, paramJTable, paramBoolean1, paramInt1, paramInt2);
    Zeeb.Zd(this, paramJTable, paramBoolean1, paramBoolean2, paramInt1);
    return this;
  }
  
  protected void Zj(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: instanceof java/lang/Boolean
    //   5: ifeq -> 24
    //   8: aload_1
    //   9: checkcast java/lang/Boolean
    //   12: astore_2
    //   13: aload_2
    //   14: invokevirtual booleanValue : ()Z
    //   17: ifeq -> 24
    //   20: iconst_1
    //   21: goto -> 25
    //   24: iconst_0
    //   25: invokevirtual setSelected : (Z)V
    //   28: return
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmgh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */