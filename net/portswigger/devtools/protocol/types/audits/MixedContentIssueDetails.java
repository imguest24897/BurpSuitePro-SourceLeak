package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.MixedContentIssueDetails")
public class MixedContentIssueDetails {
  @Zvd(Zp = "resourceType")
  @Zj
  public final MixedContentResourceType resourceType;
  
  @Zvd(Zp = "resolutionStatus")
  public final MixedContentResolutionStatus resolutionStatus;
  
  @Zvd(Zp = "insecureURL")
  public final String insecureURL;
  
  @Zvd(Zp = "mainResourceURL")
  public final String mainResourceURL;
  
  @Zvd(Zp = "request")
  @Zj
  public final AffectedRequest request;
  
  @Zvd(Zp = "frame")
  @Zj
  public final AffectedFrame frame;
  
  @Zox
  public MixedContentIssueDetails(@Zc5(Ze = "resourceType", ZS = "null") MixedContentResourceType paramMixedContentResourceType, @Zc5(Ze = "resolutionStatus") MixedContentResolutionStatus paramMixedContentResolutionStatus, @Zc5(Ze = "insecureURL") String paramString1, @Zc5(Ze = "mainResourceURL") String paramString2, @Zc5(Ze = "request", ZS = "null") AffectedRequest paramAffectedRequest, @Zc5(Ze = "frame", ZS = "null") AffectedFrame paramAffectedFrame) {
    this.resourceType = paramMixedContentResourceType;
    this.resolutionStatus = paramMixedContentResolutionStatus;
    this.insecureURL = paramString1;
    this.mainResourceURL = paramString2;
    this.request = paramAffectedRequest;
    this.frame = paramAffectedFrame;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\MixedContentIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */