package burp;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.List;

class Zk0 extends ComponentAdapter {
  final List Zf;
  
  Zk0(Zr7o paramZr7o, List paramList) {}
  
  public void componentHidden(ComponentEvent paramComponentEvent) {
    this.Zf.stream().map(Ztm_::ZcW).forEach(Zspz::Zlm);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */