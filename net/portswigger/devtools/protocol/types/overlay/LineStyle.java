package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.dom.RGBA;

@Zsi("net.portswigger.devtools.protocol.types.overlay.LineStyle")
public class LineStyle {
  @Zvd(Zp = "color")
  @Zj
  public final RGBA color;
  
  @Zvd(Zp = "pattern")
  @Zj
  public final LineStylePattern pattern;
  
  @Zox
  public LineStyle(@Zc5(Ze = "color", ZS = "null") RGBA paramRGBA, @Zc5(Ze = "pattern", ZS = "null") LineStylePattern paramLineStylePattern) {
    this.color = paramRGBA;
    this.pattern = paramLineStylePattern;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\LineStyle.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */