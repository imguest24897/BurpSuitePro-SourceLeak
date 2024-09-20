package net.portswigger.devtools.protocol.types.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableDedupKey")
public class AttributionReportingAggregatableDedupKey {
  @Zvd(Zp = "dedupKey")
  @Zj
  public final String dedupKey;
  
  @Zvd(Zp = "filters")
  public final AttributionReportingFilterPair filters;
  
  @Zox
  public AttributionReportingAggregatableDedupKey(@Zc5(Ze = "dedupKey", ZS = "null") String paramString, @Zc5(Ze = "filters") AttributionReportingFilterPair paramAttributionReportingFilterPair) {
    this.dedupKey = paramString;
    this.filters = paramAttributionReportingFilterPair;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingAggregatableDedupKey.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */