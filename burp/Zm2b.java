package burp;

import java.awt.Component;
import java.util.function.Function;
import javax.swing.JTable;

public class Zm2b extends Zm2i {
  private final Function<Integer, String> Zk;
  
  public Zm2b(Function<Integer, String> paramFunction) {
    this.Zk = paramFunction;
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Component component = super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    String str = this.Zk.apply(Integer.valueOf(paramInt1));
    setToolTipText(str);
    return component;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */