package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.OriginTrialToken")
public class OriginTrialToken {
  @Zvd(Zp = "origin")
  public final String origin;
  
  @Zvd(Zp = "matchSubDomains")
  public final Boolean matchSubDomains;
  
  @Zvd(Zp = "trialName")
  public final String trialName;
  
  @Zvd(Zp = "expiryTime")
  public final Double expiryTime;
  
  @Zvd(Zp = "isThirdParty")
  public final Boolean isThirdParty;
  
  @Zvd(Zp = "usageRestriction")
  public final OriginTrialUsageRestriction usageRestriction;
  
  @Zox
  public OriginTrialToken(@Zc5(Ze = "origin") String paramString1, @Zc5(Ze = "matchSubDomains") Boolean paramBoolean1, @Zc5(Ze = "trialName") String paramString2, @Zc5(Ze = "expiryTime") Double paramDouble, @Zc5(Ze = "isThirdParty") Boolean paramBoolean2, @Zc5(Ze = "usageRestriction") OriginTrialUsageRestriction paramOriginTrialUsageRestriction) {
    this.origin = paramString1;
    this.matchSubDomains = paramBoolean1;
    this.trialName = paramString2;
    this.expiryTime = paramDouble;
    this.isThirdParty = paramBoolean2;
    this.usageRestriction = paramOriginTrialUsageRestriction;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\OriginTrialToken.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */