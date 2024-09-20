package burp;

import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.Zen;

public class Zsto implements Zsb2 {
  public List<Zlkb> ZG(Ze3n paramZe3n, Zb6q paramZb6q, Zen paramZen) {
    return (List<Zlkb>)paramZe3n.Zh().Zo(paramZb6q.Za()).stream().filter(paramZen::lambda$findCanaryReflections$0).collect(Collectors.toList());
  }
  
  private static boolean Zp(Zen paramZen1, Zen paramZen2) {
    return (paramZen2 == null || !paramZen1.toString().equals(paramZen2.toString()));
  }
  
  private static boolean lambda$findCanaryReflections$0(Zen paramZen, Zlkb paramZlkb) {
    return Zp(paramZlkb.Zf, paramZen);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsto.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */