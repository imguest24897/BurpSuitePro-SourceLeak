package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.network.ResponseBodyForInterception")
public class ResponseBodyForInterception {
  @Zvd(Zp = "body")
  public final String body;
  
  @Zvd(Zp = "base64Encoded")
  public final Boolean base64Encoded;
  
  @Zox
  public ResponseBodyForInterception(@Zc5(Ze = "body") String paramString, @Zc5(Ze = "base64Encoded") Boolean paramBoolean) {
    this.body = paramString;
    this.base64Encoded = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\ResponseBodyForInterception.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */