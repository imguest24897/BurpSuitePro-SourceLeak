package burp;

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JList;

class Zbo6 extends Zbol {
  private final Icon Zt = Ze3m.ZC(Zeuf.OPEN_BOOK, Zlkk.FOREGROUND).Z_();
  
  public Component getListCellRendererComponent(JList<?> paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    Zg3w zg3w = (Zg3w)paramObject;
    super.getListCellRendererComponent(paramJList, zg3w.ZM(), paramInt, paramBoolean1, false);
    setIcon(this.Zt);
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbo6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */