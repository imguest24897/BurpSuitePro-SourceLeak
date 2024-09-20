package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.GenericIssueDetails")
public class GenericIssueDetails {
  @Zvd(Zp = "errorType")
  public final GenericIssueErrorType errorType;
  
  @Zvd(Zp = "frameId")
  @Zj
  public final String frameId;
  
  @Zvd(Zp = "violatingNodeId")
  @Zj
  public final Integer violatingNodeId;
  
  @Zvd(Zp = "violatingNodeAttribute")
  @Zj
  public final String violatingNodeAttribute;
  
  @Zvd(Zp = "request")
  @Zj
  public final AffectedRequest request;
  
  @Zox
  public GenericIssueDetails(@Zc5(Ze = "errorType") GenericIssueErrorType paramGenericIssueErrorType, @Zc5(Ze = "frameId", ZS = "null") String paramString1, @Zc5(Ze = "violatingNodeId", ZS = "null") Integer paramInteger, @Zc5(Ze = "violatingNodeAttribute", ZS = "null") String paramString2, @Zc5(Ze = "request", ZS = "null") AffectedRequest paramAffectedRequest) {
    this.errorType = paramGenericIssueErrorType;
    this.frameId = paramString1;
    this.violatingNodeId = paramInteger;
    this.violatingNodeAttribute = paramString2;
    this.request = paramAffectedRequest;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\GenericIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */