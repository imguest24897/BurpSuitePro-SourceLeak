package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.network.WebSocketRequest;

@Zsi("net.portswigger.devtools.protocol.events.network.WebSocketWillSendHandshakeRequest")
public class WebSocketWillSendHandshakeRequest implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "wallTime")
  public final Double wallTime;
  
  @Zvd(Zp = "request")
  public final WebSocketRequest request;
  
  @Zox
  public WebSocketWillSendHandshakeRequest(@Zc5(Ze = "requestId") String paramString, @Zc5(Ze = "timestamp") Double paramDouble1, @Zc5(Ze = "wallTime") Double paramDouble2, @Zc5(Ze = "request") WebSocketRequest paramWebSocketRequest) {
    this.requestId = paramString;
    this.timestamp = paramDouble1;
    this.wallTime = paramDouble2;
    this.request = paramWebSocketRequest;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\WebSocketWillSendHandshakeRequest.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */