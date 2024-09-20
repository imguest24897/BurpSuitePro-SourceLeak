package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.SignedExchangeError")
public class SignedExchangeError {
  @Zvd(Zp = "message")
  public final String message;
  
  @Zvd(Zp = "signatureIndex")
  @Zj
  public final Integer signatureIndex;
  
  @Zvd(Zp = "errorField")
  @Zj
  public final SignedExchangeErrorField errorField;
  
  @Zox
  public SignedExchangeError(@Zc5(Ze = "message") String paramString, @Zc5(Ze = "signatureIndex", ZS = "null") Integer paramInteger, @Zc5(Ze = "errorField", ZS = "null") SignedExchangeErrorField paramSignedExchangeErrorField) {
    this.message = paramString;
    this.signatureIndex = paramInteger;
    this.errorField = paramSignedExchangeErrorField;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\SignedExchangeError.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */