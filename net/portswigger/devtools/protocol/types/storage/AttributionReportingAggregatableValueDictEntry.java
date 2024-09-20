package net.portswigger.devtools.protocol.types.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableValueDictEntry")
public class AttributionReportingAggregatableValueDictEntry {
  @Zvd(Zp = "key")
  public final String key;
  
  @Zvd(Zp = "value")
  public final Double value;
  
  @Zvd(Zp = "filteringId")
  public final String filteringId;
  
  @Zox
  public AttributionReportingAggregatableValueDictEntry(@Zc5(Ze = "key") String paramString1, @Zc5(Ze = "value") Double paramDouble, @Zc5(Ze = "filteringId") String paramString2) {
    this.key = paramString1;
    this.value = paramDouble;
    this.filteringId = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingAggregatableValueDictEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */