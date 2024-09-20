package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Zzb0 implements ActionListener {
  private float ZG;
  
  final Zzbf ZL;
  
  private Zzb0(Zzbf paramZzbf) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.ZL.ZQ(this.ZL.ZP + this.ZG);
    if (this.ZL.ZP == 0.0F || this.ZL.ZP == 1.0F)
      this.ZL.Zw.stop(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzb0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */