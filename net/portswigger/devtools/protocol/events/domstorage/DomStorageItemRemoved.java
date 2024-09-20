package net.portswigger.devtools.protocol.events.domstorage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.domstorage.StorageId;

@Zsi("net.portswigger.devtools.protocol.events.domstorage.DomStorageItemRemoved")
public class DomStorageItemRemoved implements Zl {
  @Zvd(Zp = "storageId")
  public final StorageId storageId;
  
  @Zvd(Zp = "key")
  public final String key;
  
  @Zox
  public DomStorageItemRemoved(@Zc5(Ze = "storageId") StorageId paramStorageId, @Zc5(Ze = "key") String paramString) {
    this.storageId = paramStorageId;
    this.key = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\domstorage\DomStorageItemRemoved.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */