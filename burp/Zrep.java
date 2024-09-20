package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Zrep implements DocumentListener {
  private final Zga1 ZU;
  
  private final Zr23 ZB;
  
  private final AtomicBoolean Zj;
  
  private Zrep(Zga1 paramZga1, Zr23 paramZr23) {
    this.ZU = paramZga1;
    this.ZB = paramZr23;
    this.Zj = new AtomicBoolean(true);
  }
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    Zh();
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    Zh();
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {
    Zh();
  }
  
  public void ZH(boolean paramBoolean) {
    this.Zj.set(paramBoolean);
  }
  
  private void Zh() {
    if (this.Zj.get())
      this.ZU.Zu(this.ZB); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrep.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */