package net.portswigger.devtools.protocol.events.network;

import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.network.ResponseReceivedEarlyHints")
public class ResponseReceivedEarlyHints implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "headers")
  public final Map<String, Zi7> headers;
  
  @Zox
  public ResponseReceivedEarlyHints(@Zc5(Ze = "requestId") String paramString, @Zc5(Ze = "headers") Map<String, Zi7> paramMap) {
    this.requestId = paramString;
    this.headers = paramMap;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\ResponseReceivedEarlyHints.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */