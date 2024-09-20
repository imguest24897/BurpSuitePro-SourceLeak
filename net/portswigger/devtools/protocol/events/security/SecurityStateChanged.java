package net.portswigger.devtools.protocol.events.security;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.security.InsecureContentStatus;
import net.portswigger.devtools.protocol.types.security.SecurityState;
import net.portswigger.devtools.protocol.types.security.SecurityStateExplanation;

@Deprecated
@Zsi("net.portswigger.devtools.protocol.events.security.SecurityStateChanged")
public class SecurityStateChanged implements Zl {
  @Zvd(Zp = "securityState")
  public final SecurityState securityState;
  
  @Zvd(Zp = "schemeIsCryptographic")
  @Deprecated
  public final Boolean schemeIsCryptographic;
  
  @Zvd(Zp = "explanations")
  @Deprecated
  public final List<SecurityStateExplanation> explanations;
  
  @Zvd(Zp = "insecureContentStatus")
  @Deprecated
  public final InsecureContentStatus insecureContentStatus;
  
  @Zvd(Zp = "summary")
  @Deprecated
  @Zj
  public final String summary;
  
  @Zox
  public SecurityStateChanged(@Zc5(Ze = "securityState") SecurityState paramSecurityState, @Zc5(Ze = "schemeIsCryptographic") Boolean paramBoolean, @Zc5(Ze = "explanations") List<SecurityStateExplanation> paramList, @Zc5(Ze = "insecureContentStatus") InsecureContentStatus paramInsecureContentStatus, @Zc5(Ze = "summary", ZS = "null") String paramString) {
    this.securityState = paramSecurityState;
    this.schemeIsCryptographic = paramBoolean;
    this.explanations = paramList;
    String str = VisibleSecurityStateChanged.Zr();
    this.insecureContentStatus = paramInsecureContentStatus;
    this.summary = paramString;
    if (str != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\security\SecurityStateChanged.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */