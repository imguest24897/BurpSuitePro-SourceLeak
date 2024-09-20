package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.network.WebSocketFrameError")
public class WebSocketFrameError implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "errorMessage")
  public final String errorMessage;
  
  @Zox
  public WebSocketFrameError(@Zc5(Ze = "requestId") String paramString1, @Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "errorMessage") String paramString2) {
    this.requestId = paramString1;
    this.timestamp = paramDouble;
    this.errorMessage = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\WebSocketFrameError.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */