package burp;

import java.util.IdentityHashMap;
import java.util.List;

public class Zlox {
  private final Zeji Zi;
  
  private final IdentityHashMap<Zstu, List<Zlkb>> Zb;
  
  private Zlox(Zeji paramZeji) {
    this.Zi = paramZeji;
    this.Zb = new IdentityHashMap<>();
  }
  
  List<Zlkb> Zo(Zstu paramZstu) {
    if (this.Zb.containsKey(paramZstu))
      return this.Zb.get(paramZstu); 
    List<Zlkb> list = this.Zi.Zg(paramZstu);
    this.Zb.put(paramZstu, list);
    return list;
  }
  
  public static Zlox ZH(Zbjl paramZbjl, Zlba paramZlba, Zbnt paramZbnt, Zey9 paramZey9, Zerg paramZerg) {
    return new Zlox(new Zeji(paramZbjl, paramZlba, paramZbnt, paramZey9, paramZerg));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlox.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */