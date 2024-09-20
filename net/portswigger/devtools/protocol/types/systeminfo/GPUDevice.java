package net.portswigger.devtools.protocol.types.systeminfo;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.systeminfo.GPUDevice")
public class GPUDevice {
  @Zvd(Zp = "vendorId")
  public final Double vendorId;
  
  @Zvd(Zp = "deviceId")
  public final Double deviceId;
  
  @Zvd(Zp = "subSysId")
  @Zj
  public final Double subSysId;
  
  @Zvd(Zp = "revision")
  @Zj
  public final Double revision;
  
  @Zvd(Zp = "vendorString")
  public final String vendorString;
  
  @Zvd(Zp = "deviceString")
  public final String deviceString;
  
  @Zvd(Zp = "driverVendor")
  public final String driverVendor;
  
  @Zvd(Zp = "driverVersion")
  public final String driverVersion;
  
  @Zox
  public GPUDevice(@Zc5(Ze = "vendorId") Double paramDouble1, @Zc5(Ze = "deviceId") Double paramDouble2, @Zc5(Ze = "subSysId", ZS = "null") Double paramDouble3, @Zc5(Ze = "revision", ZS = "null") Double paramDouble4, @Zc5(Ze = "vendorString") String paramString1, @Zc5(Ze = "deviceString") String paramString2, @Zc5(Ze = "driverVendor") String paramString3, @Zc5(Ze = "driverVersion") String paramString4) {
    this.vendorId = paramDouble1;
    this.deviceId = paramDouble2;
    this.subSysId = paramDouble3;
    this.revision = paramDouble4;
    this.vendorString = paramString1;
    this.deviceString = paramString2;
    String[] arrayOfString = VideoEncodeAcceleratorCapability.ZN();
    this.driverVendor = paramString3;
    this.driverVersion = paramString4;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\systeminfo\GPUDevice.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */