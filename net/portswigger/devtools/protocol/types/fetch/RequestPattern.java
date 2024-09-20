package net.portswigger.devtools.protocol.types.fetch;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.network.ResourceType;

@Zsi("net.portswigger.devtools.protocol.types.fetch.RequestPattern")
public class RequestPattern {
  @Zvd(Zp = "urlPattern")
  @Zj
  public final String urlPattern;
  
  @Zvd(Zp = "resourceType")
  @Zj
  public final ResourceType resourceType;
  
  @Zvd(Zp = "requestStage")
  @Zj
  public final RequestStage requestStage;
  
  @Zox
  public RequestPattern(@Zc5(Ze = "urlPattern", ZS = "null") String paramString, @Zc5(Ze = "resourceType", ZS = "null") ResourceType paramResourceType, @Zc5(Ze = "requestStage", ZS = "null") RequestStage paramRequestStage) {
    this.urlPattern = paramString;
    this.resourceType = paramResourceType;
    this.requestStage = paramRequestStage;
    int[] arrayOfInt = HeaderEntry.ZE();
    if (Zbqc.Zwu() == null)
      HeaderEntry.ZL(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\fetch\RequestPattern.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */