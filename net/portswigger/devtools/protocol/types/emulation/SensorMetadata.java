package net.portswigger.devtools.protocol.types.emulation;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.emulation.SensorMetadata")
public class SensorMetadata {
  @Zvd(Zp = "available")
  @Zj
  public final Boolean available;
  
  @Zvd(Zp = "minimumFrequency")
  @Zj
  public final Double minimumFrequency;
  
  @Zvd(Zp = "maximumFrequency")
  @Zj
  public final Double maximumFrequency;
  
  @Zox
  public SensorMetadata(@Zc5(Ze = "available", ZS = "null") Boolean paramBoolean, @Zc5(Ze = "minimumFrequency", ZS = "null") Double paramDouble1, @Zc5(Ze = "maximumFrequency", ZS = "null") Double paramDouble2) {
    this.available = paramBoolean;
    this.minimumFrequency = paramDouble1;
    this.maximumFrequency = paramDouble2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\emulation\SensorMetadata.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */