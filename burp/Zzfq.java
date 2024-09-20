package burp;

import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Utilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zzfq extends Zz85 {
  private final boolean ZN;
  
  protected Zzfq(String paramString, boolean paramBoolean) {
    super(paramString);
    this.ZN = paramBoolean;
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    int i = Zz85.ZT();
    try {
      int j = paramZmgw.getCaretPosition();
      int k = Zw(paramZmgw, j);
      try {
        if (this.ZN) {
          try {
            paramZmgw.moveCaretPosition(k);
            if (i == 0)
              paramZmgw.setCaretPosition(k); 
          } catch (BadLocationException badLocationException) {
            throw b(null);
          } 
          return;
        } 
      } catch (BadLocationException badLocationException) {
        throw b(null);
      } 
      paramZmgw.setCaretPosition(k);
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
  
  protected int Zw(Zmgw paramZmgw, int paramInt) throws BadLocationException {
    return Utilities.getWordEnd(paramZmgw, paramInt);
  }
  
  private static BadLocationException b(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */