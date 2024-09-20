package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.audits.AffectedCookie")
public class AffectedCookie {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "path")
  public final String path;
  
  @Zvd(Zp = "domain")
  public final String domain;
  
  @Zox
  public AffectedCookie(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "path") String paramString2, @Zc5(Ze = "domain") String paramString3) {
    this.name = paramString1;
    this.path = paramString2;
    this.domain = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\AffectedCookie.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */