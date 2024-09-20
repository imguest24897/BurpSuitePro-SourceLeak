package burp;

import java.util.ArrayList;
import java.util.Iterator;

public class Zvor {
  private final Zg_j ZS;
  
  public Zvor(Zg_j paramZg_j) {
    this.ZS = paramZg_j;
  }
  
  public boolean ZE(Ze3h paramZe3h) {
    ArrayList<Zstu> arrayList = new ArrayList();
    Iterator<Zz_1> iterator = paramZe3h.iterator();
    int[] arrayOfInt = Zgxf.ZV();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      if (zz_1 == null)
        continue; 
      Zstu zstu = ((Zxya)zz_1.Z_()).Zm();
      if (zstu != null)
        arrayList.add(zstu); 
      if (arrayOfInt != null)
        break; 
    } 
    if (!arrayList.isEmpty())
      this.ZS.Zk(arrayList); 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */