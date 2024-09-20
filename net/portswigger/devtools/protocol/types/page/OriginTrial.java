package net.portswigger.devtools.protocol.types.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.OriginTrial")
public class OriginTrial {
  @Zvd(Zp = "trialName")
  public final String trialName;
  
  @Zvd(Zp = "status")
  public final OriginTrialStatus status;
  
  @Zvd(Zp = "tokensWithStatus")
  public final List<OriginTrialTokenWithStatus> tokensWithStatus;
  
  @Zox
  public OriginTrial(@Zc5(Ze = "trialName") String paramString, @Zc5(Ze = "status") OriginTrialStatus paramOriginTrialStatus, @Zc5(Ze = "tokensWithStatus") List<OriginTrialTokenWithStatus> paramList) {
    this.trialName = paramString;
    this.status = paramOriginTrialStatus;
    this.tokensWithStatus = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\OriginTrial.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */