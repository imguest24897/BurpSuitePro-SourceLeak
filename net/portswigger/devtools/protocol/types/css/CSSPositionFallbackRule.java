package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Deprecated
@Zsi("net.portswigger.devtools.protocol.types.css.CSSPositionFallbackRule")
public class CSSPositionFallbackRule {
  @Zvd(Zp = "name")
  public final Value name;
  
  @Zvd(Zp = "tryRules")
  public final List<CSSTryRule> tryRules;
  
  @Zox
  public CSSPositionFallbackRule(@Zc5(Ze = "name") Value paramValue, @Zc5(Ze = "tryRules") List<CSSTryRule> paramList) {
    this.name = paramValue;
    this.tryRules = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSPositionFallbackRule.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */