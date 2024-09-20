package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.css.InheritedStyleEntry")
public class InheritedStyleEntry {
  @Zvd(Zp = "inlineStyle")
  @Zj
  public final CSSStyle inlineStyle;
  
  @Zvd(Zp = "matchedCSSRules")
  public final List<RuleMatch> matchedCSSRules;
  
  @Zox
  public InheritedStyleEntry(@Zc5(Ze = "inlineStyle", ZS = "null") CSSStyle paramCSSStyle, @Zc5(Ze = "matchedCSSRules") List<RuleMatch> paramList) {
    this.inlineStyle = paramCSSStyle;
    this.matchedCSSRules = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\InheritedStyleEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */