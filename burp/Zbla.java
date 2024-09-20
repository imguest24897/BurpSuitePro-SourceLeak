package burp;

import java.awt.event.MouseEvent;

class Zbla implements Zky2 {
  private final Zbws ZG;
  
  private final Ztch Zk;
  
  private Zbla(Zbws paramZbws, Ztch paramZtch) {
    this.ZG = paramZbws;
    this.Zk = paramZtch;
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 != 0 || paramInt1 < 0 || paramInt1 >= this.ZG.getRowCount())
      return; 
    Zlpd zlpd = this.Zk.ZW();
    Ztnt ztnt = zlpd.ZT();
    ztnt.ZJ(this.ZG.convertRowIndexToModel(paramInt1));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbla.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */