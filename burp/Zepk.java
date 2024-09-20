package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.KeyStroke;

public class Zepk extends Zepe implements ActionListener {
  private final int ZM;
  
  private final Zzyl ZD;
  
  Zepk(String paramString, Icon paramIcon, KeyStroke paramKeyStroke, Zzyl paramZzyl, int paramInt) {
    super(paramString, paramIcon);
    if (paramKeyStroke != null && !Zb12.ZG())
      setAccelerator(paramKeyStroke); 
    addActionListener(this);
    this.ZM = paramInt;
    this.ZD = paramZzyl;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.ZD.ZI(this.ZM, this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zepk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */