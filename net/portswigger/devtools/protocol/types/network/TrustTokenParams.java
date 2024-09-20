package net.portswigger.devtools.protocol.types.network;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.TrustTokenParams")
public class TrustTokenParams {
  @Zvd(Zp = "operation")
  public final TrustTokenOperationType operation;
  
  @Zvd(Zp = "refreshPolicy")
  public final TrustTokenParamsRefreshPolicy refreshPolicy;
  
  @Zvd(Zp = "issuers")
  @Zj
  public final List<String> issuers;
  
  @Zox
  public TrustTokenParams(@Zc5(Ze = "operation") TrustTokenOperationType paramTrustTokenOperationType, @Zc5(Ze = "refreshPolicy") TrustTokenParamsRefreshPolicy paramTrustTokenParamsRefreshPolicy, @Zc5(Ze = "issuers", ZS = "null") List<String> paramList) {
    this.operation = paramTrustTokenOperationType;
    this.refreshPolicy = paramTrustTokenParamsRefreshPolicy;
    this.issuers = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\TrustTokenParams.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */