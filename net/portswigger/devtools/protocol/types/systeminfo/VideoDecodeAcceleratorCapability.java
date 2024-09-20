package net.portswigger.devtools.protocol.types.systeminfo;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.systeminfo.VideoDecodeAcceleratorCapability")
public class VideoDecodeAcceleratorCapability {
  @Zvd(Zp = "profile")
  public final String profile;
  
  @Zvd(Zp = "maxResolution")
  public final Size maxResolution;
  
  @Zvd(Zp = "minResolution")
  public final Size minResolution;
  
  @Zox
  public VideoDecodeAcceleratorCapability(@Zc5(Ze = "profile") String paramString, @Zc5(Ze = "maxResolution") Size paramSize1, @Zc5(Ze = "minResolution") Size paramSize2) {
    this.profile = paramString;
    this.maxResolution = paramSize1;
    this.minResolution = paramSize2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\systeminfo\VideoDecodeAcceleratorCapability.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */