package net.portswigger.devtools.protocol.events.fetch;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.fetch.HeaderEntry;
import net.portswigger.devtools.protocol.types.network.ErrorReason;
import net.portswigger.devtools.protocol.types.network.Request;
import net.portswigger.devtools.protocol.types.network.ResourceType;

@Zsi("net.portswigger.devtools.protocol.events.fetch.RequestPaused")
public class RequestPaused implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "request")
  public final Request request;
  
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "resourceType")
  public final ResourceType resourceType;
  
  @Zvd(Zp = "responseErrorReason")
  @Zj
  public final ErrorReason responseErrorReason;
  
  @Zvd(Zp = "responseStatusCode")
  @Zj
  public final Integer responseStatusCode;
  
  @Zvd(Zp = "responseStatusText")
  @Zj
  public final String responseStatusText;
  
  @Zvd(Zp = "responseHeaders")
  @Zj
  public final List<HeaderEntry> responseHeaders;
  
  @Zvd(Zp = "networkId")
  @Zj
  public final String networkId;
  
  @Zvd(Zp = "redirectedRequestId")
  @Zy
  @Zj
  public final String redirectedRequestId;
  
  private static String Zy;
  
  @Zox
  public RequestPaused(@Zc5(Ze = "requestId") String paramString1, @Zc5(Ze = "request") Request paramRequest, @Zc5(Ze = "frameId") String paramString2, @Zc5(Ze = "resourceType") ResourceType paramResourceType, @Zc5(Ze = "responseErrorReason", ZS = "null") ErrorReason paramErrorReason, @Zc5(Ze = "responseStatusCode", ZS = "null") Integer paramInteger, @Zc5(Ze = "responseStatusText", ZS = "null") String paramString3, @Zc5(Ze = "responseHeaders", ZS = "null") List<HeaderEntry> paramList, @Zc5(Ze = "networkId", ZS = "null") String paramString4, @Zc5(Ze = "redirectedRequestId", ZS = "null") String paramString5) {
    String str = ZS();
    this.requestId = paramString1;
    this.request = paramRequest;
    this.frameId = paramString2;
    this.resourceType = paramResourceType;
    this.responseErrorReason = paramErrorReason;
    this.responseStatusCode = paramInteger;
    this.responseStatusText = paramString3;
    this.responseHeaders = paramList;
    this.networkId = paramString4;
    this.redirectedRequestId = paramString5;
    if (str != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public static void ZN(String paramString) {
    Zy = paramString;
  }
  
  public static String ZS() {
    return Zy;
  }
  
  static {
    if (ZS() != null)
      ZN("AOD2z"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\fetch\RequestPaused.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */