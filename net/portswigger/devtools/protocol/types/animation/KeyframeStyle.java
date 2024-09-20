package net.portswigger.devtools.protocol.types.animation;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.animation.KeyframeStyle")
public class KeyframeStyle {
  @Zvd(Zp = "offset")
  public final String offset;
  
  @Zvd(Zp = "easing")
  public final String easing;
  
  @Zox
  public KeyframeStyle(@Zc5(Ze = "offset") String paramString1, @Zc5(Ze = "easing") String paramString2) {
    this.offset = paramString1;
    this.easing = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\animation\KeyframeStyle.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */