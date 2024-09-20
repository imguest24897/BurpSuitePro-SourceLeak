package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.network.SubresourceWebBundleInnerResponseError")
public class SubresourceWebBundleInnerResponseError implements Zl {
  @Zvd(Zp = "innerRequestId")
  public final String innerRequestId;
  
  @Zvd(Zp = "innerRequestURL")
  public final String innerRequestURL;
  
  @Zvd(Zp = "errorMessage")
  public final String errorMessage;
  
  @Zvd(Zp = "bundleRequestId")
  @Zj
  public final String bundleRequestId;
  
  @Zox
  public SubresourceWebBundleInnerResponseError(@Zc5(Ze = "innerRequestId") String paramString1, @Zc5(Ze = "innerRequestURL") String paramString2, @Zc5(Ze = "errorMessage") String paramString3, @Zc5(Ze = "bundleRequestId", ZS = "null") String paramString4) {
    this.innerRequestId = paramString1;
    this.innerRequestURL = paramString2;
    this.errorMessage = paramString3;
    this.bundleRequestId = paramString4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\SubresourceWebBundleInnerResponseError.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */