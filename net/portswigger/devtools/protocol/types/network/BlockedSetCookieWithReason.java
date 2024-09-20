package net.portswigger.devtools.protocol.types.network;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.BlockedSetCookieWithReason")
public class BlockedSetCookieWithReason {
  @Zvd(Zp = "blockedReasons")
  public final List<SetCookieBlockedReason> blockedReasons;
  
  @Zvd(Zp = "cookieLine")
  public final String cookieLine;
  
  @Zvd(Zp = "cookie")
  @Zj
  public final Cookie cookie;
  
  @Zox
  public BlockedSetCookieWithReason(@Zc5(Ze = "blockedReasons") List<SetCookieBlockedReason> paramList, @Zc5(Ze = "cookieLine") String paramString, @Zc5(Ze = "cookie", ZS = "null") Cookie paramCookie) {
    this.blockedReasons = paramList;
    this.cookieLine = paramString;
    this.cookie = paramCookie;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\BlockedSetCookieWithReason.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */