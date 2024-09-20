package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zlh;
import net.portswigger.Zrmq;
import net.portswigger.Zv3;

public class Zkkv {
  public static Zrmq Zm(String paramString) throws Ze0d {
    try {
      return Zv3.Zp(paramString);
    } catch (Zlh zlh) {
      Zah.Zl((Throwable)zlh, Zk_.RETHROWN);
      throw new Ze0d(zlh);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkkv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */