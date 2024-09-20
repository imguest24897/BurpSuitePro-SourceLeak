package burp;

import java.awt.Shape;
import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import javax.swing.text.Position;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zzfx extends Zz85 {
  private final boolean ZI;
  
  public Zzfx(String paramString, boolean paramBoolean) {
    super(paramString);
    this.ZI = paramBoolean;
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    Ze98 ze98 = (Ze98)paramZmgw.getDocument();
    DefaultCaret defaultCaret = (DefaultCaret)paramZmgw.getCaret();
    int j = defaultCaret.getDot();
    int i = Zz85.ZT();
    Position.Bias bias = defaultCaret.getDotBias();
    try {
      if (bias == Position.Bias.Forward)
        try {
          if (ze98.Zr(j))
            return; 
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    int k = j;
    try {
      int m = ZU(paramZmgw, j, bias);
      if (j != m)
        k = m; 
      try {
        if (this.ZI) {
          try {
            defaultCaret.moveDot(k, Position.Bias.Forward);
            if (i == 0)
              defaultCaret.setDot(k, Position.Bias.Forward); 
          } catch (Exception exception) {
            throw a(null);
          } 
          return;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      defaultCaret.setDot(k, Position.Bias.Forward);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
  
  private static int ZU(Zmgw paramZmgw, int paramInt, Position.Bias paramBias) throws BadLocationException {
    Zgpw zgpw = (Zgpw)paramZmgw.getUI().getRootView(paramZmgw).getView(0);
    Shape shape = zgpw.modelToView(paramInt, paramZmgw.getVisibleRect(), paramBias);
    return zgpw.viewToModel(0.0F, (shape.getBounds()).y, paramZmgw.getVisibleRect());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzfx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */