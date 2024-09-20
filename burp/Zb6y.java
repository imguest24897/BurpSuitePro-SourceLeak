package burp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Zb6y implements Zxdl {
  private final Set<Zbop> ZG = new HashSet<>();
  
  public Zb6y(Zr9_ paramZr9_, Zrc_ paramZrc_, Ze4y paramZe4y) {
    int[] arrayOfInt = Zrc_.Zm();
    List<Zewm> list = Zi(paramZr9_, paramZe4y);
    for (Zewm zewm : list) {
      this.ZG.addAll(paramZrc_.ZI(zewm));
      if (arrayOfInt != null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zrc_.ZY(new int[2]); 
  }
  
  public Set<Zbop> Zc() {
    return this.ZG;
  }
  
  private List<Zewm> Zi(Zr9_ paramZr9_, Ze4y paramZe4y) {
    ArrayList<Zewm> arrayList = new ArrayList();
    Iterator<Zl30> iterator = paramZe4y.Zw().iterator();
    int[] arrayOfInt = Zrc_.Zm();
    while (iterator.hasNext()) {
      Zl30 zl30 = iterator.next();
      if (zl30.ZC() == paramZr9_) {
        Zewm zewm = new Zewm(zl30.ZT());
        arrayList.add(zewm);
      } 
      if (arrayOfInt != null)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb6y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */