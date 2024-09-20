package net.portswigger.devtools.protocol.events.storage;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.storage.StorageBucketDeleted")
public class StorageBucketDeleted implements Zl {
  @Zvd(Zp = "bucketId")
  public final String bucketId;
  
  private static Zbqc[] ZW;
  
  @Zox
  public StorageBucketDeleted(@Zc5(Ze = "bucketId") String paramString) {
    this.bucketId = paramString;
  }
  
  public static void Zg(Zbqc[] paramArrayOfZbqc) {
    ZW = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zb() {
    return ZW;
  }
  
  static {
    if (Zb() != null)
      Zg(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\storage\StorageBucketDeleted.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */