package burp;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;

public class Zbgz extends Zbgl {
  private final Zm99 ZW = new Zm99();
  
  public Zbgz() {
    this.ZW.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    add(this.ZW, 0);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    this.ZW.setText(String.valueOf(paramObject));
    return super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }
  
  int Zm() {
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbgz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */