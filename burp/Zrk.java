package burp;

import java.util.Collection;
import java.util.List;

public class Zrk {
  static void Za(Zlk0 paramZlk0, Collection<Zrho> paramCollection) {
    int i = Zm9j.ZU();
    for (Zrho zrho1 : paramCollection) {
      zrho1.ZAl().ZB(zrho1.ZAX());
      List<Zeib> list = paramZlk0.ZL(zrho1);
      Zrho zrho2 = Ztfy.Zl(zrho1);
      while (zrho2 != null) {
        for (Zeib zeib : list) {
          if (!zrho2.Zt(zeib)) {
            zrho1.ZAl().Zg(zrho2.ZAX());
            if (i != 0)
              continue; 
            break;
          } 
          continue;
          if (i != 0)
            break; 
        } 
        zrho2 = Ztfy.Zl(zrho2);
        if (i != 0)
          break; 
      } 
      if (i != 0)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */