package net.portswigger.devtools.protocol.types.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.storage.StorageBucket")
public class StorageBucket {
  @Zvd(Zp = "storageKey")
  public final String storageKey;
  
  @Zvd(Zp = "name")
  @Zj
  public final String name;
  
  @Zox
  public StorageBucket(@Zc5(Ze = "storageKey") String paramString1, @Zc5(Ze = "name", ZS = "null") String paramString2) {
    this.storageKey = paramString1;
    this.name = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\StorageBucket.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */