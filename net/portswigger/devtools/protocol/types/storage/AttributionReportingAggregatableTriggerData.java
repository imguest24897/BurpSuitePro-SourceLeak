package net.portswigger.devtools.protocol.types.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableTriggerData")
public class AttributionReportingAggregatableTriggerData {
  @Zvd(Zp = "keyPiece")
  public final String keyPiece;
  
  @Zvd(Zp = "sourceKeys")
  public final List<String> sourceKeys;
  
  @Zvd(Zp = "filters")
  public final AttributionReportingFilterPair filters;
  
  @Zox
  public AttributionReportingAggregatableTriggerData(@Zc5(Ze = "keyPiece") String paramString, @Zc5(Ze = "sourceKeys") List<String> paramList, @Zc5(Ze = "filters") AttributionReportingFilterPair paramAttributionReportingFilterPair) {
    this.keyPiece = paramString;
    this.sourceKeys = paramList;
    this.filters = paramAttributionReportingFilterPair;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingAggregatableTriggerData.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */