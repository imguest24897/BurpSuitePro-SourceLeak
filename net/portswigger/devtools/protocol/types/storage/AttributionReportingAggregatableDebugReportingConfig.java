package net.portswigger.devtools.protocol.types.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableDebugReportingConfig")
public class AttributionReportingAggregatableDebugReportingConfig {
  @Zvd(Zp = "budget")
  @Zj
  public final Double budget;
  
  @Zvd(Zp = "keyPiece")
  public final String keyPiece;
  
  @Zvd(Zp = "debugData")
  public final List<AttributionReportingAggregatableDebugReportingData> debugData;
  
  @Zvd(Zp = "aggregationCoordinatorOrigin")
  @Zj
  public final String aggregationCoordinatorOrigin;
  
  @Zox
  public AttributionReportingAggregatableDebugReportingConfig(@Zc5(Ze = "budget", ZS = "null") Double paramDouble, @Zc5(Ze = "keyPiece") String paramString1, @Zc5(Ze = "debugData") List<AttributionReportingAggregatableDebugReportingData> paramList, @Zc5(Ze = "aggregationCoordinatorOrigin", ZS = "null") String paramString2) {
    this.budget = paramDouble;
    this.keyPiece = paramString1;
    this.debugData = paramList;
    this.aggregationCoordinatorOrigin = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingAggregatableDebugReportingConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */