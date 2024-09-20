package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.network.SubresourceWebBundleMetadataError")
public class SubresourceWebBundleMetadataError implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "errorMessage")
  public final String errorMessage;
  
  @Zox
  public SubresourceWebBundleMetadataError(@Zc5(Ze = "requestId") String paramString1, @Zc5(Ze = "errorMessage") String paramString2) {
    this.requestId = paramString1;
    this.errorMessage = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\SubresourceWebBundleMetadataError.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */