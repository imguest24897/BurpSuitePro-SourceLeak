package net.portswigger.devtools.protocol.types.systeminfo;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.systeminfo.ProcessInfo")
public class ProcessInfo {
  @Zvd(Zp = "type")
  public final String type;
  
  @Zvd(Zp = "id")
  public final Integer id;
  
  @Zvd(Zp = "cpuTime")
  public final Double cpuTime;
  
  @Zox
  public ProcessInfo(@Zc5(Ze = "type") String paramString, @Zc5(Ze = "id") Integer paramInteger, @Zc5(Ze = "cpuTime") Double paramDouble) {
    this.type = paramString;
    this.id = paramInteger;
    this.cpuTime = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\systeminfo\ProcessInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */