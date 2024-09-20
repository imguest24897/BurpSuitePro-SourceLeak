package net.portswigger.devtools.protocol.types.systeminfo;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.systeminfo.ImageDecodeAcceleratorCapability")
public class ImageDecodeAcceleratorCapability {
  @Zvd(Zp = "imageType")
  public final ImageType imageType;
  
  @Zvd(Zp = "maxDimensions")
  public final Size maxDimensions;
  
  @Zvd(Zp = "minDimensions")
  public final Size minDimensions;
  
  @Zvd(Zp = "subsamplings")
  public final List<SubsamplingFormat> subsamplings;
  
  @Zox
  public ImageDecodeAcceleratorCapability(@Zc5(Ze = "imageType") ImageType paramImageType, @Zc5(Ze = "maxDimensions") Size paramSize1, @Zc5(Ze = "minDimensions") Size paramSize2, @Zc5(Ze = "subsamplings") List<SubsamplingFormat> paramList) {
    this.imageType = paramImageType;
    this.maxDimensions = paramSize1;
    this.minDimensions = paramSize2;
    this.subsamplings = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\systeminfo\ImageDecodeAcceleratorCapability.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */