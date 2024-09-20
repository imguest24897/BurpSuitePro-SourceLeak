package burp;

import java.util.Iterator;
import javafx.collections.ObservableList;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmiw extends Zmuc<Zz_1> {
  protected final ObservableList<Zz_1> Zc;
  
  protected Zmiw(Zmjx<Zz_1> paramZmjx, ObservableList<Zz_1> paramObservableList) {
    super(paramZmjx, paramObservableList);
    this.Zc = paramObservableList;
  }
  
  public Zmiw(ObservableList<Zz_1> paramObservableList, Ztdi paramZtdi, Ztwv paramZtwv) {
    this(new Zgqw(paramZtdi, paramZtwv), paramObservableList);
  }
  
  public Zz_1 Zs(int paramInt) {
    return ZW(paramInt);
  }
  
  public void Zm(Ze3h paramZe3h) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.Zc.clear();
    Iterator<Zz_1> iterator = paramZe3h.iterator();
    String str = Zz_1.ZG();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      this.Zc.add(zz_1);
      if (str == null)
        break; 
    } 
  }
  
  public void ZK(Zz_1 paramZz_1) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.Zc.add(paramZz_1);
  }
  
  public void Z_(Ze3h paramZe3h) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    Iterator<Zz_1> iterator = paramZe3h.iterator();
    String str = Zz_1.ZG();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      this.Zc.remove(zz_1);
      if (str == null)
        break; 
    } 
  }
  
  void ZF(Zz_1 paramZz_1) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    int i = Zj(paramZz_1);
    if (i < 0 || i >= this.Zc.size())
      return; 
    fireTableRowsUpdated(i, i);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmiw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */