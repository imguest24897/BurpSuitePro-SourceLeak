package burp;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;

public class Zmqy extends Zm23 {
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Zbqc[] arrayOfZbqc = Zmq0.ZP();
    if (paramObject instanceof Number) {
      Number number = (Number)paramObject;
      if (number.intValue() == 0)
        paramObject = ""; 
    } 
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    Color color = Zz_a.Zo(paramJTable, paramInt1);
    if (color != null)
      setForeground(color); 
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[3]); 
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmqy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */