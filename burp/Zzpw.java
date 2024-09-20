package burp;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

class Zzpw implements TableModelListener {
  final Zbw2 Zj;
  
  private Zzpw(Zbw2 paramZbw2) {}
  
  public void tableChanged(TableModelEvent paramTableModelEvent) {
    int i = paramTableModelEvent.getFirstRow();
    if (paramTableModelEvent.getType() != 0 || i != paramTableModelEvent.getLastRow())
      return; 
    int j = paramTableModelEvent.getColumn();
    if (j <= 0 || j >= 16)
      return; 
    int k = i * 16 + j - 1;
    Zzxe zzxe = new Zzxe(k, 1);
    this.Zj.Zy.changedUpdate(zzxe);
    this.Zj.Zr.ZK(-1, -1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzpw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */