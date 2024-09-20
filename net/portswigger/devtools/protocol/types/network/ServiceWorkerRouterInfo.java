package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.ServiceWorkerRouterInfo")
public class ServiceWorkerRouterInfo {
  @Zvd(Zp = "ruleIdMatched")
  @Zj
  public final Integer ruleIdMatched;
  
  @Zvd(Zp = "matchedSourceType")
  @Zj
  public final ServiceWorkerRouterSource matchedSourceType;
  
  @Zvd(Zp = "actualSourceType")
  @Zj
  public final ServiceWorkerRouterSource actualSourceType;
  
  @Zox
  public ServiceWorkerRouterInfo(@Zc5(Ze = "ruleIdMatched", ZS = "null") Integer paramInteger, @Zc5(Ze = "matchedSourceType", ZS = "null") ServiceWorkerRouterSource paramServiceWorkerRouterSource1, @Zc5(Ze = "actualSourceType", ZS = "null") ServiceWorkerRouterSource paramServiceWorkerRouterSource2) {
    this.ruleIdMatched = paramInteger;
    this.matchedSourceType = paramServiceWorkerRouterSource1;
    this.actualSourceType = paramServiceWorkerRouterSource2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\ServiceWorkerRouterInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */