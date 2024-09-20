package net.portswigger.devtools.protocol.types.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableValueEntry")
public class AttributionReportingAggregatableValueEntry {
  @Zvd(Zp = "values")
  public final List<AttributionReportingAggregatableValueDictEntry> values;
  
  @Zvd(Zp = "filters")
  public final AttributionReportingFilterPair filters;
  
  @Zox
  public AttributionReportingAggregatableValueEntry(@Zc5(Ze = "values") List<AttributionReportingAggregatableValueDictEntry> paramList, @Zc5(Ze = "filters") AttributionReportingFilterPair paramAttributionReportingFilterPair) {
    this.values = paramList;
    this.filters = paramAttributionReportingFilterPair;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingAggregatableValueEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */