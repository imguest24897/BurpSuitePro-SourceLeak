package burp;

import java.awt.Shape;
import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import javax.swing.text.Position;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zzf2 extends Zz85 {
  private final boolean ZW;
  
  public Zzf2(String paramString, boolean paramBoolean) {
    super(paramString);
    this.ZW = paramBoolean;
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    Ze98 ze98 = (Ze98)paramZmgw.getDocument();
    DefaultCaret defaultCaret = (DefaultCaret)paramZmgw.getCaret();
    int j = defaultCaret.getDot();
    Position.Bias bias = defaultCaret.getDotBias();
    int i = Zz85.Zm();
    try {
      if (!paramZmgw.ZE())
        try {
          if (ze98.Zs(j))
            return; 
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    int k = j;
    Position.Bias[] arrayOfBias = new Position.Bias[1];
    try {
      int m = Zd(paramZmgw, j, bias, arrayOfBias);
      if (j != m)
        k = m; 
      try {
        if (this.ZW) {
          try {
            defaultCaret.moveDot(k, arrayOfBias[0]);
            if (i != 0)
              defaultCaret.setDot(k, arrayOfBias[0]); 
          } catch (Exception exception) {
            throw a(null);
          } 
          return;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      defaultCaret.setDot(k, arrayOfBias[0]);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
  
  private static int Zd(Zmgw paramZmgw, int paramInt, Position.Bias paramBias, Position.Bias[] paramArrayOfBias) throws BadLocationException {
    Zgpw zgpw = (Zgpw)paramZmgw.getUI().getRootView(paramZmgw).getView(0);
    Shape shape = zgpw.modelToView(paramInt, paramZmgw.getVisibleRect(), paramBias);
    try {
    
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    return zgpw.viewToModel(paramZmgw.getLineWrap() ? zgpw.getWidth() : 2.1474836E9F, (shape.getBounds()).y, paramZmgw.getVisibleRect(), paramArrayOfBias);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzf2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */