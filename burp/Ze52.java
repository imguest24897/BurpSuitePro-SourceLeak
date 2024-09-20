package burp;

import java.util.ArrayList;
import java.util.Iterator;

public class Ze52 {
  private final Zgxf Zg;
  
  private final Zg_j ZQ;
  
  public Ze52(Zgxf paramZgxf, Zg_j paramZg_j) {
    this.Zg = paramZgxf;
    this.ZQ = paramZg_j;
  }
  
  public boolean Zv(Ze3h paramZe3h) {
    ArrayList<Zstu> arrayList = new ArrayList();
    Iterator<Zz_1> iterator = paramZe3h.iterator();
    int[] arrayOfInt = Zgxf.ZV();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      arrayList.add(this.Zg.ZU(zz_1));
      if (arrayOfInt != null)
        break; 
    } 
    if (!arrayList.isEmpty())
      this.ZQ.Zk(arrayList); 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze52.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */