package burp;

import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrun {
  public final String ZE;
  
  private final Zeu1 Zk;
  
  private final Zeph ZN;
  
  private final Zskh ZX;
  
  private final Zzqf Zf;
  
  public Zrun(Zeu1 paramZeu1, Zeph paramZeph, Zskh paramZskh, Zzqf paramZzqf) {
    this.Zk = paramZeu1;
    this.ZN = paramZeph;
    this.ZX = paramZskh;
    this.Zf = paramZzqf;
    this.ZE = (paramZeph.Zj() == null) ? paramZeu1.ZN() : paramZeph.Zj();
  }
  
  public Zk5w ZJ(Zsh8 paramZsh8) {
    Zuh.Zb(!SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    return ZU(paramZsh8);
  }
  
  private Zk5w ZU(Zsh8 paramZsh8) {
    try {
      IIntruderAttack iIntruderAttack = Zzto.Z_(paramZsh8);
      Zmxs zmxs = new Zmxs(iIntruderAttack);
      return new Zk5w(this.Zk, this.ZN, zmxs, this.ZX, this.Zf);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.Zk.ZN(throwable, this.ZX);
      return null;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrun.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */