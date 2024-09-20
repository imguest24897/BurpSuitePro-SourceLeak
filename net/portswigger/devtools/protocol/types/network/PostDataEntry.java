package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.network.PostDataEntry")
public class PostDataEntry {
  @Zvd(Zp = "bytes")
  @Zj
  public final String bytes;
  
  @Zox
  public PostDataEntry(@Zc5(Ze = "bytes", ZS = "null") String paramString) {
    this.bytes = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\PostDataEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */