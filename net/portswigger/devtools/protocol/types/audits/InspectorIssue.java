package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.InspectorIssue")
public class InspectorIssue {
  @Zvd(Zp = "code")
  public final InspectorIssueCode code;
  
  @Zvd(Zp = "details")
  public final InspectorIssueDetails details;
  
  @Zvd(Zp = "issueId")
  @Zj
  public final String issueId;
  
  @Zox
  public InspectorIssue(@Zc5(Ze = "code") InspectorIssueCode paramInspectorIssueCode, @Zc5(Ze = "details") InspectorIssueDetails paramInspectorIssueDetails, @Zc5(Ze = "issueId", ZS = "null") String paramString) {
    this.code = paramInspectorIssueCode;
    this.details = paramInspectorIssueDetails;
    this.issueId = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\InspectorIssue.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */