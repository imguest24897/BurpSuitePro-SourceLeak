package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.dom.RGBA;

@Zsi("net.portswigger.devtools.protocol.types.overlay.BoxStyle")
public class BoxStyle {
  @Zvd(Zp = "fillColor")
  @Zj
  public final RGBA fillColor;
  
  @Zvd(Zp = "hatchColor")
  @Zj
  public final RGBA hatchColor;
  
  @Zox
  public BoxStyle(@Zc5(Ze = "fillColor", ZS = "null") RGBA paramRGBA1, @Zc5(Ze = "hatchColor", ZS = "null") RGBA paramRGBA2) {
    this.fillColor = paramRGBA1;
    this.hatchColor = paramRGBA2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\BoxStyle.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */