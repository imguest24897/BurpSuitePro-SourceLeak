package net.portswigger.devtools.protocol.events.domstorage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.domstorage.StorageId;

@Zsi("net.portswigger.devtools.protocol.events.domstorage.DomStorageItemsCleared")
public class DomStorageItemsCleared implements Zl {
  @Zvd(Zp = "storageId")
  public final StorageId storageId;
  
  private static String ZO;
  
  @Zox
  public DomStorageItemsCleared(@Zc5(Ze = "storageId") StorageId paramStorageId) {
    this.storageId = paramStorageId;
  }
  
  public static void Za(String paramString) {
    ZO = paramString;
  }
  
  public static String Zd() {
    return ZO;
  }
  
  static {
    if (Zd() == null)
      Za("Oj1Udb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\domstorage\DomStorageItemsCleared.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */