package net.portswigger.devtools.protocol.types.indexeddb;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.indexeddb.Metadata")
public class Metadata {
  @Zvd(Zp = "entriesCount")
  public final Double entriesCount;
  
  @Zvd(Zp = "keyGeneratorValue")
  public final Double keyGeneratorValue;
  
  @Zox
  public Metadata(@Zc5(Ze = "entriesCount") Double paramDouble1, @Zc5(Ze = "keyGeneratorValue") Double paramDouble2) {
    this.entriesCount = paramDouble1;
    this.keyGeneratorValue = paramDouble2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\indexeddb\Metadata.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */