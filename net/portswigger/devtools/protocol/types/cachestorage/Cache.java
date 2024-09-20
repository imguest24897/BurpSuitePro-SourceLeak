package net.portswigger.devtools.protocol.types.cachestorage;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.storage.StorageBucket;

@Zsi("net.portswigger.devtools.protocol.types.cachestorage.Cache")
public class Cache {
  @Zvd(Zp = "cacheId")
  public final String cacheId;
  
  @Zvd(Zp = "securityOrigin")
  public final String securityOrigin;
  
  @Zvd(Zp = "storageKey")
  public final String storageKey;
  
  @Zvd(Zp = "storageBucket")
  @Zj
  public final StorageBucket storageBucket;
  
  @Zvd(Zp = "cacheName")
  public final String cacheName;
  
  @Zox
  public Cache(@Zc5(Ze = "cacheId") String paramString1, @Zc5(Ze = "securityOrigin") String paramString2, @Zc5(Ze = "storageKey") String paramString3, @Zc5(Ze = "storageBucket", ZS = "null") StorageBucket paramStorageBucket, @Zc5(Ze = "cacheName") String paramString4) {
    String[] arrayOfString = RequestEntries.ZB();
    this.cacheId = paramString1;
    this.securityOrigin = paramString2;
    this.storageKey = paramString3;
    this.storageBucket = paramStorageBucket;
    this.cacheName = paramString4;
    if (Zbqc.Zwu() == null)
      RequestEntries.Zz(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\cachestorage\Cache.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */