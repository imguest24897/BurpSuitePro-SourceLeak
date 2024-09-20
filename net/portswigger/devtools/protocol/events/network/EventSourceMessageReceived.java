package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.network.EventSourceMessageReceived")
public class EventSourceMessageReceived implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "eventName")
  public final String eventName;
  
  @Zvd(Zp = "eventId")
  public final String eventId;
  
  @Zvd(Zp = "data")
  public final String data;
  
  @Zox
  public EventSourceMessageReceived(@Zc5(Ze = "requestId") String paramString1, @Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "eventName") String paramString2, @Zc5(Ze = "eventId") String paramString3, @Zc5(Ze = "data") String paramString4) {
    this.requestId = paramString1;
    this.timestamp = paramDouble;
    this.eventName = paramString2;
    this.eventId = paramString3;
    this.data = paramString4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\EventSourceMessageReceived.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */