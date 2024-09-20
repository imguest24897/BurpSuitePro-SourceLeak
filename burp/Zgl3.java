package burp;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Zgl3 implements DocumentListener {
  final Zbgr Zs;
  
  Zgl3(Zbgr paramZbgr) {}
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    this.Zs.ZK();
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    this.Zs.ZK();
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {
    this.Zs.ZK();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgl3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */