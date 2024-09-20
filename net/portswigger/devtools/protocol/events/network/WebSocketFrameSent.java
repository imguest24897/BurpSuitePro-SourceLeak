package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.network.WebSocketFrame;

@Zsi("net.portswigger.devtools.protocol.events.network.WebSocketFrameSent")
public class WebSocketFrameSent implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "response")
  public final WebSocketFrame response;
  
  @Zox
  public WebSocketFrameSent(@Zc5(Ze = "requestId") String paramString, @Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "response") WebSocketFrame paramWebSocketFrame) {
    this.requestId = paramString;
    this.timestamp = paramDouble;
    this.response = paramWebSocketFrame;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\WebSocketFrameSent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */