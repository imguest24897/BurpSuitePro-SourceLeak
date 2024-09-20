package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zs3s {
  private final Zs0g ZA;
  
  public Zs3s(Zs0g paramZs0g) {
    this.ZA = paramZs0g;
  }
  
  public boolean Zq(Ze3h paramZe3h) {
    ArrayList<Zrdb> arrayList = new ArrayList();
    Iterator<Zz_1> iterator = paramZe3h.Zd().ZL().iterator();
    int[] arrayOfInt = Zgxf.ZV();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      List<Zrdb> list = ((Zxya)zz_1.Z_()).ZK();
      if (list != null)
        arrayList.addAll(list); 
      if (arrayOfInt != null)
        break; 
    } 
    this.ZA.Zu(arrayList);
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs3s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */