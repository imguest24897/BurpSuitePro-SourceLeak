package burp;

import java.awt.event.ActionEvent;

public class Zzfz extends Zz85 {
  private final boolean Zi;
  
  public Zzfz(String paramString, boolean paramBoolean) {
    super(paramString);
    this.Zi = paramBoolean;
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    int i = Zz85.Zm();
    if (this.Zi) {
      paramZmgw.moveCaretPosition(0);
      if (i != 0) {
        paramZmgw.setCaretPosition(0);
        return;
      } 
      return;
    } 
    paramZmgw.setCaretPosition(0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */