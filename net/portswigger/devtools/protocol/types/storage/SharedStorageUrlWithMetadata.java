package net.portswigger.devtools.protocol.types.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.storage.SharedStorageUrlWithMetadata")
public class SharedStorageUrlWithMetadata {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "reportingMetadata")
  public final List<SharedStorageReportingMetadata> reportingMetadata;
  
  @Zox
  public SharedStorageUrlWithMetadata(@Zc5(Ze = "url") String paramString, @Zc5(Ze = "reportingMetadata") List<SharedStorageReportingMetadata> paramList) {
    this.url = paramString;
    this.reportingMetadata = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\SharedStorageUrlWithMetadata.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */