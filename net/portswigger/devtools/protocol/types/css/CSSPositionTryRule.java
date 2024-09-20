package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.css.CSSPositionTryRule")
public class CSSPositionTryRule {
  @Zvd(Zp = "name")
  public final Value name;
  
  @Zvd(Zp = "styleSheetId")
  @Zj
  public final String styleSheetId;
  
  @Zvd(Zp = "origin")
  public final StyleSheetOrigin origin;
  
  @Zvd(Zp = "style")
  public final CSSStyle style;
  
  @Zvd(Zp = "active")
  public final Boolean active;
  
  @Zox
  public CSSPositionTryRule(@Zc5(Ze = "name") Value paramValue, @Zc5(Ze = "styleSheetId", ZS = "null") String paramString, @Zc5(Ze = "origin") StyleSheetOrigin paramStyleSheetOrigin, @Zc5(Ze = "style") CSSStyle paramCSSStyle, @Zc5(Ze = "active") Boolean paramBoolean) {
    this.name = paramValue;
    this.styleSheetId = paramString;
    this.origin = paramStyleSheetOrigin;
    this.style = paramCSSStyle;
    this.active = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSPositionTryRule.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */