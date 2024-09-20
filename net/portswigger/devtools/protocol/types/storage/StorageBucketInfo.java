package net.portswigger.devtools.protocol.types.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.storage.StorageBucketInfo")
public class StorageBucketInfo {
  @Zvd(Zp = "bucket")
  public final StorageBucket bucket;
  
  @Zvd(Zp = "id")
  public final String id;
  
  @Zvd(Zp = "expiration")
  public final Double expiration;
  
  @Zvd(Zp = "quota")
  public final Double quota;
  
  @Zvd(Zp = "persistent")
  public final Boolean persistent;
  
  @Zvd(Zp = "durability")
  public final StorageBucketsDurability durability;
  
  @Zox
  public StorageBucketInfo(@Zc5(Ze = "bucket") StorageBucket paramStorageBucket, @Zc5(Ze = "id") String paramString, @Zc5(Ze = "expiration") Double paramDouble1, @Zc5(Ze = "quota") Double paramDouble2, @Zc5(Ze = "persistent") Boolean paramBoolean, @Zc5(Ze = "durability") StorageBucketsDurability paramStorageBucketsDurability) {
    this.bucket = paramStorageBucket;
    this.id = paramString;
    this.expiration = paramDouble1;
    this.quota = paramDouble2;
    this.persistent = paramBoolean;
    this.durability = paramStorageBucketsDurability;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\StorageBucketInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */