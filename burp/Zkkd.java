package burp;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Zkkd implements DocumentListener {
  private final Zmzn ZI;
  
  public Zkkd(Zmzn paramZmzn) {
    this.ZI = paramZmzn;
  }
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    this.ZI.ZQ(paramDocumentEvent.getOffset(), paramDocumentEvent.getLength());
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    this.ZI.ZN(paramDocumentEvent);
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkkd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */