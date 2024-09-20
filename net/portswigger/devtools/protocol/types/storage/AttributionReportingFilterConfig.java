package net.portswigger.devtools.protocol.types.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingFilterConfig")
public class AttributionReportingFilterConfig {
  @Zvd(Zp = "filterValues")
  public final List<AttributionReportingFilterDataEntry> filterValues;
  
  @Zvd(Zp = "lookbackWindow")
  @Zj
  public final Integer lookbackWindow;
  
  @Zox
  public AttributionReportingFilterConfig(@Zc5(Ze = "filterValues") List<AttributionReportingFilterDataEntry> paramList, @Zc5(Ze = "lookbackWindow", ZS = "null") Integer paramInteger) {
    this.filterValues = paramList;
    this.lookbackWindow = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingFilterConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */