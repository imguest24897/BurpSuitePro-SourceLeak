package burp;

import java.awt.event.MouseEvent;
import java.util.List;

class Zbwe extends Zbws implements Zky2, Zedo {
  private final boolean ZP;
  
  private final Zrm1 Zr;
  
  private final Zt0j ZR;
  
  Zbwe(boolean paramBoolean, Zrm1 paramZrm1) {
    this.ZP = paramBoolean;
    this.Zr = paramZrm1;
    this.ZR = new Zt0j(this);
    ZL(this.ZR);
    Zk(this);
  }
  
  void Z_(boolean paramBoolean) {
    String str = Zbk_.Zb();
    List<Zm30> list = this.ZP ? this.Zr.ZW() : this.Zr.Zx();
    for (Zm30 zm30 : list) {
      zm30.Zd(paramBoolean);
      if (str == null)
        break; 
    } 
    Zt2();
  }
  
  public void Zt2() {
    this.ZR.fireTableDataChanged();
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 == 0) {
      List<Zm30> list = this.ZP ? this.Zr.ZW() : this.Zr.Zx();
      int i = convertRowIndexToModel(paramInt1);
      Zm30 zm30 = list.get(i);
      zm30.Zd(!zm30.Zt());
      this.ZR.fireTableRowsUpdated(i, i);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbwe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */