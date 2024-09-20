package burp;

import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmur extends Zmuc<Zbpn> implements Zzr0 {
  private Zgws ZY;
  
  public Zmur(Zx46 paramZx46) {
    super(new Zg2k(), paramZx46.ZN());
    paramZx46.Zx(this);
  }
  
  public void ZY(Zgws paramZgws) {
    this.ZY = paramZgws;
  }
  
  public void ZD() {
    ZI(new Zmt4<>(this::ZS));
  }
  
  private boolean ZS(Zbpn paramZbpn) {
    return (this.ZY == null || this.ZY.ZV(paramZbpn));
  }
  
  public Zbpn ZO(int paramInt) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    return ZW(paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmur.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */