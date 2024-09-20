package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.audits.FederatedAuthUserInfoRequestIssueDetails")
public class FederatedAuthUserInfoRequestIssueDetails {
  @Zvd(Zp = "federatedAuthUserInfoRequestIssueReason")
  public final FederatedAuthUserInfoRequestIssueReason federatedAuthUserInfoRequestIssueReason;
  
  @Zox
  public FederatedAuthUserInfoRequestIssueDetails(@Zc5(Ze = "federatedAuthUserInfoRequestIssueReason") FederatedAuthUserInfoRequestIssueReason paramFederatedAuthUserInfoRequestIssueReason) {
    this.federatedAuthUserInfoRequestIssueReason = paramFederatedAuthUserInfoRequestIssueReason;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\FederatedAuthUserInfoRequestIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */