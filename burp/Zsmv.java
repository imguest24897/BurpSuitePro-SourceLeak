package burp;

import java.util.LinkedHashSet;
import javax.swing.SwingWorker;

class Zsmv extends SwingWorker<Void, Void> {
  final Zbys ZN;
  
  Zsmv(Zbys paramZbys) {}
  
  protected Void Zm() {
    synchronized (this.ZN.Zb) {
      LinkedHashSet<Zstu> linkedHashSet = new LinkedHashSet<>(this.ZN.Zx);
      this.ZN.Zd.clear();
      this.ZN.Zd.addAll(linkedHashSet);
    } 
    return null;
  }
  
  protected void done() {
    this.ZN.Zz();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsmv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */