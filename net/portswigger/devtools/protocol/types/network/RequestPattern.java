package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.RequestPattern")
public class RequestPattern {
  @Zvd(Zp = "urlPattern")
  @Zj
  public final String urlPattern;
  
  @Zvd(Zp = "resourceType")
  @Zj
  public final ResourceType resourceType;
  
  @Zvd(Zp = "interceptionStage")
  @Zj
  public final InterceptionStage interceptionStage;
  
  @Zox
  public RequestPattern(@Zc5(Ze = "urlPattern", ZS = "null") String paramString, @Zc5(Ze = "resourceType", ZS = "null") ResourceType paramResourceType, @Zc5(Ze = "interceptionStage", ZS = "null") InterceptionStage paramInterceptionStage) {
    this.urlPattern = paramString;
    this.resourceType = paramResourceType;
    this.interceptionStage = paramInterceptionStage;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\RequestPattern.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */