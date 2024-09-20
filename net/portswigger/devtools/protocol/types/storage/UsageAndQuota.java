package net.portswigger.devtools.protocol.types.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.storage.UsageAndQuota")
public class UsageAndQuota {
  @Zvd(Zp = "usage")
  public final Double usage;
  
  @Zvd(Zp = "quota")
  public final Double quota;
  
  @Zvd(Zp = "overrideActive")
  public final Boolean overrideActive;
  
  @Zvd(Zp = "usageBreakdown")
  public final List<UsageForType> usageBreakdown;
  
  @Zox
  public UsageAndQuota(@Zc5(Ze = "usage") Double paramDouble1, @Zc5(Ze = "quota") Double paramDouble2, @Zc5(Ze = "overrideActive") Boolean paramBoolean, @Zc5(Ze = "usageBreakdown") List<UsageForType> paramList) {
    this.usage = paramDouble1;
    this.quota = paramDouble2;
    this.overrideActive = paramBoolean;
    this.usageBreakdown = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\UsageAndQuota.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */