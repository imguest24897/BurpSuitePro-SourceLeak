package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Ze4d extends MouseAdapter {
  private final Zbws ZO;
  
  private final int Zj;
  
  private int Zc = -1;
  
  private int Zi = -1;
  
  private Ze4d(Zbws paramZbws, int paramInt) {
    this.ZO = paramZbws;
    this.Zj = paramInt;
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    int i = this.Zc;
    int j = this.Zi;
    this.Zc = this.ZO.rowAtPoint(paramMouseEvent.getPoint());
    this.Zi = this.ZO.columnAtPoint(paramMouseEvent.getPoint());
    if ((this.Zc == i && this.Zi == j) || (this.Zi != this.Zj && j != this.Zj))
      return; 
    if (this.Zc >= 0 && this.Zi >= 0)
      this.ZO.repaint(this.ZO.getCellRect(this.Zc, this.Zi, false)); 
    if (i >= 0 && j >= 0)
      this.ZO.repaint(this.ZO.getCellRect(i, j, false)); 
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    if (this.Zc >= 0 && this.Zi == this.Zj)
      this.ZO.repaint(this.ZO.getCellRect(this.Zc, this.Zi, false)); 
    this.Zc = this.Zi = -1;
  }
  
  boolean ZO(int paramInt1, int paramInt2) {
    return (this.Zc == paramInt1 && this.Zi == paramInt2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze4d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */