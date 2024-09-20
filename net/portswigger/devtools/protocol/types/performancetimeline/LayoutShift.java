package net.portswigger.devtools.protocol.types.performancetimeline;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.performancetimeline.LayoutShift")
public class LayoutShift {
  @Zvd(Zp = "value")
  public final Double value;
  
  @Zvd(Zp = "hadRecentInput")
  public final Boolean hadRecentInput;
  
  @Zvd(Zp = "lastInputTime")
  public final Double lastInputTime;
  
  @Zvd(Zp = "sources")
  public final List<LayoutShiftAttribution> sources;
  
  @Zox
  public LayoutShift(@Zc5(Ze = "value") Double paramDouble1, @Zc5(Ze = "hadRecentInput") Boolean paramBoolean, @Zc5(Ze = "lastInputTime") Double paramDouble2, @Zc5(Ze = "sources") List<LayoutShiftAttribution> paramList) {
    this.value = paramDouble1;
    this.hadRecentInput = paramBoolean;
    this.lastInputTime = paramDouble2;
    this.sources = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\performancetimeline\LayoutShift.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */