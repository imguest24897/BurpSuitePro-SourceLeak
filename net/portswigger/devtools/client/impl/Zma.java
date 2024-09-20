package net.portswigger.devtools.client.impl;

import java.util.Map;
import net.portswigger.browser.Zz3;
import net.portswigger.devtools.protocol.types.network.CookiePriority;

public class Zma implements Zx4<CookiePriority, Zz3> {
  private static final Zma ZC = new Zma();
  
  private static final Map<CookiePriority, Zz3> Zd = Map.of(CookiePriority.LOW, Zz3.LOW, CookiePriority.MEDIUM, Zz3.MEDIUM, CookiePriority.HIGH, Zz3.HIGH);
  
  public static Zma ZF() {
    return ZC;
  }
  
  public Map<CookiePriority, Zz3> Zp() {
    return Zd;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zma.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */