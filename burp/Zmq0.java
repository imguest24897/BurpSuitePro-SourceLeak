package burp;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;

public class Zmq0 extends Zmqw {
  private static Zbqc[] Zg;
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    Color color = Zz_a.Zo(paramJTable, paramInt1);
    if (color != null)
      setForeground(color); 
    return this;
  }
  
  public static void ZJ(Zbqc[] paramArrayOfZbqc) {
    Zg = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZP() {
    return Zg;
  }
  
  static {
    if (ZP() != null)
      ZJ(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmq0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */