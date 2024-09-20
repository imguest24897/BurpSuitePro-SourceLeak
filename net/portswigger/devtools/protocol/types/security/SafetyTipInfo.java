package net.portswigger.devtools.protocol.types.security;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.security.SafetyTipInfo")
public class SafetyTipInfo {
  @Zvd(Zp = "safetyTipStatus")
  public final SafetyTipStatus safetyTipStatus;
  
  @Zvd(Zp = "safeUrl")
  @Zj
  public final String safeUrl;
  
  @Zox
  public SafetyTipInfo(@Zc5(Ze = "safetyTipStatus") SafetyTipStatus paramSafetyTipStatus, @Zc5(Ze = "safeUrl", ZS = "null") String paramString) {
    this.safetyTipStatus = paramSafetyTipStatus;
    this.safeUrl = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\security\SafetyTipInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */