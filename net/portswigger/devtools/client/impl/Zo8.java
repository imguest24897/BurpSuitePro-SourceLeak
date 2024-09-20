package net.portswigger.devtools.client.impl;

import java.util.Map;
import net.portswigger.browser.Zdv;
import net.portswigger.devtools.protocol.types.network.CookieSameSite;

public class Zo8 implements Zx4<CookieSameSite, Zdv> {
  private static final Zo8 Z_ = new Zo8();
  
  private static final Map<CookieSameSite, Zdv> Zb = Map.of(CookieSameSite.NONE, Zdv.NONE, CookieSameSite.LAX, Zdv.LAX, CookieSameSite.STRICT, Zdv.STRICT);
  
  public static Zo8 ZZ() {
    return Z_;
  }
  
  public Map<CookieSameSite, Zdv> Zp() {
    return Zb;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zo8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */