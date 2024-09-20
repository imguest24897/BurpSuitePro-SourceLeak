package burp;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.Action;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zt01 implements Action {
  private final Action ZG;
  
  private final OutputStream ZH;
  
  Zt01(Action paramAction, OutputStream paramOutputStream) {
    this.ZG = paramAction;
    this.ZH = paramOutputStream;
  }
  
  public Object getValue(String paramString) {
    return this.ZG.getValue(paramString);
  }
  
  public void putValue(String paramString, Object paramObject) {
    this.ZG.putValue(paramString, paramObject);
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.ZG.setEnabled(paramBoolean);
  }
  
  public boolean isEnabled() {
    return this.ZG.isEnabled();
  }
  
  public void addPropertyChangeListener(PropertyChangeListener paramPropertyChangeListener) {
    this.ZG.addPropertyChangeListener(paramPropertyChangeListener);
  }
  
  public void removePropertyChangeListener(PropertyChangeListener paramPropertyChangeListener) {
    this.ZG.removePropertyChangeListener(paramPropertyChangeListener);
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    try {
      this.ZG.actionPerformed(paramActionEvent);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.EXTENSION_GENERATED);
      throwable.printStackTrace(new PrintStream(this.ZH));
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt01.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */