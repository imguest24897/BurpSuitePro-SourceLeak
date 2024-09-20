package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.OriginTrialTokenWithStatus")
public class OriginTrialTokenWithStatus {
  @Zvd(Zp = "rawTokenText")
  public final String rawTokenText;
  
  @Zvd(Zp = "parsedToken")
  @Zj
  public final OriginTrialToken parsedToken;
  
  @Zvd(Zp = "status")
  public final OriginTrialTokenStatus status;
  
  @Zox
  public OriginTrialTokenWithStatus(@Zc5(Ze = "rawTokenText") String paramString, @Zc5(Ze = "parsedToken", ZS = "null") OriginTrialToken paramOriginTrialToken, @Zc5(Ze = "status") OriginTrialTokenStatus paramOriginTrialTokenStatus) {
    this.rawTokenText = paramString;
    this.parsedToken = paramOriginTrialToken;
    this.status = paramOriginTrialTokenStatus;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\OriginTrialTokenWithStatus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */