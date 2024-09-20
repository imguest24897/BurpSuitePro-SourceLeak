package net.portswigger.devtools.protocol.events.network;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.network.Initiator;
import net.portswigger.devtools.protocol.types.network.Request;
import net.portswigger.devtools.protocol.types.network.ResourceType;
import net.portswigger.devtools.protocol.types.network.Response;

@Zsi("net.portswigger.devtools.protocol.events.network.RequestWillBeSent")
public class RequestWillBeSent implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "loaderId")
  public final String loaderId;
  
  @Zvd(Zp = "documentURL")
  public final String documentURL;
  
  @Zvd(Zp = "request")
  public final Request request;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "wallTime")
  public final Double wallTime;
  
  @Zvd(Zp = "initiator")
  public final Initiator initiator;
  
  @Zvd(Zp = "redirectHasExtraInfo")
  @Zy
  public final Boolean redirectHasExtraInfo;
  
  @Zvd(Zp = "redirectResponse")
  @Zj
  public final Response redirectResponse;
  
  @Zvd(Zp = "type")
  @Zj
  public final ResourceType type;
  
  @Zvd(Zp = "frameId")
  @Zj
  public final String frameId;
  
  @Zvd(Zp = "hasUserGesture")
  @Zj
  public final Boolean hasUserGesture;
  
  @Zox
  public RequestWillBeSent(@Zc5(Ze = "requestId") String paramString1, @Zc5(Ze = "loaderId") String paramString2, @Zc5(Ze = "documentURL") String paramString3, @Zc5(Ze = "request") Request paramRequest, @Zc5(Ze = "timestamp") Double paramDouble1, @Zc5(Ze = "wallTime") Double paramDouble2, @Zc5(Ze = "initiator") Initiator paramInitiator, @Zc5(Ze = "redirectHasExtraInfo") Boolean paramBoolean1, @Zc5(Ze = "redirectResponse", ZS = "null") Response paramResponse, @Zc5(Ze = "type", ZS = "null") ResourceType paramResourceType, @Zc5(Ze = "frameId", ZS = "null") String paramString4, @Zc5(Ze = "hasUserGesture", ZS = "null") Boolean paramBoolean2) {
    this.requestId = paramString1;
    this.loaderId = paramString2;
    this.documentURL = paramString3;
    this.request = paramRequest;
    this.timestamp = paramDouble1;
    this.wallTime = paramDouble2;
    this.initiator = paramInitiator;
    this.redirectHasExtraInfo = paramBoolean1;
    this.redirectResponse = paramResponse;
    this.type = paramResourceType;
    this.frameId = paramString4;
    this.hasUserGesture = paramBoolean2;
    boolean bool = LoadingFailed.ZU();
    if (!bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\RequestWillBeSent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */