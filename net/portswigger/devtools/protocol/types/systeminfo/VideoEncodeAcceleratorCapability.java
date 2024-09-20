package net.portswigger.devtools.protocol.types.systeminfo;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.systeminfo.VideoEncodeAcceleratorCapability")
public class VideoEncodeAcceleratorCapability {
  @Zvd(Zp = "profile")
  public final String profile;
  
  @Zvd(Zp = "maxResolution")
  public final Size maxResolution;
  
  @Zvd(Zp = "maxFramerateNumerator")
  public final Integer maxFramerateNumerator;
  
  @Zvd(Zp = "maxFramerateDenominator")
  public final Integer maxFramerateDenominator;
  
  private static String[] ZJ;
  
  @Zox
  public VideoEncodeAcceleratorCapability(@Zc5(Ze = "profile") String paramString, @Zc5(Ze = "maxResolution") Size paramSize, @Zc5(Ze = "maxFramerateNumerator") Integer paramInteger1, @Zc5(Ze = "maxFramerateDenominator") Integer paramInteger2) {
    this.profile = paramString;
    this.maxResolution = paramSize;
    this.maxFramerateNumerator = paramInteger1;
    this.maxFramerateDenominator = paramInteger2;
  }
  
  public static void Zv(String[] paramArrayOfString) {
    ZJ = paramArrayOfString;
  }
  
  public static String[] ZN() {
    return ZJ;
  }
  
  static {
    if (ZN() != null)
      Zv(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\systeminfo\VideoEncodeAcceleratorCapability.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */