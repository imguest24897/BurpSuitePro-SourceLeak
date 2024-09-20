package burp;

import javax.swing.event.DocumentEvent;
import javax.swing.text.Document;
import javax.swing.text.Element;

class Zzxe implements DocumentEvent {
  private final int ZI;
  
  private final int Zf;
  
  Zzxe(int paramInt1, int paramInt2) {
    this.ZI = paramInt1;
    this.Zf = paramInt2;
  }
  
  public int getOffset() {
    return this.ZI;
  }
  
  public int getLength() {
    return this.Zf;
  }
  
  public Document getDocument() {
    return null;
  }
  
  public DocumentEvent.ElementChange getChange(Element paramElement) {
    return null;
  }
  
  public DocumentEvent.EventType getType() {
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzxe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */