package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.css.InlineStylesForNode")
public class InlineStylesForNode {
  @Zvd(Zp = "inlineStyle")
  @Zj
  public final CSSStyle inlineStyle;
  
  @Zvd(Zp = "attributesStyle")
  @Zj
  public final CSSStyle attributesStyle;
  
  @Zox
  public InlineStylesForNode(@Zc5(Ze = "inlineStyle", ZS = "null") CSSStyle paramCSSStyle1, @Zc5(Ze = "attributesStyle", ZS = "null") CSSStyle paramCSSStyle2) {
    this.inlineStyle = paramCSSStyle1;
    this.attributesStyle = paramCSSStyle2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\InlineStylesForNode.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */