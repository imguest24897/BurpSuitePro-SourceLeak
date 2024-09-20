package burp;

import java.awt.event.ActionEvent;

public class Zzf9 extends Zz85 {
  private final boolean ZC;
  
  public Zzf9(String paramString, boolean paramBoolean) {
    super(paramString);
    this.ZC = paramBoolean;
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    int i = Zz85.Zm();
    int j = Ze(paramZmgw);
    if (this.ZC) {
      paramZmgw.moveCaretPosition(j);
      if (i != 0) {
        paramZmgw.setCaretPosition(j);
        return;
      } 
      return;
    } 
    paramZmgw.setCaretPosition(j);
  }
  
  protected int Ze(Zmgw paramZmgw) {
    return paramZmgw.getDocument().getLength();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzf9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */