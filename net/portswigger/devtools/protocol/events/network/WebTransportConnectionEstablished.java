package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.network.WebTransportConnectionEstablished")
public class WebTransportConnectionEstablished implements Zl {
  @Zvd(Zp = "transportId")
  public final String transportId;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zox
  public WebTransportConnectionEstablished(@Zc5(Ze = "transportId") String paramString, @Zc5(Ze = "timestamp") Double paramDouble) {
    this.transportId = paramString;
    this.timestamp = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\WebTransportConnectionEstablished.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */