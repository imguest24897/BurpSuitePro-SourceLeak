package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.PropertyRuleIssueDetails")
public class PropertyRuleIssueDetails {
  @Zvd(Zp = "sourceCodeLocation")
  public final SourceCodeLocation sourceCodeLocation;
  
  @Zvd(Zp = "propertyRuleIssueReason")
  public final PropertyRuleIssueReason propertyRuleIssueReason;
  
  @Zvd(Zp = "propertyValue")
  @Zj
  public final String propertyValue;
  
  @Zox
  public PropertyRuleIssueDetails(@Zc5(Ze = "sourceCodeLocation") SourceCodeLocation paramSourceCodeLocation, @Zc5(Ze = "propertyRuleIssueReason") PropertyRuleIssueReason paramPropertyRuleIssueReason, @Zc5(Ze = "propertyValue", ZS = "null") String paramString) {
    this.sourceCodeLocation = paramSourceCodeLocation;
    this.propertyRuleIssueReason = paramPropertyRuleIssueReason;
    this.propertyValue = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\PropertyRuleIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */