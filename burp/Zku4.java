package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;

class Zku4 implements Zky2 {
  final Zbha ZO;
  
  private Zku4(Zbha paramZbha) {}
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    boolean bool = (this.ZO.Zv.getSelectedRowCount() > 0 || this.ZO.Zv.ZW().Zn() != -1 || this.ZO.Zv.rowAtPoint(paramPoint) != -1) ? true : false;
    if (bool)
      this.ZO.Z_.ZQ(paramMouseEvent, paramComponent, paramPoint); 
  }
  
  public void ZR(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (this.ZO.Zx.isCellEditable(paramInt1, paramInt2))
      return; 
    Zgxp zgxp = this.ZO.Zx.ZW(paramInt1);
    if (zgxp == null)
      return; 
    if (zgxp.Zos() != null || zgxp.ZoO() != null) {
      Zl0d zl0d = new Zl0d(this.ZO.Zv, this.ZO.Zx, this.ZO.ZS, this.ZO.Zv.getSelectedRow(), this.ZO.ZR, this.ZO.Zs.ZH(), this.ZO.Zr);
      zl0d.setVisible(true);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zku4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */