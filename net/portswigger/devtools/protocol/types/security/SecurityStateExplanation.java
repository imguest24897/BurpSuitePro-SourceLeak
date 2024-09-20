package net.portswigger.devtools.protocol.types.security;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.security.SecurityStateExplanation")
public class SecurityStateExplanation {
  @Zvd(Zp = "securityState")
  public final SecurityState securityState;
  
  @Zvd(Zp = "title")
  public final String title;
  
  @Zvd(Zp = "summary")
  public final String summary;
  
  @Zvd(Zp = "description")
  public final String description;
  
  @Zvd(Zp = "mixedContentType")
  public final MixedContentType mixedContentType;
  
  @Zvd(Zp = "certificate")
  public final List<String> certificate;
  
  @Zvd(Zp = "recommendations")
  @Zj
  public final List<String> recommendations;
  
  @Zox
  public SecurityStateExplanation(@Zc5(Ze = "securityState") SecurityState paramSecurityState, @Zc5(Ze = "title") String paramString1, @Zc5(Ze = "summary") String paramString2, @Zc5(Ze = "description") String paramString3, @Zc5(Ze = "mixedContentType") MixedContentType paramMixedContentType, @Zc5(Ze = "certificate") List<String> paramList1, @Zc5(Ze = "recommendations", ZS = "null") List<String> paramList2) {
    this.securityState = paramSecurityState;
    this.title = paramString1;
    int i = VisibleSecurityState.Ze();
    this.summary = paramString2;
    this.description = paramString3;
    this.mixedContentType = paramMixedContentType;
    this.certificate = paramList1;
    this.recommendations = paramList2;
    if (Zbqc.Zwu() == null)
      VisibleSecurityState.Zy(++i); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\security\SecurityStateExplanation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */