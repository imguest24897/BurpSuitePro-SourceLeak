package burp;

import javafx.collections.ObservableList;

public class Zmij extends Zmuc<Zg7g> {
  private final ObservableList<Zg7g> ZW;
  
  private Zbws ZK;
  
  public Zmij(ObservableList<Zg7g> paramObservableList) {
    super(new Zgq8(), paramObservableList);
    this.ZW = paramObservableList;
  }
  
  void Zz(Zg7g paramZg7g) {
    this.ZW.remove(paramZg7g);
  }
  
  public void Zx(Zbws paramZbws) {
    this.ZK = paramZbws;
  }
  
  public void setValueAt(Object paramObject, int paramInt1, int paramInt2) {
    super.setValueAt(paramObject, paramInt1, paramInt2);
    if (this.ZK != null && this.ZM.Zf().get(paramInt2) == Zgq8.ZQ)
      Zmse.ZF(this.ZK.getTableHeader()); 
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return (super.isCellEditable(paramInt1, paramInt2) && ((Zg7g)this.ZW.get(paramInt1)).ZK());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmij.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */