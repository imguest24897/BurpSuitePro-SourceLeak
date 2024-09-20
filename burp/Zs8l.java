package burp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import net.portswigger.Zm2;

class Zs8l extends WindowAdapter {
  final Zl0q ZJ;
  
  Zs8l(Zl0q paramZl0q) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    this.ZJ.ZR.Zi().forEach(Zs8l::lambda$windowClosing$0);
  }
  
  private static void lambda$windowClosing$0(Zl5t paramZl5t) {
    paramZl5t.ZT(true);
    Zq9.Zj(paramZl5t).ifPresent(Zm2::ZC);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs8l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */