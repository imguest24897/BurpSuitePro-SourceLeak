package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.audits.HeavyAdIssueDetails")
public class HeavyAdIssueDetails {
  @Zvd(Zp = "resolution")
  public final HeavyAdResolutionStatus resolution;
  
  @Zvd(Zp = "reason")
  public final HeavyAdReason reason;
  
  @Zvd(Zp = "frame")
  public final AffectedFrame frame;
  
  @Zox
  public HeavyAdIssueDetails(@Zc5(Ze = "resolution") HeavyAdResolutionStatus paramHeavyAdResolutionStatus, @Zc5(Ze = "reason") HeavyAdReason paramHeavyAdReason, @Zc5(Ze = "frame") AffectedFrame paramAffectedFrame) {
    this.resolution = paramHeavyAdResolutionStatus;
    this.reason = paramHeavyAdReason;
    this.frame = paramAffectedFrame;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\HeavyAdIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */