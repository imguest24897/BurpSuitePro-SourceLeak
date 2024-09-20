package burp;

import java.awt.Window;
import net.portswigger.Zm2;

public class Zevh {
  private final Zgxf ZC;
  
  private final Zgx0 Zp;
  
  private final Window ZD;
  
  private final Ztdi Zm;
  
  private final Zmrj ZF;
  
  private final Ztwv Zk;
  
  public Zevh(Window paramWindow, Zgxf paramZgxf, Zgx0 paramZgx0, Ztdi paramZtdi, Zmrj paramZmrj, Ztwv paramZtwv) {
    this.ZD = paramWindow;
    this.ZC = paramZgxf;
    this.Zp = paramZgx0;
    this.Zm = paramZtdi;
    this.ZF = paramZmrj;
    this.Zk = paramZtwv;
  }
  
  public boolean Zh() {
    Zm2.Zo(Zze0.TARGET_SITE_MAP_SHOW_NEW_WINDOW);
    this.ZC.ZG(this::lambda$exec$0);
    return true;
  }
  
  private void lambda$exec$0() {
    Zre_ zre_ = new Zre_(this.ZF, this.Zk);
    Zl42 zl42 = this.Zp.Zx(this.ZD, zre_);
    Zsqc zsqc = new Zsqc(zre_.ZY(), zl42, this.Zm.Zk());
    zre_.ZQ(zsqc);
    zl42.setVisible(true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zevh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */