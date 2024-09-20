package burp;

import java.util.Collection;
import javafx.collections.ObservableList;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztpe {
  private final ObservableList<Zeeg> ZV;
  
  private Zeeg ZR;
  
  Ztpe(ObservableList<Zeeg> paramObservableList) {
    this.ZV = paramObservableList;
  }
  
  public ObservableList<Zeeg> ZV() {
    return this.ZV;
  }
  
  public void ZM(int paramInt) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    if (paramInt < 0 || paramInt >= this.ZV.size()) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    this.ZR = (Zeeg)this.ZV.get(paramInt);
  }
  
  public Zeeg Ze() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    Zuh.Zb((this.ZR != null), Zqf.Zr);
    return this.ZR;
  }
  
  public Zeeg Za(int paramInt) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    return (Zeeg)this.ZV.get(paramInt);
  }
  
  public void Zl(Collection<Zeeg> paramCollection) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.ZV.removeAll(paramCollection);
  }
  
  public void ZN() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.ZV.clear();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztpe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */