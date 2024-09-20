package net.portswigger.devtools.protocol.types.network;

import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.network.WebSocketResponse")
public class WebSocketResponse {
  @Zvd(Zp = "status")
  public final Integer status;
  
  @Zvd(Zp = "statusText")
  public final String statusText;
  
  @Zvd(Zp = "headers")
  public final Map<String, Zi7> headers;
  
  @Zvd(Zp = "headersText")
  @Zj
  public final String headersText;
  
  @Zvd(Zp = "requestHeaders")
  @Zj
  public final Map<String, Zi7> requestHeaders;
  
  @Zvd(Zp = "requestHeadersText")
  @Zj
  public final String requestHeadersText;
  
  @Zox
  public WebSocketResponse(@Zc5(Ze = "status") Integer paramInteger, @Zc5(Ze = "statusText") String paramString1, @Zc5(Ze = "headers") Map<String, Zi7> paramMap1, @Zc5(Ze = "headersText", ZS = "null") String paramString2, @Zc5(Ze = "requestHeaders", ZS = "null") Map<String, Zi7> paramMap2, @Zc5(Ze = "requestHeadersText", ZS = "null") String paramString3) {
    this.status = paramInteger;
    this.statusText = paramString1;
    this.headers = paramMap1;
    this.headersText = paramString2;
    this.requestHeaders = paramMap2;
    this.requestHeadersText = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\WebSocketResponse.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */