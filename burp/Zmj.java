package burp;

import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmj {
  private final Zl04 Z_;
  
  private final Zgb6 Zm;
  
  private final Zic ZK;
  
  private volatile Zl0t Zj;
  
  private Zlc8 ZJ;
  
  public Zmj(Zl04 paramZl04, Zgb6 paramZgb6, Zic paramZic) {
    this.Z_ = paramZl04;
    this.Zm = paramZgb6;
    this.ZK = paramZic;
  }
  
  public void ZJ() {
    int i = Zl0t.Zl();
    if (ZB()) {
      this.Zj = new Zl0t(this.Z_, this.Zm, this.ZK);
      this.Zj.setVisible(true);
      this.ZJ = this.Zj;
      if (i != 0) {
        this.Zj = null;
        this.ZJ = new Zzv8();
        return;
      } 
      return;
    } 
    this.Zj = null;
    this.ZJ = new Zzv8();
  }
  
  private boolean ZB() {
    return (!Zb12.ZG() && Zg() && this.Zm.ZEl());
  }
  
  private boolean Zg() {
    return (this.Z_ == null || (this.Z_.getExtendedState() & 0x1) == 0);
  }
  
  public void Z_() {
    try {
    
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    try {
      Zuh.Zb(!SwingUtilities.isEventDispatchThread(), Zqf.ZF);
      if (this.Zj != null) {
        this.Zj.Zq(100.0F, (String)null);
        if (!this.Zj.ZS())
          try {
            Thread.sleep(750L);
          } catch (InterruptedException interruptedException) {
            Zah.Zl(interruptedException, Zk_.IGNORED);
          }  
      } 
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
  }
  
  public void Zy(String paramString, Zz7r paramZz7r) {
    if (this.Zj != null)
      this.Zj.Zf(paramString, paramZz7r); 
  }
  
  public void Zw() {
    if (this.Zj != null)
      SwingUtilities.invokeLater(this::lambda$hideProgressPanel$0); 
  }
  
  public Zlc8 ZO() {
    return this.ZJ;
  }
  
  private void lambda$hideProgressPanel$0() {
    this.Zj.setVisible(false);
    this.Zj.dispose();
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */