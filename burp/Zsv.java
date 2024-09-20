package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zsv implements ActionListener {
  final Zmc1 ZQ;
  
  private Zsv(Zmc1 paramZmc1) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    Object object = paramActionEvent.getSource();
    if (object == this.ZQ.Zx) {
      Zm2.ZC(Zrrh.SUITE_SEARCH_OPEN_VIA_MENU);
      this.ZQ.ZH.ZK();
      return;
    } 
    if (object == this.ZQ.Zz) {
      if (this.ZQ.ZC != null)
        this.ZQ.ZC.setVisible(true); 
      return;
    } 
    if (object == this.ZQ.Zj) {
      if (this.ZQ.ZC != null) {
        this.ZQ.ZC.Zm();
        this.ZQ.ZC.setVisible(true);
      } 
      return;
    } 
    if (object == this.ZQ.ZO) {
      new Zt8q(this.ZQ.ZI.ZK1());
      return;
    } 
    if (object == this.ZQ.Zt) {
      new Zrv3(this.ZQ.ZI.ZK1());
      return;
    } 
    if (object == this.ZQ.Zg) {
      this.ZQ.ZX.ZK(true);
      return;
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */