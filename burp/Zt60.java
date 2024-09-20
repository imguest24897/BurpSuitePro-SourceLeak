package burp;

import java.util.Comparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zt60 implements Comparator<Object> {
  public int compare(Object paramObject1, Object paramObject2) {
    String[] arrayOfString = Zxcf.Zq();
    if (paramObject1 instanceof Zbza) {
      Zbza zbza = (Zbza)paramObject1;
      if (paramObject2 instanceof Zbza) {
        Zbza zbza1 = (Zbza)paramObject2;
        if (arrayOfString == null)
          return (zbza.ZgS() < zbza1.ZgS()) ? -1 : ((zbza.ZgS() > zbza1.ZgS()) ? 1 : ((zbza.Zg9() < zbza1.Zg9()) ? -1 : ((zbza.Zg9() > zbza1.Zg9()) ? 1 : ((zbza.ZgH() < zbza1.ZgH()) ? -1 : ((zbza.ZgH() > zbza1.ZgH()) ? 1 : ((zbza.ZgJ() < zbza1.ZgJ()) ? -1 : ((zbza.ZgJ() > zbza1.ZgJ()) ? 1 : 0))))))); 
      } 
    } 
    Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt60.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */