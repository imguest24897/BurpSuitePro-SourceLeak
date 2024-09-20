package net.portswigger.devtools.client.impl;

import java.util.Map;
import net.portswigger.browser.Ze8;
import net.portswigger.devtools.protocol.types.network.CookieSourceScheme;

public class Zo6 implements Zx4<CookieSourceScheme, Ze8> {
  private static final Zo6 Zp = new Zo6();
  
  private static final Map<CookieSourceScheme, Ze8> Ze = Map.of(CookieSourceScheme.UNSET, Ze8.UNSET, CookieSourceScheme.NON_SECURE, Ze8.NON_SECURE, CookieSourceScheme.SECURE, Ze8.SECURE);
  
  public static Zo6 ZI() {
    return Zp;
  }
  
  public Map<CookieSourceScheme, Ze8> Zp() {
    return Ze;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zo6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */