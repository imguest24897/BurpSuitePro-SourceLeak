package net.portswigger.devtools.protocol.events.network;

import burp.Zbqc;
import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.network.AuthChallenge;
import net.portswigger.devtools.protocol.types.network.ErrorReason;
import net.portswigger.devtools.protocol.types.network.Request;
import net.portswigger.devtools.protocol.types.network.ResourceType;

@Zy
@Deprecated
@Zsi("net.portswigger.devtools.protocol.events.network.RequestIntercepted")
public class RequestIntercepted implements Zl {
  @Zvd(Zp = "interceptionId")
  public final String interceptionId;
  
  @Zvd(Zp = "request")
  public final Request request;
  
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "resourceType")
  public final ResourceType resourceType;
  
  @Zvd(Zp = "isNavigationRequest")
  public final Boolean isNavigationRequest;
  
  @Zvd(Zp = "isDownload")
  @Zj
  public final Boolean isDownload;
  
  @Zvd(Zp = "redirectUrl")
  @Zj
  public final String redirectUrl;
  
  @Zvd(Zp = "authChallenge")
  @Zj
  public final AuthChallenge authChallenge;
  
  @Zvd(Zp = "responseErrorReason")
  @Zj
  public final ErrorReason responseErrorReason;
  
  @Zvd(Zp = "responseStatusCode")
  @Zj
  public final Integer responseStatusCode;
  
  @Zvd(Zp = "responseHeaders")
  @Zj
  public final Map<String, Zi7> responseHeaders;
  
  @Zvd(Zp = "requestId")
  @Zj
  public final String requestId;
  
  @Zox
  public RequestIntercepted(@Zc5(Ze = "interceptionId") String paramString1, @Zc5(Ze = "request") Request paramRequest, @Zc5(Ze = "frameId") String paramString2, @Zc5(Ze = "resourceType") ResourceType paramResourceType, @Zc5(Ze = "isNavigationRequest") Boolean paramBoolean1, @Zc5(Ze = "isDownload", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "redirectUrl", ZS = "null") String paramString3, @Zc5(Ze = "authChallenge", ZS = "null") AuthChallenge paramAuthChallenge, @Zc5(Ze = "responseErrorReason", ZS = "null") ErrorReason paramErrorReason, @Zc5(Ze = "responseStatusCode", ZS = "null") Integer paramInteger, @Zc5(Ze = "responseHeaders", ZS = "null") Map<String, Zi7> paramMap, @Zc5(Ze = "requestId", ZS = "null") String paramString4) {
    this.interceptionId = paramString1;
    this.request = paramRequest;
    this.frameId = paramString2;
    this.resourceType = paramResourceType;
    this.isNavigationRequest = paramBoolean1;
    boolean bool = LoadingFailed.ZW();
    this.isDownload = paramBoolean2;
    this.redirectUrl = paramString3;
    this.authChallenge = paramAuthChallenge;
    this.responseErrorReason = paramErrorReason;
    this.responseStatusCode = paramInteger;
    this.responseHeaders = paramMap;
    this.requestId = paramString4;
    if (Zbqc.Zwu() == null)
      LoadingFailed.Zw(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\RequestIntercepted.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */