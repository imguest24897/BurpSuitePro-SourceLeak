package burp;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class Zz92 implements FocusListener {
  private final Zl86 ZL;
  
  private String Zx;
  
  final Zgox ZS;
  
  private Zz92(Zgox paramZgox, Zl86 paramZl86) {
    this.ZL = paramZl86;
  }
  
  private void Zo() {
    this.Zx = Ze();
  }
  
  private String Ze() {
    return this.ZL.getText();
  }
  
  public void focusGained(FocusEvent paramFocusEvent) {
    Zo();
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {
    if (!Ze().equals(this.Zx))
      this.ZS.ZG.Zb(this.ZS.ZY(this.ZS.ZF.getText())); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz92.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */