package net.portswigger.devtools.protocol.types.network;

import java.util.List;
import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.SignedExchangeHeader")
public class SignedExchangeHeader {
  @Zvd(Zp = "requestUrl")
  public final String requestUrl;
  
  @Zvd(Zp = "responseCode")
  public final Integer responseCode;
  
  @Zvd(Zp = "responseHeaders")
  public final Map<String, Zi7> responseHeaders;
  
  @Zvd(Zp = "signatures")
  public final List<SignedExchangeSignature> signatures;
  
  @Zvd(Zp = "headerIntegrity")
  public final String headerIntegrity;
  
  @Zox
  public SignedExchangeHeader(@Zc5(Ze = "requestUrl") String paramString1, @Zc5(Ze = "responseCode") Integer paramInteger, @Zc5(Ze = "responseHeaders") Map<String, Zi7> paramMap, @Zc5(Ze = "signatures") List<SignedExchangeSignature> paramList, @Zc5(Ze = "headerIntegrity") String paramString2) {
    this.requestUrl = paramString1;
    this.responseCode = paramInteger;
    this.responseHeaders = paramMap;
    this.signatures = paramList;
    this.headerIntegrity = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\SignedExchangeHeader.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */