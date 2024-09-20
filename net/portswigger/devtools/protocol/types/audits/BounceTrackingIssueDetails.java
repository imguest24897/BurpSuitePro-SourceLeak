package net.portswigger.devtools.protocol.types.audits;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.audits.BounceTrackingIssueDetails")
public class BounceTrackingIssueDetails {
  @Zvd(Zp = "trackingSites")
  public final List<String> trackingSites;
  
  @Zox
  public BounceTrackingIssueDetails(@Zc5(Ze = "trackingSites") List<String> paramList) {
    this.trackingSites = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\BounceTrackingIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */