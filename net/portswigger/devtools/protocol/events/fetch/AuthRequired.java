package net.portswigger.devtools.protocol.events.fetch;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.fetch.AuthChallenge;
import net.portswigger.devtools.protocol.types.network.Request;
import net.portswigger.devtools.protocol.types.network.ResourceType;

@Zsi("net.portswigger.devtools.protocol.events.fetch.AuthRequired")
public class AuthRequired implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "request")
  public final Request request;
  
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "resourceType")
  public final ResourceType resourceType;
  
  @Zvd(Zp = "authChallenge")
  public final AuthChallenge authChallenge;
  
  @Zox
  public AuthRequired(@Zc5(Ze = "requestId") String paramString1, @Zc5(Ze = "request") Request paramRequest, @Zc5(Ze = "frameId") String paramString2, @Zc5(Ze = "resourceType") ResourceType paramResourceType, @Zc5(Ze = "authChallenge") AuthChallenge paramAuthChallenge) {
    this.requestId = paramString1;
    String str = RequestPaused.ZS();
    this.request = paramRequest;
    this.frameId = paramString2;
    this.resourceType = paramResourceType;
    this.authChallenge = paramAuthChallenge;
    if (Zbqc.Zwu() == null)
      RequestPaused.ZN("vIPx0b"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\fetch\AuthRequired.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */