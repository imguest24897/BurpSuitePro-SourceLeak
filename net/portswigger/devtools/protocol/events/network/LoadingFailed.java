package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.network.BlockedReason;
import net.portswigger.devtools.protocol.types.network.CorsErrorStatus;
import net.portswigger.devtools.protocol.types.network.ResourceType;

@Zsi("net.portswigger.devtools.protocol.events.network.LoadingFailed")
public class LoadingFailed implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "type")
  public final ResourceType type;
  
  @Zvd(Zp = "errorText")
  public final String errorText;
  
  @Zvd(Zp = "canceled")
  @Zj
  public final Boolean canceled;
  
  @Zvd(Zp = "blockedReason")
  @Zj
  public final BlockedReason blockedReason;
  
  @Zvd(Zp = "corsErrorStatus")
  @Zj
  public final CorsErrorStatus corsErrorStatus;
  
  private static boolean ZH;
  
  @Zox
  public LoadingFailed(@Zc5(Ze = "requestId") String paramString1, @Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "type") ResourceType paramResourceType, @Zc5(Ze = "errorText") String paramString2, @Zc5(Ze = "canceled", ZS = "null") Boolean paramBoolean, @Zc5(Ze = "blockedReason", ZS = "null") BlockedReason paramBlockedReason, @Zc5(Ze = "corsErrorStatus", ZS = "null") CorsErrorStatus paramCorsErrorStatus) {
    this.requestId = paramString1;
    this.timestamp = paramDouble;
    this.type = paramResourceType;
    this.errorText = paramString2;
    this.canceled = paramBoolean;
    this.blockedReason = paramBlockedReason;
    this.corsErrorStatus = paramCorsErrorStatus;
  }
  
  public static void Zw(boolean paramBoolean) {
    ZH = paramBoolean;
  }
  
  public static boolean ZW() {
    return ZH;
  }
  
  public static boolean ZU() {
    boolean bool = ZW();
    return !bool;
  }
  
  static {
    if (!ZU())
      Zw(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\LoadingFailed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */