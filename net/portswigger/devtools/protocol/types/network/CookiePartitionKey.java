package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.CookiePartitionKey")
public class CookiePartitionKey {
  @Zvd(Zp = "topLevelSite")
  public final String topLevelSite;
  
  @Zvd(Zp = "hasCrossSiteAncestor")
  public final Boolean hasCrossSiteAncestor;
  
  @Zox
  public CookiePartitionKey(@Zc5(Ze = "topLevelSite") String paramString, @Zc5(Ze = "hasCrossSiteAncestor") Boolean paramBoolean) {
    this.topLevelSite = paramString;
    this.hasCrossSiteAncestor = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\CookiePartitionKey.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */