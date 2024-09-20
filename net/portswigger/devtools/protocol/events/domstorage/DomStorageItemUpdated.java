package net.portswigger.devtools.protocol.events.domstorage;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.domstorage.StorageId;

@Zsi("net.portswigger.devtools.protocol.events.domstorage.DomStorageItemUpdated")
public class DomStorageItemUpdated implements Zl {
  @Zvd(Zp = "storageId")
  public final StorageId storageId;
  
  @Zvd(Zp = "key")
  public final String key;
  
  @Zvd(Zp = "oldValue")
  public final String oldValue;
  
  @Zvd(Zp = "newValue")
  public final String newValue;
  
  @Zox
  public DomStorageItemUpdated(@Zc5(Ze = "storageId") StorageId paramStorageId, @Zc5(Ze = "key") String paramString1, @Zc5(Ze = "oldValue") String paramString2, @Zc5(Ze = "newValue") String paramString3) {
    this.storageId = paramStorageId;
    this.key = paramString1;
    String str = DomStorageItemsCleared.Zd();
    this.oldValue = paramString2;
    this.newValue = paramString3;
    if (str == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\domstorage\DomStorageItemUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */