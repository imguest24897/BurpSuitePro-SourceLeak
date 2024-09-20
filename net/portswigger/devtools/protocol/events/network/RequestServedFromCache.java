package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.network.RequestServedFromCache")
public class RequestServedFromCache implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zox
  public RequestServedFromCache(@Zc5(Ze = "requestId") String paramString) {
    this.requestId = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\RequestServedFromCache.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */