package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.css.CSSKeyframesRule")
public class CSSKeyframesRule {
  @Zvd(Zp = "animationName")
  public final Value animationName;
  
  @Zvd(Zp = "keyframes")
  public final List<CSSKeyframeRule> keyframes;
  
  @Zox
  public CSSKeyframesRule(@Zc5(Ze = "animationName") Value paramValue, @Zc5(Ze = "keyframes") List<CSSKeyframeRule> paramList) {
    this.animationName = paramValue;
    this.keyframes = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSKeyframesRule.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */