package burp;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.SwingUtilities;

class Zs6u implements PropertyChangeListener {
  private final AtomicBoolean Zz = new AtomicBoolean(true);
  
  final Zmrj Zo;
  
  Zs6u(Zmrj paramZmrj) {}
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    if (this.Zz.get()) {
      this.Zz.set(false);
      this.Zo.Zl.setDividerLocation(this.Zo.ZR);
      return;
    } 
    if (this.Zo.ZK.get()) {
      this.Zo.ZK.set(false);
      SwingUtilities.invokeLater(this::lambda$propertyChange$0);
    } 
    if (this.Zo.Zl.getDividerLocation() > 0 && this.Zo.Zl.getWidth() > 0) {
      this.Zo.ZR = this.Zo.Zl.getDividerLocation() / this.Zo.Zl.getWidth();
      this.Zo.Zl.setResizeWeight(this.Zo.ZR);
    } 
  }
  
  private void lambda$propertyChange$0() {
    this.Zo.ZE.ZJ();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs6u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */