package burp;

import javax.swing.event.DocumentEvent;

class Zbkm extends Zbkv {
  final Zbma Za;
  
  Zbkm(Zbma paramZbma) {
    super(true, paramZbma.ZO, paramZbma.Zr, paramZbma.ZV);
    ZY(true);
  }
  
  public void ZI(DocumentEvent paramDocumentEvent) {
    super.ZI(paramDocumentEvent);
    if (this.Z_)
      return; 
    this.Za.Zz.ZQ(paramDocumentEvent.getOffset(), paramDocumentEvent.getLength());
  }
  
  public void ZO(DocumentEvent paramDocumentEvent) {
    super.ZO(paramDocumentEvent);
    if (this.Z_)
      return; 
    this.Za.Zz.ZN(paramDocumentEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbkm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */