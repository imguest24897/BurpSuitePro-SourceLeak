package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.network.TrustTokenOperationType;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.network.TrustTokenOperationDone")
public class TrustTokenOperationDone implements Zl {
  @Zvd(Zp = "status")
  public final TrustTokenOperationDoneStatus status;
  
  @Zvd(Zp = "type")
  public final TrustTokenOperationType type;
  
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "topLevelOrigin")
  @Zj
  public final String topLevelOrigin;
  
  @Zvd(Zp = "issuerOrigin")
  @Zj
  public final String issuerOrigin;
  
  @Zvd(Zp = "issuedTokenCount")
  @Zj
  public final Integer issuedTokenCount;
  
  @Zox
  public TrustTokenOperationDone(@Zc5(Ze = "status") TrustTokenOperationDoneStatus paramTrustTokenOperationDoneStatus, @Zc5(Ze = "type") TrustTokenOperationType paramTrustTokenOperationType, @Zc5(Ze = "requestId") String paramString1, @Zc5(Ze = "topLevelOrigin", ZS = "null") String paramString2, @Zc5(Ze = "issuerOrigin", ZS = "null") String paramString3, @Zc5(Ze = "issuedTokenCount", ZS = "null") Integer paramInteger) {
    this.status = paramTrustTokenOperationDoneStatus;
    this.type = paramTrustTokenOperationType;
    this.requestId = paramString1;
    this.topLevelOrigin = paramString2;
    this.issuerOrigin = paramString3;
    this.issuedTokenCount = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\TrustTokenOperationDone.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */