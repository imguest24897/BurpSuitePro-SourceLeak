package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.ContentSecurityPolicyStatus")
public class ContentSecurityPolicyStatus {
  @Zvd(Zp = "effectiveDirectives")
  public final String effectiveDirectives;
  
  @Zvd(Zp = "isEnforced")
  public final Boolean isEnforced;
  
  @Zvd(Zp = "source")
  public final ContentSecurityPolicySource source;
  
  @Zox
  public ContentSecurityPolicyStatus(@Zc5(Ze = "effectiveDirectives") String paramString, @Zc5(Ze = "isEnforced") Boolean paramBoolean, @Zc5(Ze = "source") ContentSecurityPolicySource paramContentSecurityPolicySource) {
    this.effectiveDirectives = paramString;
    this.isEnforced = paramBoolean;
    this.source = paramContentSecurityPolicySource;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\ContentSecurityPolicyStatus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */