package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.KeyStroke;

public class Zsu5 extends Zsuy implements ActionListener {
  private final int ZP;
  
  private final Zzyl ZI;
  
  public Zsu5(String paramString, KeyStroke paramKeyStroke, Zzyl paramZzyl, int paramInt) {
    super(paramString);
    if (paramKeyStroke != null && !Zb12.ZG())
      setAccelerator(paramKeyStroke); 
    addActionListener(this);
    this.ZP = paramInt;
    this.ZI = paramZzyl;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.ZI.ZI(this.ZP, this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsu5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */