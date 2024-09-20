package burp;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Zr_a implements ListSelectionListener {
  final Zl4w ZU;
  
  private Zr_a(Zl4w paramZl4w) {}
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    int i = paramListSelectionEvent.getFirstIndex();
    if (this.ZU.ZI.isSelectedIndex(i)) {
      Zg3w zg3w = this.ZU.ZW.get(i);
      this.ZU.Zi.ZP(zg3w.ZU());
      this.ZU.Zo.ZK(new String[] { zg3w.ZM() });
      this.ZU.ZV.setSelectionPath(null);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr_a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */