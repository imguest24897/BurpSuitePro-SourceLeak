package net.portswigger.devtools.protocol.types.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingFilterPair")
public class AttributionReportingFilterPair {
  @Zvd(Zp = "filters")
  public final List<AttributionReportingFilterConfig> filters;
  
  @Zvd(Zp = "notFilters")
  public final List<AttributionReportingFilterConfig> notFilters;
  
  @Zox
  public AttributionReportingFilterPair(@Zc5(Ze = "filters") List<AttributionReportingFilterConfig> paramList1, @Zc5(Ze = "notFilters") List<AttributionReportingFilterConfig> paramList2) {
    this.filters = paramList1;
    this.notFilters = paramList2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingFilterPair.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */