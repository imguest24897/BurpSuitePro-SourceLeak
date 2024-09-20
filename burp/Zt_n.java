package burp;

import java.awt.event.MouseEvent;

class Zt_n extends Ztn0 implements Zky2 {
  final Zbgm Zi;
  
  Zt_n(Zbgm paramZbgm) {}
  
  public int getRowCount() {
    return this.Zi.Zl.size();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    Zt1q zt1q = this.Zi.Zl.get(paramInt1);
    switch (paramInt2) {
      case 0:
      
      case 1:
      
    } 
    return "";
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 == 0) {
      Zt1q zt1q = this.Zi.Zl.get(paramInt1);
      zt1q.Zr = !zt1q.Zr;
      fireTableRowsUpdated(paramInt1, paramInt1);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt_n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */