package burp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Zsst extends WindowAdapter {
  final Zl0q Zz;
  
  final Zkhx ZM;
  
  Zsst(Zkhx paramZkhx, Zl0q paramZl0q) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    if (this.Zz.ZF()) {
      int i = this.ZM.Zo.indexOf(this.Zz);
      this.ZM.Zo.set(i, null);
      this.ZM.Zj.ZZ(i);
      this.Zz.dispose();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsst.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */