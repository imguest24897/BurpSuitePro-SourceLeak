package burp;

import java.awt.event.ActionEvent;
import net.portswigger.Zzc;

public class Zzf4 extends Zzf0 {
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    if (!paramZmgw.isEditable() || !paramZmgw.isEnabled())
      return; 
    if (((Zmgn)paramZmgw).Zc()) {
      String str = paramActionEvent.getActionCommand();
      if (str != null && str.length() > 0) {
        String str1 = Zo(paramActionEvent.getActionCommand().charAt(0));
        paramZmgw.ZJ();
        try {
          byte b = 0;
          while (b < str1.length()) {
            ActionEvent actionEvent = new ActionEvent(paramActionEvent.getSource(), paramActionEvent.getID(), str1.substring(b, b + 1), paramActionEvent.getModifiers());
            super.Zp(actionEvent, paramZmgw);
            b++;
            if (arrayOfZbqc != null)
              break; 
          } 
        } finally {
          paramZmgw.ZA();
        } 
      } 
      if (arrayOfZbqc != null) {
        super.Zp(paramActionEvent, paramZmgw);
        return;
      } 
      return;
    } 
    super.Zp(paramActionEvent, paramZmgw);
  }
  
  private String Zo(char paramChar) {
    return Zzc.Zd("" + paramChar);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzf4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */