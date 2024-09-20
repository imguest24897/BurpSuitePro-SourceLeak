package net.portswigger.devtools.protocol.events.network;

import java.util.List;
import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.network.BlockedSetCookieWithReason;
import net.portswigger.devtools.protocol.types.network.CookiePartitionKey;
import net.portswigger.devtools.protocol.types.network.ExemptedSetCookieWithReason;
import net.portswigger.devtools.protocol.types.network.IPAddressSpace;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.network.ResponseReceivedExtraInfo")
public class ResponseReceivedExtraInfo implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "blockedCookies")
  public final List<BlockedSetCookieWithReason> blockedCookies;
  
  @Zvd(Zp = "headers")
  public final Map<String, Zi7> headers;
  
  @Zvd(Zp = "resourceIPAddressSpace")
  public final IPAddressSpace resourceIPAddressSpace;
  
  @Zvd(Zp = "statusCode")
  public final Integer statusCode;
  
  @Zvd(Zp = "headersText")
  @Zj
  public final String headersText;
  
  @Zvd(Zp = "cookiePartitionKey")
  @Zy
  @Zj
  public final CookiePartitionKey cookiePartitionKey;
  
  @Zvd(Zp = "cookiePartitionKeyOpaque")
  @Zj
  public final Boolean cookiePartitionKeyOpaque;
  
  @Zvd(Zp = "exemptedCookies")
  @Zj
  public final List<ExemptedSetCookieWithReason> exemptedCookies;
  
  @Zox
  public ResponseReceivedExtraInfo(@Zc5(Ze = "requestId") String paramString1, @Zc5(Ze = "blockedCookies") List<BlockedSetCookieWithReason> paramList, @Zc5(Ze = "headers") Map<String, Zi7> paramMap, @Zc5(Ze = "resourceIPAddressSpace") IPAddressSpace paramIPAddressSpace, @Zc5(Ze = "statusCode") Integer paramInteger, @Zc5(Ze = "headersText", ZS = "null") String paramString2, @Zc5(Ze = "cookiePartitionKey", ZS = "null") CookiePartitionKey paramCookiePartitionKey, @Zc5(Ze = "cookiePartitionKeyOpaque", ZS = "null") Boolean paramBoolean, @Zc5(Ze = "exemptedCookies", ZS = "null") List<ExemptedSetCookieWithReason> paramList1) {
    this.requestId = paramString1;
    this.blockedCookies = paramList;
    this.headers = paramMap;
    this.resourceIPAddressSpace = paramIPAddressSpace;
    this.statusCode = paramInteger;
    this.headersText = paramString2;
    this.cookiePartitionKey = paramCookiePartitionKey;
    this.cookiePartitionKeyOpaque = paramBoolean;
    this.exemptedCookies = paramList1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\ResponseReceivedExtraInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */