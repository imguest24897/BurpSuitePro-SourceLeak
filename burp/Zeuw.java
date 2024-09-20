package burp;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Zeuw implements PropertyChangeListener {
  private final Zzdl ZY;
  
  private final Zo0 Zk;
  
  final Zlw0 ZM;
  
  private Zeuw(Zlw0 paramZlw0, Zzdl paramZzdl, Zo0 paramZo0) {
    this.ZY = paramZzdl;
    this.Zk = paramZo0;
  }
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    Zl5t zl5t = (Zl5t)paramPropertyChangeEvent.getSource();
    Integer integer1 = (Integer)paramPropertyChangeEvent.getOldValue();
    Integer integer2 = (Integer)paramPropertyChangeEvent.getNewValue();
    zl5t.ZB(this.ZM.ZR);
    this.Zk.ZL(integer1, integer2, zl5t);
    if (integer2 == null && !zl5t.Zl())
      this.ZY.ZE(zl5t); 
    this.ZM.Zq();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeuw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */