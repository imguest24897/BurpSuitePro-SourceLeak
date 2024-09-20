package net.portswigger.devtools.protocol.types.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingFilterDataEntry")
public class AttributionReportingFilterDataEntry {
  @Zvd(Zp = "key")
  public final String key;
  
  @Zvd(Zp = "values")
  public final List<String> values;
  
  @Zox
  public AttributionReportingFilterDataEntry(@Zc5(Ze = "key") String paramString, @Zc5(Ze = "values") List<String> paramList) {
    this.key = paramString;
    this.values = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingFilterDataEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */