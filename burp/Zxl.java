package burp;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Zxl implements DocumentListener {
  private final Zt7b ZC;
  
  private Zxl(Zt7b paramZt7b) {
    this.ZC = paramZt7b;
  }
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    this.ZC.Zn();
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    this.ZC.Zn();
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */