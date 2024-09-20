package net.portswigger.devtools.protocol.types.audits;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.audits.CookieDeprecationMetadataIssueDetails")
public class CookieDeprecationMetadataIssueDetails {
  @Zvd(Zp = "allowedSites")
  public final List<String> allowedSites;
  
  @Zvd(Zp = "optOutPercentage")
  public final Double optOutPercentage;
  
  @Zvd(Zp = "isOptOutTopLevel")
  public final Boolean isOptOutTopLevel;
  
  @Zvd(Zp = "operation")
  public final CookieOperation operation;
  
  @Zox
  public CookieDeprecationMetadataIssueDetails(@Zc5(Ze = "allowedSites") List<String> paramList, @Zc5(Ze = "optOutPercentage") Double paramDouble, @Zc5(Ze = "isOptOutTopLevel") Boolean paramBoolean, @Zc5(Ze = "operation") CookieOperation paramCookieOperation) {
    this.allowedSites = paramList;
    this.optOutPercentage = paramDouble;
    this.isOptOutTopLevel = paramBoolean;
    this.operation = paramCookieOperation;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\CookieDeprecationMetadataIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */