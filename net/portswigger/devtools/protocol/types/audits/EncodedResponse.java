package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.EncodedResponse")
public class EncodedResponse {
  @Zvd(Zp = "body")
  @Zj
  public final String body;
  
  @Zvd(Zp = "originalSize")
  public final Integer originalSize;
  
  @Zvd(Zp = "encodedSize")
  public final Integer encodedSize;
  
  @Zox
  public EncodedResponse(@Zc5(Ze = "body", ZS = "null") String paramString, @Zc5(Ze = "originalSize") Integer paramInteger1, @Zc5(Ze = "encodedSize") Integer paramInteger2) {
    this.body = paramString;
    this.originalSize = paramInteger1;
    this.encodedSize = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\EncodedResponse.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */