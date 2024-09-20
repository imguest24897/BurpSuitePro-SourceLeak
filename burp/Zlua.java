package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlua {
  public static boolean Zd(Zm31 paramZm31, Zs7v paramZs7v, Zekv paramZekv, int paramInt) {
    int i = Zklz.ZM();
    if (paramZm31 == paramZekv) {
      if (paramZs7v instanceof Zk73) {
        ((Zk73)paramZs7v).Zb(paramZekv, paramInt);
        if (i != 0) {
          if (paramZs7v instanceof Zk71)
            Zuh.Zb(false, Zqf.Zr); 
          return true;
        } 
        return true;
      } 
    } else {
      return false;
    } 
    if (paramZs7v instanceof Zk71)
      Zuh.Zb(false, Zqf.Zr); 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlua.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */