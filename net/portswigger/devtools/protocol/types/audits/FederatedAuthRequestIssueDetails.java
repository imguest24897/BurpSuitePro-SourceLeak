package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.audits.FederatedAuthRequestIssueDetails")
public class FederatedAuthRequestIssueDetails {
  @Zvd(Zp = "federatedAuthRequestIssueReason")
  public final FederatedAuthRequestIssueReason federatedAuthRequestIssueReason;
  
  @Zox
  public FederatedAuthRequestIssueDetails(@Zc5(Ze = "federatedAuthRequestIssueReason") FederatedAuthRequestIssueReason paramFederatedAuthRequestIssueReason) {
    this.federatedAuthRequestIssueReason = paramFederatedAuthRequestIssueReason;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\FederatedAuthRequestIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */