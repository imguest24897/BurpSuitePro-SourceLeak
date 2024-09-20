package net.portswigger.devtools.protocol.types.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.page.AppManifest")
public class AppManifest {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "errors")
  public final List<AppManifestError> errors;
  
  @Zvd(Zp = "data")
  @Zj
  public final String data;
  
  @Zvd(Zp = "parsed")
  @Deprecated
  @Zy
  @Zj
  public final AppManifestParsedProperties parsed;
  
  @Zvd(Zp = "manifest")
  @Zy
  public final WebAppManifest manifest;
  
  @Zox
  public AppManifest(@Zc5(Ze = "url") String paramString1, @Zc5(Ze = "errors") List<AppManifestError> paramList, @Zc5(Ze = "data", ZS = "null") String paramString2, @Zc5(Ze = "parsed", ZS = "null") AppManifestParsedProperties paramAppManifestParsedProperties, @Zc5(Ze = "manifest") WebAppManifest paramWebAppManifest) {
    this.url = paramString1;
    this.errors = paramList;
    this.data = paramString2;
    this.parsed = paramAppManifestParsedProperties;
    this.manifest = paramWebAppManifest;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\AppManifest.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */