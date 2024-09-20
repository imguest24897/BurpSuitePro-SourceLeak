package net.portswigger.devtools.protocol.types.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.runtime.HeapUsage")
public class HeapUsage {
  @Zvd(Zp = "usedSize")
  public final Double usedSize;
  
  @Zvd(Zp = "totalSize")
  public final Double totalSize;
  
  @Zox
  public HeapUsage(@Zc5(Ze = "usedSize") Double paramDouble1, @Zc5(Ze = "totalSize") Double paramDouble2) {
    this.usedSize = paramDouble1;
    this.totalSize = paramDouble2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\HeapUsage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */