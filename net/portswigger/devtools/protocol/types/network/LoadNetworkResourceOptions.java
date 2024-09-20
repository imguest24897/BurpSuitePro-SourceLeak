package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.LoadNetworkResourceOptions")
public class LoadNetworkResourceOptions {
  @Zvd(Zp = "disableCache")
  public final Boolean disableCache;
  
  @Zvd(Zp = "includeCredentials")
  public final Boolean includeCredentials;
  
  @Zox
  public LoadNetworkResourceOptions(@Zc5(Ze = "disableCache") Boolean paramBoolean1, @Zc5(Ze = "includeCredentials") Boolean paramBoolean2) {
    this.disableCache = paramBoolean1;
    this.includeCredentials = paramBoolean2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\LoadNetworkResourceOptions.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */