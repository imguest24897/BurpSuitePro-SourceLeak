package net.portswigger.devtools.protocol.types.emulation;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.emulation.DisplayFeature")
public class DisplayFeature {
  @Zvd(Zp = "orientation")
  public final DisplayFeatureOrientation orientation;
  
  @Zvd(Zp = "offset")
  public final Integer offset;
  
  @Zvd(Zp = "maskLength")
  public final Integer maskLength;
  
  @Zox
  public DisplayFeature(@Zc5(Ze = "orientation") DisplayFeatureOrientation paramDisplayFeatureOrientation, @Zc5(Ze = "offset") Integer paramInteger1, @Zc5(Ze = "maskLength") Integer paramInteger2) {
    this.orientation = paramDisplayFeatureOrientation;
    this.offset = paramInteger1;
    this.maskLength = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\emulation\DisplayFeature.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */