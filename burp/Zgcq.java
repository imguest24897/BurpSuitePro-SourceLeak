package burp;

import java.util.ArrayList;
import java.util.List;

public abstract class Zgcq extends Zgcx {
  protected Zgcq(List<Zb3t> paramList) {
    super(paramList);
  }
  
  public void Zg(Zzlt paramZzlt) {
    boolean bool = Zgcx.Zw();
    List list = ZO(Zxc6.CodeSymbols);
    if (list != null)
      for (Ztyn ztyn : list) {
        if (ztyn.ZI(paramZzlt) || !bool)
          break; 
      }  
  }
  
  public void ZI(Ztyn paramZtyn) {
    List<Ztyn> list = ZO(Zxc6.CodeSymbols);
    if (list == null) {
      list = new ArrayList(1);
      Zm(Zxc6.CodeSymbols, list);
    } 
    list.add(paramZtyn);
  }
  
  public void Za(Ztyn paramZtyn) {
    List list = ZO(Zxc6.CodeSymbols);
    if (list != null) {
      list.remove(paramZtyn);
      if (list.isEmpty())
        Zw(Zxc6.CodeSymbols); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgcq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */