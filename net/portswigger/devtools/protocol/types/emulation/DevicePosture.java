package net.portswigger.devtools.protocol.types.emulation;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.emulation.DevicePosture")
public class DevicePosture {
  @Zvd(Zp = "type")
  public final DevicePostureType type;
  
  @Zox
  public DevicePosture(@Zc5(Ze = "type") DevicePostureType paramDevicePostureType) {
    this.type = paramDevicePostureType;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\emulation\DevicePosture.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */