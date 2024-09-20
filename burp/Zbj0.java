package burp;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Zbj0 implements DocumentListener {
  private final Zt7b Zg;
  
  private Zbj0(Zt7b paramZt7b) {
    this.Zg = paramZt7b;
  }
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    this.Zg.Zn();
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    this.Zg.Zn();
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbj0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */