package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.network.CachedResource")
public class CachedResource {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "type")
  public final ResourceType type;
  
  @Zvd(Zp = "response")
  @Zj
  public final Response response;
  
  @Zvd(Zp = "bodySize")
  public final Double bodySize;
  
  @Zox
  public CachedResource(@Zc5(Ze = "url") String paramString, @Zc5(Ze = "type") ResourceType paramResourceType, @Zc5(Ze = "response", ZS = "null") Response paramResponse, @Zc5(Ze = "bodySize") Double paramDouble) {
    this.url = paramString;
    this.type = paramResourceType;
    this.response = paramResponse;
    this.bodySize = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\CachedResource.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */