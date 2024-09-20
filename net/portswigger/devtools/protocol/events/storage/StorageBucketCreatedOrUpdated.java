package net.portswigger.devtools.protocol.events.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.storage.StorageBucketInfo;

@Zsi("net.portswigger.devtools.protocol.events.storage.StorageBucketCreatedOrUpdated")
public class StorageBucketCreatedOrUpdated implements Zl {
  @Zvd(Zp = "bucketInfo")
  public final StorageBucketInfo bucketInfo;
  
  @Zox
  public StorageBucketCreatedOrUpdated(@Zc5(Ze = "bucketInfo") StorageBucketInfo paramStorageBucketInfo) {
    this.bucketInfo = paramStorageBucketInfo;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\storage\StorageBucketCreatedOrUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */