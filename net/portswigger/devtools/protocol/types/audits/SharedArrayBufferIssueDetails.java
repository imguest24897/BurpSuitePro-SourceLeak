package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.audits.SharedArrayBufferIssueDetails")
public class SharedArrayBufferIssueDetails {
  @Zvd(Zp = "sourceCodeLocation")
  public final SourceCodeLocation sourceCodeLocation;
  
  @Zvd(Zp = "isWarning")
  public final Boolean isWarning;
  
  @Zvd(Zp = "type")
  public final SharedArrayBufferIssueType type;
  
  @Zox
  public SharedArrayBufferIssueDetails(@Zc5(Ze = "sourceCodeLocation") SourceCodeLocation paramSourceCodeLocation, @Zc5(Ze = "isWarning") Boolean paramBoolean, @Zc5(Ze = "type") SharedArrayBufferIssueType paramSharedArrayBufferIssueType) {
    this.sourceCodeLocation = paramSourceCodeLocation;
    this.isWarning = paramBoolean;
    this.type = paramSharedArrayBufferIssueType;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\SharedArrayBufferIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */