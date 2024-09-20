package burp;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Zltt implements DocumentListener {
  final Zzw8 Zj;
  
  final Zl86 Zu;
  
  Zltt(Zgod paramZgod, Zzw8 paramZzw8, Zl86 paramZl86) {}
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    this.Zj.ZV(this.Zu.getText());
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    this.Zj.ZV(this.Zu.getText());
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {
    this.Zj.ZV(this.Zu.getText());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zltt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */