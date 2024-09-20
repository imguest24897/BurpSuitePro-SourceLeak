package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.audits.SharedDictionaryIssueDetails")
public class SharedDictionaryIssueDetails {
  @Zvd(Zp = "sharedDictionaryError")
  public final SharedDictionaryError sharedDictionaryError;
  
  @Zvd(Zp = "request")
  public final AffectedRequest request;
  
  @Zox
  public SharedDictionaryIssueDetails(@Zc5(Ze = "sharedDictionaryError") SharedDictionaryError paramSharedDictionaryError, @Zc5(Ze = "request") AffectedRequest paramAffectedRequest) {
    this.sharedDictionaryError = paramSharedDictionaryError;
    this.request = paramAffectedRequest;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\SharedDictionaryIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */