package net.portswigger.devtools.protocol.types.emulation;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.emulation.SensorReading")
public class SensorReading {
  @Zvd(Zp = "single")
  @Zj
  public final SensorReadingSingle single;
  
  @Zvd(Zp = "xyz")
  @Zj
  public final SensorReadingXYZ xyz;
  
  @Zvd(Zp = "quaternion")
  @Zj
  public final SensorReadingQuaternion quaternion;
  
  @Zox
  public SensorReading(@Zc5(Ze = "single", ZS = "null") SensorReadingSingle paramSensorReadingSingle, @Zc5(Ze = "xyz", ZS = "null") SensorReadingXYZ paramSensorReadingXYZ, @Zc5(Ze = "quaternion", ZS = "null") SensorReadingQuaternion paramSensorReadingQuaternion) {
    this.single = paramSensorReadingSingle;
    this.xyz = paramSensorReadingXYZ;
    this.quaternion = paramSensorReadingQuaternion;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\emulation\SensorReading.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */