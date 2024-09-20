package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.page.AppManifestError")
public class AppManifestError {
  @Zvd(Zp = "message")
  public final String message;
  
  @Zvd(Zp = "critical")
  public final Integer critical;
  
  @Zvd(Zp = "line")
  public final Integer line;
  
  @Zvd(Zp = "column")
  public final Integer column;
  
  @Zox
  public AppManifestError(@Zc5(Ze = "message") String paramString, @Zc5(Ze = "critical") Integer paramInteger1, @Zc5(Ze = "line") Integer paramInteger2, @Zc5(Ze = "column") Integer paramInteger3) {
    this.message = paramString;
    this.critical = paramInteger1;
    this.line = paramInteger2;
    this.column = paramInteger3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\AppManifestError.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */