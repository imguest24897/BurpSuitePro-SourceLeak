package net.portswigger.devtools.protocol.types.network;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.AssociatedCookie")
public class AssociatedCookie {
  @Zvd(Zp = "cookie")
  public final Cookie cookie;
  
  @Zvd(Zp = "blockedReasons")
  public final List<CookieBlockedReason> blockedReasons;
  
  @Zvd(Zp = "exemptionReason")
  @Zj
  public final CookieExemptionReason exemptionReason;
  
  @Zox
  public AssociatedCookie(@Zc5(Ze = "cookie") Cookie paramCookie, @Zc5(Ze = "blockedReasons") List<CookieBlockedReason> paramList, @Zc5(Ze = "exemptionReason", ZS = "null") CookieExemptionReason paramCookieExemptionReason) {
    this.cookie = paramCookie;
    this.blockedReasons = paramList;
    this.exemptionReason = paramCookieExemptionReason;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\AssociatedCookie.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */