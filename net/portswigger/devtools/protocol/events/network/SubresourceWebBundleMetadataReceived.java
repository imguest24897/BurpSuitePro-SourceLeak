package net.portswigger.devtools.protocol.events.network;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.network.SubresourceWebBundleMetadataReceived")
public class SubresourceWebBundleMetadataReceived implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "urls")
  public final List<String> urls;
  
  @Zox
  public SubresourceWebBundleMetadataReceived(@Zc5(Ze = "requestId") String paramString, @Zc5(Ze = "urls") List<String> paramList) {
    this.requestId = paramString;
    this.urls = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\SubresourceWebBundleMetadataReceived.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */