package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.ScopeExtension")
public class ScopeExtension {
  @Zvd(Zp = "origin")
  public final String origin;
  
  @Zvd(Zp = "hasOriginWildcard")
  public final Boolean hasOriginWildcard;
  
  @Zox
  public ScopeExtension(@Zc5(Ze = "origin") String paramString, @Zc5(Ze = "hasOriginWildcard") Boolean paramBoolean) {
    this.origin = paramString;
    this.hasOriginWildcard = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\ScopeExtension.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */