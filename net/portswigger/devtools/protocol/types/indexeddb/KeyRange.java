package net.portswigger.devtools.protocol.types.indexeddb;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.indexeddb.KeyRange")
public class KeyRange {
  @Zvd(Zp = "lower")
  @Zj
  public final Key lower;
  
  @Zvd(Zp = "upper")
  @Zj
  public final Key upper;
  
  @Zvd(Zp = "lowerOpen")
  public final Boolean lowerOpen;
  
  @Zvd(Zp = "upperOpen")
  public final Boolean upperOpen;
  
  @Zox
  public KeyRange(@Zc5(Ze = "lower", ZS = "null") Key paramKey1, @Zc5(Ze = "upper", ZS = "null") Key paramKey2, @Zc5(Ze = "lowerOpen") Boolean paramBoolean1, @Zc5(Ze = "upperOpen") Boolean paramBoolean2) {
    this.lower = paramKey1;
    this.upper = paramKey2;
    this.lowerOpen = paramBoolean1;
    this.upperOpen = paramBoolean2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\indexeddb\KeyRange.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */