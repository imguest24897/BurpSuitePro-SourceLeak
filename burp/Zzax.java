package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Zzax implements Zs6 {
  public Zes3 Zh(Collection<Zes3> paramCollection) {
    ArrayList<Zb3t> arrayList = new ArrayList();
    Iterator<Zes3> iterator = paramCollection.iterator();
    boolean bool = Zrcw.ZZ();
    while (iterator.hasNext()) {
      Zes3 zes3 = iterator.next();
      for (Zb3t zb3t : zes3.Zq().ZC()) {
        arrayList.add(zb3t);
        if (!bool)
          break; 
      } 
      if (!bool)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zrcw.ZA(!bool); 
    return new Zes3(new Zgcm(arrayList));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzax.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */