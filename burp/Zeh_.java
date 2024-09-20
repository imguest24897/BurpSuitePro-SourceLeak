package burp;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class Zeh_ implements FocusListener {
  private final Zl86 Zj;
  
  private String ZW;
  
  final Zxrm ZB;
  
  private Zeh_(Zxrm paramZxrm, Zl86 paramZl86) {
    this.Zj = paramZl86;
  }
  
  private void ZR() {
    this.ZW = ZV();
  }
  
  private String ZV() {
    return this.Zj.getText();
  }
  
  public void focusGained(FocusEvent paramFocusEvent) {
    ZR();
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {
    if (!ZV().equals(this.ZW))
      this.ZB.Zh(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeh_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */