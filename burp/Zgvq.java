package burp;

import java.awt.Frame;
import java.awt.Window;

class Zgvq implements Zkh9 {
  final Zlw0 ZN;
  
  private Zgvq(Zlw0 paramZlw0) {}
  
  public void ZL(Zl5t paramZl5t) {
    if (paramZl5t.ZZ() != null) {
      Window window = Zt2m.ZF(paramZl5t.ZZ());
      if (window != null && Zt2m.ZF(this.ZN.Zc()) == window) {
        window.setVisible(true);
        if (window instanceof Frame) {
          Frame frame = (Frame)window;
          if (frame.getExtendedState() == 1)
            frame.setExtendedState(0); 
        } 
        window.toFront();
        this.ZN.ZM(paramZl5t.ZZ());
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */