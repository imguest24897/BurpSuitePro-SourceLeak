package net.portswigger.devtools.protocol.types.emulation;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.emulation.SensorReadingXYZ")
public class SensorReadingXYZ {
  @Zvd(Zp = "x")
  public final Double x;
  
  @Zvd(Zp = "y")
  public final Double y;
  
  @Zvd(Zp = "z")
  public final Double z;
  
  @Zox
  public SensorReadingXYZ(@Zc5(Ze = "x") Double paramDouble1, @Zc5(Ze = "y") Double paramDouble2, @Zc5(Ze = "z") Double paramDouble3) {
    this.x = paramDouble1;
    this.y = paramDouble2;
    this.z = paramDouble3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\emulation\SensorReadingXYZ.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */