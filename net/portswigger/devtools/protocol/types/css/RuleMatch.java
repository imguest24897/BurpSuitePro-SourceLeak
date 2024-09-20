package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.css.RuleMatch")
public class RuleMatch {
  @Zvd(Zp = "rule")
  public final CSSRule rule;
  
  @Zvd(Zp = "matchingSelectors")
  public final List<Integer> matchingSelectors;
  
  @Zox
  public RuleMatch(@Zc5(Ze = "rule") CSSRule paramCSSRule, @Zc5(Ze = "matchingSelectors") List<Integer> paramList) {
    this.rule = paramCSSRule;
    this.matchingSelectors = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\RuleMatch.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */