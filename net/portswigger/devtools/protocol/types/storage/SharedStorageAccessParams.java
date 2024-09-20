package net.portswigger.devtools.protocol.types.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.storage.SharedStorageAccessParams")
public class SharedStorageAccessParams {
  @Zvd(Zp = "scriptSourceUrl")
  @Zj
  public final String scriptSourceUrl;
  
  @Zvd(Zp = "operationName")
  @Zj
  public final String operationName;
  
  @Zvd(Zp = "serializedData")
  @Zj
  public final String serializedData;
  
  @Zvd(Zp = "urlsWithMetadata")
  @Zj
  public final List<SharedStorageUrlWithMetadata> urlsWithMetadata;
  
  @Zvd(Zp = "key")
  @Zj
  public final String key;
  
  @Zvd(Zp = "value")
  @Zj
  public final String value;
  
  @Zvd(Zp = "ignoreIfPresent")
  @Zj
  public final Boolean ignoreIfPresent;
  
  @Zox
  public SharedStorageAccessParams(@Zc5(Ze = "scriptSourceUrl", ZS = "null") String paramString1, @Zc5(Ze = "operationName", ZS = "null") String paramString2, @Zc5(Ze = "serializedData", ZS = "null") String paramString3, @Zc5(Ze = "urlsWithMetadata", ZS = "null") List<SharedStorageUrlWithMetadata> paramList, @Zc5(Ze = "key", ZS = "null") String paramString4, @Zc5(Ze = "value", ZS = "null") String paramString5, @Zc5(Ze = "ignoreIfPresent", ZS = "null") Boolean paramBoolean) {
    this.scriptSourceUrl = paramString1;
    this.operationName = paramString2;
    this.serializedData = paramString3;
    this.urlsWithMetadata = paramList;
    this.key = paramString4;
    this.value = paramString5;
    this.ignoreIfPresent = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\SharedStorageAccessParams.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */