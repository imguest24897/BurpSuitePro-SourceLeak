package net.portswigger.devtools.protocol.types.network;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.SignedExchangeInfo")
public class SignedExchangeInfo {
  @Zvd(Zp = "outerResponse")
  public final Response outerResponse;
  
  @Zvd(Zp = "header")
  @Zj
  public final SignedExchangeHeader header;
  
  @Zvd(Zp = "securityDetails")
  @Zj
  public final SecurityDetails securityDetails;
  
  @Zvd(Zp = "errors")
  @Zj
  public final List<SignedExchangeError> errors;
  
  @Zox
  public SignedExchangeInfo(@Zc5(Ze = "outerResponse") Response paramResponse, @Zc5(Ze = "header", ZS = "null") SignedExchangeHeader paramSignedExchangeHeader, @Zc5(Ze = "securityDetails", ZS = "null") SecurityDetails paramSecurityDetails, @Zc5(Ze = "errors", ZS = "null") List<SignedExchangeError> paramList) {
    this.outerResponse = paramResponse;
    this.header = paramSignedExchangeHeader;
    this.securityDetails = paramSecurityDetails;
    this.errors = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\SignedExchangeInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */