package burp;

import java.util.Comparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxct {
  private static final Comparator<Zlru> ZX = Comparator.comparingInt(Zxct::ZZ);
  
  private static final Comparator<Zk28> ZN = Comparator.comparing(Zk28::ZRT, Comparator.nullsFirst(Comparator.naturalOrder()));
  
  private static final Comparator<Zk28> Zj = Comparator.comparing(Zk28::ZRF, Comparator.nullsFirst(Comparator.naturalOrder()));
  
  private static final Comparator<Zk28> Zk = Comparator.comparing(Zk28::ZRC, Comparator.reverseOrder());
  
  private static final Comparator<Zl4b> ZW = Comparator.comparing(Zl4b::ZjC, Comparator.comparingInt(Zxct::ZY));
  
  private static final Comparator<Zk28> Za = ZN.thenComparing(Zj).thenComparing(Zk);
  
  public static final Comparator<Zlru> ZB = ZX.thenComparing(Zxky.ZB(Zl4b.class, ZW)).thenComparing(Zxky.ZB(Zk28.class, Za));
  
  private static int ZZ(Zlru paramZlru) {
    if (paramZlru == null)
      return 0; 
    if (paramZlru instanceof Ztx)
      return 1; 
    if (paramZlru instanceof Zlfm)
      return 2; 
    if (paramZlru instanceof Zmjh)
      return 3; 
    if (paramZlru instanceof Zx34)
      return 4; 
    if (paramZlru instanceof Zl4b)
      return 5; 
    Zuh.ZT(false, Zqf.Zk, paramZlru.getClass().getSimpleName());
    return -1;
  }
  
  private static int ZY(Zb9v paramZb9v) {
    if (paramZb9v == null)
      return 0; 
    if (paramZb9v instanceof Zg_f)
      return 1; 
    if (paramZb9v instanceof Zx44)
      return 2; 
    if (paramZb9v instanceof Zx6m)
      return 3; 
    Zuh.ZT(false, Zqf.Zk, paramZb9v.getClass().getSimpleName());
    return -1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxct.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */