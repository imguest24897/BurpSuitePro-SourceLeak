package net.portswigger.devtools.protocol.events.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.storage.SharedStorageAccessParams;
import net.portswigger.devtools.protocol.types.storage.SharedStorageAccessType;

@Zsi("net.portswigger.devtools.protocol.events.storage.SharedStorageAccessed")
public class SharedStorageAccessed implements Zl {
  @Zvd(Zp = "accessTime")
  public final Double accessTime;
  
  @Zvd(Zp = "type")
  public final SharedStorageAccessType type;
  
  @Zvd(Zp = "mainFrameId")
  public final String mainFrameId;
  
  @Zvd(Zp = "ownerOrigin")
  public final String ownerOrigin;
  
  @Zvd(Zp = "params")
  public final SharedStorageAccessParams params;
  
  @Zox
  public SharedStorageAccessed(@Zc5(Ze = "accessTime") Double paramDouble, @Zc5(Ze = "type") SharedStorageAccessType paramSharedStorageAccessType, @Zc5(Ze = "mainFrameId") String paramString1, @Zc5(Ze = "ownerOrigin") String paramString2, @Zc5(Ze = "params") SharedStorageAccessParams paramSharedStorageAccessParams) {
    this.accessTime = paramDouble;
    this.type = paramSharedStorageAccessType;
    this.mainFrameId = paramString1;
    this.ownerOrigin = paramString2;
    this.params = paramSharedStorageAccessParams;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\storage\SharedStorageAccessed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */