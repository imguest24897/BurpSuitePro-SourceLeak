package net.portswigger.devtools.protocol.types.browser;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.browser.Version")
public class Version {
  @Zvd(Zp = "protocolVersion")
  public final String protocolVersion;
  
  @Zvd(Zp = "product")
  public final String product;
  
  @Zvd(Zp = "revision")
  public final String revision;
  
  @Zvd(Zp = "userAgent")
  public final String userAgent;
  
  @Zvd(Zp = "jsVersion")
  public final String jsVersion;
  
  @Zox
  public Version(@Zc5(Ze = "protocolVersion") String paramString1, @Zc5(Ze = "product") String paramString2, @Zc5(Ze = "revision") String paramString3, @Zc5(Ze = "userAgent") String paramString4, @Zc5(Ze = "jsVersion") String paramString5) {
    this.protocolVersion = paramString1;
    this.product = paramString2;
    this.revision = paramString3;
    this.userAgent = paramString4;
    this.jsVersion = paramString5;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\browser\Version.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */