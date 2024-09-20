package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.dom.RGBA;

@Zsi("net.portswigger.devtools.protocol.types.overlay.IsolationModeHighlightConfig")
public class IsolationModeHighlightConfig {
  @Zvd(Zp = "resizerColor")
  @Zj
  public final RGBA resizerColor;
  
  @Zvd(Zp = "resizerHandleColor")
  @Zj
  public final RGBA resizerHandleColor;
  
  @Zvd(Zp = "maskColor")
  @Zj
  public final RGBA maskColor;
  
  @Zox
  public IsolationModeHighlightConfig(@Zc5(Ze = "resizerColor", ZS = "null") RGBA paramRGBA1, @Zc5(Ze = "resizerHandleColor", ZS = "null") RGBA paramRGBA2, @Zc5(Ze = "maskColor", ZS = "null") RGBA paramRGBA3) {
    this.resizerColor = paramRGBA1;
    this.resizerHandleColor = paramRGBA2;
    this.maskColor = paramRGBA3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\IsolationModeHighlightConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */