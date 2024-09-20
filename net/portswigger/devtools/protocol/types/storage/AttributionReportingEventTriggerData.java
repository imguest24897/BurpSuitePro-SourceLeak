package net.portswigger.devtools.protocol.types.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingEventTriggerData")
public class AttributionReportingEventTriggerData {
  @Zvd(Zp = "data")
  public final String data;
  
  @Zvd(Zp = "priority")
  public final String priority;
  
  @Zvd(Zp = "dedupKey")
  @Zj
  public final String dedupKey;
  
  @Zvd(Zp = "filters")
  public final AttributionReportingFilterPair filters;
  
  @Zox
  public AttributionReportingEventTriggerData(@Zc5(Ze = "data") String paramString1, @Zc5(Ze = "priority") String paramString2, @Zc5(Ze = "dedupKey", ZS = "null") String paramString3, @Zc5(Ze = "filters") AttributionReportingFilterPair paramAttributionReportingFilterPair) {
    this.data = paramString1;
    this.priority = paramString2;
    this.dedupKey = paramString3;
    this.filters = paramAttributionReportingFilterPair;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingEventTriggerData.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */