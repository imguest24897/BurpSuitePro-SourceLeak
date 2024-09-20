package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Zr0y {
  private final Zs9m ZG;
  
  private final Map<Zmzk, List<Zg7i>> Ze = new HashMap<>();
  
  Zr0y(Zs9m paramZs9m) {
    this.ZG = paramZs9m;
  }
  
  boolean Zl(Zmzk paramZmzk, Zs6y paramZs6y) {
    Zbqc[] arrayOfZbqc = Zm82.Zb();
    List list = this.Ze.get(paramZmzk);
    if (list == null)
      return false; 
    for (Zg7i zg7i : list) {
      if (zg7i.ZV(paramZs6y))
        return true; 
      if (arrayOfZbqc == null)
        break; 
    } 
    return false;
  }
  
  void ZI(Zmzk paramZmzk, Zs6y paramZs6y, Zlit paramZlit1, Zlit paramZlit2) {
    List<Zg7i> list = this.Ze.computeIfAbsent(paramZmzk, Zr0y::lambda$addWildcardResponse$0);
    byte[][] arrayOfByte = { paramZlit1.ZdH(), paramZlit2.ZdH() };
    Zg7i zg7i = this.ZG.Zm(paramZmzk, arrayOfByte, new Zs6y[] { paramZs6y });
    list.add(zg7i);
  }
  
  private static List lambda$addWildcardResponse$0(Zmzk paramZmzk) {
    return new ArrayList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr0y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */