package burp;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public interface Zk7r<T extends Zrta, U extends Zl5x> {
  T Zb(Zbza paramZbza, Ze4e paramZe4e, Zr46 paramZr46, Zm8t paramZm8t);
  
  static <T extends Zl5x> Optional<T> Zp(Zbza paramZbza, Collection<T> paramCollection) {
    int i = Zrjd.ZL();
    synchronized (paramZbza.Zz6()) {
      for (Zl5x zl5x : paramCollection) {
        if (paramZbza.ZW(zl5x) == Zlby.RUNNING)
          return Optional.of((T)zl5x); 
        if (i == 0)
          break; 
      } 
      Zuh.Zb(false, Zqf.Zr);
      return Optional.empty();
    } 
  }
  
  List<U> ZL();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk7r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */