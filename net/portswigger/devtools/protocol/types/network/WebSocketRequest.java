package net.portswigger.devtools.protocol.types.network;

import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.network.WebSocketRequest")
public class WebSocketRequest {
  @Zvd(Zp = "headers")
  public final Map<String, Zi7> headers;
  
  @Zox
  public WebSocketRequest(@Zc5(Ze = "headers") Map<String, Zi7> paramMap) {
    this.headers = paramMap;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\WebSocketRequest.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */