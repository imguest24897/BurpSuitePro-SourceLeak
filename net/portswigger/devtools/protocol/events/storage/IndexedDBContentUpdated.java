package net.portswigger.devtools.protocol.events.storage;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.storage.IndexedDBContentUpdated")
public class IndexedDBContentUpdated implements Zl {
  @Zvd(Zp = "origin")
  public final String origin;
  
  @Zvd(Zp = "storageKey")
  public final String storageKey;
  
  @Zvd(Zp = "bucketId")
  public final String bucketId;
  
  @Zvd(Zp = "databaseName")
  public final String databaseName;
  
  @Zvd(Zp = "objectStoreName")
  public final String objectStoreName;
  
  @Zox
  public IndexedDBContentUpdated(@Zc5(Ze = "origin") String paramString1, @Zc5(Ze = "storageKey") String paramString2, @Zc5(Ze = "bucketId") String paramString3, @Zc5(Ze = "databaseName") String paramString4, @Zc5(Ze = "objectStoreName") String paramString5) {
    this.origin = paramString1;
    this.storageKey = paramString2;
    this.bucketId = paramString3;
    this.databaseName = paramString4;
    this.objectStoreName = paramString5;
    Zbqc[] arrayOfZbqc = StorageBucketDeleted.Zb();
    if (Zbqc.Zwu() == null)
      StorageBucketDeleted.Zg(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\storage\IndexedDBContentUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */