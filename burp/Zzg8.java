package burp;

import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

public class Zzg8 extends Zzdy implements TableCellRenderer {
  private static final Border Zk = BorderFactory.createEmptyBorder(0, 5, 0, 0);
  
  public Zzg8() {
    Zeeb.ZK(this);
    setHorizontalAlignment(2);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    if (paramJTable == null)
      return this; 
    setEnabled(paramJTable.isEnabled());
    ZE(paramObject);
    Zeeb.Zh(this, paramJTable, paramBoolean1, paramInt1, paramInt2);
    Zeeb.Zd(this, paramJTable, paramBoolean1, paramBoolean2, paramInt1);
    if (paramInt2 == 0 && (getHorizontalAlignment() == 2 || getHorizontalAlignment() == 10))
      setBorder(BorderFactory.createCompoundBorder(getBorder(), Zk)); 
    return this;
  }
  
  protected void ZE(Object paramObject) {
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzg8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */