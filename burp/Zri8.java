package burp;

import javax.swing.SwingWorker;

class Zri8 extends SwingWorker<Void, Void> {
  final Zbys ZR;
  
  Zri8(Zbys paramZbys) {}
  
  protected Void ZY() {
    synchronized (this.ZR.Zb) {
      this.ZR.Zd.clear();
    } 
    return null;
  }
  
  protected void done() {
    this.ZR.Zz();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zri8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */