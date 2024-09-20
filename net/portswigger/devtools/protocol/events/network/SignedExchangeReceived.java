package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.network.SignedExchangeInfo;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.network.SignedExchangeReceived")
public class SignedExchangeReceived implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "info")
  public final SignedExchangeInfo info;
  
  @Zox
  public SignedExchangeReceived(@Zc5(Ze = "requestId") String paramString, @Zc5(Ze = "info") SignedExchangeInfo paramSignedExchangeInfo) {
    this.requestId = paramString;
    this.info = paramSignedExchangeInfo;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\SignedExchangeReceived.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */