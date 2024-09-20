package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.ClientSecurityState")
public class ClientSecurityState {
  @Zvd(Zp = "initiatorIsSecureContext")
  public final Boolean initiatorIsSecureContext;
  
  @Zvd(Zp = "initiatorIPAddressSpace")
  public final IPAddressSpace initiatorIPAddressSpace;
  
  @Zvd(Zp = "privateNetworkRequestPolicy")
  public final PrivateNetworkRequestPolicy privateNetworkRequestPolicy;
  
  @Zox
  public ClientSecurityState(@Zc5(Ze = "initiatorIsSecureContext") Boolean paramBoolean, @Zc5(Ze = "initiatorIPAddressSpace") IPAddressSpace paramIPAddressSpace, @Zc5(Ze = "privateNetworkRequestPolicy") PrivateNetworkRequestPolicy paramPrivateNetworkRequestPolicy) {
    this.initiatorIsSecureContext = paramBoolean;
    this.initiatorIPAddressSpace = paramIPAddressSpace;
    this.privateNetworkRequestPolicy = paramPrivateNetworkRequestPolicy;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\ClientSecurityState.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */