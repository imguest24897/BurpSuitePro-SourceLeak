package net.portswigger.devtools.protocol.types.emulation;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.emulation.SensorReadingQuaternion")
public class SensorReadingQuaternion {
  @Zvd(Zp = "x")
  public final Double x;
  
  @Zvd(Zp = "y")
  public final Double y;
  
  @Zvd(Zp = "z")
  public final Double z;
  
  @Zvd(Zp = "w")
  public final Double w;
  
  @Zox
  public SensorReadingQuaternion(@Zc5(Ze = "x") Double paramDouble1, @Zc5(Ze = "y") Double paramDouble2, @Zc5(Ze = "z") Double paramDouble3, @Zc5(Ze = "w") Double paramDouble4) {
    this.x = paramDouble1;
    String[] arrayOfString = VirtualTimePolicy.Zr();
    this.y = paramDouble2;
    this.z = paramDouble3;
    this.w = paramDouble4;
    if (Zbqc.Zwu() == null)
      VirtualTimePolicy.ZD(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\emulation\SensorReadingQuaternion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */