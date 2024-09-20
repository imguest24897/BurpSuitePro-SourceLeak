package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;

class Zx5j implements Zky2 {
  final Zmxi ZP;
  
  final Zbws ZV;
  
  final Zels Zr;
  
  final Zb71 ZX;
  
  Zx5j(Zb71 paramZb71, Zmxi paramZmxi, Zbws paramZbws, Zels paramZels) {}
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    this.ZP.ZJ();
    this.ZP.ZC(this.ZX.Zb.Zh(this.ZV.convertRowIndexToModel(paramInt1)));
    this.ZV.clearSelection();
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    Zez3 zez3 = this.ZX.Zb.Zh(this.ZV.convertRowIndexToModel(this.ZV.rowAtPoint(paramPoint)));
    this.Zr.Zg(this.ZP, zez3, this.ZV, paramPoint);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx5j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */