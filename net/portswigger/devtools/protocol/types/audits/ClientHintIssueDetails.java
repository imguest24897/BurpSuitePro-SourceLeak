package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.audits.ClientHintIssueDetails")
public class ClientHintIssueDetails {
  @Zvd(Zp = "sourceCodeLocation")
  public final SourceCodeLocation sourceCodeLocation;
  
  @Zvd(Zp = "clientHintIssueReason")
  public final ClientHintIssueReason clientHintIssueReason;
  
  @Zox
  public ClientHintIssueDetails(@Zc5(Ze = "sourceCodeLocation") SourceCodeLocation paramSourceCodeLocation, @Zc5(Ze = "clientHintIssueReason") ClientHintIssueReason paramClientHintIssueReason) {
    this.sourceCodeLocation = paramSourceCodeLocation;
    this.clientHintIssueReason = paramClientHintIssueReason;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\ClientHintIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */