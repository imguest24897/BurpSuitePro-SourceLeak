package net.portswigger.devtools.protocol.events.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.storage.CacheStorageListUpdated")
public class CacheStorageListUpdated implements Zl {
  @Zvd(Zp = "origin")
  public final String origin;
  
  @Zvd(Zp = "storageKey")
  public final String storageKey;
  
  @Zvd(Zp = "bucketId")
  public final String bucketId;
  
  @Zox
  public CacheStorageListUpdated(@Zc5(Ze = "origin") String paramString1, @Zc5(Ze = "storageKey") String paramString2, @Zc5(Ze = "bucketId") String paramString3) {
    this.origin = paramString1;
    this.storageKey = paramString2;
    this.bucketId = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\storage\CacheStorageListUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */