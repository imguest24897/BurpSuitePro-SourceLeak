package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.ExemptedSetCookieWithReason")
public class ExemptedSetCookieWithReason {
  @Zvd(Zp = "exemptionReason")
  public final CookieExemptionReason exemptionReason;
  
  @Zvd(Zp = "cookieLine")
  public final String cookieLine;
  
  @Zvd(Zp = "cookie")
  public final Cookie cookie;
  
  @Zox
  public ExemptedSetCookieWithReason(@Zc5(Ze = "exemptionReason") CookieExemptionReason paramCookieExemptionReason, @Zc5(Ze = "cookieLine") String paramString, @Zc5(Ze = "cookie") Cookie paramCookie) {
    this.exemptionReason = paramCookieExemptionReason;
    this.cookieLine = paramString;
    this.cookie = paramCookie;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\ExemptedSetCookieWithReason.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */