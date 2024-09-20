package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Zs_k implements ActionListener {
  private final Zzdy ZK;
  
  private final Ztiu Zz;
  
  private final Zgx8 Zb;
  
  public Zs_k(Zzdy paramZzdy, Ztiu paramZtiu, Zgx8 paramZgx8) {
    this.ZK = paramZzdy;
    this.Zz = paramZtiu;
    this.Zb = paramZgx8;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String[] arrayOfString = Zb8b.ZH();
    if (this.ZK.isSelected()) {
      this.Zb.ZU(this.Zz.ZI());
      if (arrayOfString != null) {
        this.Zb.Zb();
        return;
      } 
      return;
    } 
    this.Zb.Zb();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */