package net.portswigger.devtools.protocol.types.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.storage.SharedStorageEntry")
public class SharedStorageEntry {
  @Zvd(Zp = "key")
  public final String key;
  
  @Zvd(Zp = "value")
  public final String value;
  
  @Zox
  public SharedStorageEntry(@Zc5(Ze = "key") String paramString1, @Zc5(Ze = "value") String paramString2) {
    this.key = paramString1;
    this.value = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\SharedStorageEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */