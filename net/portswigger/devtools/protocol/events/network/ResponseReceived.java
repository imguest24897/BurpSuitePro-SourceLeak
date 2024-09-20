package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.network.ResourceType;
import net.portswigger.devtools.protocol.types.network.Response;

@Zsi("net.portswigger.devtools.protocol.events.network.ResponseReceived")
public class ResponseReceived implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "loaderId")
  public final String loaderId;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "type")
  public final ResourceType type;
  
  @Zvd(Zp = "response")
  public final Response response;
  
  @Zvd(Zp = "hasExtraInfo")
  @Zy
  public final Boolean hasExtraInfo;
  
  @Zvd(Zp = "frameId")
  @Zj
  public final String frameId;
  
  @Zox
  public ResponseReceived(@Zc5(Ze = "requestId") String paramString1, @Zc5(Ze = "loaderId") String paramString2, @Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "type") ResourceType paramResourceType, @Zc5(Ze = "response") Response paramResponse, @Zc5(Ze = "hasExtraInfo") Boolean paramBoolean, @Zc5(Ze = "frameId", ZS = "null") String paramString3) {
    this.requestId = paramString1;
    this.loaderId = paramString2;
    this.timestamp = paramDouble;
    this.type = paramResourceType;
    this.response = paramResponse;
    this.hasExtraInfo = paramBoolean;
    this.frameId = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\ResponseReceived.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */