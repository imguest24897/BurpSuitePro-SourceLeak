package net.portswigger.devtools.protocol.types.emulation;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.emulation.ScreenOrientation")
public class ScreenOrientation {
  @Zvd(Zp = "type")
  public final ScreenOrientationType type;
  
  @Zvd(Zp = "angle")
  public final Integer angle;
  
  @Zox
  public ScreenOrientation(@Zc5(Ze = "type") ScreenOrientationType paramScreenOrientationType, @Zc5(Ze = "angle") Integer paramInteger) {
    this.type = paramScreenOrientationType;
    this.angle = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\emulation\ScreenOrientation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */