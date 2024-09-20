package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.AppManifestParsedProperties")
public class AppManifestParsedProperties {
  @Zvd(Zp = "scope")
  public final String scope;
  
  @Zox
  public AppManifestParsedProperties(@Zc5(Ze = "scope") String paramString) {
    this.scope = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\AppManifestParsedProperties.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */