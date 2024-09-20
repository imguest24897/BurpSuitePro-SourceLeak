package burp;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Zgmc {
  private static final Map<Font, Zzkh> ZY = new HashMap<>();
  
  static synchronized Zzkh ZZ(Zmgn paramZmgn) {
    Objects.requireNonNull(paramZmgn);
    return ZY.computeIfAbsent(paramZmgn.getFont(), paramZmgn::Zl);
  }
  
  public static synchronized void Zy() {
    ZY.clear();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgmc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */