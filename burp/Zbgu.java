package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;

public class Zbgu extends Zbgn {
  private static final Border Z_ = BorderFactory.createEmptyBorder(0, 5, 0, 0);
  
  private static final Ze9n ZH = Ze3m.ZC(Zeuf.CHECK, Zlkk.FOREGROUND).Z_();
  
  private final Zm99 Zx = new Zm99("");
  
  public Zbgu() {
    setLayout(new BorderLayout());
    add(this.Zx);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    if (paramInt2 == 0 && (this.Zx.getHorizontalAlignment() == 2 || this.Zx.getHorizontalAlignment() == 10))
      setBorder(BorderFactory.createCompoundBorder(getBorder(), Z_)); 
    return this;
  }
  
  protected void Zp(int paramInt) {
    this.Zx.setHorizontalAlignment(paramInt);
  }
  
  protected void Zq(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof java/lang/Boolean
    //   4: ifeq -> 25
    //   7: aload_1
    //   8: checkcast java/lang/Boolean
    //   11: astore_3
    //   12: aload_3
    //   13: invokevirtual booleanValue : ()Z
    //   16: ifeq -> 25
    //   19: getstatic burp/Zbgu.ZH : Lburp/Ze9n;
    //   22: goto -> 26
    //   25: aconst_null
    //   26: astore_2
    //   27: aload_0
    //   28: getfield Zx : Lburp/Zm99;
    //   31: aload_2
    //   32: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   35: return
  }
  
  public String toString() {
    return String.valueOf((this.Zx.getIcon() == ZH));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbgu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */