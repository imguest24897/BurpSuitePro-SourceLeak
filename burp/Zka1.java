package burp;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Zka1 implements DocumentListener {
  final Zl5i ZX;
  
  Zka1(Zl5i paramZl5i) {}
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    this.ZX.Zb = true;
    this.ZX.Zw.ZI(paramDocumentEvent);
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    this.ZX.Zb = true;
    this.ZX.Zw.ZO(paramDocumentEvent);
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zka1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */