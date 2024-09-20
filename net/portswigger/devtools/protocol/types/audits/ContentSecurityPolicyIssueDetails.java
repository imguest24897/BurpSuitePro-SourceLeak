package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.ContentSecurityPolicyIssueDetails")
public class ContentSecurityPolicyIssueDetails {
  @Zvd(Zp = "blockedURL")
  @Zj
  public final String blockedURL;
  
  @Zvd(Zp = "violatedDirective")
  public final String violatedDirective;
  
  @Zvd(Zp = "isReportOnly")
  public final Boolean isReportOnly;
  
  @Zvd(Zp = "contentSecurityPolicyViolationType")
  public final ContentSecurityPolicyViolationType contentSecurityPolicyViolationType;
  
  @Zvd(Zp = "frameAncestor")
  @Zj
  public final AffectedFrame frameAncestor;
  
  @Zvd(Zp = "sourceCodeLocation")
  @Zj
  public final SourceCodeLocation sourceCodeLocation;
  
  @Zvd(Zp = "violatingNodeId")
  @Zj
  public final Integer violatingNodeId;
  
  @Zox
  public ContentSecurityPolicyIssueDetails(@Zc5(Ze = "blockedURL", ZS = "null") String paramString1, @Zc5(Ze = "violatedDirective") String paramString2, @Zc5(Ze = "isReportOnly") Boolean paramBoolean, @Zc5(Ze = "contentSecurityPolicyViolationType") ContentSecurityPolicyViolationType paramContentSecurityPolicyViolationType, @Zc5(Ze = "frameAncestor", ZS = "null") AffectedFrame paramAffectedFrame, @Zc5(Ze = "sourceCodeLocation", ZS = "null") SourceCodeLocation paramSourceCodeLocation, @Zc5(Ze = "violatingNodeId", ZS = "null") Integer paramInteger) {
    this.blockedURL = paramString1;
    this.violatedDirective = paramString2;
    this.isReportOnly = paramBoolean;
    this.contentSecurityPolicyViolationType = paramContentSecurityPolicyViolationType;
    this.frameAncestor = paramAffectedFrame;
    this.sourceCodeLocation = paramSourceCodeLocation;
    this.violatingNodeId = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\ContentSecurityPolicyIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */