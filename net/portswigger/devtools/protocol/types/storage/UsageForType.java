package net.portswigger.devtools.protocol.types.storage;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.storage.UsageForType")
public class UsageForType {
  @Zvd(Zp = "storageType")
  public final StorageType storageType;
  
  @Zvd(Zp = "usage")
  public final Double usage;
  
  private static Zbqc[] Zu;
  
  @Zox
  public UsageForType(@Zc5(Ze = "storageType") StorageType paramStorageType, @Zc5(Ze = "usage") Double paramDouble) {
    this.storageType = paramStorageType;
    this.usage = paramDouble;
  }
  
  public static void ZM(Zbqc[] paramArrayOfZbqc) {
    Zu = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZE() {
    return Zu;
  }
  
  static {
    if (ZE() != null)
      ZM(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\UsageForType.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */