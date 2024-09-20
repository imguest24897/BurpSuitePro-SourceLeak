package burp;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Zgs0 implements DocumentListener {
  final Zbd3 ZN;
  
  Zgs0(Zbd3 paramZbd3) {}
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    this.ZN.Zq.run();
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    this.ZN.Zq.run();
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgs0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */