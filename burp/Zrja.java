package burp;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Zrja implements DocumentListener {
  final Zr94 Zj;
  
  Zrja(Zr94 paramZr94) {}
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    this.Zj.Zh.compareAndSet(false, true);
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    this.Zj.Zh.compareAndSet(false, true);
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {
    this.Zj.Zh.compareAndSet(false, true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrja.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */