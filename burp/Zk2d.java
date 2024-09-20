package burp;

import java.awt.event.MouseEvent;

class Zk2d implements Zky2 {
  final Zgol Z_;
  
  private Zk2d(Zgol paramZgol) {}
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (!this.Z_.ZE.isSelected())
      this.Z_.ZQ.Zs(); 
    int i = this.Z_.ZB.convertRowIndexToModel(paramInt1);
    Zr5_ zr5_ = ((Zbf8)this.Z_.Zx.get(i)).Zn;
    this.Z_.ZQ.Zw(zr5_.Z_());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk2d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */