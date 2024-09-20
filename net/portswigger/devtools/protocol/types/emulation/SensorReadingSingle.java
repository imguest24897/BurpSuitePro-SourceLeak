package net.portswigger.devtools.protocol.types.emulation;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.emulation.SensorReadingSingle")
public class SensorReadingSingle {
  @Zvd(Zp = "value")
  public final Double value;
  
  @Zox
  public SensorReadingSingle(@Zc5(Ze = "value") Double paramDouble) {
    this.value = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\emulation\SensorReadingSingle.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */