package net.portswigger.devtools.protocol.types.security;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Deprecated
@Zsi("net.portswigger.devtools.protocol.types.security.InsecureContentStatus")
public class InsecureContentStatus {
  @Zvd(Zp = "ranMixedContent")
  public final Boolean ranMixedContent;
  
  @Zvd(Zp = "displayedMixedContent")
  public final Boolean displayedMixedContent;
  
  @Zvd(Zp = "containedMixedForm")
  public final Boolean containedMixedForm;
  
  @Zvd(Zp = "ranContentWithCertErrors")
  public final Boolean ranContentWithCertErrors;
  
  @Zvd(Zp = "displayedContentWithCertErrors")
  public final Boolean displayedContentWithCertErrors;
  
  @Zvd(Zp = "ranInsecureContentStyle")
  public final SecurityState ranInsecureContentStyle;
  
  @Zvd(Zp = "displayedInsecureContentStyle")
  public final SecurityState displayedInsecureContentStyle;
  
  @Zox
  public InsecureContentStatus(@Zc5(Ze = "ranMixedContent") Boolean paramBoolean1, @Zc5(Ze = "displayedMixedContent") Boolean paramBoolean2, @Zc5(Ze = "containedMixedForm") Boolean paramBoolean3, @Zc5(Ze = "ranContentWithCertErrors") Boolean paramBoolean4, @Zc5(Ze = "displayedContentWithCertErrors") Boolean paramBoolean5, @Zc5(Ze = "ranInsecureContentStyle") SecurityState paramSecurityState1, @Zc5(Ze = "displayedInsecureContentStyle") SecurityState paramSecurityState2) {
    this.ranMixedContent = paramBoolean1;
    this.displayedMixedContent = paramBoolean2;
    this.containedMixedForm = paramBoolean3;
    this.ranContentWithCertErrors = paramBoolean4;
    this.displayedContentWithCertErrors = paramBoolean5;
    this.ranInsecureContentStyle = paramSecurityState1;
    this.displayedInsecureContentStyle = paramSecurityState2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\security\InsecureContentStatus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */