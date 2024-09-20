package net.portswigger.devtools.protocol.types.performance;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.performance.Metric")
public class Metric {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "value")
  public final Double value;
  
  @Zox
  public Metric(@Zc5(Ze = "name") String paramString, @Zc5(Ze = "value") Double paramDouble) {
    this.name = paramString;
    this.value = paramDouble;
    boolean bool = SetTimeDomainTimeDomain.ZB();
    if (!bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\performance\Metric.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */