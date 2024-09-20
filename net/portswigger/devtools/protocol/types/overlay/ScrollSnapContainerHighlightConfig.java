package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.dom.RGBA;

@Zsi("net.portswigger.devtools.protocol.types.overlay.ScrollSnapContainerHighlightConfig")
public class ScrollSnapContainerHighlightConfig {
  @Zvd(Zp = "snapportBorder")
  @Zj
  public final LineStyle snapportBorder;
  
  @Zvd(Zp = "snapAreaBorder")
  @Zj
  public final LineStyle snapAreaBorder;
  
  @Zvd(Zp = "scrollMarginColor")
  @Zj
  public final RGBA scrollMarginColor;
  
  @Zvd(Zp = "scrollPaddingColor")
  @Zj
  public final RGBA scrollPaddingColor;
  
  @Zox
  public ScrollSnapContainerHighlightConfig(@Zc5(Ze = "snapportBorder", ZS = "null") LineStyle paramLineStyle1, @Zc5(Ze = "snapAreaBorder", ZS = "null") LineStyle paramLineStyle2, @Zc5(Ze = "scrollMarginColor", ZS = "null") RGBA paramRGBA1, @Zc5(Ze = "scrollPaddingColor", ZS = "null") RGBA paramRGBA2) {
    this.snapportBorder = paramLineStyle1;
    this.snapAreaBorder = paramLineStyle2;
    this.scrollMarginColor = paramRGBA1;
    this.scrollPaddingColor = paramRGBA2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\ScrollSnapContainerHighlightConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */