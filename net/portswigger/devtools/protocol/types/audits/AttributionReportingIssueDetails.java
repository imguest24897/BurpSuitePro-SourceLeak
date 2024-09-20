package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.AttributionReportingIssueDetails")
public class AttributionReportingIssueDetails {
  @Zvd(Zp = "violationType")
  public final AttributionReportingIssueType violationType;
  
  @Zvd(Zp = "request")
  @Zj
  public final AffectedRequest request;
  
  @Zvd(Zp = "violatingNodeId")
  @Zj
  public final Integer violatingNodeId;
  
  @Zvd(Zp = "invalidParameter")
  @Zj
  public final String invalidParameter;
  
  @Zox
  public AttributionReportingIssueDetails(@Zc5(Ze = "violationType") AttributionReportingIssueType paramAttributionReportingIssueType, @Zc5(Ze = "request", ZS = "null") AffectedRequest paramAffectedRequest, @Zc5(Ze = "violatingNodeId", ZS = "null") Integer paramInteger, @Zc5(Ze = "invalidParameter", ZS = "null") String paramString) {
    this.violationType = paramAttributionReportingIssueType;
    this.request = paramAffectedRequest;
    this.violatingNodeId = paramInteger;
    this.invalidParameter = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\AttributionReportingIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */