package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.types.dom.RGBA;

@Zsi("net.portswigger.devtools.protocol.types.overlay.SourceOrderConfig")
public class SourceOrderConfig {
  @Zvd(Zp = "parentOutlineColor")
  public final RGBA parentOutlineColor;
  
  @Zvd(Zp = "childOutlineColor")
  public final RGBA childOutlineColor;
  
  @Zox
  public SourceOrderConfig(@Zc5(Ze = "parentOutlineColor") RGBA paramRGBA1, @Zc5(Ze = "childOutlineColor") RGBA paramRGBA2) {
    this.parentOutlineColor = paramRGBA1;
    this.childOutlineColor = paramRGBA2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\SourceOrderConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */