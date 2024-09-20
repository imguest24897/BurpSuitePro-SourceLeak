package net.portswigger.devtools.protocol.types.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.storage.SharedStorageMetadata")
public class SharedStorageMetadata {
  @Zvd(Zp = "creationTime")
  public final Double creationTime;
  
  @Zvd(Zp = "length")
  public final Integer length;
  
  @Zvd(Zp = "remainingBudget")
  public final Double remainingBudget;
  
  @Zvd(Zp = "bytesUsed")
  public final Integer bytesUsed;
  
  @Zox
  public SharedStorageMetadata(@Zc5(Ze = "creationTime") Double paramDouble1, @Zc5(Ze = "length") Integer paramInteger1, @Zc5(Ze = "remainingBudget") Double paramDouble2, @Zc5(Ze = "bytesUsed") Integer paramInteger2) {
    this.creationTime = paramDouble1;
    this.length = paramInteger1;
    this.remainingBudget = paramDouble2;
    this.bytesUsed = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\SharedStorageMetadata.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */