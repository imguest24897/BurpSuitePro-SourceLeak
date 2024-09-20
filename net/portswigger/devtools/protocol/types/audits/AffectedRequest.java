package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.AffectedRequest")
public class AffectedRequest {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "url")
  @Zj
  public final String url;
  
  @Zox
  public AffectedRequest(@Zc5(Ze = "requestId") String paramString1, @Zc5(Ze = "url", ZS = "null") String paramString2) {
    this.requestId = paramString1;
    this.url = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\AffectedRequest.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */