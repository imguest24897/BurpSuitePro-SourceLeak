package net.portswigger.devtools.protocol.events.network;

import java.util.List;
import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.network.AssociatedCookie;
import net.portswigger.devtools.protocol.types.network.ClientSecurityState;
import net.portswigger.devtools.protocol.types.network.ConnectTiming;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.network.RequestWillBeSentExtraInfo")
public class RequestWillBeSentExtraInfo implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "associatedCookies")
  public final List<AssociatedCookie> associatedCookies;
  
  @Zvd(Zp = "headers")
  public final Map<String, Zi7> headers;
  
  @Zvd(Zp = "connectTiming")
  @Zy
  public final ConnectTiming connectTiming;
  
  @Zvd(Zp = "clientSecurityState")
  @Zj
  public final ClientSecurityState clientSecurityState;
  
  @Zvd(Zp = "siteHasCookieInOtherPartition")
  @Zj
  public final Boolean siteHasCookieInOtherPartition;
  
  @Zox
  public RequestWillBeSentExtraInfo(@Zc5(Ze = "requestId") String paramString, @Zc5(Ze = "associatedCookies") List<AssociatedCookie> paramList, @Zc5(Ze = "headers") Map<String, Zi7> paramMap, @Zc5(Ze = "connectTiming") ConnectTiming paramConnectTiming, @Zc5(Ze = "clientSecurityState", ZS = "null") ClientSecurityState paramClientSecurityState, @Zc5(Ze = "siteHasCookieInOtherPartition", ZS = "null") Boolean paramBoolean) {
    this.requestId = paramString;
    this.associatedCookies = paramList;
    this.headers = paramMap;
    this.connectTiming = paramConnectTiming;
    this.clientSecurityState = paramClientSecurityState;
    this.siteHasCookieInOtherPartition = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\RequestWillBeSentExtraInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */