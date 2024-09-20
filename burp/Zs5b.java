package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zs5b {
  public List<Zm_m> Zt(Ze4y paramZe4y) {
    ArrayList<Zm_m> arrayList = new ArrayList();
    Iterator<Zr9_> iterator = paramZe4y.Z_().iterator();
    Zbqc[] arrayOfZbqc = Zm_m.ZW();
    while (iterator.hasNext()) {
      Zr9_ zr9_ = iterator.next();
      for (Zl30 zl30 : paramZe4y.Zw()) {
        if (zl30.ZT().contains(zr9_))
          ZJ(zl30, zr9_, arrayList); 
        if (arrayOfZbqc == null)
          break; 
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayList;
  }
  
  private void ZJ(Zl30 paramZl30, Zr9_ paramZr9_, List<Zm_m> paramList) {
    List<Ztx4> list = paramZl30.ZT();
    int i = list.indexOf(paramZr9_);
    Zbqc[] arrayOfZbqc = Zm_m.ZW();
    while (i != -1) {
      List<Ztx4> list1 = list.subList(i + 1, list.size());
      paramList.add(new Zm_m(paramZr9_, paramZl30.ZC(), new Zewm(list1)));
      i = Z_(list, paramZr9_, i + 1);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private int Z_(List<Ztx4> paramList, Ztx4 paramZtx4, int paramInt) {
    Zbqc[] arrayOfZbqc = Zm_m.ZW();
    int i = paramInt;
    while (i < paramList.size()) {
      if (paramList.get(i) == paramZtx4)
        return i; 
      i++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return -1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs5b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */