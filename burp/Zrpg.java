package burp;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Zrpg implements DocumentListener {
  final Zrv0 ZN;
  
  Zrpg(Zrv0 paramZrv0) {}
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    this.ZN.Zf();
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    this.ZN.Zf();
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrpg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */