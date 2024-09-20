package net.portswigger.devtools.protocol.types.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.runtime.EntryPreview")
public class EntryPreview {
  @Zvd(Zp = "key")
  @Zj
  public final ObjectPreview key;
  
  @Zvd(Zp = "value")
  public final ObjectPreview value;
  
  @Zox
  public EntryPreview(@Zc5(Ze = "key", ZS = "null") ObjectPreview paramObjectPreview1, @Zc5(Ze = "value") ObjectPreview paramObjectPreview2) {
    this.key = paramObjectPreview1;
    this.value = paramObjectPreview2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\EntryPreview.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */