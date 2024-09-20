package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.BlockedByResponseIssueDetails")
public class BlockedByResponseIssueDetails {
  @Zvd(Zp = "request")
  public final AffectedRequest request;
  
  @Zvd(Zp = "parentFrame")
  @Zj
  public final AffectedFrame parentFrame;
  
  @Zvd(Zp = "blockedFrame")
  @Zj
  public final AffectedFrame blockedFrame;
  
  @Zvd(Zp = "reason")
  public final BlockedByResponseReason reason;
  
  @Zox
  public BlockedByResponseIssueDetails(@Zc5(Ze = "request") AffectedRequest paramAffectedRequest, @Zc5(Ze = "parentFrame", ZS = "null") AffectedFrame paramAffectedFrame1, @Zc5(Ze = "blockedFrame", ZS = "null") AffectedFrame paramAffectedFrame2, @Zc5(Ze = "reason") BlockedByResponseReason paramBlockedByResponseReason) {
    this.request = paramAffectedRequest;
    this.parentFrame = paramAffectedFrame1;
    this.blockedFrame = paramAffectedFrame2;
    this.reason = paramBlockedByResponseReason;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\BlockedByResponseIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */