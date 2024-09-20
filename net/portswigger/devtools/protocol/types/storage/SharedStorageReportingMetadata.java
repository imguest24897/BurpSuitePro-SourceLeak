package net.portswigger.devtools.protocol.types.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.storage.SharedStorageReportingMetadata")
public class SharedStorageReportingMetadata {
  @Zvd(Zp = "eventType")
  public final String eventType;
  
  @Zvd(Zp = "reportingUrl")
  public final String reportingUrl;
  
  @Zox
  public SharedStorageReportingMetadata(@Zc5(Ze = "eventType") String paramString1, @Zc5(Ze = "reportingUrl") String paramString2) {
    this.eventType = paramString1;
    this.reportingUrl = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\SharedStorageReportingMetadata.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */