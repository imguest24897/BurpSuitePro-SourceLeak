package burp;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javax.swing.SwingUtilities;

class Zkel implements ListChangeListener<Zzme> {
  private final ObservableList<Zzme> Zp;
  
  final Zz6r ZO;
  
  private Zkel(Zz6r paramZz6r, ObservableList<Zzme> paramObservableList) {
    this.Zp = paramObservableList;
  }
  
  private void ZC() {
    this.Zp.removeListener(this);
    SwingUtilities.invokeLater(this::lambda$hideEmptyState$0);
  }
  
  public void onChanged(ListChangeListener.Change<? extends Zzme> paramChange) {
    while (paramChange.next()) {
      if (paramChange.wasAdded()) {
        ZC();
        this.Zp.removeListener(this);
        return;
      } 
    } 
  }
  
  private void lambda$hideEmptyState$0() {
    this.ZO.Zd.Zv(1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkel.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */