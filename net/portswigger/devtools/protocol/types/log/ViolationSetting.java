package net.portswigger.devtools.protocol.types.log;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.log.ViolationSetting")
public class ViolationSetting {
  @Zvd(Zp = "name")
  public final ViolationSettingName name;
  
  @Zvd(Zp = "threshold")
  public final Double threshold;
  
  @Zox
  public ViolationSetting(@Zc5(Ze = "name") ViolationSettingName paramViolationSettingName, @Zc5(Ze = "threshold") Double paramDouble) {
    Zbqc[] arrayOfZbqc = ViolationSettingName.Zs();
    this.name = paramViolationSettingName;
    this.threshold = paramDouble;
    if (Zbqc.Zwu() == null)
      ViolationSettingName.Zc(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\log\ViolationSetting.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */