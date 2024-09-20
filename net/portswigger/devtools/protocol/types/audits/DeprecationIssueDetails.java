package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.DeprecationIssueDetails")
public class DeprecationIssueDetails {
  @Zvd(Zp = "affectedFrame")
  @Zj
  public final AffectedFrame affectedFrame;
  
  @Zvd(Zp = "sourceCodeLocation")
  public final SourceCodeLocation sourceCodeLocation;
  
  @Zvd(Zp = "type")
  public final String type;
  
  @Zox
  public DeprecationIssueDetails(@Zc5(Ze = "affectedFrame", ZS = "null") AffectedFrame paramAffectedFrame, @Zc5(Ze = "sourceCodeLocation") SourceCodeLocation paramSourceCodeLocation, @Zc5(Ze = "type") String paramString) {
    this.affectedFrame = paramAffectedFrame;
    this.sourceCodeLocation = paramSourceCodeLocation;
    this.type = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\DeprecationIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */