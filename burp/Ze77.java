package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.KeyStroke;

public class Ze77 extends Ze7h implements ActionListener {
  private final int ZI;
  
  private final Zzyl ZJ;
  
  public Ze77(String paramString, KeyStroke paramKeyStroke, Zzyl paramZzyl, int paramInt) {
    super(paramString);
    if (paramKeyStroke != null && !Zb12.ZG())
      setAccelerator(paramKeyStroke); 
    addActionListener(this);
    this.ZI = paramInt;
    this.ZJ = paramZzyl;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.ZJ.ZI(this.ZI, this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze77.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */