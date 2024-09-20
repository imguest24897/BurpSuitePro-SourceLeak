package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.network.Initiator;

@Zsi("net.portswigger.devtools.protocol.events.network.WebSocketCreated")
public class WebSocketCreated implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "initiator")
  @Zj
  public final Initiator initiator;
  
  @Zox
  public WebSocketCreated(@Zc5(Ze = "requestId") String paramString1, @Zc5(Ze = "url") String paramString2, @Zc5(Ze = "initiator", ZS = "null") Initiator paramInitiator) {
    this.requestId = paramString1;
    this.url = paramString2;
    this.initiator = paramInitiator;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\WebSocketCreated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */