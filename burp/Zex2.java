package burp;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Zex2 implements Zg5o {
  private final Function<Zr6q, List<Zl1r>> Zw;
  
  private List<Zl1r> Zv;
  
  public Zex2(Function<Zr6q, List<Zl1r>> paramFunction) {
    this.Zw = paramFunction;
  }
  
  public void Zs(Zr6q paramZr6q) {
    this.Zv = this.Zw.apply(paramZr6q);
  }
  
  public void ZS(Zr6h paramZr6h) {
    this.Zv = Collections.emptyList();
  }
  
  public static List<Zl1r> ZT(Zefx paramZefx, Function<Zr6q, List<Zl1r>> paramFunction) {
    Zex2 zex2 = new Zex2(paramFunction);
    paramZefx.Zi(zex2);
    return zex2.Zv;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zex2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */