package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.FailedRequestInfo")
public class FailedRequestInfo {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "failureMessage")
  public final String failureMessage;
  
  @Zvd(Zp = "requestId")
  @Zj
  public final String requestId;
  
  @Zox
  public FailedRequestInfo(@Zc5(Ze = "url") String paramString1, @Zc5(Ze = "failureMessage") String paramString2, @Zc5(Ze = "requestId", ZS = "null") String paramString3) {
    this.url = paramString1;
    this.failureMessage = paramString2;
    this.requestId = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\FailedRequestInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */