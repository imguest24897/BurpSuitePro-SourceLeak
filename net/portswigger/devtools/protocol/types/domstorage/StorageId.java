package net.portswigger.devtools.protocol.types.domstorage;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.domstorage.StorageId")
public class StorageId {
  @Zvd(Zp = "securityOrigin")
  @Zj
  public final String securityOrigin;
  
  @Zvd(Zp = "storageKey")
  @Zj
  public final String storageKey;
  
  @Zvd(Zp = "isLocalStorage")
  public final Boolean isLocalStorage;
  
  private static Zbqc[] ZQ;
  
  @Zox
  public StorageId(@Zc5(Ze = "securityOrigin", ZS = "null") String paramString1, @Zc5(Ze = "storageKey", ZS = "null") String paramString2, @Zc5(Ze = "isLocalStorage") Boolean paramBoolean) {
    Zbqc[] arrayOfZbqc = Zl();
    this.securityOrigin = paramString1;
    this.storageKey = paramString2;
    this.isLocalStorage = paramBoolean;
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public static void ZY(Zbqc[] paramArrayOfZbqc) {
    ZQ = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zl() {
    return ZQ;
  }
  
  static {
    if (Zl() == null)
      ZY(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domstorage\StorageId.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */