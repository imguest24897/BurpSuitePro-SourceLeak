package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.dom.RGBA;
import net.portswigger.devtools.protocol.types.dom.Rect;

@Zsi("net.portswigger.devtools.protocol.types.overlay.HingeConfig")
public class HingeConfig {
  @Zvd(Zp = "rect")
  public final Rect rect;
  
  @Zvd(Zp = "contentColor")
  @Zj
  public final RGBA contentColor;
  
  @Zvd(Zp = "outlineColor")
  @Zj
  public final RGBA outlineColor;
  
  @Zox
  public HingeConfig(@Zc5(Ze = "rect") Rect paramRect, @Zc5(Ze = "contentColor", ZS = "null") RGBA paramRGBA1, @Zc5(Ze = "outlineColor", ZS = "null") RGBA paramRGBA2) {
    this.rect = paramRect;
    this.contentColor = paramRGBA1;
    this.outlineColor = paramRGBA2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\HingeConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */