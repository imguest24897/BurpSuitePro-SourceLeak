package burp;

import java.awt.event.MouseEvent;

class Zrav implements Zky2 {
  final Zzpo ZM;
  
  final Zk2_ Zm;
  
  Zrav(Zk2_ paramZk2_, Zzpo paramZzpo) {}
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    this.ZM.Zn().accept(this.Zm.Zr.ZN(this.Zm.ZU.convertRowIndexToModel(paramInt1)));
    this.Zm.ZU.clearSelection();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrav.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */