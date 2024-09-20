package net.portswigger.devtools.protocol.types.systeminfo;

import burp.Zbqc;
import java.util.List;
import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.systeminfo.GPUInfo")
public class GPUInfo {
  @Zvd(Zp = "devices")
  public final List<GPUDevice> devices;
  
  @Zvd(Zp = "auxAttributes")
  @Zj
  public final Map<String, Zi7> auxAttributes;
  
  @Zvd(Zp = "featureStatus")
  @Zj
  public final Map<String, Zi7> featureStatus;
  
  @Zvd(Zp = "driverBugWorkarounds")
  public final List<String> driverBugWorkarounds;
  
  @Zvd(Zp = "videoDecoding")
  public final List<VideoDecodeAcceleratorCapability> videoDecoding;
  
  @Zvd(Zp = "videoEncoding")
  public final List<VideoEncodeAcceleratorCapability> videoEncoding;
  
  @Zvd(Zp = "imageDecoding")
  public final List<ImageDecodeAcceleratorCapability> imageDecoding;
  
  @Zox
  public GPUInfo(@Zc5(Ze = "devices") List<GPUDevice> paramList, @Zc5(Ze = "auxAttributes", ZS = "null") Map<String, Zi7> paramMap1, @Zc5(Ze = "featureStatus", ZS = "null") Map<String, Zi7> paramMap2, @Zc5(Ze = "driverBugWorkarounds") List<String> paramList1, @Zc5(Ze = "videoDecoding") List<VideoDecodeAcceleratorCapability> paramList2, @Zc5(Ze = "videoEncoding") List<VideoEncodeAcceleratorCapability> paramList3, @Zc5(Ze = "imageDecoding") List<ImageDecodeAcceleratorCapability> paramList4) {
    this.devices = paramList;
    String[] arrayOfString = VideoEncodeAcceleratorCapability.ZN();
    this.auxAttributes = paramMap1;
    this.featureStatus = paramMap2;
    this.driverBugWorkarounds = paramList1;
    this.videoDecoding = paramList2;
    this.videoEncoding = paramList3;
    this.imageDecoding = paramList4;
    if (Zbqc.Zwu() == null)
      VideoEncodeAcceleratorCapability.Zv(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\systeminfo\GPUInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */