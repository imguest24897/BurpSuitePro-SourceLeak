package net.portswigger.devtools.protocol.events.domstorage;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.domstorage.StorageId;

@Zsi("net.portswigger.devtools.protocol.events.domstorage.DomStorageItemAdded")
public class DomStorageItemAdded implements Zl {
  @Zvd(Zp = "storageId")
  public final StorageId storageId;
  
  @Zvd(Zp = "key")
  public final String key;
  
  @Zvd(Zp = "newValue")
  public final String newValue;
  
  @Zox
  public DomStorageItemAdded(@Zc5(Ze = "storageId") StorageId paramStorageId, @Zc5(Ze = "key") String paramString1, @Zc5(Ze = "newValue") String paramString2) {
    this.storageId = paramStorageId;
    this.key = paramString1;
    this.newValue = paramString2;
    String str = DomStorageItemsCleared.Zd();
    if (Zbqc.Zwu() == null)
      DomStorageItemsCleared.Za("c18VGc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\domstorage\DomStorageItemAdded.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */