package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Deprecated
@Zsi("net.portswigger.devtools.protocol.types.audits.NavigatorUserAgentIssueDetails")
public class NavigatorUserAgentIssueDetails {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "location")
  @Zj
  public final SourceCodeLocation location;
  
  @Zox
  public NavigatorUserAgentIssueDetails(@Zc5(Ze = "url") String paramString, @Zc5(Ze = "location", ZS = "null") SourceCodeLocation paramSourceCodeLocation) {
    this.url = paramString;
    this.location = paramSourceCodeLocation;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\NavigatorUserAgentIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */