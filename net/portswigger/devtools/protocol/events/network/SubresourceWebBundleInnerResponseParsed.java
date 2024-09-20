package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.network.SubresourceWebBundleInnerResponseParsed")
public class SubresourceWebBundleInnerResponseParsed implements Zl {
  @Zvd(Zp = "innerRequestId")
  public final String innerRequestId;
  
  @Zvd(Zp = "innerRequestURL")
  public final String innerRequestURL;
  
  @Zvd(Zp = "bundleRequestId")
  @Zj
  public final String bundleRequestId;
  
  @Zox
  public SubresourceWebBundleInnerResponseParsed(@Zc5(Ze = "innerRequestId") String paramString1, @Zc5(Ze = "innerRequestURL") String paramString2, @Zc5(Ze = "bundleRequestId", ZS = "null") String paramString3) {
    this.innerRequestId = paramString1;
    this.innerRequestURL = paramString2;
    this.bundleRequestId = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\SubresourceWebBundleInnerResponseParsed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */