package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.overlay.FlexItemHighlightConfig")
public class FlexItemHighlightConfig {
  @Zvd(Zp = "baseSizeBox")
  @Zj
  public final BoxStyle baseSizeBox;
  
  @Zvd(Zp = "baseSizeBorder")
  @Zj
  public final LineStyle baseSizeBorder;
  
  @Zvd(Zp = "flexibilityArrow")
  @Zj
  public final LineStyle flexibilityArrow;
  
  @Zox
  public FlexItemHighlightConfig(@Zc5(Ze = "baseSizeBox", ZS = "null") BoxStyle paramBoxStyle, @Zc5(Ze = "baseSizeBorder", ZS = "null") LineStyle paramLineStyle1, @Zc5(Ze = "flexibilityArrow", ZS = "null") LineStyle paramLineStyle2) {
    this.baseSizeBox = paramBoxStyle;
    this.baseSizeBorder = paramLineStyle1;
    this.flexibilityArrow = paramLineStyle2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\FlexItemHighlightConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */