package burp;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Ze_v implements ChangeListener {
  final Zxyf ZW;
  
  private Ze_v(Zxyf paramZxyf) {}
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    this.ZW.Za = (this.ZW.Zm.getModel().getSelectedIndex() == 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */