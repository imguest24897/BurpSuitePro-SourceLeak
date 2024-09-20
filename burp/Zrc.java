package burp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Zrc implements DocumentListener {
  private final List<DocumentListener> ZM = new ArrayList<>();
  
  private volatile boolean Zd;
  
  void ZN(DocumentListener paramDocumentListener) {
    this.ZM.add(paramDocumentListener);
  }
  
  void Zz() {
    this.Zd = true;
  }
  
  void ZU() {
    this.Zd = false;
  }
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    if (!this.Zd)
      this.ZM.forEach(paramDocumentEvent::lambda$insertUpdate$0); 
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    if (!this.Zd)
      this.ZM.forEach(paramDocumentEvent::lambda$removeUpdate$1); 
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {}
  
  private static void lambda$removeUpdate$1(DocumentEvent paramDocumentEvent, DocumentListener paramDocumentListener) {
    paramDocumentListener.removeUpdate(paramDocumentEvent);
  }
  
  private static void lambda$insertUpdate$0(DocumentEvent paramDocumentEvent, DocumentListener paramDocumentListener) {
    paramDocumentListener.insertUpdate(paramDocumentEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */