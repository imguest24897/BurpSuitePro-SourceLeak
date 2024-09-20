package net.portswigger.devtools.protocol.types.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableDebugReportingData")
public class AttributionReportingAggregatableDebugReportingData {
  @Zvd(Zp = "keyPiece")
  public final String keyPiece;
  
  @Zvd(Zp = "value")
  public final Double value;
  
  @Zvd(Zp = "types")
  public final List<String> types;
  
  @Zox
  public AttributionReportingAggregatableDebugReportingData(@Zc5(Ze = "keyPiece") String paramString, @Zc5(Ze = "value") Double paramDouble, @Zc5(Ze = "types") List<String> paramList) {
    this.keyPiece = paramString;
    this.value = paramDouble;
    this.types = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingAggregatableDebugReportingData.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */