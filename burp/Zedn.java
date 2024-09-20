package burp;

import java.awt.Component;
import javax.swing.JList;

class Zedn extends Zedw {
  final Zlxk ZA;
  
  private Zedn(Zlxk paramZlxk) {}
  
  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    setText(this.ZA.ZV);
    setOpaque(true);
    if (paramInt >= 0) {
      Zmtd zmtd = Zmtd.ZC(paramInt);
      setBackground(zmtd.Zt());
      setForeground(zmtd.Zq());
    } 
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zedn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */