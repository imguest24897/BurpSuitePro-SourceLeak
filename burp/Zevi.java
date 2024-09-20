package burp;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;

class Zevi implements DocumentListener {
  private final Ze9f ZH;
  
  private Integer Zl = null;
  
  Zevi(Ze9f paramZe9f) {
    this.ZH = paramZe9f;
    this.ZH.addDocumentListener(this);
  }
  
  public boolean ZU(int paramInt) {
    int i = Zi(this.ZH.getDefaultRootElement());
    return (i == -1 || i > paramInt);
  }
  
  public boolean ZH(int paramInt) {
    return (Zs() > paramInt);
  }
  
  public synchronized int Zs() {
    Element element = this.ZH.getDefaultRootElement();
    int i = Zi(element);
    return (i == -1) ? -1 : element.getElement(i).getEndOffset();
  }
  
  private synchronized int Zi(Element paramElement) {
    Zbqc[] arrayOfZbqc = Zl5i.ZtD();
    if (this.Zl != null)
      return this.Zl.intValue(); 
    byte b = 0;
    while (b < paramElement.getElementCount()) {
      Element element = paramElement.getElement(b);
      if (this.ZH.Zz(element.getEndOffset()) == element.getStartOffset())
        return (this.Zl = Integer.valueOf(b)).intValue(); 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return (this.Zl = Integer.valueOf(-1)).intValue();
  }
  
  public synchronized void insertUpdate(DocumentEvent paramDocumentEvent) {
    this.Zl = null;
  }
  
  public synchronized void removeUpdate(DocumentEvent paramDocumentEvent) {
    this.Zl = null;
  }
  
  public synchronized void changedUpdate(DocumentEvent paramDocumentEvent) {
    this.Zl = null;
  }
  
  void Zc() {
    this.ZH.removeDocumentListener(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zevi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */