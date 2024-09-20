package net.portswigger.devtools.protocol.types.animation;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.animation.KeyframesRule")
public class KeyframesRule {
  @Zvd(Zp = "name")
  @Zj
  public final String name;
  
  @Zvd(Zp = "keyframes")
  public final List<KeyframeStyle> keyframes;
  
  @Zox
  public KeyframesRule(@Zc5(Ze = "name", ZS = "null") String paramString, @Zc5(Ze = "keyframes") List<KeyframeStyle> paramList) {
    this.name = paramString;
    this.keyframes = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\animation\KeyframesRule.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */