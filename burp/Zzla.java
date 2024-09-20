package burp;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zzla implements DocumentListener {
  final Zbds Ze;
  
  Zzla(Zbds paramZbds) {}
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    try {
      this.Ze.Zn().ZN(paramDocumentEvent.getOffset(), this.Ze.Zs.getText(paramDocumentEvent.getOffset(), paramDocumentEvent.getLength()));
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    this.Ze.ZF();
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    this.Ze.Zn().Zh(paramDocumentEvent.getOffset(), paramDocumentEvent.getLength());
    this.Ze.ZF();
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzla.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */