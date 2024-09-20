package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmaj {
  public final Zer0 ZO;
  
  public final Ztt6 Zy;
  
  public Zmaj(Zer0 paramZer0, Ztt6 paramZtt6) {
    this.ZO = paramZer0;
    this.Zy = paramZtt6;
  }
  
  public static List<Zer0> Zf(List<Zmaj> paramList) {
    ArrayList<Zer0> arrayList = new ArrayList();
    Iterator<Zmaj> iterator = paramList.iterator();
    boolean bool = Ztx1.ZC();
    while (iterator.hasNext()) {
      Zmaj zmaj = iterator.next();
      arrayList.add(zmaj.ZO);
      if (!bool)
        break; 
    } 
    return arrayList;
  }
  
  public static Ztt6 Zr(Zer0 paramZer0, List<Zmaj> paramList) {
    boolean bool = Ztx1.ZC();
    for (Zmaj zmaj : paramList) {
      if (zmaj.ZO == paramZer0)
        return zmaj.Zy; 
      if (!bool)
        break; 
    } 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmaj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */