package burp;

import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zry implements Zlgo {
  final Zlwv Zr;
  
  private Zry(Zlwv paramZlwv) {}
  
  public void Zp(Zl36 paramZl36, Zeew paramZeew) {
    Zrwo zrwo = (paramZeew == Zeew.PROXY) ? Zrwo.BROWSER : Zrwo.REPEATER;
    this.Zr.Zk(paramZl36, zrwo, Ze3o.CLIENT_TO_SERVER);
  }
  
  public void ZF(Zl36 paramZl36) {
    if (this.Zr.Zd().Zy()) {
      if (paramZl36.ZY() == Zsg3.PING)
        this.Zr.Zd().Zr(Zsg3.PONG, paramZl36.ZH()); 
      this.Zr.Zk(paramZl36, Zrwo.SERVER, Ze3o.SERVER_TO_CLIENT);
    } 
  }
  
  public void ZP() {
    SwingUtilities.invokeLater(this::lambda$connectionClosed$0);
  }
  
  private void lambda$connectionClosed$0() {
    Ztwn ztwn = this.Zr.ZM.get();
    if (ztwn == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    ztwn.ZX();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */