package burp;

import java.util.function.Supplier;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.text.Element;

class Zmtu implements DocumentListener {
  private final Supplier<Integer> ZB;
  
  private final Runnable Zv;
  
  Zmtu(Supplier<Integer> paramSupplier, Runnable paramRunnable) {
    this.ZB = paramSupplier;
    this.Zv = paramRunnable;
  }
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    int i = paramDocumentEvent.getOffset();
    int j = i + paramDocumentEvent.getLength();
    Document document = paramDocumentEvent.getDocument();
    Element element = document.getDefaultRootElement();
    int k = element.getElementIndex(i);
    int m = element.getElementIndex(j);
    boolean bool = (k != m) ? true : false;
    if (bool)
      Zj(k); 
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    Element element = paramDocumentEvent.getDocument().getDefaultRootElement();
    DocumentEvent.ElementChange elementChange = paramDocumentEvent.getChange(element);
    Element[] arrayOfElement = (elementChange == null) ? null : elementChange.getChildrenRemoved();
    boolean bool = (arrayOfElement != null && arrayOfElement.length > 0) ? true : false;
    if (bool)
      Zj(elementChange.getIndex()); 
  }
  
  private void Zj(int paramInt) {
    if (Zl(paramInt))
      this.Zv.run(); 
  }
  
  private boolean Zl(int paramInt) {
    return (paramInt <= ((Integer)this.ZB.get()).intValue() + 1);
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmtu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */