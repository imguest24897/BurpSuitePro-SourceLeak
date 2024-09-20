package burp;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Ze7t implements DocumentListener {
  private final Runnable ZH;
  
  private boolean ZK;
  
  private Ze7t(Runnable paramRunnable) {
    this.ZH = paramRunnable;
  }
  
  public void Zz() {
    this.ZK = true;
  }
  
  public void ZD() {
    this.ZK = false;
  }
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    if (!this.ZK)
      this.ZH.run(); 
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    if (!this.ZK)
      this.ZH.run(); 
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze7t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */